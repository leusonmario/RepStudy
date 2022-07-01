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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 0.0f, (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (byte) 100);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
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
        java.util.Set<java.lang.Class<?>> wildcardClassSet14 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray7);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests16.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests16.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader19, (int) (byte) -1, postingsEnum21, postingsEnum22);
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests16.ruleChain;
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet30 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray29);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests16, (java.lang.Object) charSequenceArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) wildcardClassArray7, (java.lang.Object[]) charSequenceArray29);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray5);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals("", shortArray12, shortArray14);
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray12, shortArray18);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals("", shortArray22, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray22);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray32);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals("", shortArray32, shortArray34);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray39);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray41);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray34, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray39);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray5, shortArray39);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray49);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray52);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray39);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
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
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("hi!", 100, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (short) 0, (double) 2);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) (short) -1);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray19);
        java.util.Set<java.lang.Object> objSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charSequenceArray19);
        java.lang.Object[] objArray23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charSequenceArray19, objArray23);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (-1L), (long) 4);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        short[] shortArray0 = new short[] {};
        short[] shortArray1 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray1);
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray3);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray1);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals("", shortArray11, shortArray13);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray20);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray13, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray18);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals("", shortArray29, shortArray31);
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray29, shortArray35);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray38);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests42.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests42.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests42.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests42.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str48 = commonGramsTokenFilterFactoryTests42.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder49 = commonGramsTokenFilterFactoryTests42.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray1, (java.lang.Object) commonGramsTokenFilterFactoryTests42);
        short[] shortArray51 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray51);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
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
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray52, (double) (-1));
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) doubleArray23);
        double[] doubleArray67 = new double[] { ' ', (-1) };
        double[] doubleArray70 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray67, doubleArray70, (double) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray70, 0.0d);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 100.0d, (double) (short) 0, (-1.0d));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) ' ', (long) (short) 1);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (double) (short) 100, (double) 100L, (double) (byte) 0);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 100L, 0L);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray4, byteArray8);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray14, byteArray15);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray15, byteArray18);
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
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray36);
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray36, byteArray45);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray4, byteArray36);
        byte[] byteArray48 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray48);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 100, 1.0d);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) (-1.0f));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests24.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests24.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader27, (int) (byte) -1, postingsEnum29, postingsEnum30);
        commonGramsTokenFilterFactoryTests24.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder33 = commonGramsTokenFilterFactoryTests24.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests24.setUp();
        java.lang.String str35 = commonGramsTokenFilterFactoryTests24.getTestName();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        commonGramsTokenFilterFactoryTests24.assertFieldsEquals("tests.monster", indexReader37, fields38, fields39, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (byte) 10, (java.lang.Object) fields39);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray1 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet2 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests3.setUp();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) queryCachingPolicySet2, (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        commonGramsTokenFilterFactoryTests3.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        commonGramsTokenFilterFactoryTests3.assertTermsEquals("tests.slow", indexReader9, terms10, terms11, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests14.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests14.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str20 = commonGramsTokenFilterFactoryTests14.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        long[] longArray1 = null;
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
        org.junit.Assert.assertArrayEquals(longArray4, longArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray1, longArray4);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
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
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) 1);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) 4);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 1, (-1.0d));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, 100.0d);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) (-1), (float) 10, 0.0f);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
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
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet27 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray26);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray26);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet36 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray35);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet42 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray41);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray35, (java.lang.Object[]) charSequenceArray41);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet50 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray49);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray49, (java.lang.Object[]) charSequenceArray55);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray41, (java.lang.Object[]) charSequenceArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray5, (java.lang.Object[]) charSequenceArray55);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        double[] doubleArray3 = new double[] { ' ', (-1) };
        double[] doubleArray6 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 100L);
        double[] doubleArray12 = new double[] { ' ', (-1) };
        double[] doubleArray15 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100L);
        double[] doubleArray21 = new double[] { ' ', (-1) };
        double[] doubleArray24 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray24, (double) 100L);
        double[] doubleArray29 = new double[] { ' ', (-1) };
        double[] doubleArray32 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray32, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray24, doubleArray29, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray24, (double) (short) 10);
        double[] doubleArray41 = new double[] { ' ', (-1) };
        double[] doubleArray44 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray44, (double) 100L);
        double[] doubleArray50 = new double[] { ' ', (-1) };
        double[] doubleArray53 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray53, (double) 100L);
        double[] doubleArray58 = new double[] { ' ', (-1) };
        double[] doubleArray61 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray61, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray53, doubleArray58, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray58, (double) 1);
        double[] doubleArray70 = new double[] { ' ', (-1) };
        double[] doubleArray73 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray70, doubleArray73, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray73, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray73, (-1.0d));
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) doubleArray73);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray3, doubleArray73, (double) (short) -1);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (byte) 10, (double) 100, (double) '#');
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests1.ruleChain;
        double[] doubleArray11 = new double[] { ' ', (-1) };
        double[] doubleArray14 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray14, (double) 100L);
        double[] doubleArray19 = new double[] { ' ', (-1) };
        double[] doubleArray22 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray22, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray14, doubleArray19, 100.0d);
        double[] doubleArray29 = new double[] { ' ', (-1) };
        double[] doubleArray32 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray32, (double) 100L);
        double[] doubleArray38 = new double[] { ' ', (-1) };
        double[] doubleArray41 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray41, (double) 100L);
        double[] doubleArray46 = new double[] { ' ', (-1) };
        double[] doubleArray49 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray49, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray41, doubleArray46, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray46, (double) 1);
        double[] doubleArray58 = new double[] { ' ', (-1) };
        double[] doubleArray61 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray61, (double) 100L);
        double[] doubleArray67 = new double[] { ' ', (-1) };
        double[] doubleArray70 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray67, doubleArray70, (double) 100L);
        double[] doubleArray75 = new double[] { ' ', (-1) };
        double[] doubleArray78 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray75, doubleArray78, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray70, doubleArray75, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray75, (double) 1);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray75, (double) (-1));
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray19, doubleArray75, (double) (-1));
        org.junit.Assert.assertNotSame("", (java.lang.Object) testRule6, (java.lang.Object) "enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
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
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet49 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray48);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet55 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray54);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray48, (java.lang.Object[]) charSequenceArray54);
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet62 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray54, (java.lang.Object[]) charSequenceArray61);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray40, (java.lang.Object[]) charSequenceArray61);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) charSequenceArray61);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray61);
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet73 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray72);
        java.lang.CharSequence[] charSequenceArray78 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet79 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray78);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray72, (java.lang.Object[]) charSequenceArray78);
        java.lang.CharSequence[] charSequenceArray85 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet86 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray85);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray78, (java.lang.Object[]) charSequenceArray85);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) charSequenceArray61, (java.lang.Object[]) charSequenceArray85);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests89 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests89.restoreIndexWriterMaxDocs();
        java.lang.String str91 = commonGramsTokenFilterFactoryTests89.getTestName();
        commonGramsTokenFilterFactoryTests89.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum94 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum95 = null;
        commonGramsTokenFilterFactoryTests89.assertDocsEnumEquals("tests.nightly", postingsEnum94, postingsEnum95, false);
        org.elasticsearch.common.settings.Settings.Builder builder98 = commonGramsTokenFilterFactoryTests89.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charSequenceArray61, (java.lang.Object) builder98);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray3, longArray4);
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray3, longArray6);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray9, longArray10);
        org.junit.Assert.assertArrayEquals(longArray6, longArray9);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray16, longArray17);
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray16, longArray19);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray23, longArray24);
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray23, longArray26);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray29, longArray30);
        org.junit.Assert.assertArrayEquals(longArray26, longArray29);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray16, longArray26);
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray36, longArray37);
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray36, longArray39);
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray43, longArray44);
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray43, longArray46);
        org.junit.Assert.assertArrayEquals(longArray36, longArray46);
        org.junit.Assert.assertArrayEquals(longArray16, longArray36);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray9, longArray16);
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
        long[] longArray68 = new long[] {};
        long[] longArray69 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray68, longArray69);
        org.junit.Assert.assertArrayEquals(longArray65, longArray68);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray55, longArray65);
        long[] longArray75 = new long[] {};
        long[] longArray76 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray75, longArray76);
        long[] longArray78 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray75, longArray78);
        org.junit.Assert.assertArrayEquals("", longArray65, longArray75);
        org.junit.Assert.assertArrayEquals(longArray16, longArray75);
        long[] longArray82 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray16, longArray82);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) '#', 1.0d);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
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
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet24 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray23);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet30 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray29);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray23, (java.lang.Object[]) charSequenceArray29);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) charSequenceArray29);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, false);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests12.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests12.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader15, (int) (byte) -1, postingsEnum17, postingsEnum18);
        commonGramsTokenFilterFactoryTests12.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        commonGramsTokenFilterFactoryTests12.assertTermsEquals("enwiki.random.lines.txt", indexReader23, terms24, terms25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        commonGramsTokenFilterFactoryTests12.assertTermsEquals("tests.monster", indexReader29, terms30, terms31, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests35.setUp();
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray42);
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet49 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray48);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray42, (java.lang.Object[]) charSequenceArray48);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests35, (java.lang.Object) charSequenceArray42);
        commonGramsTokenFilterFactoryTests35.tearDown();
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests35.ruleChain;
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests35.ruleChain;
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) terms31, (java.lang.Object) commonGramsTokenFilterFactoryTests35);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsSkippingEquals("tests.maxfailures", indexReader57, (int) 'a', postingsEnum59, postingsEnum60, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests35);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, 1.0d, (-1.0d));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
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
        java.lang.Object obj33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) builder31, obj33);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
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
        char[] charArray49 = new char[] { 'a', '4', '4', '4', '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray49);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        float[] floatArray4 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray8 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray8, (float) 100L);
        float[] floatArray14 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray18 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray18, (float) 100L);
        float[] floatArray24 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray28 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray28, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray24, 1.0f);
        float[] floatArray37 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray41 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray41, (float) 100L);
        float[] floatArray47 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray51 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray51, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray47, 1.0f);
        float[] floatArray59 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray63 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray63, (float) 100L);
        float[] floatArray69 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray73 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray73, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray69, 1.0f);
        org.junit.Assert.assertArrayEquals("random", floatArray37, floatArray59, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray37, (float) 1L);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray24, (-1.0f));
        float[] floatArray87 = new float[] { 10L, 0L, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray4, floatArray87, 10.0f);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) (byte) 100, (float) ' ');
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray3, intArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray4);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray14);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) charSequenceArray8);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests1.ruleChain;
        java.lang.String str20 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        commonGramsTokenFilterFactoryTests21.assertTermsEquals("", indexReader23, terms24, terms25, false);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests21.assertDocsEnumEquals("tests.weekly", postingsEnum29, postingsEnum30, false);
        commonGramsTokenFilterFactoryTests21.setIndexWriterMaxDocs((int) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) str20, (java.lang.Object) commonGramsTokenFilterFactoryTests21);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) '#');
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 100L, (long) (short) 10);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
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
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        short[] shortArray1 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray9);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals("", shortArray9, shortArray11);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray18);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray11, shortArray16);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals("", shortArray26, shortArray28);
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray26, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray26);
        org.junit.Assert.assertArrayEquals("random", shortArray4, shortArray11);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray39);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray37);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray47);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        org.junit.Assert.assertArrayEquals("", shortArray47, shortArray49);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray54);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray56);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray49, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray54);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray65);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray68);
        org.junit.Assert.assertArrayEquals("", shortArray65, shortArray67);
        short[] shortArray71 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray65, shortArray71);
        short[] shortArray73 = new short[] {};
        short[] shortArray74 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray74);
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray74);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray74);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray1, shortArray11);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) (short) 0, (float) (byte) 100, (float) 3);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        commonGramsTokenFilterFactoryTests27.assertTermsEquals("", indexReader29, terms30, terms31, false);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests27.assertDocsEnumEquals("tests.weekly", postingsEnum35, postingsEnum36, false);
        java.lang.String str39 = commonGramsTokenFilterFactoryTests27.getTestName();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests27.assertDocsSkippingEquals("tests.awaitsfix", indexReader41, 10, postingsEnum43, postingsEnum44, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) builder25, (java.lang.Object) indexReader41);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray5);
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray3);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        double[] doubleArray1 = null;
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
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray35, (double) (short) 10);
        double[] doubleArray52 = new double[] { ' ', (-1) };
        double[] doubleArray55 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray55, (double) 100L);
        double[] doubleArray61 = new double[] { ' ', (-1) };
        double[] doubleArray64 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray64, (double) 100L);
        double[] doubleArray69 = new double[] { ' ', (-1) };
        double[] doubleArray72 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray69, doubleArray72, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray64, doubleArray69, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray69, (double) 1);
        double[] doubleArray81 = new double[] { ' ', (-1) };
        double[] doubleArray84 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray81, doubleArray84, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray84, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray84, (-1.0d));
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray84, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray1, doubleArray8, (double) 10);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray3, longArray4);
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray3, longArray6);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray10, longArray11);
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray10, longArray13);
        org.junit.Assert.assertArrayEquals(longArray3, longArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) longArray3);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (byte) 100, 0.0d, 0.0d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
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
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charSequenceArray51);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray3, longArray4);
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray3, longArray6);
        long[] longArray8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray3, longArray8);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray1 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray2 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[][] baseTokenStreamTestCaseArray3 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[][] { baseTokenStreamTestCaseArray1, baseTokenStreamTestCaseArray2 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase[]> baseTokenStreamTestCaseArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray3);
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale6, locale8, locale10 };
        java.util.Set<java.util.Locale> localeSet12 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray11);
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) baseTokenStreamTestCaseArray3, (java.lang.Object[]) localeArray11);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        org.junit.Assert.assertNotEquals((java.lang.Object) 10L, (java.lang.Object) charSequenceSet6);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet18 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray17);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet24 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray23);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray17, (java.lang.Object[]) charSequenceArray23);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet31 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray30);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray23, (java.lang.Object[]) charSequenceArray30);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet39 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray38);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet45 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray44);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray38, (java.lang.Object[]) charSequenceArray44);
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet52 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray44, (java.lang.Object[]) charSequenceArray51);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray30, (java.lang.Object[]) charSequenceArray51);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "hi!", (java.lang.Object) charSequenceArray30);
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet62 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray61);
        java.lang.CharSequence[] charSequenceArray67 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet68 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray67);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray61, (java.lang.Object[]) charSequenceArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray30, (java.lang.Object[]) charSequenceArray61);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) 0, (java.lang.Object) charSequenceArray30);
        org.junit.Assert.assertNotSame((java.lang.Object) charSequenceSet6, (java.lang.Object) 0);
        java.util.Set[] setArray74 = new java.util.Set[1];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[] charSequenceSetArray75 = (java.util.Set<java.lang.CharSequence>[]) setArray74;
        charSequenceSetArray75[0] = charSequenceSet6;
        java.util.Set<java.util.Set<java.lang.CharSequence>> charSequenceSetSet78 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray75);
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet79 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.CharSequence>[]) charSequenceSetArray75);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy80 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass81 = queryCachingPolicy80.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy82 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass83 = queryCachingPolicy82.getClass();
        java.lang.Class[] classArray85 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray86 = (java.lang.Class<?>[]) classArray85;
        wildcardClassArray86[0] = wildcardClass81;
        wildcardClassArray86[1] = wildcardClass83;
        java.util.Set<java.lang.Class<?>> wildcardClassSet91 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceSetArray75, (java.lang.Object[]) wildcardClassArray86);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
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
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet50 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray49);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray49, (java.lang.Object[]) charSequenceArray55);
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet63 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray55, (java.lang.Object[]) charSequenceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray41, (java.lang.Object[]) charSequenceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray62);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray62);
        java.lang.CharSequence[] charSequenceArray73 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet74 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray73);
        java.lang.CharSequence[] charSequenceArray79 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet80 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray79);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray73, (java.lang.Object[]) charSequenceArray79);
        java.lang.CharSequence[] charSequenceArray86 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet87 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray86);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray79, (java.lang.Object[]) charSequenceArray86);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) charSequenceArray62, (java.lang.Object[]) charSequenceArray86);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling90 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray91 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling90 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet92 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray86, (java.lang.Object[]) throttlingArray91);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
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
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.badapples", (int) (short) 100, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        float[] floatArray4 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray8 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray8, (float) 100L);
        float[] floatArray15 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray19 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray19, (float) 100L);
        float[] floatArray25 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray29 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray29, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray25, 1.0f);
        float[] floatArray37 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray41 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray41, (float) 100L);
        float[] floatArray47 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray51 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray51, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray47, 1.0f);
        org.junit.Assert.assertArrayEquals("random", floatArray15, floatArray37, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray15, (float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) (byte) 1);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (-1.0d), (double) (byte) 10);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 3, (long) 2);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        double[] doubleArray6 = new double[] { (short) 1, 0.0d, (short) -1, (-1.0d), 0.0d };
        double[] doubleArray12 = new double[] { (short) 1, 0.0d, (short) -1, (-1.0d), 0.0d };
        double[][] doubleArray13 = new double[][] { doubleArray6, doubleArray12 };
        java.util.Set<double[]> doubleArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray13);
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
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests15.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader30, 0, postingsEnum32, postingsEnum33);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsSkippingEquals("", indexReader36, (int) (short) -1, postingsEnum38, postingsEnum39, true);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        commonGramsTokenFilterFactoryTests15.assertTermsEquals("tests.failfast", indexReader43, terms44, terms45, true);
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet54 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray53);
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet60 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray59);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray53, (java.lang.Object[]) charSequenceArray59);
        java.lang.CharSequence[] charSequenceArray66 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet67 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray66);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray59, (java.lang.Object[]) charSequenceArray66);
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader43, (java.lang.Object) charSequenceArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) doubleArray13, (java.lang.Object[]) charSequenceArray66);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        float[] floatArray4 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray8 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray8, (float) 100L);
        float[] floatArray14 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray18 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray18, (float) 100L);
        float[] floatArray24 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray28 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray28, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray24, 1.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray8, floatArray14, (float) 2);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        java.lang.Object[] objArray1 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", objArray1, (java.lang.Object[]) charSequenceArray41);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
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
        double[] doubleArray75 = new double[] { (short) 10, 4, (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray64, doubleArray75, 0.0d);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str9 = commonGramsTokenFilterFactoryTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) str9);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { ' ', (-1) };
        double[] doubleArray8 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray8, (double) 100L);
        double[] doubleArray13 = new double[] { ' ', (-1) };
        double[] doubleArray16 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray16, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray8, doubleArray13, 100.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray1, doubleArray8, (double) 1);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) -1, (float) 10, (float) 0L);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        java.lang.Class<?> wildcardClass9 = commonGramsTokenFilterFactoryTests0.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests10, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests10.setIndexWriterMaxDocs(0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) wildcardClass9, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
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
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray31, intArray32);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray35, intArray36);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray31, intArray35);
        org.junit.Assert.assertArrayEquals("random", intArray21, intArray31);
        org.junit.Assert.assertArrayEquals(intArray5, intArray21);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray45, intArray46);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray49, intArray50);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray45, intArray49);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray54, intArray55);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray45, intArray54);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) intArray54);
        java.lang.String[] strArray63 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet64 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray63);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray68, intArray69);
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray72, intArray73);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray68, intArray72);
        int[] intArray77 = new int[] {};
        int[] intArray78 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray77, intArray78);
        org.junit.Assert.assertArrayEquals("hi!", intArray72, intArray77);
        int[] intArray84 = new int[] {};
        int[] intArray85 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray84, intArray85);
        int[] intArray88 = new int[] {};
        int[] intArray89 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray88, intArray89);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray84, intArray88);
        int[] intArray93 = new int[] {};
        int[] intArray94 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray93, intArray94);
        org.junit.Assert.assertArrayEquals("hi!", intArray88, intArray93);
        org.junit.Assert.assertArrayEquals(intArray72, intArray93);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray21, intArray54, strArray63, intArray72, (java.lang.Integer) 10);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 2, (double) (short) 10);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray2);
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
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader19, 0, postingsEnum21, postingsEnum22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("", indexReader25, (int) (short) -1, postingsEnum27, postingsEnum28, true);
        commonGramsTokenFilterFactoryTests4.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder32 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests4.setIndexWriterMaxDocs((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) throttlingArray2, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 'a');
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) (byte) 100);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) (short) 100, (double) (byte) 0);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        java.lang.String str8 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader10, (int) '4', postingsEnum12, postingsEnum13, true);
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
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
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray51);
        java.lang.Object[] objArray62 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray51, objArray62);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder3 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.failfast", indexReader11, 10, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.slow", indexReader17, (int) ' ', postingsEnum19, postingsEnum20);
        commonGramsTokenFilterFactoryTests2.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests23.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests23.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests23.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests23.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str29 = commonGramsTokenFilterFactoryTests23.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder30 = commonGramsTokenFilterFactoryTests23.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests23);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder33 = commonGramsTokenFilterFactoryTests32.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests32.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests32, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests32.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsSkippingEquals("<unknown>", indexReader39, 0, postingsEnum41, postingsEnum42, false);
        commonGramsTokenFilterFactoryTests32.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) "tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests32);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray3);
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
        org.junit.Assert.assertArrayEquals("", longArray2, longArray19);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests36.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests36);
        org.junit.rules.TestRule testRule39 = commonGramsTokenFilterFactoryTests36.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsEnumEquals("tests.failfast", postingsEnum41, postingsEnum42, true);
        java.lang.String str45 = commonGramsTokenFilterFactoryTests36.getTestName();
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object) "", (java.lang.Object) str45);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder3 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.failfast", indexReader11, 10, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.slow", indexReader17, (int) ' ', postingsEnum19, postingsEnum20);
        commonGramsTokenFilterFactoryTests2.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests23.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests23.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests23.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests23.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str29 = commonGramsTokenFilterFactoryTests23.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder30 = commonGramsTokenFilterFactoryTests23.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests23);
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) (byte) -1);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRuleArray89);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        double[] doubleArray4 = new double[] { ' ', (-1) };
        double[] doubleArray7 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 100L);
        double[] doubleArray12 = new double[] { ' ', (-1) };
        double[] doubleArray15 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray12, 100.0d);
        double[] doubleArray23 = new double[] { ' ', (-1) };
        double[] doubleArray26 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray26, (double) 100L);
        double[] doubleArray31 = new double[] { ' ', (-1) };
        double[] doubleArray34 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray34, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray26, doubleArray31, 100.0d);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray12, doubleArray26, (double) 1L);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 3, (long) '#');
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals("", shortArray11, shortArray13);
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray11, shortArray17);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals("", shortArray21, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) shortArray17);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("<unknown>", (double) '#', (double) (short) 100, 100.0d);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) (short) 0, (float) 3, 0.0f);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.awaitsfix", true);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        long[] longArray0 = null;
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray4, longArray5);
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
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray37, longArray38);
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray37, longArray40);
        org.junit.Assert.assertArrayEquals(longArray30, longArray40);
        org.junit.Assert.assertArrayEquals(longArray10, longArray30);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray5, longArray30);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray49, longArray50);
        long[] longArray52 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray49, longArray52);
        long[] longArray56 = new long[] {};
        long[] longArray57 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray56, longArray57);
        long[] longArray59 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray56, longArray59);
        long[] longArray62 = new long[] {};
        long[] longArray63 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray62, longArray63);
        org.junit.Assert.assertArrayEquals(longArray59, longArray62);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray49, longArray59);
        long[] longArray69 = new long[] {};
        long[] longArray70 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray69, longArray70);
        long[] longArray72 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray69, longArray72);
        long[] longArray76 = new long[] {};
        long[] longArray77 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray76, longArray77);
        long[] longArray79 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray76, longArray79);
        org.junit.Assert.assertArrayEquals(longArray69, longArray79);
        org.junit.Assert.assertArrayEquals(longArray49, longArray69);
        long[] longArray85 = new long[] {};
        long[] longArray86 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray85, longArray86);
        long[] longArray88 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray85, longArray88);
        long[] longArray91 = new long[] {};
        long[] longArray92 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray91, longArray92);
        org.junit.Assert.assertArrayEquals(longArray88, longArray91);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray69, longArray88);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray30, longArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray88);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (-1.0d), (double) 10.0f);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 100.0f, (float) (short) 1, (float) (short) 1);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (long) (-1), (long) (-1));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 'a', (double) 1);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
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
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling40 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray41 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling40 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray41);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray44 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling43 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet45 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray44);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests47 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests47.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests47);
        org.junit.rules.TestRule testRule50 = commonGramsTokenFilterFactoryTests47.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule50);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray44, (java.lang.Object) testRule50);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray41, (java.lang.Object[]) throttlingArray44);
        org.junit.Assert.assertNotNull((java.lang.Object) throttlingArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) testRuleArray37, (java.lang.Object[]) throttlingArray41);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) 1.0f, (double) 0L, (double) 100);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
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
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) throttlingArray3, (java.lang.Object[]) wildcardClassArray22);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray18);
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet26 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray25);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet35 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray34);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet41 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray40);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray34, (java.lang.Object[]) charSequenceArray40);
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet49 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray48);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet55 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray54);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray48, (java.lang.Object[]) charSequenceArray54);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray40, (java.lang.Object[]) charSequenceArray54);
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray25, (java.lang.Object) charSequenceArray40);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray25, (java.lang.Object[]) charSequenceArray94);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) charSequenceArray94);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        short[] shortArray0 = new short[] {};
        short[] shortArray1 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray1);
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray3);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray1);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals("", shortArray11, shortArray13);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray20);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray13, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray18);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests26.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests26);
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests26.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray1, (java.lang.Object) testRule29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule29, (java.lang.Object) (byte) 0);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 1, (double) 4, (double) 3);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) 100.0f);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) (byte) -1);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
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
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray19, intArray20);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray23, intArray24);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray19, intArray23);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray28, intArray29);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray19, intArray28);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray34, intArray35);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray38, intArray39);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray34, intArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray4, intArray13, intArray19, intArray38, (java.lang.Integer) 2);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
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
        java.lang.String str31 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.maxfailures", (int) (byte) 100, numericDocValues34, numericDocValues35);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray5, intArray6);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray9, intArray10);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray5, intArray9);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray15, intArray16);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray19, intArray20);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray15, intArray19);
        org.junit.Assert.assertArrayEquals("random", intArray5, intArray15);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray28, intArray29);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray32, intArray33);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray28, intArray32);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray37, intArray38);
        org.junit.Assert.assertArrayEquals("hi!", intArray32, intArray37);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray44, intArray45);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray48, intArray49);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray44, intArray48);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray53, intArray54);
        org.junit.Assert.assertArrayEquals("hi!", intArray48, intArray53);
        org.junit.Assert.assertArrayEquals(intArray32, intArray53);
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
        org.junit.Assert.assertArrayEquals("hi!", intArray65, intArray70);
        int[] intArray77 = new int[] {};
        int[] intArray78 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray77, intArray78);
        int[] intArray81 = new int[] {};
        int[] intArray82 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray81, intArray82);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray77, intArray81);
        int[] intArray86 = new int[] {};
        int[] intArray87 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray86, intArray87);
        org.junit.Assert.assertArrayEquals("hi!", intArray81, intArray86);
        org.junit.Assert.assertArrayEquals(intArray65, intArray86);
        org.junit.Assert.assertArrayEquals("hi!", intArray32, intArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray5, intArray65);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 100.0f, (double) (-1));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder3 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) builder3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) builder3);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray6);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals("", shortArray13, shortArray15);
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray13, shortArray19);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals("", shortArray23, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray23);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals("", shortArray33, shortArray35);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray42);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray35, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray40);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray6, shortArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.slow", true);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) testRule23);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader5, 10, postingsEnum7, postingsEnum8, false);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        java.lang.Object obj13 = new java.lang.Object();
        org.junit.Assert.assertNotEquals(obj13, (java.lang.Object) "");
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
        org.elasticsearch.common.settings.Settings.Builder builder36 = commonGramsTokenFilterFactoryTests16.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("random", obj13, (java.lang.Object) builder36);
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
        org.apache.lucene.index.Fields fields54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        commonGramsTokenFilterFactoryTests38.assertFieldsEquals("enwiki.random.lines.txt", indexReader53, fields54, fields55, true);
        commonGramsTokenFilterFactoryTests38.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests38.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule60 = commonGramsTokenFilterFactoryTests38.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests38);
        org.elasticsearch.common.settings.Settings.Builder builder62 = commonGramsTokenFilterFactoryTests38.newAnalysisSettingsBuilder();
        java.lang.String str63 = commonGramsTokenFilterFactoryTests38.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) builder11, (java.lang.Object) commonGramsTokenFilterFactoryTests38);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray1 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray2 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[][] baseTokenStreamTestCaseArray3 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[][] { baseTokenStreamTestCaseArray1, baseTokenStreamTestCaseArray2 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase[]> baseTokenStreamTestCaseArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray3);
        java.lang.Object[] objArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) baseTokenStreamTestCaseArray3, objArray5);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
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
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests15.assertDocValuesEquals("tests.weekly", 4, numericDocValues33, numericDocValues34);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) (short) 100, (double) (byte) 10);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (-1L), (double) 1L);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0, (double) 100L, (double) (short) 100);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
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
        org.junit.Assert.assertNotNull((java.lang.Object) throttlingArray2);
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray2);
        short[] shortArray22 = new short[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (short) 1 };
        short[] shortArray28 = new short[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (short) 1 };
        short[] shortArray34 = new short[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (short) 1 };
        short[] shortArray40 = new short[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (short) 1 };
        short[][] shortArray41 = new short[][] { shortArray22, shortArray28, shortArray34, shortArray40 };
        java.util.Set<short[]> shortArraySet42 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray2, (java.lang.Object[]) shortArray41);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 1L, (double) 1);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (short) 100, 10L);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        commonGramsTokenFilterFactoryTests10.assertTermsEquals("", indexReader12, terms13, terms14, false);
        java.lang.String str17 = commonGramsTokenFilterFactoryTests10.getTestName();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("", indexReader19, fields20, fields21, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
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
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray24, intArray25);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray28, intArray29);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray24, intArray28);
        org.junit.Assert.assertArrayEquals(intArray13, intArray24);
        int[] intArray33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray24, intArray33);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 2, (-1.0d), (double) (short) 1);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests18.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests18.setUp();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("tests.badapples", indexReader25, fields26, fields27, true);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray32);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals("", shortArray32, shortArray34);
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader25, (java.lang.Object) shortArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) postingsEnum14, (java.lang.Object) shortArray34);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 0, 10.0d, (double) '#');
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) -1, (double) 1L, (double) (short) 0);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("random", 1, numericDocValues6, numericDocValues7);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1L), (double) ' ', (double) (short) 100);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
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
        double[] doubleArray66 = new double[] { 100L, ' ', 3, 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray13, doubleArray66, (double) (short) 1);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) 10);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
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
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet51 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray50);
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet57 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray56);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray50, (java.lang.Object[]) charSequenceArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray41, (java.lang.Object[]) charSequenceArray56);
        java.lang.Object obj60 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) charSequenceArray56, obj60);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 1, (float) 100L, (float) (short) 1);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
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
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.nightly", (-1), numericDocValues18, numericDocValues19);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
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
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray20, intArray21);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray24, intArray25);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray20, intArray24);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray30, intArray31);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray34, intArray35);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray30, intArray34);
        org.junit.Assert.assertArrayEquals("random", intArray20, intArray30);
        org.junit.Assert.assertArrayEquals(intArray4, intArray20);
        int[] intArray40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray4, intArray40);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
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
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.awaitsfix", (int) (byte) 10, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) 10, (double) (byte) 0);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
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
        float[] floatArray36 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray40 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray40, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray36, 1.0f);
        org.junit.Assert.assertArrayEquals("random", floatArray4, floatArray26, (float) (-1));
        float[] floatArray47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray47, (float) (short) 100);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100, (float) 0L, 1.0f);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray3, longArray4);
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray3, longArray6);
        long[] longArray10 = new long[] { (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray6, longArray10);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("", indexReader5, fields6, fields7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.slow", indexReader11, fields12, fields13, false);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray34, (java.lang.Object[]) charSequenceArray55);
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet65 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray64);
        java.lang.CharSequence[] charSequenceArray70 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet71 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray70);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray64, (java.lang.Object[]) charSequenceArray70);
        java.lang.CharSequence[] charSequenceArray77 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet78 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray77);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray70, (java.lang.Object[]) charSequenceArray77);
        java.util.Set<java.lang.Object> objSet80 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charSequenceArray77);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray55, (java.lang.Object[]) charSequenceArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) fields13, (java.lang.Object) charSequenceArray55);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0f, (float) 1, 1.0f);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule4);
        org.junit.Assert.assertNotNull((java.lang.Object) testRule4);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests7.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests7.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests7.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule4, (java.lang.Object) testRule10);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("random");
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
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray27, byteArray28);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray28, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) locale2, (java.lang.Object) byteArray31);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) (short) 100);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) 10, 1L);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
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
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) wildcardClassArray7);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[]) wildcardClassArray7);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray37, (java.lang.Object[]) charSequenceArray58);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "hi!", (java.lang.Object) charSequenceArray37);
        java.lang.CharSequence[] charSequenceArray68 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet69 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray68);
        java.lang.CharSequence[] charSequenceArray74 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet75 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray74);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray68, (java.lang.Object[]) charSequenceArray74);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray37, (java.lang.Object[]) charSequenceArray68);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) 0, (java.lang.Object) charSequenceArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) wildcardClassArray7, (java.lang.Object[]) charSequenceArray37);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 'a', (double) 0.0f, (double) 10L);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests17.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests17.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests17, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests17.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        commonGramsTokenFilterFactoryTests17.assertTermsEquals("", indexReader25, terms26, terms27, false);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests17.assertPositionsSkippingEquals("tests.nightly", indexReader31, (int) (byte) 10, postingsEnum33, postingsEnum34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) postingsEnum34);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) '4', (double) (byte) 10);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (long) (short) 100, 100L);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray5, floatArray38, 0.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) floatArray38);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
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
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.failfast", (int) (byte) 1, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 0.0d, (double) 10L, (double) 1L);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
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
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray5, shortArray16);
        java.lang.Class<?> wildcardClass21 = shortArray5.getClass();
        java.lang.Object obj22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) wildcardClass21, obj22);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (-1.0f), (double) (short) 10);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) (-1L), (double) 100);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.Object[] objArray9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray5, objArray9);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray3, longArray4);
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray3, longArray6);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray9, longArray10);
        org.junit.Assert.assertArrayEquals(longArray6, longArray9);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray16, longArray17);
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray16, longArray19);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray23, longArray24);
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray23, longArray26);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray29, longArray30);
        org.junit.Assert.assertArrayEquals(longArray26, longArray29);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray16, longArray26);
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray36, longArray37);
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray36, longArray39);
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray43, longArray44);
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray43, longArray46);
        org.junit.Assert.assertArrayEquals(longArray36, longArray46);
        org.junit.Assert.assertArrayEquals(longArray16, longArray36);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray9, longArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests51 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        commonGramsTokenFilterFactoryTests51.assertTermsEquals("", indexReader53, terms54, terms55, false);
        java.lang.String str58 = commonGramsTokenFilterFactoryTests51.getTestName();
        commonGramsTokenFilterFactoryTests51.setUp();
        java.lang.String str60 = commonGramsTokenFilterFactoryTests51.getTestName();
        commonGramsTokenFilterFactoryTests51.tearDown();
        commonGramsTokenFilterFactoryTests51.setIndexWriterMaxDocs((-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.monster", (java.lang.Object) (-1));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) builder16);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        commonGramsTokenFilterFactoryTests22.assertTermsEquals("", indexReader24, terms25, terms26, false);
        java.lang.String str29 = commonGramsTokenFilterFactoryTests22.getTestName();
        commonGramsTokenFilterFactoryTests22.setUp();
        java.lang.String str31 = commonGramsTokenFilterFactoryTests22.getTestName();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        commonGramsTokenFilterFactoryTests22.assertFieldsEquals("tests.failfast", indexReader33, fields34, fields35, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests22);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum7, postingsEnum8);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        java.lang.Class<?> wildcardClass7 = commonGramsTokenFilterFactoryTests0.getClass();
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray10, longArray11);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray15, longArray16);
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray15, longArray18);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray21, longArray22);
        org.junit.Assert.assertArrayEquals(longArray18, longArray21);
        org.junit.Assert.assertArrayEquals(longArray10, longArray18);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray29, longArray30);
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray29, longArray32);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray35, longArray36);
        org.junit.Assert.assertArrayEquals(longArray32, longArray35);
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
        org.junit.Assert.assertArrayEquals("tests.monster", longArray35, longArray42);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray10, longArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) wildcardClass7, (java.lang.Object) longArray35);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum5, postingsEnum6);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray12);
        java.util.Collection[] collectionArray16 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray17 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray16;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.CharSequence>[]) collectionArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) collectionArray16);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.slow", 4, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
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
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray58);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) charSequenceArray58);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        java.lang.Object obj0 = null;
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
        commonGramsTokenFilterFactoryTests2.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) (short) 0);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
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
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.failfast", indexReader28, terms29, terms30, true);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet39 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray38);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet45 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray44);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray38, (java.lang.Object[]) charSequenceArray44);
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet52 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray44, (java.lang.Object[]) charSequenceArray51);
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader28, (java.lang.Object) charSequenceArray51);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling55 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray56 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling55 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet57 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray56);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling59 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray60 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling59 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet61 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray60);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling62 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray63 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling62 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet64 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray63);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests66 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests66.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests66);
        org.junit.rules.TestRule testRule69 = commonGramsTokenFilterFactoryTests66.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule69);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray63, (java.lang.Object) testRule69);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray60, (java.lang.Object[]) throttlingArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray56, (java.lang.Object[]) throttlingArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray51, (java.lang.Object[]) throttlingArray63);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) 100, (float) (-1), (float) (short) 0);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) (short) 1);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (-1.0f), (double) 3, (double) (byte) 0);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (-1L), 0.0d);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 0.0f);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 0L);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
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
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) wildcardClassArray7);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[]) wildcardClassArray7);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet22 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray21);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet28 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray27);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray21, (java.lang.Object[]) charSequenceArray27);
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
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "hi!", (java.lang.Object) charSequenceArray50);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) charSequenceArray27, (java.lang.Object[]) charSequenceArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray7, (java.lang.Object[]) charSequenceArray27);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        float[] floatArray4 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray8 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray8, (float) 100L);
        float[] floatArray14 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray18 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray18, (float) 100L);
        float[] floatArray24 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray28 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray28, (float) 100L);
        float[] floatArray34 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray38 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray38, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray34, 1.0f);
        float[] floatArray47 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray51 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray51, (float) 100L);
        float[] floatArray57 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray61 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray61, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray57, 1.0f);
        float[] floatArray69 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray73 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray73, (float) 100L);
        float[] floatArray79 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray83 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray79, floatArray83, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray79, 1.0f);
        org.junit.Assert.assertArrayEquals("random", floatArray47, floatArray69, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray47, (float) 1L);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray34, (-1.0f));
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray8, floatArray34, 0.0f);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
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
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray86 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet87 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) charSequenceArray10, (java.lang.Object[]) queryCachingPolicyArray86);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.monster", postingsEnum9, postingsEnum10, true);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule13;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule13);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
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
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray18, (double) (short) 10);
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
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray67, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray67, (-1.0d));
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) doubleArray67);
        org.apache.lucene.index.NumericDocValues numericDocValues77 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.maxfailures", (int) (byte) 1, numericDocValues77, numericDocValues78);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
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
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
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
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals("", shortArray38, shortArray40);
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray38, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray38);
        org.junit.Assert.assertArrayEquals("random", shortArray16, shortArray23);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray49);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray23, shortArray48);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray55);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray53);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray63);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray66);
        org.junit.Assert.assertArrayEquals("", shortArray63, shortArray65);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray70);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray70, shortArray72);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray65, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray70);
        short[] shortArray80 = new short[] {};
        short[] shortArray81 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray80, shortArray81);
        short[] shortArray83 = new short[] {};
        short[] shortArray84 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray83, shortArray84);
        org.junit.Assert.assertArrayEquals("", shortArray81, shortArray83);
        short[] shortArray87 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray81, shortArray87);
        short[] shortArray89 = new short[] {};
        short[] shortArray90 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray89, shortArray90);
        org.junit.Assert.assertArrayEquals(shortArray87, shortArray90);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray90);
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray53);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray3, shortArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
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
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.nightly", 3, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 0, (float) 3, (float) (short) -1);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 2);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) 100L, (double) 100L, (double) '#');
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
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
        org.junit.Assert.assertArrayEquals(intArray13, intArray22);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray2, byteArray3);
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
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray31, byteArray32);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray35, byteArray36);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray32, byteArray36);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray41, byteArray42);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray45, byteArray46);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray42, byteArray45);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray36, byteArray42);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray20, byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray3);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
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
        commonGramsTokenFilterFactoryTests16.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests16);
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests16.ruleChain;
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray26 = new java.util.Locale[] { locale21, locale23, locale25 };
        java.util.Set<java.util.Locale> localeSet27 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray26);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) testRule19, (java.lang.Object) localeArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule14, (java.lang.Object) localeArray26);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
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
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.monster", 3, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        java.lang.String str2 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.nightly", postingsEnum5, postingsEnum6, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests14.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20);
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests14.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests14);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests10, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests10.setUp();
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsSkippingEquals("", indexReader28, 10, postingsEnum30, postingsEnum31, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) false);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
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
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray6);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet25 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray24);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray24);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet32 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray31);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray24, (java.lang.Object[]) charSequenceArray31);
        java.util.Set<java.lang.Object> objSet34 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charSequenceArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) wildcardClassArray6, (java.lang.Object[]) charSequenceArray31);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
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
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet27 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray26);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) wildcardClassArray7, (java.lang.Object[]) charSequenceArray20);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (short) 10, (long) 4);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) '4', (double) 4, (double) '4');
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        long[] longArray1 = null;
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray4, longArray5);
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray4, longArray7);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray10, longArray11);
        org.junit.Assert.assertArrayEquals(longArray7, longArray10);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray17, longArray18);
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray17, longArray20);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray23, longArray24);
        org.junit.Assert.assertArrayEquals(longArray20, longArray23);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray30, longArray31);
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray30, longArray33);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray37, longArray38);
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray37, longArray40);
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray43, longArray44);
        org.junit.Assert.assertArrayEquals(longArray40, longArray43);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray30, longArray40);
        long[] longArray50 = new long[] {};
        long[] longArray51 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray50, longArray51);
        long[] longArray53 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray50, longArray53);
        long[] longArray57 = new long[] {};
        long[] longArray58 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray57, longArray58);
        long[] longArray60 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray57, longArray60);
        org.junit.Assert.assertArrayEquals(longArray50, longArray60);
        org.junit.Assert.assertArrayEquals(longArray30, longArray50);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray23, longArray30);
        long[] longArray69 = new long[] {};
        long[] longArray70 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray69, longArray70);
        long[] longArray72 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray69, longArray72);
        long[] longArray76 = new long[] {};
        long[] longArray77 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray76, longArray77);
        long[] longArray79 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray76, longArray79);
        long[] longArray82 = new long[] {};
        long[] longArray83 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray82, longArray83);
        org.junit.Assert.assertArrayEquals(longArray79, longArray82);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray69, longArray79);
        long[] longArray89 = new long[] {};
        long[] longArray90 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray89, longArray90);
        long[] longArray92 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray89, longArray92);
        org.junit.Assert.assertArrayEquals("", longArray79, longArray89);
        org.junit.Assert.assertArrayEquals(longArray30, longArray89);
        org.junit.Assert.assertArrayEquals(longArray7, longArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray1, longArray30);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
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
        java.lang.Object[] objArray83 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray64, objArray83);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
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
        java.lang.Object obj30 = new java.lang.Object();
        org.junit.Assert.assertNotEquals(obj30, (java.lang.Object) "");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests33.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader35, 0, postingsEnum37, postingsEnum38);
        commonGramsTokenFilterFactoryTests33.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests33.assertPositionsSkippingEquals("tests.weekly", indexReader42, (int) '#', postingsEnum44, postingsEnum45);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        commonGramsTokenFilterFactoryTests33.assertFieldsEquals("enwiki.random.lines.txt", indexReader48, fields49, fields50, true);
        org.elasticsearch.common.settings.Settings.Builder builder53 = commonGramsTokenFilterFactoryTests33.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("random", obj30, (java.lang.Object) builder53);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests55 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        commonGramsTokenFilterFactoryTests55.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader57, 0, postingsEnum59, postingsEnum60);
        commonGramsTokenFilterFactoryTests55.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests55.assertPositionsSkippingEquals("tests.weekly", indexReader64, (int) '#', postingsEnum66, postingsEnum67);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        commonGramsTokenFilterFactoryTests55.assertFieldsEquals("enwiki.random.lines.txt", indexReader70, fields71, fields72, true);
        commonGramsTokenFilterFactoryTests55.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests55.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule77 = commonGramsTokenFilterFactoryTests55.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests55);
        org.elasticsearch.common.settings.Settings.Builder builder79 = commonGramsTokenFilterFactoryTests55.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        commonGramsTokenFilterFactoryTests55.assertPositionsSkippingEquals("random", indexReader81, (int) '#', postingsEnum83, postingsEnum84);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray87 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet88 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray87);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests89 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests89.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests89.setUp();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) queryCachingPolicySet88, (java.lang.Object) commonGramsTokenFilterFactoryTests89);
        org.junit.Assert.assertNotEquals((java.lang.Object) "random", (java.lang.Object) queryCachingPolicySet88);
        java.util.Set[][] setArray95 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray96 = (java.util.Set<java.lang.CharSequence>[][]) setArray95;
        java.util.Set<java.util.Set<java.lang.CharSequence>[]> charSequenceSetArraySet97 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray96);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) charSequenceSetArray96);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceSetArray96);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        short[] shortArray0 = new short[] {};
        short[] shortArray1 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray1);
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray4);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray5, intArray6);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray9, intArray10);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray5, intArray9);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray15, intArray16);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray19, intArray20);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray15, intArray19);
        org.junit.Assert.assertArrayEquals("random", intArray5, intArray15);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray28, intArray29);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray32, intArray33);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray28, intArray32);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray37, intArray38);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray28, intArray37);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) intArray37);
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray46);
        int[] intArray49 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray5, intArray37, strArray46, intArray49, (java.lang.Integer) 2);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader14, (int) (short) 0, postingsEnum16, postingsEnum17);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) byteArray25);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("", indexReader6, (int) (byte) 1, postingsEnum8, postingsEnum9);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests11.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests11.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader14, (int) (byte) -1, postingsEnum16, postingsEnum17);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests11.assertFieldsEquals("random", indexReader20, fields21, fields22, false);
        commonGramsTokenFilterFactoryTests11.setIndexWriterMaxDocs(0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) postingsEnum8, (java.lang.Object) 0);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
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
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("<unknown>", postingsEnum24, postingsEnum25, true);
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.slow", 3, numericDocValues30, numericDocValues31);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
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
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) wildcardClassArray7);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray33, (java.lang.Object[]) charSequenceArray54);
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet64 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray63);
        java.lang.CharSequence[] charSequenceArray69 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet70 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray69);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray63, (java.lang.Object[]) charSequenceArray69);
        java.lang.CharSequence[] charSequenceArray76 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet77 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray76);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray69, (java.lang.Object[]) charSequenceArray76);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) charSequenceArray33, (java.lang.Object[]) charSequenceArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray7, (java.lang.Object[]) charSequenceArray76);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (byte) 1, (double) 2);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray3);
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray2, longArray5);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray9, longArray10);
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray9, longArray12);
        org.junit.Assert.assertArrayEquals(longArray2, longArray12);
        long[] longArray15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray15);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
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
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        commonGramsTokenFilterFactoryTests16.assertTermsEquals("", indexReader18, terms19, terms20, false);
        java.lang.String str23 = commonGramsTokenFilterFactoryTests16.getTestName();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        commonGramsTokenFilterFactoryTests16.assertFieldsEquals("", indexReader25, fields26, fields27, true);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        commonGramsTokenFilterFactoryTests16.assertFieldsEquals("", indexReader31, fields32, fields33, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray19);
        java.util.Set<java.lang.Object> objSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charSequenceArray19);
        short[][] shortArray23 = new short[][] {};
        java.util.Set<short[]> shortArraySet24 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) shortArray23);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray2, byteArray3);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray8, byteArray9);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray12, byteArray13);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray9, byteArray13);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray18, byteArray19);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray22, byteArray23);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray19, byteArray22);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray13, byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray19);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader30, 0, postingsEnum32, postingsEnum33);
        commonGramsTokenFilterFactoryTests28.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("random", indexReader37, fields38, fields39, true);
        org.elasticsearch.common.settings.Settings.Builder builder42 = commonGramsTokenFilterFactoryTests28.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) byteArray19, (java.lang.Object) builder42);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, 100L);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) charSequenceArray14);
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("hi!", (int) (short) 0, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) (short) 0, (float) 10L, (-1.0f));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
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
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) luceneTestCaseArray24, (java.lang.Object[]) strArray30);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (short) -1, 100L);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str6 = commonGramsTokenFilterFactoryTests0.getTestName();
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
        commonGramsTokenFilterFactoryTests7.setUp();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        commonGramsTokenFilterFactoryTests7.assertTermsEquals("<unknown>", indexReader23, terms24, terms25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests7.assertPositionsSkippingEquals("", indexReader29, (int) (short) 1, postingsEnum31, postingsEnum32);
        commonGramsTokenFilterFactoryTests7.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests7);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) (byte) 1);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        char[] charArray0 = null;
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
        org.junit.Assert.assertArrayEquals(charArray2, charArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray2);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet12 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray11);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) charSequenceArray11);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray15 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet16 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests17.setUp();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) queryCachingPolicySet16, (java.lang.Object) commonGramsTokenFilterFactoryTests17);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        commonGramsTokenFilterFactoryTests17.assertTermsEquals("tests.awaitsfix", indexReader22, terms23, terms24, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charSequenceArray11, (java.lang.Object) terms23);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 'a', (long) (byte) 10);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
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
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum30, postingsEnum31);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        float[] floatArray3 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray7 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, (float) 100L);
        float[] floatArray13 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray17 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray17, (float) 100L);
        float[] floatArray23 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray27 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray27, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray23, 1.0f);
        float[] floatArray36 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray40 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray40, (float) 100L);
        float[] floatArray46 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray50 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray50, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray46, 1.0f);
        float[] floatArray58 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray62 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray58, floatArray62, (float) 100L);
        float[] floatArray68 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray72 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray68, floatArray72, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray58, floatArray68, 1.0f);
        org.junit.Assert.assertArrayEquals("random", floatArray36, floatArray58, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray36, (float) 1L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray36, (float) 4);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) 2);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
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
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling19 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray20);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling22 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests26.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests26);
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests26.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule29);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray23, (java.lang.Object) testRule29);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray20, (java.lang.Object[]) throttlingArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) charSequenceArray15, (java.lang.Object[]) throttlingArray20);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray5);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray12);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray5, shortArray10);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals("", shortArray20, shortArray22);
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray20, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray20);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray32);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray32);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray49);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray49);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests57 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        commonGramsTokenFilterFactoryTests57.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader59, 0, postingsEnum61, postingsEnum62);
        commonGramsTokenFilterFactoryTests57.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        commonGramsTokenFilterFactoryTests57.assertPositionsSkippingEquals("tests.weekly", indexReader66, (int) '#', postingsEnum68, postingsEnum69);
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        commonGramsTokenFilterFactoryTests57.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader72, 0, postingsEnum74, postingsEnum75);
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        commonGramsTokenFilterFactoryTests57.assertDocsSkippingEquals("", indexReader78, (int) (short) -1, postingsEnum80, postingsEnum81, true);
        commonGramsTokenFilterFactoryTests57.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder85 = commonGramsTokenFilterFactoryTests57.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArray49, (java.lang.Object) commonGramsTokenFilterFactoryTests57);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
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
        java.lang.Object obj95 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) (short) 1, obj95);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray2 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet3 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests4.setUp();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) queryCachingPolicySet3, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        commonGramsTokenFilterFactoryTests4.setUp();
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests4);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) 100L, (float) ' ', (float) (-1));
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) fields11);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 0, 1.0f, (float) (byte) -1);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
        double[] doubleArray4 = new double[] { ' ', (-1) };
        double[] doubleArray7 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 100L);
        double[] doubleArray12 = new double[] { ' ', (-1) };
        double[] doubleArray15 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray12, 100.0d);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        commonGramsTokenFilterFactoryTests20.assertTermsEquals("", indexReader22, terms23, terms24, false);
        java.lang.String str27 = commonGramsTokenFilterFactoryTests20.getTestName();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("", indexReader29, (int) '4', postingsEnum31, postingsEnum32, true);
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum36, postingsEnum37, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) doubleArray7, (java.lang.Object) postingsEnum37);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests53 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests53.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader55, 0, postingsEnum57, postingsEnum58);
        commonGramsTokenFilterFactoryTests53.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        commonGramsTokenFilterFactoryTests53.assertPositionsSkippingEquals("tests.weekly", indexReader62, (int) '#', postingsEnum64, postingsEnum65);
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        commonGramsTokenFilterFactoryTests53.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader68, 0, postingsEnum70, postingsEnum71);
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        commonGramsTokenFilterFactoryTests53.assertDocsSkippingEquals("", indexReader74, (int) (short) -1, postingsEnum76, postingsEnum77, true);
        commonGramsTokenFilterFactoryTests53.setUp();
        commonGramsTokenFilterFactoryTests53.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder82 = commonGramsTokenFilterFactoryTests53.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule14, (java.lang.Object) commonGramsTokenFilterFactoryTests53);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 10.0f, (double) 4);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests16.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests16.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader19, (int) (byte) -1, postingsEnum21, postingsEnum22);
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests16.ruleChain;
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet30 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray29);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests16, (java.lang.Object) charSequenceArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) wildcardClassArray8, (java.lang.Object[]) charSequenceArray29);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray7 = new java.util.Locale[] { locale2, locale4, locale6 };
        java.util.Set<java.util.Locale> localeSet8 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray7);
        java.util.Set<java.util.Locale> localeSet9 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray7);
        java.util.Locale[] localeArray10 = new java.util.Locale[] {};
        java.util.Locale[][] localeArray11 = new java.util.Locale[][] { localeArray10 };
        java.util.Set<java.util.Locale[]> localeArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) localeArray7, (java.lang.Object[]) localeArray11);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (-1));
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, 1.0d);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 1, 1.0d);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) 3);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 100.0f, (double) 100, (double) (byte) 10);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        short[] shortArray4 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[] shortArray9 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[] shortArray14 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[][] shortArray15 = new short[][] { shortArray4, shortArray9, shortArray14 };
        java.util.Set<short[]> shortArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray15);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray28);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) shortArray15, (java.lang.Object[]) charSequenceArray28);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) byteArray4);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), 0L);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) 10, (double) 'a', (double) 2);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray2);
        java.lang.Object obj5 = new java.lang.Object();
        org.junit.Assert.assertNotEquals(obj5, (java.lang.Object) "");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests8.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader10, 0, postingsEnum12, postingsEnum13);
        commonGramsTokenFilterFactoryTests8.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests8.assertPositionsSkippingEquals("tests.weekly", indexReader17, (int) '#', postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("enwiki.random.lines.txt", indexReader23, fields24, fields25, true);
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests8.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("random", obj5, (java.lang.Object) builder28);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests30.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader32, 0, postingsEnum34, postingsEnum35);
        commonGramsTokenFilterFactoryTests30.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests30.assertPositionsSkippingEquals("tests.weekly", indexReader39, (int) '#', postingsEnum41, postingsEnum42);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        commonGramsTokenFilterFactoryTests30.assertFieldsEquals("enwiki.random.lines.txt", indexReader45, fields46, fields47, true);
        commonGramsTokenFilterFactoryTests30.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests30.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule52 = commonGramsTokenFilterFactoryTests30.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests30);
        org.elasticsearch.common.settings.Settings.Builder builder54 = commonGramsTokenFilterFactoryTests30.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) throttlingEnumSet3, (java.lang.Object) builder54);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
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
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray51);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy62 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass63 = queryCachingPolicy62.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy64 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass65 = queryCachingPolicy64.getClass();
        java.lang.Class[] classArray67 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray68 = (java.lang.Class<?>[]) classArray67;
        wildcardClassArray68[0] = wildcardClass63;
        wildcardClassArray68[1] = wildcardClass65;
        java.util.Set<java.lang.Class<?>> wildcardClassSet73 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray68);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy74 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass75 = queryCachingPolicy74.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy76 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass77 = queryCachingPolicy76.getClass();
        java.lang.Class[] classArray79 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray80 = (java.lang.Class<?>[]) classArray79;
        wildcardClassArray80[0] = wildcardClass75;
        wildcardClassArray80[1] = wildcardClass77;
        java.util.Set<java.lang.Class<?>> wildcardClassSet85 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray68, (java.lang.Object[]) wildcardClassArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray51, (java.lang.Object[]) wildcardClassArray80);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures16 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests18.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader20, 0, postingsEnum22, postingsEnum23);
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests18.assertPositionsSkippingEquals("tests.weekly", indexReader27, (int) '#', postingsEnum29, postingsEnum30);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests18.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader33, 0, postingsEnum35, postingsEnum36);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsSkippingEquals("", indexReader39, (int) (short) -1, postingsEnum41, postingsEnum42, true);
        commonGramsTokenFilterFactoryTests18.setUp();
        commonGramsTokenFilterFactoryTests18.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder47 = commonGramsTokenFilterFactoryTests18.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) testRuleIgnoreAfterMaxFailures17, (java.lang.Object) builder47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) testRuleIgnoreAfterMaxFailures17);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 4);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        double[] doubleArray1 = null;
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
        double[] doubleArray34 = new double[] { ' ', (-1) };
        double[] doubleArray37 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray37, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray37, (double) 100);
        double[] doubleArray44 = new double[] { ' ', (-1) };
        double[] doubleArray47 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray47, (double) 100L);
        double[] doubleArray53 = new double[] { ' ', (-1) };
        double[] doubleArray56 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray56, (double) 100L);
        double[] doubleArray61 = new double[] { ' ', (-1) };
        double[] doubleArray64 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray64, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray56, doubleArray61, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray56, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray56, (double) '#');
        double[] doubleArray76 = new double[] { ' ', (-1) };
        double[] doubleArray79 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray76, doubleArray79, (double) 100L);
        double[] doubleArray84 = new double[] { ' ', (-1) };
        double[] doubleArray87 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray84, doubleArray87, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray79, doubleArray84, 100.0d);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray5, doubleArray84, 0.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", doubleArray1, doubleArray84, 0.0d);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (-1L), (double) (short) 0);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) builder15);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) 100.0f, (double) '4');
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
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
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader37, (int) (short) 0, postingsEnum39, postingsEnum40, true);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests44 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        commonGramsTokenFilterFactoryTests44.assertTermsEquals("", indexReader46, terms47, terms48, false);
        java.lang.String str51 = commonGramsTokenFilterFactoryTests44.getTestName();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests44.assertDocsSkippingEquals("", indexReader53, (int) '4', postingsEnum55, postingsEnum56, true);
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        commonGramsTokenFilterFactoryTests44.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum60, postingsEnum61, true);
        org.elasticsearch.common.settings.Settings.Builder builder64 = commonGramsTokenFilterFactoryTests44.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests44);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.monster", true);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
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
        java.lang.CharSequence[] charSequenceArray60 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet61 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray60);
        java.lang.CharSequence[] charSequenceArray66 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet67 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray66);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray60, (java.lang.Object[]) charSequenceArray66);
        java.lang.CharSequence[] charSequenceArray74 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet75 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray74);
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet81 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray80);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray74, (java.lang.Object[]) charSequenceArray80);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray66, (java.lang.Object[]) charSequenceArray80);
        java.lang.CharSequence[] charSequenceArray88 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet89 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray88);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) charSequenceArray66, (java.lang.Object[]) charSequenceArray88);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) charSequenceArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) charSequenceArray19);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
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
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests17.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader32, 0, postingsEnum34, postingsEnum35);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests17.assertDocsSkippingEquals("", indexReader38, (int) (short) -1, postingsEnum40, postingsEnum41, true);
        commonGramsTokenFilterFactoryTests17.setUp();
        commonGramsTokenFilterFactoryTests17.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder46 = commonGramsTokenFilterFactoryTests17.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests17.tearDown();
        org.junit.rules.TestRule testRule48 = commonGramsTokenFilterFactoryTests17.ruleChain;
        org.junit.rules.TestRule testRule49 = commonGramsTokenFilterFactoryTests17.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests17);
        commonGramsTokenFilterFactoryTests17.setIndexWriterMaxDocs(0);
        java.lang.String str53 = commonGramsTokenFilterFactoryTests17.getTestName();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        commonGramsTokenFilterFactoryTests17.assertTermsEquals("tests.slow", indexReader55, terms56, terms57, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (-1), (java.lang.Object) "tests.slow");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
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
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet25 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray24);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray24);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet32 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray31);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray24, (java.lang.Object[]) charSequenceArray31);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet41 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray40);
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet47 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray46);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray40, (java.lang.Object[]) charSequenceArray46);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet55 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray54);
        java.lang.CharSequence[] charSequenceArray60 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet61 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray60);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray54, (java.lang.Object[]) charSequenceArray60);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray46, (java.lang.Object[]) charSequenceArray60);
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray31, (java.lang.Object) charSequenceArray46);
        java.lang.CharSequence[] charSequenceArray71 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet72 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray71);
        java.lang.CharSequence[] charSequenceArray77 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet78 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray77);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray71, (java.lang.Object[]) charSequenceArray77);
        java.lang.CharSequence[] charSequenceArray85 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet86 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray85);
        java.lang.CharSequence[] charSequenceArray91 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet92 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray91);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray85, (java.lang.Object[]) charSequenceArray91);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray77, (java.lang.Object[]) charSequenceArray91);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray31, (java.lang.Object[]) charSequenceArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) wildcardClassArray7, (java.lang.Object) charSequenceArray31);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) 10);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.weekly", postingsEnum8, postingsEnum9, false);
        java.lang.String str12 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader14, 10, postingsEnum16, postingsEnum17, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("hi!", (int) (short) 1, numericDocValues23, numericDocValues24);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) '#');
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
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
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.slow", indexReader17, fields18, fields19, true);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
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
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray19);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray17);
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
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray34);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests42.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests42);
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests42.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray17, (java.lang.Object) testRule45);
        org.junit.Assert.assertNotNull((java.lang.Object) testRule45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 0, (java.lang.Object) testRule45);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
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
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray28);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray28);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet36 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray28, (java.lang.Object[]) charSequenceArray35);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet44 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray43);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet50 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray49);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray43, (java.lang.Object[]) charSequenceArray49);
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet57 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray49, (java.lang.Object[]) charSequenceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray35, (java.lang.Object[]) charSequenceArray56);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "hi!", (java.lang.Object) charSequenceArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) wildcardClassArray8, (java.lang.Object[]) charSequenceArray35);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
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
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray3);
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) throttlingArray3, (java.lang.Object[]) charSequenceArray36);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.maxfailures", obj1);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.weekly", indexReader10, (int) (byte) 1, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.awaitsfix", (int) 'a', numericDocValues17, numericDocValues18);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 1L, (long) (byte) 10);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 10, (long) (short) 100);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
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
        java.util.Set<java.lang.Object> objSet65 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charSequenceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray40, (java.lang.Object[]) charSequenceArray62);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy68 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass69 = queryCachingPolicy68.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy70 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass71 = queryCachingPolicy70.getClass();
        java.lang.Class[] classArray73 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray74 = (java.lang.Class<?>[]) classArray73;
        wildcardClassArray74[0] = wildcardClass69;
        wildcardClassArray74[1] = wildcardClass71;
        java.util.Set<java.lang.Class<?>> wildcardClassSet79 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray74);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) wildcardClassArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) charSequenceArray40, (java.lang.Object[]) wildcardClassArray74);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 1, (double) 0L, (double) 4);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        short[] shortArray0 = new short[] {};
        short[] shortArray1 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray1);
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray3);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray1);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals("", shortArray11, shortArray13);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray20);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray13, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray18);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests26.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests26);
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests26.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray1, (java.lang.Object) testRule29);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray32);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray34);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray44);
        org.junit.Assert.assertArrayEquals("", shortArray41, shortArray43);
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray41, shortArray47);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray51);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray54);
        org.junit.Assert.assertArrayEquals("", shortArray51, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray47);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray62);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray65);
        org.junit.Assert.assertArrayEquals("", shortArray62, shortArray64);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray69);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray71);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray64, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray64);
        short[] shortArray77 = new short[] {};
        short[] shortArray78 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray77, shortArray78);
        short[] shortArray80 = new short[] {};
        short[] shortArray81 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray80, shortArray81);
        short[] shortArray83 = new short[] {};
        short[] shortArray84 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray83, shortArray84);
        org.junit.Assert.assertArrayEquals(shortArray81, shortArray83);
        org.junit.Assert.assertArrayEquals(shortArray78, shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray81);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray1, (java.lang.Object) shortArray81);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.failfast", false);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 0.0d, (double) (short) -1);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) 3);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
        java.util.Set[][] setArray1 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray2 = (java.util.Set<java.lang.CharSequence>[][]) setArray1;
        java.util.Set<java.util.Set<java.lang.CharSequence>[]> charSequenceSetArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests4.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("tests.monster", postingsEnum12, postingsEnum13, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charSequenceSetArray2, (java.lang.Object) false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 1L, (long) 0);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray3);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray8, longArray9);
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray8, longArray11);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray15, longArray16);
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray15, longArray18);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray21, longArray22);
        org.junit.Assert.assertArrayEquals(longArray18, longArray21);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray8, longArray18);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray28, longArray29);
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray28, longArray31);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray35, longArray36);
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray35, longArray38);
        org.junit.Assert.assertArrayEquals(longArray28, longArray38);
        org.junit.Assert.assertArrayEquals(longArray8, longArray28);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray3, longArray28);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray45, longArray46);
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray45, longArray48);
        long[] longArray51 = new long[] {};
        long[] longArray52 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray51, longArray52);
        org.junit.Assert.assertArrayEquals(longArray48, longArray51);
        org.junit.Assert.assertArrayEquals(longArray28, longArray51);
        long[] longArray56 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray51, longArray56);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 10L, (double) (byte) 0);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10, (float) (short) 100, (float) (short) 10);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 3);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) 0, (float) '#', (float) 1L);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests30.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests30.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader33, (int) (byte) -1, postingsEnum35, postingsEnum36);
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests30.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests30);
        commonGramsTokenFilterFactoryTests30.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule41 = commonGramsTokenFilterFactoryTests30.ruleChain;
        commonGramsTokenFilterFactoryTests30.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests30.setIndexWriterMaxDocs((int) (byte) 10);
        commonGramsTokenFilterFactoryTests30.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charSequenceArray18, (java.lang.Object) commonGramsTokenFilterFactoryTests30);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) 1L, (float) (byte) 0, (float) (-1L));
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
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
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder33 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) builder33);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
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
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum44, postingsEnum45);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        java.lang.String str8 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader10, (int) '4', postingsEnum12, postingsEnum13, true);
        java.lang.String str16 = commonGramsTokenFilterFactoryTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum5, postingsEnum6);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
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
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.maxfailures", postingsEnum32, postingsEnum33, true);
        commonGramsTokenFilterFactoryTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
        java.util.Locale[] localeArray0 = new java.util.Locale[] {};
        java.util.Locale[][] localeArray1 = new java.util.Locale[][] { localeArray0 };
        java.util.Set<java.util.Locale[]> localeArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray1);
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray1, (java.lang.Object[]) charSequenceArray21);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
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
        commonGramsTokenFilterFactoryTests2.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (short) -1, (long) (short) -1);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray5, byteArray9);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray14, byteArray15);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray15, byteArray18);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray9, byteArray15);
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
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray49, byteArray50);
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray53, byteArray54);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray50, byteArray54);
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray59, byteArray60);
        byte[] byteArray63 = new byte[] {};
        byte[] byteArray64 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray63, byteArray64);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray60, byteArray63);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray54, byteArray60);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray38, byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) byteArray0);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        java.lang.Object obj1 = null;
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
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", obj1, (java.lang.Object) 10);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests43 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests43.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests43.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests43.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests43.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str49 = commonGramsTokenFilterFactoryTests43.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder50 = commonGramsTokenFilterFactoryTests43.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray2, (java.lang.Object) commonGramsTokenFilterFactoryTests43);
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests43.assertDocsEnumEquals("tests.weekly", postingsEnum53, postingsEnum54, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) '4');
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', 0.0d);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) -1, (double) (-1.0f), 0.0d);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
        java.util.Collection[] collectionArray1 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray2 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray1;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.CharSequence>[]) collectionArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests5.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests5.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests9.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests9.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) -1, postingsEnum14, postingsEnum15);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests9.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests9);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests5, (java.lang.Object) "tests.slow");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests20.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests20.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader23, (int) (byte) -1, postingsEnum25, postingsEnum26);
        commonGramsTokenFilterFactoryTests20.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests30.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests30.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader33, (int) (byte) -1, postingsEnum35, postingsEnum36);
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests30.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests30);
        commonGramsTokenFilterFactoryTests30.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests42.setUp();
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet50 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray49);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray49, (java.lang.Object[]) charSequenceArray55);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests42, (java.lang.Object) charSequenceArray49);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests59 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests59.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        commonGramsTokenFilterFactoryTests59.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader62, (int) (byte) -1, postingsEnum64, postingsEnum65);
        org.junit.rules.TestRule testRule67 = commonGramsTokenFilterFactoryTests59.ruleChain;
        commonGramsTokenFilterFactoryTests59.setIndexWriterMaxDocs((int) (short) 10);
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray70 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests5, commonGramsTokenFilterFactoryTests20, commonGramsTokenFilterFactoryTests30, commonGramsTokenFilterFactoryTests42, commonGramsTokenFilterFactoryTests59 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet71 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) collectionArray1, (java.lang.Object[]) baseTokenStreamTestCaseArray70);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 100.0f, (double) 10, 0.0d);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
        int[] intArray1 = new int[] { 3 };
        int[] intArray3 = new int[] { 3 };
        int[] intArray5 = new int[] { 3 };
        int[] intArray7 = new int[] { 3 };
        int[] intArray9 = new int[] { 3 };
        int[] intArray11 = new int[] { 3 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        int[] intArray14 = new int[] { 3 };
        int[] intArray16 = new int[] { 3 };
        int[] intArray18 = new int[] { 3 };
        int[] intArray20 = new int[] { 3 };
        int[] intArray22 = new int[] { 3 };
        int[] intArray24 = new int[] { 3 };
        int[][] intArray25 = new int[][] { intArray14, intArray16, intArray18, intArray20, intArray22, intArray24 };
        int[][][] intArray26 = new int[][][] { intArray12, intArray25 };
        java.util.Set<int[][]> intArraySet27 = org.apache.lucene.util.LuceneTestCase.asSet(intArray26);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet34 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet42 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray41);
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet48 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray47);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray41, (java.lang.Object[]) charSequenceArray47);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet55 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray54);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray47, (java.lang.Object[]) charSequenceArray54);
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet63 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray62);
        java.lang.CharSequence[] charSequenceArray68 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet69 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray68);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray62, (java.lang.Object[]) charSequenceArray68);
        java.lang.CharSequence[] charSequenceArray75 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet76 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray75);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray68, (java.lang.Object[]) charSequenceArray75);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray47, (java.lang.Object[]) charSequenceArray75);
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) charSequenceArray33, (java.lang.Object[]) charSequenceArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) intArray26, (java.lang.Object[]) charSequenceArray75);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests0.ruleChain;
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
        org.junit.Assert.assertArrayEquals(longArray9, longArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule6, (java.lang.Object) longArray19);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) (byte) 1, (double) 1.0f);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (float) 100, (float) (byte) 10, (float) 4);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 3, 0.0d, (double) 100.0f);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) (byte) -1);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (byte) -1, (long) (byte) 0);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 100L, (long) 3);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        java.lang.String str8 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests11.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests11.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests11.tearDown();
        commonGramsTokenFilterFactoryTests11.setIndexWriterMaxDocs((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests11);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj3 = new java.lang.Object();
        org.junit.Assert.assertNotEquals(obj3, (java.lang.Object) "");
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
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests6.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("random", obj3, (java.lang.Object) builder26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader30, 0, postingsEnum32, postingsEnum33);
        commonGramsTokenFilterFactoryTests28.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("tests.weekly", indexReader37, (int) '#', postingsEnum39, postingsEnum40);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("enwiki.random.lines.txt", indexReader43, fields44, fields45, true);
        commonGramsTokenFilterFactoryTests28.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests28.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule50 = commonGramsTokenFilterFactoryTests28.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsEnumEquals("", postingsEnum53, postingsEnum54, true);
        java.lang.String str57 = commonGramsTokenFilterFactoryTests28.getTestName();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("", indexReader59, fields60, fields61, true);
        commonGramsTokenFilterFactoryTests28.setIndexWriterMaxDocs((int) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", obj1, (java.lang.Object) ' ');
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
        short[][][] shortArray0 = new short[][][] {};
        java.util.Set<short[][]> shortArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray0);
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
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray42);
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet52 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray51);
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet58 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray57);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray51, (java.lang.Object[]) charSequenceArray57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray42, (java.lang.Object[]) charSequenceArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) shortArray0, (java.lang.Object[]) charSequenceArray57);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 100L, 0L);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 100.0f, (float) ' ', (float) 0);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
        java.lang.Object obj0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) builder30);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, 0.0d, 0.0d);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 100L, (-1.0d));
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray5);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray12);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray5, shortArray10);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        commonGramsTokenFilterFactoryTests17.assertTermsEquals("", indexReader19, terms20, terms21, false);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests17.assertDocsEnumEquals("tests.weekly", postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests17.assertDocsEnumEquals("tests.maxfailures", postingsEnum30, postingsEnum31, true);
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests17.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray10, (java.lang.Object) commonGramsTokenFilterFactoryTests17);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) 10L, (double) '4');
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, 1L);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) (-1.0f), (double) (-1.0f));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
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
        org.junit.Assert.assertArrayEquals("", charArray14, charArray58);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests71 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests71.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        commonGramsTokenFilterFactoryTests71.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader74, (int) (byte) -1, postingsEnum76, postingsEnum77);
        org.junit.rules.TestRule testRule79 = commonGramsTokenFilterFactoryTests71.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests71);
        commonGramsTokenFilterFactoryTests71.setUp();
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        commonGramsTokenFilterFactoryTests71.assertDocsSkippingEquals("random", indexReader83, 0, postingsEnum85, postingsEnum86, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray58, (java.lang.Object) 0);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) ' ');
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
        short[] shortArray1 = null;
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray9);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals("", shortArray9, shortArray11);
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray9, shortArray15);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray20);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray9, shortArray20);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) shortArray9);
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
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray9, shortArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray1, shortArray36);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
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
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray24);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals("", shortArray31, shortArray33);
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray31, shortArray37);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray44);
        org.junit.Assert.assertArrayEquals("", shortArray41, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray37);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray52);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray55);
        org.junit.Assert.assertArrayEquals("", shortArray52, shortArray54);
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray52, shortArray58);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) shortArray37);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) ' ', (double) (-1L), (double) (byte) 10);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (byte) -1, (long) (byte) 1);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
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
        commonGramsTokenFilterFactoryTests2.tearDown();
        java.lang.String str33 = commonGramsTokenFilterFactoryTests2.getTestName();
        commonGramsTokenFilterFactoryTests2.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) 1L, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
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
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet22 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray21);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet28 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray27);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray21, (java.lang.Object[]) charSequenceArray27);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet35 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray27, (java.lang.Object[]) charSequenceArray34);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder38 = commonGramsTokenFilterFactoryTests37.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests37.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests37, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests37.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests37.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        commonGramsTokenFilterFactoryTests37.assertTermsEquals("", indexReader45, terms46, terms47, false);
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray27, (java.lang.Object) terms47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) throttlingArray6, (java.lang.Object[]) charSequenceArray27);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (long) 1, (long) 1);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests40.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader42, 0, postingsEnum44, postingsEnum45);
        commonGramsTokenFilterFactoryTests40.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests40.assertPositionsSkippingEquals("tests.weekly", indexReader49, (int) '#', postingsEnum51, postingsEnum52);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests40.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader55, 0, postingsEnum57, postingsEnum58);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests40.assertDocsSkippingEquals("", indexReader61, (int) (short) -1, postingsEnum63, postingsEnum64, true);
        commonGramsTokenFilterFactoryTests40.setUp();
        commonGramsTokenFilterFactoryTests40.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder69 = commonGramsTokenFilterFactoryTests40.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests40.tearDown();
        org.junit.rules.TestRule testRule71 = commonGramsTokenFilterFactoryTests40.ruleChain;
        org.junit.rules.TestRule testRule72 = commonGramsTokenFilterFactoryTests40.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests40);
        commonGramsTokenFilterFactoryTests40.setIndexWriterMaxDocs(0);
        java.lang.String str76 = commonGramsTokenFilterFactoryTests40.getTestName();
        commonGramsTokenFilterFactoryTests40.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) shortArray10, (java.lang.Object) commonGramsTokenFilterFactoryTests40);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (float) '4', (float) ' ', (float) 10L);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
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
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("enwiki.random.lines.txt", (int) (byte) 10, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (byte) 100, (double) 0.0f);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.badapples", (-1), numericDocValues11, numericDocValues12);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) testRule26);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) '4');
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) (byte) 10);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) 100);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) (byte) 0);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0, (double) 0.0f, (double) (-1.0f));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests9.setUp();
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet17 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray16);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray16, (java.lang.Object[]) charSequenceArray22);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests9, (java.lang.Object) charSequenceArray16);
        commonGramsTokenFilterFactoryTests9.tearDown();
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests9.ruleChain;
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests9.ruleChain;
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests9.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) shortArray2, (java.lang.Object) commonGramsTokenFilterFactoryTests9);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 100L, (double) '4', (double) 100L);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
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
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum33, postingsEnum34);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 0.0d, (double) 'a');
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray7 = new java.util.Locale[] { locale2, locale4, locale6 };
        java.util.Set<java.util.Locale> localeSet8 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray7);
        java.util.Set<java.util.Locale> localeSet9 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray7);
        int[] intArray15 = new int[] { (byte) 0, (byte) -1, 'a', (short) 10, '4' };
        int[] intArray21 = new int[] { (byte) 0, (byte) -1, 'a', (short) 10, '4' };
        int[] intArray27 = new int[] { (byte) 0, (byte) -1, 'a', (short) 10, '4' };
        int[] intArray33 = new int[] { (byte) 0, (byte) -1, 'a', (short) 10, '4' };
        int[] intArray39 = new int[] { (byte) 0, (byte) -1, 'a', (short) 10, '4' };
        int[][] intArray40 = new int[][] { intArray15, intArray21, intArray27, intArray33, intArray39 };
        int[][][] intArray41 = new int[][][] { intArray40 };
        int[][][][] intArray42 = new int[][][][] { intArray41 };
        java.util.Set<int[][][]> intArraySet43 = org.apache.lucene.util.LuceneTestCase.asSet(intArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) localeArray7, (java.lang.Object[]) intArray42);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1349");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charSequenceArray18);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1350");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) 100, (double) 0.0f);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1351");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, 0.0d, (double) (byte) -1);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1352");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 0L, 1L);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1353");
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
        org.junit.Assert.assertNotNull((java.lang.Object) throttlingArray2);
        java.util.Set<java.io.Serializable> serializableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray2);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray28);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray28);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet36 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray28, (java.lang.Object[]) charSequenceArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) serializableSet16, (java.lang.Object) charSequenceArray35);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1354");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 100L, 0.0d, (double) ' ');
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1355");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) 100L, 0.0d);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1356");
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
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1357");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, (float) (byte) 10, (float) '#');
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1358");
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
        float[] floatArray75 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray79 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray75, floatArray79, (float) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray27, floatArray79, (float) 4);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1359");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) 1, 0.0f);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1360");
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
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.nightly", (int) (short) 10, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1361");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 0, (double) (byte) -1);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1362");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) (short) 0);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1363");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) (-1), (double) (byte) 0, (double) (short) 100);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1364");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray5);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray12);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray5, shortArray10);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals("", shortArray20, shortArray22);
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray20, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray20);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray32);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray32);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray49);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray49);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray60);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray63);
        org.junit.Assert.assertArrayEquals("", shortArray60, shortArray62);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray67);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray69);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray62, shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray67);
        short[] shortArray75 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray75);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1365");
        char[] charArray7 = new char[] { 'a', ' ', '4', 'a', '4', '#' };
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals(charArray8, charArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray7, charArray8);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1366");
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
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.monster", (int) (short) -1, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1367");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.failfast", indexReader6, terms7, terms8, false);
        commonGramsTokenFilterFactoryTests1.tearDown();
        java.lang.Object obj12 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, obj12);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests14.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, 0, postingsEnum18, postingsEnum19);
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests14.assertPositionsSkippingEquals("tests.weekly", indexReader23, (int) '#', postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests14.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, 0, postingsEnum31, postingsEnum32);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests14.assertDocsSkippingEquals("", indexReader35, (int) (short) -1, postingsEnum37, postingsEnum38, true);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        commonGramsTokenFilterFactoryTests14.assertTermsEquals("tests.failfast", indexReader42, terms43, terms44, true);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        commonGramsTokenFilterFactoryTests14.assertFieldsEquals("<unknown>", indexReader48, fields49, fields50, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", obj12, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1368");
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
        org.junit.Assert.assertArrayEquals("random", intArray4, intArray14);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray25, intArray26);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray25, intArray29);
        org.junit.Assert.assertArrayEquals(intArray14, intArray25);
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray25, intArray47);
        java.util.Locale[] localeArray68 = new java.util.Locale[] {};
        java.util.Locale[][] localeArray69 = new java.util.Locale[][] { localeArray68 };
        java.util.Set<java.util.Locale[]> localeArraySet70 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray69);
        java.util.Set<java.util.Locale[]> localeArraySet71 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray25, (java.lang.Object) localeArray69);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1369");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 4, (double) (-1));
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1370");
        java.util.Collection[] collectionArray2 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray3 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray2;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.CharSequence>[]) collectionArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) charSequenceCollectionSet4);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1371");
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
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray57, (double) (short) 10);
        double[] doubleArray74 = new double[] { ' ', (-1) };
        double[] doubleArray77 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray74, doubleArray77, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray77, (double) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray77, (double) (byte) 10);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1372");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) '#', (double) 'a');
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1373");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, 0, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("random", indexReader10, fields11, fields12, true);
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) builder15, (java.lang.Object) "tests.failfast");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.failfast", (java.lang.Object) (byte) 1);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1374");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) -1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader13, (int) (byte) -1, postingsEnum15, postingsEnum16);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests10.ruleChain;
        commonGramsTokenFilterFactoryTests10.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests10, (java.lang.Object) true);
        org.elasticsearch.common.settings.Settings.Builder builder23 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1375");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 100.0f, (double) 1);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1376");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader9, fields10, fields11, true);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 0);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1377");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
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
        commonGramsTokenFilterFactoryTests6.tearDown();
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests6.ruleChain;
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests6.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule29;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests31.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader33, 0, postingsEnum35, postingsEnum36);
        commonGramsTokenFilterFactoryTests31.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        commonGramsTokenFilterFactoryTests31.assertFieldsEquals("random", indexReader40, fields41, fields42, true);
        commonGramsTokenFilterFactoryTests31.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests31.tearDown();
        org.junit.Assert.assertNotSame("", (java.lang.Object) testRule29, (java.lang.Object) commonGramsTokenFilterFactoryTests31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) testRule29);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1378");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 10, (double) 10);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1379");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray5, byteArray9);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray14, byteArray15);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray15, byteArray18);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray9, byteArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests23.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests23.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader26, (int) (byte) -1, postingsEnum28, postingsEnum29);
        commonGramsTokenFilterFactoryTests23.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        commonGramsTokenFilterFactoryTests23.assertTermsEquals("enwiki.random.lines.txt", indexReader34, terms35, terms36, false);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        commonGramsTokenFilterFactoryTests23.assertTermsEquals("tests.monster", indexReader40, terms41, terms42, true);
        commonGramsTokenFilterFactoryTests23.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder47 = commonGramsTokenFilterFactoryTests23.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) byteArray9, (java.lang.Object) commonGramsTokenFilterFactoryTests23);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray51);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray53);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray58);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray60);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray67);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray70);
        org.junit.Assert.assertArrayEquals("", shortArray67, shortArray69);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray60, shortArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) byteArray9, (java.lang.Object) shortArray67);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1380");
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
        java.util.Set<java.lang.reflect.Type> typeSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.Type[]) wildcardClassArray6);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet34 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet40 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray39);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray33, (java.lang.Object[]) charSequenceArray39);
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet47 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray39, (java.lang.Object[]) charSequenceArray46);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet55 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray54);
        java.lang.CharSequence[] charSequenceArray60 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet61 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray60);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray54, (java.lang.Object[]) charSequenceArray60);
        java.lang.CharSequence[] charSequenceArray67 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet68 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray60, (java.lang.Object[]) charSequenceArray67);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray39, (java.lang.Object[]) charSequenceArray67);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests72 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests72.setUp();
        java.lang.CharSequence[] charSequenceArray79 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet80 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray79);
        java.lang.CharSequence[] charSequenceArray85 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet86 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray85);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray79, (java.lang.Object[]) charSequenceArray85);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests72, (java.lang.Object) charSequenceArray79);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) charSequenceArray39, (java.lang.Object[]) charSequenceArray79);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray6, (java.lang.Object[]) charSequenceArray79);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1381");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1), 1.0f, (float) (-1));
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1382");
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
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests14.setUp();
        java.lang.String str17 = commonGramsTokenFilterFactoryTests14.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests14);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests14.assertPositionsSkippingEquals("", indexReader20, (int) (short) 10, postingsEnum22, postingsEnum23);
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests14.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) genericDeclarationSet12, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1383");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (double) (-1.0f), (double) 1, (double) 2);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1384");
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
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.failfast", indexReader28, terms29, terms30, true);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader34, 0, postingsEnum36, postingsEnum37, false);
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum41, postingsEnum42);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1385");
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
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("europarl.lines.txt.gz", 1, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1386");
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
        org.apache.lucene.util.LuceneTestCase.classRules = testRule17;
        float[] floatArray22 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray26 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray26, (float) 100L);
        float[] floatArray32 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray36 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray36, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray32, 1.0f);
        java.lang.Object obj41 = new java.lang.Object();
        org.junit.Assert.assertNotEquals((java.lang.Object) floatArray32, obj41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule17, obj41);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1387");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet14 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) charSequenceArray19);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet27 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) charSequenceArray26);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray32 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling31 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling34 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet36 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray35);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests38 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests38.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests38);
        org.junit.rules.TestRule testRule41 = commonGramsTokenFilterFactoryTests38.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule41);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray35, (java.lang.Object) testRule41);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray32, (java.lang.Object[]) throttlingArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) throttlingArray35);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1388");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 100.0d, (double) 2, (double) 'a');
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1389");
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
        org.junit.Assert.assertArrayEquals("hi!", intArray9, intArray14);
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
        org.junit.Assert.assertArrayEquals("hi!", intArray25, intArray30);
        org.junit.Assert.assertArrayEquals(intArray9, intArray30);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray38, intArray39);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray42, intArray43);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray38, intArray42);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray48, intArray49);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray52, intArray53);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray48, intArray52);
        org.junit.Assert.assertArrayEquals("random", intArray38, intArray48);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray59, intArray60);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray63, intArray64);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray59, intArray63);
        org.junit.Assert.assertArrayEquals(intArray48, intArray59);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray9, intArray59);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy69 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass70 = queryCachingPolicy69.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy71 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass72 = queryCachingPolicy71.getClass();
        java.lang.Class[] classArray74 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray75 = (java.lang.Class<?>[]) classArray74;
        wildcardClassArray75[0] = wildcardClass70;
        wildcardClassArray75[1] = wildcardClass72;
        java.util.Set<java.lang.Class<?>> wildcardClassSet80 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) intArray9, (java.lang.Object) wildcardClassSet80);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1390");
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
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals(charArray25, charArray28);
        org.junit.Assert.assertArrayEquals("", charArray21, charArray25);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals(charArray37, charArray40);
        org.junit.Assert.assertArrayEquals("", charArray33, charArray37);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray25, charArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) postingsEnum15, (java.lang.Object) charArray25);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1391");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1392");
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
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray26, byteArray27);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray33, byteArray34);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray37, byteArray38);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray34, byteArray38);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray43, byteArray44);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray47, byteArray48);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray44, byteArray47);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray38, byteArray44);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray55, byteArray56);
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray59, byteArray60);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray56, byteArray60);
        byte[] byteArray65 = new byte[] {};
        byte[] byteArray66 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray65, byteArray66);
        byte[] byteArray69 = new byte[] {};
        byte[] byteArray70 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray69, byteArray70);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray66, byteArray69);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray60, byteArray66);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray44, byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) byteArray44);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1393");
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
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.maxfailures", 10, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1394");
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
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) shortArray45);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1395");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.awaitsfix", indexReader6, fields7, fields8, false);
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("europarl.lines.txt.gz", 10, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1396");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) 10);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1397");
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
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1398");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, 100L);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1399");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) ' ', 0.0d, (double) 1L);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1400");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) 0);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1401");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) 1L, (-1.0f));
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1402");
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
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        commonGramsTokenFilterFactoryTests28.assertTermsEquals("", indexReader30, terms31, terms32, false);
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsEnumEquals("tests.weekly", postingsEnum36, postingsEnum37, false);
        commonGramsTokenFilterFactoryTests28.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("tests.nightly", indexReader43, (int) (short) 100, postingsEnum45, postingsEnum46);
        org.junit.rules.TestRule testRule48 = commonGramsTokenFilterFactoryTests28.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray1, (java.lang.Object) testRule48);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1403");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (byte) -1, (long) 3);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1404");
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
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.maxfailures", 3, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1405");
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
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.slow", indexReader22, fields23, fields24, false);
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("hi!", 0, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1406");
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
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("hi!", indexReader29, (int) (short) 100, postingsEnum31, postingsEnum32, false);
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum36, postingsEnum37);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1407");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) (short) 1, (double) (-1.0f));
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1408");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1409");
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
        org.elasticsearch.common.settings.Settings.Builder builder50 = commonGramsTokenFilterFactoryTests26.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        commonGramsTokenFilterFactoryTests26.assertPositionsSkippingEquals("random", indexReader52, (int) '#', postingsEnum54, postingsEnum55);
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests26.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum58, postingsEnum59);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1410");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader11, fields12, fields13, false);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotEquals(obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1411");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("enwiki.random.lines.txt", indexReader13, terms14, terms15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("tests.monster", indexReader19, terms20, terms21, true);
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        java.lang.Object obj27 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) builder26, obj27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) "tests.maxfailures", (java.lang.Object) (byte) 100);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1412");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseArray66, (java.lang.Object[]) charSequenceArray94);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1413");
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
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.weekly", 100, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1414");
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray1, (java.lang.Object[]) charSequenceArray55);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1415");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        java.lang.String str2 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.nightly", postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.nightly", (int) ' ', numericDocValues11, numericDocValues12);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1416");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", 10, numericDocValues8, numericDocValues9);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1417");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10L, (double) 0, (double) '4');
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1418");
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
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader38, 100, postingsEnum40, postingsEnum41, false);
        java.lang.String str44 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.badapples", indexReader46, fields47, fields48, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1419");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) 1L, 100.0f, 0.0f);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1420");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("<unknown>", (double) (byte) 1, (double) (-1L), (double) 3);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1421");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 3, (double) ' ', (double) (-1.0f));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1422");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (-1.0f), (double) 1);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1423");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) 10.0f);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1424");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum5, postingsEnum6);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1425");
        short[] shortArray0 = null;
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
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray43);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray50);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray57);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray60);
        org.junit.Assert.assertArrayEquals("", shortArray57, shortArray59);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray50, shortArray57);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray67);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray70);
        org.junit.Assert.assertArrayEquals("", shortArray67, shortArray69);
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray67, shortArray73);
        short[] shortArray76 = new short[] {};
        short[] shortArray77 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray76, shortArray77);
        short[] shortArray79 = new short[] {};
        short[] shortArray80 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray79, shortArray80);
        org.junit.Assert.assertArrayEquals("", shortArray77, shortArray79);
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray77);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray57, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray57);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1426");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader14, (int) (short) 0, postingsEnum16, postingsEnum17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum17);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1427");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 10, (double) (byte) 0);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1428");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10.0f, (double) 10.0f);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1429");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(1.0d, (double) (short) 1, (double) 2);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1430");
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
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray28);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray28);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet39 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray38);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet45 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray44);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray38, (java.lang.Object[]) charSequenceArray44);
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet52 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray44, (java.lang.Object[]) charSequenceArray51);
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet60 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray59);
        java.lang.CharSequence[] charSequenceArray65 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet66 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray65);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray59, (java.lang.Object[]) charSequenceArray65);
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet73 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray72);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray65, (java.lang.Object[]) charSequenceArray72);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray51, (java.lang.Object[]) charSequenceArray72);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "hi!", (java.lang.Object) charSequenceArray51);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) charSequenceArray28, (java.lang.Object[]) charSequenceArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) wildcardClassArray8, (java.lang.Object[]) charSequenceArray51);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1431");
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
        org.junit.Assert.assertArrayEquals("random", floatArray6, floatArray28, (float) (-1));
        float[] floatArray52 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray56 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray56, (float) 100L);
        org.junit.Assert.assertArrayEquals("random", floatArray28, floatArray52, (float) 0);
        float[] floatArray64 = new float[] { 3, (short) -1, '#' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", floatArray52, floatArray64, (float) (short) -1);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1432");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale6, locale8, locale10 };
        java.util.Set<java.util.Locale> localeSet12 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray11);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) testRule4, (java.lang.Object) localeArray11);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests14.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, 0, postingsEnum18, postingsEnum19);
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests14.assertPositionsSkippingEquals("tests.weekly", indexReader23, (int) '#', postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        commonGramsTokenFilterFactoryTests14.assertFieldsEquals("enwiki.random.lines.txt", indexReader29, fields30, fields31, true);
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests14.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule36 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) localeArray11, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1433");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) 10, (float) 4, (float) (byte) 0);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1434");
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray5, longArray6);
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray5, longArray8);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray12, longArray13);
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray12, longArray15);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray18, longArray19);
        org.junit.Assert.assertArrayEquals(longArray15, longArray18);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray5, longArray15);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray25, longArray26);
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray25, longArray28);
        org.junit.Assert.assertArrayEquals("", longArray15, longArray25);
        long[] longArray31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray25, longArray31);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1435");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (-1L), 0L);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1436");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        org.junit.Assert.assertArrayEquals(charArray1, charArray4);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests7.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests7);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests7.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray4, (java.lang.Object) testRule10);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1437");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) -1, (double) 1, (double) 0.0f);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1438");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1439");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) -1, (float) (short) 1, (float) 1L);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1440");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule9;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule9;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule9;
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet26 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray25);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) charSequenceArray25);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet34 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet40 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray39);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray33, (java.lang.Object[]) charSequenceArray39);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray25, (java.lang.Object[]) charSequenceArray39);
        org.junit.Assert.assertNotEquals((java.lang.Object) testRule9, (java.lang.Object) charSequenceArray25);
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet51 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray50);
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet57 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray56);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray50, (java.lang.Object[]) charSequenceArray56);
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet65 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray64);
        java.lang.CharSequence[] charSequenceArray70 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet71 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray70);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray64, (java.lang.Object[]) charSequenceArray70);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray56, (java.lang.Object[]) charSequenceArray70);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray25, (java.lang.Object[]) charSequenceArray56);
        java.util.Set[][] setArray76 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray77 = (java.util.Set<java.lang.CharSequence>[][]) setArray76;
        java.util.Set[][] setArray79 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray80 = (java.util.Set<java.lang.CharSequence>[][]) setArray79;
        java.util.Set[][] setArray82 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray83 = (java.util.Set<java.lang.CharSequence>[][]) setArray82;
        java.util.Set[][] setArray85 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray86 = (java.util.Set<java.lang.CharSequence>[][]) setArray85;
        java.util.Set[][][] setArray88 = new java.util.Set[4][][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][][] charSequenceSetArray89 = (java.util.Set<java.lang.CharSequence>[][][]) setArray88;
        charSequenceSetArray89[0] = charSequenceSetArray77;
        charSequenceSetArray89[1] = charSequenceSetArray80;
        charSequenceSetArray89[2] = charSequenceSetArray83;
        charSequenceSetArray89[3] = charSequenceSetArray86;
        java.util.Set<java.util.Set<java.lang.CharSequence>[][]> charSequenceSetArraySet98 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray89);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) charSequenceArray25, (java.lang.Object[]) charSequenceSetArray89);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1441");
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
        float[] floatArray60 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray60, (float) 100L);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1442");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) ' ', (double) 1.0f);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1443");
        int[] intArray5 = new int[] { '#', 'a', (-1), (short) -1, (byte) 1 };
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray10, intArray11);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray14, intArray15);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray10, intArray14);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray19, intArray20);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray10, intArray19);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray26, intArray27);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray30, intArray31);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray26, intArray30);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray36, intArray37);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray40, intArray41);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray36, intArray40);
        org.junit.Assert.assertArrayEquals("random", intArray26, intArray36);
        org.junit.Assert.assertArrayEquals(intArray10, intArray26);
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
        org.junit.Assert.assertArrayEquals("hi!", intArray53, intArray58);
        int[] intArray65 = new int[] {};
        int[] intArray66 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray65, intArray66);
        int[] intArray69 = new int[] {};
        int[] intArray70 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray69, intArray70);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray65, intArray69);
        int[] intArray74 = new int[] {};
        int[] intArray75 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray74, intArray75);
        org.junit.Assert.assertArrayEquals("hi!", intArray69, intArray74);
        org.junit.Assert.assertArrayEquals(intArray53, intArray74);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray10, intArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray10);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1444");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 1L);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1445");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) 3);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1446");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 2, (double) 'a', (double) 'a');
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1447");
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray2 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray3 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[][] baseTokenStreamTestCaseArray4 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[][] { baseTokenStreamTestCaseArray2, baseTokenStreamTestCaseArray3 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase[]> baseTokenStreamTestCaseArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray4);
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
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests6.assertFieldsEquals("tests.weekly", indexReader27, fields28, fields29, true);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsSkippingEquals("tests.awaitsfix", indexReader33, (int) '#', postingsEnum35, postingsEnum36, false);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) baseTokenStreamTestCaseArraySet5, (java.lang.Object) commonGramsTokenFilterFactoryTests6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests6);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1448");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests22.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests22.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests22.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests22.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str28 = commonGramsTokenFilterFactoryTests22.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder29 = commonGramsTokenFilterFactoryTests22.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests22);
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum32, postingsEnum33);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1449");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) ' ', 1.0f, (float) (byte) 0);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1450");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) 3, (long) 'a');
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1451");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) (-1L), (float) (short) 100, 0.0f);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1452");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) builder2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader6, 0, postingsEnum8, postingsEnum9);
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("tests.monster", postingsEnum13, postingsEnum14, true);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule17;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "hi!", (java.lang.Object) testRule17);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1453");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) 0.0f, 0.0d, (double) 0.0f);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1454");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) (byte) 10, (double) (short) 0);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1455");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 2);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1456");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader6, (int) (byte) -1, postingsEnum8, postingsEnum9);
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        commonGramsTokenFilterFactoryTests3.assertTermsEquals("enwiki.random.lines.txt", indexReader14, terms15, terms16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        commonGramsTokenFilterFactoryTests3.assertTermsEquals("tests.monster", indexReader20, terms21, terms22, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests26.setUp();
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet34 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet40 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray39);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray33, (java.lang.Object[]) charSequenceArray39);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests26, (java.lang.Object) charSequenceArray33);
        commonGramsTokenFilterFactoryTests26.tearDown();
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests26.ruleChain;
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests26.ruleChain;
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) terms22, (java.lang.Object) commonGramsTokenFilterFactoryTests26);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsSkippingEquals("tests.maxfailures", indexReader48, (int) 'a', postingsEnum50, postingsEnum51, false);
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests26.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests26);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1457");
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
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.failfast", indexReader29, terms30, terms31, true);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("", indexReader36, (int) (byte) 0, postingsEnum38, postingsEnum39);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.failfast", indexReader43, 2, postingsEnum45, postingsEnum46);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests49 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests49.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests49.setUp();
        java.lang.String str52 = commonGramsTokenFilterFactoryTests49.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests49);
        commonGramsTokenFilterFactoryTests49.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests49.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) 2, (java.lang.Object) commonGramsTokenFilterFactoryTests49);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1458");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 3, (double) 1, (double) 10.0f);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1459");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 10);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("europarl.lines.txt.gz", 2, numericDocValues8, numericDocValues9);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1460");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) '#', (long) (short) 1);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1461");
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
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests17.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23);
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests17.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests17);
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests17.ruleChain;
        commonGramsTokenFilterFactoryTests17.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests17);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1462");
        float[] floatArray6 = new float[] { 2, (byte) 1, (byte) 0, (byte) -1, (short) -1 };
        float[] floatArray10 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray14 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray14, (float) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray6, floatArray14, (float) 0);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1463");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) fields25);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1464");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0.0f, (float) 4, (float) 0L);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1465");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling4 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray8 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling7 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray8);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests11.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests11);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests11.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule14);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray8, (java.lang.Object) testRule14);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray5, (java.lang.Object[]) throttlingArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray1, (java.lang.Object[]) throttlingArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) throttlingArray8);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1466");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray28);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray28);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet36 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray28, (java.lang.Object[]) charSequenceArray35);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet44 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray43);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet50 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray49);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray43, (java.lang.Object[]) charSequenceArray49);
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet57 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray49, (java.lang.Object[]) charSequenceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray35, (java.lang.Object[]) charSequenceArray56);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "hi!", (java.lang.Object) charSequenceArray35);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.failfast");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1467");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder10 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) builder10);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1468");
        long[] longArray3 = new long[] { '4', 'a' };
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray7, longArray8);
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray7, longArray10);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray13, longArray14);
        org.junit.Assert.assertArrayEquals(longArray10, longArray13);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray20, longArray21);
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray20, longArray23);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray27, longArray28);
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray27, longArray30);
        long[] longArray33 = new long[] {};
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray33, longArray34);
        org.junit.Assert.assertArrayEquals(longArray30, longArray33);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray20, longArray30);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray40, longArray41);
        long[] longArray43 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray40, longArray43);
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray47, longArray48);
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray47, longArray50);
        org.junit.Assert.assertArrayEquals(longArray40, longArray50);
        org.junit.Assert.assertArrayEquals(longArray20, longArray40);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray13, longArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray3, longArray20);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1469");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1470");
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
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("random", indexReader14, 1, postingsEnum16, postingsEnum17, false);
        java.lang.String str20 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1471");
        double[] doubleArray4 = new double[] { ' ', (-1) };
        double[] doubleArray7 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 100L);
        double[] doubleArray12 = new double[] { ' ', (-1) };
        double[] doubleArray15 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray12, 100.0d);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests20.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsSkippingEquals("tests.awaitsfix", indexReader23, 0, postingsEnum25, postingsEnum26, true);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsEnumEquals("tests.awaitsfix", postingsEnum30, postingsEnum31, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) "", (java.lang.Object) true);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1472");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray6);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals("", shortArray13, shortArray15);
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray13, shortArray19);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals("", shortArray23, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray23);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals("", shortArray33, shortArray35);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray42);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray35, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray40);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray6, shortArray40);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests49 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        commonGramsTokenFilterFactoryTests49.assertTermsEquals("", indexReader51, terms52, terms53, false);
        java.lang.String str56 = commonGramsTokenFilterFactoryTests49.getTestName();
        commonGramsTokenFilterFactoryTests49.setUp();
        java.lang.String str58 = commonGramsTokenFilterFactoryTests49.getTestName();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        commonGramsTokenFilterFactoryTests49.assertFieldsEquals("tests.failfast", indexReader60, fields61, fields62, false);
        commonGramsTokenFilterFactoryTests49.setUp();
        commonGramsTokenFilterFactoryTests49.setIndexWriterMaxDocs(2);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) shortArray40, (java.lang.Object) commonGramsTokenFilterFactoryTests49);
        org.apache.lucene.index.NumericDocValues numericDocValues71 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues72 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests49.assertDocValuesEquals("tests.weekly", (-1), numericDocValues71, numericDocValues72);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1473");
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
        commonGramsTokenFilterFactoryTests2.tearDown();
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.Object obj29 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests30.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests30.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader33, (int) (byte) -1, postingsEnum35, postingsEnum36);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        commonGramsTokenFilterFactoryTests30.assertFieldsEquals("random", indexReader39, fields40, fields41, false);
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests30.ruleChain;
        org.junit.Assert.assertNotEquals(obj29, (java.lang.Object) commonGramsTokenFilterFactoryTests30);
        java.lang.Class<?> wildcardClass46 = commonGramsTokenFilterFactoryTests30.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests47 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests47.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests47.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader50, (int) (byte) -1, postingsEnum52, postingsEnum53);
        org.junit.rules.TestRule testRule55 = commonGramsTokenFilterFactoryTests47.ruleChain;
        commonGramsTokenFilterFactoryTests47.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests47.setIndexWriterMaxDocs((int) (short) 0);
        org.junit.Assert.assertNotSame((java.lang.Object) wildcardClass46, (java.lang.Object) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (short) 0);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1474");
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
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray20, (double) 100);
        double[] doubleArray92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray92, (double) (short) 100);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1475");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray3, longArray4);
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray3, longArray6);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray9, longArray10);
        org.junit.Assert.assertArrayEquals(longArray6, longArray9);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray16, longArray17);
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray16, longArray19);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray23, longArray24);
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray23, longArray26);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray29, longArray30);
        org.junit.Assert.assertArrayEquals(longArray26, longArray29);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray16, longArray26);
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray36, longArray37);
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray36, longArray39);
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray43, longArray44);
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray43, longArray46);
        org.junit.Assert.assertArrayEquals(longArray36, longArray46);
        org.junit.Assert.assertArrayEquals(longArray16, longArray36);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray9, longArray16);
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
        long[] longArray68 = new long[] {};
        long[] longArray69 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray68, longArray69);
        org.junit.Assert.assertArrayEquals(longArray65, longArray68);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray55, longArray65);
        long[] longArray75 = new long[] {};
        long[] longArray76 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray75, longArray76);
        long[] longArray78 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray75, longArray78);
        org.junit.Assert.assertArrayEquals("", longArray65, longArray75);
        org.junit.Assert.assertArrayEquals(longArray16, longArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) longArray75);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1476");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 10L, (double) (byte) 0);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1477");
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures25 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures26 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures25);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures27 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures28 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures27);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures29 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures30 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures29);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray31 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures25, testRuleIgnoreAfterMaxFailures28, testRuleIgnoreAfterMaxFailures30 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet32 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray31);
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet38 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray37);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) testRuleIgnoreAfterMaxFailuresArray31, (java.lang.Object) charSequenceSet38);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) doubleArray22, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray31);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1478");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 4, (double) (byte) 0);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1479");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (-1.0f), 100.0d, (double) 1.0f);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1480");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader9, (int) (byte) 10, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("random", (int) (byte) -1, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1481");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1), (float) 'a', (float) (short) 0);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1482");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (byte) 10, (long) '4');
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1483");
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray5, longArray6);
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray5, longArray8);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray12, longArray13);
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray12, longArray15);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray18, longArray19);
        org.junit.Assert.assertArrayEquals(longArray15, longArray18);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray5, longArray15);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray25, longArray26);
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray25, longArray28);
        long[] longArray32 = new long[] {};
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray32, longArray33);
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray32, longArray35);
        org.junit.Assert.assertArrayEquals(longArray25, longArray35);
        org.junit.Assert.assertArrayEquals(longArray5, longArray25);
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray25, longArray42);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests61 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests61.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests61);
        org.junit.rules.TestRule testRule64 = commonGramsTokenFilterFactoryTests61.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests61.assertDocsEnumEquals("tests.failfast", postingsEnum66, postingsEnum67, true);
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        commonGramsTokenFilterFactoryTests61.assertFieldsEquals("", indexReader71, fields72, fields73, false);
        commonGramsTokenFilterFactoryTests61.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule77 = commonGramsTokenFilterFactoryTests61.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) longArray42, (java.lang.Object) commonGramsTokenFilterFactoryTests61);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1484");
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
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests17.setUp();
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet25 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray24);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet31 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray30);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray24, (java.lang.Object[]) charSequenceArray30);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests17, (java.lang.Object) charSequenceArray24);
        commonGramsTokenFilterFactoryTests17.tearDown();
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests17.ruleChain;
        java.lang.String str36 = commonGramsTokenFilterFactoryTests17.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests17.assertDocsEnumEquals("tests.nightly", postingsEnum38, postingsEnum39, true);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) true);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.monster", 4, numericDocValues46, numericDocValues47);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1485");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray5);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray12);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray5, shortArray10);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals("", shortArray20, shortArray22);
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray20, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray20);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray32);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray32);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray49);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray49);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray60);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray63);
        org.junit.Assert.assertArrayEquals("", shortArray60, shortArray62);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray67);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray69);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray62, shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray67);
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
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray76, shortArray82);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray82);
        short[] shortArray88 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray88);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1486");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) 10, (long) (short) 10);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1487");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 100, (double) ' ');
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1488");
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray5, longArray6);
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray5, longArray8);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray12, longArray13);
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray12, longArray15);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray18, longArray19);
        org.junit.Assert.assertArrayEquals(longArray15, longArray18);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray5, longArray15);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray25, longArray26);
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray25, longArray28);
        org.junit.Assert.assertArrayEquals("", longArray15, longArray25);
        long[] longArray33 = new long[] {};
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray33, longArray34);
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray33, longArray36);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray39, longArray40);
        org.junit.Assert.assertArrayEquals(longArray36, longArray39);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray25, longArray36);
        long[] longArray44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray36, longArray44);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1489");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, false);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("random", postingsEnum11, postingsEnum12, false);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) builder16);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1490");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) 3);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1491");
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
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.nightly", indexReader23, fields24, fields25, true);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1492");
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
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        commonGramsTokenFilterFactoryTests19.assertTermsEquals("", indexReader21, terms22, terms23, false);
        java.lang.String str26 = commonGramsTokenFilterFactoryTests19.getTestName();
        commonGramsTokenFilterFactoryTests19.setUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("tests.badapples", indexReader29, 0, postingsEnum31, postingsEnum32);
        commonGramsTokenFilterFactoryTests19.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1493");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (byte) 10, (long) (byte) -1);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1494");
        java.lang.Object obj1 = null;
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        org.junit.Assert.assertNotSame(obj1, (java.lang.Object) shortArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) shortArray3);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1495");
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
        org.junit.Assert.assertArrayEquals("hi!", intArray10, intArray15);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray21, intArray22);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray21, intArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray10, intArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray1, intArray25);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1496");
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
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet51 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray50);
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet57 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray56);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray50, (java.lang.Object[]) charSequenceArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray41, (java.lang.Object[]) charSequenceArray56);
        java.lang.CharSequence[] charSequenceArray65 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet66 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray65);
        java.lang.CharSequence[] charSequenceArray71 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet72 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray71);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray65, (java.lang.Object[]) charSequenceArray71);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray41, (java.lang.Object[]) charSequenceArray71);
        org.junit.Assert.assertNotSame((java.lang.Object) charSequenceArray71, (java.lang.Object) '4');
        short[][][] shortArray77 = new short[][][] {};
        java.util.Set<short[][]> shortArraySet78 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) charSequenceArray71, (java.lang.Object[]) shortArray77);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1497");
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
        commonGramsTokenFilterFactoryTests1.tearDown();
        java.lang.String str24 = commonGramsTokenFilterFactoryTests1.getTestName();
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray31 = new java.util.Locale[] { locale26, locale28, locale30 };
        java.util.Set<java.util.Locale> localeSet32 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) str24, (java.lang.Object) localeSet32);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1498");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) (-1), (double) 3);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1499");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) doubleArray35);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1500");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (byte) -1, (long) ' ');
    }
}

