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
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals(charArray9, charArray12);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray5, charArray12);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests16.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsEnumEquals("tests.awaitsfix", postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        commonGramsTokenFilterFactoryTests16.assertTermsEquals("europarl.lines.txt.gz", indexReader24, terms25, terms26, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray12, (java.lang.Object) true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) "tests.slow");
        java.lang.String str8 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule9;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests11.assertFieldsEquals("random", indexReader13, fields14, fields15, false);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests11.ruleChain;
        commonGramsTokenFilterFactoryTests11.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests11.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, (int) (short) 1, postingsEnum23, postingsEnum24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests11.assertFieldsEquals("<unknown>", indexReader27, fields28, fields29, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) testRule9, (java.lang.Object) commonGramsTokenFilterFactoryTests11);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
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
        double[] doubleArray22 = new double[] { (byte) 1, '#' };
        double[] doubleArray25 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray25, (double) 100L);
        double[] doubleArray30 = new double[] { (byte) 1, '#' };
        double[] doubleArray33 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray33, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray33, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) terms17, (java.lang.Object) 100.0f);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (short) 1, (long) (byte) -1);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) testRuleIgnoreAfterMaxFailures2);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) (-1), 0.0f, (float) (-1));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (-1L), (long) (short) 0);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) ' ', (-1L));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { 1, 0.0f, 1.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray4, (float) ' ');
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray5);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        float[] floatArray3 = new float[] { (-1.0f), 1L };
        float[] floatArray9 = new float[] { (byte) 100, 0L, (byte) 0, (-1L), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray3, floatArray9, (float) '4');
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        java.lang.String str8 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        java.lang.String str10 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests13.assertFieldsEquals("random", indexReader15, fields16, fields17, false);
        commonGramsTokenFilterFactoryTests13.tearDown();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests13.assertPositionsSkippingEquals("tests.slow", indexReader22, (int) '4', postingsEnum24, postingsEnum25);
        java.lang.String str27 = commonGramsTokenFilterFactoryTests13.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests13);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy30 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy31 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray32 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy30, queryCachingPolicy31 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet33 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray32);
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy36 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy37 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray38 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy36, queryCachingPolicy37 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet39 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray38);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy40 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy41 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray42 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy40, queryCachingPolicy41 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet43 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray42);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet44 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray38, (java.lang.Object[]) queryCachingPolicyArray42);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet46 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray38);
        org.junit.Assert.assertNotEquals((java.lang.Object) locale35, (java.lang.Object) queryCachingPolicyArray38);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) queryCachingPolicyArray32, (java.lang.Object[]) queryCachingPolicyArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) queryCachingPolicyArray32);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (-1L));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        float[] floatArray6 = new float[] { (short) 0, ' ', 1, (byte) 1, 'a' };
        float[] floatArray7 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray6, floatArray7, (float) (byte) 0);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        short[] shortArray4 = new short[] { (short) -1, (short) 100, (short) 0, (short) -1 };
        short[] shortArray9 = new short[] { (short) 0, (byte) 1, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray9);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 1.0f);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0, throttling1, throttling2, throttling3 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet27 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) charSequenceArray26);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray26);
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet37 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray36);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet44 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray36, (java.lang.Object[]) charSequenceArray43);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray4, (java.lang.Object[]) charSequenceArray43);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        java.lang.Object obj0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) 10.0f);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        float[] floatArray6 = new float[] { 2, (-1.0f), (-1), 100.0f, (-1.0f), (short) -1 };
        float[] floatArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) (short) 0);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
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
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("", indexReader14, terms15, terms16, true);
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray2, intArray6);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray12, intArray13);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray16, intArray17);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray12, intArray16);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray24, intArray25);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        commonGramsTokenFilterFactoryTests27.assertFieldsEquals("random", indexReader29, fields30, fields31, false);
        java.lang.String str34 = commonGramsTokenFilterFactoryTests27.getTestName();
        commonGramsTokenFilterFactoryTests27.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("<unknown>", indexReader37, (int) (byte) 10, postingsEnum39, postingsEnum40);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray25, (java.lang.Object) commonGramsTokenFilterFactoryTests27);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray25);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray46, intArray47);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray50, intArray51);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray46, intArray50);
        org.junit.Assert.assertArrayEquals(intArray25, intArray50);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray57, intArray58);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray62, intArray63);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray66, intArray67);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray62, intArray66);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray57, intArray66);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray25, intArray57);
        org.junit.Assert.assertArrayEquals(intArray16, intArray25);
        org.junit.Assert.assertArrayEquals(intArray2, intArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray16);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 2, (double) (short) -1, (-1.0d));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
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
        commonGramsTokenFilterFactoryTests5.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests5);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        float[] floatArray4 = new float[] { (byte) -1, (byte) -1, '#', 0L };
        float[] floatArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray5, 10.0f);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray3 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray1, longArray3);
        long[] longArray7 = new long[] { (byte) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray7);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("random", indexReader12, fields13, fields14, false);
        commonGramsTokenFilterFactoryTests10.tearDown();
        commonGramsTokenFilterFactoryTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) builder9, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("random", indexReader22, fields23, fields24, false);
        java.lang.String str27 = commonGramsTokenFilterFactoryTests20.getTestName();
        commonGramsTokenFilterFactoryTests20.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests20.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests10, (java.lang.Object) commonGramsTokenFilterFactoryTests20);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests31.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum34, postingsEnum35, false);
        java.lang.String str38 = commonGramsTokenFilterFactoryTests31.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsEnumEquals("tests.awaitsfix", postingsEnum40, postingsEnum41, true);
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests10, (java.lang.Object) postingsEnum41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) "");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        long[] longArray3 = new long[] { (short) -1 };
        long[] longArray5 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        long[] longArray8 = new long[] { (short) -1 };
        long[] longArray10 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray8, longArray10);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray5, longArray10);
        long[] longArray13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray10, longArray13);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        float[] floatArray3 = new float[] { (-1.0f), (byte) 1, (short) 1 };
        float[] floatArray9 = new float[] { 100, (short) 10, (-1), 0.0f, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray9, (float) (byte) -1);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) charSequenceArray14);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray14);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet27 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray26);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet34 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet41 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray33, (java.lang.Object[]) charSequenceArray40);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray26, (java.lang.Object[]) charSequenceArray40);
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet51 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray50);
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet58 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray50, (java.lang.Object[]) charSequenceArray57);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray26, (java.lang.Object[]) charSequenceArray57);
        java.lang.CharSequence[] charSequenceArray67 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet68 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray67);
        java.lang.CharSequence[] charSequenceArray74 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet75 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray74);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray67, (java.lang.Object[]) charSequenceArray74);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray74);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) charSequenceArray74);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray26, (java.lang.Object[]) charSequenceArray74);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) charSequenceArray26);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
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
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals(charArray18, charArray21);
        char[] charArray24 = new char[] {};
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals(charArray27, charArray30);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        org.junit.Assert.assertArrayEquals(charArray34, charArray37);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray30, charArray37);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals(charArray42, charArray45);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray51);
        org.junit.Assert.assertArrayEquals(charArray42, charArray48);
        org.junit.Assert.assertArrayEquals(charArray30, charArray48);
        org.junit.Assert.assertArrayEquals(charArray24, charArray30);
        org.junit.Assert.assertArrayEquals(charArray21, charArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) baseTokenStreamTestCaseArray15, (java.lang.Object) charArray30);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte[] byteArray2 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 100, (-1.0d), (double) (byte) 10);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        double[] doubleArray4 = new double[] { (byte) 1, '#' };
        double[] doubleArray7 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 100L);
        double[] doubleArray12 = new double[] { (byte) 1, '#' };
        double[] doubleArray15 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray12, (double) (byte) 100);
        org.junit.Assert.assertNotEquals((java.lang.Object) doubleArray12, (java.lang.Object) 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) (byte) 10, (java.lang.Object) 1L);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 10 };
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray5, byteArray10);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (byte) -1);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule9;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule9;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder13 = commonGramsTokenFilterFactoryTests12.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder13, (java.lang.Object) 100.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests17.assertFieldsEquals("random", indexReader19, fields20, fields21, false);
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests17.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) builder24);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray26 = new org.elasticsearch.common.settings.Settings.Builder[] { builder13, builder24 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet27 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray26);
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet28 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) testRule9, (java.lang.Object) builderArray26);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
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
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests18.assertDocValuesEquals("random", (int) (short) 100, numericDocValues37, numericDocValues38);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray2, byteArray8);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        java.lang.Object obj0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) testRule34);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10L, (float) (-1L), (float) (short) 10);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 100, 0.0d, (double) 100);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("random", indexReader6, fields7, fields8, false);
        java.lang.String str11 = commonGramsTokenFilterFactoryTests4.getTestName();
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) "tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        org.elasticsearch.common.settings.Settings.Builder builder14 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        java.lang.Object[] objArray0 = null;
        java.util.Set[] setArray2 = new java.util.Set[0];
        @SuppressWarnings("unchecked")
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseSetArray3 = (java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray2;
        java.util.Set<java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseSetSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) setArray2);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, 0L);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests30.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests30.assertDocsEnumEquals("tests.awaitsfix", postingsEnum33, postingsEnum34, false);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        commonGramsTokenFilterFactoryTests30.assertTermsEquals("tests.nightly", indexReader38, terms39, terms40, false);
        commonGramsTokenFilterFactoryTests30.tearDown();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests30);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        commonGramsTokenFilterFactoryTests46.assertFieldsEquals("random", indexReader48, fields49, fields50, false);
        org.elasticsearch.common.settings.Settings.Builder builder53 = commonGramsTokenFilterFactoryTests46.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests46, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests46.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule58 = commonGramsTokenFilterFactoryTests46.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests59 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests59.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        commonGramsTokenFilterFactoryTests59.assertDocsEnumEquals("tests.awaitsfix", postingsEnum62, postingsEnum63, false);
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        commonGramsTokenFilterFactoryTests59.assertTermsEquals("tests.nightly", indexReader67, terms68, terms69, false);
        commonGramsTokenFilterFactoryTests59.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests46, (java.lang.Object) commonGramsTokenFilterFactoryTests59);
        org.elasticsearch.common.settings.Settings.Builder builder74 = commonGramsTokenFilterFactoryTests46.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests46);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray3 = new byte[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray1, byteArray3);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) (byte) -1);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder1, (java.lang.Object) 100.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests5.assertFieldsEquals("random", indexReader7, fields8, fields9, false);
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests5.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) builder12);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray14 = new org.elasticsearch.common.settings.Settings.Builder[] { builder1, builder12 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet15 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray14);
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet16 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray14);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests18.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests18.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests31.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsEnumEquals("tests.awaitsfix", postingsEnum34, postingsEnum35, false);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        commonGramsTokenFilterFactoryTests31.assertTermsEquals("tests.nightly", indexReader39, terms40, terms41, false);
        commonGramsTokenFilterFactoryTests31.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) commonGramsTokenFilterFactoryTests31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) builderArray14, (java.lang.Object) "");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
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
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum30, postingsEnum31);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.nightly", indexReader9, terms10, terms11, false);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) 1);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3, throttling4, throttling5 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray6);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray12, intArray13);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray17, intArray18);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray21, intArray22);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray17, intArray21);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray12, intArray21);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray28, intArray29);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray32, intArray33);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray28, intArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray32, (java.lang.Object) 2);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray40, intArray41);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray44, intArray45);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray40, intArray44);
        org.junit.Assert.assertArrayEquals(intArray32, intArray44);
        org.junit.Assert.assertArrayEquals(intArray21, intArray44);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray6, (java.lang.Object) intArray21);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy52 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy53 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray54 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy52, queryCachingPolicy53 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet55 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray54);
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy58 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy59 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray60 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy58, queryCachingPolicy59 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet61 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray60);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy62 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy63 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray64 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy62, queryCachingPolicy63 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet65 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray64);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet66 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray60, (java.lang.Object[]) queryCachingPolicyArray64);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet68 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray60);
        org.junit.Assert.assertNotEquals((java.lang.Object) locale57, (java.lang.Object) queryCachingPolicyArray60);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) queryCachingPolicyArray54, (java.lang.Object[]) queryCachingPolicyArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) throttlingArray6, (java.lang.Object[]) queryCachingPolicyArray54);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests8.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests16.assertFieldsEquals("random", indexReader18, fields19, fields20, false);
        commonGramsTokenFilterFactoryTests16.tearDown();
        commonGramsTokenFilterFactoryTests16.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) builder15, (java.lang.Object) commonGramsTokenFilterFactoryTests16);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) builder15);
        java.lang.Object obj27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, obj27);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("europarl.lines.txt.gz", false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        byte[] byteArray2 = new byte[] { (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray2, byteArray9);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
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
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests17.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder32 = commonGramsTokenFilterFactoryTests31.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests17, (java.lang.Object) builder32);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        short[] shortArray3 = new short[] { (byte) 10, (byte) 100, (byte) -1 };
        short[] shortArray4 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 0, 0.0d, (double) 10L);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
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
        double[] doubleArray30 = new double[] { (byte) 1, '#' };
        double[] doubleArray33 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray33, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray33, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray25, (double) 100);
        double[] doubleArray43 = new double[] { (byte) 1, '#' };
        double[] doubleArray46 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray46, (double) 100L);
        double[] doubleArray51 = new double[] { (byte) 1, '#' };
        double[] doubleArray54 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray54, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray54, (double) 100.0f);
        double[] doubleArray61 = new double[] { (byte) 1, '#' };
        double[] doubleArray64 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray64, (double) 100L);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray46, doubleArray64, 100.0d);
        double[] doubleArray71 = new double[] { (byte) 1, '#' };
        double[] doubleArray74 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray71, doubleArray74, (double) 100L);
        double[] doubleArray79 = new double[] { (byte) 1, '#' };
        double[] doubleArray82 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray79, doubleArray82, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray74, doubleArray82, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray74, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray7, doubleArray64, (double) 100L);
        double[] doubleArray91 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", doubleArray64, doubleArray91, (double) 100.0f);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray7, byteArray10);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        short[] shortArray5 = new short[] { (byte) 100, (short) 0, (short) 100, (byte) 100 };
        short[] shortArray6 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray5, shortArray6);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        long[] longArray1 = new long[] {};
        long[] longArray8 = new long[] { ' ', (short) 1, 0, 100, 10L, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray1, longArray8);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (-1L));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (long) (short) 1, 1L);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) 10L, (double) 0);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 1, (long) (-1));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests21.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests21.assertDocsEnumEquals("tests.awaitsfix", postingsEnum24, postingsEnum25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        commonGramsTokenFilterFactoryTests21.assertTermsEquals("tests.nightly", indexReader29, terms30, terms31, false);
        commonGramsTokenFilterFactoryTests21.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests21.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum17, (java.lang.Object) commonGramsTokenFilterFactoryTests21);
        org.apache.lucene.index.NumericDocValues numericDocValues39 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests21.assertDocValuesEquals("enwiki.random.lines.txt", (int) (short) -1, numericDocValues39, numericDocValues40);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy0 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass1 = queryCachingPolicy0.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass3 = queryCachingPolicy2.getClass();
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] { wildcardClass1, wildcardClass3 };
        java.util.Set<java.lang.reflect.Type> typeSet5 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray4);
        org.junit.Assert.assertNotNull((java.lang.Object) typeArray4);
        java.lang.Object[] objArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) typeArray4, objArray7);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[][] charSequenceArray14 = new java.lang.CharSequence[][] { charSequenceArray6, charSequenceArray13 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests16.assertFieldsEquals("random", indexReader18, fields19, fields20, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        commonGramsTokenFilterFactoryTests23.assertFieldsEquals("random", indexReader25, fields26, fields27, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray31 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests16, commonGramsTokenFilterFactoryTests23, commonGramsTokenFilterFactoryTests30 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet32 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray31);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        commonGramsTokenFilterFactoryTests33.assertFieldsEquals("random", indexReader35, fields36, fields37, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        commonGramsTokenFilterFactoryTests40.assertFieldsEquals("random", indexReader42, fields43, fields44, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests47 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray48 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests33, commonGramsTokenFilterFactoryTests40, commonGramsTokenFilterFactoryTests47 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet49 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray48);
        java.util.Collection[] collectionArray51 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray52 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray51;
        baseTokenStreamTestCaseCollectionArray52[0] = baseTokenStreamTestCaseSet32;
        baseTokenStreamTestCaseCollectionArray52[1] = baseTokenStreamTestCaseSet49;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet57 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray52);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) baseTokenStreamTestCaseCollectionArray52);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (byte) 1);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("random", indexReader27, fields28, fields29, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray33 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests18, commonGramsTokenFilterFactoryTests25, commonGramsTokenFilterFactoryTests32 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet34 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray33);
        java.util.Collection[] collectionArray36 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray37 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray36;
        baseTokenStreamTestCaseCollectionArray37[0] = baseTokenStreamTestCaseSet17;
        baseTokenStreamTestCaseCollectionArray37[1] = baseTokenStreamTestCaseSet34;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet42 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray37);
        java.util.Set<java.lang.Iterable<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseIterableSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) baseTokenStreamTestCaseCollectionArray37);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) baseTokenStreamTestCaseCollectionArray37);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling45 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling46 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling47 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling48 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray49 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling45, throttling46, throttling47, throttling48 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet50 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseCollectionArray37, (java.lang.Object[]) throttlingArray49);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        short[] shortArray3 = new short[] { (short) -1, (short) -1 };
        short[] shortArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray4);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        short[] shortArray1 = new short[] { (short) 1 };
        short[] shortArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) 2);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray3, byteArray7);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        java.lang.Class<?> wildcardClass18 = baseTokenStreamTestCaseSet17.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("random", indexReader21, fields22, fields23, false);
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests19.ruleChain;
        java.lang.Class<?> wildcardClass28 = commonGramsTokenFilterFactoryTests19.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray29 = new java.lang.reflect.GenericDeclaration[] { wildcardClass18, wildcardClass28 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet30 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray29);
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet37 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray36);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet44 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray36, (java.lang.Object[]) charSequenceArray43);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) genericDeclarationArray29, (java.lang.Object[]) charSequenceArray43);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray6, byteArray12);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule10;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) testRule10);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        java.lang.String str9 = commonGramsTokenFilterFactoryTests2.getTestName();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests21.assertFieldsEquals("random", indexReader23, fields24, fields25, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("random", indexReader30, fields31, fields32, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray36 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests21, commonGramsTokenFilterFactoryTests28, commonGramsTokenFilterFactoryTests35 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet37 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray36);
        java.lang.Class<?> wildcardClass38 = baseTokenStreamTestCaseSet37.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        commonGramsTokenFilterFactoryTests39.assertFieldsEquals("random", indexReader41, fields42, fields43, false);
        org.junit.rules.TestRule testRule46 = commonGramsTokenFilterFactoryTests39.ruleChain;
        org.junit.rules.TestRule testRule47 = commonGramsTokenFilterFactoryTests39.ruleChain;
        java.lang.Class<?> wildcardClass48 = commonGramsTokenFilterFactoryTests39.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray49 = new java.lang.reflect.GenericDeclaration[] { wildcardClass38, wildcardClass48 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet50 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray49);
        java.util.Set<java.lang.Object> objSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) genericDeclarationArray49);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests5, (java.lang.Object) genericDeclarationArray49);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy54 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy55 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray56 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy54, queryCachingPolicy55 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet57 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray56);
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy60 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy61 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray62 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy60, queryCachingPolicy61 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet63 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray62);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy64 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy65 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray66 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy64, queryCachingPolicy65 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet67 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray66);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet68 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray66);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray62, (java.lang.Object[]) queryCachingPolicyArray66);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet70 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray62);
        org.junit.Assert.assertNotEquals((java.lang.Object) locale59, (java.lang.Object) queryCachingPolicyArray62);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) queryCachingPolicyArray56, (java.lang.Object[]) queryCachingPolicyArray62);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) genericDeclarationArray49, (java.lang.Object[]) queryCachingPolicyArray56);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        float[] floatArray1 = new float[] { (byte) 100 };
        float[] floatArray2 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) 0L);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        short[] shortArray0 = null;
        short[] shortArray2 = new short[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray2);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray10);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2, throttling3, throttling4 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray5);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray11, intArray12);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray16, intArray17);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray20, intArray21);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray16, intArray20);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray11, intArray20);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray27, intArray28);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray31, intArray32);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray27, intArray31);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray31, (java.lang.Object) 2);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray39, intArray40);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray43, intArray44);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray39, intArray43);
        org.junit.Assert.assertArrayEquals(intArray31, intArray43);
        org.junit.Assert.assertArrayEquals(intArray20, intArray43);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray5, (java.lang.Object) intArray20);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet63 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray55, (java.lang.Object[]) charSequenceArray62);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray62);
        java.lang.CharSequence[] charSequenceArray71 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet72 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray71);
        java.lang.CharSequence[] charSequenceArray78 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet79 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray78);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray71, (java.lang.Object[]) charSequenceArray78);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray62, (java.lang.Object[]) charSequenceArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray5, (java.lang.Object[]) charSequenceArray71);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((-1));
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests7);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests7.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader10, (int) (short) -1, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests7.assertPositionsSkippingEquals("tests.monster", indexReader16, (int) (byte) 0, postingsEnum18, postingsEnum19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) indexReader16);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        float[] floatArray4 = new float[] { 1.0f, (-1), (short) 1, 10.0f };
        float[] floatArray8 = new float[] { 1L, 10, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray8, 1.0f);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        short[] shortArray3 = new short[] { (byte) 0, (byte) 100, (short) -1 };
        short[] shortArray8 = new short[] { (byte) 10, (byte) 100, (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray8);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        float[] floatArray2 = new float[] { 10.0f, (short) -1 };
        float[] floatArray8 = new float[] { (-1.0f), 1.0f, '4', (byte) -1, 10.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray8, (float) (byte) 100);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray4, intArray5);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        java.lang.String str14 = commonGramsTokenFilterFactoryTests7.getTestName();
        commonGramsTokenFilterFactoryTests7.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests7.assertPositionsSkippingEquals("<unknown>", indexReader17, (int) (byte) 10, postingsEnum19, postingsEnum20);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray5, (java.lang.Object) commonGramsTokenFilterFactoryTests7);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray5);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray26, intArray27);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray30, intArray31);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray26, intArray30);
        org.junit.Assert.assertArrayEquals(intArray5, intArray30);
        int[] intArray35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray5, intArray35);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
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
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        commonGramsTokenFilterFactoryTests5.assertTermsEquals("", indexReader29, terms30, terms31, true);
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests5.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) testRule34);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
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
        java.util.Set<java.lang.CharSequence> charSequenceSet84 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray79);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling86 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling87 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling88 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling89 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray90 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling86, throttling87, throttling88, throttling89 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet91 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray90);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray90);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray79, (java.lang.Object[]) throttlingArray90);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.weekly", indexReader12, terms13, terms14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.weekly", indexReader18, fields19, fields20, true);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("enwiki.random.lines.txt", (int) (short) 1, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) -1 };
        byte[] byteArray5 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) 100, (double) ' ');
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        float[] floatArray4 = new float[] { (short) 100, '4', (-1L) };
        float[] floatArray9 = new float[] { 0L, (byte) 10, 10L, 1.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray4, floatArray9, 10.0f);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (long) 0, 0L);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray4 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray2, byteArray4);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        float[] floatArray4 = new float[] { (-1L), (short) 10, 1L, (-1.0f) };
        float[] floatArray5 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray5, (float) (-1));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) 100);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        long[] longArray4 = new long[] { (short) -1 };
        long[] longArray6 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray4, longArray6);
        long[] longArray9 = new long[] { (short) -1 };
        long[] longArray11 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray9, longArray11);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray6, longArray11);
        long[] longArray18 = new long[] { (short) -1 };
        long[] longArray20 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray18, longArray20);
        long[] longArray23 = new long[] { (short) -1 };
        long[] longArray25 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray23, longArray25);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray20, longArray25);
        long[] longArray29 = new long[] { (short) -1 };
        long[] longArray31 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray29, longArray31);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray25, longArray31);
        long[] longArray37 = new long[] { (short) -1 };
        long[] longArray39 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray37, longArray39);
        long[] longArray42 = new long[] { (short) -1 };
        long[] longArray44 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray42, longArray44);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray39, longArray44);
        long[] longArray48 = new long[] { (short) -1 };
        long[] longArray50 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray48, longArray50);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray44, longArray50);
        long[] longArray54 = new long[] { (short) -1 };
        long[] longArray56 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray54, longArray56);
        org.junit.Assert.assertArrayEquals(longArray44, longArray54);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray31, longArray54);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray6, longArray31);
        long[] longArray61 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray6, longArray61);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet14 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) charSequenceArray20);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray20);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] commonGramsTokenFilterFactoryTestsArray30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] { commonGramsTokenFilterFactoryTestsArray25, commonGramsTokenFilterFactoryTestsArray26, commonGramsTokenFilterFactoryTestsArray27, commonGramsTokenFilterFactoryTestsArray28, commonGramsTokenFilterFactoryTestsArray29 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[]> commonGramsTokenFilterFactoryTestsArraySet31 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray30);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray30);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray5, byteArray9);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10L, (double) (short) 10, (double) 100L);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
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
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests17.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests17.assertDocValuesEquals("tests.awaitsfix", (int) 'a', numericDocValues33, numericDocValues34);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray12);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests15.assertFieldsEquals("random", indexReader17, fields18, fields19, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests22.assertFieldsEquals("random", indexReader24, fields25, fields26, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray30 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests15, commonGramsTokenFilterFactoryTests22, commonGramsTokenFilterFactoryTests29 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet31 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) baseTokenStreamTestCaseArray30);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (short) -1, (long) (byte) 0);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, (double) 0.0f, (double) 10);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[][] charSequenceArray15 = new java.lang.CharSequence[][] { charSequenceArray7, charSequenceArray14 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy19 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy20 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray21 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy19, queryCachingPolicy20 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet22 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray21);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy23 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy24 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray25 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy23, queryCachingPolicy24 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet26 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray25);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet27 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray21, (java.lang.Object[]) queryCachingPolicyArray25);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet29 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray21);
        org.junit.Assert.assertNotEquals((java.lang.Object) locale18, (java.lang.Object) queryCachingPolicyArray21);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) charSequenceArray15, (java.lang.Object[]) queryCachingPolicyArray21);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests28.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsEnumEquals("tests.awaitsfix", postingsEnum31, postingsEnum32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        commonGramsTokenFilterFactoryTests28.assertTermsEquals("tests.nightly", indexReader36, terms37, terms38, false);
        commonGramsTokenFilterFactoryTests28.setUp();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsSkippingEquals("tests.slow", indexReader43, (int) (short) 10, postingsEnum45, postingsEnum46, true);
        commonGramsTokenFilterFactoryTests28.setUp();
        java.lang.String str50 = commonGramsTokenFilterFactoryTests28.getTestName();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests17, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        java.lang.String str52 = commonGramsTokenFilterFactoryTests28.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests28);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray8);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("random", indexReader27, fields28, fields29, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray33 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests18, commonGramsTokenFilterFactoryTests25, commonGramsTokenFilterFactoryTests32 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet34 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray33);
        java.util.Collection[] collectionArray36 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray37 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray36;
        baseTokenStreamTestCaseCollectionArray37[0] = baseTokenStreamTestCaseSet17;
        baseTokenStreamTestCaseCollectionArray37[1] = baseTokenStreamTestCaseSet34;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet42 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray37);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray46, intArray47);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests49 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        commonGramsTokenFilterFactoryTests49.assertFieldsEquals("random", indexReader51, fields52, fields53, false);
        java.lang.String str56 = commonGramsTokenFilterFactoryTests49.getTestName();
        commonGramsTokenFilterFactoryTests49.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        commonGramsTokenFilterFactoryTests49.assertPositionsSkippingEquals("<unknown>", indexReader59, (int) (byte) 10, postingsEnum61, postingsEnum62);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray47, (java.lang.Object) commonGramsTokenFilterFactoryTests49);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray47);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray68, intArray69);
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray72, intArray73);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray68, intArray72);
        org.junit.Assert.assertArrayEquals(intArray47, intArray72);
        org.junit.Assert.assertNotSame((java.lang.Object) baseTokenStreamTestCaseCollectionArray37, (java.lang.Object) intArray72);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy78 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy79 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy80 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray81 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy78, queryCachingPolicy79, queryCachingPolicy80 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy82 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy83 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy84 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray85 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy82, queryCachingPolicy83, queryCachingPolicy84 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray86 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray81, queryCachingPolicyArray85 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet87 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray86);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) baseTokenStreamTestCaseCollectionArray37, (java.lang.Object[]) queryCachingPolicyArray86);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] commonGramsTokenFilterFactoryTestsArray6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] { commonGramsTokenFilterFactoryTestsArray1, commonGramsTokenFilterFactoryTestsArray2, commonGramsTokenFilterFactoryTestsArray3, commonGramsTokenFilterFactoryTestsArray4, commonGramsTokenFilterFactoryTestsArray5 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[]> commonGramsTokenFilterFactoryTestsArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray6);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals(charArray9, charArray12);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray18);
        org.junit.Assert.assertArrayEquals(charArray9, charArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTestsArraySet7, (java.lang.Object) charArray15);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        long[] longArray4 = new long[] { (short) -1 };
        long[] longArray6 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray4, longArray6);
        long[] longArray9 = new long[] { (short) -1 };
        long[] longArray11 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray9, longArray11);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray6, longArray11);
        long[] longArray15 = new long[] { (short) -1 };
        long[] longArray17 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray15, longArray17);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray11, longArray17);
        long[] longArray21 = new long[] { (short) -1 };
        long[] longArray23 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray21, longArray23);
        org.junit.Assert.assertArrayEquals(longArray11, longArray21);
        long[] longArray28 = new long[] { (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray11, longArray28);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (-1L));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', 10.0f, (float) (short) -1);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", 0.0d, (double) (byte) 10, 10.0d);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet14 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) charSequenceArray20);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray20);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy25 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass26 = queryCachingPolicy25.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy27 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass28 = queryCachingPolicy27.getClass();
        java.lang.reflect.Type[] typeArray29 = new java.lang.reflect.Type[] { wildcardClass26, wildcardClass28 };
        java.util.Set<java.lang.reflect.Type> typeSet30 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray29);
        org.junit.Assert.assertNotNull((java.lang.Object) typeArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) typeArray29);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) '#', 10.0d);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        short[] shortArray5 = new short[] { (short) -1, (short) -1, (byte) -1, (byte) 100 };
        short[] shortArray10 = new short[] { (byte) 1, (short) 10, (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray5, shortArray10);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (byte) 1, (double) (-1));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        java.lang.Object obj0 = null;
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
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests18.ruleChain;
        commonGramsTokenFilterFactoryTests18.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotEquals((java.lang.Object) builder17, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        org.junit.Assert.assertNotSame(obj0, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) commonGramsTokenFilterFactoryTests30);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 100.0d, (double) (-1), 0.0d);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) charSequenceArray14);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet24 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray23);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet31 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray23, (java.lang.Object[]) charSequenceArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray23);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet40 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray39);
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet47 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray39, (java.lang.Object[]) charSequenceArray46);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray46);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet63 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray55, (java.lang.Object[]) charSequenceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray46, (java.lang.Object[]) charSequenceArray55);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray46);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests67 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.Fields fields70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        commonGramsTokenFilterFactoryTests67.assertFieldsEquals("random", indexReader69, fields70, fields71, false);
        org.junit.rules.TestRule testRule74 = commonGramsTokenFilterFactoryTests67.ruleChain;
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder1, (java.lang.Object) 100.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests5.assertFieldsEquals("random", indexReader7, fields8, fields9, false);
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests5.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) builder12);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray14 = new org.elasticsearch.common.settings.Settings.Builder[] { builder1, builder12 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet15 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray14);
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet16 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray14);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray22 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling18, throttling19, throttling20, throttling21 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet23 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray22);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray22);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) builderArray14, (java.lang.Object[]) throttlingArray22);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
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
        int[] intArray13 = new int[] { (byte) -1, 2 };
        int[] intArray16 = new int[] { (byte) -1, 2 };
        int[] intArray19 = new int[] { (byte) -1, 2 };
        int[][] intArray20 = new int[][] { intArray13, intArray16, intArray19 };
        java.util.Set<int[]> intArraySet21 = org.apache.lucene.util.LuceneTestCase.asSet(intArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) queryCachingPolicyArray7, (java.lang.Object[]) intArray20);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) -1, (double) 10L, (double) (byte) 0);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum3, postingsEnum4, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.slow", indexReader9, 1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.maxfailures", (int) (short) 100, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests15.assertFieldsEquals("random", indexReader17, fields18, fields19, false);
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests15.ruleChain;
        commonGramsTokenFilterFactoryTests15.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) builder14, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.slow");
        java.lang.String str7 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule8);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray15, (java.lang.Object[]) charSequenceArray22);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet33 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray32);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet40 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray32, (java.lang.Object[]) charSequenceArray39);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray39);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet50 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray49);
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet57 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray56);
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet64 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray63);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray56, (java.lang.Object[]) charSequenceArray63);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray49, (java.lang.Object[]) charSequenceArray63);
        java.lang.CharSequence[] charSequenceArray73 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet74 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray73);
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet81 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray73, (java.lang.Object[]) charSequenceArray80);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray49, (java.lang.Object[]) charSequenceArray80);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) charSequenceArray8);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        commonGramsTokenFilterFactoryTests12.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("random", indexReader21, fields22, fields23, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray27 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests12, commonGramsTokenFilterFactoryTests19, commonGramsTokenFilterFactoryTests26 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet28 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray27);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) queryCachingPolicyArray3, (java.lang.Object[]) baseTokenStreamTestCaseArray27);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        short[] shortArray6 = new short[] { (byte) 100, (byte) -1, (byte) 0, (short) 10, (byte) 100, (byte) 10 };
        short[] shortArray8 = new short[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray8);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
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
        java.util.Set<java.lang.Iterable<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseIterableSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) baseTokenStreamTestCaseCollectionArray36);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[][] charSequenceArray47 = new java.lang.CharSequence[][] { charSequenceArray44, charSequenceArray46 };
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[][] charSequenceArray52 = new java.lang.CharSequence[][] { charSequenceArray49, charSequenceArray51 };
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[][] charSequenceArray57 = new java.lang.CharSequence[][] { charSequenceArray54, charSequenceArray56 };
        java.lang.CharSequence[][][] charSequenceArray58 = new java.lang.CharSequence[][][] { charSequenceArray47, charSequenceArray52, charSequenceArray57 };
        java.util.Set<java.lang.CharSequence[][]> charSequenceArraySet59 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseCollectionArray36, (java.lang.Object[]) charSequenceArray58);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
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
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("", indexReader14, terms15, terms16, true);
        commonGramsTokenFilterFactoryTests2.setUp();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs(0);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests22.assertFieldsEquals("random", indexReader24, fields25, fields26, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        commonGramsTokenFilterFactoryTests29.assertFieldsEquals("random", indexReader31, fields32, fields33, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray37 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests22, commonGramsTokenFilterFactoryTests29, commonGramsTokenFilterFactoryTests36 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet38 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 0, (java.lang.Object) baseTokenStreamTestCaseArray37);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 1L, 10.0d, (double) (short) -1);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 100, (float) 2, (float) (byte) -1);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray3);
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
        org.junit.Assert.assertArrayEquals("", charArray7, charArray17);
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
        org.junit.Assert.assertNotNull((java.lang.Object) charArray3);
        long[] longArray26 = new long[] { (short) -1 };
        long[] longArray28 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray26, longArray28);
        long[] longArray31 = new long[] { (short) -1 };
        long[] longArray33 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray31, longArray33);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray28, longArray33);
        long[] longArray37 = new long[] { (short) -1 };
        long[] longArray39 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray37, longArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray33, longArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charArray3, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 0L, (double) 0L);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
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
        commonGramsTokenFilterFactoryTests5.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests5.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) '4');
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        short[] shortArray3 = new short[] { (byte) -1, (short) 10 };
        short[] shortArray10 = new short[] { (byte) 0, (byte) -1, (byte) 1, (short) 0, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray10);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
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
        java.lang.Class<?> wildcardClass17 = baseTokenStreamTestCaseSet16.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests18.ruleChain;
        java.lang.Class<?> wildcardClass27 = commonGramsTokenFilterFactoryTests18.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray28 = new java.lang.reflect.GenericDeclaration[] { wildcardClass17, wildcardClass27 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet29 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray28);
        java.util.Set<java.lang.Object> objSet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) genericDeclarationArray28);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy31 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy32 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray33 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy31, queryCachingPolicy32 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet34 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray33);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy35 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy36 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray37 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy35, queryCachingPolicy36 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet38 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray37);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet39 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray33, (java.lang.Object[]) queryCachingPolicyArray37);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet41 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray33);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) genericDeclarationArray28, (java.lang.Object[]) queryCachingPolicyArray33);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.badapples", true);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (-1L));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray4, intArray5);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        java.lang.String str14 = commonGramsTokenFilterFactoryTests7.getTestName();
        commonGramsTokenFilterFactoryTests7.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests7.assertPositionsSkippingEquals("<unknown>", indexReader17, (int) (byte) 10, postingsEnum19, postingsEnum20);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray5, (java.lang.Object) commonGramsTokenFilterFactoryTests7);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray5);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray26, intArray27);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray30, intArray31);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray26, intArray30);
        org.junit.Assert.assertArrayEquals(intArray5, intArray30);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray37, intArray38);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray42, intArray43);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray46, intArray47);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray42, intArray46);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray37, intArray46);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray5, intArray37);
        int[] intArray58 = new int[] { ' ', (-1), 'a', '#', 2, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray37, intArray58);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.nightly", indexReader8, terms9, terms10, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[][] charSequenceArray30 = new java.lang.CharSequence[][] { charSequenceArray22, charSequenceArray29 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet31 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray30);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests32.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsEnumEquals("tests.awaitsfix", postingsEnum35, postingsEnum36, false);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        commonGramsTokenFilterFactoryTests32.assertTermsEquals("tests.nightly", indexReader40, terms41, terms42, false);
        commonGramsTokenFilterFactoryTests32.setUp();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsSkippingEquals("tests.slow", indexReader47, (int) (short) 10, postingsEnum49, postingsEnum50, true);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        commonGramsTokenFilterFactoryTests32.assertTermsEquals("", indexReader54, terms55, terms56, true);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsSkippingEquals("hi!", indexReader60, (int) (byte) -1, postingsEnum62, postingsEnum63, true);
        commonGramsTokenFilterFactoryTests32.setIndexWriterMaxDocs((int) '#');
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) charSequenceArray30, (java.lang.Object) commonGramsTokenFilterFactoryTests32);
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests32, (java.lang.Object) 100.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) 100.0d);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader3, (int) (short) -1, postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.monster", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum15, postingsEnum16, true);
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
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests19.ruleChain;
        java.lang.String str35 = commonGramsTokenFilterFactoryTests19.getTestName();
        java.lang.String str36 = commonGramsTokenFilterFactoryTests19.getTestName();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("", indexReader38, fields39, fields40, true);
        org.junit.rules.TestRule testRule43 = commonGramsTokenFilterFactoryTests19.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests19);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        float[] floatArray6 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray12 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray12, (float) 100L);
        float[] floatArray15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray12, floatArray15, (float) (short) 0);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[][] charSequenceArray15 = new java.lang.CharSequence[][] { charSequenceArray7, charSequenceArray14 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray22 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling18, throttling19, throttling20, throttling21 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet23 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray22);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) charSequenceArray15, (java.lang.Object[]) throttlingArray22);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        commonGramsTokenFilterFactoryTests30.assertFieldsEquals("random", indexReader32, fields33, fields34, false);
        java.lang.String str37 = commonGramsTokenFilterFactoryTests30.getTestName();
        commonGramsTokenFilterFactoryTests30.setIndexWriterMaxDocs((int) (byte) -1);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests30.assertDocsSkippingEquals("", indexReader41, (int) '4', postingsEnum43, postingsEnum44, true);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) "", (java.lang.Object) commonGramsTokenFilterFactoryTests30);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests48 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        commonGramsTokenFilterFactoryTests48.assertFieldsEquals("random", indexReader50, fields51, fields52, false);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        commonGramsTokenFilterFactoryTests48.assertPositionsSkippingEquals("random", indexReader56, (int) '#', postingsEnum58, postingsEnum59);
        org.junit.rules.TestRule testRule61 = commonGramsTokenFilterFactoryTests48.ruleChain;
        commonGramsTokenFilterFactoryTests48.setIndexWriterMaxDocs(0);
        java.lang.String str64 = commonGramsTokenFilterFactoryTests48.getTestName();
        org.junit.Assert.assertNotEquals((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests48);
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests48.assertDocsAndPositionsEnumEquals("random", postingsEnum67, postingsEnum68);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray4 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy1, queryCachingPolicy2, queryCachingPolicy3 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy6 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy7 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray8 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy5, queryCachingPolicy6, queryCachingPolicy7 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray9 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray4, queryCachingPolicyArray8 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray9);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy12 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy13 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray14 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy12, queryCachingPolicy13 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet15 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray14);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet16 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray14);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy17 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy18 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray19 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy17, queryCachingPolicy18 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet20 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray19);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy21 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy22 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray23 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy21, queryCachingPolicy22 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet24 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray23);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet25 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray19, (java.lang.Object[]) queryCachingPolicyArray23);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet27 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray19);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) queryCachingPolicyArray14, (java.lang.Object[]) queryCachingPolicyArray19);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) queryCachingPolicyArray9, (java.lang.Object[]) queryCachingPolicyArray14);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 100, (float) 0, (float) 1L);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray6 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy3, queryCachingPolicy4, queryCachingPolicy5 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy7 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy8 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy9 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray10 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy7, queryCachingPolicy8, queryCachingPolicy9 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray11 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray6, queryCachingPolicyArray10 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray11);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) builder2, (java.lang.Object) queryCachingPolicyArray11);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray11);
        int[] intArray17 = new int[] { (byte) -1, 2 };
        int[] intArray20 = new int[] { (byte) -1, 2 };
        int[] intArray23 = new int[] { (byte) -1, 2 };
        int[][] intArray24 = new int[][] { intArray17, intArray20, intArray23 };
        java.util.Set<int[]> intArraySet25 = org.apache.lucene.util.LuceneTestCase.asSet(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) queryCachingPolicyArraySet14, (java.lang.Object) intArray24);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (byte) 1, 0L);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) (short) -1);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 10, (short) 10 };
        short[] shortArray9 = new short[] { (byte) -1, (short) -1, (byte) -1, (byte) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray9);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
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
        java.lang.String str16 = commonGramsTokenFilterFactoryTests0.getTestName();
        java.lang.String str17 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("", indexReader19, fields20, fields21, true);
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.monster", indexReader27, (int) (short) 10, postingsEnum29, postingsEnum30);
        org.elasticsearch.common.settings.Settings.Builder builder32 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        float[] floatArray2 = new float[] { (-1L), (byte) 100 };
        float[] floatArray8 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray14 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray14, (float) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray14, (float) (byte) 0);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 10, 0.0d);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray5 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy3, queryCachingPolicy4 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet6 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray5);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy7 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy8 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray9 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy7, queryCachingPolicy8 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet10 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray9);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet11 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray5, (java.lang.Object[]) queryCachingPolicyArray9);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet13 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray5);
        org.junit.Assert.assertNotEquals((java.lang.Object) locale2, (java.lang.Object) queryCachingPolicyArray5);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray17, intArray18);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray21, intArray22);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray17, intArray21);
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
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray30);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray51, intArray52);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray55, intArray56);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray51, intArray55);
        org.junit.Assert.assertArrayEquals(intArray30, intArray55);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray62, intArray63);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray67, intArray68);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray71, intArray72);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray67, intArray71);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray62, intArray71);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray30, intArray62);
        org.junit.Assert.assertArrayEquals(intArray21, intArray30);
        org.junit.Assert.assertNotSame((java.lang.Object) locale2, (java.lang.Object) intArray21);
        double[] doubleArray81 = new double[] { (byte) 1, '#' };
        double[] doubleArray84 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray81, doubleArray84, (double) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) locale2, (java.lang.Object) 100L);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) (byte) 10);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        float[] floatArray5 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray11 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray11, (float) 100L);
        float[] floatArray20 = new float[] { 0L, 10, (byte) 1, 0L, (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray20, (float) (short) 0);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray12);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy15 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy16 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray17 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy15, queryCachingPolicy16 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet18 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray17);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy19 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy20 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray21 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy19, queryCachingPolicy20 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet22 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray21);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet23 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray17, (java.lang.Object[]) queryCachingPolicyArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) queryCachingPolicyArray21);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, (float) (byte) 0, (float) 10L);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray6 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy3, queryCachingPolicy4, queryCachingPolicy5 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy7 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy8 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy9 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray10 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy7, queryCachingPolicy8, queryCachingPolicy9 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray11 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray6, queryCachingPolicyArray10 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray11);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) builder2, (java.lang.Object) queryCachingPolicyArray11);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray11);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling16, throttling17, throttling18, throttling19 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray20);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray11, (java.lang.Object[]) throttlingArray20);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule9;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule9;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule9);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
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
        double[] doubleArray30 = new double[] { (byte) 1, '#' };
        double[] doubleArray33 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray33, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray33, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray25, (double) 100);
        double[] doubleArray43 = new double[] { (byte) 1, '#' };
        double[] doubleArray46 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray46, (double) 100L);
        double[] doubleArray51 = new double[] { (byte) 1, '#' };
        double[] doubleArray54 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray54, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray54, (double) 100.0f);
        double[] doubleArray61 = new double[] { (byte) 1, '#' };
        double[] doubleArray64 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray64, (double) 100L);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray46, doubleArray64, 100.0d);
        double[] doubleArray71 = new double[] { (byte) 1, '#' };
        double[] doubleArray74 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray71, doubleArray74, (double) 100L);
        double[] doubleArray79 = new double[] { (byte) 1, '#' };
        double[] doubleArray82 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray79, doubleArray82, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray74, doubleArray82, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray74, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray7, doubleArray64, (double) 100L);
        double[] doubleArray91 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray64, doubleArray91, (double) (short) 1);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        long[] longArray1 = null;
        long[] longArray6 = new long[] { (short) -1 };
        long[] longArray8 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray6, longArray8);
        long[] longArray11 = new long[] { (short) -1 };
        long[] longArray13 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray11, longArray13);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray8, longArray13);
        long[] longArray17 = new long[] { (short) -1 };
        long[] longArray19 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray17, longArray19);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray13, longArray19);
        long[] longArray23 = new long[] { (short) -1 };
        long[] longArray25 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray23, longArray25);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray13, longArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray1, longArray23);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) 1.0f, 1.0d, (double) 0.0f);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0.0f, (double) 10, (double) '4');
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.slow");
        java.lang.String str7 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("hi!", 0, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) 0L, (double) (short) 0, (double) ' ');
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("enwiki.random.lines.txt", true);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        java.lang.Object obj1 = null;
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
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests8.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum25, postingsEnum26, true);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray31, intArray32);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray35, intArray36);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray31, intArray35);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray41, intArray42);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray45, intArray46);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray41, intArray45);
        org.junit.Assert.assertArrayEquals(intArray35, intArray41);
        org.junit.Assert.assertNotSame("", (java.lang.Object) true, (java.lang.Object) intArray35);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray53, intArray54);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray58, intArray59);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray62, intArray63);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray58, intArray62);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray53, intArray62);
        org.junit.Assert.assertArrayEquals(intArray35, intArray53);
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray72, intArray73);
        int[] intArray76 = new int[] {};
        int[] intArray77 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray76, intArray77);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray72, intArray76);
        int[] intArray82 = new int[] {};
        int[] intArray83 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray82, intArray83);
        int[] intArray86 = new int[] {};
        int[] intArray87 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray86, intArray87);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray82, intArray86);
        org.junit.Assert.assertArrayEquals("", intArray76, intArray86);
        int[] intArray92 = new int[] {};
        int[] intArray93 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray92, intArray93);
        org.junit.Assert.assertArrayEquals("", intArray86, intArray92);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray53, intArray92);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", obj1, (java.lang.Object) intArray53);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder3 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy6 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray7 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy4, queryCachingPolicy5, queryCachingPolicy6 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy8 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy9 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy10 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray11 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy8, queryCachingPolicy9, queryCachingPolicy10 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray12 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray7, queryCachingPolicyArray11 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray12);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) builder3, (java.lang.Object) queryCachingPolicyArray12);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet28 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray27);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet35 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray27, (java.lang.Object[]) charSequenceArray34);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) queryCachingPolicyArray12, (java.lang.Object[]) charSequenceArray34);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        short[] shortArray1 = new short[] {};
        short[] shortArray6 = new short[] { (byte) 100, (byte) 100, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray1, shortArray6);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 0, (double) (short) 1, (double) 100.0f);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        float[] floatArray5 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray11 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray11, (float) 100L);
        float[] floatArray14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray14, (float) 1);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        double[] doubleArray4 = new double[] { (byte) 1, '#' };
        double[] doubleArray7 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 100L);
        double[] doubleArray12 = new double[] { (byte) 1, '#' };
        double[] doubleArray15 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100L);
        double[] doubleArray20 = new double[] { (byte) 1, '#' };
        double[] doubleArray23 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray23, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray23, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray7, doubleArray15, (double) 100.0f);
        double[] doubleArray34 = new double[] { 10L, 10.0f, 100.0f, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray7, doubleArray34, 0.0d);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
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
        java.util.Set<org.junit.Assert> assertSet17 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) baseTokenStreamTestCaseArray15);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet18 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray15);
        java.util.Set[] setArray20 = new java.util.Set[0];
        @SuppressWarnings("unchecked")
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseSetArray21 = (java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray20;
        java.util.Set<java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseSetSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseArray15, (java.lang.Object[]) setArray20);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10 };
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray3, byteArray8);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        float[] floatArray0 = new float[] {};
        float[] floatArray6 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray12 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray12, (float) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray12, (float) 0);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        float[] floatArray6 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray12 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray12, (float) 100L);
        float[] floatArray20 = new float[] { (short) 1, (short) 10, 10L, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray12, floatArray20, (float) 0L);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        short[] shortArray5 = new short[] { (byte) 1, (byte) 10, (byte) 0, (short) 0 };
        short[] shortArray6 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray5, shortArray6);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray15, (java.lang.Object[]) charSequenceArray22);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet33 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray32);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet40 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray32, (java.lang.Object[]) charSequenceArray39);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray39);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet50 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray49);
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet57 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray49, (java.lang.Object[]) charSequenceArray56);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray56);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) charSequenceArray56);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray56);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray62 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray63 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray64 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray65 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray66 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray67 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] commonGramsTokenFilterFactoryTestsArray68 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] { commonGramsTokenFilterFactoryTestsArray62, commonGramsTokenFilterFactoryTestsArray63, commonGramsTokenFilterFactoryTestsArray64, commonGramsTokenFilterFactoryTestsArray65, commonGramsTokenFilterFactoryTestsArray66, commonGramsTokenFilterFactoryTestsArray67 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray69 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray70 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray71 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray72 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray73 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray74 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] commonGramsTokenFilterFactoryTestsArray75 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] { commonGramsTokenFilterFactoryTestsArray69, commonGramsTokenFilterFactoryTestsArray70, commonGramsTokenFilterFactoryTestsArray71, commonGramsTokenFilterFactoryTestsArray72, commonGramsTokenFilterFactoryTestsArray73, commonGramsTokenFilterFactoryTestsArray74 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][][] commonGramsTokenFilterFactoryTestsArray76 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][][] { commonGramsTokenFilterFactoryTestsArray68, commonGramsTokenFilterFactoryTestsArray75 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][]> commonGramsTokenFilterFactoryTestsArraySet77 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) charSequenceArray56, (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray76);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        short[] shortArray6 = new short[] { (short) 1, (short) 0, (short) 0, (short) -1, (short) 1, (byte) 1 };
        short[] shortArray8 = new short[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray8);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        short[] shortArray3 = new short[] { (byte) 0, (byte) 10, (byte) 1 };
        short[] shortArray7 = new short[] { (short) 100, (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray7);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (-1.0f), (double) (short) 1);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet14 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) charSequenceArray20);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) charSequenceArray20);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) 10);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray15, (java.lang.Object[]) charSequenceArray22);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet33 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray32);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet40 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray32, (java.lang.Object[]) charSequenceArray39);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray39);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet50 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray49);
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet57 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray49, (java.lang.Object[]) charSequenceArray56);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray56);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) charSequenceArray56);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (long) (short) 0, 0L);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        short[] shortArray3 = new short[] { (short) 10, (byte) 10, (byte) 0 };
        short[] shortArray4 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        double[] doubleArray2 = new double[] { (byte) 1, '#' };
        double[] doubleArray5 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray5, (double) 100L);
        double[] doubleArray10 = new double[] { (byte) 1, '#' };
        double[] doubleArray13 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray13, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray10, (double) (byte) 100);
        org.junit.Assert.assertNotEquals((java.lang.Object) doubleArray10, (java.lang.Object) 1L);
        double[] doubleArray23 = new double[] { (byte) 1, '#' };
        double[] doubleArray26 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray26, (double) 100L);
        double[] doubleArray31 = new double[] { (byte) 1, '#' };
        double[] doubleArray34 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray34, (double) 100L);
        double[] doubleArray39 = new double[] { (byte) 1, '#' };
        double[] doubleArray42 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray42, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray42, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray26, doubleArray34, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray34, (double) '4');
        double[] doubleArray53 = new double[] { (byte) 1, '#' };
        double[] doubleArray56 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray56, (double) 100L);
        double[] doubleArray61 = new double[] { (byte) 1, '#' };
        double[] doubleArray64 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray64, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray64, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) doubleArray10, (java.lang.Object) doubleArray64);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        char[] charArray1 = null;
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray11);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals(charArray18, charArray21);
        org.junit.Assert.assertArrayEquals(charArray15, charArray18);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        org.junit.Assert.assertArrayEquals("", charArray15, charArray25);
        org.junit.Assert.assertArrayEquals(charArray11, charArray15);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray3, charArray11);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        org.junit.Assert.assertArrayEquals(charArray33, charArray36);
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
        org.junit.Assert.assertArrayEquals(charArray40, charArray47);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray33, charArray40);
        org.junit.Assert.assertArrayEquals(charArray3, charArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray1, charArray3);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
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
        java.lang.String str56 = commonGramsTokenFilterFactoryTests32.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests57 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        commonGramsTokenFilterFactoryTests57.assertFieldsEquals("random", indexReader59, fields60, fields61, false);
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        commonGramsTokenFilterFactoryTests57.assertPositionsSkippingEquals("random", indexReader65, (int) '#', postingsEnum67, postingsEnum68);
        org.junit.rules.TestRule testRule70 = commonGramsTokenFilterFactoryTests57.ruleChain;
        commonGramsTokenFilterFactoryTests57.setIndexWriterMaxDocs(0);
        java.lang.String str73 = commonGramsTokenFilterFactoryTests57.getTestName();
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests32, (java.lang.Object) commonGramsTokenFilterFactoryTests57);
        org.apache.lucene.index.NumericDocValues numericDocValues77 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests57.assertDocValuesEquals("tests.weekly", (int) (short) 1, numericDocValues77, numericDocValues78);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
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
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) queryCachingPolicySet11, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
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
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        commonGramsTokenFilterFactoryTests4.assertTermsEquals("", indexReader28, terms29, terms30, true);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        commonGramsTokenFilterFactoryTests4.assertTermsEquals("enwiki.random.lines.txt", indexReader34, terms35, terms36, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        commonGramsTokenFilterFactoryTests40.assertFieldsEquals("random", indexReader42, fields43, fields44, false);
        org.elasticsearch.common.settings.Settings.Builder builder47 = commonGramsTokenFilterFactoryTests40.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests48 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        commonGramsTokenFilterFactoryTests48.assertFieldsEquals("random", indexReader50, fields51, fields52, false);
        commonGramsTokenFilterFactoryTests48.tearDown();
        commonGramsTokenFilterFactoryTests48.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) builder47, (java.lang.Object) commonGramsTokenFilterFactoryTests48);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests58 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        commonGramsTokenFilterFactoryTests58.assertFieldsEquals("random", indexReader60, fields61, fields62, false);
        java.lang.String str65 = commonGramsTokenFilterFactoryTests58.getTestName();
        commonGramsTokenFilterFactoryTests58.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests58.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests48, (java.lang.Object) commonGramsTokenFilterFactoryTests58);
        commonGramsTokenFilterFactoryTests58.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("", (java.lang.Object) commonGramsTokenFilterFactoryTests58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) "");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        float[] floatArray5 = new float[] { (byte) 0, 10L, (short) 0, 10, 10 };
        float[] floatArray11 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray17 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray17, (float) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray17, (float) (short) -1);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        commonGramsTokenFilterFactoryTests32.assertFieldsEquals("random", indexReader34, fields35, fields36, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        commonGramsTokenFilterFactoryTests39.assertFieldsEquals("random", indexReader41, fields42, fields43, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray47 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests32, commonGramsTokenFilterFactoryTests39, commonGramsTokenFilterFactoryTests46 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet48 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray47);
        java.lang.Class<?> wildcardClass49 = baseTokenStreamTestCaseSet48.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests50 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        commonGramsTokenFilterFactoryTests50.assertFieldsEquals("random", indexReader52, fields53, fields54, false);
        org.junit.rules.TestRule testRule57 = commonGramsTokenFilterFactoryTests50.ruleChain;
        org.junit.rules.TestRule testRule58 = commonGramsTokenFilterFactoryTests50.ruleChain;
        java.lang.Class<?> wildcardClass59 = commonGramsTokenFilterFactoryTests50.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray60 = new java.lang.reflect.GenericDeclaration[] { wildcardClass49, wildcardClass59 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet61 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray21, (java.lang.Object[]) genericDeclarationArray60);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 0, (float) 10L, (float) (-1));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
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
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling17, throttling18, throttling19, throttling20 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseArray15, (java.lang.Object[]) throttlingArray21);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) ' ', (double) 10.0f, (double) 0.0f);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet14 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) charSequenceArray20);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray20);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy25 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy26 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray27 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy25, queryCachingPolicy26 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet28 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray27);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy29 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy30 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray31 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy29, queryCachingPolicy30 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet32 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray31);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet33 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray31);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray27, (java.lang.Object[]) queryCachingPolicyArray31);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet35 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) queryCachingPolicyArray27);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray4 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy1, queryCachingPolicy2, queryCachingPolicy3 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy6 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy7 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray8 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy5, queryCachingPolicy6, queryCachingPolicy7 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray9 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray4, queryCachingPolicyArray8 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray9);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet17 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray16);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet24 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray16, (java.lang.Object[]) charSequenceArray23);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray23);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet33 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray32);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet40 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray32, (java.lang.Object[]) charSequenceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray23, (java.lang.Object[]) charSequenceArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) queryCachingPolicyArray9, (java.lang.Object[]) charSequenceArray32);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) ' ', (float) (short) 1, (float) (byte) 0);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        java.lang.String str10 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("europarl.lines.txt.gz", 10, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        byte[] byteArray2 = new byte[] { (byte) 0 };
        byte[] byteArray3 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray2, byteArray3);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        float[] floatArray6 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray12 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray12, (float) 100L);
        float[] floatArray20 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray26 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray26, (float) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray6, floatArray26, 0.0f);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[][] charSequenceArray15 = new java.lang.CharSequence[][] { charSequenceArray7, charSequenceArray14 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests17.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests17.assertDocsEnumEquals("tests.awaitsfix", postingsEnum20, postingsEnum21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        commonGramsTokenFilterFactoryTests17.assertTermsEquals("tests.nightly", indexReader25, terms26, terms27, false);
        commonGramsTokenFilterFactoryTests17.setUp();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests17.assertDocsSkippingEquals("tests.slow", indexReader32, (int) (short) 10, postingsEnum34, postingsEnum35, true);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        commonGramsTokenFilterFactoryTests17.assertTermsEquals("", indexReader39, terms40, terms41, true);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests17.assertDocsSkippingEquals("hi!", indexReader45, (int) (byte) -1, postingsEnum47, postingsEnum48, true);
        commonGramsTokenFilterFactoryTests17.setIndexWriterMaxDocs((int) '#');
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) charSequenceArray15, (java.lang.Object) commonGramsTokenFilterFactoryTests17);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests54 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        commonGramsTokenFilterFactoryTests54.assertFieldsEquals("random", indexReader56, fields57, fields58, false);
        org.junit.rules.TestRule testRule61 = commonGramsTokenFilterFactoryTests54.ruleChain;
        commonGramsTokenFilterFactoryTests54.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests54.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests54.setIndexWriterMaxDocs((int) (short) -1);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests17, (java.lang.Object) commonGramsTokenFilterFactoryTests54);
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet73 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray72);
        java.lang.CharSequence[] charSequenceArray79 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet80 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray79);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray72, (java.lang.Object[]) charSequenceArray79);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests54, (java.lang.Object) charSequenceArray79);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray10, intArray11);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray14, intArray15);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray10, intArray14);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray20, intArray21);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray24, intArray25);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray20, intArray24);
        org.junit.Assert.assertArrayEquals(intArray14, intArray20);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        commonGramsTokenFilterFactoryTests29.assertFieldsEquals("random", indexReader31, fields32, fields33, false);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests29.assertPositionsSkippingEquals("random", indexReader37, (int) '#', postingsEnum39, postingsEnum40);
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests29.ruleChain;
        commonGramsTokenFilterFactoryTests29.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder45 = commonGramsTokenFilterFactoryTests29.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        commonGramsTokenFilterFactoryTests46.assertFieldsEquals("random", indexReader48, fields49, fields50, false);
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests46.ruleChain;
        commonGramsTokenFilterFactoryTests46.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotEquals((java.lang.Object) builder45, (java.lang.Object) commonGramsTokenFilterFactoryTests46);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) intArray14, (java.lang.Object) commonGramsTokenFilterFactoryTests46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charSequenceSet6, (java.lang.Object) intArray14);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        long[] longArray3 = new long[] { (short) -1 };
        long[] longArray5 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        long[] longArray10 = new long[] { (short) -1 };
        long[] longArray12 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray10, longArray12);
        long[] longArray15 = new long[] { (short) -1 };
        long[] longArray17 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray15, longArray17);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray12, longArray17);
        long[] longArray21 = new long[] { (short) -1 };
        long[] longArray23 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray21, longArray23);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray17, longArray23);
        long[] longArray29 = new long[] { (short) -1 };
        long[] longArray31 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray29, longArray31);
        long[] longArray34 = new long[] { (short) -1 };
        long[] longArray36 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray34, longArray36);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray31, longArray36);
        long[] longArray40 = new long[] { (short) -1 };
        long[] longArray42 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray40, longArray42);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray36, longArray42);
        long[] longArray46 = new long[] { (short) -1 };
        long[] longArray48 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray46, longArray48);
        org.junit.Assert.assertArrayEquals(longArray36, longArray46);
        org.junit.Assert.assertArrayEquals(longArray17, longArray46);
        org.junit.Assert.assertArrayEquals(longArray3, longArray17);
        long[] longArray56 = new long[] { (short) -1 };
        long[] longArray58 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray56, longArray58);
        long[] longArray61 = new long[] { (short) -1 };
        long[] longArray63 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray61, longArray63);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray58, longArray63);
        long[] longArray67 = new long[] { (short) -1 };
        long[] longArray69 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray67, longArray69);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray63, longArray69);
        long[] longArray73 = new long[] { (short) -1 };
        long[] longArray75 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray73, longArray75);
        org.junit.Assert.assertArrayEquals(longArray63, longArray73);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray3, longArray73);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests79 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests79.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests79.setIndexWriterMaxDocs((-1));
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.Fields fields86 = null;
        org.apache.lucene.index.Fields fields87 = null;
        commonGramsTokenFilterFactoryTests79.assertFieldsEquals("enwiki.random.lines.txt", indexReader85, fields86, fields87, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) longArray3, (java.lang.Object) false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 0.0f, (float) (short) 10, (float) (-1L));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder3 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy6 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray7 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy4, queryCachingPolicy5, queryCachingPolicy6 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy8 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy9 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy10 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray11 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy8, queryCachingPolicy9, queryCachingPolicy10 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray12 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray7, queryCachingPolicyArray11 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray12);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) builder3, (java.lang.Object) queryCachingPolicyArray12);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet30 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray29);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) "", (java.lang.Object) charSequenceArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) queryCachingPolicyArray12, (java.lang.Object[]) charSequenceArray29);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { (short) -1 };
        long[] longArray5 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        long[] longArray8 = new long[] { (short) -1 };
        long[] longArray10 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray8, longArray10);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray5, longArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray5);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (-1.0f), (float) 100, 0.0f);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        java.lang.String str10 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", (int) (byte) 1, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0, throttling1, throttling2, throttling3 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[][] charSequenceArray10 = new java.lang.CharSequence[][] { charSequenceArray7, charSequenceArray9 };
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[][] charSequenceArray15 = new java.lang.CharSequence[][] { charSequenceArray12, charSequenceArray14 };
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[][] charSequenceArray20 = new java.lang.CharSequence[][] { charSequenceArray17, charSequenceArray19 };
        java.lang.CharSequence[][][] charSequenceArray21 = new java.lang.CharSequence[][][] { charSequenceArray10, charSequenceArray15, charSequenceArray20 };
        java.util.Set<java.lang.CharSequence[][]> charSequenceArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray4, (java.lang.Object[]) charSequenceArray21);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) 'a', (-1L));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
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
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests32.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum35, postingsEnum36, false);
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsEnumEquals("tests.slow", postingsEnum40, postingsEnum41, false);
        commonGramsTokenFilterFactoryTests32.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) commonGramsTokenFilterFactoryTests32);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        short[] shortArray1 = new short[] {};
        short[] shortArray6 = new short[] { (short) 1, (byte) 10, (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray1, shortArray6);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        short[] shortArray6 = new short[] { (short) -1, (short) 10, (short) 10, (short) -1, (short) 100, (byte) -1 };
        short[] shortArray10 = new short[] { (byte) 0, (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray10);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
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
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray24, intArray25);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        commonGramsTokenFilterFactoryTests27.assertFieldsEquals("random", indexReader29, fields30, fields31, false);
        java.lang.String str34 = commonGramsTokenFilterFactoryTests27.getTestName();
        commonGramsTokenFilterFactoryTests27.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("<unknown>", indexReader37, (int) (byte) 10, postingsEnum39, postingsEnum40);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray25, (java.lang.Object) commonGramsTokenFilterFactoryTests27);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray25);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray46, intArray47);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray50, intArray51);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray46, intArray50);
        org.junit.Assert.assertArrayEquals(intArray25, intArray50);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray57, intArray58);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray62, intArray63);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray66, intArray67);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray62, intArray66);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray57, intArray66);
        org.junit.Assert.assertArrayEquals("", intArray25, intArray57);
        org.junit.Assert.assertArrayEquals(intArray2, intArray25);
        int[] intArray76 = new int[] {};
        int[] intArray77 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray76, intArray77);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests79 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.Fields fields82 = null;
        org.apache.lucene.index.Fields fields83 = null;
        commonGramsTokenFilterFactoryTests79.assertFieldsEquals("random", indexReader81, fields82, fields83, false);
        java.lang.String str86 = commonGramsTokenFilterFactoryTests79.getTestName();
        commonGramsTokenFilterFactoryTests79.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader89 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum91 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum92 = null;
        commonGramsTokenFilterFactoryTests79.assertPositionsSkippingEquals("<unknown>", indexReader89, (int) (byte) 10, postingsEnum91, postingsEnum92);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray77, (java.lang.Object) commonGramsTokenFilterFactoryTests79);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray77);
        org.junit.Assert.assertArrayEquals(intArray2, intArray77);
        int[] intArray97 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray77, intArray97);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) 10.0f);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 100 };
        short[] shortArray8 = new short[] { (short) -1, (short) 100, (short) 10, (byte) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray8);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 100 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray6, byteArray13);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder2, (java.lang.Object) 100.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests6.assertFieldsEquals("random", indexReader8, fields9, fields10, false);
        org.elasticsearch.common.settings.Settings.Builder builder13 = commonGramsTokenFilterFactoryTests6.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) builder13);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray15 = new org.elasticsearch.common.settings.Settings.Builder[] { builder2, builder13 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet16 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray15);
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet17 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        java.lang.String str25 = commonGramsTokenFilterFactoryTests18.getTestName();
        commonGramsTokenFilterFactoryTests18.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        commonGramsTokenFilterFactoryTests27.assertFieldsEquals("random", indexReader29, fields30, fields31, false);
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests27.ruleChain;
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("", indexReader36, (int) (short) 10, postingsEnum38, postingsEnum39);
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray41 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests18, commonGramsTokenFilterFactoryTests27 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet42 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray41);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) builderArray15, (java.lang.Object[]) baseTokenStreamTestCaseArray41);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.nightly", indexReader8, terms9, terms10, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.slow", indexReader15, (int) (short) 10, postingsEnum17, postingsEnum18, true);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader22, terms23, terms24, true);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("hi!", indexReader28, (int) (byte) -1, postingsEnum30, postingsEnum31, true);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) '#');
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 0);
        java.lang.Object obj39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (byte) 0, obj39);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 100L, (double) (short) 0);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
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
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.slow", indexReader17, fields18, fields19, true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray28);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray33);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        org.junit.Assert.assertArrayEquals(charArray40, charArray43);
        org.junit.Assert.assertArrayEquals(charArray37, charArray40);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals("", charArray37, charArray47);
        org.junit.Assert.assertArrayEquals(charArray33, charArray37);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray25, charArray33);
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
        org.junit.Assert.assertArrayEquals(charArray60, charArray63);
        org.junit.Assert.assertArrayEquals(charArray54, charArray60);
        org.junit.Assert.assertArrayEquals("random", charArray25, charArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "random");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
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
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests10.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        org.elasticsearch.common.settings.Settings.Builder builder27 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.weekly", indexReader29, fields30, fields31, false);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 0);
        org.elasticsearch.common.settings.Settings.Builder builder36 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        commonGramsTokenFilterFactoryTests37.assertFieldsEquals("random", indexReader39, fields40, fields41, false);
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests37.ruleChain;
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests37.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        commonGramsTokenFilterFactoryTests46.assertFieldsEquals("random", indexReader48, fields49, fields50, false);
        java.lang.String str53 = commonGramsTokenFilterFactoryTests46.getTestName();
        commonGramsTokenFilterFactoryTests46.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        commonGramsTokenFilterFactoryTests46.assertPositionsSkippingEquals("<unknown>", indexReader56, (int) (byte) 10, postingsEnum58, postingsEnum59);
        org.junit.rules.TestRule testRule61 = commonGramsTokenFilterFactoryTests46.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests37, (java.lang.Object) commonGramsTokenFilterFactoryTests46);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsSkippingEquals("tests.failfast", indexReader64, 100, postingsEnum66, postingsEnum67, false);
        commonGramsTokenFilterFactoryTests37.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) builder36, (java.lang.Object) 10);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", 0L, (long) (short) 0);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        java.lang.String str8 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader10, 1, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.weekly", indexReader17, terms18, terms19, true);
        java.lang.String str22 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests24.assertFieldsEquals("random", indexReader26, fields27, fields28, false);
        org.elasticsearch.common.settings.Settings.Builder builder31 = commonGramsTokenFilterFactoryTests24.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests24.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule32;
        org.junit.Assert.assertNotNull("random", (java.lang.Object) testRule32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) testRule32);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (byte) 100, (long) '#');
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
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
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("<unknown>", indexReader18, fields19, fields20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.nightly", indexReader24, fields25, fields26, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) false);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests14.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests14.assertDocsEnumEquals("tests.awaitsfix", postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        commonGramsTokenFilterFactoryTests14.assertTermsEquals("tests.nightly", indexReader22, terms23, terms24, false);
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
        java.lang.String str29 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.maxfailures", indexReader32, terms33, terms34, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) terms33);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet14 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray13);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet30 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) charSequenceArray22);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        commonGramsTokenFilterFactoryTests33.assertFieldsEquals("random", indexReader35, fields36, fields37, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        commonGramsTokenFilterFactoryTests40.assertFieldsEquals("random", indexReader42, fields43, fields44, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests47 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray48 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests33, commonGramsTokenFilterFactoryTests40, commonGramsTokenFilterFactoryTests47 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet49 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray48);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests50 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        commonGramsTokenFilterFactoryTests50.assertFieldsEquals("random", indexReader52, fields53, fields54, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests57 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        commonGramsTokenFilterFactoryTests57.assertFieldsEquals("random", indexReader59, fields60, fields61, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests64 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray65 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests50, commonGramsTokenFilterFactoryTests57, commonGramsTokenFilterFactoryTests64 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet66 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray65);
        java.util.Collection[] collectionArray68 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray69 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray68;
        baseTokenStreamTestCaseCollectionArray69[0] = baseTokenStreamTestCaseSet49;
        baseTokenStreamTestCaseCollectionArray69[1] = baseTokenStreamTestCaseSet66;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet74 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray69);
        java.util.Set<java.lang.Iterable<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseIterableSet75 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) baseTokenStreamTestCaseCollectionArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) baseTokenStreamTestCaseCollectionArray69);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) (short) 10, (double) (short) 1);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 10, (double) (short) 1, (double) 1.0f);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (double) (-1.0f), (double) (-1), (double) 1L);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
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
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("tests.badapples", indexReader21, fields22, fields23, true);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("", indexReader27, 100, postingsEnum29, postingsEnum30);
        org.elasticsearch.common.settings.Settings.Builder builder32 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
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
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.monster", postingsEnum16, postingsEnum17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader21, terms22, terms23, false);
        long[] longArray28 = new long[] { (short) -1 };
        long[] longArray30 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray28, longArray30);
        long[] longArray36 = new long[] { (short) -1 };
        long[] longArray38 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray36, longArray38);
        long[] longArray41 = new long[] { (short) -1 };
        long[] longArray43 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray41, longArray43);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray38, longArray43);
        long[] longArray47 = new long[] { (short) -1 };
        long[] longArray49 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray47, longArray49);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray43, longArray49);
        long[] longArray53 = new long[] { (short) -1 };
        long[] longArray55 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray53, longArray55);
        org.junit.Assert.assertArrayEquals(longArray43, longArray53);
        long[] longArray60 = new long[] { (short) -1 };
        long[] longArray62 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray60, longArray62);
        long[] longArray65 = new long[] { (short) -1 };
        long[] longArray67 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray65, longArray67);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray62, longArray67);
        org.junit.Assert.assertArrayEquals("random", longArray43, longArray62);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray30, longArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) terms22, (java.lang.Object) longArray30);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        long[] longArray5 = new long[] { (short) -1 };
        long[] longArray7 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray5, longArray7);
        long[] longArray10 = new long[] { (short) -1 };
        long[] longArray12 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray10, longArray12);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray7, longArray12);
        long[] longArray16 = new long[] { (short) -1 };
        long[] longArray18 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray16, longArray18);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray12, longArray18);
        long[] longArray22 = new long[] { (short) -1 };
        long[] longArray24 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray22, longArray24);
        org.junit.Assert.assertArrayEquals(longArray12, longArray22);
        long[] longArray29 = new long[] { (short) -1 };
        long[] longArray31 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray29, longArray31);
        long[] longArray34 = new long[] { (short) -1 };
        long[] longArray36 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray34, longArray36);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray31, longArray36);
        org.junit.Assert.assertArrayEquals("random", longArray12, longArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) longArray12);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, 10.0d, (double) 1.0f);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.slow");
        java.lang.String str7 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader11, fields12, fields13, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests16.assertFieldsEquals("random", indexReader18, fields19, fields20, false);
        org.elasticsearch.common.settings.Settings.Builder builder23 = commonGramsTokenFilterFactoryTests16.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests16, (java.lang.Object) 'a');
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests16.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests16.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests16.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests16.assertFieldsEquals("tests.slow", indexReader30, fields31, fields32, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) indexReader30);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        java.lang.String str8 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("", (-1), numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
        double[] doubleArray2 = new double[] { (byte) 1, '#' };
        double[] doubleArray5 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray5, (double) 100L);
        double[] doubleArray10 = new double[] { (byte) 1, '#' };
        double[] doubleArray13 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray13, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray13, (double) 100.0f);
        double[] doubleArray20 = new double[] { (byte) 1, '#' };
        double[] doubleArray23 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray23, (double) 100L);
        double[] doubleArray28 = new double[] { (byte) 1, '#' };
        double[] doubleArray31 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray31, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray31, (double) 100.0f);
        double[] doubleArray39 = new double[] { (byte) 1, '#' };
        double[] doubleArray42 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray42, (double) 100L);
        double[] doubleArray47 = new double[] { (byte) 1, '#' };
        double[] doubleArray50 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray50, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray50, (double) 100.0f);
        double[] doubleArray57 = new double[] { (byte) 1, '#' };
        double[] doubleArray60 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray60, (double) 100L);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray42, doubleArray60, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray42, (double) 10.0f);
        double[] doubleArray69 = new double[] { (byte) 1, '#' };
        double[] doubleArray72 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray69, doubleArray72, (double) 100L);
        double[] doubleArray77 = new double[] { (byte) 1, '#' };
        double[] doubleArray80 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray77, doubleArray80, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray69, doubleArray77, (double) (byte) 100);
        org.junit.Assert.assertNotEquals((java.lang.Object) doubleArray77, (java.lang.Object) 1L);
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray77, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray77, (double) 'a');
        double[] doubleArray91 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray91, 1.0d);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray1, byteArray8);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        java.util.Set[] setArray1 = new java.util.Set[0];
        @SuppressWarnings("unchecked")
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseSetArray2 = (java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray1;
        java.util.Set<java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseSetSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray1);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet12 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray11);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet26 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray25);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray11, (java.lang.Object[]) charSequenceArray25);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet36 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray35);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray35, (java.lang.Object[]) charSequenceArray42);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray11, (java.lang.Object[]) charSequenceArray42);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet53 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray52);
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet60 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray59);
        java.lang.CharSequence[] charSequenceArray66 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet67 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray66);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray59, (java.lang.Object[]) charSequenceArray66);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray66);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray52, (java.lang.Object[]) charSequenceArray66);
        java.lang.CharSequence[] charSequenceArray76 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet77 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray76);
        java.lang.CharSequence[] charSequenceArray83 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet84 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray83);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray76, (java.lang.Object[]) charSequenceArray83);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray52, (java.lang.Object[]) charSequenceArray83);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray11, (java.lang.Object[]) charSequenceArray83);
        java.util.Set<java.lang.CharSequence> charSequenceSet88 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) setArray1, (java.lang.Object[]) charSequenceArray83);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        float[] floatArray3 = new float[] { 100, 1 };
        float[] floatArray10 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray16 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray16, (float) 100L);
        float[] floatArray24 = new float[] { (byte) 0, 1, 0, (short) 1, (short) 100 };
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray16, floatArray24, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray3, floatArray16, (float) 10L);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "hi!");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 1, (long) ' ');
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.nightly", indexReader8, terms9, terms10, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.slow", indexReader15, (int) (short) 10, postingsEnum17, postingsEnum18, true);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader22, terms23, terms24, true);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("hi!", indexReader28, (int) (byte) -1, postingsEnum30, postingsEnum31, true);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) '#');
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum38, postingsEnum39, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum38);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] commonGramsTokenFilterFactoryTestsArray27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] { commonGramsTokenFilterFactoryTestsArray21, commonGramsTokenFilterFactoryTestsArray22, commonGramsTokenFilterFactoryTestsArray23, commonGramsTokenFilterFactoryTestsArray24, commonGramsTokenFilterFactoryTestsArray25, commonGramsTokenFilterFactoryTestsArray26 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] commonGramsTokenFilterFactoryTestsArray34 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] { commonGramsTokenFilterFactoryTestsArray28, commonGramsTokenFilterFactoryTestsArray29, commonGramsTokenFilterFactoryTestsArray30, commonGramsTokenFilterFactoryTestsArray31, commonGramsTokenFilterFactoryTestsArray32, commonGramsTokenFilterFactoryTestsArray33 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][][] commonGramsTokenFilterFactoryTestsArray35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][][] { commonGramsTokenFilterFactoryTestsArray27, commonGramsTokenFilterFactoryTestsArray34 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][]> commonGramsTokenFilterFactoryTestsArraySet36 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray35);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder2, (java.lang.Object) 100.0f);
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
        org.junit.Assert.assertNotSame("random", (java.lang.Object) builder2, (java.lang.Object) commonGramsTokenFilterFactoryTests9);
        commonGramsTokenFilterFactoryTests9.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests9.assertDocsSkippingEquals("tests.slow", indexReader28, (int) (byte) 100, postingsEnum30, postingsEnum31, false);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        org.junit.Assert.assertArrayEquals(charArray36, charArray39);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals(charArray43, charArray46);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray39, charArray46);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        org.junit.Assert.assertArrayEquals(charArray52, charArray55);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        org.junit.Assert.assertArrayEquals(charArray59, charArray62);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray55, charArray62);
        org.junit.Assert.assertArrayEquals(charArray46, charArray55);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray67, charArray68);
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray67, charArray70);
        char[] charArray73 = new char[] {};
        char[] charArray74 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray73, charArray74);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        char[] charArray79 = new char[] {};
        char[] charArray80 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray79, charArray80);
        org.junit.Assert.assertArrayEquals(charArray77, charArray80);
        org.junit.Assert.assertArrayEquals(charArray74, charArray77);
        char[] charArray84 = new char[] {};
        char[] charArray85 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray84, charArray85);
        org.junit.Assert.assertArrayEquals("", charArray74, charArray84);
        org.junit.Assert.assertArrayEquals(charArray70, charArray74);
        org.junit.Assert.assertArrayEquals(charArray55, charArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexReader28, (java.lang.Object) charArray55);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("random", indexReader27, fields28, fields29, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray33 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests18, commonGramsTokenFilterFactoryTests25, commonGramsTokenFilterFactoryTests32 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet34 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray33);
        java.util.Collection[] collectionArray36 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray37 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray36;
        baseTokenStreamTestCaseCollectionArray37[0] = baseTokenStreamTestCaseSet17;
        baseTokenStreamTestCaseCollectionArray37[1] = baseTokenStreamTestCaseSet34;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet42 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray37);
        java.lang.Object[] objArray43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) baseTokenStreamTestCaseCollectionArray37, objArray43);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        short[] shortArray7 = new short[] { (byte) -1, (short) 0, (short) 1, (short) 1, (byte) -1, (short) 10 };
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", shortArray7, shortArray8);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
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
        int[] intArray13 = new int[] { (byte) -1, 2 };
        int[] intArray16 = new int[] { (byte) -1, 2 };
        int[] intArray19 = new int[] { (byte) -1, 2 };
        int[][] intArray20 = new int[][] { intArray13, intArray16, intArray19 };
        java.util.Set<int[]> intArraySet21 = org.apache.lucene.util.LuceneTestCase.asSet(intArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) queryCachingPolicyArray3, (java.lang.Object[]) intArray20);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray2, shortArray5);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
        float[] floatArray6 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray12 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray12, (float) 100L);
        float[] floatArray21 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray27 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray27, (float) 100L);
        float[] floatArray35 = new float[] { (byte) 0, 1, 0, (short) 1, (short) 100 };
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray27, floatArray35, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray12, floatArray27, 0.0f);
        float[] floatArray43 = new float[] { (short) -1, 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray43, (float) (-1L));
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
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
        java.util.Set<org.junit.Assert> assertSet17 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) baseTokenStreamTestCaseArray15);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy18 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass19 = queryCachingPolicy18.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy20 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass21 = queryCachingPolicy20.getClass();
        java.lang.reflect.Type[] typeArray22 = new java.lang.reflect.Type[] { wildcardClass19, wildcardClass21 };
        java.util.Set<java.lang.reflect.Type> typeSet23 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseArray15, (java.lang.Object[]) typeArray22);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
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
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests8.assertDocValuesEquals("hi!", (int) (short) -1, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        java.lang.String str9 = commonGramsTokenFilterFactoryTests2.getTestName();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) "tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("enwiki.random.lines.txt", (int) ' ', numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("random", indexReader6, fields7, fields8, false);
        java.lang.String str11 = commonGramsTokenFilterFactoryTests4.getTestName();
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) "tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("tests.nightly", indexReader15, (int) (byte) 10, postingsEnum17, postingsEnum18);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("random", indexReader22, fields23, fields24, false);
        commonGramsTokenFilterFactoryTests20.tearDown();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("tests.weekly", indexReader29, (int) (short) 1, postingsEnum31, postingsEnum32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("enwiki.random.lines.txt", indexReader36, fields37, fields38, true);
        org.junit.rules.TestRule testRule41 = commonGramsTokenFilterFactoryTests20.ruleChain;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) postingsEnum17, (java.lang.Object) testRule41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) postingsEnum17);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
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
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray25, intArray26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("random", indexReader30, fields31, fields32, false);
        java.lang.String str35 = commonGramsTokenFilterFactoryTests28.getTestName();
        commonGramsTokenFilterFactoryTests28.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("<unknown>", indexReader38, (int) (byte) 10, postingsEnum40, postingsEnum41);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray26, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray26);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray47, intArray48);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray51, intArray52);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray47, intArray51);
        org.junit.Assert.assertArrayEquals(intArray26, intArray51);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray58, intArray59);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray63, intArray64);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray67, intArray68);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray63, intArray67);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray58, intArray67);
        org.junit.Assert.assertArrayEquals("", intArray26, intArray58);
        org.junit.Assert.assertArrayEquals(intArray3, intArray26);
        java.lang.Class<?> wildcardClass74 = intArray3.getClass();
        java.lang.Class[] classArray76 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        wildcardClassArray77[0] = wildcardClass74;
        java.util.Set<java.lang.Class<?>> wildcardClassSet80 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray77);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy81 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy82 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray83 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy81, queryCachingPolicy82 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet84 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray83);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy85 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy86 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray87 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy85, queryCachingPolicy86 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet88 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray87);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet89 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray87);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray83, (java.lang.Object[]) queryCachingPolicyArray87);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) wildcardClassArray77, (java.lang.Object[]) queryCachingPolicyArray83);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) (short) 1);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 10.0f, (float) (byte) 1, (float) 1L);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy0 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass1 = queryCachingPolicy0.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass3 = queryCachingPolicy2.getClass();
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] { wildcardClass1, wildcardClass3 };
        java.util.Set<java.lang.reflect.Type> typeSet5 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray4);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray11 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling7, throttling8, throttling9, throttling10 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray11);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray11);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) typeArray4, (java.lang.Object[]) throttlingArray11);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, 100.0f, (float) (short) 10);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.nightly", indexReader8, terms9, terms10, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader16, fields17, fields18, true);
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) 100.0f);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray15, (java.lang.Object[]) charSequenceArray22);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet33 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray32);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet40 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray32, (java.lang.Object[]) charSequenceArray39);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray39);
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet49 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray48);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet63 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray55, (java.lang.Object[]) charSequenceArray62);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray48, (java.lang.Object[]) charSequenceArray62);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) charSequenceArray39, (java.lang.Object[]) charSequenceArray62);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy69 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy70 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray71 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy69, queryCachingPolicy70 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet72 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray71);
        java.util.Locale locale74 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy75 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy76 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray77 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy75, queryCachingPolicy76 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet78 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray77);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy79 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy80 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray81 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy79, queryCachingPolicy80 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet82 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray81);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet83 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray81);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray77, (java.lang.Object[]) queryCachingPolicyArray81);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet85 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray77);
        org.junit.Assert.assertNotEquals((java.lang.Object) locale74, (java.lang.Object) queryCachingPolicyArray77);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) queryCachingPolicyArray71, (java.lang.Object[]) queryCachingPolicyArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) charSequenceArray62, (java.lang.Object[]) queryCachingPolicyArray71);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 0, (double) (-1L), 0.0d);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (byte) 0, (long) 1);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
        float[] floatArray5 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray11 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray11, (float) 100L);
        float[] floatArray20 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray26 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray26, (float) 100L);
        float[] floatArray35 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray41 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray41, (float) 100L);
        float[] floatArray49 = new float[] { (byte) 0, 1, 0, (short) 1, (short) 100 };
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray41, floatArray49, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray26, floatArray41, 0.0f);
        float[] floatArray60 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray66 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray66, (float) 100L);
        float[] floatArray74 = new float[] { (byte) 0, 1, 0, (short) 1, (short) 100 };
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray66, floatArray74, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray74, 100.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray74, 10.0f);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
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
        double[] doubleArray20 = new double[] { (byte) 1, '#' };
        double[] doubleArray23 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray23, (double) 100L);
        double[] doubleArray28 = new double[] { (byte) 1, '#' };
        double[] doubleArray31 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray31, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray28, (double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "<unknown>", (java.lang.Object) doubleArray20);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.slow");
        java.lang.String str7 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.tearDown();
        long[] longArray13 = new long[] { (short) -1 };
        long[] longArray15 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray13, longArray15);
        long[] longArray21 = new long[] { (short) -1 };
        long[] longArray23 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray21, longArray23);
        long[] longArray26 = new long[] { (short) -1 };
        long[] longArray28 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray26, longArray28);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray23, longArray28);
        long[] longArray32 = new long[] { (short) -1 };
        long[] longArray34 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray32, longArray34);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray28, longArray34);
        long[] longArray38 = new long[] { (short) -1 };
        long[] longArray40 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray38, longArray40);
        org.junit.Assert.assertArrayEquals(longArray28, longArray38);
        long[] longArray45 = new long[] { (short) -1 };
        long[] longArray47 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray45, longArray47);
        long[] longArray50 = new long[] { (short) -1 };
        long[] longArray52 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray50, longArray52);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray47, longArray52);
        org.junit.Assert.assertArrayEquals("random", longArray28, longArray47);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray15, longArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) longArray28);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
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
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray16);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray3, charArray16);
        double[] doubleArray21 = new double[] { (byte) 1, '#' };
        double[] doubleArray24 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray24, (double) 100L);
        double[] doubleArray29 = new double[] { (byte) 1, '#' };
        double[] doubleArray32 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray32, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray29, (double) (byte) 100);
        org.junit.Assert.assertNotEquals((java.lang.Object) doubleArray29, (java.lang.Object) 1L);
        double[] doubleArray42 = new double[] { (byte) 1, '#' };
        double[] doubleArray45 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray45, (double) 100L);
        double[] doubleArray50 = new double[] { (byte) 1, '#' };
        double[] doubleArray53 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray53, (double) 100L);
        double[] doubleArray58 = new double[] { (byte) 1, '#' };
        double[] doubleArray61 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray61, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray61, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray45, doubleArray53, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray53, (double) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) charArray3, (java.lang.Object) doubleArray29);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray15, (java.lang.Object[]) charSequenceArray22);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet33 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray32);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet40 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray32, (java.lang.Object[]) charSequenceArray39);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray39);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet50 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray49);
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet57 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray49, (java.lang.Object[]) charSequenceArray56);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray56);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) charSequenceArray56);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray56);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy62 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy63 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray64 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy62, queryCachingPolicy63 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet65 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) queryCachingPolicyArray64);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray2 = new byte[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray2);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
        double[] doubleArray0 = null;
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
        double[] doubleArray30 = new double[] { (byte) 1, '#' };
        double[] doubleArray33 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray33, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray33, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray25, (double) 100);
        double[] doubleArray44 = new double[] { (byte) 1, '#' };
        double[] doubleArray47 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray47, (double) 100L);
        double[] doubleArray52 = new double[] { (byte) 1, '#' };
        double[] doubleArray55 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray55, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray55, (double) 100.0f);
        double[] doubleArray62 = new double[] { (byte) 1, '#' };
        double[] doubleArray65 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray65, (double) 100L);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray47, doubleArray65, 100.0d);
        double[] doubleArray72 = new double[] { (byte) 1, '#' };
        double[] doubleArray75 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray75, (double) 100L);
        double[] doubleArray80 = new double[] { (byte) 1, '#' };
        double[] doubleArray83 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray80, doubleArray83, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray75, doubleArray83, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray47, doubleArray83, (double) (byte) 10);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray7, doubleArray47, (double) 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray7, (double) 2);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader3, (int) (short) -1, postingsEnum5, postingsEnum6);
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("enwiki.random.lines.txt", 0, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 0.0f, (double) (short) 100);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray12);
        java.lang.Object[] objArray15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray12, objArray15);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 10, (double) 10L, (double) 0L);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests15.assertFieldsEquals("random", indexReader17, fields18, fields19, false);
        org.elasticsearch.common.settings.Settings.Builder builder22 = commonGramsTokenFilterFactoryTests15.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests15, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests15.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests15.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests28.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsEnumEquals("tests.awaitsfix", postingsEnum31, postingsEnum32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        commonGramsTokenFilterFactoryTests28.assertTermsEquals("tests.nightly", indexReader36, terms37, terms38, false);
        commonGramsTokenFilterFactoryTests28.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests15, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) wildcardClass12, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray2, intArray6);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray6, (java.lang.Object) 2);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray14, intArray15);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray18, intArray19);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray14, intArray18);
        org.junit.Assert.assertArrayEquals(intArray6, intArray18);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray26, intArray27);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        commonGramsTokenFilterFactoryTests29.assertFieldsEquals("random", indexReader31, fields32, fields33, false);
        java.lang.String str36 = commonGramsTokenFilterFactoryTests29.getTestName();
        commonGramsTokenFilterFactoryTests29.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests29.assertPositionsSkippingEquals("<unknown>", indexReader39, (int) (byte) 10, postingsEnum41, postingsEnum42);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray27, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray27);
        org.junit.Assert.assertArrayEquals(intArray6, intArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray6);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) '4');
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10L, (float) '4', (float) (short) 1);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("enwiki.random.lines.txt");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        double[] doubleArray6 = new double[] { (byte) 1, '#' };
        double[] doubleArray9 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray9, (double) 100L);
        double[] doubleArray15 = new double[] { (byte) 1, '#' };
        double[] doubleArray18 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray18, (double) 100L);
        double[] doubleArray23 = new double[] { (byte) 1, '#' };
        double[] doubleArray26 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray26, (double) 100L);
        double[] doubleArray31 = new double[] { (byte) 1, '#' };
        double[] doubleArray34 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray34, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray31, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray18, doubleArray23, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray23, (double) 100L);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) shortArray1, (java.lang.Object) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray1);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
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
        org.junit.Assert.assertArrayEquals(charArray19, charArray22);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals(charArray26, charArray29);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray22, charArray29);
        org.junit.Assert.assertArrayEquals(charArray13, charArray22);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray37);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        org.junit.Assert.assertArrayEquals(charArray44, charArray47);
        org.junit.Assert.assertArrayEquals(charArray41, charArray44);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        org.junit.Assert.assertArrayEquals("", charArray41, charArray51);
        org.junit.Assert.assertArrayEquals(charArray37, charArray41);
        org.junit.Assert.assertArrayEquals(charArray22, charArray41);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests57 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests57.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        commonGramsTokenFilterFactoryTests57.assertDocsEnumEquals("tests.awaitsfix", postingsEnum60, postingsEnum61, false);
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        commonGramsTokenFilterFactoryTests57.assertPositionsSkippingEquals("tests.maxfailures", indexReader65, (int) (byte) 0, postingsEnum67, postingsEnum68);
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        commonGramsTokenFilterFactoryTests57.assertDocsEnumEquals("<unknown>", postingsEnum71, postingsEnum72, false);
        commonGramsTokenFilterFactoryTests57.tearDown();
        java.lang.Object obj76 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests57, obj76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) charArray22, obj76);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        float[] floatArray2 = new float[] { '#' };
        float[] floatArray10 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray16 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray16, (float) 100L);
        float[] floatArray25 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray31 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray31, (float) 100L);
        float[] floatArray39 = new float[] { (byte) 0, 1, 0, (short) 1, (short) 100 };
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray31, floatArray39, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray16, floatArray31, 0.0f);
        float[] floatArray49 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray55 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray55, (float) 100L);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray31, floatArray55, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray2, floatArray55, 10.0f);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) 'a');
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("<unknown>", postingsEnum13, postingsEnum14, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("random", indexReader21, fields22, fields23, false);
        java.lang.String str26 = commonGramsTokenFilterFactoryTests19.getTestName();
        commonGramsTokenFilterFactoryTests19.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) "tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests19);
        commonGramsTokenFilterFactoryTests19.tearDown();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("tests.nightly", indexReader31, fields32, fields33, false);
        org.elasticsearch.common.settings.Settings.Builder builder36 = commonGramsTokenFilterFactoryTests19.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsEnumEquals("", postingsEnum38, postingsEnum39, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) true, (java.lang.Object) postingsEnum39);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2, throttling3, throttling4 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray5);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy8 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy9 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray10 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy8, queryCachingPolicy9 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet11 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray5, (java.lang.Object[]) queryCachingPolicyArray10);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.failfast", (int) 'a', numericDocValues11, numericDocValues12);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 2, (float) (byte) 1, (float) (-1));
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 1, (float) 'a', (float) (-1));
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
        int[] intArray3 = new int[] { (byte) -1, 2 };
        int[] intArray6 = new int[] { (byte) -1, 2 };
        int[] intArray9 = new int[] { (byte) -1, 2 };
        int[][] intArray10 = new int[][] { intArray3, intArray6, intArray9 };
        java.util.Set<int[]> intArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(intArray10);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals(charArray17, charArray20);
        org.junit.Assert.assertArrayEquals(charArray14, charArray17);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests24.assertFieldsEquals("random", indexReader26, fields27, fields28, false);
        org.elasticsearch.common.settings.Settings.Builder builder31 = commonGramsTokenFilterFactoryTests24.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        commonGramsTokenFilterFactoryTests32.assertFieldsEquals("random", indexReader34, fields35, fields36, false);
        commonGramsTokenFilterFactoryTests32.tearDown();
        commonGramsTokenFilterFactoryTests32.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) builder31, (java.lang.Object) commonGramsTokenFilterFactoryTests32);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        commonGramsTokenFilterFactoryTests42.assertFieldsEquals("random", indexReader44, fields45, fields46, false);
        java.lang.String str49 = commonGramsTokenFilterFactoryTests42.getTestName();
        commonGramsTokenFilterFactoryTests42.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests42.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests32, (java.lang.Object) commonGramsTokenFilterFactoryTests42);
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
        java.lang.String str69 = commonGramsTokenFilterFactoryTests53.getTestName();
        java.lang.String str70 = commonGramsTokenFilterFactoryTests53.getTestName();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        commonGramsTokenFilterFactoryTests53.assertTermsEquals("europarl.lines.txt.gz", indexReader72, terms73, terms74, true);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests32, (java.lang.Object) "europarl.lines.txt.gz");
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) charArray14, (java.lang.Object) commonGramsTokenFilterFactoryTests32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) intArray10, (java.lang.Object) charArray14);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
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
        java.lang.Class<?> wildcardClass17 = baseTokenStreamTestCaseSet16.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests18.ruleChain;
        java.lang.Class<?> wildcardClass27 = commonGramsTokenFilterFactoryTests18.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray28 = new java.lang.reflect.GenericDeclaration[] { wildcardClass17, wildcardClass27 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet29 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray28);
        java.util.Set<java.lang.Object> objSet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) genericDeclarationArray28);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        commonGramsTokenFilterFactoryTests33.assertFieldsEquals("random", indexReader35, fields36, fields37, false);
        org.elasticsearch.common.settings.Settings.Builder builder40 = commonGramsTokenFilterFactoryTests33.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests33, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests33.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests33.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests46.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsEnumEquals("tests.awaitsfix", postingsEnum49, postingsEnum50, false);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        commonGramsTokenFilterFactoryTests46.assertTermsEquals("tests.nightly", indexReader54, terms55, terms56, false);
        commonGramsTokenFilterFactoryTests46.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests33, (java.lang.Object) commonGramsTokenFilterFactoryTests46);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests61 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests61.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        commonGramsTokenFilterFactoryTests61.assertDocsEnumEquals("tests.awaitsfix", postingsEnum64, postingsEnum65, false);
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        org.apache.lucene.index.Terms terms71 = null;
        commonGramsTokenFilterFactoryTests61.assertTermsEquals("tests.nightly", indexReader69, terms70, terms71, false);
        commonGramsTokenFilterFactoryTests61.tearDown();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests33, (java.lang.Object) commonGramsTokenFilterFactoryTests61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) genericDeclarationArray28, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (-1));
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) '#', (long) 10);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
        double[] doubleArray3 = new double[] { (byte) 1, '#' };
        double[] doubleArray6 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 100L);
        double[] doubleArray11 = new double[] { (byte) 1, '#' };
        double[] doubleArray14 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray14, (double) 100L);
        double[] doubleArray19 = new double[] { (byte) 1, '#' };
        double[] doubleArray22 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray22, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray19, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray6, doubleArray11, (double) 100.0f);
        double[] doubleArray31 = new double[] { (byte) 1, '#' };
        double[] doubleArray34 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray34, (double) 100L);
        double[] doubleArray39 = new double[] { (byte) 1, '#' };
        double[] doubleArray42 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray42, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray42, (double) 100.0f);
        double[] doubleArray50 = new double[] { (byte) 1, '#' };
        double[] doubleArray53 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray53, (double) 100L);
        double[] doubleArray58 = new double[] { (byte) 1, '#' };
        double[] doubleArray61 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray61, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray61, (double) 100.0f);
        double[] doubleArray68 = new double[] { (byte) 1, '#' };
        double[] doubleArray71 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray68, doubleArray71, (double) 100L);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray53, doubleArray71, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray53, (double) 10.0f);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray42, (double) 100L);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests81 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotSame((java.lang.Object) 10.0f, (java.lang.Object) commonGramsTokenFilterFactoryTests81);
        commonGramsTokenFilterFactoryTests81.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader86 = null;
        org.apache.lucene.index.Terms terms87 = null;
        org.apache.lucene.index.Terms terms88 = null;
        commonGramsTokenFilterFactoryTests81.assertTermsEquals("tests.failfast", indexReader86, terms87, terms88, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 100L, (java.lang.Object) terms87);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((-1));
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("random", indexReader7, terms8, terms9, false);
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", 1, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 10, (float) 100L, (float) 0);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        commonGramsTokenFilterFactoryTests31.assertFieldsEquals("random", indexReader33, fields34, fields35, false);
        java.lang.String str38 = commonGramsTokenFilterFactoryTests31.getTestName();
        commonGramsTokenFilterFactoryTests31.setIndexWriterMaxDocs((int) (byte) -1);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsSkippingEquals("", indexReader42, (int) '4', postingsEnum44, postingsEnum45, true);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) "", (java.lang.Object) commonGramsTokenFilterFactoryTests31);
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
        java.lang.String str65 = commonGramsTokenFilterFactoryTests49.getTestName();
        org.junit.Assert.assertNotEquals((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests49);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        java.lang.Class<?> wildcardClass11 = commonGramsTokenFilterFactoryTests0.getClass();
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet18 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray17);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) charSequenceArray17);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests20.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder21, (java.lang.Object) 100.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("random", indexReader27, fields28, fields29, false);
        org.elasticsearch.common.settings.Settings.Builder builder32 = commonGramsTokenFilterFactoryTests25.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) builder32);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray34 = new org.elasticsearch.common.settings.Settings.Builder[] { builder21, builder32 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet35 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray17, (java.lang.Object[]) builderArray34);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.slow", indexReader15, fields16, fields17, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests20.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader23, (int) (short) -1, postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("tests.failfast", indexReader29, fields30, fields31, true);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("tests.slow", indexReader35, (int) '#', postingsEnum37, postingsEnum38, false);
        commonGramsTokenFilterFactoryTests20.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests20.setIndexWriterMaxDocs((int) (byte) 100);
        org.elasticsearch.common.settings.Settings.Builder builder44 = commonGramsTokenFilterFactoryTests20.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass45 = builder44.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) "tests.slow", (java.lang.Object) wildcardClass45);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0f, (float) (byte) -1, (float) 10);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.weekly", obj1);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy0 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray3 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy0, queryCachingPolicy1, queryCachingPolicy2 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy6 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray7 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy4, queryCachingPolicy5, queryCachingPolicy6 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray8 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray3, queryCachingPolicyArray7 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray8);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("random", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("random", indexReader18, (int) '#', postingsEnum20, postingsEnum21);
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests10.ruleChain;
        commonGramsTokenFilterFactoryTests10.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        commonGramsTokenFilterFactoryTests27.assertFieldsEquals("random", indexReader29, fields30, fields31, false);
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests27.ruleChain;
        commonGramsTokenFilterFactoryTests27.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotEquals((java.lang.Object) builder26, (java.lang.Object) commonGramsTokenFilterFactoryTests27);
        commonGramsTokenFilterFactoryTests27.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule40 = commonGramsTokenFilterFactoryTests27.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) queryCachingPolicyArray8, (java.lang.Object) commonGramsTokenFilterFactoryTests27);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.nightly", indexReader8, terms9, terms10, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader16, fields17, fields18, true);
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (-1L), (double) (byte) 1);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.nightly", indexReader8, terms9, terms10, false);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("random", postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", 2, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) 0);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        java.lang.String str9 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", 100, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1.0f, 0.0d, (double) 100);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) 100, (long) (byte) 0);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) (short) 0);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray2, byteArray9);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
        double[] doubleArray3 = new double[] { (byte) 1, '#' };
        double[] doubleArray6 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 100L);
        double[] doubleArray11 = new double[] { (byte) 1, '#' };
        double[] doubleArray14 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray14, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray14, (double) 100.0f);
        double[] doubleArray21 = new double[] { (byte) 1, '#' };
        double[] doubleArray24 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray24, (double) 100L);
        double[] doubleArray29 = new double[] { (byte) 1, '#' };
        double[] doubleArray32 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray32, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray32, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray24, (double) 100);
        double[] doubleArray43 = new double[] { (byte) 1, '#' };
        double[] doubleArray46 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray46, (double) 100L);
        double[] doubleArray51 = new double[] { (byte) 1, '#' };
        double[] doubleArray54 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray54, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray54, (double) 100.0f);
        double[] doubleArray61 = new double[] { (byte) 1, '#' };
        double[] doubleArray64 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray64, (double) 100L);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray46, doubleArray64, 100.0d);
        double[] doubleArray71 = new double[] { (byte) 1, '#' };
        double[] doubleArray74 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray71, doubleArray74, (double) 100L);
        double[] doubleArray79 = new double[] { (byte) 1, '#' };
        double[] doubleArray82 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray79, doubleArray82, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray74, doubleArray82, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray46, doubleArray82, (double) (byte) 10);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray6, doubleArray46, (double) 10L);
        double[] doubleArray91 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray91, (double) 2);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
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
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy77 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy78 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy79 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray80 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy77, queryCachingPolicy78, queryCachingPolicy79 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy81 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy82 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy83 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray84 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy81, queryCachingPolicy82, queryCachingPolicy83 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray85 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray80, queryCachingPolicyArray84 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet86 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray85);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseCollectionArray36, (java.lang.Object[]) queryCachingPolicyArray85);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
        long[] longArray2 = new long[] { (short) -1 };
        long[] longArray4 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray2, longArray4);
        long[] longArray9 = new long[] { (short) -1 };
        long[] longArray11 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray9, longArray11);
        long[] longArray14 = new long[] { (short) -1 };
        long[] longArray16 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray14, longArray16);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray11, longArray16);
        long[] longArray20 = new long[] { (short) -1 };
        long[] longArray22 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray20, longArray22);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray16, longArray22);
        long[] longArray28 = new long[] { (short) -1 };
        long[] longArray30 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray28, longArray30);
        long[] longArray33 = new long[] { (short) -1 };
        long[] longArray35 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray33, longArray35);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray30, longArray35);
        long[] longArray39 = new long[] { (short) -1 };
        long[] longArray41 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray39, longArray41);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray35, longArray41);
        long[] longArray45 = new long[] { (short) -1 };
        long[] longArray47 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray45, longArray47);
        org.junit.Assert.assertArrayEquals(longArray35, longArray45);
        org.junit.Assert.assertArrayEquals(longArray16, longArray45);
        org.junit.Assert.assertArrayEquals(longArray2, longArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests52.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests52.assertDocsEnumEquals("tests.awaitsfix", postingsEnum55, postingsEnum56, false);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        commonGramsTokenFilterFactoryTests52.assertTermsEquals("tests.nightly", indexReader60, terms61, terms62, false);
        commonGramsTokenFilterFactoryTests52.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        commonGramsTokenFilterFactoryTests52.assertDocsSkippingEquals("", indexReader67, (int) '#', postingsEnum69, postingsEnum70, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) longArray16, (java.lang.Object) indexReader67);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (short) 0, (long) (short) 100);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
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
        java.lang.String str16 = commonGramsTokenFilterFactoryTests0.getTestName();
        java.lang.String str17 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader19, terms20, terms21, true);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
        java.lang.Object[] objArray1 = null;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling3, throttling4, throttling5, throttling6 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray7);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray7);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray7);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray13, intArray14);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray18, intArray19);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray22, intArray23);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray18, intArray22);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray13, intArray22);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray29, intArray30);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray33, intArray34);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray29, intArray33);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray33, (java.lang.Object) 2);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray41, intArray42);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray45, intArray46);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray41, intArray45);
        org.junit.Assert.assertArrayEquals(intArray33, intArray45);
        org.junit.Assert.assertArrayEquals(intArray22, intArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray7, (java.lang.Object) intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", objArray1, (java.lang.Object[]) throttlingArray7);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader9, 1, postingsEnum11, postingsEnum12, false);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("", indexReader18, fields19, fields20, false);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.nightly", indexReader26, fields27, fields28, true);
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.badapples", (int) 'a', numericDocValues33, numericDocValues34);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', (float) 0L, (float) '#');
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.weekly", "random" };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, strArray4);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
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
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("", indexReader14, terms15, terms16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("tests.failfast", indexReader20, terms21, terms22, true);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray4 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy2, queryCachingPolicy3 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet5 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray4);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet6 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray4);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy7 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy8 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray9 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy7, queryCachingPolicy8 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet10 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray9);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy11 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy12 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray13 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy11, queryCachingPolicy12 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet14 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray13);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet15 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray13);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray9, (java.lang.Object[]) queryCachingPolicyArray13);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet17 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray9);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) queryCachingPolicyArray4, (java.lang.Object[]) queryCachingPolicyArray9);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] commonGramsTokenFilterFactoryTestsArray24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] { commonGramsTokenFilterFactoryTestsArray19, commonGramsTokenFilterFactoryTestsArray20, commonGramsTokenFilterFactoryTestsArray21, commonGramsTokenFilterFactoryTestsArray22, commonGramsTokenFilterFactoryTestsArray23 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[]> commonGramsTokenFilterFactoryTestsArraySet25 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) queryCachingPolicyArray9, (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray24);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) '4', (double) (short) 0);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) ' ', (-1L));
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (byte) 100);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("", indexReader9, fields10, fields11, false);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
        org.junit.Assert.assertNotSame((java.lang.Object) fields10, (java.lang.Object) locale15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) fields10, (java.lang.Object) (short) -1);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.failfast", false);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
        double[] doubleArray4 = new double[] { (byte) 1, '#' };
        double[] doubleArray7 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 100L);
        double[] doubleArray12 = new double[] { (byte) 1, '#' };
        double[] doubleArray15 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100L);
        double[] doubleArray20 = new double[] { (byte) 1, '#' };
        double[] doubleArray23 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray23, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray23, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray7, doubleArray15, (double) 100.0f);
        double[] doubleArray33 = new double[] { (byte) 1, '#' };
        double[] doubleArray36 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray36, (double) 100L);
        double[] doubleArray42 = new double[] { (byte) 1, '#' };
        double[] doubleArray45 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray45, (double) 100L);
        double[] doubleArray50 = new double[] { (byte) 1, '#' };
        double[] doubleArray53 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray53, (double) 100L);
        double[] doubleArray58 = new double[] { (byte) 1, '#' };
        double[] doubleArray61 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray61, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray58, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray45, doubleArray50, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray50, (double) 100L);
        double[] doubleArray72 = new double[] { (byte) 1, '#' };
        double[] doubleArray75 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray75, (double) 100L);
        org.junit.Assert.assertArrayEquals("hi!", doubleArray33, doubleArray72, (double) 2);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray33, (double) 2);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0f, 0.0f, (float) (byte) 0);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
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
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.slow", (int) (short) -1, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray4, byteArray11);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) ' ');
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1349");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { (byte) 1, '#' };
        double[] doubleArray6 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 100L);
        double[] doubleArray11 = new double[] { (byte) 1, '#' };
        double[] doubleArray14 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray14, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray11, (double) (byte) 100);
        org.junit.Assert.assertNotEquals((java.lang.Object) doubleArray11, (java.lang.Object) 1L);
        double[] doubleArray24 = new double[] { (byte) 1, '#' };
        double[] doubleArray27 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray27, (double) 100L);
        double[] doubleArray32 = new double[] { (byte) 1, '#' };
        double[] doubleArray35 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray35, (double) 100L);
        double[] doubleArray40 = new double[] { (byte) 1, '#' };
        double[] doubleArray43 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray43, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray43, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray27, doubleArray35, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray35, (double) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray11, (double) 100L);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1350");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.weekly", indexReader12, terms13, terms14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.weekly", indexReader18, fields19, fields20, true);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1351");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (short) 1, (-1.0d));
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1352");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.weekly", true);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1353");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, 100.0d, (double) (byte) 1);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1354");
        long[] longArray2 = new long[] { (short) -1 };
        long[] longArray4 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray2, longArray4);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests6.assertFieldsEquals("random", indexReader8, fields9, fields10, false);
        org.elasticsearch.common.settings.Settings.Builder builder13 = commonGramsTokenFilterFactoryTests6.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests6.ruleChain;
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests6.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) longArray4, (java.lang.Object) testRule15);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1355");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray19);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray19);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests24.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder25, (java.lang.Object) 100.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        commonGramsTokenFilterFactoryTests29.assertFieldsEquals("random", indexReader31, fields32, fields33, false);
        org.elasticsearch.common.settings.Settings.Builder builder36 = commonGramsTokenFilterFactoryTests29.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) builder36);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray38 = new org.elasticsearch.common.settings.Settings.Builder[] { builder25, builder36 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet39 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray38);
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet40 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) builderArray38);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1356");
        java.lang.Object obj0 = null;
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
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 0);
        java.lang.String str18 = commonGramsTokenFilterFactoryTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1357");
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
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy35 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy36 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy37 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray38 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy35, queryCachingPolicy36, queryCachingPolicy37 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy39 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy40 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy41 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray42 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy39, queryCachingPolicy40, queryCachingPolicy41 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray43 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray38, queryCachingPolicyArray42 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet44 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) testRule34, (java.lang.Object) queryCachingPolicyArraySet44);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1358");
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
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests6.ruleChain;
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
        org.junit.Assert.assertNotSame((java.lang.Object) testRule28, (java.lang.Object) commonGramsTokenFilterFactoryTests33);
        org.junit.Assert.assertNotEquals((java.lang.Object) 0.0f, (java.lang.Object) commonGramsTokenFilterFactoryTests33);
        org.elasticsearch.common.settings.Settings.Builder builder58 = commonGramsTokenFilterFactoryTests33.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests33.setIndexWriterMaxDocs((int) 'a');
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray62, intArray63);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests65 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        commonGramsTokenFilterFactoryTests65.assertFieldsEquals("random", indexReader67, fields68, fields69, false);
        java.lang.String str72 = commonGramsTokenFilterFactoryTests65.getTestName();
        commonGramsTokenFilterFactoryTests65.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        commonGramsTokenFilterFactoryTests65.assertPositionsSkippingEquals("<unknown>", indexReader75, (int) (byte) 10, postingsEnum77, postingsEnum78);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray63, (java.lang.Object) commonGramsTokenFilterFactoryTests65);
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        commonGramsTokenFilterFactoryTests65.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum82, postingsEnum83, true);
        commonGramsTokenFilterFactoryTests65.tearDown();
        commonGramsTokenFilterFactoryTests65.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests65.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) commonGramsTokenFilterFactoryTests33, (java.lang.Object) '4');
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1359");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 10, (float) (byte) 0, (float) (short) -1);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1360");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray3, intArray7);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray13, intArray14);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray13, intArray17);
        org.junit.Assert.assertArrayEquals(intArray3, intArray17);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray25, intArray26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("random", indexReader30, fields31, fields32, false);
        java.lang.String str35 = commonGramsTokenFilterFactoryTests28.getTestName();
        commonGramsTokenFilterFactoryTests28.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("<unknown>", indexReader38, (int) (byte) 10, postingsEnum40, postingsEnum41);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray26, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray26);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray47, intArray48);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray51, intArray52);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray47, intArray51);
        org.junit.Assert.assertArrayEquals(intArray26, intArray51);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray17, intArray51);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling58 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling59 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling60 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling61 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray62 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling58, throttling59, throttling60, throttling61 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet63 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray62);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray62);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet65 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray62);
        org.junit.Assert.assertNotEquals((java.lang.Object) intArray51, (java.lang.Object) throttlingEnumSet65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray51);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1361");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1), (float) '4', (-1.0f));
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1362");
        int[] intArray1 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray4, intArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray1, intArray8);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1363");
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
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests4.assertDocValuesEquals("random", (int) (short) 0, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1364");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        java.lang.String str9 = commonGramsTokenFilterFactoryTests2.getTestName();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) "tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("tests.slow", indexReader13, terms14, terms15, false);
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("enwiki.random.lines.txt", (int) ' ', numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1365");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', (float) (byte) 1, (-1.0f));
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1366");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray6 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy3, queryCachingPolicy4, queryCachingPolicy5 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy7 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy8 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy9 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray10 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy7, queryCachingPolicy8, queryCachingPolicy9 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray11 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray6, queryCachingPolicyArray10 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray11);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) builder2, (java.lang.Object) queryCachingPolicyArray11);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) queryCachingPolicyArray11, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1367");
        int[] intArray0 = null;
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
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray25, intArray26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("random", indexReader30, fields31, fields32, false);
        java.lang.String str35 = commonGramsTokenFilterFactoryTests28.getTestName();
        commonGramsTokenFilterFactoryTests28.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("<unknown>", indexReader38, (int) (byte) 10, postingsEnum40, postingsEnum41);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray26, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray26);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray47, intArray48);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray51, intArray52);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray47, intArray51);
        org.junit.Assert.assertArrayEquals(intArray26, intArray51);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray58, intArray59);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray63, intArray64);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray67, intArray68);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray63, intArray67);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray58, intArray67);
        org.junit.Assert.assertArrayEquals("", intArray26, intArray58);
        org.junit.Assert.assertArrayEquals(intArray3, intArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray26);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1368");
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
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray25, intArray26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("random", indexReader30, fields31, fields32, false);
        java.lang.String str35 = commonGramsTokenFilterFactoryTests28.getTestName();
        commonGramsTokenFilterFactoryTests28.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("<unknown>", indexReader38, (int) (byte) 10, postingsEnum40, postingsEnum41);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray26, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray26);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray47, intArray48);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray51, intArray52);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray47, intArray51);
        org.junit.Assert.assertArrayEquals(intArray26, intArray51);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray58, intArray59);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray63, intArray64);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray67, intArray68);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray63, intArray67);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray58, intArray67);
        org.junit.Assert.assertArrayEquals("", intArray26, intArray58);
        org.junit.Assert.assertArrayEquals(intArray3, intArray26);
        java.lang.Class<?> wildcardClass74 = intArray3.getClass();
        java.lang.Class[] classArray76 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        wildcardClassArray77[0] = wildcardClass74;
        java.util.Set<java.lang.Class<?>> wildcardClassSet80 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) wildcardClassSet80);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1369");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 100 };
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray3, byteArray5);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1370");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0f, (-1.0f), (float) (byte) 10);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1371");
        short[] shortArray2 = new short[] { (byte) 0, (byte) -1 };
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1372");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray4, intArray5);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        java.lang.String str14 = commonGramsTokenFilterFactoryTests7.getTestName();
        commonGramsTokenFilterFactoryTests7.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests7.assertPositionsSkippingEquals("<unknown>", indexReader17, (int) (byte) 10, postingsEnum19, postingsEnum20);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray5, (java.lang.Object) commonGramsTokenFilterFactoryTests7);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests7.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum24, postingsEnum25, true);
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests7.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) "tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests7);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1373");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 2, (double) (byte) 100);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1374");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) (short) 1);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1375");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum12);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1376");
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
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1377");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy0 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray2 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy0, queryCachingPolicy1 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet3 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray2);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray6 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy4, queryCachingPolicy5 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet7 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray6);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet8 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray6);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray2, (java.lang.Object[]) queryCachingPolicyArray6);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray15, (java.lang.Object[]) charSequenceArray22);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet32 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray31);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet39 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray31, (java.lang.Object[]) charSequenceArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray2, (java.lang.Object[]) charSequenceArray22);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1378");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray4, intArray5);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        java.lang.String str14 = commonGramsTokenFilterFactoryTests7.getTestName();
        commonGramsTokenFilterFactoryTests7.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests7.assertPositionsSkippingEquals("<unknown>", indexReader17, (int) (byte) 10, postingsEnum19, postingsEnum20);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray5, (java.lang.Object) commonGramsTokenFilterFactoryTests7);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests7.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum24, postingsEnum25, true);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray30, intArray31);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray34, intArray35);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray30, intArray34);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray40, intArray41);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray44, intArray45);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray40, intArray44);
        org.junit.Assert.assertArrayEquals(intArray34, intArray40);
        org.junit.Assert.assertNotSame("", (java.lang.Object) true, (java.lang.Object) intArray34);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray52, intArray53);
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray56, intArray57);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray52, intArray56);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray62, intArray63);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray66, intArray67);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray62, intArray66);
        org.junit.Assert.assertArrayEquals(intArray56, intArray62);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray34, intArray56);
        int[] intArray72 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray56, intArray72);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1379");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (-1.0f), (double) 0);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1380");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 10L, (double) 100.0f);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1381");
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
        java.lang.String str20 = commonGramsTokenFilterFactoryTests4.getTestName();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        commonGramsTokenFilterFactoryTests4.assertTermsEquals("", indexReader22, terms23, terms24, true);
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests4.assertDocValuesEquals("random", 1, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1382");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 100.0f, (double) (-1));
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1383");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 0, (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1384");
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
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("", indexReader22, terms23, terms24, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) true);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1385");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests9.assertFieldsEquals("random", indexReader11, fields12, fields13, false);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests9.ruleChain;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests9.assertPositionsSkippingEquals("", indexReader18, (int) (short) 10, postingsEnum20, postingsEnum21);
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray23 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests0, commonGramsTokenFilterFactoryTests9 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet24 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray23);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet25 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray23);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        commonGramsTokenFilterFactoryTests27.assertFieldsEquals("random", indexReader29, fields30, fields31, false);
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests27.ruleChain;
        commonGramsTokenFilterFactoryTests27.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests27.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests27.tearDown();
        java.lang.Class<?> wildcardClass38 = commonGramsTokenFilterFactoryTests27.getClass();
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet45 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray44);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests27, (java.lang.Object) charSequenceArray44);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet53 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray52);
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet60 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray52, (java.lang.Object[]) charSequenceArray59);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) charSequenceArray44, (java.lang.Object[]) charSequenceArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseArray23, (java.lang.Object[]) charSequenceArray44);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1386");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 100L, 1.0d);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1387");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, 0.0d);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1388");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray7, byteArray10);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1389");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("random", indexReader5, fields6, fields7, false);
        java.lang.String str10 = commonGramsTokenFilterFactoryTests3.getTestName();
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) "tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.elasticsearch.common.settings.Settings.Builder builder13 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs((int) (short) 0);
        commonGramsTokenFilterFactoryTests3.tearDown();
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests3.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) testRule19);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1390");
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
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet27 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray26);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet34 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray26, (java.lang.Object[]) charSequenceArray33);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray33);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests38 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder39 = commonGramsTokenFilterFactoryTests38.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder39, (java.lang.Object) 100.0f);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray43, intArray44);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        commonGramsTokenFilterFactoryTests46.assertFieldsEquals("random", indexReader48, fields49, fields50, false);
        java.lang.String str53 = commonGramsTokenFilterFactoryTests46.getTestName();
        commonGramsTokenFilterFactoryTests46.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        commonGramsTokenFilterFactoryTests46.assertPositionsSkippingEquals("<unknown>", indexReader56, (int) (byte) 10, postingsEnum58, postingsEnum59);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray44, (java.lang.Object) commonGramsTokenFilterFactoryTests46);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) builder39, (java.lang.Object) commonGramsTokenFilterFactoryTests46);
        commonGramsTokenFilterFactoryTests46.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charSequenceArray33, (java.lang.Object) commonGramsTokenFilterFactoryTests46);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1391");
        byte[] byteArray2 = new byte[] { (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray2, byteArray7);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1392");
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
        org.junit.Assert.assertArrayEquals(intArray4, intArray18);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray25, intArray26);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray25, intArray29);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray35, intArray36);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray39, intArray40);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray35, intArray39);
        org.junit.Assert.assertArrayEquals(intArray29, intArray35);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray48, intArray49);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests51 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        commonGramsTokenFilterFactoryTests51.assertFieldsEquals("random", indexReader53, fields54, fields55, false);
        java.lang.String str58 = commonGramsTokenFilterFactoryTests51.getTestName();
        commonGramsTokenFilterFactoryTests51.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests51.assertPositionsSkippingEquals("<unknown>", indexReader61, (int) (byte) 10, postingsEnum63, postingsEnum64);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray49, (java.lang.Object) commonGramsTokenFilterFactoryTests51);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray49);
        int[] intArray70 = new int[] {};
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray70, intArray71);
        int[] intArray74 = new int[] {};
        int[] intArray75 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray74, intArray75);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray70, intArray74);
        org.junit.Assert.assertArrayEquals(intArray49, intArray74);
        int[] intArray81 = new int[] {};
        int[] intArray82 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray81, intArray82);
        int[] intArray86 = new int[] {};
        int[] intArray87 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray86, intArray87);
        int[] intArray90 = new int[] {};
        int[] intArray91 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray90, intArray91);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray86, intArray90);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray81, intArray90);
        org.junit.Assert.assertArrayEquals("", intArray49, intArray81);
        org.junit.Assert.assertArrayEquals(intArray35, intArray49);
        org.junit.Assert.assertArrayEquals(intArray18, intArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) 0.0d, (java.lang.Object) intArray18);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1393");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy0 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray2 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy0, queryCachingPolicy1 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet3 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray2);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray6 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy4, queryCachingPolicy5 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet7 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray6);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet8 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray6);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray2, (java.lang.Object[]) queryCachingPolicyArray6);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet17 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray16);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet24 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray16, (java.lang.Object[]) charSequenceArray23);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray23);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet33 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray32);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet40 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray32, (java.lang.Object[]) charSequenceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray23, (java.lang.Object[]) charSequenceArray32);
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet49 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray48);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray48, (java.lang.Object[]) charSequenceArray55);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray55);
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet65 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray64);
        java.lang.CharSequence[] charSequenceArray71 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet72 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray71);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray64, (java.lang.Object[]) charSequenceArray71);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray55, (java.lang.Object[]) charSequenceArray64);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) charSequenceArray23, (java.lang.Object[]) charSequenceArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray2, (java.lang.Object[]) charSequenceArray23);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1394");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (byte) 1, 0L);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1395");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("", indexReader9, fields10, fields11, false);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
        org.junit.Assert.assertNotSame((java.lang.Object) fields10, (java.lang.Object) locale15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) fields10);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1396");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("<unknown>");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1397");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray3 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy1, queryCachingPolicy2 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet4 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray3);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet5 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray3);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy6 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy7 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray8 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy6, queryCachingPolicy7 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet9 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray8);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy10 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy11 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray12 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy10, queryCachingPolicy11 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet13 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray12);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet14 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray12);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray8, (java.lang.Object[]) queryCachingPolicyArray12);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet16 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray8);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) queryCachingPolicyArray3, (java.lang.Object[]) queryCachingPolicyArray8);
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet26 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray25);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet33 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray32);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet40 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray32, (java.lang.Object[]) charSequenceArray39);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray25, (java.lang.Object[]) charSequenceArray39);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet50 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray49);
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet57 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray49, (java.lang.Object[]) charSequenceArray56);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray25, (java.lang.Object[]) charSequenceArray56);
        java.lang.CharSequence[] charSequenceArray66 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet67 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray66);
        java.lang.CharSequence[] charSequenceArray73 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet74 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray73);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray66, (java.lang.Object[]) charSequenceArray73);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray73);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) charSequenceArray73);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray25, (java.lang.Object[]) charSequenceArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray8, (java.lang.Object[]) charSequenceArray73);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1398");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        org.junit.Assert.assertArrayEquals(charArray6, charArray9);
        char[] charArray12 = new char[] {};
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
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray18, charArray25);
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
        org.junit.Assert.assertArrayEquals(charArray36, charArray39);
        org.junit.Assert.assertArrayEquals(charArray30, charArray36);
        org.junit.Assert.assertArrayEquals(charArray18, charArray36);
        org.junit.Assert.assertArrayEquals(charArray12, charArray18);
        org.junit.Assert.assertArrayEquals(charArray9, charArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray0, (java.lang.Object) charArray18);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1399");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 0L, (long) (-1));
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1400");
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
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray17);
        short[] shortArray23 = new short[] { (short) 0, (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", shortArray17, shortArray23);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1401");
        double[] doubleArray0 = null;
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
        double[] doubleArray30 = new double[] { (byte) 1, '#' };
        double[] doubleArray33 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray33, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray33, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray25, (double) 100);
        double[] doubleArray44 = new double[] { (byte) 1, '#' };
        double[] doubleArray47 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray47, (double) 100L);
        double[] doubleArray52 = new double[] { (byte) 1, '#' };
        double[] doubleArray55 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray55, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray55, (double) 100.0f);
        double[] doubleArray62 = new double[] { (byte) 1, '#' };
        double[] doubleArray65 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray65, (double) 100L);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray47, doubleArray65, 100.0d);
        double[] doubleArray72 = new double[] { (byte) 1, '#' };
        double[] doubleArray75 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray75, (double) 100L);
        double[] doubleArray80 = new double[] { (byte) 1, '#' };
        double[] doubleArray83 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray80, doubleArray83, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray75, doubleArray83, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray47, doubleArray83, (double) (byte) 10);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray7, doubleArray47, (double) 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray47, 100.0d);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1402");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) (short) 1);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1403");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 0, (long) 100);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1404");
        java.lang.Object[] objArray0 = null;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray4 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy2, queryCachingPolicy3 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet5 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray4);
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy8 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy9 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray10 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy8, queryCachingPolicy9 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet11 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray10);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy12 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy13 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray14 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy12, queryCachingPolicy13 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet15 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray14);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet16 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray10, (java.lang.Object[]) queryCachingPolicyArray14);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet18 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray10);
        org.junit.Assert.assertNotEquals((java.lang.Object) locale7, (java.lang.Object) queryCachingPolicyArray10);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) queryCachingPolicyArray4, (java.lang.Object[]) queryCachingPolicyArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) queryCachingPolicyArray4);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1405");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.failfast");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1406");
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
        java.lang.String str16 = commonGramsTokenFilterFactoryTests0.getTestName();
        java.lang.String str17 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader19, terms20, terms21, true);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("hi!", indexReader25, (int) (short) 0, postingsEnum27, postingsEnum28, false);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[][] charSequenceArray46 = new java.lang.CharSequence[][] { charSequenceArray38, charSequenceArray45 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet47 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray46);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests48 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests48.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests48.assertDocsEnumEquals("tests.awaitsfix", postingsEnum51, postingsEnum52, false);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        commonGramsTokenFilterFactoryTests48.assertTermsEquals("tests.nightly", indexReader56, terms57, terms58, false);
        commonGramsTokenFilterFactoryTests48.setUp();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        commonGramsTokenFilterFactoryTests48.assertDocsSkippingEquals("tests.slow", indexReader63, (int) (short) 10, postingsEnum65, postingsEnum66, true);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Terms terms71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        commonGramsTokenFilterFactoryTests48.assertTermsEquals("", indexReader70, terms71, terms72, true);
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        commonGramsTokenFilterFactoryTests48.assertDocsSkippingEquals("hi!", indexReader76, (int) (byte) -1, postingsEnum78, postingsEnum79, true);
        commonGramsTokenFilterFactoryTests48.setIndexWriterMaxDocs((int) '#');
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) charSequenceArray46, (java.lang.Object) commonGramsTokenFilterFactoryTests48);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests85 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader87 = null;
        org.apache.lucene.index.Fields fields88 = null;
        org.apache.lucene.index.Fields fields89 = null;
        commonGramsTokenFilterFactoryTests85.assertFieldsEquals("random", indexReader87, fields88, fields89, false);
        org.junit.rules.TestRule testRule92 = commonGramsTokenFilterFactoryTests85.ruleChain;
        commonGramsTokenFilterFactoryTests85.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests85.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests85.setIndexWriterMaxDocs((int) (short) -1);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests48, (java.lang.Object) commonGramsTokenFilterFactoryTests85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests48);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1407");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) ' ', (double) (byte) 0, 0.0d);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1408");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        byte[] byteArray8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray7, byteArray8);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1409");
        float[] floatArray6 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray12 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray12, (float) 100L);
        float[] floatArray20 = new float[] { (byte) 0, 1, 0, (short) 1, (short) 100 };
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray12, floatArray20, (float) (byte) 100);
        float[] floatArray28 = new float[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, 0L };
        float[] floatArray34 = new float[] { (short) 10, 100.0f, 1, (byte) 0, '#' };
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray34, (float) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray28, 0.0f);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1410");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 100 };
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray11);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1411");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("random", indexReader6, fields7, fields8, false);
        java.lang.String str11 = commonGramsTokenFilterFactoryTests4.getTestName();
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) "tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        commonGramsTokenFilterFactoryTests4.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) (byte) 100, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests4);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1412");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) ' ', (double) 100);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1413");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 10 };
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1414");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) (byte) 1);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1415");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) 0.0f, (double) (short) -1);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1416");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (byte) -1, 0L);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1417");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (short) 100, (long) (byte) 100);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1418");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) 100, (float) (short) -1, (float) 0);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1419");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures18 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures17);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests20.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests20.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests20, (java.lang.Object) "tests.slow");
        java.lang.String str26 = commonGramsTokenFilterFactoryTests20.getTestName();
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests20.ruleChain;
        commonGramsTokenFilterFactoryTests20.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) testRuleIgnoreAfterMaxFailures18, (java.lang.Object) commonGramsTokenFilterFactoryTests20);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) "random");
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("hi!", indexReader32, 100, postingsEnum34, postingsEnum35);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests37.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsEnumEquals("tests.awaitsfix", postingsEnum40, postingsEnum41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        commonGramsTokenFilterFactoryTests37.assertTermsEquals("tests.nightly", indexReader45, terms46, terms47, false);
        commonGramsTokenFilterFactoryTests37.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) 100, (java.lang.Object) commonGramsTokenFilterFactoryTests37);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1420");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("random", indexReader5, fields6, fields7, false);
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotEquals("", (java.lang.Object) "tests.nightly", (java.lang.Object) testRule11);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule11;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule11;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule11;
        java.lang.Class<?> wildcardClass16 = testRule11.getClass();
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray22, intArray23);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray26, intArray27);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray22, intArray26);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray32, intArray33);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray36, intArray37);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray32, intArray36);
        org.junit.Assert.assertArrayEquals("", intArray26, intArray36);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray42, intArray43);
        org.junit.Assert.assertArrayEquals("", intArray36, intArray42);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray48, intArray49);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray53, intArray54);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray57, intArray58);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray53, intArray57);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray48, intArray57);
        int[] intArray64 = new int[] {};
        int[] intArray65 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray64, intArray65);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray68, intArray69);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray64, intArray68);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray68, (java.lang.Object) 2);
        int[] intArray76 = new int[] {};
        int[] intArray77 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray76, intArray77);
        int[] intArray80 = new int[] {};
        int[] intArray81 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray80, intArray81);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray76, intArray80);
        org.junit.Assert.assertArrayEquals(intArray68, intArray80);
        org.junit.Assert.assertArrayEquals(intArray57, intArray80);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray36, intArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) wildcardClass16, (java.lang.Object) intArray36);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1421");
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
        commonGramsTokenFilterFactoryTests20.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray34 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] commonGramsTokenFilterFactoryTestsArray37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[][] { commonGramsTokenFilterFactoryTestsArray32, commonGramsTokenFilterFactoryTestsArray33, commonGramsTokenFilterFactoryTestsArray34, commonGramsTokenFilterFactoryTestsArray35, commonGramsTokenFilterFactoryTestsArray36 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[]> commonGramsTokenFilterFactoryTestsArraySet38 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests20, (java.lang.Object) commonGramsTokenFilterFactoryTestsArraySet38);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1422");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests0.ruleChain;
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
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests9.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests9);
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.weekly", indexReader28, fields29, fields30, false);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 0);
        org.elasticsearch.common.settings.Settings.Builder builder35 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum38, postingsEnum39);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1423");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (short) 0, (long) (byte) 100);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1424");
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
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals(charArray25, charArray28);
        org.junit.Assert.assertArrayEquals(charArray18, charArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray11, charArray18);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray11, charArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) charArray2, (java.lang.Object) charArray11);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1425");
        double[] doubleArray3 = new double[] { (byte) 1, '#' };
        double[] doubleArray6 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 100L);
        double[] doubleArray11 = new double[] { (byte) 1, '#' };
        double[] doubleArray14 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray14, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray11, (double) (byte) 100);
        double[] doubleArray21 = new double[] { (byte) 1, '#' };
        double[] doubleArray24 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray24, (double) 100L);
        double[] doubleArray29 = new double[] { (byte) 1, '#' };
        double[] doubleArray32 = new double[] { 1.0d, 10L };
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray32, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray32, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray32, (double) (byte) 100);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        commonGramsTokenFilterFactoryTests39.assertFieldsEquals("random", indexReader41, fields42, fields43, false);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests39.assertPositionsSkippingEquals("random", indexReader47, (int) '#', postingsEnum49, postingsEnum50);
        org.junit.rules.TestRule testRule52 = commonGramsTokenFilterFactoryTests39.ruleChain;
        commonGramsTokenFilterFactoryTests39.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder55 = commonGramsTokenFilterFactoryTests39.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests56 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        commonGramsTokenFilterFactoryTests56.assertFieldsEquals("random", indexReader58, fields59, fields60, false);
        org.junit.rules.TestRule testRule63 = commonGramsTokenFilterFactoryTests56.ruleChain;
        commonGramsTokenFilterFactoryTests56.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotEquals((java.lang.Object) builder55, (java.lang.Object) commonGramsTokenFilterFactoryTests56);
        commonGramsTokenFilterFactoryTests56.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) doubleArray3, (java.lang.Object) commonGramsTokenFilterFactoryTests56);
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests56.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum70, postingsEnum71);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1426");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 10 };
        byte[] byteArray6 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1427");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, 0.0d);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1428");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray3);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray11, intArray12);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray7, intArray11);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray2, intArray11);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray18, intArray19);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray22, intArray23);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray18, intArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray22, (java.lang.Object) 2);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray30, intArray31);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray34, intArray35);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray30, intArray34);
        org.junit.Assert.assertArrayEquals(intArray22, intArray34);
        org.junit.Assert.assertArrayEquals(intArray11, intArray34);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray44, intArray45);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray48, intArray49);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray44, intArray48);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray54, intArray55);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray58, intArray59);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray54, intArray58);
        org.junit.Assert.assertArrayEquals("", intArray48, intArray58);
        int[] intArray64 = new int[] {};
        int[] intArray65 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray64, intArray65);
        org.junit.Assert.assertArrayEquals("", intArray58, intArray64);
        org.junit.Assert.assertArrayEquals(intArray34, intArray58);
        int[] intArray69 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray58, intArray69);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1429");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 10, (double) 100, (double) 100L);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1430");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests14.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests14.assertDocsEnumEquals("tests.awaitsfix", postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        commonGramsTokenFilterFactoryTests14.assertTermsEquals("tests.nightly", indexReader22, terms23, terms24, false);
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
        org.elasticsearch.common.settings.Settings.Builder builder29 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        commonGramsTokenFilterFactoryTests30.assertFieldsEquals("random", indexReader32, fields33, fields34, false);
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests30.ruleChain;
        commonGramsTokenFilterFactoryTests30.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests30.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests30.assertPositionsSkippingEquals("<unknown>", indexReader41, (int) ' ', postingsEnum43, postingsEnum44);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        commonGramsTokenFilterFactoryTests30.assertFieldsEquals("tests.slow", indexReader47, fields48, fields49, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) false);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1431");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) 1L, (float) (-1L), 1.0f);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1432");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (short) 10, 0L);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1433");
        java.lang.Object[] objArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) charSequenceArray38);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1434");
        long[] longArray4 = new long[] { (short) -1 };
        long[] longArray6 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray4, longArray6);
        long[] longArray9 = new long[] { (short) -1 };
        long[] longArray11 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray9, longArray11);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray6, longArray11);
        long[] longArray15 = new long[] { (short) -1 };
        long[] longArray17 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray15, longArray17);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray11, longArray17);
        long[] longArray21 = new long[] { (short) -1 };
        long[] longArray23 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray21, longArray23);
        org.junit.Assert.assertArrayEquals(longArray11, longArray21);
        long[] longArray28 = new long[] { (short) -1 };
        long[] longArray30 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray28, longArray30);
        long[] longArray33 = new long[] { (short) -1 };
        long[] longArray35 = new long[] { (short) -1 };
        org.junit.Assert.assertArrayEquals(longArray33, longArray35);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray30, longArray35);
        org.junit.Assert.assertArrayEquals("random", longArray11, longArray30);
        long[] longArray41 = new long[] { (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray11, longArray41);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1435");
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray7);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray12);
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
        org.junit.Assert.assertArrayEquals(charArray16, charArray19);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals("", charArray16, charArray26);
        org.junit.Assert.assertArrayEquals(charArray12, charArray16);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray4, charArray12);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        org.junit.Assert.assertArrayEquals(charArray33, charArray36);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray42);
        org.junit.Assert.assertArrayEquals(charArray33, charArray39);
        org.junit.Assert.assertArrayEquals("random", charArray4, charArray39);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        org.junit.Assert.assertArrayEquals(charArray49, charArray52);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        org.junit.Assert.assertArrayEquals(charArray56, charArray59);
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray62, charArray63);
        char[] charArray65 = new char[] {};
        char[] charArray66 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray65, charArray66);
        org.junit.Assert.assertArrayEquals(charArray63, charArray66);
        org.junit.Assert.assertArrayEquals(charArray56, charArray63);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray49, charArray56);
        char[] charArray73 = new char[] {};
        char[] charArray74 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray73, charArray74);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        org.junit.Assert.assertArrayEquals(charArray74, charArray77);
        char[] charArray80 = new char[] {};
        char[] charArray81 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray80, charArray81);
        char[] charArray83 = new char[] {};
        char[] charArray84 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray83, charArray84);
        org.junit.Assert.assertArrayEquals(charArray81, charArray84);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray77, charArray84);
        char[] charArray88 = new char[] {};
        char[] charArray89 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray88, charArray89);
        char[] charArray91 = new char[] {};
        char[] charArray92 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray91, charArray92);
        org.junit.Assert.assertArrayEquals(charArray89, charArray92);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray84, charArray92);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray56, charArray84);
        org.junit.Assert.assertArrayEquals(charArray39, charArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) 100.0f, (java.lang.Object) charArray56);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1436");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((-1.0d), (double) (byte) 0, (double) 1);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1437");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[][] charSequenceArray14 = new java.lang.CharSequence[][] { charSequenceArray6, charSequenceArray13 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[][] charSequenceArray31 = new java.lang.CharSequence[][] { charSequenceArray23, charSequenceArray30 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet32 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray31);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests33.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsEnumEquals("tests.awaitsfix", postingsEnum36, postingsEnum37, false);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        commonGramsTokenFilterFactoryTests33.assertTermsEquals("tests.nightly", indexReader41, terms42, terms43, false);
        commonGramsTokenFilterFactoryTests33.setUp();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsSkippingEquals("tests.slow", indexReader48, (int) (short) 10, postingsEnum50, postingsEnum51, true);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        commonGramsTokenFilterFactoryTests33.assertTermsEquals("", indexReader55, terms56, terms57, true);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsSkippingEquals("hi!", indexReader61, (int) (byte) -1, postingsEnum63, postingsEnum64, true);
        commonGramsTokenFilterFactoryTests33.setIndexWriterMaxDocs((int) '#');
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) charSequenceArray31, (java.lang.Object) commonGramsTokenFilterFactoryTests33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray31);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests71 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder72 = commonGramsTokenFilterFactoryTests71.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder72, (java.lang.Object) 100.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests76 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.Fields fields79 = null;
        org.apache.lucene.index.Fields fields80 = null;
        commonGramsTokenFilterFactoryTests76.assertFieldsEquals("random", indexReader78, fields79, fields80, false);
        org.elasticsearch.common.settings.Settings.Builder builder83 = commonGramsTokenFilterFactoryTests76.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) builder83);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray85 = new org.elasticsearch.common.settings.Settings.Builder[] { builder72, builder83 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet86 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray85);
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet87 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray85);
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet88 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray85);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray31, (java.lang.Object[]) builderArray85);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1438");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        byte[] byteArray8 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray7, byteArray8);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1439");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) (-1), (double) 0.0f, (double) 100);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1440");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (-1L), (double) (-1));
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1441");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 'a');
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.slow", indexReader15, fields16, fields17, true);
        java.lang.Class<?> wildcardClass20 = commonGramsTokenFilterFactoryTests1.getClass();
        org.junit.Assert.assertNotNull((java.lang.Object) wildcardClass20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) wildcardClass20);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1442");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader9, 1, postingsEnum11, postingsEnum12, false);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1443");
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
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        org.junit.Assert.assertArrayEquals(charArray48, charArray51);
        org.junit.Assert.assertArrayEquals("", charArray38, charArray48);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests55 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        commonGramsTokenFilterFactoryTests55.assertFieldsEquals("random", indexReader57, fields58, fields59, false);
        org.elasticsearch.common.settings.Settings.Builder builder62 = commonGramsTokenFilterFactoryTests55.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests55, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests55.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests55, (java.lang.Object) "tests.weekly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "", (java.lang.Object) commonGramsTokenFilterFactoryTests55);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1444");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.slow");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1445");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) 10, 0.0d);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1446");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        java.lang.String str9 = commonGramsTokenFilterFactoryTests2.getTestName();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) "tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1447");
        int[] intArray1 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray4, intArray8);
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
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray17);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray38, intArray39);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray42, intArray43);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray38, intArray42);
        org.junit.Assert.assertArrayEquals(intArray17, intArray42);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray49, intArray50);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray54, intArray55);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray58, intArray59);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray54, intArray58);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray49, intArray58);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray17, intArray49);
        org.junit.Assert.assertArrayEquals(intArray8, intArray17);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray68, intArray69);
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray72, intArray73);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray68, intArray72);
        int[] intArray78 = new int[] {};
        int[] intArray79 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray78, intArray79);
        int[] intArray82 = new int[] {};
        int[] intArray83 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray82, intArray83);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray78, intArray82);
        org.junit.Assert.assertArrayEquals(intArray72, intArray78);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling88 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling89 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling90 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling91 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray92 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling88, throttling89, throttling90, throttling91 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet93 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray92);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttlingArray92);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet95 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray92);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) intArray78, (java.lang.Object) throttlingArray92);
        org.junit.Assert.assertArrayEquals(intArray17, intArray78);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray1, intArray78);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1448");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray2, charSequenceArray4 };
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[][] charSequenceArray10 = new java.lang.CharSequence[][] { charSequenceArray7, charSequenceArray9 };
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[][] charSequenceArray15 = new java.lang.CharSequence[][] { charSequenceArray12, charSequenceArray14 };
        java.lang.CharSequence[][][] charSequenceArray16 = new java.lang.CharSequence[][][] { charSequenceArray5, charSequenceArray10, charSequenceArray15 };
        java.util.Set<java.lang.CharSequence[][]> charSequenceArraySet17 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("random", indexReader27, fields28, fields29, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray33 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests18, commonGramsTokenFilterFactoryTests25, commonGramsTokenFilterFactoryTests32 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet34 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray33);
        java.lang.Class<?> wildcardClass35 = baseTokenStreamTestCaseSet34.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        commonGramsTokenFilterFactoryTests36.assertFieldsEquals("random", indexReader38, fields39, fields40, false);
        org.junit.rules.TestRule testRule43 = commonGramsTokenFilterFactoryTests36.ruleChain;
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests36.ruleChain;
        java.lang.Class<?> wildcardClass45 = commonGramsTokenFilterFactoryTests36.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray46 = new java.lang.reflect.GenericDeclaration[] { wildcardClass35, wildcardClass45 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet47 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) charSequenceArray16, (java.lang.Object[]) genericDeclarationArray46);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1449");
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
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests4.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1450");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((-1));
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("random", indexReader8, terms9, terms10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.monster", indexReader14, 2, postingsEnum16, postingsEnum17, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("random", indexReader22, fields23, fields24, false);
        org.elasticsearch.common.settings.Settings.Builder builder27 = commonGramsTokenFilterFactoryTests20.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests20.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule28;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) postingsEnum17, (java.lang.Object) testRule28);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1451");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) -1 };
        byte[] byteArray7 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1452");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1, (double) 1.0f, (double) (short) -1);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1453");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray4 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy2, queryCachingPolicy3 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet5 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray4);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet6 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray4);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy7 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy8 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray9 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy7, queryCachingPolicy8 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet10 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray9);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy11 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy12 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray13 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy11, queryCachingPolicy12 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet14 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray13);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet15 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray13);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray9, (java.lang.Object[]) queryCachingPolicyArray13);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet17 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray9);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) queryCachingPolicyArray4, (java.lang.Object[]) queryCachingPolicyArray9);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy19 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy20 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray21 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy19, queryCachingPolicy20 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet22 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray21);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet23 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray21);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) queryCachingPolicyArray4, (java.lang.Object[]) queryCachingPolicyArray21);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet31 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray30);
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet38 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray30, (java.lang.Object[]) charSequenceArray37);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray4, (java.lang.Object[]) charSequenceArray37);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1454");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, 100L);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1455");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 10L, (double) (short) -1);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1456");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) 0);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        java.lang.String str25 = commonGramsTokenFilterFactoryTests18.getTestName();
        commonGramsTokenFilterFactoryTests18.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) "tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        commonGramsTokenFilterFactoryTests18.tearDown();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        commonGramsTokenFilterFactoryTests18.assertTermsEquals("", indexReader30, terms31, terms32, true);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        commonGramsTokenFilterFactoryTests18.assertTermsEquals("tests.failfast", indexReader36, terms37, terms38, true);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) builder15, (java.lang.Object) true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        commonGramsTokenFilterFactoryTests42.assertFieldsEquals("random", indexReader44, fields45, fields46, false);
        org.junit.rules.TestRule testRule49 = commonGramsTokenFilterFactoryTests42.ruleChain;
        commonGramsTokenFilterFactoryTests42.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        commonGramsTokenFilterFactoryTests42.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader52, (int) (short) 1, postingsEnum54, postingsEnum55);
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        commonGramsTokenFilterFactoryTests42.assertDocsEnumEquals("tests.monster", postingsEnum58, postingsEnum59, true);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        commonGramsTokenFilterFactoryTests42.assertTermsEquals("europarl.lines.txt.gz", indexReader63, terms64, terms65, false);
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        commonGramsTokenFilterFactoryTests42.assertPositionsSkippingEquals("", indexReader69, 10, postingsEnum71, postingsEnum72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) builder15, (java.lang.Object) 10);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1457");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.failfast");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1458");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray16 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests8, commonGramsTokenFilterFactoryTests15 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("random", indexReader27, fields28, fields29, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray33 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests18, commonGramsTokenFilterFactoryTests25, commonGramsTokenFilterFactoryTests32 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet34 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray33);
        java.util.Collection[] collectionArray36 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseCollectionArray37 = (java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) collectionArray36;
        baseTokenStreamTestCaseCollectionArray37[0] = baseTokenStreamTestCaseSet17;
        baseTokenStreamTestCaseCollectionArray37[1] = baseTokenStreamTestCaseSet34;
        java.util.Set<java.util.Collection<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseCollectionSet42 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseCollectionArray37);
        java.util.Set<java.lang.Iterable<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseIterableSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) baseTokenStreamTestCaseCollectionArray37);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests45 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        commonGramsTokenFilterFactoryTests45.assertFieldsEquals("random", indexReader47, fields48, fields49, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        commonGramsTokenFilterFactoryTests52.assertFieldsEquals("random", indexReader54, fields55, fields56, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests59 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray60 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests45, commonGramsTokenFilterFactoryTests52, commonGramsTokenFilterFactoryTests59 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet61 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray60);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) baseTokenStreamTestCaseArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) baseTokenStreamTestCaseCollectionArray37, (java.lang.Object[]) baseTokenStreamTestCaseArray60);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1459");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), (long) '4');
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1460");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray2, charSequenceArray4 };
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[][] charSequenceArray10 = new java.lang.CharSequence[][] { charSequenceArray7, charSequenceArray9 };
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[][] charSequenceArray15 = new java.lang.CharSequence[][] { charSequenceArray12, charSequenceArray14 };
        java.lang.CharSequence[][][] charSequenceArray16 = new java.lang.CharSequence[][][] { charSequenceArray5, charSequenceArray10, charSequenceArray15 };
        java.util.Set<java.lang.CharSequence[][]> charSequenceArraySet17 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray16);
        java.util.Set[] setArray19 = new java.util.Set[0];
        @SuppressWarnings("unchecked")
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[] baseTokenStreamTestCaseSetArray20 = (java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray19;
        java.util.Set<java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseSetSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray19);
        java.util.Set<java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>> baseTokenStreamTestCaseSetSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase>[]) setArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) charSequenceArray16, (java.lang.Object[]) setArray19);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1461");
        java.lang.Object[] objArray0 = null;
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray15, (java.lang.Object[]) charSequenceArray22);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet33 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray32);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet40 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray32, (java.lang.Object[]) charSequenceArray39);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray39);
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet49 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray48);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet63 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray55, (java.lang.Object[]) charSequenceArray62);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray48, (java.lang.Object[]) charSequenceArray62);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) charSequenceArray39, (java.lang.Object[]) charSequenceArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) charSequenceArray62);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1462");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (-1L), (double) (short) 100, (double) (-1L));
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1463");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (-1L));
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1464");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.awaitsfix", postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("tests.nightly", indexReader10, terms11, terms12, false);
        commonGramsTokenFilterFactoryTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("tests.slow", indexReader17, (int) (short) 10, postingsEnum19, postingsEnum20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("", indexReader24, terms25, terms26, true);
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) testRule29);
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
        org.junit.Assert.assertArrayEquals(charArray33, charArray36);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        org.junit.Assert.assertArrayEquals("", charArray33, charArray43);
        char[] charArray47 = new char[] {};
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        org.junit.Assert.assertArrayEquals(charArray50, charArray53);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        org.junit.Assert.assertArrayEquals(charArray57, charArray60);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray53, charArray60);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray67, charArray68);
        org.junit.Assert.assertArrayEquals(charArray65, charArray68);
        char[] charArray71 = new char[] {};
        char[] charArray72 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray71, charArray72);
        char[] charArray74 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray71, charArray74);
        org.junit.Assert.assertArrayEquals(charArray65, charArray71);
        org.junit.Assert.assertArrayEquals(charArray53, charArray71);
        org.junit.Assert.assertArrayEquals(charArray47, charArray53);
        org.junit.Assert.assertArrayEquals(charArray43, charArray53);
        org.junit.Assert.assertNotEquals((java.lang.Object) testRule29, (java.lang.Object) charArray53);
        char[] charArray81 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray53, charArray81);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1465");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 0L, (long) 100);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1466");
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
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("hi!", indexReader15, (int) (short) 10, postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.nightly", (int) (byte) 0, numericDocValues23, numericDocValues24);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1467");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals(charArray9, charArray12);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray5, charArray12);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals(charArray18, charArray21);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals(charArray25, charArray28);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray21, charArray28);
        org.junit.Assert.assertArrayEquals(charArray12, charArray21);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray36);
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
        org.junit.Assert.assertArrayEquals(charArray40, charArray43);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        org.junit.Assert.assertArrayEquals("", charArray40, charArray50);
        org.junit.Assert.assertArrayEquals(charArray36, charArray40);
        org.junit.Assert.assertArrayEquals(charArray21, charArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray40);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1468");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast", "tests.badapples", "tests.awaitsfix", "random", "europarl.lines.txt.gz" };
        java.lang.CharSequence[][] charSequenceArray14 = new java.lang.CharSequence[][] { charSequenceArray6, charSequenceArray13 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests17.assertFieldsEquals("random", indexReader19, fields20, fields21, false);
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests17.ruleChain;
        commonGramsTokenFilterFactoryTests17.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests17.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests17.tearDown();
        java.lang.Class<?> wildcardClass28 = commonGramsTokenFilterFactoryTests17.getClass();
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet35 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray34);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests17, (java.lang.Object) charSequenceArray34);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray42);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet50 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray42, (java.lang.Object[]) charSequenceArray49);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) charSequenceArray34, (java.lang.Object[]) charSequenceArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray34);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1469");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        java.lang.String str9 = commonGramsTokenFilterFactoryTests2.getTestName();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) "tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 0);
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("tests.badapples", 0, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1470");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) (byte) 10, (float) 2);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1471");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray9, byteArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray7, byteArray9);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1472");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, 0L);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1473");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy0 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray2 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy0, queryCachingPolicy1 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet3 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests6.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests6.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests6, (java.lang.Object) "tests.slow");
        java.lang.String str12 = commonGramsTokenFilterFactoryTests6.getTestName();
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests6.ruleChain;
        commonGramsTokenFilterFactoryTests6.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests6.tearDown();
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals(charArray19, charArray22);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals(charArray26, charArray29);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        org.junit.Assert.assertArrayEquals(charArray33, charArray36);
        org.junit.Assert.assertArrayEquals(charArray26, charArray33);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray19, charArray26);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        org.junit.Assert.assertArrayEquals(charArray44, charArray47);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals(charArray51, charArray54);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray47, charArray54);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        org.junit.Assert.assertArrayEquals(charArray59, charArray62);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray54, charArray62);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray26, charArray54);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests6, (java.lang.Object) charArray54);
        char[] charArray68 = new char[] {};
        char[] charArray69 = new char[] {};
        char[][] charArray70 = new char[][] { charArray68, charArray69 };
        java.util.Set<char[]> charArraySet71 = org.apache.lucene.util.LuceneTestCase.asSet(charArray70);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        char[][] charArray74 = new char[][] { charArray72, charArray73 };
        java.util.Set<char[]> charArraySet75 = org.apache.lucene.util.LuceneTestCase.asSet(charArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charArray70, (java.lang.Object[]) charArray74);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests6, (java.lang.Object) charArray70);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) queryCachingPolicyArray2, (java.lang.Object[]) charArray70);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1474");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (byte) 1, (double) 'a', (double) 1.0f);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1475");
        int[] intArray0 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray3, intArray7);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray13, intArray14);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray13, intArray17);
        org.junit.Assert.assertArrayEquals(intArray7, intArray13);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray24, intArray25);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray28, intArray29);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray24, intArray28);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray34, intArray35);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray38, intArray39);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray34, intArray38);
        org.junit.Assert.assertArrayEquals(intArray28, intArray34);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray47, intArray48);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests50 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        commonGramsTokenFilterFactoryTests50.assertFieldsEquals("random", indexReader52, fields53, fields54, false);
        java.lang.String str57 = commonGramsTokenFilterFactoryTests50.getTestName();
        commonGramsTokenFilterFactoryTests50.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        commonGramsTokenFilterFactoryTests50.assertPositionsSkippingEquals("<unknown>", indexReader60, (int) (byte) 10, postingsEnum62, postingsEnum63);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray48, (java.lang.Object) commonGramsTokenFilterFactoryTests50);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "random", (java.lang.Object) intArray48);
        int[] intArray69 = new int[] {};
        int[] intArray70 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray69, intArray70);
        int[] intArray73 = new int[] {};
        int[] intArray74 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray73, intArray74);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray69, intArray73);
        org.junit.Assert.assertArrayEquals(intArray48, intArray73);
        int[] intArray80 = new int[] {};
        int[] intArray81 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray80, intArray81);
        int[] intArray85 = new int[] {};
        int[] intArray86 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray85, intArray86);
        int[] intArray89 = new int[] {};
        int[] intArray90 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray89, intArray90);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray85, intArray89);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray80, intArray89);
        org.junit.Assert.assertArrayEquals("", intArray48, intArray80);
        org.junit.Assert.assertArrayEquals(intArray34, intArray48);
        org.junit.Assert.assertArrayEquals(intArray13, intArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray13);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1476");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) -1, (byte) -1 };
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray6);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1477");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (-1L), (double) 0.0f);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1478");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) 100, (long) (byte) 100);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1479");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) ' ', (-1.0d));
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1480");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        org.junit.Assert.assertArrayEquals(charArray8, charArray11);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        org.junit.Assert.assertArrayEquals(charArray15, charArray18);
        org.junit.Assert.assertArrayEquals(charArray8, charArray15);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray5, charArray8);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals(charArray26, charArray29);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        org.junit.Assert.assertArrayEquals(charArray33, charArray36);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray29, charArray36);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals(charArray42, charArray45);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        org.junit.Assert.assertArrayEquals(charArray49, charArray52);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        org.junit.Assert.assertArrayEquals(charArray56, charArray59);
        org.junit.Assert.assertArrayEquals(charArray49, charArray56);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray42, charArray49);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray36, charArray42);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray5, charArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.badapples");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1481");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, 0.0d);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1482");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((-1));
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("random", indexReader8, terms9, terms10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.monster", indexReader14, 2, postingsEnum16, postingsEnum17, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) indexReader14);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1483");
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
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet27 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray26);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "tests.badapples", "tests.badapples", "tests.awaitsfix", "europarl.lines.txt.gz", "tests.nightly" };
        java.util.Set<java.lang.CharSequence> charSequenceSet34 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray26, (java.lang.Object[]) charSequenceArray33);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[][] charSequenceArray41 = new java.lang.CharSequence[][] { charSequenceArray38, charSequenceArray40 };
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[][] charSequenceArray46 = new java.lang.CharSequence[][] { charSequenceArray43, charSequenceArray45 };
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "" };
        java.lang.CharSequence[][] charSequenceArray51 = new java.lang.CharSequence[][] { charSequenceArray48, charSequenceArray50 };
        java.lang.CharSequence[][][] charSequenceArray52 = new java.lang.CharSequence[][][] { charSequenceArray41, charSequenceArray46, charSequenceArray51 };
        java.util.Set<java.lang.CharSequence[][]> charSequenceArraySet53 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray33, (java.lang.Object[]) charSequenceArray52);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1484");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) (-1L));
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1485");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray5, byteArray11);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1486");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        java.lang.String str8 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("random", indexReader12, fields13, fields14, false);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests10.ruleChain;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("", indexReader19, (int) (short) 10, postingsEnum21, postingsEnum22);
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray24 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests10 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet25 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray24);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        commonGramsTokenFilterFactoryTests26.assertFieldsEquals("random", indexReader28, fields29, fields30, false);
        org.elasticsearch.common.settings.Settings.Builder builder33 = commonGramsTokenFilterFactoryTests26.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests26, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests26.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotSame((java.lang.Object) baseTokenStreamTestCaseSet25, (java.lang.Object) (byte) 100);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        commonGramsTokenFilterFactoryTests39.assertFieldsEquals("random", indexReader41, fields42, fields43, false);
        org.junit.rules.TestRule testRule46 = commonGramsTokenFilterFactoryTests39.ruleChain;
        org.junit.rules.TestRule testRule47 = commonGramsTokenFilterFactoryTests39.ruleChain;
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
        org.junit.rules.TestRule testRule63 = commonGramsTokenFilterFactoryTests48.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests39, (java.lang.Object) commonGramsTokenFilterFactoryTests48);
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        commonGramsTokenFilterFactoryTests39.assertDocsSkippingEquals("tests.failfast", indexReader66, 100, postingsEnum68, postingsEnum69, false);
        commonGramsTokenFilterFactoryTests39.setIndexWriterMaxDocs(10);
        org.junit.Assert.assertNotEquals((java.lang.Object) baseTokenStreamTestCaseSet25, (java.lang.Object) commonGramsTokenFilterFactoryTests39);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests76 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests76.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests76.tearDown();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests76, (java.lang.Object) "tests.slow");
        java.lang.String str82 = commonGramsTokenFilterFactoryTests76.getTestName();
        org.junit.rules.TestRule testRule83 = commonGramsTokenFilterFactoryTests76.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests39, (java.lang.Object) commonGramsTokenFilterFactoryTests76);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1487");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) 10);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1488");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader9, 1, postingsEnum11, postingsEnum12, false);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("", indexReader18, fields19, fields20, false);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1489");
        java.lang.Object obj0 = null;
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
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests5.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) builder28);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1490");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        org.junit.Assert.assertArrayEquals(charArray5, charArray8);
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        org.junit.Assert.assertArrayEquals("", charArray2, charArray12);
        char[] charArray16 = new char[] {};
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals(charArray19, charArray22);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals(charArray26, charArray29);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray22, charArray29);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        org.junit.Assert.assertArrayEquals(charArray34, charArray37);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray43);
        org.junit.Assert.assertArrayEquals(charArray34, charArray40);
        org.junit.Assert.assertArrayEquals(charArray22, charArray40);
        org.junit.Assert.assertArrayEquals(charArray16, charArray22);
        org.junit.Assert.assertArrayEquals(charArray12, charArray22);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray52);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        org.junit.Assert.assertArrayEquals(charArray59, charArray62);
        org.junit.Assert.assertArrayEquals(charArray56, charArray59);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        org.junit.Assert.assertArrayEquals("", charArray56, charArray66);
        org.junit.Assert.assertArrayEquals(charArray52, charArray56);
        org.junit.Assert.assertNotNull((java.lang.Object) charArray52);
        org.junit.Assert.assertArrayEquals(charArray12, charArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray12, (java.lang.Object) 100.0d);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1491");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) 0);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1492");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 100.0f, (double) 0L, 0.0d);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1493");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 10L, (long) 0);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1494");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("random", indexReader22, fields23, fields24, false);
        org.elasticsearch.common.settings.Settings.Builder builder27 = commonGramsTokenFilterFactoryTests20.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests20, (java.lang.Object) 'a');
        commonGramsTokenFilterFactoryTests20.setIndexWriterMaxDocs((int) (byte) 100);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("tests.monster", indexReader33, 100, postingsEnum35, postingsEnum36, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1495");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.Assert.assertNotSame((java.lang.Object) 10.0f, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("<unknown>", (int) ' ', numericDocValues9, numericDocValues10);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1496");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (double) (byte) -1, (double) (-1), (double) (byte) 0);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1497");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("random", indexReader10, fields11, fields12, false);
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests8.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests16.assertFieldsEquals("random", indexReader18, fields19, fields20, false);
        commonGramsTokenFilterFactoryTests16.tearDown();
        commonGramsTokenFilterFactoryTests16.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) builder15, (java.lang.Object) commonGramsTokenFilterFactoryTests16);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) builder15);
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("europarl.lines.txt.gz", 0, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1498");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("random", obj1);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1499");
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
        java.lang.String str16 = commonGramsTokenFilterFactoryTests0.getTestName();
        java.lang.String str17 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader19, terms20, terms21, true);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("hi!", indexReader25, (int) (short) 0, postingsEnum27, postingsEnum28, false);
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum32, postingsEnum33);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1500");
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
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray48, (java.lang.Object[]) charSequenceArray55);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray55);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) charSequenceArray55);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) charSequenceArray55);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests61 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        commonGramsTokenFilterFactoryTests61.assertFieldsEquals("random", indexReader63, fields64, fields65, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests68 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        commonGramsTokenFilterFactoryTests68.assertFieldsEquals("random", indexReader70, fields71, fields72, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests75 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray76 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests61, commonGramsTokenFilterFactoryTests68, commonGramsTokenFilterFactoryTests75 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet77 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray76);
        java.lang.Class<?> wildcardClass78 = baseTokenStreamTestCaseSet77.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests79 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.Fields fields82 = null;
        org.apache.lucene.index.Fields fields83 = null;
        commonGramsTokenFilterFactoryTests79.assertFieldsEquals("random", indexReader81, fields82, fields83, false);
        org.junit.rules.TestRule testRule86 = commonGramsTokenFilterFactoryTests79.ruleChain;
        org.junit.rules.TestRule testRule87 = commonGramsTokenFilterFactoryTests79.ruleChain;
        java.lang.Class<?> wildcardClass88 = commonGramsTokenFilterFactoryTests79.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray89 = new java.lang.reflect.GenericDeclaration[] { wildcardClass78, wildcardClass88 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet90 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) genericDeclarationArray89);
    }
}

