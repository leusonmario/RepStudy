import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1501");
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
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1502");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray6 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures0, testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures5 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet7 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests9.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests9.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) -1, postingsEnum14, postingsEnum15);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests9.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRuleIgnoreAfterMaxFailuresSet7, (java.lang.Object) "random");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1503");
        java.util.Set[][] setArray1 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray2 = (java.util.Set<java.lang.CharSequence>[][]) setArray1;
        java.util.Set[][] setArray4 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray5 = (java.util.Set<java.lang.CharSequence>[][]) setArray4;
        java.util.Set[][] setArray7 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray8 = (java.util.Set<java.lang.CharSequence>[][]) setArray7;
        java.util.Set[][] setArray10 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray11 = (java.util.Set<java.lang.CharSequence>[][]) setArray10;
        java.util.Set[][][] setArray13 = new java.util.Set[4][][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][][] charSequenceSetArray14 = (java.util.Set<java.lang.CharSequence>[][][]) setArray13;
        charSequenceSetArray14[0] = charSequenceSetArray2;
        charSequenceSetArray14[1] = charSequenceSetArray5;
        charSequenceSetArray14[2] = charSequenceSetArray8;
        charSequenceSetArray14[3] = charSequenceSetArray11;
        java.util.Set<java.util.Set<java.lang.CharSequence>[][]> charSequenceSetArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray14);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet30 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray29);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet36 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray35);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray29, (java.lang.Object[]) charSequenceArray35);
        org.junit.Assert.assertNotSame((java.lang.Object) charSequenceSetArray14, (java.lang.Object) charSequenceArray35);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet45 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray44);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet53 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray52);
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet59 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray58);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray52, (java.lang.Object[]) charSequenceArray58);
        java.lang.CharSequence[] charSequenceArray65 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet66 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray65);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray58, (java.lang.Object[]) charSequenceArray65);
        java.lang.CharSequence[] charSequenceArray73 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet74 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray73);
        java.lang.CharSequence[] charSequenceArray79 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet80 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray79);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray73, (java.lang.Object[]) charSequenceArray79);
        java.lang.CharSequence[] charSequenceArray86 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet87 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray86);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray79, (java.lang.Object[]) charSequenceArray86);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray58, (java.lang.Object[]) charSequenceArray86);
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) charSequenceArray44, (java.lang.Object[]) charSequenceArray86);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceSetArray14, (java.lang.Object[]) charSequenceArray86);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1504");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 1.0f, (double) '#');
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1505");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(100.0d, (double) 10.0f, (double) (byte) 100);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1506");
        int[] intArray1 = null;
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray6, intArray7);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray10, intArray11);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray6, intArray10);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray6, intArray15);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray22, intArray23);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray26, intArray27);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray22, intArray26);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray32, intArray33);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray36, intArray37);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray32, intArray36);
        org.junit.Assert.assertArrayEquals("random", intArray22, intArray32);
        org.junit.Assert.assertArrayEquals(intArray6, intArray22);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray44, intArray45);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray48, intArray49);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray44, intArray48);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray22, intArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray1, intArray48);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1507");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 100, (double) 10, (double) ' ');
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1508");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1509");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (double) (short) 100, (double) (byte) 100, (double) '4');
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1510");
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
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) testRule23, (java.lang.Object) (byte) 10);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray27 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet28 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray27);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests29.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests29.setUp();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) queryCachingPolicySet28, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        org.junit.Assert.assertNotSame((java.lang.Object) testRule23, (java.lang.Object) queryCachingPolicySet28);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        commonGramsTokenFilterFactoryTests35.assertTermsEquals("", indexReader37, terms38, terms39, false);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsEnumEquals("tests.weekly", postingsEnum43, postingsEnum44, false);
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsEnumEquals("tests.maxfailures", postingsEnum48, postingsEnum49, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder53 = commonGramsTokenFilterFactoryTests52.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) postingsEnum49, (java.lang.Object) commonGramsTokenFilterFactoryTests52);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling56 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray57 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling56 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet58 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray57);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling59 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray60 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling59 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet61 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray60);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests63 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests63.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests63);
        org.junit.rules.TestRule testRule66 = commonGramsTokenFilterFactoryTests63.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule66);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray60, (java.lang.Object) testRule66);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray57, (java.lang.Object[]) throttlingArray60);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests52, (java.lang.Object) throttlingArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) queryCachingPolicySet28, (java.lang.Object) commonGramsTokenFilterFactoryTests52);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1511");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, 0.0d, 10.0d);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1512");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) (short) -1);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1513");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, (-1.0d));
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1514");
        java.util.Set[][] setArray1 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray2 = (java.util.Set<java.lang.CharSequence>[][]) setArray1;
        java.util.Set[][] setArray4 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray5 = (java.util.Set<java.lang.CharSequence>[][]) setArray4;
        java.util.Set[][] setArray7 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray8 = (java.util.Set<java.lang.CharSequence>[][]) setArray7;
        java.util.Set[][] setArray10 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray11 = (java.util.Set<java.lang.CharSequence>[][]) setArray10;
        java.util.Set[][][] setArray13 = new java.util.Set[4][][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][][] charSequenceSetArray14 = (java.util.Set<java.lang.CharSequence>[][][]) setArray13;
        charSequenceSetArray14[0] = charSequenceSetArray2;
        charSequenceSetArray14[1] = charSequenceSetArray5;
        charSequenceSetArray14[2] = charSequenceSetArray8;
        charSequenceSetArray14[3] = charSequenceSetArray11;
        java.util.Set<java.util.Set<java.lang.CharSequence>[][]> charSequenceSetArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray14);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet30 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray29);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet36 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray35);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray29, (java.lang.Object[]) charSequenceArray35);
        org.junit.Assert.assertNotSame((java.lang.Object) charSequenceSetArray14, (java.lang.Object) charSequenceArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charSequenceArray35);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1515");
        java.lang.Object obj0 = new java.lang.Object();
        org.junit.Assert.assertNotEquals(obj0, (java.lang.Object) "");
        java.lang.Object obj3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, obj3);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1516");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray7);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray5);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray15);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals("", shortArray15, shortArray17);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray24);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray17, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray22);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals("", shortArray33, shortArray35);
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray33, shortArray39);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray42);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals("", shortArray48, shortArray50);
        org.junit.Assert.assertArrayEquals("hi!", shortArray42, shortArray48);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray58);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
        org.junit.Assert.assertArrayEquals("", shortArray58, shortArray60);
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray58, shortArray64);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray68);
        short[] shortArray70 = new short[] {};
        short[] shortArray71 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray70, shortArray71);
        org.junit.Assert.assertArrayEquals("", shortArray68, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray68);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray48, shortArray68);
        short[] shortArray76 = new short[] {};
        short[] shortArray77 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray76, shortArray77);
        short[] shortArray79 = new short[] {};
        short[] shortArray80 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray79, shortArray80);
        short[] shortArray82 = new short[] {};
        short[] shortArray83 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray82, shortArray83);
        org.junit.Assert.assertArrayEquals(shortArray80, shortArray82);
        org.junit.Assert.assertArrayEquals(shortArray77, shortArray80);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray77);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) shortArray77);
        short[] shortArray89 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray77, shortArray89);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1517");
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
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray14, (double) (short) 10);
        double[] doubleArray33 = new double[] { ' ', (-1) };
        double[] doubleArray36 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray36, (double) 100L);
        double[] doubleArray41 = new double[] { ' ', (-1) };
        double[] doubleArray44 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray44, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray36, doubleArray41, 100.0d);
        double[] doubleArray51 = new double[] { ' ', (-1) };
        double[] doubleArray54 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray54, (double) 100L);
        double[] doubleArray60 = new double[] { ' ', (-1) };
        double[] doubleArray63 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray63, (double) 100L);
        double[] doubleArray68 = new double[] { ' ', (-1) };
        double[] doubleArray71 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray68, doubleArray71, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray63, doubleArray68, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray68, (double) 1);
        double[] doubleArray80 = new double[] { ' ', (-1) };
        double[] doubleArray83 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray80, doubleArray83, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray83, (double) 100);
        org.junit.Assert.assertArrayEquals("hi!", doubleArray41, doubleArray51, (double) 2);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray51, (double) 1);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1518");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray5);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray11, byteArray12);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray12, byteArray16);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray21, byteArray22);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray22, byteArray25);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray16, byteArray22);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests30.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests30.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader33, (int) (byte) -1, postingsEnum35, postingsEnum36);
        commonGramsTokenFilterFactoryTests30.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        commonGramsTokenFilterFactoryTests30.assertTermsEquals("enwiki.random.lines.txt", indexReader41, terms42, terms43, false);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        commonGramsTokenFilterFactoryTests30.assertTermsEquals("tests.monster", indexReader47, terms48, terms49, true);
        commonGramsTokenFilterFactoryTests30.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder54 = commonGramsTokenFilterFactoryTests30.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) byteArray16, (java.lang.Object) commonGramsTokenFilterFactoryTests30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) strComparableSet7, (java.lang.Object) commonGramsTokenFilterFactoryTests30);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1519");
        double[] doubleArray5 = new double[] { ' ', (-1) };
        double[] doubleArray8 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray8, (double) 100L);
        double[] doubleArray13 = new double[] { ' ', (-1) };
        double[] doubleArray16 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray16, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray8, doubleArray13, 100.0d);
        double[] doubleArray23 = new double[] { ' ', (-1) };
        double[] doubleArray26 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray26, (double) 100L);
        double[] doubleArray32 = new double[] { ' ', (-1) };
        double[] doubleArray35 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray35, (double) 100L);
        double[] doubleArray40 = new double[] { ' ', (-1) };
        double[] doubleArray43 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray43, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray35, doubleArray40, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray40, (double) 1);
        double[] doubleArray52 = new double[] { ' ', (-1) };
        double[] doubleArray55 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray55, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray55, (double) 100);
        org.junit.Assert.assertArrayEquals("hi!", doubleArray13, doubleArray23, (double) 2);
        double[] doubleArray62 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray13, doubleArray62, (double) 3);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1520");
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
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1521");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 10L, (double) (-1));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1522");
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
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray19 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray20 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[][] baseTokenStreamTestCaseArray21 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[][] { baseTokenStreamTestCaseArray19, baseTokenStreamTestCaseArray20 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase[]> baseTokenStreamTestCaseArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) baseTokenStreamTestCaseArraySet22);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1523");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues5 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", (int) (byte) 0, numericDocValues5, numericDocValues6);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1524");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) (byte) 0, (double) 0.0f);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1525");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (-1.0d), (double) (short) 0);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1526");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet22 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray21);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet28 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray27);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray21, (java.lang.Object[]) charSequenceArray27);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet36 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray35);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet42 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray41);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray35, (java.lang.Object[]) charSequenceArray41);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray27, (java.lang.Object[]) charSequenceArray41);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray41);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        byte[][] byteArray50 = new byte[][] { byteArray46, byteArray47, byteArray48, byteArray49 };
        java.util.Set<byte[]> byteArraySet51 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray50);
        java.util.Set<byte[]> byteArraySet52 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray50);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) byteArray50);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1527");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str4 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.failfast", indexReader8, fields9, fields10, false);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("random", (int) (byte) 10, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1528");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (-1.0f), (double) ' ');
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1529");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.weekly", postingsEnum8, postingsEnum9, false);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.nightly", indexReader15, (int) (short) 100, postingsEnum17, postingsEnum18);
        commonGramsTokenFilterFactoryTests0.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1530");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray7 = new java.util.Locale[] { locale2, locale4, locale6 };
        java.util.Set<java.util.Locale> localeSet8 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray7);
        java.util.Set<java.lang.Cloneable> cloneableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray7);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet17 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray16);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray16, (java.lang.Object[]) charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet30 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray29);
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet38 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray37);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet44 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray43);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray37, (java.lang.Object[]) charSequenceArray43);
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet51 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray43, (java.lang.Object[]) charSequenceArray50);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) localeArray7, (java.lang.Object[]) charSequenceArray50);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1531");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) (short) 0);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1532");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (-1.0d), (double) 4);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1533");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) '#', (long) (short) 100);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1534");
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
        org.junit.Assert.assertArrayEquals("", floatArray1, floatArray25, (-1.0f));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1535");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", 1, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1536");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) (byte) 100);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1537");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) '4');
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1538");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) (short) 1);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1539");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        java.lang.String str5 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader7, terms8, terms9, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests13.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests13.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests17.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23);
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests17.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests17);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests13.setUp();
        commonGramsTokenFilterFactoryTests13.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsSkippingEquals("", indexReader31, 10, postingsEnum33, postingsEnum34, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) "", (java.lang.Object) postingsEnum33);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1540");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) 10, 100.0f, 0.0f);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1541");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        java.lang.String str9 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader13, (int) (byte) -1, postingsEnum15, postingsEnum16);
        commonGramsTokenFilterFactoryTests10.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests10.setUp();
        commonGramsTokenFilterFactoryTests10.setUp();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests10.assertDocValuesEquals("", (int) (short) 0, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1542");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 0.0f, (double) (-1.0f), 0.0d);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1543");
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
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader33, 0, postingsEnum35, postingsEnum36);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests38 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests38.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests38.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader41, (int) (byte) -1, postingsEnum43, postingsEnum44);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        commonGramsTokenFilterFactoryTests38.assertFieldsEquals("random", indexReader47, fields48, fields49, false);
        org.junit.rules.TestRule testRule52 = commonGramsTokenFilterFactoryTests38.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests54 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests54.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        commonGramsTokenFilterFactoryTests54.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader57, (int) (byte) -1, postingsEnum59, postingsEnum60);
        org.junit.rules.TestRule testRule62 = commonGramsTokenFilterFactoryTests54.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests54);
        commonGramsTokenFilterFactoryTests54.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests54.assertDocsEnumEquals("tests.monster", postingsEnum66, postingsEnum67, false);
        org.junit.Assert.assertNotEquals((java.lang.Object) testRule52, (java.lang.Object) postingsEnum66);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests71 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        org.apache.lucene.index.Terms terms75 = null;
        commonGramsTokenFilterFactoryTests71.assertTermsEquals("", indexReader73, terms74, terms75, false);
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        commonGramsTokenFilterFactoryTests71.assertDocsEnumEquals("tests.weekly", postingsEnum79, postingsEnum80, false);
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        commonGramsTokenFilterFactoryTests71.assertDocsEnumEquals("tests.maxfailures", postingsEnum84, postingsEnum85, true);
        commonGramsTokenFilterFactoryTests71.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests71.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) testRule52, (java.lang.Object) commonGramsTokenFilterFactoryTests71);
        org.elasticsearch.common.settings.Settings.Builder builder91 = commonGramsTokenFilterFactoryTests71.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder92 = commonGramsTokenFilterFactoryTests71.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) 0, (java.lang.Object) commonGramsTokenFilterFactoryTests71);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1544");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (byte) 100, (double) 100L);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1545");
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
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("random", indexReader27, (int) (byte) 0, postingsEnum29, postingsEnum30);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests33.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests33.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests37.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests37.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader40, (int) (byte) -1, postingsEnum42, postingsEnum43);
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests37.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests37);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests33, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests33.setUp();
        commonGramsTokenFilterFactoryTests33.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsSkippingEquals("", indexReader51, 10, postingsEnum53, postingsEnum54, false);
        commonGramsTokenFilterFactoryTests33.setUp();
        commonGramsTokenFilterFactoryTests33.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests33);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1546");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1547");
        java.lang.Object obj2 = new java.lang.Object();
        org.junit.Assert.assertNotEquals(obj2, (java.lang.Object) "");
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
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests5.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("random", obj2, (java.lang.Object) builder25);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, 0, postingsEnum31, postingsEnum32);
        commonGramsTokenFilterFactoryTests27.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("tests.weekly", indexReader36, (int) '#', postingsEnum38, postingsEnum39);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        commonGramsTokenFilterFactoryTests27.assertFieldsEquals("enwiki.random.lines.txt", indexReader42, fields43, fields44, true);
        commonGramsTokenFilterFactoryTests27.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests27.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule49 = commonGramsTokenFilterFactoryTests27.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests27);
        org.elasticsearch.common.settings.Settings.Builder builder51 = commonGramsTokenFilterFactoryTests27.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        commonGramsTokenFilterFactoryTests27.assertTermsEquals("hi!", indexReader53, terms54, terms55, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests58 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests58.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests58.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader61, (int) (byte) -1, postingsEnum63, postingsEnum64);
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        commonGramsTokenFilterFactoryTests58.assertFieldsEquals("random", indexReader67, fields68, fields69, false);
        org.junit.rules.TestRule testRule72 = commonGramsTokenFilterFactoryTests58.ruleChain;
        commonGramsTokenFilterFactoryTests58.tearDown();
        java.lang.String str74 = commonGramsTokenFilterFactoryTests58.getTestName();
        commonGramsTokenFilterFactoryTests58.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        commonGramsTokenFilterFactoryTests58.assertPositionsSkippingEquals("hi!", indexReader77, (int) (short) 100, postingsEnum79, postingsEnum80);
        java.lang.String str82 = commonGramsTokenFilterFactoryTests58.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) true, (java.lang.Object) str82);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1548");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) ' ', (double) 2);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1549");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum5, postingsEnum6);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1550");
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
        double[] doubleArray42 = new double[] { ' ', (-1) };
        double[] doubleArray45 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray45, (double) 100L);
        double[] doubleArray51 = new double[] { ' ', (-1) };
        double[] doubleArray54 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray54, (double) 100L);
        double[] doubleArray59 = new double[] { ' ', (-1) };
        double[] doubleArray62 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray62, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray54, doubleArray59, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray54, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray54, (double) '#');
        double[] doubleArray71 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", doubleArray3, doubleArray71, (double) 10);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1551");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (short) 100, (java.lang.Object) str3);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1552");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling5 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling8 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray9);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests12.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests12);
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests12.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule15);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray9, (java.lang.Object) testRule15);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray6, (java.lang.Object[]) throttlingArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray2, (java.lang.Object[]) throttlingArray9);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray23);
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
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray36);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests48 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests48.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests48.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader51, (int) (byte) -1, postingsEnum53, postingsEnum54);
        commonGramsTokenFilterFactoryTests48.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        commonGramsTokenFilterFactoryTests48.assertTermsEquals("enwiki.random.lines.txt", indexReader59, terms60, terms61, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests64 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        commonGramsTokenFilterFactoryTests64.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader66, 0, postingsEnum68, postingsEnum69);
        commonGramsTokenFilterFactoryTests64.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        commonGramsTokenFilterFactoryTests64.assertPositionsSkippingEquals("tests.weekly", indexReader73, (int) '#', postingsEnum75, postingsEnum76);
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        commonGramsTokenFilterFactoryTests64.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader79, 0, postingsEnum81, postingsEnum82);
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        commonGramsTokenFilterFactoryTests64.assertDocsSkippingEquals("", indexReader85, (int) (short) -1, postingsEnum87, postingsEnum88, true);
        commonGramsTokenFilterFactoryTests64.setUp();
        commonGramsTokenFilterFactoryTests64.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder93 = commonGramsTokenFilterFactoryTests64.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests64.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests48, (java.lang.Object) commonGramsTokenFilterFactoryTests64);
        org.junit.Assert.assertNotEquals((java.lang.Object) shortArray36, (java.lang.Object) commonGramsTokenFilterFactoryTests48);
        org.junit.Assert.assertNotEquals((java.lang.Object) throttlingArray9, (java.lang.Object) shortArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) shortArray36);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1553");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (double) (short) 1, (double) '4', (double) 'a');
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1554");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 0.0d, 10.0d);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1555");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) 'a');
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1556");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1557");
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray0 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray1 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[][] baseTokenStreamTestCaseArray2 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[][] { baseTokenStreamTestCaseArray0, baseTokenStreamTestCaseArray1 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase[]> baseTokenStreamTestCaseArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray2);
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
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray16, (java.lang.Object[]) charSequenceArray44);
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet54 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray53);
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet60 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray59);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray53, (java.lang.Object[]) charSequenceArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray44, (java.lang.Object[]) charSequenceArray59);
        java.lang.CharSequence[] charSequenceArray68 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet69 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray68);
        java.lang.CharSequence[] charSequenceArray74 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet75 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray74);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray68, (java.lang.Object[]) charSequenceArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray44, (java.lang.Object[]) charSequenceArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseArray2, (java.lang.Object[]) charSequenceArray74);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1558");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 10, (double) (byte) 1);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1559");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet12 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray11);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray11);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet27 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray26);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray26);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet35 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray34);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet41 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray40);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray34, (java.lang.Object[]) charSequenceArray40);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray26, (java.lang.Object[]) charSequenceArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray40);
        java.lang.Object[] objArray45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray40, objArray45);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1560");
        long[] longArray1 = null;
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray6, longArray7);
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray6, longArray9);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray13, longArray14);
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray13, longArray16);
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray19, longArray20);
        org.junit.Assert.assertArrayEquals(longArray16, longArray19);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray6, longArray16);
        long[] longArray26 = new long[] {};
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray26, longArray27);
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray26, longArray29);
        org.junit.Assert.assertArrayEquals("", longArray16, longArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray1, longArray16);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1561");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule20);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1562");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", (double) (-1.0f), (-1.0d), (double) (short) 0);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1563");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1564");
        byte[] byteArray1 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray3, byteArray4);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray9, byteArray10);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray13, byteArray14);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray10, byteArray14);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray19, byteArray20);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray20, byteArray23);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray14, byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray1, byteArray4);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1565");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) 10, (double) (-1.0f), (double) (byte) 1);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1566");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, 0.0d);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1567");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests42.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests42.setUp();
        java.lang.String str45 = commonGramsTokenFilterFactoryTests42.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests42);
        commonGramsTokenFilterFactoryTests42.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) testRuleSet39, (java.lang.Object) commonGramsTokenFilterFactoryTests42);
        java.lang.Object obj49 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests42, obj49);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1568");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", 0L, (long) (byte) 0);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1569");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (double) 1.0f, (double) 1, (double) 0L);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1570");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (byte) 0, 0.0d);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1571");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader7, terms8, terms9, true);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray17);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests26.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests26.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests26.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests26.setUp();
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests26.ruleChain;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        commonGramsTokenFilterFactoryTests26.assertFieldsEquals("tests.badapples", indexReader33, fields34, fields35, true);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        org.junit.Assert.assertArrayEquals("", shortArray40, shortArray42);
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader33, (java.lang.Object) shortArray42);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals("", shortArray50, shortArray52);
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray50, shortArray56);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray60);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray63);
        org.junit.Assert.assertArrayEquals("", shortArray60, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray60);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray42, shortArray56);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) shortArray56);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray14, shortArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) shortArray14);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1572");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray1, byteArray2);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray7, byteArray8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray8, byteArray12);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray17, byteArray18);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray21, byteArray22);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray18, byteArray21);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray12, byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray18);
        byte[] byteArray27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray27);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1573");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray4, intArray8);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray13, intArray14);
        org.junit.Assert.assertArrayEquals("hi!", intArray8, intArray13);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray20, intArray21);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray24, intArray25);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray20, intArray24);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("hi!", intArray24, intArray29);
        org.junit.Assert.assertArrayEquals(intArray8, intArray29);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray37, intArray38);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray41, intArray42);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray37, intArray41);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray47, intArray48);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray51, intArray52);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray47, intArray51);
        org.junit.Assert.assertArrayEquals("random", intArray37, intArray47);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray58, intArray59);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray62, intArray63);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray58, intArray62);
        org.junit.Assert.assertArrayEquals(intArray47, intArray58);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray8, intArray58);
        int[] intArray70 = new int[] {};
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray70, intArray71);
        int[] intArray74 = new int[] {};
        int[] intArray75 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray74, intArray75);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray70, intArray74);
        org.junit.Assert.assertArrayEquals(intArray58, intArray70);
        int[] intArray79 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray70, intArray79);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1574");
        java.util.Collection[] collectionArray2 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray3 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray2;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.CharSequence>[]) collectionArray2);
        char[] charArray8 = new char[] { '4', '4', ' ' };
        char[] charArray12 = new char[] { '4', '4', ' ' };
        char[] charArray16 = new char[] { '4', '4', ' ' };
        char[][] charArray17 = new char[][] { charArray8, charArray12, charArray16 };
        java.util.Set<char[]> charArraySet18 = org.apache.lucene.util.LuceneTestCase.asSet(charArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) collectionArray2, (java.lang.Object[]) charArray17);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1575");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str9 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.tearDown();
        double[] doubleArray15 = new double[] { ' ', (-1) };
        double[] doubleArray18 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray18, (double) 100L);
        double[] doubleArray24 = new double[] { ' ', (-1) };
        double[] doubleArray27 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray27, (double) 100L);
        double[] doubleArray32 = new double[] { ' ', (-1) };
        double[] doubleArray35 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray35, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray27, doubleArray32, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray32, (double) 1);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "<unknown>", (java.lang.Object) doubleArray32);
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
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray62, (double) (short) 10);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) doubleArray62);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues78 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues79 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.weekly", 100, numericDocValues78, numericDocValues79);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1576");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
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
        java.lang.String str18 = commonGramsTokenFilterFactoryTests3.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray22 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet23 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray22);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests24.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests24.setUp();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) queryCachingPolicySet23, (java.lang.Object) commonGramsTokenFilterFactoryTests24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests24);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1577");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (short) 10, 0.0d);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1578");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray3, intArray7);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray13, intArray14);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray13, intArray17);
        org.junit.Assert.assertArrayEquals("random", intArray3, intArray13);
        int[] intArray22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray22);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1579");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 100, (float) (byte) 1, (float) (short) 10);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1580");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (float) 10, 1.0f, 0.0f);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1581");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader10, 0, postingsEnum12, postingsEnum13);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests15.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests15.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests15.tearDown();
        commonGramsTokenFilterFactoryTests15.setIndexWriterMaxDocs((int) (byte) 1);
        commonGramsTokenFilterFactoryTests15.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.common.settings.Settings.Builder builder23 = commonGramsTokenFilterFactoryTests15.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsSkippingEquals("<unknown>", indexReader26, (int) '#', postingsEnum28, postingsEnum29, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 0, (java.lang.Object) '#');
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1582");
        java.lang.Object obj2 = new java.lang.Object();
        org.junit.Assert.assertNotEquals(obj2, (java.lang.Object) "");
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
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests5.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("random", obj2, (java.lang.Object) builder25);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, 0, postingsEnum31, postingsEnum32);
        commonGramsTokenFilterFactoryTests27.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("tests.weekly", indexReader36, (int) '#', postingsEnum38, postingsEnum39);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        commonGramsTokenFilterFactoryTests27.assertFieldsEquals("enwiki.random.lines.txt", indexReader42, fields43, fields44, true);
        commonGramsTokenFilterFactoryTests27.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests27.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule49 = commonGramsTokenFilterFactoryTests27.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests27);
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests27.assertDocsEnumEquals("", postingsEnum52, postingsEnum53, true);
        java.lang.String str56 = commonGramsTokenFilterFactoryTests27.getTestName();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        commonGramsTokenFilterFactoryTests27.assertFieldsEquals("", indexReader58, fields59, fields60, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("random", (java.lang.Object) fields59);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1583");
        short[] shortArray5 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[] shortArray10 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[] shortArray15 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[][] shortArray16 = new short[][] { shortArray5, shortArray10, shortArray15 };
        java.util.Set<short[]> shortArraySet17 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests18.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, (int) (byte) -1, postingsEnum23, postingsEnum24);
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule26;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule26;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule26;
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet37 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray36);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray42);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray36, (java.lang.Object[]) charSequenceArray42);
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet51 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray50);
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet57 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray56);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray50, (java.lang.Object[]) charSequenceArray56);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray42, (java.lang.Object[]) charSequenceArray56);
        org.junit.Assert.assertNotEquals((java.lang.Object) testRule26, (java.lang.Object) charSequenceArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) shortArray16, (java.lang.Object[]) charSequenceArray42);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1584");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 'a', (double) 10L);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1585");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) (short) 100, (float) '4');
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1586");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 0, (float) 10L, (float) 4);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1587");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) 100, (double) 2);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1588");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 100L, (double) 1, (-1.0d));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1589");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) (byte) 10);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1590");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.tearDown();
        java.lang.String str17 = commonGramsTokenFilterFactoryTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1591");
        java.util.Locale[] localeArray0 = new java.util.Locale[] {};
        java.util.Locale[][] localeArray1 = new java.util.Locale[][] { localeArray0 };
        java.util.Set<java.util.Locale[]> localeArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader7, (int) (byte) -1, postingsEnum9, postingsEnum10);
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("tests.awaitsfix", indexReader16, 1, postingsEnum18, postingsEnum19);
        commonGramsTokenFilterFactoryTests4.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests22.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader24, 0, postingsEnum26, postingsEnum27);
        commonGramsTokenFilterFactoryTests22.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests22.assertPositionsSkippingEquals("tests.weekly", indexReader31, (int) '#', postingsEnum33, postingsEnum34);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        commonGramsTokenFilterFactoryTests22.assertFieldsEquals("enwiki.random.lines.txt", indexReader37, fields38, fields39, true);
        commonGramsTokenFilterFactoryTests22.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests22.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests22.ruleChain;
        commonGramsTokenFilterFactoryTests22.tearDown();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests22.assertDocsSkippingEquals("tests.weekly", indexReader47, (int) 'a', postingsEnum49, postingsEnum50, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests53 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests53.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        commonGramsTokenFilterFactoryTests53.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader56, (int) (byte) -1, postingsEnum58, postingsEnum59);
        commonGramsTokenFilterFactoryTests53.tearDown();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        commonGramsTokenFilterFactoryTests53.assertTermsEquals("hi!", indexReader63, terms64, terms65, true);
        org.elasticsearch.test.ESTokenStreamTestCase[] eSTokenStreamTestCaseArray68 = new org.elasticsearch.test.ESTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests4, commonGramsTokenFilterFactoryTests22, commonGramsTokenFilterFactoryTests53 };
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase> eSTokenStreamTestCaseSet69 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray1, (java.lang.Object[]) eSTokenStreamTestCaseArray68);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1592");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests22.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests22.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader25, (int) (byte) -1, postingsEnum27, postingsEnum28);
        commonGramsTokenFilterFactoryTests22.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        commonGramsTokenFilterFactoryTests22.assertTermsEquals("enwiki.random.lines.txt", indexReader33, terms34, terms35, false);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        commonGramsTokenFilterFactoryTests22.assertTermsEquals("tests.monster", indexReader39, terms40, terms41, true);
        commonGramsTokenFilterFactoryTests22.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder46 = commonGramsTokenFilterFactoryTests22.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) byteArray8, (java.lang.Object) commonGramsTokenFilterFactoryTests22);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests48 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests48.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader50, 0, postingsEnum52, postingsEnum53);
        commonGramsTokenFilterFactoryTests48.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        commonGramsTokenFilterFactoryTests48.assertPositionsSkippingEquals("tests.weekly", indexReader57, (int) '#', postingsEnum59, postingsEnum60);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        commonGramsTokenFilterFactoryTests48.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader63, 0, postingsEnum65, postingsEnum66);
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        commonGramsTokenFilterFactoryTests48.assertDocsSkippingEquals("", indexReader69, (int) (short) -1, postingsEnum71, postingsEnum72, true);
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.Terms terms77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        commonGramsTokenFilterFactoryTests48.assertTermsEquals("tests.failfast", indexReader76, terms77, terms78, true);
        org.apache.lucene.index.IndexReader indexReader82 = null;
        org.apache.lucene.index.Fields fields83 = null;
        org.apache.lucene.index.Fields fields84 = null;
        commonGramsTokenFilterFactoryTests48.assertFieldsEquals("<unknown>", indexReader82, fields83, fields84, false);
        commonGramsTokenFilterFactoryTests48.setUp();
        org.junit.rules.TestRule testRule88 = commonGramsTokenFilterFactoryTests48.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) byteArray8, (java.lang.Object) testRule88);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1593");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.awaitsfix", indexReader14, 1, postingsEnum16, postingsEnum17);
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.Object obj20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests2, obj20);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1594");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) 2);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1595");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 100L, (double) 1, (double) (short) 1);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1596");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.String str5 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.failfast", indexReader9, fields10, fields11, false);
        double[] doubleArray18 = new double[] { ' ', (-1) };
        double[] doubleArray21 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray21, (double) 100L);
        double[] doubleArray26 = new double[] { ' ', (-1) };
        double[] doubleArray29 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray29, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray21, doubleArray26, 100.0d);
        double[] doubleArray36 = new double[] { ' ', (-1) };
        double[] doubleArray39 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray39, (double) 100L);
        double[] doubleArray45 = new double[] { ' ', (-1) };
        double[] doubleArray48 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray48, (double) 100L);
        double[] doubleArray53 = new double[] { ' ', (-1) };
        double[] doubleArray56 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray56, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray48, doubleArray53, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray53, (double) 1);
        double[] doubleArray65 = new double[] { ' ', (-1) };
        double[] doubleArray68 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray68, (double) 100L);
        double[] doubleArray74 = new double[] { ' ', (-1) };
        double[] doubleArray77 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray74, doubleArray77, (double) 100L);
        double[] doubleArray82 = new double[] { ' ', (-1) };
        double[] doubleArray85 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray82, doubleArray85, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray77, doubleArray82, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray82, (double) 1);
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray82, (double) (-1));
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray26, doubleArray82, (double) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) fields10, (java.lang.Object) doubleArray26);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1597");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray1 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet2 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests3.setUp();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) queryCachingPolicySet2, (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests3.assertTermsEquals("tests.awaitsfix", indexReader8, terms9, terms10, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder14 = commonGramsTokenFilterFactoryTests13.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests13.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests13.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests13.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        commonGramsTokenFilterFactoryTests13.assertTermsEquals("", indexReader21, terms22, terms23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsSkippingEquals("random", indexReader27, 1, postingsEnum29, postingsEnum30, false);
        java.lang.String str33 = commonGramsTokenFilterFactoryTests13.getTestName();
        commonGramsTokenFilterFactoryTests13.setIndexWriterMaxDocs((int) '4');
        commonGramsTokenFilterFactoryTests13.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests13.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexReader8, (java.lang.Object) testRule38);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1598");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10, (double) 10.0f, 1.0d);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1599");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray3);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray7, longArray8);
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray7, longArray10);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray13, longArray14);
        org.junit.Assert.assertArrayEquals(longArray10, longArray13);
        org.junit.Assert.assertArrayEquals(longArray2, longArray10);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray21, longArray22);
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray21, longArray24);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray28, longArray29);
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray28, longArray31);
        long[] longArray34 = new long[] {};
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray34, longArray35);
        org.junit.Assert.assertArrayEquals(longArray31, longArray34);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray21, longArray31);
        org.junit.Assert.assertArrayEquals(longArray10, longArray21);
        java.lang.Class<?> wildcardClass40 = longArray21.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) wildcardClass40);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1600");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 0L, (double) 2);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1601");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader9, (int) '4', postingsEnum11, postingsEnum12, true);
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.weekly", (int) '#', numericDocValues17, numericDocValues18);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1602");
        java.lang.Object obj1 = null;
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
        org.junit.Assert.assertArrayEquals(charArray10, charArray13);
        org.junit.Assert.assertArrayEquals("", charArray6, charArray10);
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals(charArray24, charArray27);
        org.junit.Assert.assertArrayEquals("", charArray20, charArray24);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        org.junit.Assert.assertArrayEquals(charArray36, charArray39);
        org.junit.Assert.assertArrayEquals("", charArray32, charArray36);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray24, charArray32);
        org.junit.Assert.assertArrayEquals(charArray3, charArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", obj1, (java.lang.Object) charArray3);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1603");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray4, byteArray8);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests13.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader15, 0, postingsEnum17, postingsEnum18);
        commonGramsTokenFilterFactoryTests13.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests13.assertPositionsSkippingEquals("tests.weekly", indexReader22, (int) '#', postingsEnum24, postingsEnum25);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        commonGramsTokenFilterFactoryTests13.assertFieldsEquals("enwiki.random.lines.txt", indexReader28, fields29, fields30, true);
        commonGramsTokenFilterFactoryTests13.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests13.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) "<unknown>");
        commonGramsTokenFilterFactoryTests13.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests38 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests38.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader40, 0, postingsEnum42, postingsEnum43);
        commonGramsTokenFilterFactoryTests38.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests38.assertPositionsSkippingEquals("tests.weekly", indexReader47, (int) '#', postingsEnum49, postingsEnum50);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests38.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader53, 0, postingsEnum55, postingsEnum56);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        commonGramsTokenFilterFactoryTests38.assertDocsSkippingEquals("", indexReader59, (int) (short) -1, postingsEnum61, postingsEnum62, true);
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        commonGramsTokenFilterFactoryTests38.assertTermsEquals("tests.failfast", indexReader66, terms67, terms68, true);
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        commonGramsTokenFilterFactoryTests38.assertFieldsEquals("<unknown>", indexReader72, fields73, fields74, false);
        commonGramsTokenFilterFactoryTests38.setUp();
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) commonGramsTokenFilterFactoryTests38);
        org.junit.Assert.assertNotSame((java.lang.Object) byteArray4, (java.lang.Object) commonGramsTokenFilterFactoryTests13);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests80 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder81 = commonGramsTokenFilterFactoryTests80.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests80.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests80, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests80.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum89 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum90 = null;
        commonGramsTokenFilterFactoryTests80.assertDocsSkippingEquals("<unknown>", indexReader87, 0, postingsEnum89, postingsEnum90, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) byteArray4, (java.lang.Object) indexReader87);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1604");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) (short) 100);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1605");
        double[] doubleArray2 = new double[] { 0.0d };
        double[] doubleArray4 = new double[] { 0.0d };
        double[] doubleArray6 = new double[] { 0.0d };
        double[][] doubleArray7 = new double[][] { doubleArray2, doubleArray4, doubleArray6 };
        double[] doubleArray9 = new double[] { 0.0d };
        double[] doubleArray11 = new double[] { 0.0d };
        double[] doubleArray13 = new double[] { 0.0d };
        double[][] doubleArray14 = new double[][] { doubleArray9, doubleArray11, doubleArray13 };
        double[] doubleArray16 = new double[] { 0.0d };
        double[] doubleArray18 = new double[] { 0.0d };
        double[] doubleArray20 = new double[] { 0.0d };
        double[][] doubleArray21 = new double[][] { doubleArray16, doubleArray18, doubleArray20 };
        double[][][] doubleArray22 = new double[][][] { doubleArray7, doubleArray14, doubleArray21 };
        java.util.Set<double[][]> doubleArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray22);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests24.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests24.assertDocsSkippingEquals("tests.awaitsfix", indexReader27, 0, postingsEnum29, postingsEnum30, true);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests24.assertPositionsSkippingEquals("tests.maxfailures", indexReader34, 1, postingsEnum36, postingsEnum37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) doubleArray22, (java.lang.Object) commonGramsTokenFilterFactoryTests24);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1606");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0L, (double) 4, 10.0d);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1607");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray18);
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet26 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray25);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray18);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy30 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass31 = queryCachingPolicy30.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy32 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass33 = queryCachingPolicy32.getClass();
        java.lang.Class[] classArray35 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        wildcardClassArray36[0] = wildcardClass31;
        wildcardClassArray36[1] = wildcardClass33;
        java.util.Set<java.lang.Class<?>> wildcardClassSet41 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray36);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) wildcardClassArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) wildcardClassArray36);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1608");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0.0d, (double) 10, (double) (-1.0f));
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1609");
        short[] shortArray4 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[] shortArray9 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[] shortArray14 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[][] shortArray15 = new short[][] { shortArray4, shortArray9, shortArray14 };
        java.util.Set<short[]> shortArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests17.setUp();
        java.lang.String str20 = commonGramsTokenFilterFactoryTests17.getTestName();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests17.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArraySet16, (java.lang.Object) testRule21);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1610");
        java.lang.Object obj1 = null;
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
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy14 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass15 = queryCachingPolicy14.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy16 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass17 = queryCachingPolicy16.getClass();
        java.lang.Class[] classArray19 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass15;
        wildcardClassArray20[1] = wildcardClass17;
        java.util.Set<java.lang.Class<?>> wildcardClassSet25 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray8, (java.lang.Object[]) wildcardClassArray20);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray20);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy28 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass29 = queryCachingPolicy28.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy30 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass31 = queryCachingPolicy30.getClass();
        java.lang.Class[] classArray33 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass29;
        wildcardClassArray34[1] = wildcardClass31;
        java.util.Set<java.lang.Class<?>> wildcardClassSet39 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray34);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy40 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass41 = queryCachingPolicy40.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy42 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass43 = queryCachingPolicy42.getClass();
        java.lang.Class[] classArray45 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray46 = (java.lang.Class<?>[]) classArray45;
        wildcardClassArray46[0] = wildcardClass41;
        wildcardClassArray46[1] = wildcardClass43;
        java.util.Set<java.lang.Class<?>> wildcardClassSet51 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray34, (java.lang.Object[]) wildcardClassArray46);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet53 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) wildcardClassArray20, (java.lang.Object[]) wildcardClassArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", obj1, (java.lang.Object) wildcardClassArray20);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1611");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) builder20);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1612");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet10 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray9);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray9, (java.lang.Object[]) charSequenceArray15);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) charSequenceArray9);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests21.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader23, 0, postingsEnum25, postingsEnum26);
        commonGramsTokenFilterFactoryTests21.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests21.assertPositionsSkippingEquals("tests.weekly", indexReader30, (int) '#', postingsEnum32, postingsEnum33);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests21.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader36, 0, postingsEnum38, postingsEnum39);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests21.assertDocsSkippingEquals("", indexReader42, (int) (short) -1, postingsEnum44, postingsEnum45, true);
        commonGramsTokenFilterFactoryTests21.setUp();
        commonGramsTokenFilterFactoryTests21.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder50 = commonGramsTokenFilterFactoryTests21.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests21.tearDown();
        org.junit.rules.TestRule testRule52 = commonGramsTokenFilterFactoryTests21.ruleChain;
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests21.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests21);
        commonGramsTokenFilterFactoryTests21.setIndexWriterMaxDocs(100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests21);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1613");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray6);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray4);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals("", shortArray14, shortArray16);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray23);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray16, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray21);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray32);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals("", shortArray32, shortArray34);
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray32, shortArray38);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray41);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray47);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        org.junit.Assert.assertArrayEquals("", shortArray47, shortArray49);
        org.junit.Assert.assertArrayEquals("hi!", shortArray41, shortArray47);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray57);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray60);
        org.junit.Assert.assertArrayEquals("", shortArray57, shortArray59);
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray57, shortArray63);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray67);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray70);
        org.junit.Assert.assertArrayEquals("", shortArray67, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray67);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray47, shortArray67);
        short[] shortArray75 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray47, shortArray75);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1614");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("", obj1);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1615");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
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
        java.lang.String str18 = commonGramsTokenFilterFactoryTests3.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1616");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) '4', 100.0d);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1617");
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
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader24, fields25, fields26, true);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader30, 100, postingsEnum32, postingsEnum33);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests36.restoreIndexWriterMaxDocs();
        java.lang.String str38 = commonGramsTokenFilterFactoryTests36.getTestName();
        commonGramsTokenFilterFactoryTests36.setUp();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests36);
        org.apache.lucene.index.NumericDocValues numericDocValues43 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.awaitsfix", 1, numericDocValues43, numericDocValues44);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1618");
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
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.weekly", indexReader20, fields21, fields22, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1619");
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
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1620");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (byte) 0);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1621");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.failfast", indexReader9, 10, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.slow", indexReader15, (int) ' ', postingsEnum17, postingsEnum18);
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.Object obj21 = null;
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray25);
        org.junit.Assert.assertNotSame(obj21, (java.lang.Object) shortArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) shortArray23);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1622");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("", (int) (short) 0, numericDocValues7, numericDocValues8);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1623");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 0.0f, (float) 10L, (float) (-1));
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1624");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader13, (int) (byte) -1, postingsEnum15, postingsEnum16);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests10.ruleChain;
        commonGramsTokenFilterFactoryTests10.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) builder21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("hi!", indexReader24, fields25, fields26, false);
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("", 0, numericDocValues31, numericDocValues32);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1625");
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
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) testRule17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule17);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1626");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests47 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests47.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests47.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) byteArray16, (java.lang.Object) commonGramsTokenFilterFactoryTests47);
        org.apache.lucene.index.NumericDocValues numericDocValues53 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues54 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests47.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) 0, numericDocValues53, numericDocValues54);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1627");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", (double) (byte) 0, (double) (-1), (double) 100.0f);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1628");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', 0L);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1629");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0L, (long) 0);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1630");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) 1, (double) (byte) -1);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1631");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) (short) 0);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1632");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) 10);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1633");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum10, postingsEnum11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("<unknown>", indexReader15, terms16, terms17, true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) builder20);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1634");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (-1), (double) 100.0f, (double) 0.0f);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1635");
        java.lang.Object[] objArray0 = null;
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotNull((java.lang.Object) locale2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests5.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) (byte) -1, postingsEnum10, postingsEnum11);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests5.ruleChain;
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests5, (java.lang.Object) charSequenceArray18);
        org.junit.Assert.assertNotEquals((java.lang.Object) locale2, (java.lang.Object) charSequenceArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) charSequenceArray18);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1636");
        double[] doubleArray2 = new double[] { ' ', (-1) };
        double[] doubleArray5 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray5, (double) 100L);
        double[] doubleArray12 = new double[] { ' ', (-1) };
        double[] doubleArray15 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100L);
        double[] doubleArray20 = new double[] { ' ', (-1) };
        double[] doubleArray23 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray23, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray15, doubleArray20, 100.0d);
        double[] doubleArray30 = new double[] { ' ', (-1) };
        double[] doubleArray33 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray33, (double) 100L);
        double[] doubleArray39 = new double[] { ' ', (-1) };
        double[] doubleArray42 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray42, (double) 100L);
        double[] doubleArray47 = new double[] { ' ', (-1) };
        double[] doubleArray50 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray50, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray42, doubleArray47, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray47, (double) 1);
        double[] doubleArray59 = new double[] { ' ', (-1) };
        double[] doubleArray62 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray62, (double) 100L);
        double[] doubleArray68 = new double[] { ' ', (-1) };
        double[] doubleArray71 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray68, doubleArray71, (double) 100L);
        double[] doubleArray76 = new double[] { ' ', (-1) };
        double[] doubleArray79 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray76, doubleArray79, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray71, doubleArray76, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray76, (double) 1);
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray76, (double) (-1));
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray20, doubleArray76, (double) (-1));
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray20, (double) 0);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1637");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, 10L);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1638");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) 100, (float) 4, 10.0f);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1639");
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
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("enwiki.random.lines.txt", (-1), numericDocValues28, numericDocValues29);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1640");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        java.lang.String str4 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader6, terms7, terms8, true);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1641");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (-1L), (long) '4');
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1642");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 10.0f, 100.0d, (double) 10);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1643");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests34 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests34.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests34.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader37, (int) (byte) -1, postingsEnum39, postingsEnum40);
        commonGramsTokenFilterFactoryTests34.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        commonGramsTokenFilterFactoryTests34.assertTermsEquals("enwiki.random.lines.txt", indexReader45, terms46, terms47, false);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        commonGramsTokenFilterFactoryTests34.assertTermsEquals("tests.monster", indexReader51, terms52, terms53, true);
        commonGramsTokenFilterFactoryTests34.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder58 = commonGramsTokenFilterFactoryTests34.newAnalysisSettingsBuilder();
        java.lang.Object obj59 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) builder58, obj59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) builder58);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1644");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("hi!", postingsEnum15, postingsEnum16, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, 0, postingsEnum23, postingsEnum24);
        commonGramsTokenFilterFactoryTests19.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("tests.weekly", indexReader28, (int) '#', postingsEnum30, postingsEnum31);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("enwiki.random.lines.txt", indexReader34, fields35, fields36, true);
        commonGramsTokenFilterFactoryTests19.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests19.tearDown();
        org.junit.rules.TestRule testRule41 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule42;
        org.junit.Assert.assertNotSame((java.lang.Object) "hi!", (java.lang.Object) testRule42);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests45 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests45.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests45.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader48, (int) (byte) -1, postingsEnum50, postingsEnum51);
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests45.ruleChain;
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        commonGramsTokenFilterFactoryTests45.assertFieldsEquals("enwiki.random.lines.txt", indexReader55, fields56, fields57, true);
        commonGramsTokenFilterFactoryTests45.setUp();
        java.lang.Class<?> wildcardClass61 = commonGramsTokenFilterFactoryTests45.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) testRule42, (java.lang.Object) commonGramsTokenFilterFactoryTests45);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1645");
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
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.slow", indexReader29, terms30, terms31, false);
        org.elasticsearch.common.settings.Settings.Builder builder34 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass35 = builder34.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) builder34);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1646");
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
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        commonGramsTokenFilterFactoryTests26.assertFieldsEquals("", indexReader57, fields58, fields59, true);
        commonGramsTokenFilterFactoryTests26.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        commonGramsTokenFilterFactoryTests26.assertPositionsSkippingEquals("tests.nightly", indexReader65, (int) (byte) 10, postingsEnum67, postingsEnum68);
        java.lang.String str70 = commonGramsTokenFilterFactoryTests26.getTestName();
        commonGramsTokenFilterFactoryTests26.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests26);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1647");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.failfast", indexReader9, 10, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.slow", indexReader15, (int) ' ', postingsEnum17, postingsEnum18);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1648");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests17.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23);
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests17.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests17);
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests17.assertDocsEnumEquals("tests.monster", postingsEnum29, postingsEnum30, false);
        org.junit.Assert.assertNotEquals((java.lang.Object) testRule15, (java.lang.Object) postingsEnum29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) postingsEnum29);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1649");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray19);
        java.util.Set<java.lang.Object> objSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charSequenceArray19);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests23.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests23.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests23.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests23.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str29 = commonGramsTokenFilterFactoryTests23.getTestName();
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray19, (java.lang.Object) str29);
        float[] floatArray34 = new float[] { '4', (byte) 10, (short) 0 };
        float[][] floatArray35 = new float[][] { floatArray34 };
        java.util.Set<float[]> floatArraySet36 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) floatArray35);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1650");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 10, (double) (byte) 1, (double) 10);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1651");
        float[] floatArray5 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray9 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray9, (float) 100L);
        float[] floatArray15 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray19 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray19, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray15, 1.0f);
        float[] floatArray27 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray31 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray31, (float) 100L);
        float[] floatArray37 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray41 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray41, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray37, 1.0f);
        org.junit.Assert.assertArrayEquals("random", floatArray5, floatArray27, (float) (-1));
        float[] floatArray51 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray55 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray55, (float) 100L);
        org.junit.Assert.assertArrayEquals("random", floatArray27, floatArray51, (float) 0);
        float[] floatArray63 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray67 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray67, (float) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray67, (float) (-1));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1652");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) (-1L));
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1653");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (short) 10, 1L);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1654");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1655");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 100, (float) (-1L), (-1.0f));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1656");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) (short) 0, (float) ' ', (float) 10L);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1657");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling6 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray10 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling9 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet11 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray10);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests13.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests13);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests13.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule16);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray10, (java.lang.Object) testRule16);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray7, (java.lang.Object[]) throttlingArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) throttlingArray7);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1658");
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
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) charSequenceArray41);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests46.setUp();
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet54 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray53);
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet60 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray59);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray53, (java.lang.Object[]) charSequenceArray59);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests46, (java.lang.Object) charSequenceArray53);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) charSequenceArray53);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray53);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests66 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests66.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        commonGramsTokenFilterFactoryTests66.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader69, (int) (byte) -1, postingsEnum71, postingsEnum72);
        org.junit.rules.TestRule testRule74 = commonGramsTokenFilterFactoryTests66.ruleChain;
        commonGramsTokenFilterFactoryTests66.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests66.setIndexWriterMaxDocs((int) (short) 0);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests80 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests80.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        commonGramsTokenFilterFactoryTests80.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader83, (int) (byte) -1, postingsEnum85, postingsEnum86);
        org.junit.rules.TestRule testRule88 = commonGramsTokenFilterFactoryTests80.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests80);
        commonGramsTokenFilterFactoryTests80.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule91 = commonGramsTokenFilterFactoryTests80.ruleChain;
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests66, (java.lang.Object) testRule91);
        commonGramsTokenFilterFactoryTests66.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charSequenceArray53, (java.lang.Object) commonGramsTokenFilterFactoryTests66);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1659");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray6, intArray7);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray10, intArray11);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray6, intArray10);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("hi!", intArray10, intArray15);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray22, intArray23);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray26, intArray27);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray22, intArray26);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray31, intArray32);
        org.junit.Assert.assertArrayEquals("hi!", intArray26, intArray31);
        org.junit.Assert.assertArrayEquals(intArray10, intArray31);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray39, intArray40);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray43, intArray44);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray39, intArray43);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray49, intArray50);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray53, intArray54);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray49, intArray53);
        org.junit.Assert.assertArrayEquals("random", intArray39, intArray49);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray60, intArray61);
        int[] intArray64 = new int[] {};
        int[] intArray65 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray64, intArray65);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray60, intArray64);
        org.junit.Assert.assertArrayEquals(intArray49, intArray60);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray10, intArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray10);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1660");
        short[][] shortArray1 = new short[][] {};
        java.util.Set<short[]> shortArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray1);
        java.util.Set<java.lang.Cloneable> cloneableSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) shortArray1);
        short[] shortArray8 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[] shortArray13 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[] shortArray18 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[][] shortArray19 = new short[][] { shortArray8, shortArray13, shortArray18 };
        java.util.Set<short[]> shortArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) shortArray1, (java.lang.Object[]) shortArray19);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1661");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.weekly", postingsEnum8, postingsEnum9, false);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.nightly", indexReader15, (int) (short) 100, postingsEnum17, postingsEnum18);
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
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("enwiki.random.lines.txt", indexReader35, fields36, fields37, true);
        commonGramsTokenFilterFactoryTests20.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests20.tearDown();
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests20.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule42;
        org.junit.Assert.assertNotNull((java.lang.Object) testRule42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexReader15, (java.lang.Object) testRule42);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1662");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (byte) -1, (long) (short) 100);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1663");
        int[] intArray5 = new int[] { 4, 4, 1, (byte) 1 };
        int[] intArray10 = new int[] { 4, 4, 1, (byte) 1 };
        int[] intArray15 = new int[] { 4, 4, 1, (byte) 1 };
        int[] intArray20 = new int[] { 4, 4, 1, (byte) 1 };
        int[] intArray25 = new int[] { 4, 4, 1, (byte) 1 };
        int[] intArray30 = new int[] { 4, 4, 1, (byte) 1 };
        int[][] intArray31 = new int[][] { intArray5, intArray10, intArray15, intArray20, intArray25, intArray30 };
        java.util.Set<int[]> intArraySet32 = org.apache.lucene.util.LuceneTestCase.asSet(intArray31);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests34 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests34.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests34);
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests34.ruleChain;
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray44 = new java.util.Locale[] { locale39, locale41, locale43 };
        java.util.Set<java.util.Locale> localeSet45 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray44);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) testRule37, (java.lang.Object) localeArray44);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests49 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests49.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests49);
        org.junit.rules.TestRule testRule52 = commonGramsTokenFilterFactoryTests49.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule52);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule52;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule52;
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) testRule52);
        org.junit.Assert.assertNotSame((java.lang.Object) testRule37, (java.lang.Object) "tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) intArraySet32, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1664");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', 100.0d);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1665");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray3, longArray4);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray8, longArray9);
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray8, longArray11);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray14, longArray15);
        org.junit.Assert.assertArrayEquals(longArray11, longArray14);
        org.junit.Assert.assertArrayEquals(longArray3, longArray11);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray22, longArray23);
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray22, longArray25);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray28, longArray29);
        org.junit.Assert.assertArrayEquals(longArray25, longArray28);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray35, longArray36);
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray35, longArray38);
        long[] longArray42 = new long[] {};
        long[] longArray43 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray42, longArray43);
        long[] longArray45 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray42, longArray45);
        long[] longArray48 = new long[] {};
        long[] longArray49 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray48, longArray49);
        org.junit.Assert.assertArrayEquals(longArray45, longArray48);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray35, longArray45);
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray55, longArray56);
        long[] longArray58 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray55, longArray58);
        long[] longArray62 = new long[] {};
        long[] longArray63 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray62, longArray63);
        long[] longArray65 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray62, longArray65);
        org.junit.Assert.assertArrayEquals(longArray55, longArray65);
        org.junit.Assert.assertArrayEquals(longArray35, longArray55);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray28, longArray35);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray3, longArray28);
        long[] longArray72 = new long[] {};
        long[] longArray73 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray72, longArray73);
        long[] longArray77 = new long[] {};
        long[] longArray78 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray77, longArray78);
        long[] longArray80 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray77, longArray80);
        long[] longArray83 = new long[] {};
        long[] longArray84 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray83, longArray84);
        org.junit.Assert.assertArrayEquals(longArray80, longArray83);
        org.junit.Assert.assertArrayEquals(longArray72, longArray80);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray28, longArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) longArray72);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1666");
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
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum18, postingsEnum19, true);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1667");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) -1, (double) '#');
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1668");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.failfast", indexReader9, 10, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.slow", indexReader15, (int) ' ', postingsEnum17, postingsEnum18);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests23.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests23);
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests23.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests23.assertDocsEnumEquals("tests.failfast", postingsEnum28, postingsEnum29, true);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        commonGramsTokenFilterFactoryTests23.assertFieldsEquals("", indexReader33, fields34, fields35, false);
        commonGramsTokenFilterFactoryTests23.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) ' ', (java.lang.Object) commonGramsTokenFilterFactoryTests23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) ' ');
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1669");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) (byte) 10);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1670");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 4, (double) '#', 0.0d);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1671");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (byte) 0, (double) (byte) 1);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1672");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum9, postingsEnum10, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder14 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1673");
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
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.slow", (int) (short) 10, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1674");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (byte) -1, (double) (short) 1);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1675");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray2, intArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, 0, postingsEnum14, postingsEnum15);
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("tests.weekly", indexReader19, (int) '#', postingsEnum21, postingsEnum22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader25, 0, postingsEnum27, postingsEnum28);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsSkippingEquals("", indexReader31, (int) (short) -1, postingsEnum33, postingsEnum34, true);
        commonGramsTokenFilterFactoryTests10.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder38 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) builder38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray6, (java.lang.Object) builder38);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1676");
        double[][] doubleArray1 = new double[][] {};
        double[][] doubleArray2 = new double[][] {};
        double[][] doubleArray3 = new double[][] {};
        double[][] doubleArray4 = new double[][] {};
        double[][][] doubleArray5 = new double[][][] { doubleArray1, doubleArray2, doubleArray3, doubleArray4 };
        double[][] doubleArray6 = new double[][] {};
        double[][] doubleArray7 = new double[][] {};
        double[][] doubleArray8 = new double[][] {};
        double[][] doubleArray9 = new double[][] {};
        double[][][] doubleArray10 = new double[][][] { doubleArray6, doubleArray7, doubleArray8, doubleArray9 };
        double[][][][] doubleArray11 = new double[][][][] { doubleArray5, doubleArray10 };
        double[][] doubleArray12 = new double[][] {};
        double[][] doubleArray13 = new double[][] {};
        double[][] doubleArray14 = new double[][] {};
        double[][] doubleArray15 = new double[][] {};
        double[][][] doubleArray16 = new double[][][] { doubleArray12, doubleArray13, doubleArray14, doubleArray15 };
        double[][] doubleArray17 = new double[][] {};
        double[][] doubleArray18 = new double[][] {};
        double[][] doubleArray19 = new double[][] {};
        double[][] doubleArray20 = new double[][] {};
        double[][][] doubleArray21 = new double[][][] { doubleArray17, doubleArray18, doubleArray19, doubleArray20 };
        double[][][][] doubleArray22 = new double[][][][] { doubleArray16, doubleArray21 };
        double[][] doubleArray23 = new double[][] {};
        double[][] doubleArray24 = new double[][] {};
        double[][] doubleArray25 = new double[][] {};
        double[][] doubleArray26 = new double[][] {};
        double[][][] doubleArray27 = new double[][][] { doubleArray23, doubleArray24, doubleArray25, doubleArray26 };
        double[][] doubleArray28 = new double[][] {};
        double[][] doubleArray29 = new double[][] {};
        double[][] doubleArray30 = new double[][] {};
        double[][] doubleArray31 = new double[][] {};
        double[][][] doubleArray32 = new double[][][] { doubleArray28, doubleArray29, doubleArray30, doubleArray31 };
        double[][][][] doubleArray33 = new double[][][][] { doubleArray27, doubleArray32 };
        double[][][][][] doubleArray34 = new double[][][][][] { doubleArray11, doubleArray22, doubleArray33 };
        java.util.Set<double[][][][]> doubleArraySet35 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray34);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures36 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures37 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures36);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures38 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures39 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures38);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures40 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures41 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures40);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures42 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures43 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures42);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray44 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures37, testRuleIgnoreAfterMaxFailures39, testRuleIgnoreAfterMaxFailures40, testRuleIgnoreAfterMaxFailures42 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray45 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray44 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet46 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) doubleArray34, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray45);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1677");
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
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray28);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        org.junit.Assert.assertArrayEquals("", shortArray28, shortArray30);
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray28, shortArray34);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray39);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray28, shortArray39);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) shortArray28);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray47);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray52);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray55);
        org.junit.Assert.assertArrayEquals("", shortArray52, shortArray54);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray59);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray61);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray54, shortArray59);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray69);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals("", shortArray69, shortArray71);
        short[] shortArray75 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray69, shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray69);
        org.junit.Assert.assertArrayEquals("random", shortArray47, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) byteArray8, (java.lang.Object) shortArray28);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1678");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) (byte) -1);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1679");
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
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet17 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray16);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray16, (java.lang.Object[]) charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet30 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray29);
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet38 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray37);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet44 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray43);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray37, (java.lang.Object[]) charSequenceArray43);
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet51 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray43, (java.lang.Object[]) charSequenceArray50);
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet59 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray58);
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet65 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray64);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray58, (java.lang.Object[]) charSequenceArray64);
        java.lang.CharSequence[] charSequenceArray71 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet72 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray71);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray64, (java.lang.Object[]) charSequenceArray71);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray50, (java.lang.Object[]) charSequenceArray71);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray29, (java.lang.Object[]) charSequenceArray71);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests76 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests76.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        commonGramsTokenFilterFactoryTests76.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader79, (int) (byte) -1, postingsEnum81, postingsEnum82);
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.Fields fields86 = null;
        org.apache.lucene.index.Fields fields87 = null;
        commonGramsTokenFilterFactoryTests76.assertFieldsEquals("random", indexReader85, fields86, fields87, false);
        org.junit.rules.TestRule testRule90 = commonGramsTokenFilterFactoryTests76.ruleChain;
        commonGramsTokenFilterFactoryTests76.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray71, (java.lang.Object) commonGramsTokenFilterFactoryTests76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray1, (java.lang.Object[]) charSequenceArray71);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1680");
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
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests0.ruleChain;
        java.lang.Class<?> wildcardClass18 = commonGramsTokenFilterFactoryTests0.getClass();
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
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("enwiki.random.lines.txt", indexReader35, fields36, fields37, true);
        commonGramsTokenFilterFactoryTests20.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests20.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests20, (java.lang.Object) "<unknown>");
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests20.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder45 = commonGramsTokenFilterFactoryTests20.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) wildcardClass18, (java.lang.Object) builder45);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1681");
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
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 10);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", 1, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1682");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) ' ', (long) (short) 10);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1683");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (short) 100, (long) 4);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1684");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) '4', 1L);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1685");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, 0L);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1686");
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals("", shortArray7, shortArray9);
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray7, shortArray13);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray18);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray7, shortArray18);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) shortArray7);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals("", shortArray31, shortArray33);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray40);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray33, shortArray38);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals("", shortArray48, shortArray50);
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray48, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray48);
        org.junit.Assert.assertArrayEquals("random", shortArray26, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) shortArray26);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1687");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 100L, (double) 100.0f);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1688");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.monster", postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", 1, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1689");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { ' ', (-1) };
        double[] doubleArray9 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray9, (double) 100L);
        double[] doubleArray14 = new double[] { ' ', (-1) };
        double[] doubleArray17 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray17, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray9, doubleArray14, 100.0d);
        double[] doubleArray24 = new double[] { ' ', (-1) };
        double[] doubleArray27 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray27, (double) 100L);
        double[] doubleArray33 = new double[] { ' ', (-1) };
        double[] doubleArray36 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray36, (double) 100L);
        double[] doubleArray41 = new double[] { ' ', (-1) };
        double[] doubleArray44 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray44, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray36, doubleArray41, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray41, (double) 1);
        double[] doubleArray53 = new double[] { ' ', (-1) };
        double[] doubleArray56 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray56, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray56, (double) 100);
        org.junit.Assert.assertArrayEquals("hi!", doubleArray14, doubleArray24, (double) 2);
        double[] doubleArray65 = new double[] { ' ', (-1) };
        double[] doubleArray68 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray68, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray24, doubleArray65, (double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray65, (-1.0d));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1690");
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
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.weekly", indexReader31, fields32, fields33, false);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum37, postingsEnum38);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1691");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.nightly", postingsEnum14, postingsEnum15, true);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals("", shortArray21, shortArray23);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray28);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray30);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray23, shortArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) postingsEnum15, (java.lang.Object) shortArray28);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1692");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 0.0f, (double) (short) 0);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1693");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader9, (int) '4', postingsEnum11, postingsEnum12, true);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum16, postingsEnum17, true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        java.lang.String str21 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.nightly", indexReader23, fields24, fields25, true);
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.slow", 0, numericDocValues30, numericDocValues31);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1694");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) '4', (-1.0d), (double) 3);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1695");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 100.0f, 0.0d, (double) 100L);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1696");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) '#', 1.0d);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1697");
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
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader19, 10, postingsEnum21, postingsEnum22, false);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder30 = commonGramsTokenFilterFactoryTests29.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests29.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests29, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests29.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum37, postingsEnum38);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1698");
        java.lang.Object obj0 = null;
        float[] floatArray6 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray10 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray10, (float) 100L);
        float[] floatArray16 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray20 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray20, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray16, 1.0f);
        float[] floatArray28 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray32 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray32, (float) 100L);
        float[] floatArray38 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray42 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray42, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray38, 1.0f);
        java.lang.Object obj47 = new java.lang.Object();
        org.junit.Assert.assertNotEquals((java.lang.Object) floatArray38, obj47);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray6, floatArray38, 100.0f);
        float[] floatArray54 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray58 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray58, (float) 100L);
        float[] floatArray64 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray68 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray64, floatArray68, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray64, 1.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray6, floatArray64, (float) (byte) 1);
        float[] floatArray78 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray82 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray78, floatArray82, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray78, (float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) floatArray78);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1699");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (short) -1, (long) (short) 1);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1700");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) 1, (-1.0f), (float) 0L);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1701");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 0.0f);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1702");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, true);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1703");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 0, 10.0d, (double) 4);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1704");
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
        double[] doubleArray45 = new double[] { ' ', (-1) };
        double[] doubleArray48 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray48, (double) 100L);
        double[] doubleArray53 = new double[] { ' ', (-1) };
        double[] doubleArray56 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray56, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray48, doubleArray53, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray53, (double) 1);
        double[] doubleArray65 = new double[] { ' ', (-1) };
        double[] doubleArray68 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray68, (double) 100L);
        double[] doubleArray74 = new double[] { ' ', (-1) };
        double[] doubleArray77 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray74, doubleArray77, (double) 100L);
        double[] doubleArray82 = new double[] { ' ', (-1) };
        double[] doubleArray85 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray82, doubleArray85, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray77, doubleArray82, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray82, (double) 1);
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray82, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray53, (double) (short) 1);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) doubleArray23);
        double[] doubleArray97 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray23, doubleArray97, (double) 10.0f);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1705");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("tests.failfast", indexReader13, terms14, terms15, true);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray21, intArray22);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray21, intArray25);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray31, intArray32);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray35, intArray36);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray31, intArray35);
        org.junit.Assert.assertArrayEquals("random", intArray21, intArray31);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray42, intArray43);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray46, intArray47);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray42, intArray46);
        org.junit.Assert.assertArrayEquals(intArray31, intArray42);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) intArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.nightly");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1706");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1), (double) (byte) 1, (double) ' ');
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1707");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) -1, (double) (-1L), (double) '#');
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1708");
        float[] floatArray1 = null;
        float[] floatArray6 = new float[] { (byte) 100, 1.0f, 4, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray1, floatArray6, (float) (-1L));
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1709");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1710");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str9 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", (int) (short) 1, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1711");
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
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum31, postingsEnum32, true);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum37, postingsEnum38);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1712");
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
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray35, byteArray36);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray25, byteArray36);
        byte[] byteArray39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray39);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1713");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) 'a');
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1714");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) charSequenceArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests18.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests18);
        commonGramsTokenFilterFactoryTests18.tearDown();
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests18.setIndexWriterMaxDocs((int) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) '#');
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1715");
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
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals(charArray19, charArray22);
        org.junit.Assert.assertArrayEquals("", charArray15, charArray19);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals(charArray31, charArray34);
        org.junit.Assert.assertArrayEquals("", charArray27, charArray31);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray19, charArray27);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray11, charArray27);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        org.junit.Assert.assertArrayEquals(charArray50, charArray53);
        org.junit.Assert.assertArrayEquals("", charArray46, charArray50);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        org.junit.Assert.assertArrayEquals(charArray62, charArray65);
        org.junit.Assert.assertArrayEquals("", charArray58, charArray62);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray50, charArray58);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray42, charArray58);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray27, charArray42);
        org.junit.Assert.assertArrayEquals(charArray5, charArray27);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests74 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests74.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        commonGramsTokenFilterFactoryTests74.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader77, (int) (byte) -1, postingsEnum79, postingsEnum80);
        org.junit.rules.TestRule testRule82 = commonGramsTokenFilterFactoryTests74.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests74);
        commonGramsTokenFilterFactoryTests74.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule85 = commonGramsTokenFilterFactoryTests74.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        commonGramsTokenFilterFactoryTests74.assertDocsEnumEquals("hi!", postingsEnum87, postingsEnum88, false);
        java.lang.Class<?> wildcardClass91 = commonGramsTokenFilterFactoryTests74.getClass();
        org.junit.Assert.assertNotEquals((java.lang.Object) charArray5, (java.lang.Object) wildcardClass91);
        char[] charArray93 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray5, charArray93);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1716");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 100.0d, (double) '4');
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1717");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) (byte) 1);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1718");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (-1), (-1L));
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1719");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) 10, (float) (short) 0, (float) (byte) 1);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1720");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (long) 4, (long) 4);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1721");
        long[] longArray1 = null;
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray5, longArray6);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray11, longArray12);
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray11, longArray14);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray18, longArray19);
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray18, longArray21);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray24, longArray25);
        org.junit.Assert.assertArrayEquals(longArray21, longArray24);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray11, longArray21);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray31, longArray32);
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray31, longArray34);
        long[] longArray38 = new long[] {};
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray38, longArray39);
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray38, longArray41);
        org.junit.Assert.assertArrayEquals(longArray31, longArray41);
        org.junit.Assert.assertArrayEquals(longArray11, longArray31);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray6, longArray31);
        long[] longArray48 = new long[] {};
        long[] longArray49 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray48, longArray49);
        long[] longArray51 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray48, longArray51);
        long[] longArray54 = new long[] {};
        long[] longArray55 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray54, longArray55);
        org.junit.Assert.assertArrayEquals(longArray51, longArray54);
        org.junit.Assert.assertArrayEquals(longArray31, longArray54);
        org.junit.Assert.assertNotEquals((java.lang.Object) (short) 1, (java.lang.Object) longArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray1, longArray31);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1722");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) '4', (double) 100, (double) ' ');
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1723");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0.0f, (float) (byte) -1, (float) (short) 0);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1724");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.failfast", indexReader9, 10, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.slow", indexReader15, (int) ' ', postingsEnum17, postingsEnum18);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("<unknown>", indexReader22, (int) (short) 1, postingsEnum24, postingsEnum25);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests28.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader31, (int) (byte) -1, postingsEnum33, postingsEnum34);
        commonGramsTokenFilterFactoryTests28.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        commonGramsTokenFilterFactoryTests28.assertTermsEquals("enwiki.random.lines.txt", indexReader39, terms40, terms41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        commonGramsTokenFilterFactoryTests28.assertTermsEquals("tests.monster", indexReader45, terms46, terms47, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests51 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests51.setUp();
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet59 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray58);
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet65 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray64);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray58, (java.lang.Object[]) charSequenceArray64);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests51, (java.lang.Object) charSequenceArray58);
        commonGramsTokenFilterFactoryTests51.tearDown();
        org.junit.rules.TestRule testRule69 = commonGramsTokenFilterFactoryTests51.ruleChain;
        org.junit.rules.TestRule testRule70 = commonGramsTokenFilterFactoryTests51.ruleChain;
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) terms47, (java.lang.Object) commonGramsTokenFilterFactoryTests51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "<unknown>", (java.lang.Object) terms47);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1725");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests5.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests5);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests5.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule8);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule8;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) testRule8);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1726");
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray5, intArray6);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray9, intArray10);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray5, intArray9);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray14, intArray15);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray5, intArray14);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray21, intArray22);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray21, intArray25);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray31, intArray32);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray35, intArray36);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray31, intArray35);
        org.junit.Assert.assertArrayEquals("random", intArray21, intArray31);
        org.junit.Assert.assertArrayEquals(intArray5, intArray21);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray43, intArray44);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray47, intArray48);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray43, intArray47);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray21, intArray47);
        int[] intArray58 = new int[] { (byte) 100, 2, (short) 0, 1, (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray21, intArray58);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1727");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("random", postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("random", postingsEnum10, postingsEnum11, false);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("hi!", (int) (short) 100, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1728");
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
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("", (int) 'a', numericDocValues15, numericDocValues16);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1729");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 1.0d, (double) 10.0f, (-1.0d));
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1730");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests61 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests61.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests61.setUp();
        commonGramsTokenFilterFactoryTests61.tearDown();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        commonGramsTokenFilterFactoryTests61.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader66, 10, postingsEnum68, postingsEnum69, false);
        org.elasticsearch.common.settings.Settings.Builder builder72 = commonGramsTokenFilterFactoryTests61.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 2, (java.lang.Object) builder72);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1731");
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
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray44 = new java.util.Locale[] { locale39, locale41, locale43 };
        java.util.Set<java.util.Locale> localeSet45 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleArray36, (java.lang.Object[]) localeArray44);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1732");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 2, (float) (short) 100, (float) (-1));
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1733");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray5, intArray6);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray9, intArray10);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray5, intArray9);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray14, intArray15);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray5, intArray14);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray21, intArray22);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray21, intArray25);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray30, intArray31);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray21, intArray30);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray37, intArray38);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray41, intArray42);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray37, intArray41);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray47, intArray48);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray51, intArray52);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray47, intArray51);
        org.junit.Assert.assertArrayEquals("random", intArray37, intArray47);
        org.junit.Assert.assertArrayEquals(intArray21, intArray37);
        org.junit.Assert.assertArrayEquals(intArray5, intArray37);
        int[] intArray61 = new int[] {};
        int[] intArray62 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray61, intArray62);
        int[] intArray65 = new int[] {};
        int[] intArray66 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray65, intArray66);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray61, intArray65);
        int[] intArray70 = new int[] {};
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray70, intArray71);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray61, intArray70);
        org.junit.Assert.assertArrayEquals(intArray37, intArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray61);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1734");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) (byte) 10);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1735");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests2.ruleChain;
        java.lang.Class<?> wildcardClass14 = commonGramsTokenFilterFactoryTests2.getClass();
        double[][] doubleArray15 = new double[][] {};
        double[][] doubleArray16 = new double[][] {};
        double[][] doubleArray17 = new double[][] {};
        double[][] doubleArray18 = new double[][] {};
        double[][] doubleArray19 = new double[][] {};
        double[][][] doubleArray20 = new double[][][] { doubleArray15, doubleArray16, doubleArray17, doubleArray18, doubleArray19 };
        java.util.Set<double[][]> doubleArraySet21 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) doubleArraySet21);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1736");
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
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling67 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray68 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling67 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet69 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray68);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests71 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests71.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests71);
        org.junit.rules.TestRule testRule74 = commonGramsTokenFilterFactoryTests71.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule74);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray68, (java.lang.Object) testRule74);
        java.util.Set<java.lang.Object> objSet77 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) throttlingArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray62, (java.lang.Object[]) throttlingArray68);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1737");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.setUp();
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet11 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray10);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet17 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray16);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray10, (java.lang.Object[]) charSequenceArray16);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) charSequenceArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", objArray1, (java.lang.Object[]) charSequenceArray10);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1738");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) 'a');
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1739");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, 100L);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1740");
        long[] longArray0 = null;
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray3, longArray4);
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray3, longArray6);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray9, longArray10);
        org.junit.Assert.assertArrayEquals(longArray6, longArray9);
        double[] doubleArray16 = new double[] { ' ', (-1) };
        double[] doubleArray19 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray19, (double) 100L);
        double[] doubleArray25 = new double[] { ' ', (-1) };
        double[] doubleArray28 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray28, (double) 100L);
        double[] doubleArray33 = new double[] { ' ', (-1) };
        double[] doubleArray36 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray36, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray28, doubleArray33, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray28, (double) (short) 10);
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
        double[] doubleArray74 = new double[] { ' ', (-1) };
        double[] doubleArray77 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray74, doubleArray77, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray77, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray77, (-1.0d));
        org.junit.Assert.assertNotNull("", (java.lang.Object) doubleArray77);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray9, (java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray9);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1741");
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
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[]) wildcardClassArray8);
        short[][] shortArray16 = new short[][] {};
        java.util.Set<short[]> shortArraySet17 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) annotatedElementSet15, (java.lang.Object) shortArray16);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1742");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (double) (byte) -1, (double) 0, (double) 'a');
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1743");
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
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling47 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray48 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling47 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet49 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) charSequenceArray21, (java.lang.Object[]) throttlingArray48);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1744");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.weekly", 10, numericDocValues8, numericDocValues9);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1745");
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
        java.lang.Class<?> wildcardClass26 = commonGramsTokenFilterFactoryTests0.getClass();
        java.lang.Object obj27 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests28.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader31, (int) (byte) -1, postingsEnum33, postingsEnum34);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("random", indexReader37, fields38, fields39, false);
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests28.ruleChain;
        org.junit.Assert.assertNotEquals(obj27, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        commonGramsTokenFilterFactoryTests28.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1746");
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
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("hi!", indexReader32, (int) (short) 0, postingsEnum34, postingsEnum35);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields39, fields40, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1747");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) 100, (float) (byte) 0, (float) ' ');
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1748");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 1);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1749");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray3);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray7, longArray8);
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray7, longArray10);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray13, longArray14);
        org.junit.Assert.assertArrayEquals(longArray10, longArray13);
        org.junit.Assert.assertArrayEquals(longArray2, longArray10);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet24 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray23);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet30 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray29);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray23, (java.lang.Object[]) charSequenceArray29);
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet37 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray29, (java.lang.Object[]) charSequenceArray36);
        java.util.Set<java.lang.Object> objSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charSequenceArray36);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests40.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests40.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests40.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests40.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str46 = commonGramsTokenFilterFactoryTests40.getTestName();
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray36, (java.lang.Object) str46);
        org.junit.Assert.assertNotSame((java.lang.Object) longArray2, (java.lang.Object) charSequenceArray36);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests49 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder50 = commonGramsTokenFilterFactoryTests49.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests49.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests49, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests49.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests49.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        commonGramsTokenFilterFactoryTests49.assertTermsEquals("", indexReader57, terms58, terms59, false);
        java.lang.String str62 = commonGramsTokenFilterFactoryTests49.getTestName();
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) charSequenceArray36, (java.lang.Object) str62);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy64 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass65 = queryCachingPolicy64.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy66 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass67 = queryCachingPolicy66.getClass();
        java.lang.Class[] classArray69 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray70 = (java.lang.Class<?>[]) classArray69;
        wildcardClassArray70[0] = wildcardClass65;
        wildcardClassArray70[1] = wildcardClass67;
        java.util.Set<java.lang.Class<?>> wildcardClassSet75 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray70);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy76 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass77 = queryCachingPolicy76.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy78 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass79 = queryCachingPolicy78.getClass();
        java.lang.Class[] classArray81 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray82 = (java.lang.Class<?>[]) classArray81;
        wildcardClassArray82[0] = wildcardClass77;
        wildcardClassArray82[1] = wildcardClass79;
        java.util.Set<java.lang.Class<?>> wildcardClassSet87 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray82);
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray70, (java.lang.Object[]) wildcardClassArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray36, (java.lang.Object[]) wildcardClassArray70);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1750");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        java.lang.String str8 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str10 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests13.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader15, 0, postingsEnum17, postingsEnum18);
        commonGramsTokenFilterFactoryTests13.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests13.assertPositionsSkippingEquals("tests.weekly", indexReader22, (int) '#', postingsEnum24, postingsEnum25);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        commonGramsTokenFilterFactoryTests13.assertFieldsEquals("enwiki.random.lines.txt", indexReader28, fields29, fields30, true);
        commonGramsTokenFilterFactoryTests13.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests13.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) "<unknown>");
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests13.ruleChain;
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests13.assertPositionsSkippingEquals("random", indexReader39, (int) (byte) 0, postingsEnum41, postingsEnum42);
        commonGramsTokenFilterFactoryTests13.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder45 = commonGramsTokenFilterFactoryTests13.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests13);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1751");
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
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder23 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", (int) (byte) 10, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1752");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray14);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) charSequenceArray8);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.awaitsfix", indexReader19, terms20, terms21, false);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1753");
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
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(0);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests24.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests24.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests24, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests24.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests24.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests24.setUp();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests24.assertPositionsSkippingEquals("tests.failfast", indexReader33, 10, postingsEnum35, postingsEnum36);
        commonGramsTokenFilterFactoryTests24.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests24);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1754");
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
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray7);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[]) wildcardClassArray7);
        java.util.Collection[] collectionArray16 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray17 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray16;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.CharSequence>[]) collectionArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) wildcardClassArray7, (java.lang.Object[]) collectionArray16);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1755");
        java.lang.Object[] objArray1 = null;
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast" };
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast" };
        java.lang.CharSequence[][] charSequenceArray8 = new java.lang.CharSequence[][] { charSequenceArray4, charSequenceArray7 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", objArray1, (java.lang.Object[]) charSequenceArray8);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1756");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', 0L);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1757");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy0 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass1 = queryCachingPolicy0.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass3 = queryCachingPolicy2.getClass();
        java.lang.Class[] classArray5 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        wildcardClassArray6[0] = wildcardClass1;
        wildcardClassArray6[1] = wildcardClass3;
        java.util.Set<java.lang.Class<?>> wildcardClassSet11 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray6);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy12 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass13 = queryCachingPolicy12.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy14 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass15 = queryCachingPolicy14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass13;
        wildcardClassArray18[1] = wildcardClass15;
        java.util.Set<java.lang.Class<?>> wildcardClassSet23 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray18);
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray6, (java.lang.Object[]) wildcardClassArray18);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray18);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy26 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass27 = queryCachingPolicy26.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy28 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass29 = queryCachingPolicy28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        wildcardClassArray32[0] = wildcardClass27;
        wildcardClassArray32[1] = wildcardClass29;
        java.util.Set<java.lang.Class<?>> wildcardClassSet37 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray32);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy38 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass39 = queryCachingPolicy38.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy40 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass41 = queryCachingPolicy40.getClass();
        java.lang.Class[] classArray43 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        wildcardClassArray44[0] = wildcardClass39;
        wildcardClassArray44[1] = wildcardClass41;
        java.util.Set<java.lang.Class<?>> wildcardClassSet49 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray32, (java.lang.Object[]) wildcardClassArray44);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) wildcardClassArray18, (java.lang.Object[]) wildcardClassArray44);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures53 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures54 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures53);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures55 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures56 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures55);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures57 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures58 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures57);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray59 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures53, testRuleIgnoreAfterMaxFailures56, testRuleIgnoreAfterMaxFailures58 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet60 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray59);
        java.util.Set<org.junit.rules.TestRule> testRuleSet61 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) testRuleIgnoreAfterMaxFailuresArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray18, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray59);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1758");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) 4, (-1L));
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1759");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, 0.0d, (double) (byte) 100);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1760");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("random", postingsEnum5, postingsEnum6, false);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests12.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests12.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader15, (int) (byte) -1, postingsEnum17, postingsEnum18);
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests12.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests12);
        commonGramsTokenFilterFactoryTests12.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests12);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1761");
        long[] longArray0 = null;
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray3, longArray4);
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray3, longArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1762");
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
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("", indexReader30, fields31, fields32, false);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling35 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray36);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling39 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray40);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray43 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling42 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray43);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests46.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests46);
        org.junit.rules.TestRule testRule49 = commonGramsTokenFilterFactoryTests46.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule49);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray43, (java.lang.Object) testRule49);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray40, (java.lang.Object[]) throttlingArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray36, (java.lang.Object[]) throttlingArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) throttlingArray43);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1763");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray3, byteArray7);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray12, byteArray13);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray16, byteArray17);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray13, byteArray16);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray23, byteArray24);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray27, byteArray28);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray24, byteArray28);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray33, byteArray34);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray37, byteArray38);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray34, byteArray37);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray28, byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray34);
        org.junit.Assert.assertNotNull((java.lang.Object) byteArray34);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray46, byteArray47);
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
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray63);
        java.lang.Object obj73 = new java.lang.Object();
        org.junit.Assert.assertNotEquals(obj73, (java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) byteArray63, (java.lang.Object) "");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1764");
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
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy35 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass36 = queryCachingPolicy35.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy37 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass38 = queryCachingPolicy37.getClass();
        java.lang.Class[] classArray40 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        wildcardClassArray41[0] = wildcardClass36;
        wildcardClassArray41[1] = wildcardClass38;
        java.util.Set<java.lang.Class<?>> wildcardClassSet46 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray41);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy47 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass48 = queryCachingPolicy47.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy49 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass50 = queryCachingPolicy49.getClass();
        java.lang.Class[] classArray52 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        wildcardClassArray53[0] = wildcardClass48;
        wildcardClassArray53[1] = wildcardClass50;
        java.util.Set<java.lang.Class<?>> wildcardClassSet58 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray41, (java.lang.Object[]) wildcardClassArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray11, (java.lang.Object[]) wildcardClassArray53);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1765");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 100.0f);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1766");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 1L, 100.0d);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1767");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("", shortArray5, shortArray7);
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray5, shortArray11);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray14);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals("", shortArray21, shortArray23);
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray21, shortArray27);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray32);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray21, shortArray32);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray11, shortArray21);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
        org.junit.Assert.assertArrayEquals("", shortArray45, shortArray47);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray52);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray54);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray47, shortArray52);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray62);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray65);
        org.junit.Assert.assertArrayEquals("", shortArray62, shortArray64);
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray62, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray62);
        org.junit.Assert.assertArrayEquals("random", shortArray40, shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray40);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray76);
        short[] shortArray78 = new short[] {};
        short[] shortArray79 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray78, shortArray79);
        org.junit.Assert.assertArrayEquals("", shortArray76, shortArray78);
        short[] shortArray82 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray76, shortArray82);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) shortArray21);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1768");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (-1.0d));
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1769");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests2.ruleChain;
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) testRule5, (java.lang.Object) localeArray12);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet27 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray26);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray26);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet34 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray26, (java.lang.Object[]) charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray42);
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet49 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray48);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray42, (java.lang.Object[]) charSequenceArray48);
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet57 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray56);
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet63 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray62);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray56, (java.lang.Object[]) charSequenceArray62);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray48, (java.lang.Object[]) charSequenceArray62);
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray33, (java.lang.Object) charSequenceArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) localeArray12, (java.lang.Object[]) charSequenceArray48);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1770");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.nightly", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("<unknown>", indexReader17, fields18, fields19, true);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("random", indexReader23, terms24, terms25, false);
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.nightly", 0, numericDocValues30, numericDocValues31);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1771");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests6.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests6.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests6, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests6.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests6.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        commonGramsTokenFilterFactoryTests6.assertTermsEquals("", indexReader14, terms15, terms16, false);
        java.lang.String str19 = commonGramsTokenFilterFactoryTests6.getTestName();
        org.junit.Assert.assertNotEquals((java.lang.Object) builder5, (java.lang.Object) commonGramsTokenFilterFactoryTests6);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests6.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1772");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests24.restoreIndexWriterMaxDocs();
        java.lang.String str26 = commonGramsTokenFilterFactoryTests24.getTestName();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests24);
        java.lang.Object obj28 = null;
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests24, obj28);
        commonGramsTokenFilterFactoryTests24.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) terms18, (java.lang.Object) commonGramsTokenFilterFactoryTests24);
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests24.assertDocValuesEquals("", (int) (byte) 1, numericDocValues34, numericDocValues35);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1773");
        java.util.Collection[] collectionArray1 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray2 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray1;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.CharSequence>[]) collectionArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests4.ruleChain;
        commonGramsTokenFilterFactoryTests4.setUp();
        commonGramsTokenFilterFactoryTests4.tearDown();
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests4.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) collectionArray1, (java.lang.Object) testRule10);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1774");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (-1.0f), (double) (short) 100);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1775");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("enwiki.random.lines.txt", indexReader12, terms13, terms14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.monster", indexReader18, terms19, terms20, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests25.restoreIndexWriterMaxDocs();
        java.lang.String str27 = commonGramsTokenFilterFactoryTests25.getTestName();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests25);
        java.lang.Object obj29 = null;
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests25, obj29);
        commonGramsTokenFilterFactoryTests25.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) terms19, (java.lang.Object) commonGramsTokenFilterFactoryTests25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) terms19);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1776");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) '4', (double) 0.0f);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1777");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) 1, 0L);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1778");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (-1.0d), (double) 3, (double) 0.0f);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1779");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.setUp();
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet11 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray10);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet17 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray16);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray10, (java.lang.Object[]) charSequenceArray16);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) charSequenceArray10);
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet26 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray25);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet32 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray31);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray25, (java.lang.Object[]) charSequenceArray31);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet39 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray31, (java.lang.Object[]) charSequenceArray38);
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet47 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray46);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet53 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray52);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray46, (java.lang.Object[]) charSequenceArray52);
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet60 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray52, (java.lang.Object[]) charSequenceArray59);
        java.lang.CharSequence[] charSequenceArray67 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet68 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray67);
        java.lang.CharSequence[] charSequenceArray73 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet74 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray73);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray67, (java.lang.Object[]) charSequenceArray73);
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet81 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray80);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray73, (java.lang.Object[]) charSequenceArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray59, (java.lang.Object[]) charSequenceArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray38, (java.lang.Object[]) charSequenceArray80);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) charSequenceArray10, (java.lang.Object[]) charSequenceArray80);
        java.lang.String[] strArray90 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet91 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray90);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) charSequenceArray80, (java.lang.Object[]) strArray90);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1780");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet14 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) charSequenceArray19);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet27 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) charSequenceArray26);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet35 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray34);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet41 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray40);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray34, (java.lang.Object[]) charSequenceArray40);
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet48 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray40, (java.lang.Object[]) charSequenceArray47);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) charSequenceArray47);
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray47);
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet59 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray58);
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet65 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray64);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray58, (java.lang.Object[]) charSequenceArray64);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) charSequenceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray64);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests69 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder70 = commonGramsTokenFilterFactoryTests69.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests69.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests69, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests69.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests69.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests69.setUp();
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        commonGramsTokenFilterFactoryTests69.assertPositionsSkippingEquals("tests.failfast", indexReader78, 10, postingsEnum80, postingsEnum81);
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        commonGramsTokenFilterFactoryTests69.assertPositionsSkippingEquals("tests.slow", indexReader84, (int) ' ', postingsEnum86, postingsEnum87);
        commonGramsTokenFilterFactoryTests69.setIndexWriterMaxDocs(0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charSequenceArray5, (java.lang.Object) 0);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1781");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, 0, postingsEnum6, postingsEnum7);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) builder16, (java.lang.Object) "tests.failfast");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests19.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests19.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests19.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests19.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str25 = commonGramsTokenFilterFactoryTests19.getTestName();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        commonGramsTokenFilterFactoryTests19.assertTermsEquals("tests.awaitsfix", indexReader27, terms28, terms29, true);
        commonGramsTokenFilterFactoryTests19.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) "tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests19);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests19.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum35, postingsEnum36);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1782");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (float) (-1), (float) (short) 10, (float) 10L);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1783");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) ' ');
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1784");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) 100.0f);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1785");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        java.lang.String str2 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setUp();
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals("", shortArray7, shortArray9);
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray7, shortArray13);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals("", shortArray17, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray17);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray27);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals("", shortArray27, shortArray29);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray36);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray29, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray34);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray44);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray46);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray44);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray54);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray57);
        org.junit.Assert.assertArrayEquals("", shortArray54, shortArray56);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray63);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray56, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray61);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray72);
        short[] shortArray74 = new short[] {};
        short[] shortArray75 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray74, shortArray75);
        org.junit.Assert.assertArrayEquals("", shortArray72, shortArray74);
        short[] shortArray78 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray72, shortArray78);
        short[] shortArray80 = new short[] {};
        short[] shortArray81 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray80, shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray78, shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray81);
        short[] shortArray86 = new short[] {};
        short[] shortArray87 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray86, shortArray87);
        short[] shortArray89 = new short[] {};
        short[] shortArray90 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray89, shortArray90);
        org.junit.Assert.assertArrayEquals("", shortArray87, shortArray89);
        org.junit.Assert.assertArrayEquals("hi!", shortArray81, shortArray87);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray81);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) shortArray81);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1786");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 4, 10L);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1787");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet10 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray9);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray9, (java.lang.Object[]) charSequenceArray15);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) charSequenceArray9);
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet25 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray24);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet31 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray30);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray24, (java.lang.Object[]) charSequenceArray30);
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet38 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray30, (java.lang.Object[]) charSequenceArray37);
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet46 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray45);
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet52 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray51);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray45, (java.lang.Object[]) charSequenceArray51);
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet59 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray51, (java.lang.Object[]) charSequenceArray58);
        java.lang.CharSequence[] charSequenceArray66 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet67 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray66);
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet73 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray72);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray66, (java.lang.Object[]) charSequenceArray72);
        java.lang.CharSequence[] charSequenceArray79 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet80 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray79);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray72, (java.lang.Object[]) charSequenceArray79);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray58, (java.lang.Object[]) charSequenceArray79);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray37, (java.lang.Object[]) charSequenceArray79);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) charSequenceArray9, (java.lang.Object[]) charSequenceArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charSequenceArray79);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1788");
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
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        commonGramsTokenFilterFactoryTests41.assertFieldsEquals("tests.monster", indexReader49, fields50, fields51, false);
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests41.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests41.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum56, postingsEnum57);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1789");
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
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.slow", indexReader19, (int) (short) -1, postingsEnum21, postingsEnum22);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1790");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 100, (double) 100L);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1791");
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
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray22, doubleArray35, (double) (short) 100);
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
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "<unknown>", (java.lang.Object) doubleArray65);
        double[] doubleArray78 = new double[] { ' ', (-1) };
        double[] doubleArray81 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray78, doubleArray81, (double) 100L);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray65, doubleArray78, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray78, (double) 100L);
        double[] doubleArray88 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray78, doubleArray88, (double) (short) 0);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1792");
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
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("", postingsEnum15, postingsEnum16, true);
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
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("enwiki.random.lines.txt", indexReader35, fields36, fields37, true);
        commonGramsTokenFilterFactoryTests20.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests20.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests20.ruleChain;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) testRule42, (java.lang.Object) (byte) 10);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule42;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule42;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule42;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) postingsEnum16, (java.lang.Object) testRule42);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1793");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) false);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1794");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0f, (float) '#', (float) (-1L));
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1795");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 1L, 100.0d, 1.0d);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1796");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 3, (float) (short) -1, (float) 1);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1797");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.nightly", indexReader8, fields9, fields10, true);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests1.ruleChain;
        double[][] doubleArray14 = new double[][] {};
        double[][] doubleArray15 = new double[][] {};
        double[][] doubleArray16 = new double[][] {};
        double[][] doubleArray17 = new double[][] {};
        double[][] doubleArray18 = new double[][] {};
        double[][][] doubleArray19 = new double[][][] { doubleArray14, doubleArray15, doubleArray16, doubleArray17, doubleArray18 };
        java.util.Set<double[][]> doubleArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) testRule13, (java.lang.Object) doubleArraySet20);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1798");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (short) -1, (long) (short) 100);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1799");
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
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "hi!", (java.lang.Object) charSequenceArray20);
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet52 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray51);
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet58 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray57);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray51, (java.lang.Object[]) charSequenceArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray51);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling62 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray63 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling62 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet64 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray63);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling65 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray66 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling65 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet67 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray66);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests69 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests69.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests69);
        org.junit.rules.TestRule testRule72 = commonGramsTokenFilterFactoryTests69.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule72);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray66, (java.lang.Object) testRule72);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray63, (java.lang.Object[]) throttlingArray66);
        org.junit.Assert.assertNotNull((java.lang.Object) throttlingArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) throttlingArray63);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1800");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("", shortArray5, shortArray7);
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray5, shortArray11);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray14);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals("", shortArray20, shortArray22);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray27);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray29);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray22, shortArray27);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray14, shortArray22);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals("", shortArray38, shortArray40);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray47);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray40, shortArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.monster", (java.lang.Object) shortArray45);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray57);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray60);
        org.junit.Assert.assertArrayEquals("", shortArray57, shortArray59);
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray57, shortArray63);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray66);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray72);
        short[] shortArray74 = new short[] {};
        short[] shortArray75 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray74, shortArray75);
        org.junit.Assert.assertArrayEquals("", shortArray72, shortArray74);
        short[] shortArray78 = new short[] {};
        short[] shortArray79 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray78, shortArray79);
        short[] shortArray81 = new short[] {};
        short[] shortArray82 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray81, shortArray82);
        org.junit.Assert.assertArrayEquals(shortArray79, shortArray81);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray74, shortArray79);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray66, shortArray74);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) shortArray74);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1801");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 10);
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
        commonGramsTokenFilterFactoryTests6.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests6, (java.lang.Object) "<unknown>");
        org.elasticsearch.common.settings.Settings.Builder builder30 = commonGramsTokenFilterFactoryTests6.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (byte) 10, (java.lang.Object) commonGramsTokenFilterFactoryTests6);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1802");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, 1L);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1803");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) ' ', (double) 2, (double) 'a');
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1804");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0.0d, (double) 100.0f);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1805");
        short[] shortArray0 = null;
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
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests15.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests15.setUp();
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests15.ruleChain;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests15.assertFieldsEquals("tests.badapples", indexReader22, fields23, fields24, true);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals("", shortArray29, shortArray31);
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader22, (java.lang.Object) shortArray31);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray39);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals("", shortArray39, shortArray41);
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray39, shortArray45);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray49);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals("", shortArray49, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray49);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray31, shortArray45);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) shortArray45);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray3, shortArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray45);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1806");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray19);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray28);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet35 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray34);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray28, (java.lang.Object[]) charSequenceArray34);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray42);
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet49 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray48);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray42, (java.lang.Object[]) charSequenceArray48);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray34, (java.lang.Object[]) charSequenceArray48);
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray19, (java.lang.Object) charSequenceArray34);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests54 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests54.setUp();
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet62 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray61);
        java.lang.CharSequence[] charSequenceArray67 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet68 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray67);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray61, (java.lang.Object[]) charSequenceArray67);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests54, (java.lang.Object) charSequenceArray61);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) charSequenceArray61);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling72 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray73 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling72 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet74 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray73);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests76 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests76.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests76);
        org.junit.rules.TestRule testRule79 = commonGramsTokenFilterFactoryTests76.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule79);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray73, (java.lang.Object) testRule79);
        java.util.Set<java.lang.Object> objSet82 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) throttlingArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray61, (java.lang.Object[]) throttlingArray73);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1807");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray7 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures4, testRuleIgnoreAfterMaxFailures6 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet8 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray7);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet14 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray13);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) testRuleIgnoreAfterMaxFailuresArray7, (java.lang.Object) charSequenceSet14);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy16 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass17 = queryCachingPolicy16.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy18 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass19 = queryCachingPolicy18.getClass();
        java.lang.Class[] classArray21 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        wildcardClassArray22[0] = wildcardClass17;
        wildcardClassArray22[1] = wildcardClass19;
        java.util.Set<java.lang.Class<?>> wildcardClassSet27 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray22);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy28 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass29 = queryCachingPolicy28.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy30 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass31 = queryCachingPolicy30.getClass();
        java.lang.Class[] classArray33 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass29;
        wildcardClassArray34[1] = wildcardClass31;
        java.util.Set<java.lang.Class<?>> wildcardClassSet39 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray22, (java.lang.Object[]) wildcardClassArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray7, (java.lang.Object[]) wildcardClassArray34);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1808");
        int[] intArray5 = new int[] { 4, 4, 1, (byte) 1 };
        int[] intArray10 = new int[] { 4, 4, 1, (byte) 1 };
        int[] intArray15 = new int[] { 4, 4, 1, (byte) 1 };
        int[] intArray20 = new int[] { 4, 4, 1, (byte) 1 };
        int[] intArray25 = new int[] { 4, 4, 1, (byte) 1 };
        int[] intArray30 = new int[] { 4, 4, 1, (byte) 1 };
        int[][] intArray31 = new int[][] { intArray5, intArray10, intArray15, intArray20, intArray25, intArray30 };
        java.util.Set<int[]> intArraySet32 = org.apache.lucene.util.LuceneTestCase.asSet(intArray31);
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) intArraySet32, (java.lang.Object) locale34);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1809");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) 1.0f, (double) 0L, (double) 100.0f);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1810");
        short[][] shortArray0 = new short[][] {};
        java.util.Set<short[]> shortArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray0);
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray7);
        org.junit.Assert.assertNotEquals((java.lang.Object) 10L, (java.lang.Object) charSequenceSet8);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet26 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray25);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) charSequenceArray25);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet33 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray25, (java.lang.Object[]) charSequenceArray32);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet41 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray40);
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet47 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray46);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray40, (java.lang.Object[]) charSequenceArray46);
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet54 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray53);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray46, (java.lang.Object[]) charSequenceArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray32, (java.lang.Object[]) charSequenceArray53);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "hi!", (java.lang.Object) charSequenceArray32);
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet64 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray63);
        java.lang.CharSequence[] charSequenceArray69 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet70 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray69);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray63, (java.lang.Object[]) charSequenceArray69);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray32, (java.lang.Object[]) charSequenceArray63);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) 0, (java.lang.Object) charSequenceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) charSequenceSet8, (java.lang.Object) 0);
        java.util.Set[] setArray76 = new java.util.Set[1];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[] charSequenceSetArray77 = (java.util.Set<java.lang.CharSequence>[]) setArray76;
        charSequenceSetArray77[0] = charSequenceSet8;
        java.util.Set<java.util.Set<java.lang.CharSequence>> charSequenceSetSet80 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) shortArray0, (java.lang.Object[]) charSequenceSetArray77);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1811");
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
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray35, (double) (byte) 100);
        double[] doubleArray42 = new double[] { ' ', (-1) };
        double[] doubleArray45 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray45, (double) 100L);
        double[] doubleArray51 = new double[] { ' ', (-1) };
        double[] doubleArray54 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray54, (double) 100L);
        double[] doubleArray59 = new double[] { ' ', (-1) };
        double[] doubleArray62 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray62, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray54, doubleArray59, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray59, (double) 1);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray15, doubleArray59, 1.0d);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1812");
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
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str25 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.badapples", (int) '4', numericDocValues28, numericDocValues29);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1813");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (long) (short) 0, 0L);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1814");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) 3, (long) 3);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1815");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) 10, (double) (short) 0);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1816");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) (byte) 1, (double) (byte) -1);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1817");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) (-1.0f), (double) 4, (double) 'a');
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1818");
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
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("random", (int) (byte) 100, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1819");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 'a', (long) (byte) 0);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1820");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray4, intArray8);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray13, intArray14);
        org.junit.Assert.assertArrayEquals("hi!", intArray8, intArray13);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray20, intArray21);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray24, intArray25);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray20, intArray24);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("hi!", intArray24, intArray29);
        org.junit.Assert.assertArrayEquals(intArray8, intArray29);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray37, intArray38);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray41, intArray42);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray37, intArray41);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray47, intArray48);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray51, intArray52);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray47, intArray51);
        org.junit.Assert.assertArrayEquals("random", intArray37, intArray47);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray58, intArray59);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray62, intArray63);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray58, intArray62);
        org.junit.Assert.assertArrayEquals(intArray47, intArray58);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray8, intArray58);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray71, intArray72);
        int[] intArray75 = new int[] {};
        int[] intArray76 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray75, intArray76);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray71, intArray75);
        int[] intArray80 = new int[] {};
        int[] intArray81 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray80, intArray81);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray71, intArray80);
        org.junit.Assert.assertArrayEquals(intArray58, intArray71);
        int[] intArray85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray58, intArray85);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1821");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) 2);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1822");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) (byte) -1);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1823");
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
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests18.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader20, 0, postingsEnum22, postingsEnum23);
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsEnumEquals("tests.monster", postingsEnum27, postingsEnum28, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) postingsEnum28);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1824");
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
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray19);
        java.lang.Object[] objArray27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) wildcardClassArray19, objArray27);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1825");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("<unknown>", indexReader8, 0, postingsEnum10, postingsEnum11, false);
        commonGramsTokenFilterFactoryTests1.tearDown();
        java.lang.Object obj15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests1, obj15);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1826");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray13 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling12 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray13);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests16.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests16);
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests16.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule19);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray13, (java.lang.Object) testRule19);
        java.util.Set<java.lang.Object> objSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) throttlingArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) objSet22);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1827");
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
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray8);
        java.util.Set<java.lang.Class<?>> wildcardClassSet15 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray8);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests17.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23);
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests17.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule25;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule25;
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals(charArray28, charArray32);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) testRule25, (java.lang.Object) charArray28);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) wildcardClassArray8, (java.lang.Object) charArray28);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        org.junit.Assert.assertArrayEquals(charArray48, charArray51);
        org.junit.Assert.assertArrayEquals("", charArray44, charArray48);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray62, charArray63);
        org.junit.Assert.assertArrayEquals(charArray60, charArray63);
        org.junit.Assert.assertArrayEquals("", charArray56, charArray60);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray48, charArray56);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray40, charArray56);
        char[] charArray70 = new char[] {};
        char[] charArray71 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray70, charArray71);
        char[] charArray73 = new char[] {};
        char[] charArray74 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray73, charArray74);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        org.junit.Assert.assertArrayEquals(charArray74, charArray77);
        org.junit.Assert.assertArrayEquals("", charArray70, charArray74);
        org.junit.Assert.assertArrayEquals("random", charArray56, charArray74);
        org.junit.Assert.assertArrayEquals(charArray28, charArray74);
        char[] charArray83 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray74, charArray83);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1828");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) -1, (float) 10L, (float) (byte) 10);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1829");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (byte) 100, 0.0d);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1830");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (double) 3, (double) 10L, (double) 10);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1831");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10, 0.0f, (float) (byte) 1);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1832");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals(charArray9, charArray12);
        org.junit.Assert.assertArrayEquals("", charArray5, charArray9);
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) charArray5);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1833");
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
        org.junit.Assert.assertArrayEquals(longArray62, longArray90);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1834");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 4, (double) 100.0f, 1.0d);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1835");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray6 = new java.util.Locale[] { locale1, locale3, locale5 };
        java.util.Set<java.util.Locale> localeSet7 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests10.setUp();
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet18 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray17);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet24 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray23);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray17, (java.lang.Object[]) charSequenceArray23);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests10, (java.lang.Object) charSequenceArray17);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet33 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray32);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet39 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray38);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray32, (java.lang.Object[]) charSequenceArray38);
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet46 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray38, (java.lang.Object[]) charSequenceArray45);
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet54 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray53);
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet60 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray59);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray53, (java.lang.Object[]) charSequenceArray59);
        java.lang.CharSequence[] charSequenceArray66 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet67 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray66);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray59, (java.lang.Object[]) charSequenceArray66);
        java.lang.CharSequence[] charSequenceArray74 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet75 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray74);
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet81 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray80);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray74, (java.lang.Object[]) charSequenceArray80);
        java.lang.CharSequence[] charSequenceArray87 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet88 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray87);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray80, (java.lang.Object[]) charSequenceArray87);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray66, (java.lang.Object[]) charSequenceArray87);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray45, (java.lang.Object[]) charSequenceArray87);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) charSequenceArray17, (java.lang.Object[]) charSequenceArray87);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray6, (java.lang.Object) "tests.monster");
        java.util.Set<java.util.Locale> localeSet94 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray6);
        java.util.Locale[] localeArray95 = new java.util.Locale[] {};
        java.util.Locale[][] localeArray96 = new java.util.Locale[][] { localeArray95 };
        java.util.Set<java.util.Locale[]> localeArraySet97 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray96);
        java.util.Set<java.util.Locale[]> localeArraySet98 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray96);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray6, (java.lang.Object[]) localeArray96);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1836");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        org.junit.Assert.assertArrayEquals(charArray6, charArray9);
        org.junit.Assert.assertArrayEquals("", charArray2, charArray6);
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
        org.junit.Assert.assertArrayEquals(charArray21, charArray24);
        org.junit.Assert.assertArrayEquals("", charArray17, charArray21);
        org.junit.Assert.assertArrayEquals(charArray14, charArray17);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        org.junit.Assert.assertArrayEquals(charArray35, charArray38);
        org.junit.Assert.assertArrayEquals("", charArray31, charArray35);
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
        org.junit.Assert.assertArrayEquals("", charArray43, charArray47);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray35, charArray43);
        org.junit.Assert.assertArrayEquals(charArray14, charArray43);
        org.junit.Assert.assertArrayEquals(charArray2, charArray14);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) charArray14);
        char[] charArray58 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray14, charArray58);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1837");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader6, (int) (byte) -1, postingsEnum8, postingsEnum9);
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        commonGramsTokenFilterFactoryTests3.assertTermsEquals("tests.failfast", indexReader14, terms15, terms16, true);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray22, intArray23);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray26, intArray27);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray22, intArray26);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray32, intArray33);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray36, intArray37);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray32, intArray36);
        org.junit.Assert.assertArrayEquals("random", intArray22, intArray32);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray43, intArray44);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray47, intArray48);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray43, intArray47);
        org.junit.Assert.assertArrayEquals(intArray32, intArray43);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) intArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) 100, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1838");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray2);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals("", shortArray12, shortArray14);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray21);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray14, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray19);
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
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray39);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray39);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests44 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests44.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader46, 0, postingsEnum48, postingsEnum49);
        commonGramsTokenFilterFactoryTests44.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests44.assertPositionsSkippingEquals("tests.weekly", indexReader53, (int) '#', postingsEnum55, postingsEnum56);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        commonGramsTokenFilterFactoryTests44.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader59, 0, postingsEnum61, postingsEnum62);
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        commonGramsTokenFilterFactoryTests44.assertDocsSkippingEquals("", indexReader65, (int) (short) -1, postingsEnum67, postingsEnum68, true);
        commonGramsTokenFilterFactoryTests44.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder72 = commonGramsTokenFilterFactoryTests44.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests44.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.Fields fields76 = null;
        org.apache.lucene.index.Fields fields77 = null;
        commonGramsTokenFilterFactoryTests44.assertFieldsEquals("tests.weekly", indexReader75, fields76, fields77, false);
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        commonGramsTokenFilterFactoryTests44.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader81, (int) (short) 0, postingsEnum83, postingsEnum84, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) shortArray39, (java.lang.Object) postingsEnum84);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1839");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 0.0f, (double) (byte) 100, (double) 1L);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1840");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) charSequenceArray8);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.weekly", indexReader13, (int) (short) 10, postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1841");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10, (float) 'a', 0.0f);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1842");
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
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("", indexReader22, (int) (short) 1, postingsEnum24, postingsEnum25);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1843");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 1L);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1844");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (short) 0, (double) '4');
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1845");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray20);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet28 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray27);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet36 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray35);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet42 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray41);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray35, (java.lang.Object[]) charSequenceArray41);
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet49 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray41, (java.lang.Object[]) charSequenceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray27, (java.lang.Object[]) charSequenceArray48);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "hi!", (java.lang.Object) charSequenceArray27);
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet59 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray58);
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet65 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray64);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray58, (java.lang.Object[]) charSequenceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray27, (java.lang.Object[]) charSequenceArray58);
        java.lang.CharSequence[] charSequenceArray74 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet75 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray74);
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet81 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray80);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray74, (java.lang.Object[]) charSequenceArray80);
        java.lang.CharSequence[] charSequenceArray88 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet89 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray88);
        java.lang.CharSequence[] charSequenceArray94 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet95 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray94);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray88, (java.lang.Object[]) charSequenceArray94);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray80, (java.lang.Object[]) charSequenceArray94);
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) charSequenceArray27, (java.lang.Object[]) charSequenceArray94);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) charSequenceArray94);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1846");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) 0);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1847");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        java.lang.String str5 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader7, terms8, terms9, true);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((-1));
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertArrayEquals(charArray20, charArray23);
        org.junit.Assert.assertArrayEquals("", charArray16, charArray20);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        org.junit.Assert.assertArrayEquals(charArray28, charArray31);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray20, charArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) (-1), (java.lang.Object) charArray20);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1848");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        org.junit.Assert.assertArrayEquals(charArray12, charArray15);
        org.junit.Assert.assertArrayEquals("", charArray8, charArray12);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals(charArray24, charArray27);
        org.junit.Assert.assertArrayEquals("", charArray20, charArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray12, charArray20);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray4, charArray20);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        org.junit.Assert.assertArrayEquals(charArray39, charArray42);
        org.junit.Assert.assertArrayEquals("", charArray35, charArray39);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals(charArray51, charArray54);
        org.junit.Assert.assertArrayEquals("", charArray47, charArray51);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray39, charArray47);
        org.junit.Assert.assertArrayEquals(charArray4, charArray39);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        char[] charArray65 = new char[] {};
        char[] charArray66 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray65, charArray66);
        char[] charArray68 = new char[] {};
        char[] charArray69 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray68, charArray69);
        char[] charArray71 = new char[] {};
        char[] charArray72 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray71, charArray72);
        org.junit.Assert.assertArrayEquals(charArray69, charArray72);
        org.junit.Assert.assertArrayEquals("", charArray65, charArray69);
        org.junit.Assert.assertArrayEquals(charArray62, charArray65);
        char[] charArray77 = new char[] {};
        char[] charArray78 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray77, charArray78);
        char[] charArray80 = new char[] {};
        char[] charArray81 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray80, charArray81);
        org.junit.Assert.assertArrayEquals(charArray78, charArray81);
        org.junit.Assert.assertArrayEquals("", charArray65, charArray81);
        org.junit.Assert.assertArrayEquals("", charArray4, charArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) charArray65);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1849");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray4, intArray8);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray13, intArray14);
        org.junit.Assert.assertArrayEquals("hi!", intArray8, intArray13);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray20, intArray21);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray24, intArray25);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray20, intArray24);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("hi!", intArray24, intArray29);
        org.junit.Assert.assertArrayEquals(intArray8, intArray29);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests35.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader37, 0, postingsEnum39, postingsEnum40);
        commonGramsTokenFilterFactoryTests35.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests35.assertPositionsSkippingEquals("tests.weekly", indexReader44, (int) '#', postingsEnum46, postingsEnum47);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests35.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader50, 0, postingsEnum52, postingsEnum53);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsSkippingEquals("", indexReader56, (int) (short) -1, postingsEnum58, postingsEnum59, true);
        commonGramsTokenFilterFactoryTests35.setUp();
        commonGramsTokenFilterFactoryTests35.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder64 = commonGramsTokenFilterFactoryTests35.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests35.tearDown();
        org.junit.rules.TestRule testRule66 = commonGramsTokenFilterFactoryTests35.ruleChain;
        org.junit.rules.TestRule testRule67 = commonGramsTokenFilterFactoryTests35.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests35);
        commonGramsTokenFilterFactoryTests35.setIndexWriterMaxDocs(100);
        java.lang.Class<?> wildcardClass71 = commonGramsTokenFilterFactoryTests35.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) intArray8, (java.lang.Object) wildcardClass71);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1850");
        byte[] byteArray0 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray5, byteArray9);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray15, byteArray16);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray16, byteArray19);
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
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray37);
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray37, byteArray46);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray5, byteArray37);
        byte[] byteArray52 = new byte[] {};
        byte[] byteArray53 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray52, byteArray53);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray56, byteArray57);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray53, byteArray56);
        byte[] byteArray63 = new byte[] {};
        byte[] byteArray64 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray63, byteArray64);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray67, byteArray68);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray64, byteArray68);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray74 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray73, byteArray74);
        byte[] byteArray77 = new byte[] {};
        byte[] byteArray78 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray77, byteArray78);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray74, byteArray77);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray68, byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray74);
        byte[] byteArray84 = new byte[] {};
        byte[] byteArray85 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray84, byteArray85);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray74, byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray74);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1851");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (byte) 0, (double) (short) 1);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1852");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (-1L));
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1853");
        float[] floatArray1 = null;
        float[] floatArray5 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray9 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray9, (float) 100L);
        float[] floatArray15 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray19 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray19, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray15, 1.0f);
        float[] floatArray28 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray32 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray32, (float) 100L);
        float[] floatArray38 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray42 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray42, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray38, 1.0f);
        float[] floatArray50 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray54 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray54, (float) 100L);
        float[] floatArray60 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray64 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray64, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray60, 1.0f);
        org.junit.Assert.assertArrayEquals("random", floatArray28, floatArray50, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray28, (float) 0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray1, floatArray5, 0.0f);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1854");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("<unknown>", (double) (short) -1, (double) 1, (double) (short) 100);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1855");
        int[] intArray1 = null;
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray6, intArray7);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray10, intArray11);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray6, intArray10);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray6, intArray15);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray22, intArray23);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray26, intArray27);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray22, intArray26);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray32, intArray33);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray36, intArray37);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray32, intArray36);
        org.junit.Assert.assertArrayEquals("random", intArray22, intArray32);
        org.junit.Assert.assertArrayEquals(intArray6, intArray22);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray44, intArray45);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray48, intArray49);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray44, intArray48);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray22, intArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray1, intArray22);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1856");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet5 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray4);
        java.lang.Object obj6 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests7.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests7.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader10, (int) (byte) -1, postingsEnum12, postingsEnum13);
        commonGramsTokenFilterFactoryTests7.tearDown();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests7.assertPositionsSkippingEquals("tests.weekly", indexReader17, (int) (byte) 1, postingsEnum19, postingsEnum20);
        org.junit.Assert.assertNotEquals(obj6, (java.lang.Object) commonGramsTokenFilterFactoryTests7);
        commonGramsTokenFilterFactoryTests7.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) charSequenceArray4, (java.lang.Object) commonGramsTokenFilterFactoryTests7);
        java.lang.Object obj26 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, 0, postingsEnum31, postingsEnum32);
        commonGramsTokenFilterFactoryTests27.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("tests.weekly", indexReader36, (int) '#', postingsEnum38, postingsEnum39);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader42, 0, postingsEnum44, postingsEnum45);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests27.assertDocsSkippingEquals("", indexReader48, (int) (short) -1, postingsEnum50, postingsEnum51, true);
        commonGramsTokenFilterFactoryTests27.setUp();
        commonGramsTokenFilterFactoryTests27.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests57 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests57.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests57.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests61 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests61.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests61.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader64, (int) (byte) -1, postingsEnum66, postingsEnum67);
        org.junit.rules.TestRule testRule69 = commonGramsTokenFilterFactoryTests61.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests61);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests57, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests57.setUp();
        commonGramsTokenFilterFactoryTests57.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        commonGramsTokenFilterFactoryTests57.assertDocsSkippingEquals("", indexReader75, 10, postingsEnum77, postingsEnum78, false);
        commonGramsTokenFilterFactoryTests57.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests57);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests84 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests84.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests84.setUp();
        java.lang.String str87 = commonGramsTokenFilterFactoryTests84.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests84);
        commonGramsTokenFilterFactoryTests84.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray90 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] { commonGramsTokenFilterFactoryTests27, commonGramsTokenFilterFactoryTests57, commonGramsTokenFilterFactoryTests84 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests> commonGramsTokenFilterFactoryTestsSet91 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray90);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet92 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray90);
        org.junit.Assert.assertNotEquals("tests.maxfailures", obj26, (java.lang.Object) commonGramsTokenFilterFactoryTestsArray90);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet94 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray90);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray4, (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray90);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1857");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) true);
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.nightly", indexReader17, fields18, fields19, true);
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests2.ruleChain;
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray28);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray35);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray42);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        org.junit.Assert.assertArrayEquals("", shortArray42, shortArray44);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray35, shortArray42);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray52);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray59);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray62);
        org.junit.Assert.assertArrayEquals("", shortArray59, shortArray61);
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray59, shortArray65);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray69);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals("", shortArray69, shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray50);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) shortArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) testRule22, (java.lang.Object) shortArray35);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1858");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, false);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet22 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray21);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray15, (java.lang.Object[]) charSequenceArray21);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray28);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray21, (java.lang.Object[]) charSequenceArray28);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet39 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray38);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet45 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray44);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray38, (java.lang.Object[]) charSequenceArray44);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet53 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray52);
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet59 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray58);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray52, (java.lang.Object[]) charSequenceArray58);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray44, (java.lang.Object[]) charSequenceArray58);
        java.lang.CharSequence[] charSequenceArray66 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet67 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray66);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) charSequenceArray44, (java.lang.Object[]) charSequenceArray66);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray28, (java.lang.Object[]) charSequenceArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) postingsEnum7, (java.lang.Object) charSequenceArray28);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1859");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests8.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests8.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) -1, postingsEnum13, postingsEnum14);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests8.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests8);
        commonGramsTokenFilterFactoryTests8.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests8.assertDocsEnumEquals("tests.monster", postingsEnum20, postingsEnum21, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) testRule6, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1860");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling4 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests8.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests8);
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests8.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule11);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray5, (java.lang.Object) testRule11);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray2, (java.lang.Object[]) throttlingArray5);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet22 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray21);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet28 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray27);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray21, (java.lang.Object[]) charSequenceArray27);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet35 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray27, (java.lang.Object[]) charSequenceArray34);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray42);
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet49 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray48);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray42, (java.lang.Object[]) charSequenceArray48);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray48, (java.lang.Object[]) charSequenceArray55);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray27, (java.lang.Object[]) charSequenceArray55);
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet65 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray64);
        java.lang.CharSequence[] charSequenceArray70 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet71 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray70);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray64, (java.lang.Object[]) charSequenceArray70);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray55, (java.lang.Object[]) charSequenceArray70);
        java.lang.CharSequence[] charSequenceArray79 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet80 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray79);
        java.lang.CharSequence[] charSequenceArray85 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet86 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray85);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray79, (java.lang.Object[]) charSequenceArray85);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray55, (java.lang.Object[]) charSequenceArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray5, (java.lang.Object[]) charSequenceArray55);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1861");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("<unknown>", indexReader7, 0, postingsEnum9, postingsEnum10, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder14 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.nightly", (int) (short) 100, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1862");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) 10, (double) (byte) 1, (double) 100L);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1863");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (short) 0, 1L);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1864");
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
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("", indexReader22, (int) (short) 1, postingsEnum24, postingsEnum25);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.nightly", indexReader28, (int) (short) -1, postingsEnum30, postingsEnum31, true);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum35, postingsEnum36, true);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum41, postingsEnum42);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1865");
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray5, intArray6);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray9, intArray10);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray5, intArray9);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray14, intArray15);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray5, intArray14);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray21, intArray22);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray21, intArray25);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray31, intArray32);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray35, intArray36);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray31, intArray35);
        org.junit.Assert.assertArrayEquals("random", intArray21, intArray31);
        org.junit.Assert.assertArrayEquals(intArray5, intArray21);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray43, intArray44);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray47, intArray48);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray43, intArray47);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray21, intArray47);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray55, intArray56);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray59, intArray60);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray55, intArray59);
        int[] intArray65 = new int[] {};
        int[] intArray66 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray65, intArray66);
        int[] intArray69 = new int[] {};
        int[] intArray70 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray69, intArray70);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray65, intArray69);
        org.junit.Assert.assertArrayEquals("random", intArray55, intArray65);
        int[] intArray76 = new int[] {};
        int[] intArray77 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray76, intArray77);
        int[] intArray80 = new int[] {};
        int[] intArray81 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray80, intArray81);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray76, intArray80);
        org.junit.Assert.assertArrayEquals(intArray65, intArray76);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray21, intArray76);
        int[] intArray86 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray21, intArray86);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1866");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) locale8);
        java.lang.String str10 = commonGramsTokenFilterFactoryTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1867");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("europarl.lines.txt.gz", indexReader15, terms16, terms17, false);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        commonGramsTokenFilterFactoryTests21.assertTermsEquals("", indexReader23, terms24, terms25, false);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests21.assertDocsEnumEquals("tests.weekly", postingsEnum29, postingsEnum30, false);
        commonGramsTokenFilterFactoryTests21.setIndexWriterMaxDocs((int) '#');
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests21);
        commonGramsTokenFilterFactoryTests21.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests21);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1868");
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
        org.junit.Assert.assertArrayEquals(charArray10, charArray13);
        org.junit.Assert.assertArrayEquals("", charArray6, charArray10);
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals(charArray24, charArray27);
        org.junit.Assert.assertArrayEquals("", charArray20, charArray24);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        org.junit.Assert.assertArrayEquals(charArray36, charArray39);
        org.junit.Assert.assertArrayEquals("", charArray32, charArray36);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray24, charArray32);
        org.junit.Assert.assertArrayEquals(charArray3, charArray32);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals(charArray51, charArray54);
        org.junit.Assert.assertArrayEquals("", charArray47, charArray51);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray62, charArray63);
        char[] charArray65 = new char[] {};
        char[] charArray66 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray65, charArray66);
        org.junit.Assert.assertArrayEquals(charArray63, charArray66);
        org.junit.Assert.assertArrayEquals("", charArray59, charArray63);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray51, charArray59);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray3, charArray59);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests72 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests72.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests72);
        org.junit.rules.TestRule testRule75 = commonGramsTokenFilterFactoryTests72.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        commonGramsTokenFilterFactoryTests72.assertDocsEnumEquals("tests.failfast", postingsEnum77, postingsEnum78, true);
        org.apache.lucene.index.IndexReader indexReader82 = null;
        org.apache.lucene.index.Fields fields83 = null;
        org.apache.lucene.index.Fields fields84 = null;
        commonGramsTokenFilterFactoryTests72.assertFieldsEquals("", indexReader82, fields83, fields84, false);
        commonGramsTokenFilterFactoryTests72.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule88 = commonGramsTokenFilterFactoryTests72.ruleChain;
        org.junit.rules.TestRule testRule89 = commonGramsTokenFilterFactoryTests72.ruleChain;
        org.apache.lucene.index.IndexReader indexReader91 = null;
        org.apache.lucene.index.Fields fields92 = null;
        org.apache.lucene.index.Fields fields93 = null;
        commonGramsTokenFilterFactoryTests72.assertFieldsEquals("tests.weekly", indexReader91, fields92, fields93, false);
        org.junit.rules.TestRule testRule96 = commonGramsTokenFilterFactoryTests72.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) charArray3, (java.lang.Object) commonGramsTokenFilterFactoryTests72);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1869");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (short) 0, (double) 'a', (double) (byte) -1);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1870");
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
        java.lang.String str15 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.slow", (int) '#', numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1871");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests16.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests16.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader19, (int) (byte) -1, postingsEnum21, postingsEnum22);
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests16.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests16);
        commonGramsTokenFilterFactoryTests16.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsEnumEquals("tests.monster", postingsEnum28, postingsEnum29, false);
        org.junit.Assert.assertNotEquals((java.lang.Object) testRule14, (java.lang.Object) postingsEnum28);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        commonGramsTokenFilterFactoryTests33.assertTermsEquals("", indexReader35, terms36, terms37, false);
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsEnumEquals("tests.weekly", postingsEnum41, postingsEnum42, false);
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsEnumEquals("tests.maxfailures", postingsEnum46, postingsEnum47, true);
        commonGramsTokenFilterFactoryTests33.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests33.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) testRule14, (java.lang.Object) commonGramsTokenFilterFactoryTests33);
        org.elasticsearch.common.settings.Settings.Builder builder53 = commonGramsTokenFilterFactoryTests33.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder54 = commonGramsTokenFilterFactoryTests33.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder55 = commonGramsTokenFilterFactoryTests33.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues58 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues59 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests33.assertDocValuesEquals("tests.badapples", (int) (byte) 1, numericDocValues58, numericDocValues59);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1872");
        java.lang.Object obj1 = null;
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
        java.lang.String str18 = commonGramsTokenFilterFactoryTests3.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", obj1, (java.lang.Object) str18);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1873");
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
        double[] doubleArray42 = new double[] { ' ', (-1) };
        double[] doubleArray45 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray45, (double) 100L);
        double[] doubleArray51 = new double[] { ' ', (-1) };
        double[] doubleArray54 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray54, (double) 100L);
        double[] doubleArray59 = new double[] { ' ', (-1) };
        double[] doubleArray62 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray62, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray54, doubleArray59, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray54, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray54, (double) '#');
        double[] doubleArray71 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray54, doubleArray71, (double) (-1L));
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1874");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("", shortArray5, shortArray7);
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray5, shortArray11);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray14);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals("", shortArray20, shortArray22);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray27);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray29);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray22, shortArray27);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray14, shortArray22);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals("", shortArray38, shortArray40);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray47);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray40, shortArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.monster", (java.lang.Object) shortArray45);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests54 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests54.setUp();
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet62 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray61);
        java.lang.CharSequence[] charSequenceArray67 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet68 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray67);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray61, (java.lang.Object[]) charSequenceArray67);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests54, (java.lang.Object) charSequenceArray61);
        commonGramsTokenFilterFactoryTests54.tearDown();
        org.junit.rules.TestRule testRule72 = commonGramsTokenFilterFactoryTests54.ruleChain;
        commonGramsTokenFilterFactoryTests54.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) "tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests54);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1875");
        short[] shortArray0 = new short[] {};
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        short[][] shortArray3 = new short[][] { shortArray0, shortArray1, shortArray2 };
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        short[][] shortArray7 = new short[][] { shortArray4, shortArray5, shortArray6 };
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        short[][] shortArray11 = new short[][] { shortArray8, shortArray9, shortArray10 };
        short[][][] shortArray12 = new short[][][] { shortArray3, shortArray7, shortArray11 };
        java.util.Set<short[][]> shortArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray12);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet27 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray26);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray26);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet34 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray26, (java.lang.Object[]) charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet42 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray41);
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet48 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray47);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray41, (java.lang.Object[]) charSequenceArray47);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet55 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray54);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray47, (java.lang.Object[]) charSequenceArray54);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray26, (java.lang.Object[]) charSequenceArray54);
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet64 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray63);
        java.lang.CharSequence[] charSequenceArray69 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet70 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray69);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray63, (java.lang.Object[]) charSequenceArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray54, (java.lang.Object[]) charSequenceArray69);
        java.lang.CharSequence[] charSequenceArray78 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet79 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray78);
        java.lang.CharSequence[] charSequenceArray84 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet85 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray84);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray78, (java.lang.Object[]) charSequenceArray84);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray54, (java.lang.Object[]) charSequenceArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) shortArray12, (java.lang.Object[]) charSequenceArray54);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1876");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) ' ', (long) (short) -1);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1877");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0f, (float) (-1L), 100.0f);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1878");
        java.lang.Object obj1 = null;
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        org.junit.Assert.assertNotSame(obj1, (java.lang.Object) shortArray3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, 0, postingsEnum14, postingsEnum15);
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", obj1, (java.lang.Object) builder18);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1879");
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
        java.lang.String str30 = commonGramsTokenFilterFactoryTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) str30);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1880");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.setUp();
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet11 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray10);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet17 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray16);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray10, (java.lang.Object[]) charSequenceArray16);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) charSequenceArray10);
        commonGramsTokenFilterFactoryTests3.tearDown();
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) (-1.0d), (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("tests.maxfailures", indexReader23, (int) (byte) 10, postingsEnum25, postingsEnum26, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) false);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1881");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("hi!", (int) '4', numericDocValues6, numericDocValues7);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1882");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) (byte) 1);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1883");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) 10);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1884");
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
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader33, 0, postingsEnum35, postingsEnum36);
        java.lang.Object obj38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests1, obj38);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1885");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 100, 0L);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1886");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) (byte) 100, (double) (-1.0f));
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1887");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) ' ');
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1888");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (byte) 100, (double) 1L, (double) 2);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1889");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum10, postingsEnum11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("<unknown>", indexReader15, terms16, terms17, true);
        java.lang.Class<?> wildcardClass20 = commonGramsTokenFilterFactoryTests1.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests21.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests21.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader24, (int) (byte) -1, postingsEnum26, postingsEnum27);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests21.assertFieldsEquals("random", indexReader30, fields31, fields32, false);
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests21.ruleChain;
        commonGramsTokenFilterFactoryTests21.tearDown();
        java.lang.String str37 = commonGramsTokenFilterFactoryTests21.getTestName();
        commonGramsTokenFilterFactoryTests21.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests21.assertPositionsSkippingEquals("hi!", indexReader40, (int) (short) 100, postingsEnum42, postingsEnum43);
        java.lang.String str45 = commonGramsTokenFilterFactoryTests21.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) str45);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1890");
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
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests0.ruleChain;
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet24 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray23);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet31 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray30);
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet37 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray36);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray30, (java.lang.Object[]) charSequenceArray36);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray23, (java.lang.Object[]) charSequenceArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1891");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (-1.0f));
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1892");
        double[] doubleArray3 = new double[] { ' ', (-1) };
        double[] doubleArray6 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 100L);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) doubleArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        commonGramsTokenFilterFactoryTests10.assertTermsEquals("", indexReader12, terms13, terms14, false);
        java.lang.String str17 = commonGramsTokenFilterFactoryTests10.getTestName();
        commonGramsTokenFilterFactoryTests10.setUp();
        java.lang.String str19 = commonGramsTokenFilterFactoryTests10.getTestName();
        commonGramsTokenFilterFactoryTests10.tearDown();
        double[] doubleArray25 = new double[] { ' ', (-1) };
        double[] doubleArray28 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray28, (double) 100L);
        double[] doubleArray34 = new double[] { ' ', (-1) };
        double[] doubleArray37 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray37, (double) 100L);
        double[] doubleArray42 = new double[] { ' ', (-1) };
        double[] doubleArray45 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray45, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray37, doubleArray42, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray42, (double) 1);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "<unknown>", (java.lang.Object) doubleArray42);
        double[] doubleArray55 = new double[] { ' ', (-1) };
        double[] doubleArray58 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray58, (double) 100L);
        double[] doubleArray64 = new double[] { ' ', (-1) };
        double[] doubleArray67 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray67, (double) 100L);
        double[] doubleArray72 = new double[] { ' ', (-1) };
        double[] doubleArray75 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray75, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray67, doubleArray72, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray72, (double) 1);
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray72, (double) (short) 10);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests10, (java.lang.Object) doubleArray72);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray72, (double) (short) 1);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1893");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", (double) 0.0f, (double) (byte) 0, (double) (short) -1);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1894");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", (double) (byte) 0, 0.0d, (double) 10.0f);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1895");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '#', (float) 100L, (float) (short) 1);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1896");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.weekly", indexReader11, (int) (byte) 1, postingsEnum13, postingsEnum14);
        org.junit.Assert.assertNotEquals(obj0, (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet24 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray23);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet30 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray29);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray23, (java.lang.Object[]) charSequenceArray29);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet39 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray38);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet45 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray44);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray38, (java.lang.Object[]) charSequenceArray44);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet53 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray52);
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet59 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray58);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray52, (java.lang.Object[]) charSequenceArray58);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray44, (java.lang.Object[]) charSequenceArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray23, (java.lang.Object[]) charSequenceArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) charSequenceArray58);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1897");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.String str5 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.tearDown();
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests2.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1898");
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
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) doubleArray22);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1899");
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
        java.lang.String str13 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1900");
        int[] intArray0 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray4, intArray8);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray13, intArray14);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray4, intArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray4);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1901");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) -1, (float) 100L, (float) (-1));
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1902");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) '#');
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1903");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, (double) 4, (double) 100);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1904");
        float[] floatArray0 = null;
        float[] floatArray6 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray10 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray10, (float) 100L);
        float[] floatArray16 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray20 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray20, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray16, 1.0f);
        float[] floatArray29 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray33 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray33, (float) 100L);
        float[] floatArray39 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray43 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray43, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray39, 1.0f);
        float[] floatArray51 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray55 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray55, (float) 100L);
        float[] floatArray61 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray65 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray61, floatArray65, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray61, 1.0f);
        java.lang.Object obj70 = new java.lang.Object();
        org.junit.Assert.assertNotEquals((java.lang.Object) floatArray61, obj70);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray29, floatArray61, 100.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray16, floatArray61, (float) 1L);
        float[] floatArray79 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray83 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray79, floatArray83, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray16, floatArray83, 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray16, (float) 2);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1905");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) 'a', (float) '#', (float) ' ');
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1906");
        java.lang.Object obj2 = new java.lang.Object();
        org.junit.Assert.assertNotEquals(obj2, (java.lang.Object) "");
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
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests5.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("random", obj2, (java.lang.Object) builder25);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, 0, postingsEnum31, postingsEnum32);
        commonGramsTokenFilterFactoryTests27.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("tests.weekly", indexReader36, (int) '#', postingsEnum38, postingsEnum39);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        commonGramsTokenFilterFactoryTests27.assertFieldsEquals("enwiki.random.lines.txt", indexReader42, fields43, fields44, true);
        commonGramsTokenFilterFactoryTests27.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests27.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule49 = commonGramsTokenFilterFactoryTests27.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests27);
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests27.assertDocsEnumEquals("", postingsEnum52, postingsEnum53, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests56 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        commonGramsTokenFilterFactoryTests56.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader58, 0, postingsEnum60, postingsEnum61);
        commonGramsTokenFilterFactoryTests56.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        commonGramsTokenFilterFactoryTests56.assertPositionsSkippingEquals("tests.weekly", indexReader65, (int) '#', postingsEnum67, postingsEnum68);
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        commonGramsTokenFilterFactoryTests56.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader71, 0, postingsEnum73, postingsEnum74);
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        commonGramsTokenFilterFactoryTests56.assertDocsSkippingEquals("", indexReader77, (int) (short) -1, postingsEnum79, postingsEnum80, true);
        commonGramsTokenFilterFactoryTests56.setUp();
        commonGramsTokenFilterFactoryTests56.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) true, (java.lang.Object) commonGramsTokenFilterFactoryTests56);
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests56.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum87, postingsEnum88);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1907");
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
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray24, byteArray25);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray28, byteArray29);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray25, byteArray29);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray34, byteArray35);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray38, byteArray39);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray35, byteArray38);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray29, byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray35);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray48, byteArray49);
        byte[] byteArray52 = new byte[] {};
        byte[] byteArray53 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray52, byteArray53);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray49, byteArray52);
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray59, byteArray60);
        byte[] byteArray63 = new byte[] {};
        byte[] byteArray64 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray63, byteArray64);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray60, byteArray64);
        byte[] byteArray69 = new byte[] {};
        byte[] byteArray70 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray69, byteArray70);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray74 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray73, byteArray74);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray70, byteArray73);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray64, byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray70);
        byte[] byteArray79 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray70, byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray70);
        byte[] byteArray82 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray70, byteArray82);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1908");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures6);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray8 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2, testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures7 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet9 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray8);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) testRuleIgnoreAfterMaxFailuresArray8, (java.lang.Object) charSequenceSet15);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        org.junit.Assert.assertNotEquals((java.lang.Object) 10L, (java.lang.Object) charSequenceSet23);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet35 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray34);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet41 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray40);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray34, (java.lang.Object[]) charSequenceArray40);
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet48 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray40, (java.lang.Object[]) charSequenceArray47);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet62 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray61);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray55, (java.lang.Object[]) charSequenceArray61);
        java.lang.CharSequence[] charSequenceArray68 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet69 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray61, (java.lang.Object[]) charSequenceArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray47, (java.lang.Object[]) charSequenceArray68);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "hi!", (java.lang.Object) charSequenceArray47);
        java.lang.CharSequence[] charSequenceArray78 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet79 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray78);
        java.lang.CharSequence[] charSequenceArray84 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet85 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray84);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray78, (java.lang.Object[]) charSequenceArray84);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray47, (java.lang.Object[]) charSequenceArray78);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) 0, (java.lang.Object) charSequenceArray47);
        org.junit.Assert.assertNotSame((java.lang.Object) charSequenceSet23, (java.lang.Object) 0);
        java.util.Set[] setArray91 = new java.util.Set[1];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[] charSequenceSetArray92 = (java.util.Set<java.lang.CharSequence>[]) setArray91;
        charSequenceSetArray92[0] = charSequenceSet23;
        java.util.Set<java.util.Set<java.lang.CharSequence>> charSequenceSetSet95 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray92);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray8, (java.lang.Object[]) charSequenceSetArray92);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1909");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        org.junit.Assert.assertArrayEquals(charArray12, charArray15);
        org.junit.Assert.assertArrayEquals("", charArray8, charArray12);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals(charArray24, charArray27);
        org.junit.Assert.assertArrayEquals("", charArray20, charArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray12, charArray20);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray4, charArray20);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals(charArray43, charArray46);
        org.junit.Assert.assertArrayEquals("", charArray39, charArray43);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals(charArray55, charArray58);
        org.junit.Assert.assertArrayEquals("", charArray51, charArray55);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray43, charArray51);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray35, charArray51);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray20, charArray35);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        org.junit.Assert.assertArrayEquals(charArray66, charArray70);
        char[] charArray73 = new char[] {};
        char[] charArray74 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray73, charArray74);
        char[] charArray77 = new char[] {};
        char[] charArray78 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray77, charArray78);
        char[] charArray80 = new char[] {};
        char[] charArray81 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray80, charArray81);
        char[] charArray83 = new char[] {};
        char[] charArray84 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray83, charArray84);
        org.junit.Assert.assertArrayEquals(charArray81, charArray84);
        org.junit.Assert.assertArrayEquals("", charArray77, charArray81);
        org.junit.Assert.assertArrayEquals(charArray74, charArray77);
        org.junit.Assert.assertArrayEquals("", charArray66, charArray74);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray35, charArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.slow");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1910");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) (short) 1);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1911");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests0.ruleChain;
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests37.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests37.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests41 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests41.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests41.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader44, (int) (byte) -1, postingsEnum46, postingsEnum47);
        org.junit.rules.TestRule testRule49 = commonGramsTokenFilterFactoryTests41.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests41);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests37, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests37.setUp();
        commonGramsTokenFilterFactoryTests37.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsSkippingEquals("", indexReader55, 10, postingsEnum57, postingsEnum58, false);
        commonGramsTokenFilterFactoryTests37.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests37);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests64 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests64.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests64.setUp();
        java.lang.String str67 = commonGramsTokenFilterFactoryTests64.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests64);
        commonGramsTokenFilterFactoryTests64.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray70 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] { commonGramsTokenFilterFactoryTests7, commonGramsTokenFilterFactoryTests37, commonGramsTokenFilterFactoryTests64 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests> commonGramsTokenFilterFactoryTestsSet71 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray70);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTestsArray70);
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum74, postingsEnum75);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1912");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) ' ');
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1913");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray19);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray28);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet35 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray34);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray28, (java.lang.Object[]) charSequenceArray34);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray42);
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet49 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray48);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray42, (java.lang.Object[]) charSequenceArray48);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray34, (java.lang.Object[]) charSequenceArray48);
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray19, (java.lang.Object) charSequenceArray34);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy53 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy54 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicy54, (java.lang.Object) 1.0f);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy57 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy58 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy59 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy60 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicy60, (java.lang.Object) 1.0f);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray63 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy53, queryCachingPolicy54, queryCachingPolicy57, queryCachingPolicy58, queryCachingPolicy59, queryCachingPolicy60 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray64 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray63 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet65 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) charSequenceArray34, (java.lang.Object[]) queryCachingPolicyArray64);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1914");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.awaitsfix", indexReader14, 1, postingsEnum16, postingsEnum17);
        commonGramsTokenFilterFactoryTests2.setUp();
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
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("enwiki.random.lines.txt", indexReader35, fields36, fields37, true);
        commonGramsTokenFilterFactoryTests20.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests20.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests20.ruleChain;
        commonGramsTokenFilterFactoryTests20.tearDown();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("tests.weekly", indexReader45, (int) 'a', postingsEnum47, postingsEnum48, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests51 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests51.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        commonGramsTokenFilterFactoryTests51.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader54, (int) (byte) -1, postingsEnum56, postingsEnum57);
        commonGramsTokenFilterFactoryTests51.tearDown();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        org.apache.lucene.index.Terms terms63 = null;
        commonGramsTokenFilterFactoryTests51.assertTermsEquals("hi!", indexReader61, terms62, terms63, true);
        org.elasticsearch.test.ESTokenStreamTestCase[] eSTokenStreamTestCaseArray66 = new org.elasticsearch.test.ESTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests2, commonGramsTokenFilterFactoryTests20, commonGramsTokenFilterFactoryTests51 };
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase> eSTokenStreamTestCaseSet67 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) eSTokenStreamTestCaseSet67);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1915");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1916");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray1 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet2 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests3.setUp();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) queryCachingPolicySet2, (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests8.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests8.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) -1, postingsEnum13, postingsEnum14);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests8.ruleChain;
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet22 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray21);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests8, (java.lang.Object) charSequenceArray21);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray24 = new org.apache.lucene.util.LuceneTestCase[] { commonGramsTokenFilterFactoryTests3, commonGramsTokenFilterFactoryTests8 };
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet25 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray24);
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray32 = new java.util.Locale[] { locale27, locale29, locale31 };
        java.util.Set<java.util.Locale> localeSet33 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray32);
        java.util.Set<java.lang.Cloneable> cloneableSet34 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) luceneTestCaseArray24, (java.lang.Object[]) localeArray32);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1917");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) true);
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests2.setUp();
        double[] doubleArray20 = new double[] { ' ', (-1) };
        double[] doubleArray23 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray23, (double) 100L);
        double[] doubleArray29 = new double[] { ' ', (-1) };
        double[] doubleArray32 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray32, (double) 100L);
        double[] doubleArray37 = new double[] { ' ', (-1) };
        double[] doubleArray40 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray40, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray32, doubleArray37, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray37, (double) 1);
        double[] doubleArray49 = new double[] { ' ', (-1) };
        double[] doubleArray52 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray52, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray52, (double) 100);
        double[] doubleArray61 = new double[] { ' ', (-1) };
        double[] doubleArray64 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray64, (double) 100L);
        double[] doubleArray70 = new double[] { ' ', (-1) };
        double[] doubleArray73 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray70, doubleArray73, (double) 100L);
        double[] doubleArray78 = new double[] { ' ', (-1) };
        double[] doubleArray81 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray78, doubleArray81, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray73, doubleArray78, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray78, (double) 1);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "<unknown>", (java.lang.Object) doubleArray78);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray20, doubleArray78, 0.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1918");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("tests.awaitsfix", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        double[] doubleArray15 = new double[] { ' ', (-1) };
        double[] doubleArray18 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray18, (double) 100L);
        double[] doubleArray24 = new double[] { ' ', (-1) };
        double[] doubleArray27 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray27, (double) 100L);
        double[] doubleArray32 = new double[] { ' ', (-1) };
        double[] doubleArray35 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray35, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray27, doubleArray32, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray32, (double) 1);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "<unknown>", (java.lang.Object) doubleArray32);
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
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray62, (double) (short) 10);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) doubleArray32);
        double[] doubleArray75 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray32, doubleArray75, 0.0d);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1919");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) (short) 1);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1920");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) '4');
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1921");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("", shortArray5, shortArray7);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray14);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray7, shortArray12);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray22);
        org.junit.Assert.assertArrayEquals("hi!", shortArray7, shortArray20);
        java.lang.Object obj27 = null;
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) shortArray20, obj27);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests29.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests29);
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests29.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsEnumEquals("tests.failfast", postingsEnum34, postingsEnum35, true);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        commonGramsTokenFilterFactoryTests29.assertFieldsEquals("", indexReader39, fields40, fields41, false);
        commonGramsTokenFilterFactoryTests29.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests29.ruleChain;
        org.junit.rules.TestRule testRule46 = commonGramsTokenFilterFactoryTests29.ruleChain;
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        commonGramsTokenFilterFactoryTests29.assertFieldsEquals("tests.weekly", indexReader48, fields49, fields50, false);
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests29.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj27, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1922");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 10.0d, (double) 0);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1923");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
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
        commonGramsTokenFilterFactoryTests2.setUp();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder31 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) testRuleIgnoreAfterMaxFailures1, (java.lang.Object) builder31);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder34 = commonGramsTokenFilterFactoryTests33.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests33.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests33, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests33.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests33.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests33.setUp();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests33.assertPositionsSkippingEquals("tests.failfast", indexReader42, 10, postingsEnum44, postingsEnum45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) builder31, (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1924");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.failfast", indexReader9, 10, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.slow", indexReader15, (int) ' ', postingsEnum17, postingsEnum18);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("<unknown>", indexReader22, (int) (short) 1, postingsEnum24, postingsEnum25);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, 0, postingsEnum31, postingsEnum32);
        commonGramsTokenFilterFactoryTests27.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("tests.weekly", indexReader36, (int) '#', postingsEnum38, postingsEnum39);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader42, 0, postingsEnum44, postingsEnum45);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests27.assertDocsSkippingEquals("", indexReader48, (int) (short) -1, postingsEnum50, postingsEnum51, true);
        commonGramsTokenFilterFactoryTests27.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder55 = commonGramsTokenFilterFactoryTests27.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests27.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        commonGramsTokenFilterFactoryTests27.assertFieldsEquals("tests.weekly", indexReader58, fields59, fields60, false);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests27.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader64, (int) (short) 0, postingsEnum66, postingsEnum67, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) 1, (java.lang.Object) commonGramsTokenFilterFactoryTests27);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1925");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 0.0d, (double) (byte) -1);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1926");
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
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray26, (float) (byte) 10);
        float[] floatArray38 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray42 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray42, (float) 100L);
        float[] floatArray48 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray52 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray52, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray48, 1.0f);
        java.lang.Object obj57 = new java.lang.Object();
        org.junit.Assert.assertNotEquals((java.lang.Object) floatArray48, obj57);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray48, (float) (byte) 10);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray63);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray65);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray70);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray70, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray72);
        short[] shortArray78 = new short[] {};
        short[] shortArray79 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray78, shortArray79);
        short[] shortArray81 = new short[] {};
        short[] shortArray82 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray81, shortArray82);
        org.junit.Assert.assertArrayEquals("", shortArray79, shortArray81);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray72, shortArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) floatArray4, (java.lang.Object) shortArray79);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1927");
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
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray14 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray4, throttlingArray7, throttlingArray10, throttlingArray13 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray14);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) throttlingArray14);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy17 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass18 = queryCachingPolicy17.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy19 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass20 = queryCachingPolicy19.getClass();
        java.lang.Class[] classArray22 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        wildcardClassArray23[0] = wildcardClass18;
        wildcardClassArray23[1] = wildcardClass20;
        java.util.Set<java.lang.Class<?>> wildcardClassSet28 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray23);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy29 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass30 = queryCachingPolicy29.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy31 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass32 = queryCachingPolicy31.getClass();
        java.lang.Class[] classArray34 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        wildcardClassArray35[0] = wildcardClass30;
        wildcardClassArray35[1] = wildcardClass32;
        java.util.Set<java.lang.Class<?>> wildcardClassSet40 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray23, (java.lang.Object[]) wildcardClassArray35);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) throttlingArray14, (java.lang.Object[]) wildcardClassArray35);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1928");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (-1L));
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1929");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) byteArray8, (java.lang.Object) 4);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1930");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.failfast", indexReader12, terms13, terms14, true);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("", indexReader19, (int) (byte) 100, postingsEnum21, postingsEnum22);
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
        commonGramsTokenFilterFactoryTests25.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests25, (java.lang.Object) "<unknown>");
        org.junit.rules.TestRule testRule49 = commonGramsTokenFilterFactoryTests25.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder50 = commonGramsTokenFilterFactoryTests25.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "", (java.lang.Object) builder50);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1931");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 0, (double) 10.0f);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1932");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, 0L);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1933");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) (byte) 10);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1934");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, 100.0d, (-1.0d));
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1935");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        java.lang.String str4 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.slow", indexReader9, fields10, fields11, false);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray17, intArray18);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray21, intArray22);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray17, intArray21);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray26, intArray27);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray17, intArray26);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray33, intArray34);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray37, intArray38);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray33, intArray37);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray42, intArray43);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray33, intArray42);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray49, intArray50);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray53, intArray54);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray49, intArray53);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray58, intArray59);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray49, intArray58);
        int[] intArray65 = new int[] {};
        int[] intArray66 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray65, intArray66);
        int[] intArray69 = new int[] {};
        int[] intArray70 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray69, intArray70);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray65, intArray69);
        int[] intArray75 = new int[] {};
        int[] intArray76 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray75, intArray76);
        int[] intArray79 = new int[] {};
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray79, intArray80);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray75, intArray79);
        org.junit.Assert.assertArrayEquals("random", intArray65, intArray75);
        org.junit.Assert.assertArrayEquals(intArray49, intArray65);
        org.junit.Assert.assertArrayEquals(intArray33, intArray65);
        org.junit.Assert.assertArrayEquals(intArray17, intArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) intArray17);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1936");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, 0.0d);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1937");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) 0L, 0.0d);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1938");
        java.util.Locale[] localeArray1 = new java.util.Locale[] {};
        java.util.Locale[][] localeArray2 = new java.util.Locale[][] { localeArray1 };
        java.util.Set<java.util.Locale[]> localeArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray2);
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet10 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray9);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray9, (java.lang.Object[]) charSequenceArray15);
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet25 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray24);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet31 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray30);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray24, (java.lang.Object[]) charSequenceArray30);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet39 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray38);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet45 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray44);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray38, (java.lang.Object[]) charSequenceArray44);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray30, (java.lang.Object[]) charSequenceArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray9, (java.lang.Object[]) charSequenceArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) localeArray2, (java.lang.Object[]) charSequenceArray44);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1939");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet12 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray11);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray11);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray11, (java.lang.Object[]) charSequenceArray18);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray28);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet35 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray34);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray28, (java.lang.Object[]) charSequenceArray34);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray42);
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet49 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray48);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray42, (java.lang.Object[]) charSequenceArray48);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray34, (java.lang.Object[]) charSequenceArray48);
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet57 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray56);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) charSequenceArray34, (java.lang.Object[]) charSequenceArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray56);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests61 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        commonGramsTokenFilterFactoryTests61.assertTermsEquals("", indexReader63, terms64, terms65, false);
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        commonGramsTokenFilterFactoryTests61.assertDocsEnumEquals("tests.weekly", postingsEnum69, postingsEnum70, false);
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        commonGramsTokenFilterFactoryTests61.assertDocsEnumEquals("tests.maxfailures", postingsEnum74, postingsEnum75, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests78 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder79 = commonGramsTokenFilterFactoryTests78.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) postingsEnum75, (java.lang.Object) commonGramsTokenFilterFactoryTests78);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling82 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray83 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling82 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet84 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray83);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling85 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray86 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling85 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet87 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray86);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests89 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests89.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests89);
        org.junit.rules.TestRule testRule92 = commonGramsTokenFilterFactoryTests89.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule92);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray86, (java.lang.Object) testRule92);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray83, (java.lang.Object[]) throttlingArray86);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests78, (java.lang.Object) throttlingArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) throttlingArray86);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1940");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) 4);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1941");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 100L, 0.0d, (double) (short) 1);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1942");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) (short) 1);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1943");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 0, (double) 10.0f);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1944");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (byte) 1, 0.0d);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1945");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (double) 10, (double) '4', (double) 'a');
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1946");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) '4');
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1947");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 0, (float) 4, (float) (short) -1);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1948");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) 10, (float) (short) -1, (float) (byte) 10);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1949");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) 10, (long) (byte) 1);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1950");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1951");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) 1L, (double) (byte) 100);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1952");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (byte) 1, (long) (short) 0);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1953");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.slow", (-1), numericDocValues10, numericDocValues11);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1954");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        org.junit.Assert.assertArrayEquals(charArray23, charArray26);
        org.junit.Assert.assertArrayEquals("", charArray19, charArray23);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        org.junit.Assert.assertArrayEquals(charArray35, charArray38);
        org.junit.Assert.assertArrayEquals("", charArray31, charArray35);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray23, charArray31);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray15, charArray31);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        org.junit.Assert.assertArrayEquals(charArray50, charArray53);
        org.junit.Assert.assertArrayEquals("", charArray46, charArray50);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        org.junit.Assert.assertArrayEquals(charArray62, charArray65);
        org.junit.Assert.assertArrayEquals("", charArray58, charArray62);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray50, charArray58);
        org.junit.Assert.assertArrayEquals(charArray15, charArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) charArray15);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1955");
        char[] charArray0 = null;
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
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals(charArray19, charArray22);
        org.junit.Assert.assertArrayEquals("", charArray15, charArray19);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals(charArray31, charArray34);
        org.junit.Assert.assertArrayEquals("", charArray27, charArray31);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray19, charArray27);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray11, charArray27);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        org.junit.Assert.assertArrayEquals(charArray50, charArray53);
        org.junit.Assert.assertArrayEquals("", charArray46, charArray50);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        org.junit.Assert.assertArrayEquals(charArray62, charArray65);
        org.junit.Assert.assertArrayEquals("", charArray58, charArray62);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray50, charArray58);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray42, charArray58);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray27, charArray42);
        org.junit.Assert.assertArrayEquals(charArray5, charArray27);
        char[] charArray73 = new char[] {};
        char[] charArray74 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray73, charArray74);
        char[] charArray77 = new char[] {};
        char[] charArray78 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray77, charArray78);
        char[] charArray80 = new char[] {};
        char[] charArray81 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray80, charArray81);
        char[] charArray83 = new char[] {};
        char[] charArray84 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray83, charArray84);
        org.junit.Assert.assertArrayEquals(charArray81, charArray84);
        org.junit.Assert.assertArrayEquals("", charArray77, charArray81);
        org.junit.Assert.assertArrayEquals(charArray74, charArray77);
        org.junit.Assert.assertArrayEquals(charArray5, charArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray5);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1956");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 0.0d, (double) (short) 1);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1957");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) 1, (float) 100L, 0.0f);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1958");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) 0);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1959");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (byte) 10, (double) '#');
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1960");
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
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1961");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (byte) -1, (-1.0d));
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1962");
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
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) testRule24, (java.lang.Object) (byte) 10);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray28 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet29 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray28);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests30.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests30.setUp();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) queryCachingPolicySet29, (java.lang.Object) commonGramsTokenFilterFactoryTests30);
        org.junit.Assert.assertNotSame((java.lang.Object) testRule24, (java.lang.Object) queryCachingPolicySet29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) queryCachingPolicySet29);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1963");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (-1L));
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1964");
        java.lang.Object obj0 = new java.lang.Object();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1965");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (short) 1, (long) '#');
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1966");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("enwiki.random.lines.txt", indexReader12, terms13, terms14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.monster", indexReader18, terms19, terms20, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests25.restoreIndexWriterMaxDocs();
        java.lang.String str27 = commonGramsTokenFilterFactoryTests25.getTestName();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests25);
        java.lang.Object obj29 = null;
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests25, obj29);
        commonGramsTokenFilterFactoryTests25.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) terms19, (java.lang.Object) commonGramsTokenFilterFactoryTests25);
        java.lang.Object obj34 = new java.lang.Object();
        org.junit.Assert.assertNotEquals(obj34, (java.lang.Object) "");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests37.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader39, 0, postingsEnum41, postingsEnum42);
        commonGramsTokenFilterFactoryTests37.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests37.assertPositionsSkippingEquals("tests.weekly", indexReader46, (int) '#', postingsEnum48, postingsEnum49);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        commonGramsTokenFilterFactoryTests37.assertFieldsEquals("enwiki.random.lines.txt", indexReader52, fields53, fields54, true);
        org.elasticsearch.common.settings.Settings.Builder builder57 = commonGramsTokenFilterFactoryTests37.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("random", obj34, (java.lang.Object) builder57);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests59 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests59.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader61, 0, postingsEnum63, postingsEnum64);
        commonGramsTokenFilterFactoryTests59.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        commonGramsTokenFilterFactoryTests59.assertPositionsSkippingEquals("tests.weekly", indexReader68, (int) '#', postingsEnum70, postingsEnum71);
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.Fields fields75 = null;
        org.apache.lucene.index.Fields fields76 = null;
        commonGramsTokenFilterFactoryTests59.assertFieldsEquals("enwiki.random.lines.txt", indexReader74, fields75, fields76, true);
        commonGramsTokenFilterFactoryTests59.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests59.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule81 = commonGramsTokenFilterFactoryTests59.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests59);
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        commonGramsTokenFilterFactoryTests59.assertDocsEnumEquals("", postingsEnum84, postingsEnum85, true);
        commonGramsTokenFilterFactoryTests59.setIndexWriterMaxDocs(1);
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) terms19, (java.lang.Object) commonGramsTokenFilterFactoryTests59);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1967");
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
        java.lang.Class<?> wildcardClass24 = commonGramsTokenFilterFactoryTests2.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder27 = commonGramsTokenFilterFactoryTests26.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests26.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests26, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests26.restoreIndexWriterMaxDocs();
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests26, (java.lang.Object) locale33);
        java.lang.String str35 = commonGramsTokenFilterFactoryTests26.getTestName();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder38 = commonGramsTokenFilterFactoryTests37.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests39.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests39.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader42, (int) (byte) -1, postingsEnum44, postingsEnum45);
        org.junit.rules.TestRule testRule47 = commonGramsTokenFilterFactoryTests39.ruleChain;
        commonGramsTokenFilterFactoryTests39.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests37, (java.lang.Object) (short) 10);
        commonGramsTokenFilterFactoryTests37.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests37);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1968");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) (byte) 100);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1969");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) 0, (double) (short) 0, (double) 2);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1970");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (-1L), (long) (-1));
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1971");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) '4', (double) 10, (double) 1);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1972");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, 1.0f, (float) (short) -1);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1973");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) (byte) 0);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1974");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1.0f, (double) 10.0f, (double) (short) 100);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1975");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 100L, (long) (short) -1);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1976");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests48 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests48.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests48.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) byteArray17, (java.lang.Object) commonGramsTokenFilterFactoryTests48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) byteArray17);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1977");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) '#');
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1978");
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
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(100);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests15.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21);
        commonGramsTokenFilterFactoryTests15.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests15.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests15.setUp();
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1979");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotNull((java.lang.Object) locale2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests5.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) (byte) -1, postingsEnum10, postingsEnum11);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests5.ruleChain;
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests5, (java.lang.Object) charSequenceArray18);
        org.junit.Assert.assertNotEquals((java.lang.Object) locale2, (java.lang.Object) charSequenceArray18);
        java.util.Set[][] setArray23 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray24 = (java.util.Set<java.lang.CharSequence>[][]) setArray23;
        java.util.Set[][] setArray26 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray27 = (java.util.Set<java.lang.CharSequence>[][]) setArray26;
        java.util.Set[][] setArray29 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray30 = (java.util.Set<java.lang.CharSequence>[][]) setArray29;
        java.util.Set[][] setArray32 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray33 = (java.util.Set<java.lang.CharSequence>[][]) setArray32;
        java.util.Set[][][] setArray35 = new java.util.Set[4][][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][][] charSequenceSetArray36 = (java.util.Set<java.lang.CharSequence>[][][]) setArray35;
        charSequenceSetArray36[0] = charSequenceSetArray24;
        charSequenceSetArray36[1] = charSequenceSetArray27;
        charSequenceSetArray36[2] = charSequenceSetArray30;
        charSequenceSetArray36[3] = charSequenceSetArray33;
        java.util.Set<java.util.Set<java.lang.CharSequence>[][]> charSequenceSetArraySet45 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray36);
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet52 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray51);
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet58 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray57);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray51, (java.lang.Object[]) charSequenceArray57);
        org.junit.Assert.assertNotSame((java.lang.Object) charSequenceSetArray36, (java.lang.Object) charSequenceArray57);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceSetArray36);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1980");
        float[] floatArray0 = null;
        float[] floatArray4 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray8 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray8, (float) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray8, (float) 3);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1981");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) (byte) 10);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1982");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (short) -1, (double) (byte) 100, 100.0d);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1983");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) '4', (double) 10L);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1984");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet14 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray13);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) charSequenceArray20);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests23.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests23.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests23, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests23.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests23.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        commonGramsTokenFilterFactoryTests23.assertTermsEquals("", indexReader31, terms32, terms33, false);
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray13, (java.lang.Object) terms33);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray42);
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet49 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray48);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray42, (java.lang.Object[]) charSequenceArray48);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray48, (java.lang.Object[]) charSequenceArray55);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests58 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder59 = commonGramsTokenFilterFactoryTests58.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests58.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests58, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests58.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests58.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        commonGramsTokenFilterFactoryTests58.assertTermsEquals("", indexReader66, terms67, terms68, false);
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray48, (java.lang.Object) terms68);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) charSequenceArray48);
        char[][][][] charArray73 = new char[][][][] {};
        java.util.Set<char[][][]> charArraySet74 = org.apache.lucene.util.LuceneTestCase.asSet(charArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) charArray73);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1985");
        double[] doubleArray6 = new double[] { (short) 1, 0.0d, (short) -1, (-1.0d), 0.0d };
        double[] doubleArray12 = new double[] { (short) 1, 0.0d, (short) -1, (-1.0d), 0.0d };
        double[][] doubleArray13 = new double[][] { doubleArray6, doubleArray12 };
        java.util.Set<double[]> doubleArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray13);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy15 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass16 = queryCachingPolicy15.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy17 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass18 = queryCachingPolicy17.getClass();
        java.lang.Class[] classArray20 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        wildcardClassArray21[0] = wildcardClass16;
        wildcardClassArray21[1] = wildcardClass18;
        java.util.Set<java.lang.Class<?>> wildcardClassSet26 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray21);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray21);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) doubleArray13, (java.lang.Object[]) wildcardClassArray21);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1986");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.monster", postingsEnum13, postingsEnum14, false);
        java.lang.String str17 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests18.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, (int) (byte) -1, postingsEnum23, postingsEnum24);
        commonGramsTokenFilterFactoryTests18.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        commonGramsTokenFilterFactoryTests18.assertTermsEquals("enwiki.random.lines.txt", indexReader29, terms30, terms31, false);
        commonGramsTokenFilterFactoryTests18.setUp();
        commonGramsTokenFilterFactoryTests18.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1987");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 0, 100.0f, (float) (byte) 10);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1988");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) '4', (double) 0L);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1989");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        org.junit.Assert.assertArrayEquals(charArray8, charArray11);
        org.junit.Assert.assertArrayEquals("", charArray4, charArray8);
        org.junit.Assert.assertArrayEquals(charArray1, charArray4);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals(charArray22, charArray25);
        org.junit.Assert.assertArrayEquals("", charArray18, charArray22);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        org.junit.Assert.assertArrayEquals(charArray34, charArray37);
        org.junit.Assert.assertArrayEquals("", charArray30, charArray34);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray22, charArray30);
        org.junit.Assert.assertArrayEquals(charArray1, charArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray1);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1990");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) 3);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1991");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) (-1), 100.0f, 100.0f);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1992");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader7, (int) (byte) -1, postingsEnum9, postingsEnum10);
        commonGramsTokenFilterFactoryTests4.tearDown();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("tests.weekly", indexReader14, (int) (byte) 1, postingsEnum16, postingsEnum17);
        java.lang.String str19 = commonGramsTokenFilterFactoryTests4.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder20 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests22.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader24, 0, postingsEnum26, postingsEnum27);
        commonGramsTokenFilterFactoryTests22.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests22.assertPositionsSkippingEquals("tests.weekly", indexReader31, (int) '#', postingsEnum33, postingsEnum34);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests22.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader37, 0, postingsEnum39, postingsEnum40);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests22.assertDocsSkippingEquals("", indexReader43, (int) (short) -1, postingsEnum45, postingsEnum46, true);
        commonGramsTokenFilterFactoryTests22.setUp();
        commonGramsTokenFilterFactoryTests22.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder51 = commonGramsTokenFilterFactoryTests22.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests22.tearDown();
        java.lang.String str53 = commonGramsTokenFilterFactoryTests22.getTestName();
        commonGramsTokenFilterFactoryTests22.tearDown();
        commonGramsTokenFilterFactoryTests22.setIndexWriterMaxDocs(10);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests4);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1993");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) 0, (double) (-1L), (double) 1L);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1994");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (double) 1, (-1.0d), (double) 10);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1995");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) charSequenceArray8);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray14 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling12, throttling13 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling15 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling15, throttling16 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling18, throttling19 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling21, throttling22 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray14, throttlingArray17, throttlingArray20, throttlingArray23 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArraySet25 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray24);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) throttlingArray24);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) throttlingArray24);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1996");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals(charArray9, charArray12);
        org.junit.Assert.assertArrayEquals("", charArray5, charArray9);
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet24 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray23);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet31 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray30);
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet37 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray36);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray30, (java.lang.Object[]) charSequenceArray36);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet44 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray36, (java.lang.Object[]) charSequenceArray43);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) charSequenceArray23, (java.lang.Object[]) charSequenceArray36);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet55 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray54);
        java.lang.CharSequence[] charSequenceArray60 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet61 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray60);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray54, (java.lang.Object[]) charSequenceArray60);
        java.lang.CharSequence[] charSequenceArray68 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet69 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray68);
        java.lang.CharSequence[] charSequenceArray74 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet75 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray74);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray68, (java.lang.Object[]) charSequenceArray74);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray60, (java.lang.Object[]) charSequenceArray74);
        java.lang.CharSequence[] charSequenceArray82 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet83 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray82);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) charSequenceArray60, (java.lang.Object[]) charSequenceArray82);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) charSequenceArray36, (java.lang.Object[]) charSequenceArray82);
        java.lang.Class<?> wildcardClass86 = charSequenceArray36.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) charArray5, (java.lang.Object) charSequenceArray36);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1997");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        java.lang.String str4 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(0);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 1);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests12.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests12.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests12.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests12.setUp();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests12.ruleChain;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests12.assertFieldsEquals("tests.badapples", indexReader19, fields20, fields21, true);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsEnumEquals("", postingsEnum25, postingsEnum26, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) postingsEnum25);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1998");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray2, byteArray3);
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
        commonGramsTokenFilterFactoryTests5.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests5.tearDown();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests5);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        commonGramsTokenFilterFactoryTests5.assertTermsEquals("hi!", indexReader29, terms30, terms31, false);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        commonGramsTokenFilterFactoryTests5.assertFieldsEquals("random", indexReader35, fields36, fields37, false);
        org.junit.Assert.assertNotEquals((java.lang.Object) byteArray2, (java.lang.Object) "random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) byteArray2);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1999");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10L, 100.0f, (float) (-1L));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test2000");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, 0.0d);
    }
}

