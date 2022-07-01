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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (byte) 0, (double) 10, (double) (-1));
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6002");
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
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("random", postingsEnum20, postingsEnum21, true);
        java.lang.String str24 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) builder25);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6003");
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
        float[] floatArray61 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray4, floatArray61, (float) 10);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6004");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6005");
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals(charArray13, charArray16);
        org.junit.Assert.assertArrayEquals("", charArray9, charArray13);
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray13, charArray21);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray5, charArray21);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
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
        org.junit.Assert.assertArrayEquals("", charArray40, charArray44);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        org.junit.Assert.assertArrayEquals(charArray56, charArray59);
        org.junit.Assert.assertArrayEquals("", charArray52, charArray56);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray44, charArray52);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray36, charArray52);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray21, charArray36);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray67, charArray68);
        char[] charArray70 = new char[] {};
        char[] charArray71 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray70, charArray71);
        org.junit.Assert.assertArrayEquals(charArray67, charArray71);
        char[] charArray74 = new char[] {};
        char[] charArray75 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray74, charArray75);
        char[] charArray78 = new char[] {};
        char[] charArray79 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray78, charArray79);
        char[] charArray81 = new char[] {};
        char[] charArray82 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray81, charArray82);
        char[] charArray84 = new char[] {};
        char[] charArray85 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray84, charArray85);
        org.junit.Assert.assertArrayEquals(charArray82, charArray85);
        org.junit.Assert.assertArrayEquals("", charArray78, charArray82);
        org.junit.Assert.assertArrayEquals(charArray75, charArray78);
        org.junit.Assert.assertArrayEquals("", charArray67, charArray75);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray36, charArray75);
        char[] charArray92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray36, charArray92);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6006");
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
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray43, longArray44);
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray43, longArray46);
        long[] longArray50 = new long[] {};
        long[] longArray51 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray50, longArray51);
        long[] longArray53 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray50, longArray53);
        long[] longArray56 = new long[] {};
        long[] longArray57 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray56, longArray57);
        org.junit.Assert.assertArrayEquals(longArray53, longArray56);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray43, longArray53);
        long[] longArray63 = new long[] {};
        long[] longArray64 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray63, longArray64);
        long[] longArray66 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray63, longArray66);
        org.junit.Assert.assertArrayEquals("", longArray53, longArray63);
        long[] longArray71 = new long[] {};
        long[] longArray72 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray71, longArray72);
        long[] longArray74 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray71, longArray74);
        long[] longArray77 = new long[] {};
        long[] longArray78 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray77, longArray78);
        org.junit.Assert.assertArrayEquals(longArray74, longArray77);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray63, longArray74);
        org.junit.Assert.assertArrayEquals("", longArray4, longArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) longArray74);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6007");
        char[][][][] charArray1 = new char[][][][] {};
        char[][][][] charArray2 = new char[][][][] {};
        char[][][][][] charArray3 = new char[][][][][] { charArray1, charArray2 };
        java.util.Set<char[][][][]> charArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(charArray3);
        float[][][][] floatArray5 = new float[][][][] {};
        java.util.Set<float[][][]> floatArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) charArray3, (java.lang.Object[]) floatArray5);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6008");
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
        double[][][][][][] doubleArray45 = new double[][][][][][] {};
        java.util.Set<double[][][][][]> doubleArraySet46 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) doubleArray45, (java.lang.Object) 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) doubleArray45);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6009");
        java.util.Collection[] collectionArray1 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray2 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray1;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.CharSequence>[]) collectionArray1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures7);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures9 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures10 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures9);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray11 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures8, testRuleIgnoreAfterMaxFailures10 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet12 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray11);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet18 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray17);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) testRuleIgnoreAfterMaxFailuresArray11, (java.lang.Object) charSequenceSet18);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests21.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests21.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        commonGramsTokenFilterFactoryTests21.assertFieldsEquals("", indexReader25, fields26, fields27, true);
        commonGramsTokenFilterFactoryTests21.setIndexWriterMaxDocs(2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests33.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests33.setUp();
        java.lang.String str36 = commonGramsTokenFilterFactoryTests33.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests33);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests33.assertPositionsSkippingEquals("", indexReader39, (int) (short) 10, postingsEnum41, postingsEnum42);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsSkippingEquals("tests.slow", indexReader45, (int) 'a', postingsEnum47, postingsEnum48, false);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests21, (java.lang.Object) postingsEnum48);
        org.junit.Assert.assertNotSame((java.lang.Object) testRuleIgnoreAfterMaxFailuresArray11, (java.lang.Object) postingsEnum48);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet53 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charSequenceCollectionSet3, (java.lang.Object) testRuleIgnoreAfterMaxFailuresSet53);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6010");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (short) -1, 0.0d);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6011");
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
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.weekly", indexReader21, fields22, fields23, true);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.nightly", indexReader27, (int) (byte) 1, postingsEnum29, postingsEnum30);
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", 1, numericDocValues34, numericDocValues35);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6012");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) charSequenceArray36);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6013");
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
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder33 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        java.lang.String str34 = commonGramsTokenFilterFactoryTests0.getTestName();
        java.lang.String str35 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", (int) '#', numericDocValues38, numericDocValues39);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6014");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.badapples", indexReader8, fields9, fields10, true);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 0);
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests23.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests23);
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests23.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule26);
        org.junit.Assert.assertNotNull((java.lang.Object) testRule26);
        org.junit.Assert.assertNotNull((java.lang.Object) testRule26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) terms19, (java.lang.Object) testRule26);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6015");
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
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray41, (java.lang.Object) charSequenceArray56);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray41);
        java.lang.String[] strArray80 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet81 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray80);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet82 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray80);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet83 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray80);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) charSequenceArray41, (java.lang.Object[]) strArray80);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6016");
        char[] charArray6 = new char[] { 'a', 'a', 'a', '4', ' ' };
        char[] charArray12 = new char[] { 'a', 'a', 'a', '4', ' ' };
        char[][] charArray13 = new char[][] { charArray6, charArray12 };
        java.util.Set<char[]> charArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(charArray13);
        java.lang.Object obj16 = new java.lang.Object();
        org.junit.Assert.assertNotEquals(obj16, (java.lang.Object) "");
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
        org.elasticsearch.common.settings.Settings.Builder builder39 = commonGramsTokenFilterFactoryTests19.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("random", obj16, (java.lang.Object) builder39);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests41 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests41.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader43, 0, postingsEnum45, postingsEnum46);
        commonGramsTokenFilterFactoryTests41.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests41.assertPositionsSkippingEquals("tests.weekly", indexReader50, (int) '#', postingsEnum52, postingsEnum53);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        commonGramsTokenFilterFactoryTests41.assertFieldsEquals("enwiki.random.lines.txt", indexReader56, fields57, fields58, true);
        commonGramsTokenFilterFactoryTests41.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests41.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule63 = commonGramsTokenFilterFactoryTests41.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests41);
        org.elasticsearch.common.settings.Settings.Builder builder65 = commonGramsTokenFilterFactoryTests41.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        commonGramsTokenFilterFactoryTests41.assertPositionsSkippingEquals("random", indexReader67, (int) '#', postingsEnum69, postingsEnum70);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray73 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet74 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray73);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests75 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests75.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests75.setUp();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) queryCachingPolicySet74, (java.lang.Object) commonGramsTokenFilterFactoryTests75);
        org.junit.Assert.assertNotEquals((java.lang.Object) "random", (java.lang.Object) queryCachingPolicySet74);
        java.util.Set[][] setArray81 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray82 = (java.util.Set<java.lang.CharSequence>[][]) setArray81;
        java.util.Set<java.util.Set<java.lang.CharSequence>[]> charSequenceSetArraySet83 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray82);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) charSequenceSetArray82);
        java.util.Set<java.util.Collection[]> collectionArraySet85 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection[][]) charSequenceSetArray82);
        java.util.Collection[] collectionArray87 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray88 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray87;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet89 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.CharSequence>[]) collectionArray87);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceSetArray82, (java.lang.Object[]) collectionArray87);
        java.util.Set<java.util.Set<java.lang.CharSequence>[]> charSequenceSetArraySet91 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) charArray13, (java.lang.Object[]) charSequenceSetArray82);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6017");
        double[] doubleArray4 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        double[] doubleArray10 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        double[][][] doubleArray12 = new double[][][] { doubleArray5, doubleArray11 };
        double[] doubleArray17 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray18 = new double[][] { doubleArray17 };
        double[] doubleArray23 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray24 = new double[][] { doubleArray23 };
        double[][][] doubleArray25 = new double[][][] { doubleArray18, doubleArray24 };
        double[] doubleArray30 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray31 = new double[][] { doubleArray30 };
        double[] doubleArray36 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray37 = new double[][] { doubleArray36 };
        double[][][] doubleArray38 = new double[][][] { doubleArray31, doubleArray37 };
        double[] doubleArray43 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray44 = new double[][] { doubleArray43 };
        double[] doubleArray49 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray50 = new double[][] { doubleArray49 };
        double[][][] doubleArray51 = new double[][][] { doubleArray44, doubleArray50 };
        double[] doubleArray56 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray57 = new double[][] { doubleArray56 };
        double[] doubleArray62 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray63 = new double[][] { doubleArray62 };
        double[][][] doubleArray64 = new double[][][] { doubleArray57, doubleArray63 };
        double[][][][] doubleArray65 = new double[][][][] { doubleArray12, doubleArray25, doubleArray38, doubleArray51, doubleArray64 };
        java.util.Set<double[][][]> doubleArraySet66 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray65);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling68 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray69 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling68 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet70 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray69);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests72 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests72.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests72.setUp();
        java.lang.String str75 = commonGramsTokenFilterFactoryTests72.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests72);
        commonGramsTokenFilterFactoryTests72.tearDown();
        commonGramsTokenFilterFactoryTests72.tearDown();
        commonGramsTokenFilterFactoryTests72.setIndexWriterMaxDocs((int) '#');
        org.junit.Assert.assertNotSame("random", (java.lang.Object) throttlingArray69, (java.lang.Object) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray65, (java.lang.Object[]) throttlingArray69);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6018");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader10, (int) (byte) 0, postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.awaitsfix", indexReader17, fields18, fields19, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6019");
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
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
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
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        commonGramsTokenFilterFactoryTests27.assertFieldsEquals("tests.weekly", indexReader48, fields49, fields50, true);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        commonGramsTokenFilterFactoryTests27.assertDocsSkippingEquals("tests.awaitsfix", indexReader54, (int) '#', postingsEnum56, postingsEnum57, false);
        commonGramsTokenFilterFactoryTests27.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests27);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6020");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 1.0d, (double) (byte) 100);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6021");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 100.0d, 0.0d, (double) 10.0f);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6022");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.slow", indexReader10, terms11, terms12, true);
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader17, 0, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6023");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 100L);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6024");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (byte) 100, (long) (byte) -1);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6025");
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
        java.lang.Class<?> wildcardClass23 = commonGramsTokenFilterFactoryTests1.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy25 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass26 = queryCachingPolicy25.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests28.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests28.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests32.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests32.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader35, (int) (byte) -1, postingsEnum37, postingsEnum38);
        org.junit.rules.TestRule testRule40 = commonGramsTokenFilterFactoryTests32.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests32);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests28, (java.lang.Object) "tests.slow");
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) wildcardClass26, (java.lang.Object) "tests.slow");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests45 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests45.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests45.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader48, (int) (byte) -1, postingsEnum50, postingsEnum51);
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests45.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests45);
        commonGramsTokenFilterFactoryTests45.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule56 = commonGramsTokenFilterFactoryTests45.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        commonGramsTokenFilterFactoryTests45.assertDocsEnumEquals("hi!", postingsEnum58, postingsEnum59, false);
        commonGramsTokenFilterFactoryTests45.setUp();
        java.lang.Class<?> wildcardClass63 = commonGramsTokenFilterFactoryTests45.getClass();
        java.lang.Class[] classArray65 = new java.lang.Class[3];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray66 = (java.lang.Class<?>[]) classArray65;
        wildcardClassArray66[0] = wildcardClass23;
        wildcardClassArray66[1] = wildcardClass26;
        wildcardClassArray66[2] = wildcardClass63;
        java.lang.Class[][] classArray74 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray75 = (java.lang.Class<?>[][]) classArray74;
        wildcardClassArray75[0] = wildcardClassArray66;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet78 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray75);
        java.util.Collection[] collectionArray80 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray81 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray80;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet82 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.CharSequence>[]) collectionArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) wildcardClassArray75, (java.lang.Object[]) collectionArray80);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6026");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (byte) 0, (double) '#', (double) 4);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6027");
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
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.nightly", 100, numericDocValues31, numericDocValues32);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6028");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) 1);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6029");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, 0.0d, (double) 0);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6030");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0, 0.0d, (-1.0d));
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6031");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(100.0d, 100.0d, 10.0d);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6032");
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
        org.elasticsearch.common.settings.Settings.Builder builder14 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6033");
        byte[][] byteArray0 = new byte[][] {};
        byte[][] byteArray1 = new byte[][] {};
        byte[][] byteArray2 = new byte[][] {};
        byte[][][] byteArray3 = new byte[][][] { byteArray0, byteArray1, byteArray2 };
        java.util.Set<byte[][]> byteArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray8);
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
        long[] longArray52 = new long[] {};
        long[] longArray53 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray52, longArray53);
        long[] longArray55 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray52, longArray55);
        long[] longArray58 = new long[] {};
        long[] longArray59 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray58, longArray59);
        org.junit.Assert.assertArrayEquals(longArray55, longArray58);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray36, longArray55);
        org.junit.Assert.assertNotEquals((java.lang.Object) shortArray8, (java.lang.Object) longArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) byteArray3, (java.lang.Object) longArray55);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6034");
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
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("hi!", indexReader24, terms25, terms26, false);
        org.elasticsearch.common.settings.Settings.Builder builder29 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6035");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) (byte) 0, (float) (byte) -1, (float) (byte) 0);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6036");
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
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader15, (int) (short) 0, postingsEnum17, postingsEnum18);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.weekly", indexReader22, terms23, terms24, true);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests31.setUp();
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet39 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray38);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet45 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray44);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray38, (java.lang.Object[]) charSequenceArray44);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests31, (java.lang.Object) charSequenceArray38);
        commonGramsTokenFilterFactoryTests31.tearDown();
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) (-1.0d), (java.lang.Object) commonGramsTokenFilterFactoryTests31);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsSkippingEquals("tests.maxfailures", indexReader51, (int) (byte) 10, postingsEnum53, postingsEnum54, false);
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        commonGramsTokenFilterFactoryTests31.assertTermsEquals("", indexReader58, terms59, terms60, false);
        commonGramsTokenFilterFactoryTests31.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsEnumEquals("tests.awaitsfix", postingsEnum65, postingsEnum66, false);
        java.lang.String str69 = commonGramsTokenFilterFactoryTests31.getTestName();
        org.junit.rules.TestRule testRule70 = commonGramsTokenFilterFactoryTests31.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests31);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests31);
        org.elasticsearch.common.settings.Settings.Builder builder73 = commonGramsTokenFilterFactoryTests31.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests31.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum75, postingsEnum76);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6037");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (byte) 0, (-1L));
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6038");
        float[] floatArray1 = null;
        float[] floatArray7 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray11 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray11, (float) 100L);
        float[] floatArray17 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray21 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray21, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray17, 1.0f);
        float[] floatArray29 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray33 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray33, (float) 100L);
        float[] floatArray39 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray43 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray43, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray39, 1.0f);
        java.lang.Object obj48 = new java.lang.Object();
        org.junit.Assert.assertNotEquals((java.lang.Object) floatArray39, obj48);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray7, floatArray39, 100.0f);
        float[] floatArray55 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray59 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray59, (float) 100L);
        float[] floatArray65 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray69 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray69, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray65, 1.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray7, floatArray65, (float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray1, floatArray7, (float) 10L);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6039");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule4;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule4;
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
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests7.assertFieldsEquals("enwiki.random.lines.txt", indexReader22, fields23, fields24, true);
        commonGramsTokenFilterFactoryTests7.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests7.tearDown();
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests7.ruleChain;
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests7.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule30;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule30;
        org.junit.Assert.assertNotSame((java.lang.Object) testRule4, (java.lang.Object) testRule30);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule30;
        java.lang.Object obj35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) testRule30, obj35);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6040");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests19.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader22, (int) (byte) -1, postingsEnum24, postingsEnum25);
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests19.ruleChain;
        commonGramsTokenFilterFactoryTests19.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests19.setIndexWriterMaxDocs((int) (short) 0);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests33.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests33.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader36, (int) (byte) -1, postingsEnum38, postingsEnum39);
        org.junit.rules.TestRule testRule41 = commonGramsTokenFilterFactoryTests33.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests33);
        commonGramsTokenFilterFactoryTests33.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests33.ruleChain;
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) testRule44);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        commonGramsTokenFilterFactoryTests19.assertTermsEquals("tests.slow", indexReader47, terms48, terms49, false);
        org.elasticsearch.common.settings.Settings.Builder builder52 = commonGramsTokenFilterFactoryTests19.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder53 = commonGramsTokenFilterFactoryTests19.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6041");
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
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray50, byteArray51);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray54, byteArray55);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray51, byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray55);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests60 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests60.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests60.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests60.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests60.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str66 = commonGramsTokenFilterFactoryTests60.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder67 = commonGramsTokenFilterFactoryTests60.newAnalysisSettingsBuilder();
        java.lang.String str68 = commonGramsTokenFilterFactoryTests60.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests69 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests69.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        commonGramsTokenFilterFactoryTests69.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader72, (int) (byte) -1, postingsEnum74, postingsEnum75);
        commonGramsTokenFilterFactoryTests69.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder78 = commonGramsTokenFilterFactoryTests69.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests69.setUp();
        commonGramsTokenFilterFactoryTests69.setUp();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests60, (java.lang.Object) commonGramsTokenFilterFactoryTests69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) byteArray4, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6042");
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray5, longArray6);
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray5, longArray8);
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("random", longArray5, longArray10);
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
        long[] longArray83 = new long[] {};
        long[] longArray84 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray83, longArray84);
        long[] longArray86 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray83, longArray86);
        long[] longArray89 = new long[] {};
        long[] longArray90 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray89, longArray90);
        org.junit.Assert.assertArrayEquals(longArray86, longArray89);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray75, longArray86);
        org.junit.Assert.assertArrayEquals("", longArray16, longArray86);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray10, longArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6043");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) '4', (float) (short) 10, (float) ' ');
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6044");
        short[] shortArray5 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[] shortArray10 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[] shortArray15 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[][] shortArray16 = new short[][] { shortArray5, shortArray10, shortArray15 };
        java.util.Set<short[]> shortArraySet17 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray16);
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests37.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests37.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader40, (int) (byte) -1, postingsEnum42, postingsEnum43);
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests37.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests46.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests46.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader49, (int) (byte) -1, postingsEnum51, postingsEnum52);
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests46.ruleChain;
        org.junit.rules.TestRule[] testRuleArray55 = new org.junit.rules.TestRule[] { testRule27, testRule36, testRule45, testRule54 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet56 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray55);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) testRuleSet56);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests59 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests59.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests59.setUp();
        java.lang.String str62 = commonGramsTokenFilterFactoryTests59.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests59);
        commonGramsTokenFilterFactoryTests59.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) testRuleSet56, (java.lang.Object) commonGramsTokenFilterFactoryTests59);
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        commonGramsTokenFilterFactoryTests59.assertFieldsEquals("tests.monster", indexReader67, fields68, fields69, false);
        org.junit.rules.TestRule testRule72 = commonGramsTokenFilterFactoryTests59.ruleChain;
        java.lang.String str73 = commonGramsTokenFilterFactoryTests59.getTestName();
        commonGramsTokenFilterFactoryTests59.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) shortArray16, (java.lang.Object) commonGramsTokenFilterFactoryTests59);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6045");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', (float) (byte) 10, (float) '#');
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6046");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 1, (double) '4', (double) (short) 1);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6047");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) (short) -1);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6048");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (short) 100, (long) ' ');
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6049");
        java.lang.Object[] objArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) wildcardClassArray8);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6050");
        float[] floatArray5 = new float[] { (byte) 10, (byte) 10, (-1L), 10L };
        float[][] floatArray6 = new float[][] { floatArray5 };
        float[] floatArray11 = new float[] { (byte) 10, (byte) 10, (-1L), 10L };
        float[][] floatArray12 = new float[][] { floatArray11 };
        float[] floatArray17 = new float[] { (byte) 10, (byte) 10, (-1L), 10L };
        float[][] floatArray18 = new float[][] { floatArray17 };
        float[] floatArray23 = new float[] { (byte) 10, (byte) 10, (-1L), 10L };
        float[][] floatArray24 = new float[][] { floatArray23 };
        float[] floatArray29 = new float[] { (byte) 10, (byte) 10, (-1L), 10L };
        float[][] floatArray30 = new float[][] { floatArray29 };
        float[][][] floatArray31 = new float[][][] { floatArray6, floatArray12, floatArray18, floatArray24, floatArray30 };
        java.util.Set<float[][]> floatArraySet32 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray31);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        commonGramsTokenFilterFactoryTests33.assertTermsEquals("", indexReader35, terms36, terms37, false);
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsEnumEquals("tests.weekly", postingsEnum41, postingsEnum42, false);
        commonGramsTokenFilterFactoryTests33.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests33.assertPositionsSkippingEquals("tests.nightly", indexReader48, (int) (short) 100, postingsEnum50, postingsEnum51);
        commonGramsTokenFilterFactoryTests33.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder54 = commonGramsTokenFilterFactoryTests33.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) floatArraySet32, (java.lang.Object) commonGramsTokenFilterFactoryTests33);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6051");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) 100, (long) (short) 100);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6052");
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
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests18.overrideTestDefaultQueryCache();
        java.lang.String str22 = commonGramsTokenFilterFactoryTests18.getTestName();
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests18.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6053");
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
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.maxfailures", (int) (short) 10, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6054");
        java.lang.String[] strArray5 = new java.lang.String[] { "random", "tests.maxfailures", "tests.failfast", "tests.slow", "tests.monster" };
        java.lang.String[] strArray11 = new java.lang.String[] { "random", "tests.maxfailures", "tests.failfast", "tests.slow", "tests.monster" };
        java.lang.String[] strArray17 = new java.lang.String[] { "random", "tests.maxfailures", "tests.failfast", "tests.slow", "tests.monster" };
        java.lang.String[][] strArray18 = new java.lang.String[][] { strArray5, strArray11, strArray17 };
        java.util.Set<java.lang.String[]> strArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        java.util.Set<java.lang.String[]> strArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        java.util.Set<java.lang.String[]> strArraySet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
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
        commonGramsTokenFilterFactoryTests22.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests52.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests52.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests56 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests56.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        commonGramsTokenFilterFactoryTests56.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader59, (int) (byte) -1, postingsEnum61, postingsEnum62);
        org.junit.rules.TestRule testRule64 = commonGramsTokenFilterFactoryTests56.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests56);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests52, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests52.setUp();
        commonGramsTokenFilterFactoryTests52.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        commonGramsTokenFilterFactoryTests52.assertDocsSkippingEquals("", indexReader70, 10, postingsEnum72, postingsEnum73, false);
        commonGramsTokenFilterFactoryTests52.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests52);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests79 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests79.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests79.setUp();
        java.lang.String str82 = commonGramsTokenFilterFactoryTests79.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests79);
        commonGramsTokenFilterFactoryTests79.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray85 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] { commonGramsTokenFilterFactoryTests22, commonGramsTokenFilterFactoryTests52, commonGramsTokenFilterFactoryTests79 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests> commonGramsTokenFilterFactoryTestsSet86 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray85);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet87 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray85);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet88 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray85);
        java.util.Set<java.lang.Object> objSet89 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray85);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray18, (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray85);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6055");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 0.0f, (float) (byte) 1, (float) (short) 0);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6056");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.tearDown();
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet10 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray9);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) charSequenceArray9);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.slow", indexReader14, 3, postingsEnum16, postingsEnum17);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) 'a');
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6057");
        short[] shortArray0 = null;
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
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray32);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray30);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        org.junit.Assert.assertArrayEquals("", shortArray40, shortArray42);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray47);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray49);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray42, shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray47);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray58);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
        org.junit.Assert.assertArrayEquals("", shortArray58, shortArray60);
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray58, shortArray64);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray67);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray73);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray76);
        org.junit.Assert.assertArrayEquals("", shortArray73, shortArray75);
        org.junit.Assert.assertArrayEquals("hi!", shortArray67, shortArray73);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray21, shortArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray21);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6058");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests30.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests30.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader33, (int) (byte) -1, postingsEnum35, postingsEnum36);
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests30.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests39.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests39.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader42, (int) (byte) -1, postingsEnum44, postingsEnum45);
        org.junit.rules.TestRule testRule47 = commonGramsTokenFilterFactoryTests39.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests48 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests48.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests48.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader51, (int) (byte) -1, postingsEnum53, postingsEnum54);
        org.junit.rules.TestRule testRule56 = commonGramsTokenFilterFactoryTests48.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests57 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests57.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        commonGramsTokenFilterFactoryTests57.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader60, (int) (byte) -1, postingsEnum62, postingsEnum63);
        org.junit.rules.TestRule testRule65 = commonGramsTokenFilterFactoryTests57.ruleChain;
        org.junit.rules.TestRule[] testRuleArray66 = new org.junit.rules.TestRule[] { testRule38, testRule47, testRule56, testRule65 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet67 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray66);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) testRuleArray66);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6059");
        int[] intArray1 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray4, intArray5);
        java.lang.Object obj9 = null;
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray13, intArray14);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray13, intArray17);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray22, intArray23);
        org.junit.Assert.assertArrayEquals("hi!", intArray17, intArray22);
        org.junit.Assert.assertNotSame("", obj9, (java.lang.Object) intArray17);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray31, intArray32);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray35, intArray36);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray31, intArray35);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray40, intArray41);
        org.junit.Assert.assertArrayEquals("hi!", intArray35, intArray40);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray46, intArray47);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray50, intArray51);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray46, intArray50);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray35, intArray50);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray17, intArray35);
        org.junit.Assert.assertArrayEquals(intArray5, intArray35);
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
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) intArray70);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray35, intArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray1, intArray70);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6060");
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
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.nightly", indexReader23, fields24, fields25, true);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.slow", indexReader29, terms30, terms31, true);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum35, postingsEnum36);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6061");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, 0, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
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
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray45, byteArray46);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray35, byteArray46);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray51, byteArray52);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray55, byteArray56);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray52, byteArray55);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray62, byteArray63);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray66, byteArray67);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray63, byteArray67);
        byte[] byteArray72 = new byte[] {};
        byte[] byteArray73 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray72, byteArray73);
        byte[] byteArray76 = new byte[] {};
        byte[] byteArray77 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray76, byteArray77);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray73, byteArray76);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray67, byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray52, byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray52);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) byteArray46);
        org.elasticsearch.common.settings.Settings.Builder builder84 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests85 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests85.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests85.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests85.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests85.setUp();
        java.lang.String str90 = commonGramsTokenFilterFactoryTests85.getTestName();
        org.apache.lucene.index.IndexReader indexReader92 = null;
        org.apache.lucene.index.Terms terms93 = null;
        org.apache.lucene.index.Terms terms94 = null;
        commonGramsTokenFilterFactoryTests85.assertTermsEquals("tests.badapples", indexReader92, terms93, terms94, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests85);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6062");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (short) 0, (long) (short) 100);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6063");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        java.lang.String str5 = commonGramsTokenFilterFactoryTests3.getTestName();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        java.lang.Object obj7 = null;
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests3, obj7);
        java.lang.Object obj9 = null;
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests3, obj9);
        commonGramsTokenFilterFactoryTests3.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests12.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests12);
        commonGramsTokenFilterFactoryTests12.tearDown();
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests12.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests12.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) builder17);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6064");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, false);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("", indexReader13, 3, postingsEnum15, postingsEnum16);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.badapples", indexReader19, (int) (short) -1, postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.slow", postingsEnum26, postingsEnum27, true);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6065");
        double[][][][][] doubleArray1 = new double[][][][][] {};
        java.util.Set<double[][][][]> doubleArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests5.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests5.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests5.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests5.setUp();
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests5.ruleChain;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests5.assertFieldsEquals("tests.badapples", indexReader12, fields13, fields14, true);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals("", shortArray19, shortArray21);
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader12, (java.lang.Object) shortArray21);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals("", shortArray29, shortArray31);
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray29, shortArray35);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray39);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals("", shortArray39, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray39);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray21, shortArray35);
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray47 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray48 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[][] baseTokenStreamTestCaseArray49 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[][] { baseTokenStreamTestCaseArray47, baseTokenStreamTestCaseArray48 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase[]> baseTokenStreamTestCaseArraySet50 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray49);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) shortArray35, (java.lang.Object) baseTokenStreamTestCaseArray49);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase[]> baseTokenStreamTestCaseArraySet52 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) doubleArray1, (java.lang.Object[]) baseTokenStreamTestCaseArray49);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6066");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray14);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) charSequenceArray8);
        java.lang.String[] strArray23 = new java.lang.String[] { "random", "tests.maxfailures", "tests.failfast", "tests.slow", "tests.monster" };
        java.lang.String[] strArray29 = new java.lang.String[] { "random", "tests.maxfailures", "tests.failfast", "tests.slow", "tests.monster" };
        java.lang.String[] strArray35 = new java.lang.String[] { "random", "tests.maxfailures", "tests.failfast", "tests.slow", "tests.monster" };
        java.lang.String[][] strArray36 = new java.lang.String[][] { strArray23, strArray29, strArray35 };
        java.util.Set<java.lang.String[]> strArraySet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[][]) strArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) strArray36);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6067");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray0 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray1 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray0 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray2 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray3 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray2 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray4 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray5 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray4 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray6 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray7 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray6 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][][] testRuleIgnoreAfterMaxFailuresArray8 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][][] { testRuleIgnoreAfterMaxFailuresArray1, testRuleIgnoreAfterMaxFailuresArray3, testRuleIgnoreAfterMaxFailuresArray5, testRuleIgnoreAfterMaxFailuresArray7 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][]> testRuleIgnoreAfterMaxFailuresArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray8);
        java.lang.String[] strArray15 = new java.lang.String[] { "random", "tests.maxfailures", "tests.failfast", "tests.slow", "tests.monster" };
        java.lang.String[] strArray21 = new java.lang.String[] { "random", "tests.maxfailures", "tests.failfast", "tests.slow", "tests.monster" };
        java.lang.String[] strArray27 = new java.lang.String[] { "random", "tests.maxfailures", "tests.failfast", "tests.slow", "tests.monster" };
        java.lang.String[][] strArray28 = new java.lang.String[][] { strArray15, strArray21, strArray27 };
        java.util.Set<java.lang.String[]> strArraySet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[][]) strArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray8, (java.lang.Object[]) strArray28);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6068");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 10, (double) 1L, (double) 1.0f);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6069");
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
        java.util.Set<double[][][][]> doubleArraySet36 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray34);
        java.lang.Object obj37 = null;
        org.elasticsearch.test.ESTokenStreamTestCase[][] eSTokenStreamTestCaseArray38 = new org.elasticsearch.test.ESTokenStreamTestCase[][] {};
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase[]> eSTokenStreamTestCaseArraySet39 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray38);
        java.util.Set<java.io.Serializable> serializableSet40 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) eSTokenStreamTestCaseArray38);
        org.junit.Assert.assertNotEquals(obj37, (java.lang.Object) eSTokenStreamTestCaseArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) doubleArray34, (java.lang.Object[]) eSTokenStreamTestCaseArray38);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6070");
        java.util.Set[][] setArray1 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray2 = (java.util.Set<java.lang.CharSequence>[][]) setArray1;
        java.util.Set<java.util.Set<java.lang.CharSequence>[]> charSequenceSetArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray2);
        java.util.Set<java.util.Set<java.lang.CharSequence>[]> charSequenceSetArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray2);
        java.util.Set<java.util.Set<java.lang.CharSequence>[]> charSequenceSetArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray2);
        java.util.Locale[] localeArray6 = new java.util.Locale[] {};
        java.util.Locale[][] localeArray7 = new java.util.Locale[][] { localeArray6 };
        java.util.Set<java.util.Locale[]> localeArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceSetArray2, (java.lang.Object[]) localeArray7);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6071");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests31.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests31.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests35.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests35.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader38, (int) (byte) -1, postingsEnum40, postingsEnum41);
        org.junit.rules.TestRule testRule43 = commonGramsTokenFilterFactoryTests35.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests35);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests31, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests31.setUp();
        commonGramsTokenFilterFactoryTests31.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsSkippingEquals("", indexReader49, 10, postingsEnum51, postingsEnum52, false);
        commonGramsTokenFilterFactoryTests31.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests31);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests58 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests58.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests58.setUp();
        java.lang.String str61 = commonGramsTokenFilterFactoryTests58.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests58);
        commonGramsTokenFilterFactoryTests58.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray64 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests31, commonGramsTokenFilterFactoryTests58 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests> commonGramsTokenFilterFactoryTestsSet65 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray64);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet66 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray64);
        org.elasticsearch.test.ESTokenStreamTestCase[][] eSTokenStreamTestCaseArray67 = new org.elasticsearch.test.ESTokenStreamTestCase[][] {};
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase[]> eSTokenStreamTestCaseArraySet68 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray67);
        short[][] shortArray69 = new short[][] {};
        java.util.Set<short[]> shortArraySet70 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray69);
        java.util.Set<java.lang.Cloneable> cloneableSet71 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) shortArray69);
        org.junit.Assert.assertEquals((java.lang.Object[]) eSTokenStreamTestCaseArray67, (java.lang.Object[]) shortArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray64, (java.lang.Object[]) shortArray69);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6072");
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
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests23);
        org.elasticsearch.common.settings.Settings.Builder builder33 = commonGramsTokenFilterFactoryTests23.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues36 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests23.assertDocValuesEquals("tests.maxfailures", (int) (short) 0, numericDocValues36, numericDocValues37);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6073");
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
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader29, terms30, terms31, true);
        java.lang.Object obj34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame((java.lang.Object) terms30, obj34);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6074");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 100L, (double) 2, (double) 0);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6075");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 10, (float) 1L, (float) 1L);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6076");
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
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("tests.maxfailures", (int) (short) 0, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6077");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0.0d, (double) (byte) 10, (double) (-1.0f));
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6078");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 100, (double) 10L, (double) 100);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6079");
        short[] shortArray4 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[] shortArray9 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[] shortArray14 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[][] shortArray15 = new short[][] { shortArray4, shortArray9, shortArray14 };
        java.util.Set<short[]> shortArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray15);
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) shortArray15);
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
        commonGramsTokenFilterFactoryTests18.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests48 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests48.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests48.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests52.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests52.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader55, (int) (byte) -1, postingsEnum57, postingsEnum58);
        org.junit.rules.TestRule testRule60 = commonGramsTokenFilterFactoryTests52.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests52);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests48, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests48.setUp();
        commonGramsTokenFilterFactoryTests48.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        commonGramsTokenFilterFactoryTests48.assertDocsSkippingEquals("", indexReader66, 10, postingsEnum68, postingsEnum69, false);
        commonGramsTokenFilterFactoryTests48.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests48);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests75 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests75.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests75.setUp();
        java.lang.String str78 = commonGramsTokenFilterFactoryTests75.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests75);
        commonGramsTokenFilterFactoryTests75.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray81 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] { commonGramsTokenFilterFactoryTests18, commonGramsTokenFilterFactoryTests48, commonGramsTokenFilterFactoryTests75 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests> commonGramsTokenFilterFactoryTestsSet82 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray81);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet83 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray81);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet84 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray81);
        java.util.Set<java.lang.Object> objSet85 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray81);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) shortArray15, (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray81);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6080");
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
        long[] longArray33 = new long[] {};
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray33, longArray34);
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray33, longArray36);
        org.junit.Assert.assertArrayEquals(longArray26, longArray36);
        org.junit.Assert.assertArrayEquals(longArray6, longArray26);
        long[] longArray42 = new long[] {};
        long[] longArray43 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray42, longArray43);
        long[] longArray45 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray42, longArray45);
        long[] longArray48 = new long[] {};
        long[] longArray49 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray48, longArray49);
        org.junit.Assert.assertArrayEquals(longArray45, longArray48);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray26, longArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray1, longArray45);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6081");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray2 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet3 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests4.setUp();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) queryCachingPolicySet3, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests4.ruleChain;
        commonGramsTokenFilterFactoryTests4.setIndexWriterMaxDocs(0);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests12.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader14, 0, postingsEnum16, postingsEnum17);
        commonGramsTokenFilterFactoryTests12.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests12.assertPositionsSkippingEquals("tests.weekly", indexReader21, (int) '#', postingsEnum23, postingsEnum24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests12.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader27, 0, postingsEnum29, postingsEnum30);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsSkippingEquals("", indexReader33, (int) (short) -1, postingsEnum35, postingsEnum36, true);
        commonGramsTokenFilterFactoryTests12.setUp();
        commonGramsTokenFilterFactoryTests12.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder41 = commonGramsTokenFilterFactoryTests12.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests12.tearDown();
        org.junit.rules.TestRule testRule43 = commonGramsTokenFilterFactoryTests12.ruleChain;
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests12.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests12);
        commonGramsTokenFilterFactoryTests12.setIndexWriterMaxDocs(0);
        java.lang.String str48 = commonGramsTokenFilterFactoryTests12.getTestName();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsSkippingEquals("tests.awaitsfix", indexReader50, (int) (byte) 100, postingsEnum52, postingsEnum53, false);
        org.junit.rules.TestRule testRule56 = commonGramsTokenFilterFactoryTests12.ruleChain;
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) commonGramsTokenFilterFactoryTests12);
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests12.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum59, postingsEnum60);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6082");
        java.lang.Object[] objArray0 = null;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2, throttling3, throttling4, throttling5, throttling6 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray7);
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) throttlingArray7);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6083");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) 0, (long) 3);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6084");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum5, postingsEnum6, true);
        java.lang.String str9 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.awaitsfix", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.nightly", indexReader18, 4, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.maxfailures", indexReader24, terms25, terms26, true);
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.badapples", 3, numericDocValues31, numericDocValues32);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6085");
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
        java.lang.Object obj46 = new java.lang.Object();
        org.junit.Assert.assertNotEquals((java.lang.Object) floatArray37, obj46);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray5, floatArray37, 100.0f);
        float[] floatArray53 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray57 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray57, (float) 100L);
        float[] floatArray63 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray67 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray67, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray63, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray63, (float) (byte) 10);
        float[] floatArray78 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray82 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray78, floatArray82, (float) 100L);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) floatArray78);
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray78, (-1.0f));
        java.util.Locale locale89 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale91 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale93 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray94 = new java.util.Locale[] { locale89, locale91, locale93 };
        java.util.Set<java.util.Locale> localeSet95 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray94);
        java.util.Set<java.util.Locale> localeSet96 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray94);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) floatArray78, (java.lang.Object) localeSet96);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6086");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) 0, (float) (byte) 100, (float) ' ');
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6087");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 0.0f, (-1.0d));
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6088");
        java.lang.Object obj2 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, 0, postingsEnum7, postingsEnum8);
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.weekly", indexReader12, (int) '#', postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, 0, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader24, (int) (short) -1, postingsEnum26, postingsEnum27, true);
        commonGramsTokenFilterFactoryTests3.setUp();
        commonGramsTokenFilterFactoryTests3.setUp();
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
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests33);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests60 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests60.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests60.setUp();
        java.lang.String str63 = commonGramsTokenFilterFactoryTests60.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests60);
        commonGramsTokenFilterFactoryTests60.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray66 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] { commonGramsTokenFilterFactoryTests3, commonGramsTokenFilterFactoryTests33, commonGramsTokenFilterFactoryTests60 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests> commonGramsTokenFilterFactoryTestsSet67 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray66);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet68 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray66);
        org.junit.Assert.assertNotEquals("tests.maxfailures", obj2, (java.lang.Object) commonGramsTokenFilterFactoryTestsArray66);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet70 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray66);
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase> eSTokenStreamTestCaseSet71 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ESTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray66);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling73 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray74 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling73 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet75 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray74);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling76 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray77 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling76 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet78 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray77);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests80 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests80.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests80);
        org.junit.rules.TestRule testRule83 = commonGramsTokenFilterFactoryTests80.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule83);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray77, (java.lang.Object) testRule83);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray74, (java.lang.Object[]) throttlingArray77);
        org.junit.Assert.assertNotNull((java.lang.Object) throttlingArray74);
        java.util.Set<java.io.Serializable> serializableSet88 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray66, (java.lang.Object[]) throttlingArray74);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6089");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 0, (double) 'a', (double) 10);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6090");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray2, intArray3);
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
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray48, intArray49);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray52, intArray53);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray48, intArray52);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray26, intArray52);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray58, intArray59);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray52, intArray59);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray3, intArray59);
        java.lang.Object obj64 = null;
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
        org.junit.Assert.assertNotSame("", obj64, (java.lang.Object) intArray72);
        org.junit.Assert.assertArrayEquals(intArray59, intArray72);
        int[] intArray83 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray72, intArray83);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6091");
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
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        commonGramsTokenFilterFactoryTests43.assertFieldsEquals("tests.monster", indexReader53, fields54, fields55, true);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        commonGramsTokenFilterFactoryTests43.assertDocsSkippingEquals("hi!", indexReader59, (int) 'a', postingsEnum61, postingsEnum62, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests65 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests65.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests65.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        commonGramsTokenFilterFactoryTests65.assertPositionsSkippingEquals("", indexReader69, (int) (byte) 10, postingsEnum71, postingsEnum72);
        java.lang.String str74 = commonGramsTokenFilterFactoryTests65.getTestName();
        commonGramsTokenFilterFactoryTests65.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) commonGramsTokenFilterFactoryTests43, (java.lang.Object) commonGramsTokenFilterFactoryTests65);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6092");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, 0, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.slow", postingsEnum11, postingsEnum12, true);
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader19, 2, postingsEnum21, postingsEnum22);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6093");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) (-1));
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6094");
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
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum17, postingsEnum18, true);
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        java.lang.String str22 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.nightly", postingsEnum24, postingsEnum25, true);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("enwiki.random.lines.txt", indexReader30, terms31, terms32, false);
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder37 = commonGramsTokenFilterFactoryTests36.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests36.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests36, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests36.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests36.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        commonGramsTokenFilterFactoryTests36.assertTermsEquals("", indexReader44, terms45, terms46, false);
        commonGramsTokenFilterFactoryTests36.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests36.setIndexWriterMaxDocs((int) 'a');
        commonGramsTokenFilterFactoryTests36.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) testRule35, (java.lang.Object) commonGramsTokenFilterFactoryTests36);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6095");
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
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray62, (java.lang.Object) 1.0d);
        java.lang.String[] strArray74 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet75 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray74);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet76 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray74);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests77 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder78 = commonGramsTokenFilterFactoryTests77.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests77.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests77, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests77.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        commonGramsTokenFilterFactoryTests77.assertDocsSkippingEquals("<unknown>", indexReader84, 0, postingsEnum86, postingsEnum87, false);
        commonGramsTokenFilterFactoryTests77.tearDown();
        java.lang.String str91 = commonGramsTokenFilterFactoryTests77.getTestName();
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) strArray74, (java.lang.Object) str91);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray62, (java.lang.Object[]) strArray74);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6096");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) ' ', 1.0d, (double) (short) 1);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6097");
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
        int[] intArray29 = new int[] { (short) 100, 2, (short) -1 };
        int[] intArray33 = new int[] { (short) 100, 2, (short) -1 };
        int[][] intArray34 = new int[][] { intArray29, intArray33 };
        int[] intArray38 = new int[] { (short) 100, 2, (short) -1 };
        int[] intArray42 = new int[] { (short) 100, 2, (short) -1 };
        int[][] intArray43 = new int[][] { intArray38, intArray42 };
        int[] intArray47 = new int[] { (short) 100, 2, (short) -1 };
        int[] intArray51 = new int[] { (short) 100, 2, (short) -1 };
        int[][] intArray52 = new int[][] { intArray47, intArray51 };
        int[][][] intArray53 = new int[][][] { intArray34, intArray43, intArray52 };
        java.util.Set<int[][]> intArraySet54 = org.apache.lucene.util.LuceneTestCase.asSet(intArray53);
        java.util.Set<int[][]> intArraySet55 = org.apache.lucene.util.LuceneTestCase.asSet(intArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray18, (java.lang.Object[]) intArray53);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6098");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.slow", indexReader10, terms11, terms12, true);
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6099");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder6 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests7.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests7.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests7, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests7.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests7.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests7.assertTermsEquals("", indexReader15, terms16, terms17, false);
        java.lang.String str20 = commonGramsTokenFilterFactoryTests7.getTestName();
        org.junit.Assert.assertNotEquals((java.lang.Object) builder6, (java.lang.Object) commonGramsTokenFilterFactoryTests7);
        commonGramsTokenFilterFactoryTests7.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests23.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests23.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader26, (int) (byte) -1, postingsEnum28, postingsEnum29);
        commonGramsTokenFilterFactoryTests23.tearDown();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests23.assertPositionsSkippingEquals("tests.weekly", indexReader33, (int) (byte) 1, postingsEnum35, postingsEnum36);
        org.elasticsearch.common.settings.Settings.Builder builder38 = commonGramsTokenFilterFactoryTests23.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) commonGramsTokenFilterFactoryTests7, (java.lang.Object) builder38);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6100");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10.0f, (double) (byte) 100, (double) 100.0f);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6101");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", 0L, (long) (short) 0);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6102");
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
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.monster", indexReader17, fields18, fields19, true);
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.nightly", (int) '4', numericDocValues24, numericDocValues25);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6103");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) (short) 0);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6104");
        java.lang.Object[] objArray1 = null;
        java.lang.Class[][][] classArray4 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray5 = (java.lang.Class<?>[][][]) classArray4;
        java.util.Set<java.lang.Class<?>[][]> wildcardClassArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray5);
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
        java.lang.String str28 = commonGramsTokenFilterFactoryTests9.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests29.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests29.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader32, (int) (byte) -1, postingsEnum34, postingsEnum35);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        commonGramsTokenFilterFactoryTests29.assertFieldsEquals("random", indexReader38, fields39, fields40, false);
        org.junit.rules.TestRule testRule43 = commonGramsTokenFilterFactoryTests29.ruleChain;
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) str28, (java.lang.Object) testRule43);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) wildcardClassArray5, (java.lang.Object) testRule43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", objArray1, (java.lang.Object[]) wildcardClassArray5);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6105");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) 3, 1.0d);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6106");
        java.lang.Class[][][] classArray2 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray3 = (java.lang.Class<?>[][][]) classArray2;
        java.util.Set<java.lang.Class<?>[][]> wildcardClassArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests7.setUp();
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray20);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests7, (java.lang.Object) charSequenceArray14);
        commonGramsTokenFilterFactoryTests7.tearDown();
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests7.ruleChain;
        java.lang.String str26 = commonGramsTokenFilterFactoryTests7.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests27.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader30, (int) (byte) -1, postingsEnum32, postingsEnum33);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        commonGramsTokenFilterFactoryTests27.assertFieldsEquals("random", indexReader36, fields37, fields38, false);
        org.junit.rules.TestRule testRule41 = commonGramsTokenFilterFactoryTests27.ruleChain;
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) str26, (java.lang.Object) testRule41);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) wildcardClassArray3, (java.lang.Object) testRule41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.weekly");
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6107");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 'a', 10.0d, (double) (short) 0);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6108");
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
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet54 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray3);
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet62 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray61);
        java.lang.CharSequence[] charSequenceArray67 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet68 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray67);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray61, (java.lang.Object[]) charSequenceArray67);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) charSequenceArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) throttlingArray3, (java.lang.Object[]) charSequenceArray67);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6109");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("random", postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.maxfailures", indexReader10, terms11, terms12, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.slow", (-1), numericDocValues18, numericDocValues19);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6110");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) '#', (float) (byte) -1, (float) (short) -1);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6111");
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
        commonGramsTokenFilterFactoryTests23.setIndexWriterMaxDocs(2);
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests23.assertDocsEnumEquals("tests.awaitsfix", postingsEnum52, postingsEnum53, false);
        commonGramsTokenFilterFactoryTests23.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests23);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6112");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.monster", postingsEnum12, postingsEnum13, false);
        java.lang.String str16 = commonGramsTokenFilterFactoryTests1.getTestName();
        java.lang.String str17 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.awaitsfix", indexReader19, terms20, terms21, true);
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests25.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests25);
        java.lang.String str28 = commonGramsTokenFilterFactoryTests25.getTestName();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("enwiki.random.lines.txt", indexReader30, fields31, fields32, false);
        commonGramsTokenFilterFactoryTests25.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) builder24, (java.lang.Object) commonGramsTokenFilterFactoryTests25);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6113");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', (float) (-1L), (float) (short) 1);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6114");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (short) 1, (double) 3, (double) (byte) 1);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6115");
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
        java.lang.String str52 = commonGramsTokenFilterFactoryTests21.getTestName();
        commonGramsTokenFilterFactoryTests21.tearDown();
        commonGramsTokenFilterFactoryTests21.setIndexWriterMaxDocs(10);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) 10);
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs(10);
        java.lang.Object obj60 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 10, obj60);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6116");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray1 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet2 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader6, (int) (byte) -1, postingsEnum8, postingsEnum9);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("tests.awaitsfix", postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests3.assertTermsEquals("<unknown>", indexReader17, terms18, terms19, true);
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs((int) 'a');
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs((int) (byte) 1);
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicySet2, (java.lang.Object) builder26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests28.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests28);
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests28.ruleChain;
        commonGramsTokenFilterFactoryTests28.setUp();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) queryCachingPolicySet2, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests28.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule34;
        java.lang.Object obj37 = null;
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
        org.junit.Assert.assertNotEquals(obj37, (java.lang.Object) commonGramsTokenFilterFactoryTests38);
        commonGramsTokenFilterFactoryTests38.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests38);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        commonGramsTokenFilterFactoryTests38.assertDocsSkippingEquals("tests.awaitsfix", indexReader57, 3, postingsEnum59, postingsEnum60, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule34, (java.lang.Object) postingsEnum60);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6117");
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
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) shortArray40);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6118");
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
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.badapples", postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader19, (int) ' ', postingsEnum21, postingsEnum22);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests24.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests24.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader27, (int) (byte) -1, postingsEnum29, postingsEnum30);
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests24.ruleChain;
        commonGramsTokenFilterFactoryTests24.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.common.settings.Settings.Builder builder35 = commonGramsTokenFilterFactoryTests24.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests36.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests36);
        commonGramsTokenFilterFactoryTests36.tearDown();
        org.junit.rules.TestRule testRule40 = commonGramsTokenFilterFactoryTests36.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder41 = commonGramsTokenFilterFactoryTests36.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) builder35, (java.lang.Object) commonGramsTokenFilterFactoryTests36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) builder35);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6119");
        java.lang.Object obj2 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, 0, postingsEnum7, postingsEnum8);
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.weekly", indexReader12, (int) '#', postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, 0, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader24, (int) (short) -1, postingsEnum26, postingsEnum27, true);
        commonGramsTokenFilterFactoryTests3.setUp();
        commonGramsTokenFilterFactoryTests3.setUp();
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
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests33);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests60 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests60.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests60.setUp();
        java.lang.String str63 = commonGramsTokenFilterFactoryTests60.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests60);
        commonGramsTokenFilterFactoryTests60.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray66 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] { commonGramsTokenFilterFactoryTests3, commonGramsTokenFilterFactoryTests33, commonGramsTokenFilterFactoryTests60 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests> commonGramsTokenFilterFactoryTestsSet67 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray66);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet68 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray66);
        org.junit.Assert.assertNotEquals("tests.maxfailures", obj2, (java.lang.Object) commonGramsTokenFilterFactoryTestsArray66);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet70 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray66);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet71 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray66);
        java.lang.String[] strArray76 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet77 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray76);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet78 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray76);
        java.lang.String[] strArray83 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet84 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray83);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet85 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray83);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet86 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray83);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray76, (java.lang.Object[]) strArray83);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray83);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTestsArray66, (java.lang.Object) strArray83);
        java.lang.String[] strArray94 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet95 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray94);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet96 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray94);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray66, (java.lang.Object[]) strArray94);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6120");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("", indexReader4, fields5, fields6, true);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(2);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        java.lang.Class<?> wildcardClass12 = commonGramsTokenFilterFactoryTests0.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6121");
        java.util.Set[][] setArray2 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray3 = (java.util.Set<java.lang.CharSequence>[][]) setArray2;
        java.util.Set<java.util.Set<java.lang.CharSequence>[]> charSequenceSetArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray3);
        java.util.Set<java.util.Set<java.lang.CharSequence>[]> charSequenceSetArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray3);
        java.util.Set<java.util.Set<java.lang.CharSequence>[]> charSequenceSetArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray3);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray13);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray13);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray13);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray13);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) "tests.monster", (java.lang.Object) strArray13);
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) charSequenceSetArray3, (java.lang.Object[]) strArray13);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6122");
        short[][][] shortArray1 = new short[][][] {};
        short[][][] shortArray2 = new short[][][] {};
        short[][][] shortArray3 = new short[][][] {};
        short[][][][] shortArray4 = new short[][][][] { shortArray1, shortArray2, shortArray3 };
        short[][][] shortArray5 = new short[][][] {};
        short[][][] shortArray6 = new short[][][] {};
        short[][][] shortArray7 = new short[][][] {};
        short[][][][] shortArray8 = new short[][][][] { shortArray5, shortArray6, shortArray7 };
        short[][][][][] shortArray9 = new short[][][][][] { shortArray4, shortArray8 };
        java.util.Set<short[][][][]> shortArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray9);
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray17, byteArray18);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray21, byteArray22);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray18, byteArray21);
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
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray39);
        org.junit.Assert.assertNotEquals((java.lang.Object) locale14, (java.lang.Object) byteArray39);
        org.junit.Assert.assertNotNull((java.lang.Object) locale14);
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests53 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder54 = commonGramsTokenFilterFactoryTests53.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests53.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests53, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests53.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests53.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests53.setUp();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        commonGramsTokenFilterFactoryTests53.assertPositionsSkippingEquals("tests.failfast", indexReader62, 10, postingsEnum64, postingsEnum65);
        commonGramsTokenFilterFactoryTests53.setUp();
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) locale52, (java.lang.Object) commonGramsTokenFilterFactoryTests53);
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.badapples");
        java.util.Locale locale72 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        java.util.Locale locale74 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotNull((java.lang.Object) locale74);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests77 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests77.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        commonGramsTokenFilterFactoryTests77.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader80, (int) (byte) -1, postingsEnum82, postingsEnum83);
        org.junit.rules.TestRule testRule85 = commonGramsTokenFilterFactoryTests77.ruleChain;
        java.lang.CharSequence[] charSequenceArray90 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet91 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray90);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests77, (java.lang.Object) charSequenceArray90);
        org.junit.Assert.assertNotEquals((java.lang.Object) locale74, (java.lang.Object) charSequenceArray90);
        java.util.Locale[] localeArray94 = new java.util.Locale[] { locale12, locale14, locale52, locale70, locale72, locale74 };
        java.util.Locale[][] localeArray95 = new java.util.Locale[][] { localeArray94 };
        java.util.Set<java.util.Locale[]> localeArraySet96 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray95);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) shortArray9, (java.lang.Object[]) localeArray95);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6123");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((-1));
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (byte) -1);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6124");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (short) 10, (long) 3);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6125");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 4, (long) (short) 100);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6126");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0L, (long) (short) 1);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6127");
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray5, longArray6);
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray5, longArray8);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray11, longArray12);
        org.junit.Assert.assertArrayEquals(longArray8, longArray11);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray18, longArray19);
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray18, longArray21);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray25, longArray26);
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray25, longArray28);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray31, longArray32);
        org.junit.Assert.assertArrayEquals(longArray28, longArray31);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray18, longArray28);
        long[] longArray38 = new long[] {};
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray38, longArray39);
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray38, longArray41);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray45, longArray46);
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray45, longArray48);
        org.junit.Assert.assertArrayEquals(longArray38, longArray48);
        org.junit.Assert.assertArrayEquals(longArray18, longArray38);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray11, longArray18);
        long[] longArray57 = new long[] {};
        long[] longArray58 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray57, longArray58);
        long[] longArray60 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray57, longArray60);
        long[] longArray64 = new long[] {};
        long[] longArray65 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray64, longArray65);
        long[] longArray67 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray64, longArray67);
        long[] longArray70 = new long[] {};
        long[] longArray71 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray70, longArray71);
        org.junit.Assert.assertArrayEquals(longArray67, longArray70);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray57, longArray67);
        long[] longArray77 = new long[] {};
        long[] longArray78 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray77, longArray78);
        long[] longArray80 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray77, longArray80);
        org.junit.Assert.assertArrayEquals("", longArray67, longArray77);
        org.junit.Assert.assertArrayEquals(longArray18, longArray77);
        long[] longArray85 = new long[] {};
        long[] longArray86 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray85, longArray86);
        org.junit.Assert.assertArrayEquals(longArray18, longArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) 0L, (java.lang.Object) longArray86);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6128");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray1, shortArray4);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6129");
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
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader28, fields29, fields30, true);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum35, postingsEnum36);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6130");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 0, (double) 100);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6131");
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
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray48, intArray49);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray39, intArray48);
        org.junit.Assert.assertArrayEquals(intArray31, intArray48);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) intArray48);
        java.lang.Object obj55 = null;
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray59, intArray60);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray63, intArray64);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray59, intArray63);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray68, intArray69);
        org.junit.Assert.assertArrayEquals("hi!", intArray63, intArray68);
        org.junit.Assert.assertNotSame("", obj55, (java.lang.Object) intArray63);
        org.junit.Assert.assertArrayEquals(intArray48, intArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray63);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6132");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 10, (double) 0);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6133");
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
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum38, postingsEnum39);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6134");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (short) 1, (double) 10.0f, (double) (-1L));
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6135");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray1 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet2 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests4.setUp();
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet12 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray11);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet18 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray17);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray11, (java.lang.Object[]) charSequenceArray17);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) charSequenceArray11);
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicySet2, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests23.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests23.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader26, (int) (byte) -1, postingsEnum28, postingsEnum29);
        commonGramsTokenFilterFactoryTests23.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder32 = commonGramsTokenFilterFactoryTests23.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests23.setUp();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests23.assertPositionsSkippingEquals("tests.awaitsfix", indexReader35, (int) '#', postingsEnum37, postingsEnum38);
        org.junit.rules.TestRule testRule40 = commonGramsTokenFilterFactoryTests23.ruleChain;
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) testRule40);
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues45 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests4.assertDocValuesEquals("random", 2, numericDocValues45, numericDocValues46);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6136");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) (byte) 100, 100.0d, 0.0d);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6137");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (-1.0d), (double) 10);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6138");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.tearDown();
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet10 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray9);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) charSequenceArray9);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader13, (int) (byte) -1, postingsEnum15, postingsEnum16);
        java.lang.String str18 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6139");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0L, (long) (byte) 100);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6140");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) 3);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6141");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        char[] charArray7 = new char[] { '4', '4', ' ' };
        char[] charArray11 = new char[] { '4', '4', ' ' };
        char[][] charArray12 = new char[][] { charArray3, charArray7, charArray11 };
        java.util.Set<char[]> charArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(charArray12);
        java.lang.Object[] objArray14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charArray12, objArray14);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6142");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (byte) 0, (double) 1);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6143");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, 1L);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6144");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) 1, 100.0d);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6145");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) true);
        commonGramsTokenFilterFactoryTests2.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6146");
        float[] floatArray3 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray7 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, (float) 100L);
        float[] floatArray13 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray17 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray17, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray13, 1.0f);
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
        java.lang.Object obj68 = new java.lang.Object();
        org.junit.Assert.assertNotEquals((java.lang.Object) floatArray59, obj68);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray27, floatArray59, 100.0f);
        float[] floatArray75 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray79 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray75, floatArray79, (float) 100L);
        float[] floatArray85 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray89 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray85, floatArray89, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray75, floatArray85, 1.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray27, floatArray85, (float) (byte) 1);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray27, (float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray27);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6147");
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
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet80 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.CharSequence>[]) charSequenceSetArray75);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceSetArray75);
        java.lang.Object obj82 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) charSequenceSetArray75, obj82);
        java.util.Set<java.lang.Iterable<java.lang.CharSequence>> charSequenceIterableSet84 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<java.lang.CharSequence>[]) charSequenceSetArray75);
        java.lang.Object[] objArray85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceSetArray75, objArray85);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6148");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) (short) 1);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6149");
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
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet24 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray23);
        java.lang.Class<?> wildcardClass25 = charSequenceArray23.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) builder18, (java.lang.Object) wildcardClass25);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6150");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 3, (double) 100);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6151");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (short) 10, (long) '4');
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6152");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (double) 100L, (double) (short) 100, (double) 0);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6153");
        short[] shortArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray7);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6154");
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
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.weekly", indexReader25, fields26, fields27, false);
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.nightly", postingsEnum31, postingsEnum32, false);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray37, byteArray38);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray44, byteArray45);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray48, byteArray49);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray45, byteArray49);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray54, byteArray55);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray58, byteArray59);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray55, byteArray58);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray49, byteArray55);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray66, byteArray67);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray70, byteArray71);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray67, byteArray71);
        byte[] byteArray76 = new byte[] {};
        byte[] byteArray77 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray76, byteArray77);
        byte[] byteArray80 = new byte[] {};
        byte[] byteArray81 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray80, byteArray81);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray77, byteArray80);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray71, byteArray77);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray55, byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray55);
        byte[] byteArray89 = new byte[] {};
        byte[] byteArray90 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray89, byteArray90);
        byte[] byteArray93 = new byte[] {};
        byte[] byteArray94 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray93, byteArray94);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray90, byteArray94);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray55, byteArray94);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.nightly", (java.lang.Object) byteArray55);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6155");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) (short) 10, (double) 10.0f, (double) 0.0f);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6156");
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
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6157");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (short) 0, (double) 100, (double) 10);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6158");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2, throttling3, throttling4, throttling5, throttling6 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray7);
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray7);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        short[][] shortArray13 = new short[][] { shortArray10, shortArray11, shortArray12 };
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        short[][] shortArray17 = new short[][] { shortArray14, shortArray15, shortArray16 };
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        short[][] shortArray21 = new short[][] { shortArray18, shortArray19, shortArray20 };
        short[][][] shortArray22 = new short[][][] { shortArray13, shortArray17, shortArray21 };
        java.util.Set<short[][]> shortArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray22);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests25.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests27.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader30, (int) (byte) -1, postingsEnum32, postingsEnum33);
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests27.ruleChain;
        commonGramsTokenFilterFactoryTests27.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests25, (java.lang.Object) (short) 10);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests25.assertDocsSkippingEquals("", indexReader40, (-1), postingsEnum42, postingsEnum43, false);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests25);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests25.assertDocsSkippingEquals("tests.weekly", indexReader48, (int) '#', postingsEnum50, postingsEnum51, false);
        org.elasticsearch.common.settings.Settings.Builder builder54 = commonGramsTokenFilterFactoryTests25.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) shortArray22, (java.lang.Object) builder54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) throttlingArray7, (java.lang.Object[]) shortArray22);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6159");
        byte[] byteArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray3);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6160");
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
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6161");
        char[] charArray1 = null;
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
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
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
        org.junit.Assert.assertArrayEquals(charArray16, charArray19);
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
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        org.junit.Assert.assertArrayEquals(charArray49, charArray52);
        org.junit.Assert.assertArrayEquals("", charArray45, charArray49);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray37, charArray45);
        org.junit.Assert.assertArrayEquals(charArray16, charArray45);
        org.junit.Assert.assertArrayEquals(charArray4, charArray16);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        org.junit.Assert.assertArrayEquals(charArray16, charArray60);
        org.junit.Assert.assertNotNull((java.lang.Object) charArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests64 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests64.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests64);
        org.junit.rules.TestRule testRule67 = commonGramsTokenFilterFactoryTests64.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        commonGramsTokenFilterFactoryTests64.assertDocsEnumEquals("tests.failfast", postingsEnum69, postingsEnum70, true);
        java.lang.String str73 = commonGramsTokenFilterFactoryTests64.getTestName();
        org.junit.rules.TestRule testRule74 = commonGramsTokenFilterFactoryTests64.ruleChain;
        commonGramsTokenFilterFactoryTests64.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) charArray16, (java.lang.Object) commonGramsTokenFilterFactoryTests64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray1, charArray16);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6162");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 0.0f, 100.0f, (float) (-1));
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6163");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray12);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray12);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray12);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray12);
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
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
        java.lang.CharSequence[] charSequenceArray69 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet70 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray69);
        java.lang.CharSequence[] charSequenceArray75 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet76 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray75);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray69, (java.lang.Object[]) charSequenceArray75);
        java.lang.CharSequence[] charSequenceArray82 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet83 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray82);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray75, (java.lang.Object[]) charSequenceArray82);
        java.util.Set<java.lang.Object> objSet85 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charSequenceArray82);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests86 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests86.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests86.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests86.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests86.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str92 = commonGramsTokenFilterFactoryTests86.getTestName();
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray82, (java.lang.Object) str92);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) charSequenceArray82);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) charSequenceArray82);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray58, (java.lang.Object[]) charSequenceArray82);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) strArray12, (java.lang.Object[]) charSequenceArray82);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6164");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests17.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23);
        commonGramsTokenFilterFactoryTests17.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        commonGramsTokenFilterFactoryTests17.assertTermsEquals("enwiki.random.lines.txt", indexReader28, terms29, terms30, false);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        commonGramsTokenFilterFactoryTests17.assertTermsEquals("tests.monster", indexReader34, terms35, terms36, true);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        commonGramsTokenFilterFactoryTests17.assertFieldsEquals("tests.failfast", indexReader40, fields41, fields42, true);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        commonGramsTokenFilterFactoryTests17.assertTermsEquals("tests.nightly", indexReader46, terms47, terms48, false);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        commonGramsTokenFilterFactoryTests17.assertPositionsSkippingEquals("hi!", indexReader52, (int) '#', postingsEnum54, postingsEnum55);
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray14, (java.lang.Object) indexReader52);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray59 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet60 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray59);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests61 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests61.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests61.setUp();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) queryCachingPolicySet60, (java.lang.Object) commonGramsTokenFilterFactoryTests61);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests66 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests66.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        commonGramsTokenFilterFactoryTests66.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader69, (int) (byte) -1, postingsEnum71, postingsEnum72);
        org.junit.rules.TestRule testRule74 = commonGramsTokenFilterFactoryTests66.ruleChain;
        java.lang.CharSequence[] charSequenceArray79 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet80 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray79);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests66, (java.lang.Object) charSequenceArray79);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray82 = new org.apache.lucene.util.LuceneTestCase[] { commonGramsTokenFilterFactoryTests61, commonGramsTokenFilterFactoryTests66 };
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet83 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) luceneTestCaseArray82);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6165");
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
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet15 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray5);
        org.junit.Assert.assertNotNull((java.lang.Object) throttlingArray5);
        java.lang.Object[] objArray17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray5, objArray17);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6166");
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
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests22);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6167");
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
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests26.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests26.setUp();
        java.lang.String str29 = commonGramsTokenFilterFactoryTests26.getTestName();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) str29);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum33, postingsEnum34);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6168");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 0, (double) 0L, (double) 3);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6169");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str4 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.awaitsfix", indexReader11, terms12, terms13, true);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests19.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader22, (int) (byte) -1, postingsEnum24, postingsEnum25);
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests19.ruleChain;
        commonGramsTokenFilterFactoryTests19.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) true);
        org.elasticsearch.common.settings.Settings.Builder builder32 = commonGramsTokenFilterFactoryTests19.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests34 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests34.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests34.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader37, (int) (byte) -1, postingsEnum39, postingsEnum40);
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests34.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests43 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests43.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests43.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader46, (int) (byte) -1, postingsEnum48, postingsEnum49);
        org.junit.rules.TestRule testRule51 = commonGramsTokenFilterFactoryTests43.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests52.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests52.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader55, (int) (byte) -1, postingsEnum57, postingsEnum58);
        org.junit.rules.TestRule testRule60 = commonGramsTokenFilterFactoryTests52.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests61 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests61.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests61.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader64, (int) (byte) -1, postingsEnum66, postingsEnum67);
        org.junit.rules.TestRule testRule69 = commonGramsTokenFilterFactoryTests61.ruleChain;
        org.junit.rules.TestRule[] testRuleArray70 = new org.junit.rules.TestRule[] { testRule42, testRule51, testRule60, testRule69 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet71 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray70);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) testRuleSet71);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests74 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests74.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests74.setUp();
        java.lang.String str77 = commonGramsTokenFilterFactoryTests74.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests74);
        commonGramsTokenFilterFactoryTests74.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) testRuleSet71, (java.lang.Object) commonGramsTokenFilterFactoryTests74);
        org.apache.lucene.index.IndexReader indexReader82 = null;
        org.apache.lucene.index.Fields fields83 = null;
        org.apache.lucene.index.Fields fields84 = null;
        commonGramsTokenFilterFactoryTests74.assertFieldsEquals("tests.monster", indexReader82, fields83, fields84, false);
        org.junit.rules.TestRule testRule87 = commonGramsTokenFilterFactoryTests74.ruleChain;
        commonGramsTokenFilterFactoryTests74.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) builder32, (java.lang.Object) commonGramsTokenFilterFactoryTests74);
        commonGramsTokenFilterFactoryTests74.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader92 = null;
        org.apache.lucene.index.Terms terms93 = null;
        org.apache.lucene.index.Terms terms94 = null;
        commonGramsTokenFilterFactoryTests74.assertTermsEquals("tests.monster", indexReader92, terms93, terms94, true);
        commonGramsTokenFilterFactoryTests74.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6170");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.weekly", postingsEnum10, postingsEnum11, false);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.maxfailures", postingsEnum15, postingsEnum16, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder20 = commonGramsTokenFilterFactoryTests19.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) postingsEnum16, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling23 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling26 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests30.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests30);
        org.junit.rules.TestRule testRule33 = commonGramsTokenFilterFactoryTests30.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule33);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray27, (java.lang.Object) testRule33);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray24, (java.lang.Object[]) throttlingArray27);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) throttlingArray27);
        org.elasticsearch.common.settings.Settings.Builder builder38 = commonGramsTokenFilterFactoryTests19.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests39.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader41, 0, postingsEnum43, postingsEnum44);
        commonGramsTokenFilterFactoryTests39.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests39, (java.lang.Object) 100.0d);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests49 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests49.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests49);
        commonGramsTokenFilterFactoryTests49.tearDown();
        commonGramsTokenFilterFactoryTests49.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests49.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests49.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests39, (java.lang.Object) commonGramsTokenFilterFactoryTests49);
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) builder38, (java.lang.Object) commonGramsTokenFilterFactoryTests49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.slow");
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6171");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, 0.0d);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6172");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100, 0.0f, (float) (short) 0);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6173");
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
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.failfast", indexReader24, fields25, fields26, true);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.nightly", indexReader30, terms31, terms32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("hi!", indexReader36, (int) '#', postingsEnum38, postingsEnum39);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests41 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests41.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests41);
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests41.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests41.assertDocsEnumEquals("tests.failfast", postingsEnum46, postingsEnum47, true);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        commonGramsTokenFilterFactoryTests41.assertFieldsEquals("", indexReader51, fields52, fields53, false);
        commonGramsTokenFilterFactoryTests41.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule57 = commonGramsTokenFilterFactoryTests41.ruleChain;
        commonGramsTokenFilterFactoryTests41.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests41.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule60 = commonGramsTokenFilterFactoryTests41.ruleChain;
        commonGramsTokenFilterFactoryTests41.setIndexWriterMaxDocs(2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) '#', (java.lang.Object) commonGramsTokenFilterFactoryTests41);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6174");
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
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader17, terms18, terms19, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.slow", postingsEnum24, postingsEnum25, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", (int) '4', numericDocValues31, numericDocValues32);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6175");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray5 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray6 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray5 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray7 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray8 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray7 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray9 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray10 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray9 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray11 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray12 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray11 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][][] testRuleIgnoreAfterMaxFailuresArray13 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][][] { testRuleIgnoreAfterMaxFailuresArray6, testRuleIgnoreAfterMaxFailuresArray8, testRuleIgnoreAfterMaxFailuresArray10, testRuleIgnoreAfterMaxFailuresArray12 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][]> testRuleIgnoreAfterMaxFailuresArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) testRuleIgnoreAfterMaxFailuresArraySet14);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6176");
        double[] doubleArray3 = new double[] { ' ', (-1) };
        double[] doubleArray6 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 100L);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) doubleArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests11.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests11.restoreIndexWriterMaxDocs();
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
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray33, (double) 1);
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
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray62, (double) (-1));
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests11, (java.lang.Object) doubleArray33);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray33, (double) 1.0f);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6177");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 2, (double) 10);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6178");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 2, (double) 4);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6179");
        org.elasticsearch.test.ESTokenStreamTestCase[][] eSTokenStreamTestCaseArray1 = new org.elasticsearch.test.ESTokenStreamTestCase[][] {};
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase[]> eSTokenStreamTestCaseArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray1);
        short[][] shortArray3 = new short[][] {};
        java.util.Set<short[]> shortArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray3);
        java.util.Set<java.lang.Cloneable> cloneableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) shortArray3);
        org.junit.Assert.assertEquals((java.lang.Object[]) eSTokenStreamTestCaseArray1, (java.lang.Object[]) shortArray3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests7.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests7.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests7.tearDown();
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests7, (java.lang.Object) charSequenceArray15);
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
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray30, (java.lang.Object[]) charSequenceArray58);
        java.lang.CharSequence[] charSequenceArray67 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet68 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray67);
        java.lang.CharSequence[] charSequenceArray73 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet74 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray73);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray67, (java.lang.Object[]) charSequenceArray73);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray58, (java.lang.Object[]) charSequenceArray73);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray15, (java.lang.Object[]) charSequenceArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) eSTokenStreamTestCaseArray1, (java.lang.Object[]) charSequenceArray15);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6180");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests9.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests9.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) -1, postingsEnum14, postingsEnum15);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests9.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule17;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule17;
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals(charArray20, charArray24);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) testRule17, (java.lang.Object) charArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) charArray20);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests29.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader31, 0, postingsEnum33, postingsEnum34);
        commonGramsTokenFilterFactoryTests29.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests29.assertPositionsSkippingEquals("tests.weekly", indexReader38, (int) '#', postingsEnum40, postingsEnum41);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests29.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader44, 0, postingsEnum46, postingsEnum47);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsSkippingEquals("", indexReader50, (int) (short) -1, postingsEnum52, postingsEnum53, true);
        commonGramsTokenFilterFactoryTests29.setUp();
        commonGramsTokenFilterFactoryTests29.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder58 = commonGramsTokenFilterFactoryTests29.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests29.tearDown();
        java.lang.String str60 = commonGramsTokenFilterFactoryTests29.getTestName();
        commonGramsTokenFilterFactoryTests29.tearDown();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        commonGramsTokenFilterFactoryTests29.assertPositionsSkippingEquals("", indexReader63, (int) 'a', postingsEnum65, postingsEnum66);
        commonGramsTokenFilterFactoryTests29.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray20, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6181");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests22.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader24, 0, postingsEnum26, postingsEnum27);
        commonGramsTokenFilterFactoryTests22.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests31.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests31.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader34, (int) (byte) -1, postingsEnum36, postingsEnum37);
        org.junit.rules.TestRule testRule39 = commonGramsTokenFilterFactoryTests31.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule39;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule39;
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals(charArray42, charArray46);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) testRule39, (java.lang.Object) charArray42);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests22, (java.lang.Object) charArray42);
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests22);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6182");
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
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray36);
        org.junit.Assert.assertNotNull((java.lang.Object) byteArray36);
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
        byte[] byteArray82 = new byte[] {};
        byte[] byteArray83 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray82, byteArray83);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray72, byteArray83);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray36, byteArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) byteArray36);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6183");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 0, (long) '#');
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6184");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder6 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("random", postingsEnum8, postingsEnum9, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) "random");
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6185");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 10.0d, (double) '#', (double) 1);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6186");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.badapples", indexReader6, terms7, terms8, true);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests12.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests12);
        java.lang.String str15 = commonGramsTokenFilterFactoryTests12.getTestName();
        commonGramsTokenFilterFactoryTests12.setIndexWriterMaxDocs(0);
        commonGramsTokenFilterFactoryTests12.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        commonGramsTokenFilterFactoryTests19.assertTermsEquals("", indexReader21, terms22, terms23, false);
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests19);
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests19.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests12, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
        commonGramsTokenFilterFactoryTests12.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests12);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6187");
        double[][][][][][] doubleArray1 = new double[][][][][][] {};
        double[][][][][][] doubleArray2 = new double[][][][][][] {};
        double[][][][][][] doubleArray3 = new double[][][][][][] {};
        double[][][][][][] doubleArray4 = new double[][][][][][] {};
        double[][][][][][] doubleArray5 = new double[][][][][][] {};
        double[][][][][][] doubleArray6 = new double[][][][][][] {};
        double[][][][][][][] doubleArray7 = new double[][][][][][][] { doubleArray1, doubleArray2, doubleArray3, doubleArray4, doubleArray5, doubleArray6 };
        java.util.Set<double[][][][][][]> doubleArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray7);
        java.util.Set<double[][][][][][]> doubleArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray11 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling10 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray11);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests14.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests14);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests14.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule17);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray11, (java.lang.Object) testRule17);
        java.util.Set<java.lang.Object> objSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) throttlingArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) doubleArray7, (java.lang.Object[]) throttlingArray11);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6188");
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
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) charSequenceArray19);
        java.lang.String[] strArray37 = new java.lang.String[] { "random", "tests.maxfailures", "tests.failfast", "tests.slow", "tests.monster" };
        java.lang.String[] strArray43 = new java.lang.String[] { "random", "tests.maxfailures", "tests.failfast", "tests.slow", "tests.monster" };
        java.lang.String[] strArray49 = new java.lang.String[] { "random", "tests.maxfailures", "tests.failfast", "tests.slow", "tests.monster" };
        java.lang.String[][] strArray50 = new java.lang.String[][] { strArray37, strArray43, strArray49 };
        java.util.Set<java.lang.String[]> strArraySet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        java.util.Set<java.lang.String[]> strArraySet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        java.util.Set<java.lang.String[]> strArraySet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) strArray50);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6189");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 0.0d, (double) (-1));
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6190");
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
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet34 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet40 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray39);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray33, (java.lang.Object[]) charSequenceArray39);
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet48 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray47);
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet54 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray53);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray47, (java.lang.Object[]) charSequenceArray53);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray39, (java.lang.Object[]) charSequenceArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) wildcardClassArray19, (java.lang.Object[]) charSequenceArray39);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6191");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) ' ', (double) (short) 100);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6192");
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
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests31.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader33, 0, postingsEnum35, postingsEnum36);
        commonGramsTokenFilterFactoryTests31.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests31.assertPositionsSkippingEquals("tests.weekly", indexReader40, (int) '#', postingsEnum42, postingsEnum43);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        commonGramsTokenFilterFactoryTests31.assertFieldsEquals("enwiki.random.lines.txt", indexReader46, fields47, fields48, true);
        commonGramsTokenFilterFactoryTests31.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests31.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests31, (java.lang.Object) "<unknown>");
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsEnumEquals("tests.monster", postingsEnum56, postingsEnum57, false);
        org.elasticsearch.common.settings.Settings.Builder builder60 = commonGramsTokenFilterFactoryTests31.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests31);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6193");
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray28);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray28);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray28);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests32.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader34, 0, postingsEnum36, postingsEnum37);
        commonGramsTokenFilterFactoryTests32.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests32.assertPositionsSkippingEquals("tests.weekly", indexReader41, (int) '#', postingsEnum43, postingsEnum44);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests32.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader47, 0, postingsEnum49, postingsEnum50);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsSkippingEquals("", indexReader53, (int) (short) -1, postingsEnum55, postingsEnum56, true);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        commonGramsTokenFilterFactoryTests32.assertTermsEquals("tests.failfast", indexReader60, terms61, terms62, true);
        java.lang.CharSequence[] charSequenceArray70 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet71 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray70);
        java.lang.CharSequence[] charSequenceArray76 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet77 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray76);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray70, (java.lang.Object[]) charSequenceArray76);
        java.lang.CharSequence[] charSequenceArray83 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet84 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray83);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray76, (java.lang.Object[]) charSequenceArray83);
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader60, (java.lang.Object) charSequenceArray83);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray83);
        java.util.Locale locale89 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale91 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale93 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray94 = new java.util.Locale[] { locale89, locale91, locale93 };
        java.util.Set<java.util.Locale> localeSet95 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray94);
        java.util.Set<java.lang.Cloneable> cloneableSet96 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray94);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) localeArray94);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6194");
        double[][][][][][][][] doubleArray0 = new double[][][][][][][][] {};
        java.util.Set<double[][][][][][][]> doubleArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray0);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray14);
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
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray37);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests65 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests65.setUp();
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet73 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray72);
        java.lang.CharSequence[] charSequenceArray78 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet79 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray78);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray72, (java.lang.Object[]) charSequenceArray78);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests65, (java.lang.Object) charSequenceArray72);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray0, (java.lang.Object[]) charSequenceArray72);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6195");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (byte) 1, (double) 1.0f);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6196");
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
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray30, byteArray31);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray36, byteArray37);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray40, byteArray41);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray37, byteArray41);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray46, byteArray47);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray50, byteArray51);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray47, byteArray50);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray41, byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray47);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray58, byteArray59);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray62, byteArray63);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray59, byteArray62);
        byte[] byteArray69 = new byte[] {};
        byte[] byteArray70 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray69, byteArray70);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray74 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray73, byteArray74);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray70, byteArray74);
        byte[] byteArray79 = new byte[] {};
        byte[] byteArray80 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray79, byteArray80);
        byte[] byteArray83 = new byte[] {};
        byte[] byteArray84 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray83, byteArray84);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray80, byteArray83);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray74, byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray59, byteArray80);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray47, byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray47);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) byteArray3);
        java.lang.Object obj92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "europarl.lines.txt.gz", obj92);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6197");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        java.lang.String str6 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("random", postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.failfast", indexReader13, (int) (byte) 1, postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("", indexReader20, fields21, fields22, true);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.weekly", (int) (byte) 10, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6198");
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
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) -1);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("hi!", indexReader24, 2, postingsEnum26, postingsEnum27, false);
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (short) 1, numericDocValues32, numericDocValues33);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6199");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum9, postingsEnum10, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests0.ruleChain;
        java.lang.Class<?> wildcardClass15 = testRule14.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule14);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6200");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray14);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) charSequenceArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6201");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.String str5 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("tests.weekly", indexReader9, 10, postingsEnum11, postingsEnum12, true);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.badapples", postingsEnum16, postingsEnum17, true);
        java.lang.Class<?> wildcardClass20 = commonGramsTokenFilterFactoryTests2.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) wildcardClass20);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6202");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", 0.0d, (double) 0.0f, (double) 10.0f);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6203");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.weekly", postingsEnum10, postingsEnum11, false);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.maxfailures", postingsEnum15, postingsEnum16, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder20 = commonGramsTokenFilterFactoryTests19.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) postingsEnum16, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling23 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling26 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests30.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests30);
        org.junit.rules.TestRule testRule33 = commonGramsTokenFilterFactoryTests30.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule33);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray27, (java.lang.Object) testRule33);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray24, (java.lang.Object[]) throttlingArray27);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) throttlingArray27);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling38 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray39 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling38 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet40 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray39);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray43 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling42 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray43);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling45 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray46 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling45 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray46);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests49 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests49.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests49);
        org.junit.rules.TestRule testRule52 = commonGramsTokenFilterFactoryTests49.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule52);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray46, (java.lang.Object) testRule52);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray43, (java.lang.Object[]) throttlingArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray39, (java.lang.Object[]) throttlingArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray27, (java.lang.Object[]) throttlingArray39);
        double[][][][][][] doubleArray58 = new double[][][][][][] {};
        double[][][][][][] doubleArray59 = new double[][][][][][] {};
        double[][][][][][] doubleArray60 = new double[][][][][][] {};
        double[][][][][][] doubleArray61 = new double[][][][][][] {};
        double[][][][][][] doubleArray62 = new double[][][][][][] {};
        double[][][][][][] doubleArray63 = new double[][][][][][] {};
        double[][][][][][][] doubleArray64 = new double[][][][][][][] { doubleArray58, doubleArray59, doubleArray60, doubleArray61, doubleArray62, doubleArray63 };
        java.util.Set<double[][][][][][]> doubleArraySet65 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) throttlingArray27, (java.lang.Object[]) doubleArray64);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6204");
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
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet60 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray59);
        java.lang.CharSequence[] charSequenceArray65 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet66 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray65);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray59, (java.lang.Object[]) charSequenceArray65);
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet73 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray72);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray65, (java.lang.Object[]) charSequenceArray72);
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet81 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray80);
        java.lang.CharSequence[] charSequenceArray86 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet87 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray86);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray80, (java.lang.Object[]) charSequenceArray86);
        java.lang.CharSequence[] charSequenceArray93 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet94 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray93);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray86, (java.lang.Object[]) charSequenceArray93);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray72, (java.lang.Object[]) charSequenceArray93);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray72);
        java.lang.Object[] objArray98 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) charSequenceArray72, objArray98);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6205");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray6);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray13);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals("", shortArray20, shortArray22);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray13, shortArray20);
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
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray42);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray31, shortArray42);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray13, shortArray42);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray55);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray49, shortArray55);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray64);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray67);
        org.junit.Assert.assertArrayEquals("", shortArray64, shortArray66);
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray64, shortArray70);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray73);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray75);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray64, shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray64);
        java.lang.Object obj81 = null;
        short[] shortArray82 = new short[] {};
        short[] shortArray83 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray82, shortArray83);
        short[] shortArray85 = new short[] {};
        short[] shortArray86 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray85, shortArray86);
        org.junit.Assert.assertArrayEquals(shortArray83, shortArray85);
        org.junit.Assert.assertNotSame(obj81, (java.lang.Object) shortArray83);
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray83);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray42, shortArray64);
        short[] shortArray92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray92);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6206");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder3 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("random", postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("random", postingsEnum12, postingsEnum13, false);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.maxfailures", postingsEnum18, postingsEnum19, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", obj1, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6207");
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
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader15, (int) (short) 0, postingsEnum17, postingsEnum18);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.maxfailures", indexReader21, (int) (short) 0, postingsEnum23, postingsEnum24, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
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
        commonGramsTokenFilterFactoryTests28.restoreIndexWriterMaxDocs();
        java.lang.Class<?> wildcardClass43 = commonGramsTokenFilterFactoryTests28.getClass();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests28);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6208");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) 'a', postingsEnum13, postingsEnum14, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum13);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6209");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 'a', (double) (byte) 0, (double) (short) 1);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6210");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 4, (double) (short) 100);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6211");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) (short) -1, (double) '4');
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6212");
        char[] charArray1 = null;
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        org.junit.Assert.assertArrayEquals(charArray5, charArray8);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
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
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray14, charArray30);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals(charArray53, charArray56);
        org.junit.Assert.assertArrayEquals("", charArray49, charArray53);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray67, charArray68);
        org.junit.Assert.assertArrayEquals(charArray65, charArray68);
        org.junit.Assert.assertArrayEquals("", charArray61, charArray65);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray53, charArray61);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray45, charArray61);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray30, charArray45);
        org.junit.Assert.assertArrayEquals(charArray8, charArray30);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) charArray8);
        java.lang.Object obj77 = null;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) charArray8, obj77);
        char[] charArray79 = new char[] {};
        char[] charArray80 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray79, charArray80);
        char[] charArray83 = new char[] {};
        char[] charArray84 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray83, charArray84);
        char[] charArray86 = new char[] {};
        char[] charArray87 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray86, charArray87);
        char[] charArray89 = new char[] {};
        char[] charArray90 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray89, charArray90);
        org.junit.Assert.assertArrayEquals(charArray87, charArray90);
        org.junit.Assert.assertArrayEquals("", charArray83, charArray87);
        org.junit.Assert.assertArrayEquals(charArray80, charArray83);
        org.junit.Assert.assertArrayEquals(charArray8, charArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray1, charArray8);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6213");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests4.setUp();
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray15);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) strArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests18.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests18.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests18.tearDown();
        commonGramsTokenFilterFactoryTests18.setIndexWriterMaxDocs((int) (byte) 1);
        commonGramsTokenFilterFactoryTests18.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests18.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsSkippingEquals("<unknown>", indexReader29, (int) '#', postingsEnum31, postingsEnum32, true);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("enwiki.random.lines.txt", indexReader36, fields37, fields38, false);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsSkippingEquals("tests.weekly", indexReader42, (int) (byte) 100, postingsEnum44, postingsEnum45, true);
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) strArray15, (java.lang.Object) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", objArray1, (java.lang.Object[]) strArray15);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6214");
        java.lang.Object obj1 = new java.lang.Object();
        org.junit.Assert.assertNotEquals(obj1, (java.lang.Object) "");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        commonGramsTokenFilterFactoryTests4.assertTermsEquals("", indexReader6, terms7, terms8, false);
        java.lang.String str11 = commonGramsTokenFilterFactoryTests4.getTestName();
        commonGramsTokenFilterFactoryTests4.setUp();
        commonGramsTokenFilterFactoryTests4.tearDown();
        commonGramsTokenFilterFactoryTests4.setUp();
        org.junit.Assert.assertNotEquals(obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests17.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests17.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str23 = commonGramsTokenFilterFactoryTests17.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests17.newAnalysisSettingsBuilder();
        java.lang.String str25 = commonGramsTokenFilterFactoryTests17.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests26.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests26.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, (int) (byte) -1, postingsEnum31, postingsEnum32);
        commonGramsTokenFilterFactoryTests26.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder35 = commonGramsTokenFilterFactoryTests26.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests26.setUp();
        commonGramsTokenFilterFactoryTests26.setUp();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests17, (java.lang.Object) commonGramsTokenFilterFactoryTests26);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        commonGramsTokenFilterFactoryTests17.assertTermsEquals("", indexReader40, terms41, terms42, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) indexReader40);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6215");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (byte) 10, (double) 10.0f);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6216");
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
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) builder12);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6217");
        int[] intArray7 = new int[] { (short) 1, 4, ' ', (short) 0, 'a', (short) 0 };
        int[] intArray14 = new int[] { (short) 1, 4, ' ', (short) 0, 'a', (short) 0 };
        int[] intArray21 = new int[] { (short) 1, 4, ' ', (short) 0, 'a', (short) 0 };
        int[] intArray28 = new int[] { (short) 1, 4, ' ', (short) 0, 'a', (short) 0 };
        int[][] intArray29 = new int[][] { intArray7, intArray14, intArray21, intArray28 };
        java.util.Set<int[]> intArraySet30 = org.apache.lucene.util.LuceneTestCase.asSet(intArray29);
        java.util.Set[][] setArray32 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray33 = (java.util.Set<java.lang.CharSequence>[][]) setArray32;
        java.util.Set<java.util.Set<java.lang.CharSequence>[]> charSequenceSetArraySet34 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray33);
        java.util.Set<java.util.Set<java.lang.CharSequence>[]> charSequenceSetArraySet35 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) intArray29, (java.lang.Object[]) charSequenceSetArray33);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6218");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (byte) 1, 1.0d);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6219");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet10 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray9);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray9, (java.lang.Object[]) charSequenceArray15);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) charSequenceArray9);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder20 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        java.lang.String str21 = commonGramsTokenFilterFactoryTests2.getTestName();
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.monster", indexReader24, fields25, fields26, true);
        commonGramsTokenFilterFactoryTests2.tearDown();
        java.lang.Object obj30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests2, obj30);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6220");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests31.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests31.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests35.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests35.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader38, (int) (byte) -1, postingsEnum40, postingsEnum41);
        org.junit.rules.TestRule testRule43 = commonGramsTokenFilterFactoryTests35.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests35);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests31, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests31.setUp();
        commonGramsTokenFilterFactoryTests31.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsSkippingEquals("", indexReader49, 10, postingsEnum51, postingsEnum52, false);
        commonGramsTokenFilterFactoryTests31.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests31);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests58 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests58.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests58.setUp();
        java.lang.String str61 = commonGramsTokenFilterFactoryTests58.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests58);
        commonGramsTokenFilterFactoryTests58.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray64 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests31, commonGramsTokenFilterFactoryTests58 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests> commonGramsTokenFilterFactoryTestsSet65 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray64);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet66 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray64);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet67 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray64);
        java.util.Set<java.lang.Object> objSet68 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray64);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling70 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling71 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray72 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling70, throttling71 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling73 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling74 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray75 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling73, throttling74 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling76 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling77 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray78 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling76, throttling77 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling79 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling80 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray81 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling79, throttling80 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray82 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray72, throttlingArray75, throttlingArray78, throttlingArray81 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArraySet83 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray82);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) throttlingArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray64, (java.lang.Object[]) throttlingArray82);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6221");
        double[] doubleArray2 = new double[] { (-1) };
        double[] doubleArray7 = new double[] { ' ', (-1) };
        double[] doubleArray10 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray10, (double) 100L);
        double[] doubleArray16 = new double[] { ' ', (-1) };
        double[] doubleArray19 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray19, (double) 100L);
        double[] doubleArray24 = new double[] { ' ', (-1) };
        double[] doubleArray27 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray27, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray19, doubleArray24, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray24, (double) 1);
        double[] doubleArray36 = new double[] { ' ', (-1) };
        double[] doubleArray39 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray39, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray39, (double) 100);
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
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray7, doubleArray65, 0.0d);
        double[] doubleArray80 = new double[] { ' ', (-1) };
        double[] doubleArray83 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray80, doubleArray83, (double) 100L);
        org.junit.Assert.assertArrayEquals("hi!", doubleArray7, doubleArray83, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray2, doubleArray83, (double) (byte) -1);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6222");
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
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests41.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum49, postingsEnum50, true);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        commonGramsTokenFilterFactoryTests41.assertTermsEquals("tests.awaitsfix", indexReader54, terms55, terms56, false);
        commonGramsTokenFilterFactoryTests41.setIndexWriterMaxDocs((-1));
        org.apache.lucene.index.NumericDocValues numericDocValues63 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues64 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests41.assertDocValuesEquals("<unknown>", (int) (byte) 10, numericDocValues63, numericDocValues64);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6223");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, 100.0d);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6224");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 1, (float) 'a', 0.0f);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6225");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray2, intArray6);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray12, intArray13);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray16, intArray17);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray12, intArray16);
        org.junit.Assert.assertArrayEquals(intArray6, intArray16);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray23, intArray24);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray30, intArray31);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray34, intArray35);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray30, intArray34);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray39, intArray40);
        org.junit.Assert.assertArrayEquals("hi!", intArray34, intArray39);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray46, intArray47);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray50, intArray51);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray46, intArray50);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray55, intArray56);
        org.junit.Assert.assertArrayEquals("hi!", intArray50, intArray55);
        org.junit.Assert.assertArrayEquals(intArray34, intArray55);
        int[] intArray61 = new int[] {};
        int[] intArray62 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray61, intArray62);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray55, intArray62);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray23, intArray62);
        org.junit.Assert.assertNotNull((java.lang.Object) intArray23);
        org.junit.Assert.assertArrayEquals(intArray16, intArray23);
        int[] intArray68 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray23, intArray68);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6226");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (byte) -1, 0.0d, (double) (short) -1);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6227");
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
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 10);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests28.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests28);
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests28.ruleChain;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsSkippingEquals("", indexReader33, 0, postingsEnum35, postingsEnum36, false);
        org.elasticsearch.common.settings.Settings.Builder builder39 = commonGramsTokenFilterFactoryTests28.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass40 = builder39.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) testRule27, (java.lang.Object) wildcardClass40);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6228");
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
        java.util.Set<java.lang.Class<?>> wildcardClassSet53 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray18);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy54 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass55 = queryCachingPolicy54.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy56 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass57 = queryCachingPolicy56.getClass();
        java.lang.Class[] classArray59 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray60 = (java.lang.Class<?>[]) classArray59;
        wildcardClassArray60[0] = wildcardClass55;
        wildcardClassArray60[1] = wildcardClass57;
        java.util.Set<java.lang.Class<?>> wildcardClassSet65 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray60);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy66 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass67 = queryCachingPolicy66.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy68 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass69 = queryCachingPolicy68.getClass();
        java.lang.Class[] classArray71 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray72 = (java.lang.Class<?>[]) classArray71;
        wildcardClassArray72[0] = wildcardClass67;
        wildcardClassArray72[1] = wildcardClass69;
        java.util.Set<java.lang.Class<?>> wildcardClassSet77 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray72);
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray60, (java.lang.Object[]) wildcardClassArray72);
        java.util.Set<java.lang.reflect.Type> typeSet79 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.Type[]) wildcardClassArray72);
        java.util.Set<java.lang.Class<?>> wildcardClassSet80 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray72);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) wildcardClassArray18, (java.lang.Object[]) wildcardClassArray72);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray83 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet84 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray83);
        char[][][][] charArray85 = new char[][][][] {};
        java.util.Set<char[][][]> charArraySet86 = org.apache.lucene.util.LuceneTestCase.asSet(charArray85);
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) queryCachingPolicyArray83, (java.lang.Object[]) charArray85);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet88 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray72, (java.lang.Object[]) queryCachingPolicyArray83);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6229");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        org.junit.Assert.assertArrayEquals(charArray7, charArray10);
        org.junit.Assert.assertArrayEquals("", charArray3, charArray7);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
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
        org.junit.Assert.assertArrayEquals(charArray15, charArray18);
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray36, charArray44);
        org.junit.Assert.assertArrayEquals(charArray15, charArray44);
        org.junit.Assert.assertArrayEquals(charArray3, charArray15);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        org.junit.Assert.assertArrayEquals(charArray15, charArray59);
        org.junit.Assert.assertNotNull((java.lang.Object) charArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests63 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests63.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests63);
        org.junit.rules.TestRule testRule66 = commonGramsTokenFilterFactoryTests63.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        commonGramsTokenFilterFactoryTests63.assertDocsEnumEquals("tests.failfast", postingsEnum68, postingsEnum69, true);
        java.lang.String str72 = commonGramsTokenFilterFactoryTests63.getTestName();
        org.junit.rules.TestRule testRule73 = commonGramsTokenFilterFactoryTests63.ruleChain;
        commonGramsTokenFilterFactoryTests63.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) charArray15, (java.lang.Object) commonGramsTokenFilterFactoryTests63);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests76 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder77 = commonGramsTokenFilterFactoryTests76.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests76.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests76, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests76.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        commonGramsTokenFilterFactoryTests76.assertDocsEnumEquals("tests.monster", postingsEnum84, postingsEnum85, false);
        java.lang.Class<?> wildcardClass88 = commonGramsTokenFilterFactoryTests76.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) "tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests76);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6230");
        char[] charArray0 = null;
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals(charArray2, charArray6);
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
        org.junit.Assert.assertArrayEquals(charArray6, charArray11);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
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
        org.junit.Assert.assertArrayEquals(charArray44, charArray47);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray62, charArray63);
        org.junit.Assert.assertArrayEquals(charArray60, charArray63);
        org.junit.Assert.assertArrayEquals("", charArray47, charArray63);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests67 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder68 = commonGramsTokenFilterFactoryTests67.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests67.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests67, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests67.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests67.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.Terms terms76 = null;
        org.apache.lucene.index.Terms terms77 = null;
        commonGramsTokenFilterFactoryTests67.assertTermsEquals("", indexReader75, terms76, terms77, false);
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        commonGramsTokenFilterFactoryTests67.assertDocsSkippingEquals("random", indexReader81, 1, postingsEnum83, postingsEnum84, false);
        java.lang.String str87 = commonGramsTokenFilterFactoryTests67.getTestName();
        commonGramsTokenFilterFactoryTests67.setIndexWriterMaxDocs((int) '4');
        commonGramsTokenFilterFactoryTests67.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.TestRule testRule92 = commonGramsTokenFilterFactoryTests67.ruleChain;
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) charArray63, (java.lang.Object) commonGramsTokenFilterFactoryTests67);
        org.junit.Assert.assertArrayEquals("hi!", charArray6, charArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray6);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6231");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) (byte) 1, (float) 100L, (float) (byte) 1);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6232");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (byte) 100, (long) 'a');
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6233");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", (double) (byte) 10, 10.0d, (double) 10.0f);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6234");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (-1L));
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6235");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 100.0d, 0.0d, 10.0d);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6236");
        short[] shortArray1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, 0, postingsEnum7, postingsEnum8);
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.weekly", indexReader12, (int) '#', postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("enwiki.random.lines.txt", indexReader18, fields19, fields20, true);
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests3.ruleChain;
        commonGramsTokenFilterFactoryTests3.tearDown();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("tests.weekly", indexReader28, (int) 'a', postingsEnum30, postingsEnum31, false);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals("", shortArray37, shortArray39);
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray37, shortArray43);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray46);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) false, (java.lang.Object) shortArray46);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray51);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray1, shortArray46);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6237");
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
        java.lang.Object[] objArray15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) localeArray12, objArray15);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6238");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) (byte) 100, (float) 10, 0.0f);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6239");
        char[][] charArray0 = new char[][] {};
        char[][] charArray1 = new char[][] {};
        char[][] charArray2 = new char[][] {};
        char[][] charArray3 = new char[][] {};
        char[][] charArray4 = new char[][] {};
        char[][] charArray5 = new char[][] {};
        char[][][] charArray6 = new char[][][] { charArray0, charArray1, charArray2, charArray3, charArray4, charArray5 };
        java.util.Set<char[][]> charArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(charArray6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray10 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling9 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet11 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray13 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling12 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray13);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests16.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests16);
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests16.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule19);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray13, (java.lang.Object) testRule19);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray10, (java.lang.Object[]) throttlingArray13);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        commonGramsTokenFilterFactoryTests24.assertTermsEquals("", indexReader26, terms27, terms28, false);
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests24.assertDocsEnumEquals("tests.weekly", postingsEnum32, postingsEnum33, false);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests24.assertDocsEnumEquals("tests.maxfailures", postingsEnum37, postingsEnum38, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests41 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder42 = commonGramsTokenFilterFactoryTests41.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) postingsEnum38, (java.lang.Object) commonGramsTokenFilterFactoryTests41);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling45 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray46 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling45 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray46);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling48 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray49 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling48 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet50 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray49);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests52.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests52);
        org.junit.rules.TestRule testRule55 = commonGramsTokenFilterFactoryTests52.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule55);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray49, (java.lang.Object) testRule55);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray46, (java.lang.Object[]) throttlingArray49);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests41, (java.lang.Object) throttlingArray49);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling60 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray61 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling60 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray61);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling64 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray65 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling64 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet66 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray65);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling67 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray68 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling67 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet69 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray68);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests71 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests71.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests71);
        org.junit.rules.TestRule testRule74 = commonGramsTokenFilterFactoryTests71.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule74);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray68, (java.lang.Object) testRule74);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray65, (java.lang.Object[]) throttlingArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray61, (java.lang.Object[]) throttlingArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray49, (java.lang.Object[]) throttlingArray61);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet80 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray10, (java.lang.Object[]) throttlingArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charArray6, (java.lang.Object[]) throttlingArray61);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6240");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", 10.0d, (double) 0, (double) (short) 10);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6241");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) 4, (float) 10L, 0.0f);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6242");
        java.lang.Object obj2 = null;
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
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) doubleArray23);
        double[] doubleArray37 = new double[] { ' ', (-1) };
        double[] doubleArray40 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray40, (double) 100L);
        double[] doubleArray45 = new double[] { ' ', (-1) };
        double[] doubleArray48 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray48, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray40, doubleArray45, 100.0d);
        double[] doubleArray57 = new double[] { ' ', (-1) };
        double[] doubleArray60 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray60, (double) 100L);
        double[] doubleArray66 = new double[] { ' ', (-1) };
        double[] doubleArray69 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray69, (double) 100L);
        double[] doubleArray74 = new double[] { ' ', (-1) };
        double[] doubleArray77 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray74, doubleArray77, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray69, doubleArray74, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray74, (double) 1);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "<unknown>", (java.lang.Object) doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray74, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray74, (double) 1.0f);
        org.junit.Assert.assertNotSame("tests.badapples", obj2, (java.lang.Object) doubleArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6243");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) 100, 0.0f, (float) 1L);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6244");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str6 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        java.lang.String str8 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("<unknown>", postingsEnum10, postingsEnum11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.weekly", indexReader15, (int) '#', postingsEnum17, postingsEnum18, false);
        java.lang.String str21 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests22.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests22.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader25, (int) (byte) -1, postingsEnum27, postingsEnum28);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        commonGramsTokenFilterFactoryTests22.assertFieldsEquals("random", indexReader31, fields32, fields33, false);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        commonGramsTokenFilterFactoryTests22.assertFieldsEquals("<unknown>", indexReader37, fields38, fields39, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) indexReader37);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6245");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 1.0d, (double) '4');
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6246");
        char[][][][] charArray0 = new char[][][][] {};
        char[][][][] charArray1 = new char[][][][] {};
        char[][][][] charArray2 = new char[][][][] {};
        char[][][][] charArray3 = new char[][][][] {};
        char[][][][] charArray4 = new char[][][][] {};
        char[][][][][] charArray5 = new char[][][][][] { charArray0, charArray1, charArray2, charArray3, charArray4 };
        char[][][][] charArray6 = new char[][][][] {};
        char[][][][] charArray7 = new char[][][][] {};
        char[][][][] charArray8 = new char[][][][] {};
        char[][][][] charArray9 = new char[][][][] {};
        char[][][][] charArray10 = new char[][][][] {};
        char[][][][][] charArray11 = new char[][][][][] { charArray6, charArray7, charArray8, charArray9, charArray10 };
        char[][][][] charArray12 = new char[][][][] {};
        char[][][][] charArray13 = new char[][][][] {};
        char[][][][] charArray14 = new char[][][][] {};
        char[][][][] charArray15 = new char[][][][] {};
        char[][][][] charArray16 = new char[][][][] {};
        char[][][][][] charArray17 = new char[][][][][] { charArray12, charArray13, charArray14, charArray15, charArray16 };
        char[][][][] charArray18 = new char[][][][] {};
        char[][][][] charArray19 = new char[][][][] {};
        char[][][][] charArray20 = new char[][][][] {};
        char[][][][] charArray21 = new char[][][][] {};
        char[][][][] charArray22 = new char[][][][] {};
        char[][][][][] charArray23 = new char[][][][][] { charArray18, charArray19, charArray20, charArray21, charArray22 };
        char[][][][] charArray24 = new char[][][][] {};
        char[][][][] charArray25 = new char[][][][] {};
        char[][][][] charArray26 = new char[][][][] {};
        char[][][][] charArray27 = new char[][][][] {};
        char[][][][] charArray28 = new char[][][][] {};
        char[][][][][] charArray29 = new char[][][][][] { charArray24, charArray25, charArray26, charArray27, charArray28 };
        char[][][][][][] charArray30 = new char[][][][][][] { charArray5, charArray11, charArray17, charArray23, charArray29 };
        java.util.Set<char[][][][][]> charArraySet31 = org.apache.lucene.util.LuceneTestCase.asSet(charArray30);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet39 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray38);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet45 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray44);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray38, (java.lang.Object[]) charSequenceArray44);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet55 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray54);
        java.lang.CharSequence[] charSequenceArray60 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet61 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray60);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray54, (java.lang.Object[]) charSequenceArray60);
        java.lang.CharSequence[] charSequenceArray67 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet68 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray60, (java.lang.Object[]) charSequenceArray67);
        java.lang.CharSequence[] charSequenceArray75 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet76 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray75);
        java.lang.CharSequence[] charSequenceArray81 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet82 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray81);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray75, (java.lang.Object[]) charSequenceArray81);
        java.lang.CharSequence[] charSequenceArray88 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet89 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray88);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray81, (java.lang.Object[]) charSequenceArray88);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray67, (java.lang.Object[]) charSequenceArray88);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "hi!", (java.lang.Object) charSequenceArray67);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) charSequenceArray44, (java.lang.Object[]) charSequenceArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charArray30, (java.lang.Object[]) charSequenceArray44);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6247");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, 0.0d, (-1.0d));
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6248");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) (short) 10);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6249");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 0, (double) (short) 100);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6250");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 100.0f, (double) 100.0f);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6251");
        short[][] shortArray0 = new short[][] {};
        java.util.Set<short[]> shortArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray0);
        java.util.Set<java.lang.Cloneable> cloneableSet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) shortArray0);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray0);
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) shortArray0);
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) shortArray0, (java.lang.Object[]) strArray9);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6252");
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
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        commonGramsTokenFilterFactoryTests27.assertTermsEquals("tests.failfast", indexReader55, terms56, terms57, true);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        commonGramsTokenFilterFactoryTests27.assertFieldsEquals("<unknown>", indexReader61, fields62, fields63, false);
        commonGramsTokenFilterFactoryTests27.setUp();
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests27);
        commonGramsTokenFilterFactoryTests27.setIndexWriterMaxDocs(0);
        org.junit.rules.TestRule testRule70 = commonGramsTokenFilterFactoryTests27.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests27.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum72, postingsEnum73);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6253");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) '#', (double) 0L);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6254");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.monster", postingsEnum9, postingsEnum10, true);
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
        commonGramsTokenFilterFactoryTests13.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) postingsEnum10, (java.lang.Object) commonGramsTokenFilterFactoryTests13);
        commonGramsTokenFilterFactoryTests13.setUp();
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray38 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray39 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[][] baseTokenStreamTestCaseArray40 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[][] { baseTokenStreamTestCaseArray38, baseTokenStreamTestCaseArray39 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase[]> baseTokenStreamTestCaseArraySet41 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray40);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests42.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader44, 0, postingsEnum46, postingsEnum47);
        commonGramsTokenFilterFactoryTests42.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests42.assertPositionsSkippingEquals("tests.weekly", indexReader51, (int) '#', postingsEnum53, postingsEnum54);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        commonGramsTokenFilterFactoryTests42.assertFieldsEquals("enwiki.random.lines.txt", indexReader57, fields58, fields59, true);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        commonGramsTokenFilterFactoryTests42.assertFieldsEquals("tests.weekly", indexReader63, fields64, fields65, true);
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        commonGramsTokenFilterFactoryTests42.assertDocsSkippingEquals("tests.awaitsfix", indexReader69, (int) '#', postingsEnum71, postingsEnum72, false);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) baseTokenStreamTestCaseArraySet41, (java.lang.Object) commonGramsTokenFilterFactoryTests42);
        commonGramsTokenFilterFactoryTests42.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) commonGramsTokenFilterFactoryTests42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests13);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6255");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '#', (float) (short) 100, (float) ' ');
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6256");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (float) 0L, (float) (short) 100, (float) 10);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6257");
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
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("hi!", indexReader19, (int) (short) 100, postingsEnum21, postingsEnum22);
        java.lang.String str24 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", (int) (short) 0, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6258");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (byte) 0, (double) 100L, (double) 4);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6259");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray0 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray1 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray0 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray2 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray3 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray2 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray4 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray5 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray4 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray6 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray7 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray6 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][][] testRuleIgnoreAfterMaxFailuresArray8 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][][] { testRuleIgnoreAfterMaxFailuresArray1, testRuleIgnoreAfterMaxFailuresArray3, testRuleIgnoreAfterMaxFailuresArray5, testRuleIgnoreAfterMaxFailuresArray7 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][]> testRuleIgnoreAfterMaxFailuresArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray8);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][]> testRuleIgnoreAfterMaxFailuresArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray8);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures11 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures12 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures11);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures13 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures14 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures13);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures15 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures16 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures15);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures18 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures17);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray19 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures12, testRuleIgnoreAfterMaxFailures14, testRuleIgnoreAfterMaxFailures15, testRuleIgnoreAfterMaxFailures17 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray20 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray19 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet21 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray20);
        java.util.Set<org.junit.rules.TestRule[]> testRuleArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[][]) testRuleIgnoreAfterMaxFailuresArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray8, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray20);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6260");
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
        org.junit.Assert.assertNotNull("", (java.lang.Object) doubleArray54);
        double[] doubleArray72 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray72, (double) (byte) 10);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6261");
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
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray19, byteArray20);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals("random", byteArray20, byteArray23);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) byteArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) byteArray23);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6262");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.failfast", postingsEnum7, postingsEnum8, true);
        java.lang.String str11 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.awaitsfix", indexReader14, fields15, fields16, false);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum20, postingsEnum21, false);
        java.lang.Object obj24 = null;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests2, obj24);
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
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests26.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader41, 0, postingsEnum43, postingsEnum44);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsSkippingEquals("", indexReader47, (int) (short) -1, postingsEnum49, postingsEnum50, true);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        commonGramsTokenFilterFactoryTests26.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader54, (int) (byte) -1, postingsEnum56, postingsEnum57);
        commonGramsTokenFilterFactoryTests26.setIndexWriterMaxDocs(2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) "tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests26);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6263");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), (long) '4');
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6264");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 100.0f, (double) 'a');
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6265");
        java.lang.Object obj2 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, 0, postingsEnum7, postingsEnum8);
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.weekly", indexReader12, (int) '#', postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, 0, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader24, (int) (short) -1, postingsEnum26, postingsEnum27, true);
        commonGramsTokenFilterFactoryTests3.setUp();
        commonGramsTokenFilterFactoryTests3.setUp();
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
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests33);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests60 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests60.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests60.setUp();
        java.lang.String str63 = commonGramsTokenFilterFactoryTests60.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests60);
        commonGramsTokenFilterFactoryTests60.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray66 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] { commonGramsTokenFilterFactoryTests3, commonGramsTokenFilterFactoryTests33, commonGramsTokenFilterFactoryTests60 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests> commonGramsTokenFilterFactoryTestsSet67 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray66);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet68 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray66);
        org.junit.Assert.assertNotEquals("tests.maxfailures", obj2, (java.lang.Object) commonGramsTokenFilterFactoryTestsArray66);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet70 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray66);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet71 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray66);
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests> commonGramsTokenFilterFactoryTestsSet72 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray66);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray73 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] {};
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][]> throttlingArraySet74 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray66, (java.lang.Object[]) throttlingArray73);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6266");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexReader7);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6267");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(10.0d, (double) 10, 10.0d);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6268");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", (int) (short) 1, numericDocValues8, numericDocValues9);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6269");
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
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals(charArray14, charArray58);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        org.junit.Assert.assertArrayEquals(charArray58, charArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) charArray58);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6270");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray5);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals("", shortArray13, shortArray15);
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray13, shortArray19);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray22);
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
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray40);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray29, shortArray40);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray19, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray29);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray48 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet49 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray48);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests50 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests50.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests50.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader53, (int) (byte) -1, postingsEnum55, postingsEnum56);
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        commonGramsTokenFilterFactoryTests50.assertDocsEnumEquals("tests.awaitsfix", postingsEnum59, postingsEnum60, false);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        commonGramsTokenFilterFactoryTests50.assertTermsEquals("<unknown>", indexReader64, terms65, terms66, true);
        commonGramsTokenFilterFactoryTests50.setIndexWriterMaxDocs((int) 'a');
        commonGramsTokenFilterFactoryTests50.setIndexWriterMaxDocs((int) (byte) 1);
        org.elasticsearch.common.settings.Settings.Builder builder73 = commonGramsTokenFilterFactoryTests50.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicySet49, (java.lang.Object) builder73);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests75 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests75.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests75);
        org.junit.rules.TestRule testRule78 = commonGramsTokenFilterFactoryTests75.ruleChain;
        commonGramsTokenFilterFactoryTests75.setUp();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) queryCachingPolicySet49, (java.lang.Object) commonGramsTokenFilterFactoryTests75);
        org.apache.lucene.index.IndexReader indexReader82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        commonGramsTokenFilterFactoryTests75.assertDocsSkippingEquals("<unknown>", indexReader82, 10, postingsEnum84, postingsEnum85, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) shortArray29, (java.lang.Object) indexReader82);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6271");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 2, (long) (byte) 10);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6272");
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
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("<unknown>", indexReader15, 4, postingsEnum17, postingsEnum18, false);
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("", indexReader23, (int) (byte) 10, postingsEnum25, postingsEnum26);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6273");
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
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum32, postingsEnum33);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6274");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) (-1.0f), 0.0d);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6275");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) 100);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6276");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (short) 100, (double) 10.0f, (double) (short) 0);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6277");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (short) 100, (long) 2);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6278");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.nightly", postingsEnum6, postingsEnum7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader11, (int) (short) 10, postingsEnum13, postingsEnum14, false);
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.monster", 100, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6279");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder3 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("random", indexReader16, 1, postingsEnum18, postingsEnum19, false);
        org.elasticsearch.common.settings.Settings.Builder builder22 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests26.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests26.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests26.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests26.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str32 = commonGramsTokenFilterFactoryTests26.getTestName();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        commonGramsTokenFilterFactoryTests26.assertTermsEquals("tests.awaitsfix", indexReader34, terms35, terms36, true);
        commonGramsTokenFilterFactoryTests26.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests40.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests40);
        commonGramsTokenFilterFactoryTests40.tearDown();
        commonGramsTokenFilterFactoryTests40.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests40.restoreIndexWriterMaxDocs();
        java.lang.String str46 = commonGramsTokenFilterFactoryTests40.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests40.assertDocsEnumEquals("random", postingsEnum48, postingsEnum49, false);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests26, (java.lang.Object) postingsEnum48);
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
        org.junit.Assert.assertArrayEquals("", charArray55, charArray59);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        org.junit.Assert.assertArrayEquals(charArray67, charArray70);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray59, charArray67);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests26, (java.lang.Object) "tests.slow");
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) "tests.awaitsfix");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6280");
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
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.nightly", indexReader34, fields35, fields36, true);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 0);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum43, postingsEnum44);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6281");
        java.util.Set[][] setArray2 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray3 = (java.util.Set<java.lang.CharSequence>[][]) setArray2;
        java.util.Set<java.util.Set<java.lang.CharSequence>[]> charSequenceSetArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray3);
        java.util.Set<java.util.Set<java.lang.CharSequence>[]> charSequenceSetArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray3);
        java.util.Set<java.util.Set<java.lang.CharSequence>[]> charSequenceSetArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests7.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests7.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests7.tearDown();
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests7, (java.lang.Object) charSequenceArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) charSequenceSetArray3, (java.lang.Object[]) charSequenceArray15);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6282");
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
        java.lang.String str20 = commonGramsTokenFilterFactoryTests0.getTestName();
        java.lang.Object obj21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) str20, obj21);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6283");
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
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray3, doubleArray45, (double) 1);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6284");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.slow", indexReader17, terms18, terms19, true);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests23.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests23);
        java.lang.String str26 = commonGramsTokenFilterFactoryTests23.getTestName();
        commonGramsTokenFilterFactoryTests23.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder29 = commonGramsTokenFilterFactoryTests23.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests23.setIndexWriterMaxDocs((-1));
        commonGramsTokenFilterFactoryTests23.setIndexWriterMaxDocs((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (byte) 0);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6285");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) (short) 0, 100.0f, (float) (byte) -1);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6286");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) 0.0f, (double) (-1.0f));
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6287");
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
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet16 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray6);
        org.junit.Assert.assertNotNull((java.lang.Object) throttlingArray6);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet24 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray23);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet30 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray29);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray23, (java.lang.Object[]) charSequenceArray29);
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
        java.lang.CharSequence[] charSequenceArray79 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet80 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray79);
        java.lang.CharSequence[] charSequenceArray85 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet86 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray85);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray79, (java.lang.Object[]) charSequenceArray85);
        java.lang.CharSequence[] charSequenceArray92 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet93 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray92);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray85, (java.lang.Object[]) charSequenceArray92);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray71, (java.lang.Object[]) charSequenceArray92);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray50, (java.lang.Object[]) charSequenceArray92);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray23, (java.lang.Object[]) charSequenceArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray6, (java.lang.Object[]) charSequenceArray23);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6288");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) (short) 100);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6289");
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
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.monster", indexReader53, (int) 'a', postingsEnum55, postingsEnum56);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests58 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests58.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests58);
        org.junit.rules.TestRule testRule61 = commonGramsTokenFilterFactoryTests58.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests58.assertDocsEnumEquals("tests.failfast", postingsEnum63, postingsEnum64, true);
        commonGramsTokenFilterFactoryTests58.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests58);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6290");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests7.setUp();
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray20);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests7, (java.lang.Object) charSequenceArray14);
        commonGramsTokenFilterFactoryTests7.tearDown();
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) (-1.0d), (java.lang.Object) commonGramsTokenFilterFactoryTests7);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests7);
        commonGramsTokenFilterFactoryTests7.overrideTestDefaultQueryCache();
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet34 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet40 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray39);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray33, (java.lang.Object[]) charSequenceArray39);
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet47 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray39, (java.lang.Object[]) charSequenceArray46);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests7, (java.lang.Object) charSequenceArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", objArray1, (java.lang.Object[]) charSequenceArray39);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6291");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, 1.0d);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6292");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 0L, (double) 0);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6293");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 'a', 0.0d);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6294");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 10, (double) 0L);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6295");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (short) 0, (long) ' ');
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6296");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 1L, (long) 3);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6297");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 0L, (float) (byte) -1, (float) 0);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6298");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 4, (double) 1, 0.0d);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6299");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader6, (int) (byte) -1, postingsEnum8, postingsEnum9);
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests3.ruleChain;
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) true);
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests36.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests36.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader39, (int) (byte) -1, postingsEnum41, postingsEnum42);
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests36.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests45 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests45.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests45.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader48, (int) (byte) -1, postingsEnum50, postingsEnum51);
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests45.ruleChain;
        org.junit.rules.TestRule[] testRuleArray54 = new org.junit.rules.TestRule[] { testRule26, testRule35, testRule44, testRule53 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet55 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray54);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) testRuleSet55);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests58 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests58.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests58.setUp();
        java.lang.String str61 = commonGramsTokenFilterFactoryTests58.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests58);
        commonGramsTokenFilterFactoryTests58.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) testRuleSet55, (java.lang.Object) commonGramsTokenFilterFactoryTests58);
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        commonGramsTokenFilterFactoryTests58.assertFieldsEquals("tests.monster", indexReader66, fields67, fields68, false);
        org.junit.rules.TestRule testRule71 = commonGramsTokenFilterFactoryTests58.ruleChain;
        commonGramsTokenFilterFactoryTests58.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) builder16, (java.lang.Object) commonGramsTokenFilterFactoryTests58);
        commonGramsTokenFilterFactoryTests58.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.Terms terms77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        commonGramsTokenFilterFactoryTests58.assertTermsEquals("tests.monster", indexReader76, terms77, terms78, true);
        commonGramsTokenFilterFactoryTests58.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests82 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        commonGramsTokenFilterFactoryTests82.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader84, 0, postingsEnum86, postingsEnum87);
        commonGramsTokenFilterFactoryTests82.setIndexWriterMaxDocs((int) (short) 100);
        commonGramsTokenFilterFactoryTests82.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests58, (java.lang.Object) commonGramsTokenFilterFactoryTests82);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6300");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", 0.0d, (double) (short) 1, (double) 100L);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6301");
        java.lang.Object[] objArray0 = null;
        java.util.Set[][] setArray2 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray3 = (java.util.Set<java.lang.CharSequence>[][]) setArray2;
        java.util.Set[][] setArray5 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray6 = (java.util.Set<java.lang.CharSequence>[][]) setArray5;
        java.util.Set[][] setArray8 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray9 = (java.util.Set<java.lang.CharSequence>[][]) setArray8;
        java.util.Set[][] setArray11 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray12 = (java.util.Set<java.lang.CharSequence>[][]) setArray11;
        java.util.Set[][][] setArray14 = new java.util.Set[4][][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][][] charSequenceSetArray15 = (java.util.Set<java.lang.CharSequence>[][][]) setArray14;
        charSequenceSetArray15[0] = charSequenceSetArray3;
        charSequenceSetArray15[1] = charSequenceSetArray6;
        charSequenceSetArray15[2] = charSequenceSetArray9;
        charSequenceSetArray15[3] = charSequenceSetArray12;
        java.util.Set[][] setArray25 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray26 = (java.util.Set<java.lang.CharSequence>[][]) setArray25;
        java.util.Set[][] setArray28 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray29 = (java.util.Set<java.lang.CharSequence>[][]) setArray28;
        java.util.Set[][] setArray31 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray32 = (java.util.Set<java.lang.CharSequence>[][]) setArray31;
        java.util.Set[][] setArray34 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray35 = (java.util.Set<java.lang.CharSequence>[][]) setArray34;
        java.util.Set[][][] setArray37 = new java.util.Set[4][][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][][] charSequenceSetArray38 = (java.util.Set<java.lang.CharSequence>[][][]) setArray37;
        charSequenceSetArray38[0] = charSequenceSetArray26;
        charSequenceSetArray38[1] = charSequenceSetArray29;
        charSequenceSetArray38[2] = charSequenceSetArray32;
        charSequenceSetArray38[3] = charSequenceSetArray35;
        java.util.Set[][] setArray48 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray49 = (java.util.Set<java.lang.CharSequence>[][]) setArray48;
        java.util.Set[][] setArray51 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray52 = (java.util.Set<java.lang.CharSequence>[][]) setArray51;
        java.util.Set[][] setArray54 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray55 = (java.util.Set<java.lang.CharSequence>[][]) setArray54;
        java.util.Set[][] setArray57 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray58 = (java.util.Set<java.lang.CharSequence>[][]) setArray57;
        java.util.Set[][][] setArray60 = new java.util.Set[4][][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][][] charSequenceSetArray61 = (java.util.Set<java.lang.CharSequence>[][][]) setArray60;
        charSequenceSetArray61[0] = charSequenceSetArray49;
        charSequenceSetArray61[1] = charSequenceSetArray52;
        charSequenceSetArray61[2] = charSequenceSetArray55;
        charSequenceSetArray61[3] = charSequenceSetArray58;
        java.util.Set[][][][] setArray71 = new java.util.Set[3][][][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][][][] charSequenceSetArray72 = (java.util.Set<java.lang.CharSequence>[][][][]) setArray71;
        charSequenceSetArray72[0] = charSequenceSetArray15;
        charSequenceSetArray72[1] = charSequenceSetArray38;
        charSequenceSetArray72[2] = charSequenceSetArray61;
        java.util.Set<java.util.Set<java.lang.CharSequence>[][][]> charSequenceSetArraySet79 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray72);
        java.util.Set<java.util.Set<java.lang.CharSequence>[][][]> charSequenceSetArraySet80 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) charSequenceSetArray72);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6302");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", 0.0d, 1.0d, (double) 10L);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6303");
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
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6304");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 10, (double) 10, (double) 1.0f);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6305");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, strArray6);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6306");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, 0, postingsEnum7, postingsEnum8);
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.weekly", indexReader12, (int) '#', postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("enwiki.random.lines.txt", indexReader18, fields19, fields20, true);
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) "<unknown>");
        commonGramsTokenFilterFactoryTests3.tearDown();
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
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader43, 0, postingsEnum45, postingsEnum46);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsSkippingEquals("", indexReader49, (int) (short) -1, postingsEnum51, postingsEnum52, true);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        commonGramsTokenFilterFactoryTests28.assertTermsEquals("tests.failfast", indexReader56, terms57, terms58, true);
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("<unknown>", indexReader62, fields63, fields64, false);
        commonGramsTokenFilterFactoryTests28.setUp();
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests70 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder71 = commonGramsTokenFilterFactoryTests70.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests70.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests70, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests70.restoreIndexWriterMaxDocs();
        java.util.Locale locale77 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests70, (java.lang.Object) locale77);
        org.elasticsearch.common.settings.Settings.Builder builder79 = commonGramsTokenFilterFactoryTests70.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) commonGramsTokenFilterFactoryTests28, (java.lang.Object) builder79);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6307");
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
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals(charArray19, charArray22);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray36, charArray44);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray28, charArray44);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        org.junit.Assert.assertArrayEquals(charArray67, charArray70);
        org.junit.Assert.assertArrayEquals("", charArray63, charArray67);
        char[] charArray75 = new char[] {};
        char[] charArray76 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray75, charArray76);
        char[] charArray78 = new char[] {};
        char[] charArray79 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray78, charArray79);
        char[] charArray81 = new char[] {};
        char[] charArray82 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray81, charArray82);
        org.junit.Assert.assertArrayEquals(charArray79, charArray82);
        org.junit.Assert.assertArrayEquals("", charArray75, charArray79);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray67, charArray75);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray59, charArray75);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray44, charArray59);
        org.junit.Assert.assertArrayEquals(charArray22, charArray44);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray3, charArray22);
        char[] charArray91 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray22, charArray91);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6308");
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
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.weekly", indexReader28, 4, postingsEnum30, postingsEnum31, false);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum36, postingsEnum37);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6309");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray2 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet3 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests4.setUp();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) queryCachingPolicySet3, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        commonGramsTokenFilterFactoryTests4.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        commonGramsTokenFilterFactoryTests4.assertTermsEquals("tests.slow", indexReader10, terms11, terms12, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests15.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests15);
        commonGramsTokenFilterFactoryTests15.tearDown();
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        java.lang.String str21 = commonGramsTokenFilterFactoryTests15.getTestName();
        java.lang.String str22 = commonGramsTokenFilterFactoryTests15.getTestName();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) terms12, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        java.lang.String str24 = commonGramsTokenFilterFactoryTests15.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests15.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests15.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6310");
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
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader38, fields39, fields40, false);
        org.apache.lucene.index.NumericDocValues numericDocValues45 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("hi!", (int) '4', numericDocValues45, numericDocValues46);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6311");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (-1.0d), 100.0d);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6312");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) 1.0f);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6313");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 1L, 100.0d, (double) 1L);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6314");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        java.lang.String str5 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder6 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
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
        commonGramsTokenFilterFactoryTests8.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests8.tearDown();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests8);
        commonGramsTokenFilterFactoryTests8.setUp();
        commonGramsTokenFilterFactoryTests8.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests8.assertPositionsSkippingEquals("tests.awaitsfix", indexReader34, (int) (short) 1, postingsEnum36, postingsEnum37);
        java.lang.String str39 = commonGramsTokenFilterFactoryTests8.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) builder6, (java.lang.Object) commonGramsTokenFilterFactoryTests8);
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6315");
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
        org.junit.Assert.assertNotNull("", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests27.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests27.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests27.tearDown();
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet36 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray35);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests27, (java.lang.Object) charSequenceArray35);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) charSequenceArray35);
        java.lang.Object[] objArray39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray35, objArray39);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6316");
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
        commonGramsTokenFilterFactoryTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("random", indexReader25, fields26, fields27, true);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.maxfailures", indexReader31, 100, postingsEnum33, postingsEnum34);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests37.restoreIndexWriterMaxDocs();
        java.lang.String str39 = commonGramsTokenFilterFactoryTests37.getTestName();
        commonGramsTokenFilterFactoryTests37.setUp();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests37);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.maxfailures", postingsEnum43, postingsEnum44, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests47 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder48 = commonGramsTokenFilterFactoryTests47.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests47.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests47, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests47.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests47.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests47.setUp();
        commonGramsTokenFilterFactoryTests47.setUp();
        java.lang.String str56 = commonGramsTokenFilterFactoryTests47.getTestName();
        commonGramsTokenFilterFactoryTests47.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder58 = commonGramsTokenFilterFactoryTests47.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        commonGramsTokenFilterFactoryTests47.assertPositionsSkippingEquals("hi!", indexReader60, (int) '#', postingsEnum62, postingsEnum63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) postingsEnum44, (java.lang.Object) indexReader60);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6317");
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray7, longArray8);
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray7, longArray10);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray14, longArray15);
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray14, longArray17);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray20, longArray21);
        org.junit.Assert.assertArrayEquals(longArray17, longArray20);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray7, longArray17);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray27, longArray28);
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray27, longArray30);
        org.junit.Assert.assertArrayEquals("", longArray17, longArray27);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray35, longArray36);
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray35, longArray38);
        long[] longArray41 = new long[] {};
        long[] longArray42 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray41, longArray42);
        org.junit.Assert.assertArrayEquals(longArray38, longArray41);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray27, longArray38);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests46.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader48, 0, postingsEnum50, postingsEnum51);
        commonGramsTokenFilterFactoryTests46.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests46.assertPositionsSkippingEquals("tests.weekly", indexReader55, (int) '#', postingsEnum57, postingsEnum58);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        commonGramsTokenFilterFactoryTests46.assertFieldsEquals("enwiki.random.lines.txt", indexReader61, fields62, fields63, true);
        commonGramsTokenFilterFactoryTests46.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests46.tearDown();
        org.junit.rules.TestRule testRule68 = commonGramsTokenFilterFactoryTests46.ruleChain;
        org.junit.rules.TestRule testRule69 = commonGramsTokenFilterFactoryTests46.ruleChain;
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) longArray38, (java.lang.Object) commonGramsTokenFilterFactoryTests46);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests74 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests74.restoreIndexWriterMaxDocs();
        java.lang.String str76 = commonGramsTokenFilterFactoryTests74.getTestName();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests74);
        java.lang.Object obj78 = null;
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests74, obj78);
        java.lang.Object obj80 = null;
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests74, obj80);
        commonGramsTokenFilterFactoryTests74.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests46, (java.lang.Object) commonGramsTokenFilterFactoryTests74);
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.Fields fields86 = null;
        org.apache.lucene.index.Fields fields87 = null;
        commonGramsTokenFilterFactoryTests46.assertFieldsEquals("tests.maxfailures", indexReader85, fields86, fields87, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6318");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (-1.0d), (double) (short) 10);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6319");
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
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("random", postingsEnum20, postingsEnum21, true);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.monster", postingsEnum25, postingsEnum26, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder31 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum33, postingsEnum34);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6320");
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
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet25 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray24);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet31 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray30);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray24, (java.lang.Object[]) charSequenceArray30);
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet38 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray30, (java.lang.Object[]) charSequenceArray37);
        java.util.Set<java.lang.Object> objSet40 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charSequenceArray37);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests41 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests41.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests41.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests41.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests41.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str47 = commonGramsTokenFilterFactoryTests41.getTestName();
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray37, (java.lang.Object) str47);
        org.junit.Assert.assertNotSame((java.lang.Object) longArray3, (java.lang.Object) charSequenceArray37);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests50 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder51 = commonGramsTokenFilterFactoryTests50.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests50.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests50, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests50.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests50.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        commonGramsTokenFilterFactoryTests50.assertTermsEquals("", indexReader58, terms59, terms60, false);
        java.lang.String str63 = commonGramsTokenFilterFactoryTests50.getTestName();
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) charSequenceArray37, (java.lang.Object) str63);
        byte[][] byteArray65 = new byte[][] {};
        byte[][] byteArray66 = new byte[][] {};
        byte[][] byteArray67 = new byte[][] {};
        byte[][][] byteArray68 = new byte[][][] { byteArray65, byteArray66, byteArray67 };
        java.util.Set<byte[][]> byteArraySet69 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray68);
        java.util.Set<byte[][]> byteArraySet70 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) charSequenceArray37, (java.lang.Object[]) byteArray68);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6321");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 4, (long) ' ');
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6322");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests12.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader14, 0, postingsEnum16, postingsEnum17);
        commonGramsTokenFilterFactoryTests12.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests12.assertFieldsEquals("random", indexReader21, fields22, fields23, true);
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests12.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) builder26, (java.lang.Object) "tests.failfast");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests29.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests29.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests29.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests29.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str35 = commonGramsTokenFilterFactoryTests29.getTestName();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        commonGramsTokenFilterFactoryTests29.assertTermsEquals("tests.awaitsfix", indexReader37, terms38, terms39, true);
        commonGramsTokenFilterFactoryTests29.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) "tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) builder9, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder47 = commonGramsTokenFilterFactoryTests46.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests46.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule49 = commonGramsTokenFilterFactoryTests46.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule49;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule49;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests52.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests52);
        org.junit.rules.TestRule testRule55 = commonGramsTokenFilterFactoryTests52.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests52.assertDocsEnumEquals("tests.failfast", postingsEnum57, postingsEnum58, true);
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        commonGramsTokenFilterFactoryTests52.assertFieldsEquals("", indexReader62, fields63, fields64, false);
        commonGramsTokenFilterFactoryTests52.tearDown();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests52);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) testRule49, (java.lang.Object) commonGramsTokenFilterFactoryTests52);
        org.elasticsearch.common.settings.Settings.Builder builder70 = commonGramsTokenFilterFactoryTests52.newAnalysisSettingsBuilder();
        java.lang.String str71 = commonGramsTokenFilterFactoryTests52.getTestName();
        commonGramsTokenFilterFactoryTests52.setIndexWriterMaxDocs((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) builder9, (java.lang.Object) commonGramsTokenFilterFactoryTests52);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6323");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) 100L, (double) 100, (double) '#');
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6324");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) '#');
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6325");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray5);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals("", shortArray13, shortArray15);
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray13, shortArray19);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray22);
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
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray40);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray29, shortArray40);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray19, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray29);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
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
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray60);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray29, shortArray60);
        short[] shortArray67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray67);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6326");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 100.0d, (double) (-1L));
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6327");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 4, 0L);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6328");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) (-1));
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6329");
        java.util.Collection[] collectionArray2 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray3 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray2;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.CharSequence>[]) collectionArray2);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray6 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet7 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray6);
        char[][][][] charArray8 = new char[][][][] {};
        java.util.Set<char[][][]> charArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(charArray8);
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) queryCachingPolicyArray6, (java.lang.Object[]) charArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) collectionArray2, (java.lang.Object[]) queryCachingPolicyArray6);
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
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) wildcardClassArray19);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[]) wildcardClassArray19);
        java.util.Set<java.lang.reflect.Type> typeSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.Type[]) wildcardClassArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) collectionArray2, (java.lang.Object[]) wildcardClassArray19);
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6330");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.weekly", postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.maxfailures", postingsEnum14, postingsEnum15, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests18.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) postingsEnum15, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling22 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling25 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests29.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests29);
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests29.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule32);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray26, (java.lang.Object) testRule32);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray23, (java.lang.Object[]) throttlingArray26);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) throttlingArray26);
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray41);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray41);
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet49 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray48);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet50 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray48);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray41, (java.lang.Object[]) strArray48);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray26, (java.lang.Object[]) strArray48);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6331");
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray1 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray2 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[][] baseTokenStreamTestCaseArray3 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[][] { baseTokenStreamTestCaseArray1, baseTokenStreamTestCaseArray2 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase[]> baseTokenStreamTestCaseArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray3);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) baseTokenStreamTestCaseArray3);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy6 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass7 = queryCachingPolicy6.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy8 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass9 = queryCachingPolicy8.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass7;
        wildcardClassArray12[1] = wildcardClass9;
        java.util.Set<java.lang.Class<?>> wildcardClassSet17 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray12);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy18 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass19 = queryCachingPolicy18.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy20 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass21 = queryCachingPolicy20.getClass();
        java.lang.Class[] classArray23 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass19;
        wildcardClassArray24[1] = wildcardClass21;
        java.util.Set<java.lang.Class<?>> wildcardClassSet29 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray12, (java.lang.Object[]) wildcardClassArray24);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray24);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy32 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass33 = queryCachingPolicy32.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy34 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass35 = queryCachingPolicy34.getClass();
        java.lang.Class[] classArray37 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass33;
        wildcardClassArray38[1] = wildcardClass35;
        java.util.Set<java.lang.Class<?>> wildcardClassSet43 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray38);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy44 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass45 = queryCachingPolicy44.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy46 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass47 = queryCachingPolicy46.getClass();
        java.lang.Class[] classArray49 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray50 = (java.lang.Class<?>[]) classArray49;
        wildcardClassArray50[0] = wildcardClass45;
        wildcardClassArray50[1] = wildcardClass47;
        java.util.Set<java.lang.Class<?>> wildcardClassSet55 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray38, (java.lang.Object[]) wildcardClassArray50);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet57 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) wildcardClassArray24, (java.lang.Object[]) wildcardClassArray50);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseArray3, (java.lang.Object[]) wildcardClassArray50);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6332");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (byte) 100, (long) 10);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6333");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests12.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader14, 0, postingsEnum16, postingsEnum17);
        commonGramsTokenFilterFactoryTests12.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests12.assertPositionsSkippingEquals("tests.weekly", indexReader21, (int) '#', postingsEnum23, postingsEnum24);
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests12.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) wildcardClassSet11, (java.lang.Object) testRule26);
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
        commonGramsTokenFilterFactoryTests28.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClassSet11, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6334");
        short[] shortArray1 = null;
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("", shortArray5, shortArray7);
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray5, shortArray11);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals("", shortArray17, shortArray19);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray26);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray19, shortArray24);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray32);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray34);
        org.junit.Assert.assertArrayEquals("hi!", shortArray19, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray32);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray43);
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
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray56);
        short[] shortArray70 = new short[] {};
        short[] shortArray71 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray70, shortArray71);
        short[] shortArray73 = new short[] {};
        short[] shortArray74 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray74);
        org.junit.Assert.assertArrayEquals("", shortArray71, shortArray73);
        short[] shortArray77 = new short[] {};
        short[] shortArray78 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray77, shortArray78);
        short[] shortArray80 = new short[] {};
        short[] shortArray81 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray80, shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray78, shortArray80);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray73, shortArray78);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray1, shortArray32);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6335");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) 0, (-1L));
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6336");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) 1L, (double) 2, (double) 10L);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6337");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray2);
        short[] shortArray9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray2, shortArray9);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6338");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader8, 0, postingsEnum10, postingsEnum11);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader15, 2, postingsEnum17, postingsEnum18);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests20.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests20.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("", indexReader24, fields25, fields26, true);
        commonGramsTokenFilterFactoryTests20.setIndexWriterMaxDocs(2);
        commonGramsTokenFilterFactoryTests20.tearDown();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        commonGramsTokenFilterFactoryTests20.assertTermsEquals("<unknown>", indexReader33, terms34, terms35, false);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        commonGramsTokenFilterFactoryTests20.assertTermsEquals("tests.badapples", indexReader39, terms40, terms41, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) indexReader15, (java.lang.Object) terms41);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6339");
        java.util.Collection[] collectionArray3 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray4 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray3;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.CharSequence>[]) collectionArray3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests6.assertTermsEquals("", indexReader8, terms9, terms10, false);
        java.lang.String str13 = commonGramsTokenFilterFactoryTests6.getTestName();
        commonGramsTokenFilterFactoryTests6.setUp();
        java.lang.String str15 = commonGramsTokenFilterFactoryTests6.getTestName();
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceCollectionSet5, (java.lang.Object) commonGramsTokenFilterFactoryTests6);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests6);
        commonGramsTokenFilterFactoryTests6.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests6.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsSkippingEquals("<unknown>", indexReader21, 0, postingsEnum23, postingsEnum24, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) 0);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6340");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        byte[][] byteArray29 = new byte[][] { byteArray7, byteArray14, byteArray21, byteArray28 };
        java.util.Set<byte[]> byteArraySet30 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray29);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests32.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader34, 0, postingsEnum36, postingsEnum37);
        commonGramsTokenFilterFactoryTests32.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests32.assertPositionsSkippingEquals("tests.weekly", indexReader41, (int) '#', postingsEnum43, postingsEnum44);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests32.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader47, 0, postingsEnum49, postingsEnum50);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsSkippingEquals("", indexReader53, (int) (short) -1, postingsEnum55, postingsEnum56, true);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        commonGramsTokenFilterFactoryTests32.assertTermsEquals("tests.failfast", indexReader60, terms61, terms62, true);
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        commonGramsTokenFilterFactoryTests32.assertFieldsEquals("<unknown>", indexReader66, fields67, fields68, false);
        commonGramsTokenFilterFactoryTests32.setUp();
        org.junit.rules.TestRule testRule72 = commonGramsTokenFilterFactoryTests32.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule72;
        long[] longArray79 = new long[] { (-1L), (-1), '4', 2, 1 };
        long[][] longArray80 = new long[][] { longArray79 };
        java.util.Set<long[]> longArraySet81 = org.apache.lucene.util.LuceneTestCase.asSet(longArray80);
        java.util.Set<long[]> longArraySet82 = org.apache.lucene.util.LuceneTestCase.asSet(longArray80);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) testRule72, (java.lang.Object) longArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) byteArray29, (java.lang.Object[]) longArray80);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6341");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder3 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
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
        commonGramsTokenFilterFactoryTests8.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests8.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests8, (java.lang.Object) "<unknown>");
        org.elasticsearch.common.settings.Settings.Builder builder32 = commonGramsTokenFilterFactoryTests8.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) commonGramsTokenFilterFactoryTests8);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6342");
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
        commonGramsTokenFilterFactoryTests2.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests20.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests20.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests20.tearDown();
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray28);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests20, (java.lang.Object) charSequenceArray28);
        java.lang.String str31 = commonGramsTokenFilterFactoryTests20.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests32.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests32);
        commonGramsTokenFilterFactoryTests32.tearDown();
        org.junit.rules.TestRule testRule36 = commonGramsTokenFilterFactoryTests32.ruleChain;
        java.lang.String str37 = commonGramsTokenFilterFactoryTests32.getTestName();
        java.lang.String str38 = commonGramsTokenFilterFactoryTests32.getTestName();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        commonGramsTokenFilterFactoryTests32.assertFieldsEquals("tests.maxfailures", indexReader40, fields41, fields42, true);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests20, (java.lang.Object) indexReader40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests20);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6343");
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
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests14.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) wildcardClassSet13, (java.lang.Object) testRule28);
        org.junit.Assert.assertNotSame(obj1, (java.lang.Object) testRule28);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) testRule28);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests34 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder35 = commonGramsTokenFilterFactoryTests34.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests34.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests34.ruleChain;
        commonGramsTokenFilterFactoryTests34.setUp();
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) 1L, (java.lang.Object) commonGramsTokenFilterFactoryTests34);
        commonGramsTokenFilterFactoryTests34.setIndexWriterMaxDocs((int) 'a');
        commonGramsTokenFilterFactoryTests34.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests34.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests34.assertDocsSkippingEquals("tests.badapples", indexReader45, (int) '#', postingsEnum47, postingsEnum48, false);
        commonGramsTokenFilterFactoryTests34.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests34);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6344");
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
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.nightly", 1, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6345");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.slow", indexReader10, terms11, terms12, true);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6346");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6347");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) testRule3);
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
        org.junit.Assert.assertNotEquals((java.lang.Object) testRule3, (java.lang.Object) byteArray20);
        byte[] byteArray52 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray52);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6348");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (float) 4, (float) 'a', 0.0f);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6349");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet27 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray26);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray26);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray26);
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
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy42 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass43 = queryCachingPolicy42.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy44 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass45 = queryCachingPolicy44.getClass();
        java.lang.Class[] classArray47 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        wildcardClassArray48[0] = wildcardClass43;
        wildcardClassArray48[1] = wildcardClass45;
        java.util.Set<java.lang.Class<?>> wildcardClassSet53 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray36, (java.lang.Object[]) wildcardClassArray48);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet55 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray26, (java.lang.Object[]) wildcardClassArray48);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6350");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 100.0d, (double) (byte) 1);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6351");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader6, 0, postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader13, fields14, fields15, false);
        java.lang.Object obj19 = new java.lang.Object();
        org.junit.Assert.assertNotEquals(obj19, (java.lang.Object) "");
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
        org.elasticsearch.common.settings.Settings.Builder builder42 = commonGramsTokenFilterFactoryTests22.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("random", obj19, (java.lang.Object) builder42);
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
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        commonGramsTokenFilterFactoryTests44.assertFieldsEquals("enwiki.random.lines.txt", indexReader59, fields60, fields61, true);
        commonGramsTokenFilterFactoryTests44.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests44.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule66 = commonGramsTokenFilterFactoryTests44.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests44);
        org.elasticsearch.common.settings.Settings.Builder builder68 = commonGramsTokenFilterFactoryTests44.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        commonGramsTokenFilterFactoryTests44.assertPositionsSkippingEquals("random", indexReader70, (int) '#', postingsEnum72, postingsEnum73);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray76 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet77 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray76);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests78 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests78.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests78.setUp();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) queryCachingPolicySet77, (java.lang.Object) commonGramsTokenFilterFactoryTests78);
        org.junit.Assert.assertNotEquals((java.lang.Object) "random", (java.lang.Object) queryCachingPolicySet77);
        java.util.Set[][] setArray84 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray85 = (java.util.Set<java.lang.CharSequence>[][]) setArray84;
        java.util.Set<java.util.Set<java.lang.CharSequence>[]> charSequenceSetArraySet86 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray85);
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) charSequenceSetArray85);
        java.util.Set<java.util.Collection[]> collectionArraySet88 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection[][]) charSequenceSetArray85);
        java.util.Collection[] collectionArray90 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray91 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray90;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet92 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.CharSequence>[]) collectionArray90);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceSetArray85, (java.lang.Object[]) collectionArray90);
        java.util.Set<java.util.Set<java.lang.CharSequence>[]> charSequenceSetArraySet94 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) charSequenceSetArray85);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6352");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6353");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        commonGramsTokenFilterFactoryTests3.assertTermsEquals("", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("tests.weekly", postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("tests.maxfailures", postingsEnum16, postingsEnum17, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests20.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) postingsEnum17, (java.lang.Object) commonGramsTokenFilterFactoryTests20);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray25 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling24 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling27 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray28 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling27 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray28);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests31.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests31);
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests31.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule34);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray28, (java.lang.Object) testRule34);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray25, (java.lang.Object[]) throttlingArray28);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests20, (java.lang.Object) throttlingArray28);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling39 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray40);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray44 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling43 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet45 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray44);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling46 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray47 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling46 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet48 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray47);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests50 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests50.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests50);
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests50.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule53);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray47, (java.lang.Object) testRule53);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray44, (java.lang.Object[]) throttlingArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray40, (java.lang.Object[]) throttlingArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray28, (java.lang.Object[]) throttlingArray40);
        org.junit.Assert.assertNotNull((java.lang.Object) throttlingArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", objArray1, (java.lang.Object[]) throttlingArray28);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6354");
        short[][] shortArray1 = new short[][] {};
        java.util.Set<short[]> shortArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray1);
        java.util.Set<java.lang.Cloneable> cloneableSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) shortArray1);
        java.lang.String[] strArray9 = new java.lang.String[] { "random", "tests.maxfailures", "tests.failfast", "tests.slow", "tests.monster" };
        java.lang.String[] strArray15 = new java.lang.String[] { "random", "tests.maxfailures", "tests.failfast", "tests.slow", "tests.monster" };
        java.lang.String[] strArray21 = new java.lang.String[] { "random", "tests.maxfailures", "tests.failfast", "tests.slow", "tests.monster" };
        java.lang.String[][] strArray22 = new java.lang.String[][] { strArray9, strArray15, strArray21 };
        java.util.Set<java.lang.String[]> strArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[][]) strArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) shortArray1, (java.lang.Object[]) strArray22);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6355");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) (short) -1, (float) '4', (float) (-1));
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6356");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str6 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("hi!", (int) (byte) 100, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6357");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray14);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) charSequenceArray8);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        java.lang.String str20 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests22.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests22);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6358");
        double[] doubleArray7 = new double[] { 0.0f, 'a', (short) 10, (-1.0f), 10.0d, (-1) };
        double[] doubleArray10 = new double[] { ' ', (-1) };
        double[] doubleArray13 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray13, (double) 100L);
        double[] doubleArray19 = new double[] { ' ', (-1) };
        double[] doubleArray22 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray22, (double) 100L);
        double[] doubleArray27 = new double[] { ' ', (-1) };
        double[] doubleArray30 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray30, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray22, doubleArray27, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray22, (double) (short) 10);
        double[] doubleArray39 = new double[] { ' ', (-1) };
        double[] doubleArray42 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray42, (double) 100L);
        double[] doubleArray48 = new double[] { ' ', (-1) };
        double[] doubleArray51 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray51, (double) 100L);
        double[] doubleArray56 = new double[] { ' ', (-1) };
        double[] doubleArray59 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray59, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray51, doubleArray56, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray56, (double) 1);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray56, (double) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray7, doubleArray56, (double) (short) 10);
    }
}

