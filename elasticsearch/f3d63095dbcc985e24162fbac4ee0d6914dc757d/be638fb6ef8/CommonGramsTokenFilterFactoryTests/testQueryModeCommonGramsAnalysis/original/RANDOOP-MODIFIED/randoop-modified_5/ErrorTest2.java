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
        org.junit.Assert.assertEquals((long) '4', (-1L));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) (-1));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', 10.0d);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (byte) 0, (double) 1L, (double) (short) -1);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) "tests.slow");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        long[] longArray0 = new long[] {};
        long[] longArray1 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray0, longArray1);
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
        org.junit.Assert.assertArrayEquals(longArray0, longArray6);
        long[] longArray11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray11);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (double) 10, (double) 10, (double) 1);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) 1L, (double) 1.0f);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals("", charArray1, charArray4);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        org.junit.Assert.assertArrayEquals(charArray4, charArray8);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals("", charArray13, charArray16);
        org.junit.Assert.assertArrayEquals(charArray4, charArray16);
        char[] charArray27 = new char[] { 'a', '4', '4', '4', '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray27);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        float[] floatArray4 = new float[] { (short) 1 };
        float[] floatArray6 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray6, (float) '#');
        float[] floatArray10 = new float[] { (short) 1 };
        float[] floatArray12 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray12, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray6, floatArray10, (float) 100);
        float[] floatArray19 = new float[] { (short) 1 };
        float[] floatArray21 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray21, (float) '#');
        float[] floatArray25 = new float[] { (short) 1 };
        float[] floatArray27 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray27, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray21, floatArray25, (float) 100);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray10, floatArray21, (float) (short) 10);
        float[] floatArray35 = new float[] { (short) 1 };
        float[] floatArray37 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray37, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray35, (float) (byte) 0);
        float[] floatArray45 = new float[] { '#', (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray10, floatArray45, (float) 10);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, 100.0f, (float) 4);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray8 = new int[] { (short) -1, 100, 2, (short) 100, (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray8);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.slow", indexReader4, terms5, terms6, false);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("hi!", (int) (short) 100, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", 10L, (long) 10);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0L, (double) (short) 10, (double) '#');
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        float[] floatArray1 = new float[] { (short) 1 };
        float[] floatArray3 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray3, (float) '#');
        float[] floatArray10 = new float[] { (short) 1 };
        float[] floatArray12 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray12, (float) '#');
        float[] floatArray16 = new float[] { (short) 1 };
        float[] floatArray18 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray18, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray12, floatArray16, (float) 100);
        float[] floatArray24 = new float[] { (short) 1 };
        float[] floatArray26 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray26, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray12, floatArray26, (float) 3);
        float[] floatArray32 = new float[] { (short) 1 };
        float[] floatArray34 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray34, (float) '#');
        org.junit.Assert.assertArrayEquals("", floatArray26, floatArray34, 100.0f);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray34, (float) 10L);
        float[] floatArray44 = new float[] { (short) 1 };
        float[] floatArray46 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray46, (float) '#');
        float[] floatArray50 = new float[] { (short) 1 };
        float[] floatArray52 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray52, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray46, floatArray50, (float) 100);
        float[] floatArray60 = new float[] { (short) 1 };
        float[] floatArray62 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray62, (float) '#');
        float[] floatArray66 = new float[] { (short) 1 };
        float[] floatArray68 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray66, floatArray68, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray62, floatArray66, (float) 100);
        float[] floatArray74 = new float[] { (short) 1 };
        float[] floatArray76 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray74, floatArray76, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray62, floatArray76, (float) 3);
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray62, (float) (short) 1);
        float[] floatArray84 = new float[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray46, floatArray84, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray46, 0.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray46);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        double[] doubleArray2 = new double[] { (byte) 100 };
        double[] doubleArray9 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray16 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray16, (double) 100.0f);
        double[] doubleArray25 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray32 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray32, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray25, (double) 4);
        double[] doubleArray44 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray51 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray51, (double) 100.0f);
        double[] doubleArray60 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray67 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray67, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray60, (double) 4);
        double[] doubleArray78 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray85 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray78, doubleArray85, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray60, doubleArray78, 1.0d);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray78, (double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray2, doubleArray78, (double) 100);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals("", charArray2, charArray5);
        char[] charArray10 = new char[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray5, charArray10);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) strSet8);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests10.ruleChain;
        commonGramsTokenFilterFactoryTests10.setUp();
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests10.ruleChain;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("tests.maxfailures", indexReader15, fields16, fields17, false);
        commonGramsTokenFilterFactoryTests10.overrideTestDefaultQueryCache();
        java.lang.String str21 = commonGramsTokenFilterFactoryTests10.getTestName();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("<unknown>", indexReader23, (int) (short) 0, postingsEnum25, postingsEnum26);
        commonGramsTokenFilterFactoryTests10.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) strSet8, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 100L, (double) (short) 1);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 10.0f, 1.0f, (float) (-1));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        java.lang.String str6 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.badapples", postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("hi!", 0, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, 10.0d, (double) '#');
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.maxfailures", indexReader6, fields7, fields8, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule12;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests14.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests14.assertDocsEnumEquals("hi!", postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests14.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader22, (int) (byte) 100, postingsEnum24, postingsEnum25);
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests14.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule27;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule27;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) testRule12, (java.lang.Object) testRule27);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("", indexReader7, (int) (byte) 1, postingsEnum9, postingsEnum10);
        java.lang.Class<?> wildcardClass12 = commonGramsTokenFilterFactoryTests1.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests13.ruleChain;
        commonGramsTokenFilterFactoryTests13.setUp();
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests13.ruleChain;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests13.assertFieldsEquals("tests.maxfailures", indexReader18, fields19, fields20, false);
        java.lang.Class<?> wildcardClass23 = commonGramsTokenFilterFactoryTests13.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests25.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests25, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests25.setUp();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests25.assertPositionsSkippingEquals("", indexReader31, (int) (byte) 1, postingsEnum33, postingsEnum34);
        java.lang.Class<?> wildcardClass36 = commonGramsTokenFilterFactoryTests25.getClass();
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray39);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray39, (java.lang.Object[]) strArray42);
        java.lang.Class<?> wildcardClass45 = strArray39.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray46 = new java.lang.reflect.GenericDeclaration[] { wildcardClass12, wildcardClass23, wildcardClass36, wildcardClass45 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet47 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray46);
        java.lang.String[] strArray49 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray53);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray49, (java.lang.Object[]) strArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) genericDeclarationArray46, (java.lang.Object[]) strArray53);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.failfast", true);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        int[] intArray2 = new int[] { (byte) 0 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray2, intArray3);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader9, (int) (byte) 100, postingsEnum11, postingsEnum12);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("<unknown>", indexReader18, 6, postingsEnum20, postingsEnum21);
        java.lang.String str23 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(3);
        commonGramsTokenFilterFactoryTests1.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 100.0f, (float) 6, (float) (-1));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        short[] shortArray6 = new short[] { (short) 10, (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) 10 };
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray8);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) (byte) 100, postingsEnum10, postingsEnum11);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(6);
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray17, longArray18);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray20, longArray21);
        org.junit.Assert.assertArrayEquals(longArray17, longArray20);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray24, longArray25);
        org.junit.Assert.assertArrayEquals("hi!", longArray20, longArray25);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray30, longArray31);
        long[] longArray33 = new long[] {};
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray33, longArray34);
        org.junit.Assert.assertArrayEquals(longArray30, longArray33);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray37, longArray38);
        org.junit.Assert.assertArrayEquals("hi!", longArray33, longArray38);
        long[] longArray42 = new long[] {};
        long[] longArray43 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray42, longArray43);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray45, longArray46);
        org.junit.Assert.assertArrayEquals(longArray42, longArray45);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray49, longArray50);
        org.junit.Assert.assertArrayEquals("hi!", longArray45, longArray50);
        org.junit.Assert.assertArrayEquals(longArray38, longArray50);
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray55, longArray56);
        long[] longArray58 = new long[] {};
        long[] longArray59 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray58, longArray59);
        org.junit.Assert.assertArrayEquals(longArray55, longArray58);
        long[] longArray62 = new long[] {};
        long[] longArray63 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray62, longArray63);
        org.junit.Assert.assertArrayEquals("hi!", longArray58, longArray63);
        org.junit.Assert.assertArrayEquals("", longArray38, longArray58);
        org.junit.Assert.assertArrayEquals(longArray20, longArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) longArray58);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (short) 100, 10.0d);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) '4', (long) '#');
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader9, 3, postingsEnum11, postingsEnum12, true);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests2.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule18);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, true);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) testRule10);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray7);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray7, (java.lang.Object[]) strArray10);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray15);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray15, (java.lang.Object[]) strArray18);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray10, (java.lang.Object[]) strArray15);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray25);
        java.lang.String[] strArray28 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray25, (java.lang.Object[]) strArray28);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray33);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray33, (java.lang.Object[]) strArray36);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray28, (java.lang.Object[]) strArray33);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray10, (java.lang.Object[]) strArray28);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray45);
        java.lang.String[] strArray48 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet49 = org.apache.lucene.util.LuceneTestCase.asSet(strArray48);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray45, (java.lang.Object[]) strArray48);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray53);
        java.lang.String[] strArray56 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray53, (java.lang.Object[]) strArray56);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray48, (java.lang.Object[]) strArray53);
        java.lang.String[] strArray62 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArray62);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray62);
        java.lang.String[] strArray67 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet68 = org.apache.lucene.util.LuceneTestCase.asSet(strArray67);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray67);
        java.lang.String[] strArray70 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet71 = org.apache.lucene.util.LuceneTestCase.asSet(strArray70);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray67, (java.lang.Object[]) strArray70);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray62, (java.lang.Object[]) strArray70);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray48, (java.lang.Object[]) strArray70);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray28, (java.lang.Object[]) strArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", objArray1, (java.lang.Object[]) strArray70);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader9, (int) (byte) 100, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.nightly", indexReader15, fields16, fields17, true);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (short) 0, (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray5 = new int[] { (short) 10, '4', (byte) 10 };
        int[] intArray10 = new int[] { (short) 10, (byte) -1, (short) 100, 10 };
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray13);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray18);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray18, (java.lang.Object[]) strArray21);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray21);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests25.ruleChain;
        commonGramsTokenFilterFactoryTests25.setUp();
        commonGramsTokenFilterFactoryTests25.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests25.assertDocsEnumEquals("tests.badapples", postingsEnum30, postingsEnum31, true);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("tests.awaitsfix", indexReader35, fields36, fields37, true);
        org.junit.Assert.assertNotEquals((java.lang.Object) strArray13, (java.lang.Object) indexReader35);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        java.lang.String[] strArray46 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray46);
        java.lang.String[] strArray49 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray46, (java.lang.Object[]) strArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray41, (java.lang.Object[]) strArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray49);
        int[] intArray54 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray5, intArray10, strArray13, intArray54);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) '4', (double) 10L);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.nightly", indexReader5, (int) '#', postingsEnum7, postingsEnum8, true);
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.monster", (int) (short) 10, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.elasticsearch.common.settings.Settings.Builder builder4 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.setUp();
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        org.junit.Assert.assertArrayEquals("", charArray7, charArray10);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals("", charArray17, charArray20);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray20, charArray25);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals("", charArray29, charArray32);
        org.junit.Assert.assertArrayEquals(charArray25, charArray32);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        org.junit.Assert.assertArrayEquals("", charArray38, charArray41);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals(charArray41, charArray45);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals("", charArray50, charArray53);
        org.junit.Assert.assertArrayEquals(charArray41, charArray53);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray32, charArray41);
        org.junit.Assert.assertArrayEquals(charArray7, charArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) charArray7);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.setUp();
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests8.ruleChain;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("tests.maxfailures", indexReader13, fields14, fields15, false);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests8.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests8.assertDocsEnumEquals("<unknown>", postingsEnum20, postingsEnum21, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) builder7, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 1.0f);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, 100.0d);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests3.setUp();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) strSet9);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("", postingsEnum12, postingsEnum13, false);
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("", indexReader18, fields19, fields20, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) "");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray10 = new java.io.Serializable[][] { serializableArray3, serializableArray5, serializableArray7, serializableArray9 };
        java.util.Set<java.io.Serializable[]> serializableArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) "hi!", (java.lang.Object) serializableArray10);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray18);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray23);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray23, (java.lang.Object[]) strArray26);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray18, (java.lang.Object[]) strArray26);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) 10.0d, (java.lang.Object) strArray18);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray38);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray34, (java.lang.Object[]) strArray38);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray38, (java.lang.Object) 1.0d);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray47);
        java.lang.String[] strArray50 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray47, (java.lang.Object[]) strArray50);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        java.util.Set<java.lang.String> strSet55 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray50, (java.lang.Object[]) strArray53);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray38, (java.lang.Object[]) strArray50);
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) strArray18, (java.lang.Object[]) strArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray10, (java.lang.Object[]) strArray50);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("random", true);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests15.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests15, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests15.setUp();
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests15, (java.lang.Object) strSet21);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests28.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests28, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests28.setUp();
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests28, (java.lang.Object) strSet34);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule41 = commonGramsTokenFilterFactoryTests40.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests40, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests40.setUp();
        java.lang.String[] strArray45 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests40, (java.lang.Object) strSet46);
        java.util.Set[] setArray49 = new java.util.Set[6];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray50 = (java.util.Set<java.lang.String>[]) setArray49;
        strSetArray50[0] = strSet12;
        strSetArray50[1] = strSet21;
        strSetArray50[2] = strSet25;
        strSetArray50[3] = strSet34;
        strSetArray50[4] = strSet37;
        strSetArray50[5] = strSet46;
        java.util.Set<java.util.Set<java.lang.String>> strSetSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strSetArray50);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) strSetSet63);
        org.elasticsearch.common.settings.Settings.Builder builder65 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues68 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues69 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.failfast", 4, numericDocValues68, numericDocValues69);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        java.lang.String[][] strArray1 = new java.lang.String[][] {};
        java.util.Set<java.lang.String[]> strArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(strArray1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) strArraySet2);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray3 = new int[] { 5 };
        int[] intArray9 = new int[] { (byte) 100, 4, (byte) 0, '#', 3 };
        int[] intArray16 = new int[] { 5, (short) 1, 0, (-1), (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray3, intArray9, intArray16, (java.lang.Integer) 0);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader7, (int) (byte) -1, postingsEnum9, postingsEnum10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 6, (double) 100.0f);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        int[] intArray7 = new int[] { ' ', ' ', (byte) -1, '#', (short) 0, 0 };
        int[] intArray10 = new int[] { (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray10);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray6 = new int[] { (byte) -1, (short) 0, (byte) 1, (byte) 1 };
        int[] intArray13 = new int[] { 3, (-1), 0, (-1), 'a', '4' };
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray19);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray19);
        java.util.Set<java.io.Serializable> serializableSet23 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray16);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        java.lang.String[] strArray28 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray28);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray25, (java.lang.Object[]) strArray28);
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray25);
        int[] intArray35 = new int[] { 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray6, intArray13, strArray25, intArray35);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (byte) 0, (double) (-1.0f));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 0, 0.0d, (double) (byte) 0);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) ' ', (long) (byte) 100);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) (short) 1);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100, (float) 1, (float) ' ');
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) (byte) 100, (double) 0.0f);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum5, postingsEnum6);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) (byte) 0, (float) (-1L), (float) 0L);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        int[] intArray5 = new int[] { 0, 6, (byte) -1, '#', 100 };
        int[] intArray11 = new int[] { '4', (-1), (short) -1, '4', '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray11);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.setUp();
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests8.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests8.assertTermsEquals("", indexReader15, terms16, terms17, true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = commonGramsTokenFilterFactoryTests8.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) builder20);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(5);
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests27.ruleChain;
        commonGramsTokenFilterFactoryTests27.setUp();
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray34);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray31, (java.lang.Object[]) strArray34);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests27, (java.lang.Object) strArray31);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests27);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests27);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.slow", indexReader42, (int) (byte) 100, postingsEnum44, postingsEnum45);
        java.lang.String[] strArray51 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray51);
        java.lang.String[] strArray56 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray56);
        java.lang.String[] strArray59 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet60 = org.apache.lucene.util.LuceneTestCase.asSet(strArray59);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray56, (java.lang.Object[]) strArray59);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray51, (java.lang.Object[]) strArray59);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) 10.0d, (java.lang.Object) strArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (byte) 100, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 10.0d, (double) 1L, (double) 1);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        commonGramsTokenFilterFactoryTests2.tearDown();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests9.ruleChain;
        commonGramsTokenFilterFactoryTests9.setUp();
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests9.ruleChain;
        commonGramsTokenFilterFactoryTests9.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests9.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests9.assertDocsEnumEquals("hi!", postingsEnum16, postingsEnum17, true);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) builder8, (java.lang.Object) "hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) "hi!");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), 0.0d);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("", indexReader7, 4, postingsEnum9, postingsEnum10);
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule12;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests15.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsEnumEquals("hi!", postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests15.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader23, (int) (byte) 100, postingsEnum25, postingsEnum26);
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests15.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests15, (java.lang.Object) 100L);
        commonGramsTokenFilterFactoryTests15.tearDown();
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) testRule12, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, false);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) '4');
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 0.0d, (double) 'a');
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray5);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray5);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray14);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray14);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray10, (java.lang.Object[]) strArray14);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray23);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray19, (java.lang.Object[]) strArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray10, (java.lang.Object[]) strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray23, (java.lang.Object[]) strArray28);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray33);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray38);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray38, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray33, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) strArray33);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray28);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray49, longArray50);
        long[] longArray52 = new long[] {};
        long[] longArray53 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray52, longArray53);
        org.junit.Assert.assertArrayEquals(longArray49, longArray52);
        long[] longArray56 = new long[] {};
        long[] longArray57 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray56, longArray57);
        org.junit.Assert.assertArrayEquals("hi!", longArray52, longArray57);
        org.junit.Assert.assertNotNull("", (java.lang.Object) longArray57);
        long[] longArray63 = new long[] {};
        long[] longArray64 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray63, longArray64);
        long[] longArray66 = new long[] {};
        long[] longArray67 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray66, longArray67);
        org.junit.Assert.assertArrayEquals(longArray63, longArray66);
        long[] longArray71 = new long[] {};
        long[] longArray72 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray71, longArray72);
        long[] longArray74 = new long[] {};
        long[] longArray75 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray74, longArray75);
        org.junit.Assert.assertArrayEquals(longArray71, longArray74);
        long[] longArray78 = new long[] {};
        long[] longArray79 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray78, longArray79);
        org.junit.Assert.assertArrayEquals("hi!", longArray74, longArray79);
        long[] longArray83 = new long[] {};
        long[] longArray84 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray83, longArray84);
        long[] longArray86 = new long[] {};
        long[] longArray87 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray86, longArray87);
        org.junit.Assert.assertArrayEquals(longArray83, longArray86);
        long[] longArray90 = new long[] {};
        long[] longArray91 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray90, longArray91);
        org.junit.Assert.assertArrayEquals("hi!", longArray86, longArray91);
        org.junit.Assert.assertArrayEquals(longArray79, longArray91);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray66, longArray79);
        long[] longArray96 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray66, longArray96);
        org.junit.Assert.assertArrayEquals(longArray57, longArray96);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) strArray2, (java.lang.Object) longArray57);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (-1.0d), (double) 1, (double) 'a');
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        float[] floatArray0 = null;
        float[] floatArray5 = new float[] { 5, 100, (byte) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray5, (float) (-1));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests3.setUp();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) strSet9);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("", postingsEnum12, postingsEnum13, false);
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests18.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests18.assertPositionsSkippingEquals("tests.nightly", indexReader25, 2, postingsEnum27, postingsEnum28);
        long[] longArray32 = new long[] {};
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray32, longArray33);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray35, longArray36);
        org.junit.Assert.assertArrayEquals(longArray32, longArray35);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray39, longArray40);
        long[] longArray42 = new long[] {};
        long[] longArray43 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray42, longArray43);
        org.junit.Assert.assertArrayEquals(longArray39, longArray42);
        org.junit.Assert.assertArrayEquals(longArray32, longArray39);
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray47, longArray48);
        long[] longArray50 = new long[] {};
        long[] longArray51 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray50, longArray51);
        long[] longArray53 = new long[] {};
        long[] longArray54 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray53, longArray54);
        org.junit.Assert.assertArrayEquals(longArray50, longArray53);
        org.junit.Assert.assertArrayEquals(longArray47, longArray53);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray39, longArray47);
        long[] longArray60 = new long[] {};
        long[] longArray61 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray60, longArray61);
        long[] longArray63 = new long[] {};
        long[] longArray64 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray63, longArray64);
        org.junit.Assert.assertArrayEquals(longArray60, longArray63);
        long[] longArray67 = new long[] {};
        long[] longArray68 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray67, longArray68);
        long[] longArray70 = new long[] {};
        long[] longArray71 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray70, longArray71);
        org.junit.Assert.assertArrayEquals(longArray67, longArray70);
        org.junit.Assert.assertArrayEquals(longArray60, longArray67);
        long[] longArray75 = new long[] {};
        long[] longArray76 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray75, longArray76);
        long[] longArray78 = new long[] {};
        long[] longArray79 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray78, longArray79);
        long[] longArray81 = new long[] {};
        long[] longArray82 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray81, longArray82);
        org.junit.Assert.assertArrayEquals(longArray78, longArray81);
        org.junit.Assert.assertArrayEquals(longArray75, longArray81);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray67, longArray75);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray39, longArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) postingsEnum28, (java.lang.Object) longArray67);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 100, (float) (short) 10, (float) (byte) 1);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder4 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        commonGramsTokenFilterFactoryTests3.setUp();
        commonGramsTokenFilterFactoryTests3.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        java.lang.String str10 = commonGramsTokenFilterFactoryTests3.getTestName();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.maxfailures", indexReader12, 1, postingsEnum14, postingsEnum15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", obj1, (java.lang.Object) 1);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 4, 100L);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray4 = new int[] { 2, 5 };
        int[] intArray5 = new int[] {};
        int[] intArray8 = new int[] { '#', 4 };
        int[] intArray14 = new int[] { (byte) -1, (byte) 1, (short) 1, 2, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray4, intArray5, intArray8, intArray14, (java.lang.Integer) 2);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader9, 3, postingsEnum11, postingsEnum12, true);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1.0d));
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum20, postingsEnum21, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests27.assertDocsEnumEquals("tests.failfast", postingsEnum29, postingsEnum30, true);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests27.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader34, 3, postingsEnum36, postingsEnum37, true);
        commonGramsTokenFilterFactoryTests27.tearDown();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests27);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests27, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotEquals((java.lang.Object) 0, (java.lang.Object) commonGramsTokenFilterFactoryTests27);
        org.elasticsearch.common.settings.Settings.Builder builder45 = commonGramsTokenFilterFactoryTests27.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule47 = commonGramsTokenFilterFactoryTests46.ruleChain;
        commonGramsTokenFilterFactoryTests46.setUp();
        commonGramsTokenFilterFactoryTests46.tearDown();
        commonGramsTokenFilterFactoryTests46.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsEnumEquals("tests.badapples", postingsEnum52, postingsEnum53, false);
        java.lang.String str56 = commonGramsTokenFilterFactoryTests46.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests58 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule59 = commonGramsTokenFilterFactoryTests58.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests58, (java.lang.Object) (-1L));
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        commonGramsTokenFilterFactoryTests58.assertDocsSkippingEquals("", indexReader63, 0, postingsEnum65, postingsEnum66, true);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        commonGramsTokenFilterFactoryTests58.assertPositionsSkippingEquals("tests.failfast", indexReader70, (int) (short) 10, postingsEnum72, postingsEnum73);
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        commonGramsTokenFilterFactoryTests58.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader76, (int) (byte) 100, postingsEnum78, postingsEnum79, false);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests46, (java.lang.Object) "enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) builder45, (java.lang.Object) "enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) true, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray3 = new int[] { 10 };
        int[] intArray10 = new int[] { ' ', 5, (short) 0, (short) 1, 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray3, intArray10);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        java.lang.String str5 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.monster", 10, numericDocValues8, numericDocValues9);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { ' ', 2, (byte) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray5);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 6, (double) 2);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) (byte) -1, 0.0d, (double) 10.0f);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("<unknown>", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("europarl.lines.txt.gz", (-1), numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) strSet8);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("", postingsEnum11, postingsEnum12, false);
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests17.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests17, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests17.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests17);
        org.elasticsearch.common.settings.Settings.Builder builder23 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("hi!", 3, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray3);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray3, (java.lang.Object[]) strArray6);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray15);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray20);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray23);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray15, (java.lang.Object[]) strArray23);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) 10.0d, (java.lang.Object) strArray15);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) strArray15);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray34);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray39);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray39, (java.lang.Object[]) strArray42);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray34, (java.lang.Object[]) strArray42);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) 10.0d, (java.lang.Object) strArray34);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) strArray34);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) strArray15, (java.lang.Object[]) strArray34);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) strArray3, (java.lang.Object) strArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray50 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests> commonGramsTokenFilterFactoryTestsSet51 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray50);
        java.lang.Object[] objArray53 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray50, objArray53);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals("", byteArray3, byteArray5);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests9.ruleChain;
        commonGramsTokenFilterFactoryTests9.setUp();
        commonGramsTokenFilterFactoryTests9.tearDown();
        commonGramsTokenFilterFactoryTests9.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests9.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests9.assertDocsEnumEquals("hi!", postingsEnum16, postingsEnum17, false);
        org.elasticsearch.common.settings.Settings.Builder builder20 = commonGramsTokenFilterFactoryTests9.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) byteArray5, (java.lang.Object) builder20);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) -1);
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("hi!", (int) (byte) 0, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) ' ', (float) (byte) 1);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 10, (byte) 1, (short) 10, 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray5);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 0L, (double) (short) 1);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) '4', (double) (byte) 1);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        int[] intArray1 = null;
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray1, intArray2);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) 3);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.maxfailures", indexReader7, fields8, fields9, false);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder14 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.slow", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.weekly", 0, numericDocValues9, numericDocValues10);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        int[] intArray3 = new int[] { (short) 1, '#' };
        int[] intArray7 = new int[] { '#', (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray3, intArray7);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        int[] intArray6 = new int[] { '#', 5, (short) 1, '#', '4' };
        int[] intArray12 = new int[] { 2, 1, 1, '#', '#' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray6, intArray12);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        int[] intArray2 = new int[] { (byte) -1, (byte) 1 };
        int[] intArray9 = new int[] { (short) -1, 10, '4', (short) 100, (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray9);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader9, (int) (byte) 100, postingsEnum11, postingsEnum12);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("<unknown>", indexReader18, 6, postingsEnum20, postingsEnum21);
        java.lang.String str23 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.maxfailures", (int) (short) 1, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 6, (double) '4');
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 2, (long) (short) 100);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum8, postingsEnum9, true);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray15, longArray16);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray18, longArray19);
        org.junit.Assert.assertArrayEquals(longArray15, longArray18);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray22, longArray23);
        org.junit.Assert.assertArrayEquals("hi!", longArray18, longArray23);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray27, longArray28);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray30, longArray31);
        org.junit.Assert.assertArrayEquals(longArray27, longArray30);
        long[] longArray34 = new long[] {};
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray34, longArray35);
        org.junit.Assert.assertArrayEquals("hi!", longArray30, longArray35);
        org.junit.Assert.assertArrayEquals(longArray23, longArray35);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray40, longArray41);
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray43, longArray44);
        org.junit.Assert.assertArrayEquals(longArray40, longArray43);
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray47, longArray48);
        org.junit.Assert.assertArrayEquals("hi!", longArray43, longArray48);
        org.junit.Assert.assertArrayEquals("", longArray23, longArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) longArray43);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0f), (float) 100, (float) 3);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("tests.maxfailures", indexReader9, (int) (byte) 1, postingsEnum11, postingsEnum12, true);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("tests.awaitsfix", (int) '4', numericDocValues18, numericDocValues19);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        int[] intArray4 = new int[] { 4, (byte) 10, (short) -1 };
        int[] intArray10 = new int[] { (short) 0, (byte) 0, (byte) 10, '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray4, intArray10);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) (byte) 100, postingsEnum10, postingsEnum11);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(6);
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsEnumEquals("hi!", postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests18.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader26, (int) (byte) 100, postingsEnum28, postingsEnum29);
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) 100L);
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsEnumEquals("", postingsEnum37, postingsEnum38, false);
        commonGramsTokenFilterFactoryTests18.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray42 = new org.apache.lucene.util.LuceneTestCase[] { commonGramsTokenFilterFactoryTests0, commonGramsTokenFilterFactoryTests18 };
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet43 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray42);
        java.lang.Object[] objArray44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) luceneTestCaseArray42, objArray44);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (byte) 10, (long) 6);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        short[] shortArray0 = new short[] {};
        short[] shortArray1 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray1);
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray4);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray9);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray12);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray19);
        org.junit.Assert.assertArrayEquals("", shortArray12, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray16);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) (short) -1, (double) 0.0f);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) (byte) 100, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.nightly", indexReader14, fields15, fields16, true);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        int[] intArray4 = new int[] { '4', (byte) 0, '4', '4' };
        int[] intArray11 = new int[] { 1, 10, (short) 1, (-1), 6, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray11);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        commonGramsTokenFilterFactoryTests2.tearDown();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader8, fields9, fields10, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) (short) 10, (java.lang.Object) fields10);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray2, charArray4);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader9, (int) (byte) 100, postingsEnum11, postingsEnum12);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("<unknown>", indexReader18, 6, postingsEnum20, postingsEnum21);
        double[] doubleArray29 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray36 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray36, (double) 100.0f);
        double[] doubleArray45 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray52 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray52, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray45, (double) 4);
        double[] doubleArray63 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray70 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray70, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray63, (double) (byte) 0);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) doubleArray63);
        org.junit.rules.TestRule testRule76 = commonGramsTokenFilterFactoryTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule76);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (-1.0d));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) 0, numericDocValues8, numericDocValues9);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        short[] shortArray1 = null;
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray11, longArray12);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray14, longArray15);
        org.junit.Assert.assertArrayEquals(longArray11, longArray14);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray18, longArray19);
        org.junit.Assert.assertArrayEquals("hi!", longArray14, longArray19);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray24, longArray25);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray27, longArray28);
        org.junit.Assert.assertArrayEquals(longArray24, longArray27);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray31, longArray32);
        org.junit.Assert.assertArrayEquals("hi!", longArray27, longArray32);
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray36, longArray37);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray39, longArray40);
        org.junit.Assert.assertArrayEquals(longArray36, longArray39);
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray43, longArray44);
        org.junit.Assert.assertArrayEquals("hi!", longArray39, longArray44);
        org.junit.Assert.assertArrayEquals(longArray32, longArray44);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray49, longArray50);
        long[] longArray52 = new long[] {};
        long[] longArray53 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray52, longArray53);
        org.junit.Assert.assertArrayEquals(longArray49, longArray52);
        long[] longArray56 = new long[] {};
        long[] longArray57 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray56, longArray57);
        org.junit.Assert.assertArrayEquals("hi!", longArray52, longArray57);
        org.junit.Assert.assertArrayEquals("", longArray32, longArray52);
        org.junit.Assert.assertArrayEquals(longArray14, longArray52);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray6, longArray52);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray64);
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.nightly", (java.lang.Object) shortArray63);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray1, shortArray63);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4, true);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader8, 3, postingsEnum10, postingsEnum11, true);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1.0d));
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.nightly", indexReader19, fields20, fields21, true);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        java.util.Set<java.lang.String> strSet28 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray30);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray26, (java.lang.Object[]) strArray30);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule36 = commonGramsTokenFilterFactoryTests35.ruleChain;
        commonGramsTokenFilterFactoryTests35.setUp();
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray42);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray39, (java.lang.Object[]) strArray42);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests35, (java.lang.Object) strArray39);
        java.lang.String[] strArray49 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray49);
        java.lang.String[] strArray54 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet55 = org.apache.lucene.util.LuceneTestCase.asSet(strArray54);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray54);
        java.lang.String[] strArray57 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet58 = org.apache.lucene.util.LuceneTestCase.asSet(strArray57);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray54, (java.lang.Object[]) strArray57);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray49, (java.lang.Object[]) strArray57);
        java.lang.String[] strArray63 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet64 = org.apache.lucene.util.LuceneTestCase.asSet(strArray63);
        java.util.Set<java.lang.String> strSet65 = org.apache.lucene.util.LuceneTestCase.asSet(strArray63);
        java.lang.String[] strArray67 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet68 = org.apache.lucene.util.LuceneTestCase.asSet(strArray67);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray67);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray63, (java.lang.Object[]) strArray67);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray67, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray57, (java.lang.Object[]) strArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray39, (java.lang.Object[]) strArray57);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray30, (java.lang.Object[]) strArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexReader19, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        commonGramsTokenFilterFactoryTests2.tearDown();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.badapples", postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("", indexReader13, (int) (short) 1, postingsEnum15, postingsEnum16);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray24);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray24);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray33);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray33);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests41 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests41.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests41, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests41.setUp();
        commonGramsTokenFilterFactoryTests41.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule47 = commonGramsTokenFilterFactoryTests41.ruleChain;
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) throttling39, (java.lang.Object) testRule47);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) strArray33, (java.lang.Object) throttling39);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) throttling39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) throttling39);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray11, longArray12);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray14, longArray15);
        org.junit.Assert.assertArrayEquals(longArray11, longArray14);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray18, longArray19);
        org.junit.Assert.assertArrayEquals("hi!", longArray14, longArray19);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray23, longArray24);
        long[] longArray26 = new long[] {};
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray26, longArray27);
        org.junit.Assert.assertArrayEquals(longArray23, longArray26);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray30, longArray31);
        org.junit.Assert.assertArrayEquals("hi!", longArray26, longArray31);
        org.junit.Assert.assertArrayEquals(longArray19, longArray31);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray6, longArray19);
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray36, longArray37);
        org.junit.Assert.assertArrayEquals(longArray6, longArray37);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray42);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray47);
        java.lang.String[] strArray50 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray47, (java.lang.Object[]) strArray50);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray42, (java.lang.Object[]) strArray50);
        java.lang.String[] strArray56 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        java.util.Set<java.lang.String> strSet58 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        java.lang.String[] strArray60 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet61 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray60);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray56, (java.lang.Object[]) strArray60);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray60, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray50, (java.lang.Object[]) strArray60);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) longArray6, (java.lang.Object) strArray60);
        byte[] byteArray69 = new byte[] {};
        byte[] byteArray70 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray69, byteArray70);
        byte[] byteArray72 = new byte[] {};
        byte[] byteArray73 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray72, byteArray73);
        org.junit.Assert.assertArrayEquals("", byteArray70, byteArray72);
        long[] longArray76 = new long[] {};
        long[] longArray77 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray76, longArray77);
        long[] longArray79 = new long[] {};
        long[] longArray80 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray79, longArray80);
        long[] longArray82 = new long[] {};
        long[] longArray83 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray82, longArray83);
        org.junit.Assert.assertArrayEquals(longArray79, longArray82);
        org.junit.Assert.assertArrayEquals(longArray76, longArray82);
        byte[] byteArray87 = new byte[] {};
        byte[] byteArray88 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray87, byteArray88);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray82, (java.lang.Object) byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray70, byteArray87);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) longArray6, (java.lang.Object) byteArray70);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("", byteArray6, byteArray8);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray12, longArray13);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray15, longArray16);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray18, longArray19);
        org.junit.Assert.assertArrayEquals(longArray15, longArray18);
        org.junit.Assert.assertArrayEquals(longArray12, longArray18);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray18, (java.lang.Object) byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray23);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray3, byteArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) (byte) -1, (java.lang.Object) byteArray3);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        org.junit.Assert.assertArrayEquals("", byteArray2, byteArray4);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray8, longArray9);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray11, longArray12);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray14, longArray15);
        org.junit.Assert.assertArrayEquals(longArray11, longArray14);
        org.junit.Assert.assertArrayEquals(longArray8, longArray14);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray14, (java.lang.Object) byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray19);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray25, longArray26);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray29, longArray30);
        long[] longArray32 = new long[] {};
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray32, longArray33);
        org.junit.Assert.assertArrayEquals(longArray29, longArray32);
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray36, longArray37);
        org.junit.Assert.assertArrayEquals("hi!", longArray32, longArray37);
        org.junit.Assert.assertArrayEquals("random", longArray25, longArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) byteArray19, (java.lang.Object) longArray32);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (byte) 10, (double) 5, (double) (short) -1);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("hi!", postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) 100, postingsEnum14, postingsEnum15);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests19.ruleChain;
        commonGramsTokenFilterFactoryTests19.setUp();
        commonGramsTokenFilterFactoryTests19.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests25.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests25, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests25.setUp();
        java.lang.String[] strArray30 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests25, (java.lang.Object) strSet31);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests34 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests34.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests34.assertDocsEnumEquals("hi!", postingsEnum37, postingsEnum38, false);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests34.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader42, (int) (byte) 100, postingsEnum44, postingsEnum45);
        org.junit.rules.TestRule testRule47 = commonGramsTokenFilterFactoryTests34.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests34, (java.lang.Object) 100L);
        org.elasticsearch.test.ESTokenStreamTestCase[] eSTokenStreamTestCaseArray50 = new org.elasticsearch.test.ESTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests0, commonGramsTokenFilterFactoryTests4, commonGramsTokenFilterFactoryTests19, commonGramsTokenFilterFactoryTests25, commonGramsTokenFilterFactoryTests34 };
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase> eSTokenStreamTestCaseSet51 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray50);
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase> eSTokenStreamTestCaseSet52 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray50);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests53 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests53.ruleChain;
        commonGramsTokenFilterFactoryTests53.setUp();
        commonGramsTokenFilterFactoryTests53.tearDown();
        commonGramsTokenFilterFactoryTests53.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests53.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        commonGramsTokenFilterFactoryTests53.assertDocsEnumEquals("hi!", postingsEnum60, postingsEnum61, false);
        org.elasticsearch.common.settings.Settings.Builder builder64 = commonGramsTokenFilterFactoryTests53.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) eSTokenStreamTestCaseArray50, (java.lang.Object) commonGramsTokenFilterFactoryTests53);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet66 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) eSTokenStreamTestCaseArray50);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests69 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule70 = commonGramsTokenFilterFactoryTests69.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests69, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests69.setUp();
        java.lang.String[] strArray74 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet75 = org.apache.lucene.util.LuceneTestCase.asSet(strArray74);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests69, (java.lang.Object) strSet75);
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        commonGramsTokenFilterFactoryTests69.assertDocsEnumEquals("", postingsEnum78, postingsEnum79, false);
        org.elasticsearch.common.settings.Settings.Builder builder82 = commonGramsTokenFilterFactoryTests69.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests84 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule85 = commonGramsTokenFilterFactoryTests84.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests84, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests84.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests69, (java.lang.Object) commonGramsTokenFilterFactoryTests84);
        commonGramsTokenFilterFactoryTests84.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) eSTokenStreamTestCaseArray50, (java.lang.Object) commonGramsTokenFilterFactoryTests84);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray5);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray5);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray11);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray16);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray19);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray11, (java.lang.Object[]) strArray19);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests23.ruleChain;
        commonGramsTokenFilterFactoryTests23.setUp();
        commonGramsTokenFilterFactoryTests23.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests23.assertDocsEnumEquals("tests.badapples", postingsEnum28, postingsEnum29, true);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        commonGramsTokenFilterFactoryTests23.assertFieldsEquals("tests.awaitsfix", indexReader33, fields34, fields35, true);
        org.junit.Assert.assertNotEquals((java.lang.Object) strArray11, (java.lang.Object) indexReader33);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray44);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray39, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) strArray5);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        org.junit.Assert.assertArrayEquals("", charArray5, charArray8);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray8, charArray13);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals("", charArray17, charArray20);
        org.junit.Assert.assertArrayEquals(charArray13, charArray20);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals("", charArray26, charArray29);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals(charArray29, charArray33);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        org.junit.Assert.assertArrayEquals("", charArray38, charArray41);
        org.junit.Assert.assertArrayEquals(charArray29, charArray41);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray20, charArray29);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        org.junit.Assert.assertArrayEquals("", charArray49, charArray52);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray52, charArray56);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        org.junit.Assert.assertArrayEquals("", charArray61, charArray64);
        org.junit.Assert.assertArrayEquals(charArray56, charArray64);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray29, charArray56);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        char[] charArray75 = new char[] {};
        char[] charArray76 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray75, charArray76);
        org.junit.Assert.assertArrayEquals("", charArray72, charArray75);
        char[] charArray79 = new char[] {};
        char[] charArray80 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray79, charArray80);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray75, charArray80);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray29, charArray80);
        char[] charArray84 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray80, charArray84);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader9, 3, postingsEnum11, postingsEnum12, true);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1.0d));
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum20, postingsEnum21, false);
        java.lang.String str24 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) builder25);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (short) 1, (double) (byte) 1);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader7, fields8, fields9, true);
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray14, longArray15);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray17, longArray18);
        org.junit.Assert.assertArrayEquals(longArray14, longArray17);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) longArray14);
        long[][] longArray23 = new long[][] {};
        java.util.Set<long[]> longArraySet24 = org.apache.lucene.util.LuceneTestCase.asSet(longArray23);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray30);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray30, (java.lang.Object[]) strArray33);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray38);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray38, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray33, (java.lang.Object[]) strArray38);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray47);
        java.lang.String[] strArray52 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray52);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet56 = org.apache.lucene.util.LuceneTestCase.asSet(strArray55);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray52, (java.lang.Object[]) strArray55);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray47, (java.lang.Object[]) strArray55);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray33, (java.lang.Object[]) strArray55);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.failfast", (java.lang.Object) strArray33);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) longArray23, (java.lang.Object[]) strArray33);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) strArray33, (java.lang.Object) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) strArray33);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum7, postingsEnum8, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests0.ruleChain;
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray20);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray20);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray20, (java.lang.Object) 1.0d);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray29);
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray32);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray32, (java.lang.Object[]) strArray35);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "<unknown>");
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum42, postingsEnum43);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray14);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray21);
        org.junit.Assert.assertArrayEquals("", shortArray14, shortArray18);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray27);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray30);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray37);
        org.junit.Assert.assertArrayEquals("", shortArray30, shortArray34);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray14, shortArray34);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray44);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray51);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray55);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray58);
        org.junit.Assert.assertArrayEquals("", shortArray51, shortArray55);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray43, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray51);
        org.junit.Assert.assertArrayEquals("random", shortArray2, shortArray51);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests67 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule68 = commonGramsTokenFilterFactoryTests67.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests67, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests67.setUp();
        java.lang.String[] strArray72 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet73 = org.apache.lucene.util.LuceneTestCase.asSet(strArray72);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests67, (java.lang.Object) strSet73);
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        commonGramsTokenFilterFactoryTests67.assertDocsEnumEquals("", postingsEnum76, postingsEnum77, false);
        org.elasticsearch.common.settings.Settings.Builder builder80 = commonGramsTokenFilterFactoryTests67.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests82 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule83 = commonGramsTokenFilterFactoryTests82.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests82, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests82.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests67, (java.lang.Object) commonGramsTokenFilterFactoryTests82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray51, (java.lang.Object) commonGramsTokenFilterFactoryTests82);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) 100L, (double) '4');
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 0, (float) 3, 0.0f);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray8);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray15);
        org.junit.Assert.assertArrayEquals("", shortArray8, shortArray12);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray25);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray28);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray32);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray35);
        org.junit.Assert.assertArrayEquals("", shortArray28, shortArray32);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray20, shortArray28);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray44);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray41);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray12, shortArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) locale1, (java.lang.Object) shortArray41);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0.0d, (double) 1.0f);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) (byte) 100, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.nightly", indexReader14, fields15, fields16, true);
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass6 = commonGramsTokenFilterFactoryTests1.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.setUp();
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray15);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray12, (java.lang.Object[]) strArray15);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests8, (java.lang.Object) strArray12);
        java.lang.String[] strArray22 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray22);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet28 = org.apache.lucene.util.LuceneTestCase.asSet(strArray27);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray27);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray27, (java.lang.Object[]) strArray30);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray22, (java.lang.Object[]) strArray30);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        java.util.Set<java.lang.String> strSet38 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        java.lang.String[] strArray40 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray40);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray40);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray36, (java.lang.Object[]) strArray40);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray40, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray30, (java.lang.Object[]) strArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray30);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) wildcardClass6, (java.lang.Object) strArray12);
        short[] shortArray54 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray60 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray66 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[][] shortArray67 = new short[][] { shortArray54, shortArray60, shortArray66 };
        java.util.Set<short[]> shortArraySet68 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray67);
        java.util.Set<short[]> shortArraySet69 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) shortArray67);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet1 = org.apache.lucene.util.LuceneTestCase.asSet(strArray0);
        java.util.Set<java.lang.String> strSet2 = org.apache.lucene.util.LuceneTestCase.asSet(strArray0);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray5);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray0, (java.lang.Object[]) strArray8);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray16);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray19);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray24);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet28 = org.apache.lucene.util.LuceneTestCase.asSet(strArray27);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray27);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray19, (java.lang.Object[]) strArray24);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray33);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray38);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray38, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray33, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray19, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray0, (java.lang.Object[]) strArray41);
        java.lang.String[] strArray50 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray50);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray50, (java.lang.Object[]) strArray53);
        java.lang.String[] strArray58 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet59 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray58);
        java.lang.String[] strArray61 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet62 = org.apache.lucene.util.LuceneTestCase.asSet(strArray61);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray58, (java.lang.Object[]) strArray61);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray53, (java.lang.Object[]) strArray58);
        java.lang.String[] strArray68 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet69 = org.apache.lucene.util.LuceneTestCase.asSet(strArray68);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray68);
        java.lang.String[] strArray71 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet72 = org.apache.lucene.util.LuceneTestCase.asSet(strArray71);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray68, (java.lang.Object[]) strArray71);
        java.lang.String[] strArray76 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet77 = org.apache.lucene.util.LuceneTestCase.asSet(strArray76);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray76);
        java.lang.String[] strArray79 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet80 = org.apache.lucene.util.LuceneTestCase.asSet(strArray79);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray76, (java.lang.Object[]) strArray79);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray71, (java.lang.Object[]) strArray76);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray58, (java.lang.Object[]) strArray71);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray0, (java.lang.Object[]) strArray58);
        java.lang.Object[] objArray85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray58, objArray85);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 3, (double) (short) -1, (double) 5);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) '4', (double) 6, (double) (byte) 0);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 1, (float) 10, 0.0f);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 1, (double) (byte) -1, (double) 0L);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10.0f, (double) '4');
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, 0.0d);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder4 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass5 = commonGramsTokenFilterFactoryTests0.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray6 = new java.lang.reflect.AnnotatedElement[] { wildcardClass5 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests7.ruleChain;
        commonGramsTokenFilterFactoryTests7.setUp();
        commonGramsTokenFilterFactoryTests7.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests7.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass12 = commonGramsTokenFilterFactoryTests7.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray13 = new java.lang.reflect.AnnotatedElement[] { wildcardClass12 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.setUp();
        commonGramsTokenFilterFactoryTests14.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests14.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass19 = commonGramsTokenFilterFactoryTests14.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray20 = new java.lang.reflect.AnnotatedElement[] { wildcardClass19 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests21.ruleChain;
        commonGramsTokenFilterFactoryTests21.setUp();
        commonGramsTokenFilterFactoryTests21.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests21.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass26 = commonGramsTokenFilterFactoryTests21.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray27 = new java.lang.reflect.AnnotatedElement[] { wildcardClass26 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray28 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray6, annotatedElementArray13, annotatedElementArray20, annotatedElementArray27 };
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet29 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray28);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray33);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray33, (java.lang.Object[]) strArray36);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray45);
        java.lang.String[] strArray50 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray50);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray50, (java.lang.Object[]) strArray53);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray45, (java.lang.Object[]) strArray53);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) 10.0d, (java.lang.Object) strArray45);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) strArray45);
        java.lang.String[] strArray64 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet65 = org.apache.lucene.util.LuceneTestCase.asSet(strArray64);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray64);
        java.lang.String[] strArray69 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet70 = org.apache.lucene.util.LuceneTestCase.asSet(strArray69);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray69);
        java.lang.String[] strArray72 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet73 = org.apache.lucene.util.LuceneTestCase.asSet(strArray72);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray69, (java.lang.Object[]) strArray72);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray64, (java.lang.Object[]) strArray72);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) 10.0d, (java.lang.Object) strArray64);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) strArray64);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) strArray45, (java.lang.Object[]) strArray64);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) strArray33, (java.lang.Object) strArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) annotatedElementArray28, (java.lang.Object[]) strArray33);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', 100.0d, (double) (byte) 10);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet1 = org.apache.lucene.util.LuceneTestCase.asSet(strArray0);
        java.lang.Class<?> wildcardClass2 = strSet1.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests5.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests5, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests5.setUp();
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests5, (java.lang.Object) strSet11);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsEnumEquals("", postingsEnum14, postingsEnum15, false);
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests5.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests5.tearDown();
        commonGramsTokenFilterFactoryTests5.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) strSet1, (java.lang.Object) commonGramsTokenFilterFactoryTests5);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, false);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.slow", postingsEnum11, postingsEnum12, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.weekly", (int) '#', numericDocValues18, numericDocValues19);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.badapples", postingsEnum6, postingsEnum7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("hi!", indexReader11, 1, postingsEnum13, postingsEnum14, false);
        java.lang.String str17 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests18.ruleChain;
        commonGramsTokenFilterFactoryTests18.setUp();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests18.ruleChain;
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsSkippingEquals("", indexReader24, (int) (byte) 0, postingsEnum26, postingsEnum27, true);
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        java.lang.String str31 = commonGramsTokenFilterFactoryTests18.getTestName();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsSkippingEquals("", indexReader33, (-1), postingsEnum35, postingsEnum36, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) str17, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader6, 1, postingsEnum8, postingsEnum9);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, 1.0d);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader9, (int) (byte) 100, postingsEnum11, postingsEnum12);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 100L);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.slow", postingsEnum18, postingsEnum19, true);
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.maxfailures", (-1), numericDocValues24, numericDocValues25);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        long[][] longArray0 = new long[][] {};
        java.util.Set<long[]> longArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(longArray0);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray7);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray7, (java.lang.Object[]) strArray10);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray15);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray15, (java.lang.Object[]) strArray18);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray10, (java.lang.Object[]) strArray15);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray24);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray29);
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray32);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray32);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray10, (java.lang.Object[]) strArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.failfast", (java.lang.Object) strArray10);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray10);
        org.junit.Assert.assertEquals((java.lang.Object[]) longArray0, (java.lang.Object[]) strArray10);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule41 = commonGramsTokenFilterFactoryTests40.ruleChain;
        commonGramsTokenFilterFactoryTests40.setUp();
        org.junit.rules.TestRule testRule43 = commonGramsTokenFilterFactoryTests40.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests44 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests44.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests44.assertDocsEnumEquals("hi!", postingsEnum47, postingsEnum48, false);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        commonGramsTokenFilterFactoryTests44.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader52, (int) (byte) 100, postingsEnum54, postingsEnum55);
        org.junit.rules.TestRule testRule57 = commonGramsTokenFilterFactoryTests44.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder58 = commonGramsTokenFilterFactoryTests44.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests59 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule60 = commonGramsTokenFilterFactoryTests59.ruleChain;
        commonGramsTokenFilterFactoryTests59.setUp();
        commonGramsTokenFilterFactoryTests59.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests65 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule66 = commonGramsTokenFilterFactoryTests65.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests65, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests65.setUp();
        java.lang.String[] strArray70 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet71 = org.apache.lucene.util.LuceneTestCase.asSet(strArray70);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests65, (java.lang.Object) strSet71);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests74 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule75 = commonGramsTokenFilterFactoryTests74.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        commonGramsTokenFilterFactoryTests74.assertDocsEnumEquals("hi!", postingsEnum77, postingsEnum78, false);
        org.apache.lucene.index.IndexReader indexReader82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        commonGramsTokenFilterFactoryTests74.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader82, (int) (byte) 100, postingsEnum84, postingsEnum85);
        org.junit.rules.TestRule testRule87 = commonGramsTokenFilterFactoryTests74.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests74, (java.lang.Object) 100L);
        org.elasticsearch.test.ESTokenStreamTestCase[] eSTokenStreamTestCaseArray90 = new org.elasticsearch.test.ESTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests40, commonGramsTokenFilterFactoryTests44, commonGramsTokenFilterFactoryTests59, commonGramsTokenFilterFactoryTests65, commonGramsTokenFilterFactoryTests74 };
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase> eSTokenStreamTestCaseSet91 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray90);
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase> eSTokenStreamTestCaseSet92 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray90);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) longArray0, (java.lang.Object[]) eSTokenStreamTestCaseArray90);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet2 = org.apache.lucene.util.LuceneTestCase.asSet(strArray1);
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray1);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray6);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) strArray9);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.setUp();
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray21);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray18, (java.lang.Object[]) strArray21);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests14, (java.lang.Object) strArray18);
        java.lang.String[] strArray28 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray28);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray33);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray33, (java.lang.Object[]) strArray36);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray28, (java.lang.Object[]) strArray36);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        java.lang.String[] strArray46 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray46);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray42, (java.lang.Object[]) strArray46);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray46, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray36, (java.lang.Object[]) strArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray18, (java.lang.Object[]) strArray36);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray1, (java.lang.Object[]) strArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArray36);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.badapples", postingsEnum6, postingsEnum7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder6 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) builder6);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray4, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray4);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests13.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests13.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests13.assertPositionsSkippingEquals("", indexReader19, (int) (byte) 1, postingsEnum21, postingsEnum22);
        java.lang.Class<?> wildcardClass24 = commonGramsTokenFilterFactoryTests13.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests25.ruleChain;
        commonGramsTokenFilterFactoryTests25.setUp();
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests25.ruleChain;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("tests.maxfailures", indexReader30, fields31, fields32, false);
        java.lang.Class<?> wildcardClass35 = commonGramsTokenFilterFactoryTests25.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests37.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests37, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests37.setUp();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests37.assertPositionsSkippingEquals("", indexReader43, (int) (byte) 1, postingsEnum45, postingsEnum46);
        java.lang.Class<?> wildcardClass48 = commonGramsTokenFilterFactoryTests37.getClass();
        java.lang.String[] strArray51 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray51);
        java.lang.String[] strArray54 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet55 = org.apache.lucene.util.LuceneTestCase.asSet(strArray54);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray51, (java.lang.Object[]) strArray54);
        java.lang.Class<?> wildcardClass57 = strArray51.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray58 = new java.lang.reflect.GenericDeclaration[] { wildcardClass24, wildcardClass35, wildcardClass48, wildcardClass57 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet59 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray58);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests60 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule61 = commonGramsTokenFilterFactoryTests60.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests60.assertDocsEnumEquals("hi!", postingsEnum63, postingsEnum64, false);
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        commonGramsTokenFilterFactoryTests60.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader68, (int) (byte) 100, postingsEnum70, postingsEnum71);
        org.junit.rules.TestRule testRule73 = commonGramsTokenFilterFactoryTests60.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) genericDeclarationSet59, (java.lang.Object) commonGramsTokenFilterFactoryTests60);
        short[] shortArray80 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray86 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray92 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[][] shortArray93 = new short[][] { shortArray80, shortArray86, shortArray92 };
        java.util.Set<short[]> shortArraySet94 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray93);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests60, (java.lang.Object) shortArray93);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) byteArray4, (java.lang.Object) commonGramsTokenFilterFactoryTests60);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        float[] floatArray2 = new float[] { (short) 1 };
        float[] floatArray4 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray4, (float) '#');
        float[] floatArray8 = new float[] { (short) 1 };
        float[] floatArray10 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray10, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray8, (float) '4');
        float[] floatArray16 = new float[] { (short) 1 };
        float[] floatArray18 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray18, (float) '#');
        float[] floatArray22 = new float[] { (short) 1 };
        float[] floatArray24 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray24, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray22, (float) '4');
        org.junit.Assert.assertArrayEquals("hi!", floatArray8, floatArray22, 1.0f);
        float[] floatArray35 = new float[] { (short) 1 };
        float[] floatArray37 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray37, (float) '#');
        float[] floatArray41 = new float[] { (short) 1 };
        float[] floatArray43 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray43, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray37, floatArray41, (float) 100);
        float[] floatArray50 = new float[] { (short) 1 };
        float[] floatArray52 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray52, (float) '#');
        float[] floatArray56 = new float[] { (short) 1 };
        float[] floatArray58 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray58, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray52, floatArray56, (float) 100);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray41, floatArray52, (float) (short) 10);
        float[] floatArray66 = new float[] { (short) 1 };
        float[] floatArray68 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray66, floatArray68, (float) '#');
        float[] floatArray72 = new float[] { (short) 1 };
        float[] floatArray74 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray72, floatArray74, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray66, floatArray72, (float) '4');
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray52, floatArray66, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray66, (float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (byte) -1);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals("", byteArray2, byteArray6);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray9, longArray10);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray12, longArray13);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray15, longArray16);
        org.junit.Assert.assertArrayEquals(longArray12, longArray15);
        org.junit.Assert.assertArrayEquals(longArray9, longArray15);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray15, (java.lang.Object) byteArray20);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray25);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals("", byteArray29, byteArray31);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray35, longArray36);
        long[] longArray38 = new long[] {};
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray38, longArray39);
        long[] longArray41 = new long[] {};
        long[] longArray42 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray41, longArray42);
        org.junit.Assert.assertArrayEquals(longArray38, longArray41);
        org.junit.Assert.assertArrayEquals(longArray35, longArray41);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray47);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray41, (java.lang.Object) byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray46);
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray54);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray57);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray53, byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray6);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 5, (double) (byte) 0);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.slow", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) (byte) 100, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests13.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) (-1L));
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests19.setUp();
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) strSet25);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) "enwiki.random.lines.txt");
        commonGramsTokenFilterFactoryTests13.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests13.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        org.junit.Assert.assertArrayEquals(intArray0, intArray3);
        int[] intArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray7);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 100, (float) (short) 10, 10.0f);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray8);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray11);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray11);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests15.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsEnumEquals("hi!", postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests15.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader23, (int) (byte) 100, postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        commonGramsTokenFilterFactoryTests15.assertFieldsEquals("tests.nightly", indexReader29, fields30, fields31, true);
        commonGramsTokenFilterFactoryTests15.tearDown();
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests15.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests36.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsEnumEquals("tests.failfast", postingsEnum39, postingsEnum40, false);
        commonGramsTokenFilterFactoryTests36.setUp();
        java.lang.String[] strArray45 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        java.lang.String[] strArray49 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray49);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray45, (java.lang.Object[]) strArray49);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests53 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests53.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        commonGramsTokenFilterFactoryTests53.assertDocsEnumEquals("hi!", postingsEnum56, postingsEnum57, false);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests53.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader61, (int) (byte) 100, postingsEnum63, postingsEnum64);
        org.junit.rules.TestRule testRule66 = commonGramsTokenFilterFactoryTests53.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests67 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule68 = commonGramsTokenFilterFactoryTests67.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        commonGramsTokenFilterFactoryTests67.assertDocsEnumEquals("hi!", postingsEnum70, postingsEnum71, false);
        java.lang.String[] strArray75 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet76 = org.apache.lucene.util.LuceneTestCase.asSet(strArray75);
        java.util.Set<java.lang.String> strSet77 = org.apache.lucene.util.LuceneTestCase.asSet(strArray75);
        java.lang.String[] strArray79 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet80 = org.apache.lucene.util.LuceneTestCase.asSet(strArray79);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray79);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray75, (java.lang.Object[]) strArray79);
        java.lang.String[] strArray84 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet85 = org.apache.lucene.util.LuceneTestCase.asSet(strArray84);
        java.util.Set<java.lang.String> strSet86 = org.apache.lucene.util.LuceneTestCase.asSet(strArray84);
        java.lang.String[] strArray88 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet89 = org.apache.lucene.util.LuceneTestCase.asSet(strArray88);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray88);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray84, (java.lang.Object[]) strArray88);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray75, (java.lang.Object[]) strArray88);
        java.lang.Object[] objArray93 = new java.lang.Object[] { commonGramsTokenFilterFactoryTests15, commonGramsTokenFilterFactoryTests36, strArray45, testRule66, postingsEnum71, strArray75 };
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray3, (java.lang.Object[]) strArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", objArray1, (java.lang.Object[]) strArray45);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 3, (long) (short) 100);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.badapples", indexReader6, (int) (byte) 100, postingsEnum8, postingsEnum9, true);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests13.ruleChain;
        commonGramsTokenFilterFactoryTests13.setUp();
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests13.ruleChain;
        commonGramsTokenFilterFactoryTests13.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests13.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests13.assertPositionsSkippingEquals("tests.badapples", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23);
        commonGramsTokenFilterFactoryTests13.setUp();
        commonGramsTokenFilterFactoryTests13.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests13);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader9, (int) (byte) 100, postingsEnum11, postingsEnum12);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("<unknown>", indexReader18, 6, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("hi!", (int) '4', numericDocValues25, numericDocValues26);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader9, 3, postingsEnum11, postingsEnum12, true);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.badapples", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23);
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("tests.awaitsfix", (int) (short) -1, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        byte[] byteArray1 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray3, byteArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray1, byteArray7);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) ' ');
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum7, postingsEnum8, true);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0L, (-1L));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) (short) 10, (float) 4, (float) (byte) 0);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals(intArray3, intArray6);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertArrayEquals(intArray10, intArray13);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray6, intArray13);
        int[] intArray19 = new int[] { (byte) 100 };
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals(intArray21, intArray24);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        org.junit.Assert.assertArrayEquals(intArray28, intArray31);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray24, intArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray13, intArray19, intArray31, (java.lang.Integer) (-1));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("tests.failfast", postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader10, 3, postingsEnum12, postingsEnum13, true);
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs((int) (short) 1);
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests3.ruleChain;
        java.lang.Object obj23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests3, obj23);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray4, longArray5);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray7, longArray8);
        org.junit.Assert.assertArrayEquals(longArray4, longArray7);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray12, longArray13);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray15, longArray16);
        org.junit.Assert.assertArrayEquals(longArray12, longArray15);
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray19, longArray20);
        org.junit.Assert.assertArrayEquals("hi!", longArray15, longArray20);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray24, longArray25);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray27, longArray28);
        org.junit.Assert.assertArrayEquals(longArray24, longArray27);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray31, longArray32);
        org.junit.Assert.assertArrayEquals("hi!", longArray27, longArray32);
        org.junit.Assert.assertArrayEquals(longArray20, longArray32);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray7, longArray20);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray37, longArray38);
        org.junit.Assert.assertArrayEquals(longArray7, longArray38);
        long[] longArray42 = new long[] {};
        long[] longArray43 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray42, longArray43);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray45, longArray46);
        org.junit.Assert.assertArrayEquals(longArray42, longArray45);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray49, longArray50);
        org.junit.Assert.assertArrayEquals("hi!", longArray45, longArray50);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray7, longArray45);
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray55, longArray56);
        long[] longArray58 = new long[] {};
        long[] longArray59 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray58, longArray59);
        org.junit.Assert.assertArrayEquals(longArray55, longArray58);
        long[] longArray63 = new long[] {};
        long[] longArray64 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray63, longArray64);
        long[] longArray66 = new long[] {};
        long[] longArray67 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray66, longArray67);
        org.junit.Assert.assertArrayEquals(longArray63, longArray66);
        long[] longArray70 = new long[] {};
        long[] longArray71 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray70, longArray71);
        org.junit.Assert.assertArrayEquals("hi!", longArray66, longArray71);
        long[] longArray75 = new long[] {};
        long[] longArray76 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray75, longArray76);
        long[] longArray78 = new long[] {};
        long[] longArray79 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray78, longArray79);
        org.junit.Assert.assertArrayEquals(longArray75, longArray78);
        long[] longArray82 = new long[] {};
        long[] longArray83 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray82, longArray83);
        org.junit.Assert.assertArrayEquals("hi!", longArray78, longArray83);
        org.junit.Assert.assertArrayEquals(longArray71, longArray83);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray58, longArray71);
        long[] longArray88 = new long[] {};
        long[] longArray89 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray88, longArray89);
        org.junit.Assert.assertArrayEquals(longArray58, longArray89);
        org.junit.Assert.assertArrayEquals("hi!", longArray45, longArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) "hi!");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) 10, (float) 1, (float) (short) -1);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray1, longArray2);
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray4, longArray5);
        org.junit.Assert.assertArrayEquals(longArray1, longArray4);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray9, longArray10);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray12, longArray13);
        org.junit.Assert.assertArrayEquals(longArray9, longArray12);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray16, longArray17);
        org.junit.Assert.assertArrayEquals("hi!", longArray12, longArray17);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray21, longArray22);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray24, longArray25);
        org.junit.Assert.assertArrayEquals(longArray21, longArray24);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray28, longArray29);
        org.junit.Assert.assertArrayEquals("hi!", longArray24, longArray29);
        org.junit.Assert.assertArrayEquals(longArray17, longArray29);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray4, longArray17);
        long[] longArray34 = new long[] {};
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray34, longArray35);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray37, longArray38);
        org.junit.Assert.assertArrayEquals(longArray35, longArray38);
        org.junit.Assert.assertArrayEquals(longArray4, longArray35);
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[] strArray53 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[][] strArray54 = new java.lang.String[][] { strArray44, strArray47, strArray50, strArray53 };
        java.lang.String[][][] strArray55 = new java.lang.String[][][] { strArray54 };
        java.lang.String[] strArray58 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[] strArray61 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[] strArray64 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[] strArray67 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[][] strArray68 = new java.lang.String[][] { strArray58, strArray61, strArray64, strArray67 };
        java.lang.String[][][] strArray69 = new java.lang.String[][][] { strArray68 };
        java.lang.String[] strArray72 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[] strArray75 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[] strArray78 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[] strArray81 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[][] strArray82 = new java.lang.String[][] { strArray72, strArray75, strArray78, strArray81 };
        java.lang.String[][][] strArray83 = new java.lang.String[][][] { strArray82 };
        java.lang.String[][][][] strArray84 = new java.lang.String[][][][] { strArray55, strArray69, strArray83 };
        java.util.Set<java.lang.String[][][]> strArraySet85 = org.apache.lucene.util.LuceneTestCase.asSet(strArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) longArray4, (java.lang.Object) strArraySet85);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (byte) 0, (double) 0);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 4, (long) (byte) 0);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) '4');
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (-1), (double) 0.0f);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 10L, (double) 3);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray8);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray8, (java.lang.Object) 1.0d);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray17);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray17, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray23);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray34);
        java.lang.String[] strArray37 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet38 = org.apache.lucene.util.LuceneTestCase.asSet(strArray37);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray34, (java.lang.Object[]) strArray37);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray42);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray42, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray37, (java.lang.Object[]) strArray42);
        java.lang.String[] strArray52 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray52);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet56 = org.apache.lucene.util.LuceneTestCase.asSet(strArray55);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray52, (java.lang.Object[]) strArray55);
        java.lang.String[] strArray60 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet61 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray60);
        java.lang.String[] strArray63 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet64 = org.apache.lucene.util.LuceneTestCase.asSet(strArray63);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray60, (java.lang.Object[]) strArray63);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray55, (java.lang.Object[]) strArray60);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray37, (java.lang.Object[]) strArray55);
        java.lang.String[] strArray70 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet71 = org.apache.lucene.util.LuceneTestCase.asSet(strArray70);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray70);
        java.lang.String[] strArray73 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet74 = org.apache.lucene.util.LuceneTestCase.asSet(strArray73);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray70, (java.lang.Object[]) strArray73);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray37, (java.lang.Object[]) strArray73);
        java.lang.String[] strArray77 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet78 = org.apache.lucene.util.LuceneTestCase.asSet(strArray77);
        java.util.Set<java.lang.String> strSet79 = org.apache.lucene.util.LuceneTestCase.asSet(strArray77);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray37, (java.lang.Object[]) strArray77);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) strArray20);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray7);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray7, (java.lang.Object[]) strArray10);
        java.lang.Object[] objArray14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) strArray10, objArray14);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) (short) 1);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 0.0f, (double) 6);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("", indexReader7, (int) (byte) 1, postingsEnum9, postingsEnum10);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, false);
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.nightly", (int) (byte) 100, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (-1), (double) 100L, (double) 'a');
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum8, postingsEnum9, true);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests13.ruleChain;
        commonGramsTokenFilterFactoryTests13.setUp();
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests13.ruleChain;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests13.assertFieldsEquals("tests.maxfailures", indexReader18, fields19, fields20, false);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsEnumEquals("hi!", postingsEnum24, postingsEnum25, false);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) false);
        double[] doubleArray35 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray42 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray42, (double) 100.0f);
        double[] doubleArray51 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray58 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray58, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray51, (double) 4);
        double[] doubleArray69 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray76 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray69, doubleArray76, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray69, (double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (byte) 0);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray7);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray14);
        org.junit.Assert.assertArrayEquals("", shortArray7, shortArray11);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray23);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray27);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray30);
        org.junit.Assert.assertArrayEquals("", shortArray23, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray23);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray36);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray36);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) shortArray36);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule47 = commonGramsTokenFilterFactoryTests46.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests46, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests46.setUp();
        java.lang.String[] strArray51 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests46, (java.lang.Object) strSet52);
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsEnumEquals("", postingsEnum55, postingsEnum56, false);
        org.elasticsearch.common.settings.Settings.Builder builder59 = commonGramsTokenFilterFactoryTests46.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests46.tearDown();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsSkippingEquals("tests.badapples", indexReader62, 6, postingsEnum64, postingsEnum65, false);
        commonGramsTokenFilterFactoryTests46.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray36, (java.lang.Object) commonGramsTokenFilterFactoryTests46);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) 10);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        double[] doubleArray1 = null;
        double[] doubleArray9 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray16 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray16, (double) 100.0f);
        double[] doubleArray25 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray32 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray32, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray25, (double) 4);
        double[] doubleArray44 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray51 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray51, (double) 100.0f);
        double[] doubleArray60 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray67 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray67, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray60, (double) 4);
        double[] doubleArray78 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray85 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray78, doubleArray85, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray60, doubleArray78, 1.0d);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray25, doubleArray60, 0.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", doubleArray1, doubleArray60, 0.0d);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 100, (double) 10.0f);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
        int[] intArray8 = new int[] { 0, 1, '4', (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray8);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.awaitsfix", false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 'a', 1.0d);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) -1, (double) '#', (double) 'a');
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("enwiki.random.lines.txt", true);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.slow", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.badapples", indexReader11, terms12, terms13, true);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader7, 1, postingsEnum9, postingsEnum10);
        commonGramsTokenFilterFactoryTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) (byte) 100, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.nightly", indexReader14, fields15, fields16, true);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests7.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests7, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests7.setUp();
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests7, (java.lang.Object) strSet13);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "enwiki.random.lines.txt");
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(4);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests19.ruleChain;
        commonGramsTokenFilterFactoryTests19.setUp();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests19.ruleChain;
        commonGramsTokenFilterFactoryTests19.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests19.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests19.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) '4');
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.badapples", postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("", indexReader12, (int) (short) 1, postingsEnum14, postingsEnum15);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (long) ' ', (long) ' ');
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4, true);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader8, 3, postingsEnum10, postingsEnum11, true);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        java.lang.Class<?> wildcardClass16 = commonGramsTokenFilterFactoryTests1.getClass();
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray27);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray23, byteArray27);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray31);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray38);
        org.junit.Assert.assertArrayEquals("", byteArray35, byteArray37);
        long[] longArray41 = new long[] {};
        long[] longArray42 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray41, longArray42);
        long[] longArray44 = new long[] {};
        long[] longArray45 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray44, longArray45);
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray47, longArray48);
        org.junit.Assert.assertArrayEquals(longArray44, longArray47);
        org.junit.Assert.assertArrayEquals(longArray41, longArray47);
        byte[] byteArray52 = new byte[] {};
        byte[] byteArray53 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray52, byteArray53);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray47, (java.lang.Object) byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray52);
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray59, byteArray60);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray63);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray59, byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray63);
        org.junit.Assert.assertArrayEquals("hi!", byteArray23, byteArray63);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray18, byteArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass16, (java.lang.Object) byteArray63);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) (-1L), 0.0d);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray1, longArray2);
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray4, longArray5);
        org.junit.Assert.assertArrayEquals(longArray1, longArray4);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray9, longArray10);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray12, longArray13);
        org.junit.Assert.assertArrayEquals(longArray9, longArray12);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray16, longArray17);
        org.junit.Assert.assertArrayEquals("hi!", longArray12, longArray17);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray21, longArray22);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray24, longArray25);
        org.junit.Assert.assertArrayEquals(longArray21, longArray24);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray28, longArray29);
        org.junit.Assert.assertArrayEquals("hi!", longArray24, longArray29);
        org.junit.Assert.assertArrayEquals(longArray17, longArray29);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray4, longArray17);
        long[] longArray38 = new long[] { (byte) 10, 100, 3, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray17, longArray38);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (short) 100, 10L);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        short[] shortArray1 = new short[] { (byte) 0 };
        short[] shortArray3 = new short[] { (byte) 0 };
        short[] shortArray5 = new short[] { (byte) 0 };
        short[] shortArray7 = new short[] { (byte) 0 };
        short[] shortArray9 = new short[] { (byte) 0 };
        short[][] shortArray10 = new short[][] { shortArray1, shortArray3, shortArray5, shortArray7, shortArray9 };
        short[] shortArray12 = new short[] { (byte) 0 };
        short[] shortArray14 = new short[] { (byte) 0 };
        short[] shortArray16 = new short[] { (byte) 0 };
        short[] shortArray18 = new short[] { (byte) 0 };
        short[] shortArray20 = new short[] { (byte) 0 };
        short[][] shortArray21 = new short[][] { shortArray12, shortArray14, shortArray16, shortArray18, shortArray20 };
        short[] shortArray23 = new short[] { (byte) 0 };
        short[] shortArray25 = new short[] { (byte) 0 };
        short[] shortArray27 = new short[] { (byte) 0 };
        short[] shortArray29 = new short[] { (byte) 0 };
        short[] shortArray31 = new short[] { (byte) 0 };
        short[][] shortArray32 = new short[][] { shortArray23, shortArray25, shortArray27, shortArray29, shortArray31 };
        short[][][] shortArray33 = new short[][][] { shortArray10, shortArray21, shortArray32 };
        java.util.Set<short[][]> shortArraySet34 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray33);
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray36 = new org.apache.lucene.util.LuceneTestCase[][] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet37 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray36);
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet38 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray36);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray44);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray41, (java.lang.Object[]) strArray44);
        java.lang.String[] strArray50 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray50);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet56 = org.apache.lucene.util.LuceneTestCase.asSet(strArray55);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray55);
        java.lang.String[] strArray58 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet59 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray55, (java.lang.Object[]) strArray58);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray50, (java.lang.Object[]) strArray58);
        java.lang.String[] strArray64 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet65 = org.apache.lucene.util.LuceneTestCase.asSet(strArray64);
        java.util.Set<java.lang.String> strSet66 = org.apache.lucene.util.LuceneTestCase.asSet(strArray64);
        java.lang.String[] strArray68 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet69 = org.apache.lucene.util.LuceneTestCase.asSet(strArray68);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray68);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray64, (java.lang.Object[]) strArray68);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray68, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray58, (java.lang.Object[]) strArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray44, (java.lang.Object[]) strArray58);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) strArray58);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) luceneTestCaseArray36, (java.lang.Object[]) strArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) shortArray33, (java.lang.Object[]) strArray58);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) (byte) -1);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        short[] shortArray7 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray13 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray19 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[][] shortArray20 = new short[][] { shortArray7, shortArray13, shortArray19 };
        java.util.Set<short[]> shortArraySet21 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray20);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests22.ruleChain;
        commonGramsTokenFilterFactoryTests22.setUp();
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests22.ruleChain;
        commonGramsTokenFilterFactoryTests22.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests22.assertDocsSkippingEquals("", indexReader28, (int) (byte) 0, postingsEnum30, postingsEnum31, true);
        commonGramsTokenFilterFactoryTests22.restoreIndexWriterMaxDocs();
        java.lang.String str35 = commonGramsTokenFilterFactoryTests22.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests22.assertDocsEnumEquals("tests.maxfailures", postingsEnum37, postingsEnum38, true);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) shortArray20, (java.lang.Object) "tests.maxfailures");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule43 = commonGramsTokenFilterFactoryTests42.ruleChain;
        commonGramsTokenFilterFactoryTests42.setUp();
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests42.ruleChain;
        commonGramsTokenFilterFactoryTests42.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule47 = commonGramsTokenFilterFactoryTests42.ruleChain;
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests42.assertPositionsSkippingEquals("tests.badapples", indexReader49, (int) (byte) -1, postingsEnum51, postingsEnum52);
        org.elasticsearch.common.settings.Settings.Builder builder54 = commonGramsTokenFilterFactoryTests42.newAnalysisSettingsBuilder();
        java.lang.String[] strArray59 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet60 = org.apache.lucene.util.LuceneTestCase.asSet(strArray59);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray59);
        java.lang.String[] strArray62 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArray62);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray59, (java.lang.Object[]) strArray62);
        java.lang.String[] strArray67 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet68 = org.apache.lucene.util.LuceneTestCase.asSet(strArray67);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray67);
        java.lang.String[] strArray70 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet71 = org.apache.lucene.util.LuceneTestCase.asSet(strArray70);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray67, (java.lang.Object[]) strArray70);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray62, (java.lang.Object[]) strArray67);
        java.lang.String[] strArray76 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet77 = org.apache.lucene.util.LuceneTestCase.asSet(strArray76);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray76);
        java.lang.String[] strArray81 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet82 = org.apache.lucene.util.LuceneTestCase.asSet(strArray81);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray81);
        java.lang.String[] strArray84 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet85 = org.apache.lucene.util.LuceneTestCase.asSet(strArray84);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray81, (java.lang.Object[]) strArray84);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray76, (java.lang.Object[]) strArray84);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray62, (java.lang.Object[]) strArray84);
        org.junit.Assert.assertNotSame((java.lang.Object) builder54, (java.lang.Object) strArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) shortArray20, (java.lang.Object[]) strArray84);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests4.setUp();
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) strSet10);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("", postingsEnum13, postingsEnum14, false);
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests19.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("tests.failfast", indexReader26, fields27, fields28, true);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("", indexReader32, (int) (byte) 100, postingsEnum34, postingsEnum35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray1, annotatedElementArray2, annotatedElementArray3 };
        java.util.Set<java.lang.reflect.AnnotatedElement[][]> annotatedElementArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray4);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray10);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray10, (java.lang.Object[]) strArray13);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray18);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray18, (java.lang.Object[]) strArray21);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray18);
        java.lang.String[] strArray28 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray28);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray28, (java.lang.Object[]) strArray31);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray36);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray36, (java.lang.Object[]) strArray39);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray31, (java.lang.Object[]) strArray36);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) annotatedElementArray4, (java.lang.Object[]) strArray31);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.nightly", false);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 1.0d, (double) (short) -1);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', 10.0d);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals("", charArray3, charArray6);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray6, charArray10);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        org.junit.Assert.assertArrayEquals("", charArray15, charArray18);
        org.junit.Assert.assertArrayEquals(charArray10, charArray18);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals("", charArray24, charArray27);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        org.junit.Assert.assertArrayEquals("", charArray34, charArray37);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray37, charArray42);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        org.junit.Assert.assertArrayEquals("", charArray46, charArray49);
        org.junit.Assert.assertArrayEquals(charArray42, charArray49);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        org.junit.Assert.assertArrayEquals("", charArray55, charArray58);
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray62, charArray63);
        org.junit.Assert.assertArrayEquals(charArray58, charArray62);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray67, charArray68);
        char[] charArray70 = new char[] {};
        char[] charArray71 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray70, charArray71);
        org.junit.Assert.assertArrayEquals("", charArray67, charArray70);
        org.junit.Assert.assertArrayEquals(charArray58, charArray70);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray49, charArray58);
        org.junit.Assert.assertArrayEquals(charArray24, charArray58);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray18, charArray58);
        char[] charArray78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray58, charArray78);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) 6, (long) 100);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.slow", true);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
        org.junit.Assert.assertArrayEquals(longArray2, longArray5);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray10, longArray11);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray13, longArray14);
        org.junit.Assert.assertArrayEquals(longArray10, longArray13);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray17, longArray18);
        org.junit.Assert.assertArrayEquals("hi!", longArray13, longArray18);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray22, longArray23);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray25, longArray26);
        org.junit.Assert.assertArrayEquals(longArray22, longArray25);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray29, longArray30);
        org.junit.Assert.assertArrayEquals("hi!", longArray25, longArray30);
        org.junit.Assert.assertArrayEquals(longArray18, longArray30);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray5, longArray18);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray37, longArray38);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray40, longArray41);
        org.junit.Assert.assertArrayEquals(longArray37, longArray40);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray45, longArray46);
        long[] longArray48 = new long[] {};
        long[] longArray49 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray48, longArray49);
        org.junit.Assert.assertArrayEquals(longArray45, longArray48);
        long[] longArray52 = new long[] {};
        long[] longArray53 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray52, longArray53);
        org.junit.Assert.assertArrayEquals("hi!", longArray48, longArray53);
        long[] longArray57 = new long[] {};
        long[] longArray58 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray57, longArray58);
        long[] longArray60 = new long[] {};
        long[] longArray61 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray60, longArray61);
        org.junit.Assert.assertArrayEquals(longArray57, longArray60);
        long[] longArray64 = new long[] {};
        long[] longArray65 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray64, longArray65);
        org.junit.Assert.assertArrayEquals("hi!", longArray60, longArray65);
        org.junit.Assert.assertArrayEquals(longArray53, longArray65);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray40, longArray53);
        long[] longArray70 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray40, longArray70);
        org.junit.Assert.assertArrayEquals("hi!", longArray5, longArray40);
        long[] longArray73 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray40, longArray73);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 10L, (double) '4');
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0f, 10.0f, (float) 6);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) (byte) 100, postingsEnum10, postingsEnum11);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder14 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule18);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests7.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests7, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests7.setUp();
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests7, (java.lang.Object) strSet13);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "enwiki.random.lines.txt");
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader18, terms19, terms20, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests23.ruleChain;
        commonGramsTokenFilterFactoryTests23.setUp();
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests23.ruleChain;
        commonGramsTokenFilterFactoryTests23.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests23.overrideTestDefaultQueryCache();
        java.lang.String str29 = commonGramsTokenFilterFactoryTests23.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests23.assertDocsEnumEquals("tests.badapples", postingsEnum31, postingsEnum32, true);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        commonGramsTokenFilterFactoryTests23.assertTermsEquals("tests.monster", indexReader36, terms37, terms38, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexReader18, (java.lang.Object) true);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray6);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray3, (java.lang.Object[]) strArray6);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray12);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray17);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray17, (java.lang.Object[]) strArray20);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray12, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        java.util.Set<java.lang.String> strSet28 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray30);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray26, (java.lang.Object[]) strArray30);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray30, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) strArray20);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) strArray20);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray45);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray41, (java.lang.Object[]) strArray45);
        java.lang.String[] strArray51 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray51);
        java.lang.String[] strArray54 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet55 = org.apache.lucene.util.LuceneTestCase.asSet(strArray54);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray51, (java.lang.Object[]) strArray54);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) strArray45, (java.lang.Object[]) strArray51);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray51);
        java.lang.String[] strArray61 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet62 = org.apache.lucene.util.LuceneTestCase.asSet(strArray61);
        java.lang.String[] strArray64 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet65 = org.apache.lucene.util.LuceneTestCase.asSet(strArray64);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray64);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray61, (java.lang.Object[]) strArray64);
        java.lang.String[] strArray69 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet70 = org.apache.lucene.util.LuceneTestCase.asSet(strArray69);
        java.util.Set<java.lang.String> strSet71 = org.apache.lucene.util.LuceneTestCase.asSet(strArray69);
        java.lang.String[] strArray73 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet74 = org.apache.lucene.util.LuceneTestCase.asSet(strArray73);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray73);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray69, (java.lang.Object[]) strArray73);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray61, (java.lang.Object[]) strArray73);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray51, (java.lang.Object[]) strArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArray51);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        char[] charArray5 = new char[] { '#', 'a', '#', ' ' };
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        org.junit.Assert.assertArrayEquals("", charArray9, charArray12);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray12, charArray17);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals("", charArray21, charArray24);
        org.junit.Assert.assertArrayEquals(charArray17, charArray24);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals("", charArray31, charArray34);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray34, charArray39);
        org.junit.Assert.assertArrayEquals(charArray17, charArray34);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals("", charArray44, charArray47);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        org.junit.Assert.assertArrayEquals(charArray47, charArray51);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        org.junit.Assert.assertArrayEquals("", charArray56, charArray59);
        org.junit.Assert.assertArrayEquals(charArray47, charArray59);
        org.junit.Assert.assertArrayEquals("", charArray34, charArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray5, charArray47);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader9, (int) (byte) 100, postingsEnum11, postingsEnum12);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.maxfailures", indexReader16, 2, postingsEnum18, postingsEnum19, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests1.ruleChain;
        java.lang.Object obj24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, obj24);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        commonGramsTokenFilterFactoryTests3.setUp();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray10);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray7, (java.lang.Object[]) strArray10);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) strArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, strArray7);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader6, 1, postingsEnum8, postingsEnum9);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader12, 5, postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests5.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsEnumEquals("hi!", postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader13, (int) (byte) 100, postingsEnum15, postingsEnum16);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests5.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests5, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("<unknown>", indexReader22, 6, postingsEnum24, postingsEnum25);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests5);
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests5.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests5);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) (byte) 100, postingsEnum8, postingsEnum9);
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsEnumEquals("tests.failfast", postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader19, 3, postingsEnum21, postingsEnum22, true);
        commonGramsTokenFilterFactoryTests12.tearDown();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests12);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) testRule11, (java.lang.Object) commonGramsTokenFilterFactoryTests12);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsEnumEquals("", postingsEnum29, postingsEnum30, false);
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests12.assertDocsAndPositionsEnumEquals("hi!", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) 3);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests5.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsEnumEquals("hi!", postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader13, (int) (byte) 100, postingsEnum15, postingsEnum16);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests5.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests5, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("<unknown>", indexReader22, 6, postingsEnum24, postingsEnum25);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests5);
        commonGramsTokenFilterFactoryTests5.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests5);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) 10);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4, true);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader8, 3, postingsEnum10, postingsEnum11, true);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1.0d));
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum19, postingsEnum20, true);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("random", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray8);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray11);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray16);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray19);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray11, (java.lang.Object[]) strArray16);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray25);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray30);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray30, (java.lang.Object[]) strArray33);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray25, (java.lang.Object[]) strArray33);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray11, (java.lang.Object[]) strArray33);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.failfast", (java.lang.Object) strArray11);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray11);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray45);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray41, (java.lang.Object[]) strArray45);
        java.lang.String[] strArray50 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        java.lang.String[] strArray54 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet55 = org.apache.lucene.util.LuceneTestCase.asSet(strArray54);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray54);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray50, (java.lang.Object[]) strArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray41, (java.lang.Object[]) strArray54);
        java.lang.String[] strArray59 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet60 = org.apache.lucene.util.LuceneTestCase.asSet(strArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray54, (java.lang.Object[]) strArray59);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) strArray11, (java.lang.Object[]) strArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", objArray1, (java.lang.Object[]) strArray54);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', 0.0d, (double) (short) -1);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100, (float) 2, (float) 0L);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 3, (double) 100.0f, (double) 0L);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals("", charArray3, charArray6);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals("", charArray10, charArray13);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        org.junit.Assert.assertArrayEquals(charArray13, charArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) charArray6, (java.lang.Object) charArray17);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0f, 1.0f, (float) (byte) 0);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray6);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray9);
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray14);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray14);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray14, (java.lang.Object[]) strArray17);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray9, (java.lang.Object[]) strArray14);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray28);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray28, (java.lang.Object[]) strArray31);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray23, (java.lang.Object[]) strArray31);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray9, (java.lang.Object[]) strArray31);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.failfast", (java.lang.Object) strArray9);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray9);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray43);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray39, (java.lang.Object[]) strArray43);
        java.lang.String[] strArray48 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet49 = org.apache.lucene.util.LuceneTestCase.asSet(strArray48);
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray48);
        java.lang.String[] strArray52 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray52);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray48, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray39, (java.lang.Object[]) strArray52);
        java.lang.String[] strArray57 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet58 = org.apache.lucene.util.LuceneTestCase.asSet(strArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray52, (java.lang.Object[]) strArray57);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) strArray9, (java.lang.Object[]) strArray52);
        short[] shortArray66 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray72 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray78 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[][] shortArray79 = new short[][] { shortArray66, shortArray72, shortArray78 };
        java.util.Set<short[]> shortArraySet80 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray79);
        java.util.Set<short[]> shortArraySet81 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray79);
        java.util.Set<short[]> shortArraySet82 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray52, (java.lang.Object[]) shortArray79);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs(2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests12.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests12, (java.lang.Object) (-1L));
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests18.setUp();
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) strSet24);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests12, (java.lang.Object) "enwiki.random.lines.txt");
        commonGramsTokenFilterFactoryTests12.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests12.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) testRule28);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("europarl.lines.txt.gz", false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) (short) 1, (double) 3);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) 5, (float) (short) -1, (float) 4);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (-1), (long) 2);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, 0.0d, (double) (-1L));
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) ' ');
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
        double[] doubleArray1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("hi!", postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) 100, postingsEnum14, postingsEnum15);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("<unknown>", indexReader21, 6, postingsEnum23, postingsEnum24);
        double[] doubleArray32 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray39 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray39, (double) 100.0f);
        double[] doubleArray48 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray55 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray55, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray48, (double) 4);
        double[] doubleArray66 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray73 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray73, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray66, (double) (byte) 0);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) doubleArray66);
        double[] doubleArray85 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray92 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray85, doubleArray92, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray66, doubleArray85, 100.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray1, doubleArray66, (double) 100.0f);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader9, (int) (byte) 100, postingsEnum11, postingsEnum12);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("<unknown>", indexReader18, 6, postingsEnum20, postingsEnum21);
        java.lang.String str23 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.maxfailures", 4, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader9, 3, postingsEnum11, postingsEnum12, true);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1.0d));
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum20, postingsEnum21, false);
        java.lang.String str24 = commonGramsTokenFilterFactoryTests2.getTestName();
        commonGramsTokenFilterFactoryTests2.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        float[] floatArray1 = null;
        float[] floatArray4 = new float[] { (short) 1 };
        float[] floatArray6 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray6, (float) '#');
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests9.ruleChain;
        commonGramsTokenFilterFactoryTests9.setUp();
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests9.ruleChain;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        commonGramsTokenFilterFactoryTests9.assertFieldsEquals("tests.maxfailures", indexReader14, fields15, fields16, false);
        commonGramsTokenFilterFactoryTests9.tearDown();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) floatArray6, (java.lang.Object) commonGramsTokenFilterFactoryTests9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray1, floatArray6, (float) 0L);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals("", charArray1, charArray4);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        org.junit.Assert.assertArrayEquals("", charArray11, charArray14);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray14, charArray18);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals("", charArray23, charArray26);
        org.junit.Assert.assertArrayEquals(charArray18, charArray26);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        org.junit.Assert.assertArrayEquals("", charArray32, charArray35);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals("", charArray42, charArray45);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray45, charArray50);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals("", charArray54, charArray57);
        org.junit.Assert.assertArrayEquals(charArray50, charArray57);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        org.junit.Assert.assertArrayEquals("", charArray63, charArray66);
        char[] charArray70 = new char[] {};
        char[] charArray71 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray70, charArray71);
        org.junit.Assert.assertArrayEquals(charArray66, charArray70);
        char[] charArray75 = new char[] {};
        char[] charArray76 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray75, charArray76);
        char[] charArray78 = new char[] {};
        char[] charArray79 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray78, charArray79);
        org.junit.Assert.assertArrayEquals("", charArray75, charArray78);
        org.junit.Assert.assertArrayEquals(charArray66, charArray78);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray57, charArray66);
        org.junit.Assert.assertArrayEquals(charArray32, charArray66);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray26, charArray66);
        org.junit.Assert.assertArrayEquals(charArray4, charArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray4);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.maxfailures", indexReader6, fields7, fields8, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        java.lang.String str12 = commonGramsTokenFilterFactoryTests1.getTestName();
        java.lang.String str13 = commonGramsTokenFilterFactoryTests1.getTestName();
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals("", byteArray16, byteArray20);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray25, byteArray29);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray36);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray39);
        org.junit.Assert.assertArrayEquals("", byteArray36, byteArray38);
        long[] longArray42 = new long[] {};
        long[] longArray43 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray42, longArray43);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray45, longArray46);
        long[] longArray48 = new long[] {};
        long[] longArray49 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray48, longArray49);
        org.junit.Assert.assertArrayEquals(longArray45, longArray48);
        org.junit.Assert.assertArrayEquals(longArray42, longArray48);
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray54);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray48, (java.lang.Object) byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray53);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray33, byteArray36);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray25, byteArray33);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray20, byteArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) byteArray20);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray8);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray8, (java.lang.Object) 1.0d);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray17);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray17, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray23);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray20);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray8);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray34);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray30, (java.lang.Object[]) strArray34);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray43);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray39, (java.lang.Object[]) strArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray30, (java.lang.Object[]) strArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray8, (java.lang.Object[]) strArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) strArray8);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 6, (long) (byte) 100);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader9, (int) (byte) 100, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.nightly", indexReader15, fields16, fields17, true);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum23, postingsEnum24, false);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.failfast", indexReader28, fields29, fields30, false);
        java.lang.String str33 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests36.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests36, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests36.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests36);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsSkippingEquals("tests.maxfailures", indexReader43, (int) (byte) 1, postingsEnum45, postingsEnum46, true);
        commonGramsTokenFilterFactoryTests36.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests36);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.maxfailures", indexReader6, fields7, fields8, false);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.weekly", indexReader13, 4, postingsEnum15, postingsEnum16);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests1.ruleChain;
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray22, longArray23);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray25, longArray26);
        org.junit.Assert.assertArrayEquals(longArray22, longArray25);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray30, longArray31);
        long[] longArray33 = new long[] {};
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray33, longArray34);
        org.junit.Assert.assertArrayEquals(longArray30, longArray33);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray37, longArray38);
        org.junit.Assert.assertArrayEquals("hi!", longArray33, longArray38);
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray43, longArray44);
        long[] longArray46 = new long[] {};
        long[] longArray47 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray46, longArray47);
        org.junit.Assert.assertArrayEquals(longArray43, longArray46);
        long[] longArray50 = new long[] {};
        long[] longArray51 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray50, longArray51);
        org.junit.Assert.assertArrayEquals("hi!", longArray46, longArray51);
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray55, longArray56);
        long[] longArray58 = new long[] {};
        long[] longArray59 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray58, longArray59);
        org.junit.Assert.assertArrayEquals(longArray55, longArray58);
        long[] longArray62 = new long[] {};
        long[] longArray63 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray62, longArray63);
        org.junit.Assert.assertArrayEquals("hi!", longArray58, longArray63);
        org.junit.Assert.assertArrayEquals(longArray51, longArray63);
        long[] longArray68 = new long[] {};
        long[] longArray69 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray68, longArray69);
        long[] longArray71 = new long[] {};
        long[] longArray72 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray71, longArray72);
        org.junit.Assert.assertArrayEquals(longArray68, longArray71);
        long[] longArray75 = new long[] {};
        long[] longArray76 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray75, longArray76);
        org.junit.Assert.assertArrayEquals("hi!", longArray71, longArray76);
        org.junit.Assert.assertArrayEquals("", longArray51, longArray71);
        org.junit.Assert.assertArrayEquals(longArray33, longArray71);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray25, longArray71);
        float[] floatArray87 = new float[] { 6, 0L, 'a', 10, 'a' };
        float[] floatArray93 = new float[] { 6, 0L, 'a', 10, 'a' };
        float[][] floatArray94 = new float[][] { floatArray87, floatArray93 };
        java.util.Set<float[]> floatArraySet95 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray94);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) longArray71, (java.lang.Object) floatArray94);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) testRule19, (java.lang.Object) longArray71);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) (byte) 100, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.nightly", indexReader14, fields15, fields16, true);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum22, postingsEnum23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.failfast", indexReader27, fields28, fields29, false);
        java.lang.String str32 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet2 = org.apache.lucene.util.LuceneTestCase.asSet(strArray1);
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray1);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray5);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray1, (java.lang.Object[]) strArray5);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray14);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray14);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray10, (java.lang.Object[]) strArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) strArray14);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray14, (java.lang.Object[]) strArray19);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray24);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray29);
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray32);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray24);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray42);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray39, (java.lang.Object[]) strArray42);
        java.util.Set<java.io.Serializable> serializableSet46 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray39);
        java.lang.String[] strArray48 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet49 = org.apache.lucene.util.LuceneTestCase.asSet(strArray48);
        java.lang.String[] strArray51 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray51);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray48, (java.lang.Object[]) strArray51);
        java.util.Set<java.io.Serializable> serializableSet55 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray48);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray39, (java.lang.Object[]) strArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray48);
        long[] longArray59 = new long[] {};
        long[] longArray60 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray59, longArray60);
        long[] longArray62 = new long[] {};
        long[] longArray63 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray62, longArray63);
        long[] longArray65 = new long[] {};
        long[] longArray66 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray65, longArray66);
        org.junit.Assert.assertArrayEquals(longArray62, longArray65);
        org.junit.Assert.assertArrayEquals(longArray59, longArray65);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray70, byteArray71);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray65, (java.lang.Object) byteArray70);
        java.lang.String[] strArray76 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet77 = org.apache.lucene.util.LuceneTestCase.asSet(strArray76);
        java.lang.String[] strArray79 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet80 = org.apache.lucene.util.LuceneTestCase.asSet(strArray79);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray79);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray76, (java.lang.Object[]) strArray79);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests84 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule85 = commonGramsTokenFilterFactoryTests84.ruleChain;
        commonGramsTokenFilterFactoryTests84.setUp();
        java.lang.String[] strArray88 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet89 = org.apache.lucene.util.LuceneTestCase.asSet(strArray88);
        java.lang.String[] strArray91 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet92 = org.apache.lucene.util.LuceneTestCase.asSet(strArray91);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray91);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray88, (java.lang.Object[]) strArray91);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests84, (java.lang.Object) strArray88);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray79, (java.lang.Object[]) strArray88);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) byteArray70, (java.lang.Object) "random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) strArray48, (java.lang.Object) "random");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) 100L);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) strSet8);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("", postingsEnum11, postingsEnum12, false);
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.nightly", indexReader17, (int) (byte) 100, postingsEnum19, postingsEnum20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum19);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray6);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray2, (java.lang.Object) (short) 10);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests13.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests13.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests13.assertPositionsSkippingEquals("", indexReader19, (int) (byte) 1, postingsEnum21, postingsEnum22);
        java.lang.Class<?> wildcardClass24 = commonGramsTokenFilterFactoryTests13.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests25.ruleChain;
        commonGramsTokenFilterFactoryTests25.setUp();
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests25.ruleChain;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("tests.maxfailures", indexReader30, fields31, fields32, false);
        java.lang.Class<?> wildcardClass35 = commonGramsTokenFilterFactoryTests25.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests37.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests37, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests37.setUp();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests37.assertPositionsSkippingEquals("", indexReader43, (int) (byte) 1, postingsEnum45, postingsEnum46);
        java.lang.Class<?> wildcardClass48 = commonGramsTokenFilterFactoryTests37.getClass();
        java.lang.String[] strArray51 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray51);
        java.lang.String[] strArray54 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet55 = org.apache.lucene.util.LuceneTestCase.asSet(strArray54);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray51, (java.lang.Object[]) strArray54);
        java.lang.Class<?> wildcardClass57 = strArray51.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray58 = new java.lang.reflect.GenericDeclaration[] { wildcardClass24, wildcardClass35, wildcardClass48, wildcardClass57 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet59 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray58);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests60 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule61 = commonGramsTokenFilterFactoryTests60.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests60.assertDocsEnumEquals("hi!", postingsEnum63, postingsEnum64, false);
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        commonGramsTokenFilterFactoryTests60.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader68, (int) (byte) 100, postingsEnum70, postingsEnum71);
        org.junit.rules.TestRule testRule73 = commonGramsTokenFilterFactoryTests60.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) genericDeclarationSet59, (java.lang.Object) commonGramsTokenFilterFactoryTests60);
        short[] shortArray80 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray86 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray92 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[][] shortArray93 = new short[][] { shortArray80, shortArray86, shortArray92 };
        java.util.Set<short[]> shortArraySet94 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray93);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests60, (java.lang.Object) shortArray93);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) strArray2, (java.lang.Object[]) shortArray93);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
        short[] shortArray1 = null;
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray8);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray15);
        org.junit.Assert.assertArrayEquals("", shortArray8, shortArray12);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray24);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray28);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray31);
        org.junit.Assert.assertArrayEquals("", shortArray24, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray24);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray40);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray12, shortArray37);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        java.lang.Object obj48 = null;
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) shortArray46, obj48);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray46);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray56);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray60);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray63);
        org.junit.Assert.assertArrayEquals("", shortArray56, shortArray60);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray1, shortArray67);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals("", byteArray2, byteArray6);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray11, byteArray15);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray22);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray25);
        org.junit.Assert.assertArrayEquals("", byteArray22, byteArray24);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray28, longArray29);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray31, longArray32);
        long[] longArray34 = new long[] {};
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray34, longArray35);
        org.junit.Assert.assertArrayEquals(longArray31, longArray34);
        org.junit.Assert.assertArrayEquals(longArray28, longArray34);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray40);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray34, (java.lang.Object) byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray39);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray19, byteArray22);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray11, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray6, byteArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) byteArray11, (java.lang.Object) (byte) 1);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) 'a', (long) (short) 1);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
        int[] intArray3 = new int[] { 5, (-1), (byte) 100 };
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        org.junit.Assert.assertArrayEquals(intArray8, intArray11);
        org.junit.Assert.assertArrayEquals("random", intArray6, intArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray8);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (byte) 0, (long) (byte) 1);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray1 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray2 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray3 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray4 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray5 = new org.apache.lucene.util.LuceneTestCase[][] { luceneTestCaseArray1, luceneTestCaseArray2, luceneTestCaseArray3, luceneTestCaseArray4 };
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray6 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray7 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray8 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray9 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray10 = new org.apache.lucene.util.LuceneTestCase[][] { luceneTestCaseArray6, luceneTestCaseArray7, luceneTestCaseArray8, luceneTestCaseArray9 };
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray11 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray12 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray13 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray14 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray15 = new org.apache.lucene.util.LuceneTestCase[][] { luceneTestCaseArray11, luceneTestCaseArray12, luceneTestCaseArray13, luceneTestCaseArray14 };
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray16 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray17 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray18 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray19 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray20 = new org.apache.lucene.util.LuceneTestCase[][] { luceneTestCaseArray16, luceneTestCaseArray17, luceneTestCaseArray18, luceneTestCaseArray19 };
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray21 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray22 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray23 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray24 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray25 = new org.apache.lucene.util.LuceneTestCase[][] { luceneTestCaseArray21, luceneTestCaseArray22, luceneTestCaseArray23, luceneTestCaseArray24 };
        org.apache.lucene.util.LuceneTestCase[][][] luceneTestCaseArray26 = new org.apache.lucene.util.LuceneTestCase[][][] { luceneTestCaseArray5, luceneTestCaseArray10, luceneTestCaseArray15, luceneTestCaseArray20, luceneTestCaseArray25 };
        java.util.Set<org.apache.lucene.util.LuceneTestCase[][]> luceneTestCaseArraySet27 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests28.ruleChain;
        commonGramsTokenFilterFactoryTests28.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        commonGramsTokenFilterFactoryTests28.assertTermsEquals("tests.slow", indexReader32, terms33, terms34, false);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        commonGramsTokenFilterFactoryTests28.assertTermsEquals("tests.badapples", indexReader38, terms39, terms40, true);
        commonGramsTokenFilterFactoryTests28.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) luceneTestCaseArraySet27, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), 1L);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1L, (float) 100L, (float) (short) 10);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) -1, (double) (short) 0, (double) 100L);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests3.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("tests.maxfailures", indexReader10, (int) (byte) 1, postingsEnum12, postingsEnum13, true);
        commonGramsTokenFilterFactoryTests3.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests17.assertDocsEnumEquals("tests.failfast", postingsEnum19, postingsEnum20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests17.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader24, 3, postingsEnum26, postingsEnum27, true);
        commonGramsTokenFilterFactoryTests17.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) commonGramsTokenFilterFactoryTests17);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1.0f), (double) (short) 1, (double) 100);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) '4');
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray1 = new org.apache.lucene.util.LuceneTestCase[][] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        commonGramsTokenFilterFactoryTests3.setUp();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("tests.maxfailures", indexReader8, fields9, fields10, false);
        java.lang.Class<?> wildcardClass13 = commonGramsTokenFilterFactoryTests3.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests15.ruleChain;
        commonGramsTokenFilterFactoryTests15.setUp();
        commonGramsTokenFilterFactoryTests15.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests15.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        java.lang.Class<?> wildcardClass21 = commonGramsTokenFilterFactoryTests15.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests22.ruleChain;
        commonGramsTokenFilterFactoryTests22.setUp();
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests22.ruleChain;
        commonGramsTokenFilterFactoryTests22.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests22.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests22.assertDocsEnumEquals("hi!", postingsEnum29, postingsEnum30, true);
        java.lang.Class<?> wildcardClass33 = commonGramsTokenFilterFactoryTests22.getClass();
        java.lang.reflect.Type[] typeArray34 = new java.lang.reflect.Type[] { wildcardClass13, wildcardClass21, wildcardClass33 };
        java.util.Set<java.lang.reflect.Type> typeSet35 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray34);
        org.junit.Assert.assertNotNull((java.lang.Object) typeArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) luceneTestCaseArray1, (java.lang.Object[]) typeArray34);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0.0f, (double) 5, (double) ' ');
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.failfast", postingsEnum5, postingsEnum6, false);
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        java.lang.String str11 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests12.ruleChain;
        commonGramsTokenFilterFactoryTests12.setUp();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests12.ruleChain;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests12.assertFieldsEquals("tests.maxfailures", indexReader17, fields18, fields19, false);
        commonGramsTokenFilterFactoryTests12.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests12.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests12.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) str11, (java.lang.Object) commonGramsTokenFilterFactoryTests12);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 3, (float) 0L, (float) (short) 0);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 4, 0.0d);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) (short) 100);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) 10L, (double) (short) 1);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 0);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet2 = org.apache.lucene.util.LuceneTestCase.asSet(strArray1);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.lang.Iterable[] iterableArray8 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray9 = (java.lang.Iterable<java.lang.String>[]) iterableArray8;
        strIterableArray9[0] = strSet2;
        strIterableArray9[1] = strSet4;
        strIterableArray9[2] = strSet6;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray9);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests18.setUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests18.assertPositionsSkippingEquals("", indexReader24, (int) (byte) 1, postingsEnum26, postingsEnum27);
        java.lang.Class<?> wildcardClass29 = commonGramsTokenFilterFactoryTests18.getClass();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) strIterableArray9, (java.lang.Object) wildcardClass29);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule33 = commonGramsTokenFilterFactoryTests32.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests32, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests32.setUp();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests32.assertPositionsSkippingEquals("", indexReader38, (int) (byte) 1, postingsEnum40, postingsEnum41);
        java.lang.Class<?> wildcardClass43 = commonGramsTokenFilterFactoryTests32.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests44 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests44.ruleChain;
        commonGramsTokenFilterFactoryTests44.setUp();
        org.junit.rules.TestRule testRule47 = commonGramsTokenFilterFactoryTests44.ruleChain;
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        commonGramsTokenFilterFactoryTests44.assertFieldsEquals("tests.maxfailures", indexReader49, fields50, fields51, false);
        java.lang.Class<?> wildcardClass54 = commonGramsTokenFilterFactoryTests44.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests56 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule57 = commonGramsTokenFilterFactoryTests56.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests56, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests56.setUp();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        commonGramsTokenFilterFactoryTests56.assertPositionsSkippingEquals("", indexReader62, (int) (byte) 1, postingsEnum64, postingsEnum65);
        java.lang.Class<?> wildcardClass67 = commonGramsTokenFilterFactoryTests56.getClass();
        java.lang.String[] strArray70 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet71 = org.apache.lucene.util.LuceneTestCase.asSet(strArray70);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray70);
        java.lang.String[] strArray73 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet74 = org.apache.lucene.util.LuceneTestCase.asSet(strArray73);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray70, (java.lang.Object[]) strArray73);
        java.lang.Class<?> wildcardClass76 = strArray70.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray77 = new java.lang.reflect.GenericDeclaration[] { wildcardClass43, wildcardClass54, wildcardClass67, wildcardClass76 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet78 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strIterableArray9, (java.lang.Object[]) genericDeclarationArray77);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) (short) 10);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
        double[] doubleArray7 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray14 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray14, (double) 100.0f);
        double[] doubleArray23 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray30 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray30, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray23, (double) 4);
        double[] doubleArray41 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray48 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray48, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray41, (double) (byte) 0);
        double[] doubleArray59 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray66 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray66, (double) 100.0f);
        double[] doubleArray75 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray82 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray75, doubleArray82, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray75, (double) 4);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray23, doubleArray59, (double) '4');
        double[] doubleArray89 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray89, (double) (-1.0f));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray8 = new java.io.Serializable[][] { serializableArray1, serializableArray3, serializableArray5, serializableArray7 };
        java.util.Set<java.io.Serializable[]> serializableArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.util.Set<java.io.Serializable[]> serializableArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) serializableArraySet10);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (float) 4, 0.0f, 0.0f);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests4.setUp();
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) strSet10);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("", postingsEnum13, postingsEnum14, false);
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests19.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests4);
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.slow", obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests4.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum31, postingsEnum32);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 100, (float) (-1), (float) 3);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", 0.0d, (-1.0d), (double) 1L);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals(intArray2, intArray5);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        org.junit.Assert.assertArrayEquals(intArray11, intArray14);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        org.junit.Assert.assertArrayEquals(intArray18, intArray21);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray11, intArray18);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        org.junit.Assert.assertArrayEquals(intArray27, intArray30);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        org.junit.Assert.assertArrayEquals(intArray35, intArray38);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray45, intArray46);
        org.junit.Assert.assertArrayEquals(intArray42, intArray45);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray38, intArray45);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray27, intArray38);
        org.junit.Assert.assertArrayEquals(intArray11, intArray27);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray56, intArray57);
        org.junit.Assert.assertArrayEquals(intArray53, intArray56);
        int[] intArray61 = new int[] {};
        int[] intArray62 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray61, intArray62);
        int[] intArray64 = new int[] {};
        int[] intArray65 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray64, intArray65);
        org.junit.Assert.assertArrayEquals(intArray61, intArray64);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray68, intArray69);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray71, intArray72);
        org.junit.Assert.assertArrayEquals(intArray68, intArray71);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray64, intArray71);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray53, intArray64);
        org.junit.Assert.assertArrayEquals(intArray11, intArray53);
        int[] intArray79 = new int[] {};
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray79, intArray80);
        int[] intArray82 = new int[] {};
        int[] intArray83 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray82, intArray83);
        org.junit.Assert.assertArrayEquals(intArray79, intArray82);
        int[] intArray86 = new int[] {};
        int[] intArray87 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray86, intArray87);
        int[] intArray89 = new int[] {};
        int[] intArray90 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray89, intArray90);
        org.junit.Assert.assertArrayEquals(intArray86, intArray89);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray82, intArray89);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray53, intArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray5, intArray53);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
        float[] floatArray2 = new float[] { (short) 1 };
        float[] floatArray4 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray4, (float) '#');
        float[] floatArray11 = new float[] { (short) 1 };
        float[] floatArray13 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray13, (float) '#');
        float[] floatArray17 = new float[] { (short) 1 };
        float[] floatArray19 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray19, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray13, floatArray17, (float) 100);
        float[] floatArray25 = new float[] { (short) 1 };
        float[] floatArray27 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray27, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray13, floatArray27, (float) 3);
        float[] floatArray33 = new float[] { (short) 1 };
        float[] floatArray35 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray35, (float) '#');
        org.junit.Assert.assertArrayEquals("", floatArray27, floatArray35, 100.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray2, floatArray35, (float) 0L);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) '4', 0.0f);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) strSet8);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("", postingsEnum11, postingsEnum12, false);
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests17.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests17, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests17.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests17);
        org.elasticsearch.common.settings.Settings.Builder builder23 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("tests.awaitsfix", (int) (short) 0, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 1, (double) (short) 100);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) 2);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        org.junit.Assert.assertArrayEquals(intArray0, intArray3);
        int[] intArray9 = new int[] { 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray9);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) 6, (float) (-1), (float) 2);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) 10, (double) (short) 100, (double) (short) 100);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 10L);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader9, 3, postingsEnum11, postingsEnum12, true);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests2.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocsAndPositionsEnumEquals("random", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("tests.failfast", postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader10, 3, postingsEnum12, postingsEnum13, true);
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests3.setUp();
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray29);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray25, (java.lang.Object[]) strArray29);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray29, (java.lang.Object) 1.0d);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray38);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray38, (java.lang.Object[]) strArray41);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray41, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray29);
        java.lang.String[] strArray51 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet56 = org.apache.lucene.util.LuceneTestCase.asSet(strArray55);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray55);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray51, (java.lang.Object[]) strArray55);
        java.lang.String[] strArray60 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet61 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        java.util.Set<java.lang.String> strSet62 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        java.lang.String[] strArray64 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet65 = org.apache.lucene.util.LuceneTestCase.asSet(strArray64);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray64);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray60, (java.lang.Object[]) strArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray51, (java.lang.Object[]) strArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray64);
        java.lang.String[] strArray71 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet72 = org.apache.lucene.util.LuceneTestCase.asSet(strArray71);
        java.lang.String[] strArray75 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet76 = org.apache.lucene.util.LuceneTestCase.asSet(strArray75);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray75);
        java.lang.String[] strArray78 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet79 = org.apache.lucene.util.LuceneTestCase.asSet(strArray78);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray75, (java.lang.Object[]) strArray78);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray71, (java.lang.Object[]) strArray78);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray64, (java.lang.Object[]) strArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) strArray71);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet1 = org.apache.lucene.util.LuceneTestCase.asSet(strArray0);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests4.setUp();
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) strSet10);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests17.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests17, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests17.setUp();
        java.lang.String[] strArray22 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests17, (java.lang.Object) strSet23);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests29.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests29, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests29.setUp();
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests29, (java.lang.Object) strSet35);
        java.util.Set[] setArray38 = new java.util.Set[6];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray39 = (java.util.Set<java.lang.String>[]) setArray38;
        strSetArray39[0] = strSet1;
        strSetArray39[1] = strSet10;
        strSetArray39[2] = strSet14;
        strSetArray39[3] = strSet23;
        strSetArray39[4] = strSet26;
        strSetArray39[5] = strSet35;
        java.util.Set<java.util.Set<java.lang.String>> strSetSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strSetArray39);
        java.lang.String[] strArray58 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet59 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray58);
        java.lang.String[] strArray61 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet62 = org.apache.lucene.util.LuceneTestCase.asSet(strArray61);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray58, (java.lang.Object[]) strArray61);
        java.lang.String[] strArray66 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet67 = org.apache.lucene.util.LuceneTestCase.asSet(strArray66);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray66);
        java.lang.String[] strArray69 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet70 = org.apache.lucene.util.LuceneTestCase.asSet(strArray69);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray66, (java.lang.Object[]) strArray69);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray61, (java.lang.Object[]) strArray66);
        java.lang.String[] strArray75 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet76 = org.apache.lucene.util.LuceneTestCase.asSet(strArray75);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray75);
        java.lang.String[] strArray80 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet81 = org.apache.lucene.util.LuceneTestCase.asSet(strArray80);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray80);
        java.lang.String[] strArray83 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet84 = org.apache.lucene.util.LuceneTestCase.asSet(strArray83);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray80, (java.lang.Object[]) strArray83);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray75, (java.lang.Object[]) strArray83);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray61, (java.lang.Object[]) strArray83);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.failfast", (java.lang.Object) strArray61);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strSetArray39, (java.lang.Object[]) strArray61);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray7);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray3, (java.lang.Object[]) strArray7);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray16);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray12, (java.lang.Object[]) strArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray16);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray16, (java.lang.Object[]) strArray21);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray26);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray31);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray31, (java.lang.Object[]) strArray34);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray26, (java.lang.Object[]) strArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray26);
        java.lang.String[] strArray40 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray40);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray44);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray40, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) strArray26, (java.lang.Object[]) strArray47);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests52.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests52.assertDocsEnumEquals("tests.failfast", postingsEnum55, postingsEnum56, false);
        org.junit.rules.TestRule testRule59 = commonGramsTokenFilterFactoryTests52.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) strArray47, (java.lang.Object) commonGramsTokenFilterFactoryTests52);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4, true);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader8, 3, postingsEnum10, postingsEnum11, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) indexReader8);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, 0.0d);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (byte) 100, (double) (byte) 0);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) '#', (double) (short) 100, 1.0d);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader9, 3, postingsEnum11, postingsEnum12, true);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1.0d));
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum20, postingsEnum21, false);
        java.lang.String str24 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.nightly", indexReader26, (int) (byte) 0, postingsEnum28, postingsEnum29);
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) postingsEnum29, (java.lang.Object) locale32);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader7, terms8, terms9, true);
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray14);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray17);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray14, (java.lang.Object[]) strArray17);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray28);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray28, (java.lang.Object[]) strArray31);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray23, (java.lang.Object[]) strArray31);
        java.lang.String[] strArray37 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet38 = org.apache.lucene.util.LuceneTestCase.asSet(strArray37);
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray37);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray41);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray37, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray41, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray31, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray17, (java.lang.Object[]) strArray31);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) strArray31);
        java.lang.String[] strArray54 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet55 = org.apache.lucene.util.LuceneTestCase.asSet(strArray54);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray54);
        java.lang.String[] strArray57 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet58 = org.apache.lucene.util.LuceneTestCase.asSet(strArray57);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray54, (java.lang.Object[]) strArray57);
        java.lang.String[] strArray60 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet61 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        java.util.Set<java.lang.String> strSet62 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray57, (java.lang.Object[]) strArray60);
        java.lang.String[] strArray67 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet68 = org.apache.lucene.util.LuceneTestCase.asSet(strArray67);
        java.util.Set<java.lang.String> strSet69 = org.apache.lucene.util.LuceneTestCase.asSet(strArray67);
        java.lang.String[] strArray71 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet72 = org.apache.lucene.util.LuceneTestCase.asSet(strArray71);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray71);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray67, (java.lang.Object[]) strArray71);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray71, (java.lang.Object) 1.0d);
        java.lang.String[] strArray80 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet81 = org.apache.lucene.util.LuceneTestCase.asSet(strArray80);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray80);
        java.lang.String[] strArray83 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet84 = org.apache.lucene.util.LuceneTestCase.asSet(strArray83);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray80, (java.lang.Object[]) strArray83);
        java.lang.String[] strArray86 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet87 = org.apache.lucene.util.LuceneTestCase.asSet(strArray86);
        java.util.Set<java.lang.String> strSet88 = org.apache.lucene.util.LuceneTestCase.asSet(strArray86);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray83, (java.lang.Object[]) strArray86);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray71, (java.lang.Object[]) strArray83);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray60, (java.lang.Object[]) strArray83);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray31, (java.lang.Object[]) strArray60);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) strArray60);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader9, 3, postingsEnum11, postingsEnum12, true);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocsAndPositionsEnumEquals("hi!", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
        float[] floatArray0 = null;
        float[] floatArray6 = new float[] { (short) 1 };
        float[] floatArray8 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray8, (float) '#');
        float[] floatArray12 = new float[] { (short) 1 };
        float[] floatArray14 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray14, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray8, floatArray12, (float) 100);
        float[] floatArray20 = new float[] { (short) 1 };
        float[] floatArray22 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray22, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray8, floatArray22, (float) 3);
        float[] floatArray28 = new float[] { (short) 1 };
        float[] floatArray30 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray30, (float) '#');
        org.junit.Assert.assertArrayEquals("", floatArray22, floatArray30, 100.0f);
        float[] floatArray38 = new float[] { (short) 1 };
        float[] floatArray40 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray40, (float) '#');
        float[] floatArray44 = new float[] { (short) 1 };
        float[] floatArray46 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray46, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray40, floatArray44, (float) 100);
        float[] floatArray53 = new float[] { (short) 1 };
        float[] floatArray55 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray55, (float) '#');
        float[] floatArray59 = new float[] { (short) 1 };
        float[] floatArray61 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray61, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray55, floatArray59, (float) 100);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray44, floatArray55, (float) (short) 10);
        float[] floatArray69 = new float[] { (short) 1 };
        float[] floatArray71 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray71, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray69, (float) (byte) 0);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray22, floatArray69, 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray22, (float) (byte) -1);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.util.Set<java.lang.String[]> strArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(strArray0);
        float[] floatArray3 = new float[] { (short) 1 };
        float[] floatArray5 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray5, (float) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) strArray0, (java.lang.Object) '#');
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (byte) 1, (double) 'a', (double) 0L);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("<unknown>", indexReader5, terms6, terms7, false);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.weekly", (int) (short) -1, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests5.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsEnumEquals("hi!", postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader13, (int) (byte) 100, postingsEnum15, postingsEnum16);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests5.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests5, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("<unknown>", indexReader22, 6, postingsEnum24, postingsEnum25);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests5);
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests5.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests5.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests5.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests5);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) ' ', (double) 'a', 0.0d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) 2);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet2 = org.apache.lucene.util.LuceneTestCase.asSet(strArray1);
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray1);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray5);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray1, (java.lang.Object[]) strArray5);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray14);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray14);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray10, (java.lang.Object[]) strArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) strArray14);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray14, (java.lang.Object[]) strArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArray19);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0.0d, (double) (short) 1);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, 10L);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        org.junit.Assert.assertArrayEquals("", byteArray1, byteArray5);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray8, longArray9);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray11, longArray12);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray14, longArray15);
        org.junit.Assert.assertArrayEquals(longArray11, longArray14);
        org.junit.Assert.assertArrayEquals(longArray8, longArray14);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray14, (java.lang.Object) byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray19);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray25, byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray29);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests33.ruleChain;
        commonGramsTokenFilterFactoryTests33.setUp();
        java.lang.String str36 = commonGramsTokenFilterFactoryTests33.getTestName();
        commonGramsTokenFilterFactoryTests33.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsSkippingEquals("tests.badapples", indexReader39, (int) (byte) 100, postingsEnum41, postingsEnum42, true);
        java.lang.Class<?> wildcardClass45 = commonGramsTokenFilterFactoryTests33.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) byteArray19, (java.lang.Object) wildcardClass45);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests3.setUp();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) strSet9);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("", postingsEnum12, postingsEnum13, false);
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("", indexReader18, 3, postingsEnum20, postingsEnum21, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) postingsEnum21);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "<unknown>", obj1);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) 10.0f);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("hi!", indexReader9, fields10, fields11, true);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests1.ruleChain;
        java.lang.Object obj15 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests16.ruleChain;
        commonGramsTokenFilterFactoryTests16.setUp();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests16.ruleChain;
        commonGramsTokenFilterFactoryTests16.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests16.ruleChain;
        org.junit.Assert.assertNotSame(obj15, (java.lang.Object) testRule21);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule21;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule21;
        org.junit.rules.TestRule[] testRuleArray25 = new org.junit.rules.TestRule[] { testRule14, testRule21 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet26 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray25);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests28.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsEnumEquals("hi!", postingsEnum31, postingsEnum32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests28.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader36, (int) (byte) 100, postingsEnum38, postingsEnum39);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("tests.nightly", indexReader42, fields43, fields44, true);
        commonGramsTokenFilterFactoryTests28.tearDown();
        org.junit.rules.TestRule testRule48 = commonGramsTokenFilterFactoryTests28.ruleChain;
        commonGramsTokenFilterFactoryTests28.tearDown();
        org.junit.rules.TestRule testRule50 = commonGramsTokenFilterFactoryTests28.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule50;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests52.ruleChain;
        commonGramsTokenFilterFactoryTests52.setUp();
        org.junit.rules.TestRule testRule55 = commonGramsTokenFilterFactoryTests52.ruleChain;
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        commonGramsTokenFilterFactoryTests52.assertFieldsEquals("tests.maxfailures", indexReader57, fields58, fields59, false);
        org.junit.rules.TestRule testRule62 = commonGramsTokenFilterFactoryTests52.ruleChain;
        commonGramsTokenFilterFactoryTests52.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) testRule50, (java.lang.Object) commonGramsTokenFilterFactoryTests52);
        org.elasticsearch.common.settings.Settings.Builder builder65 = commonGramsTokenFilterFactoryTests52.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) testRuleSet26, (java.lang.Object) commonGramsTokenFilterFactoryTests52);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4, true);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader8, 3, postingsEnum10, postingsEnum11, true);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1.0d));
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum19, postingsEnum20, false);
        java.lang.String str23 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests7.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests7, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests7.setUp();
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests7, (java.lang.Object) strSet13);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "enwiki.random.lines.txt");
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule17;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule17;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests21.ruleChain;
        commonGramsTokenFilterFactoryTests21.setUp();
        java.lang.String str24 = commonGramsTokenFilterFactoryTests21.getTestName();
        commonGramsTokenFilterFactoryTests21.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests21.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) 100, (java.lang.Object) commonGramsTokenFilterFactoryTests21);
        org.junit.Assert.assertNotSame((java.lang.Object) testRule17, (java.lang.Object) commonGramsTokenFilterFactoryTests21);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests21.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum30, postingsEnum31);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray5, byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) byteArray5);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray2);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet4 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray2);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray7);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray7, (java.lang.Object[]) strArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) throttlingArray2, (java.lang.Object[]) strArray10);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray9 = new java.io.Serializable[][] { serializableArray2, serializableArray4, serializableArray6, serializableArray8 };
        java.util.Set<java.io.Serializable[]> serializableArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        java.util.Set<java.io.Serializable[]> serializableArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray9);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests12.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsEnumEquals("hi!", postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests12.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader20, (int) (byte) 100, postingsEnum22, postingsEnum23);
        commonGramsTokenFilterFactoryTests12.setIndexWriterMaxDocs(6);
        org.elasticsearch.common.settings.Settings.Builder builder27 = commonGramsTokenFilterFactoryTests12.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests12.tearDown();
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) serializableArray9, (java.lang.Object) commonGramsTokenFilterFactoryTests12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) serializableArray9);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.setUp();
        commonGramsTokenFilterFactoryTests8.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests8.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("tests.failfast", indexReader14, fields15, fields16, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) fields15);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4, false);
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader9, 100, postingsEnum11, postingsEnum12, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder6 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4, true);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader8, 3, postingsEnum10, postingsEnum11, true);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1.0d));
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("", (int) (short) -1, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum13, postingsEnum14, true);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.maxfailures", indexReader19, terms20, terms21, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) (short) -1, (float) ' ', 0.0f);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
        double[] doubleArray5 = new double[] { 0L, 0.0d, (short) 0, 4, (short) -1 };
        double[] doubleArray11 = new double[] { 0L, 0.0d, (short) 0, 4, (short) -1 };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray11 };
        java.util.Set<double[]> doubleArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray12);
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray15 = new org.apache.lucene.util.LuceneTestCase[][] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray15);
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet17 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray15);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray23);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray23);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray29);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray34);
        java.lang.String[] strArray37 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet38 = org.apache.lucene.util.LuceneTestCase.asSet(strArray37);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray34, (java.lang.Object[]) strArray37);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray37);
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray47);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray43, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray47, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray23, (java.lang.Object[]) strArray37);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) strArray37);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) luceneTestCaseArray15, (java.lang.Object[]) strArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray12, (java.lang.Object[]) luceneTestCaseArray15);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 3, (-1.0d));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1349");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) (short) -1);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1350");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray7);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray3, (java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray7, (java.lang.Object) 1.0d);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray16);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray19);
        java.lang.String[] strArray22 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray19, (java.lang.Object[]) strArray22);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray7, (java.lang.Object[]) strArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "<unknown>");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1351");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 5);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1352");
        float[] floatArray5 = new float[] { (short) 1 };
        float[] floatArray7 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray7, (float) '#');
        float[] floatArray11 = new float[] { (short) 1 };
        float[] floatArray13 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray13, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray7, floatArray11, (float) 100);
        float[] floatArray19 = new float[] { (short) 1 };
        float[] floatArray21 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray21, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray7, floatArray21, (float) 3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests26.ruleChain;
        commonGramsTokenFilterFactoryTests26.setUp();
        commonGramsTokenFilterFactoryTests26.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder30 = commonGramsTokenFilterFactoryTests26.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests26);
        commonGramsTokenFilterFactoryTests26.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests26.setUp();
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) 3, (java.lang.Object) commonGramsTokenFilterFactoryTests26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests35.setUp();
        commonGramsTokenFilterFactoryTests35.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule40 = commonGramsTokenFilterFactoryTests39.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests39.assertDocsEnumEquals("hi!", postingsEnum42, postingsEnum43, false);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests39.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader47, (int) (byte) 100, postingsEnum49, postingsEnum50);
        org.junit.rules.TestRule testRule52 = commonGramsTokenFilterFactoryTests39.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests39, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        commonGramsTokenFilterFactoryTests39.assertPositionsSkippingEquals("<unknown>", indexReader56, 6, postingsEnum58, postingsEnum59);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests35, (java.lang.Object) commonGramsTokenFilterFactoryTests39);
        commonGramsTokenFilterFactoryTests35.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule63 = commonGramsTokenFilterFactoryTests35.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests26, (java.lang.Object) commonGramsTokenFilterFactoryTests35);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1353");
        float[] floatArray1 = new float[] { (short) 1 };
        float[] floatArray3 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray3, (float) '#');
        float[] floatArray7 = new float[] { (short) 1 };
        float[] floatArray9 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray9, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray7, (float) '4');
        float[] floatArray15 = new float[] { (short) 1 };
        float[] floatArray17 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray17, (float) '#');
        float[] floatArray21 = new float[] { (short) 1 };
        float[] floatArray23 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray23, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray21, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray15, (float) (-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray1);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1354");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10.0f, (double) (short) -1);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1355");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (double) (byte) 1, (double) 0.0f, (double) (byte) 10);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1356");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray8 = new java.io.Serializable[][] { serializableArray1, serializableArray3, serializableArray5, serializableArray7 };
        java.util.Set<java.io.Serializable[]> serializableArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        float[] floatArray11 = new float[] { (short) 1 };
        float[] floatArray13 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray13, (float) '#');
        float[] floatArray17 = new float[] { (short) 1 };
        float[] floatArray19 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray19, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray17, (float) '4');
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray25 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling24 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray11, (java.lang.Object) throttlingArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray8, (java.lang.Object[]) throttlingArray25);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1357");
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray1 = new org.apache.lucene.util.LuceneTestCase[][] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray1);
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray1);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray9);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray9);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray15);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray20);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray23);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray15, (java.lang.Object[]) strArray23);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray33);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray33);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray33, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray23, (java.lang.Object[]) strArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray9, (java.lang.Object[]) strArray23);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) strArray23);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) luceneTestCaseArray1, (java.lang.Object[]) strArray23);
        short[] shortArray44 = new short[] { (byte) 0 };
        short[] shortArray46 = new short[] { (byte) 0 };
        short[] shortArray48 = new short[] { (byte) 0 };
        short[] shortArray50 = new short[] { (byte) 0 };
        short[] shortArray52 = new short[] { (byte) 0 };
        short[][] shortArray53 = new short[][] { shortArray44, shortArray46, shortArray48, shortArray50, shortArray52 };
        short[] shortArray55 = new short[] { (byte) 0 };
        short[] shortArray57 = new short[] { (byte) 0 };
        short[] shortArray59 = new short[] { (byte) 0 };
        short[] shortArray61 = new short[] { (byte) 0 };
        short[] shortArray63 = new short[] { (byte) 0 };
        short[][] shortArray64 = new short[][] { shortArray55, shortArray57, shortArray59, shortArray61, shortArray63 };
        short[] shortArray66 = new short[] { (byte) 0 };
        short[] shortArray68 = new short[] { (byte) 0 };
        short[] shortArray70 = new short[] { (byte) 0 };
        short[] shortArray72 = new short[] { (byte) 0 };
        short[] shortArray74 = new short[] { (byte) 0 };
        short[][] shortArray75 = new short[][] { shortArray66, shortArray68, shortArray70, shortArray72, shortArray74 };
        short[][][] shortArray76 = new short[][][] { shortArray53, shortArray64, shortArray75 };
        java.util.Set<short[][]> shortArraySet77 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.failfast", (java.lang.Object) shortArray76);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1358");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) (byte) 100, postingsEnum10, postingsEnum11);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder14 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        commonGramsTokenFilterFactoryTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1359");
        java.lang.Object obj1 = null;
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray7);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray7, (java.lang.Object[]) strArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) strArray10);
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", obj1, (java.lang.Object) strSet14);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1360");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 1, (double) (short) 10);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1361");
        float[] floatArray2 = new float[] { (short) 1 };
        float[] floatArray4 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray4, (float) '#');
        float[] floatArray8 = new float[] { (short) 1 };
        float[] floatArray10 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray10, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray8, (float) '4');
        float[] floatArray17 = new float[] { (short) 1 };
        float[] floatArray19 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray19, (float) '#');
        float[] floatArray23 = new float[] { (short) 1 };
        float[] floatArray25 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray25, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray19, floatArray23, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray23, (float) 10L);
        float[] floatArray33 = new float[] { (short) 1 };
        float[] floatArray35 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray35, (float) '#');
        float[] floatArray39 = new float[] { (short) 1 };
        float[] floatArray41 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray41, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray39, (float) '4');
        float[] floatArray47 = new float[] { (short) 1 };
        float[] floatArray49 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray49, (float) '#');
        float[] floatArray53 = new float[] { (short) 1 };
        float[] floatArray55 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray55, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray53, (float) '4');
        float[] floatArray61 = new float[] { (short) 1 };
        float[] floatArray63 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray61, floatArray63, (float) '#');
        float[] floatArray67 = new float[] { (short) 1 };
        float[] floatArray69 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray67, floatArray69, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray61, floatArray67, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray61, (float) (-1L));
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray61, 0.0f);
        org.junit.Assert.assertArrayEquals("random", floatArray2, floatArray33, (float) (short) 100);
        float[] floatArray85 = new float[] { 1L, '#', (short) 1, 10L, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray85, (float) (short) 0);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1362");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 5, 10L);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1363");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 6, (-1.0d), (double) 0L);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1364");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 6, (double) (-1));
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1365");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 10.0d, (double) (-1L));
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1366");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 1, (float) (byte) 10, (float) (byte) 0);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1367");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.badapples", indexReader6, (int) (byte) 100, postingsEnum8, postingsEnum9, true);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.weekly", indexReader14, 1, postingsEnum16, postingsEnum17);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests20.ruleChain;
        commonGramsTokenFilterFactoryTests20.setUp();
        commonGramsTokenFilterFactoryTests20.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests20.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass25 = commonGramsTokenFilterFactoryTests20.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests27.ruleChain;
        commonGramsTokenFilterFactoryTests27.setUp();
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray34);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray31, (java.lang.Object[]) strArray34);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests27, (java.lang.Object) strArray31);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray41);
        java.lang.String[] strArray46 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray46);
        java.lang.String[] strArray49 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray46, (java.lang.Object[]) strArray49);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray41, (java.lang.Object[]) strArray49);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet56 = org.apache.lucene.util.LuceneTestCase.asSet(strArray55);
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray55);
        java.lang.String[] strArray59 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet60 = org.apache.lucene.util.LuceneTestCase.asSet(strArray59);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray59);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray55, (java.lang.Object[]) strArray59);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray59, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray49, (java.lang.Object[]) strArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray31, (java.lang.Object[]) strArray49);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) wildcardClass25, (java.lang.Object) strArray31);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet68 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) strArray31);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1368");
        short[] shortArray1 = new short[] {};
        short[][] shortArray2 = new short[][] { shortArray1 };
        short[][][] shortArray3 = new short[][][] { shortArray2 };
        short[] shortArray4 = new short[] {};
        short[][] shortArray5 = new short[][] { shortArray4 };
        short[][][] shortArray6 = new short[][][] { shortArray5 };
        short[] shortArray7 = new short[] {};
        short[][] shortArray8 = new short[][] { shortArray7 };
        short[][][] shortArray9 = new short[][][] { shortArray8 };
        short[] shortArray10 = new short[] {};
        short[][] shortArray11 = new short[][] { shortArray10 };
        short[][][] shortArray12 = new short[][][] { shortArray11 };
        short[] shortArray13 = new short[] {};
        short[][] shortArray14 = new short[][] { shortArray13 };
        short[][][] shortArray15 = new short[][][] { shortArray14 };
        short[] shortArray16 = new short[] {};
        short[][] shortArray17 = new short[][] { shortArray16 };
        short[][][] shortArray18 = new short[][][] { shortArray17 };
        short[][][][] shortArray19 = new short[][][][] { shortArray3, shortArray6, shortArray9, shortArray12, shortArray15, shortArray18 };
        java.util.Set<short[][][]> shortArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray19);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray23);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray23, (java.lang.Object[]) strArray26);
        java.lang.Class<?> wildcardClass29 = strArray23.getClass();
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray32);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray32, (java.lang.Object[]) strArray35);
        java.lang.Class<?> wildcardClass38 = strArray32.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule41 = commonGramsTokenFilterFactoryTests40.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests40, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests40.setUp();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests40.assertPositionsSkippingEquals("", indexReader46, (int) (byte) 1, postingsEnum48, postingsEnum49);
        java.lang.Class<?> wildcardClass51 = commonGramsTokenFilterFactoryTests40.getClass();
        java.lang.String[] strArray54 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet55 = org.apache.lucene.util.LuceneTestCase.asSet(strArray54);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray54);
        java.lang.String[] strArray57 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet58 = org.apache.lucene.util.LuceneTestCase.asSet(strArray57);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray54, (java.lang.Object[]) strArray57);
        java.lang.Class<?> wildcardClass60 = strArray54.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray61 = new java.lang.reflect.AnnotatedElement[] { wildcardClass29, wildcardClass38, wildcardClass51, wildcardClass60 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet62 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) shortArray19, (java.lang.Object[]) annotatedElementArray61);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1369");
        float[] floatArray4 = new float[] { (short) 1 };
        float[] floatArray6 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray6, (float) '#');
        float[] floatArray10 = new float[] { (short) 1 };
        float[] floatArray12 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray12, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray6, floatArray10, (float) 100);
        float[] floatArray19 = new float[] { (short) 1 };
        float[] floatArray21 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray21, (float) '#');
        float[] floatArray25 = new float[] { (short) 1 };
        float[] floatArray27 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray27, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray21, floatArray25, (float) 100);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray10, floatArray21, (float) (short) 10);
        float[] floatArray35 = new float[] { (short) 1 };
        float[] floatArray37 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray37, (float) '#');
        float[] floatArray41 = new float[] { (short) 1 };
        float[] floatArray43 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray43, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray41, (float) '4');
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray21, floatArray35, (float) (short) 1);
        float[] floatArray50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray50, (float) (short) -1);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1370");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) (-1.0f), (double) (-1.0f));
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1371");
        double[] doubleArray8 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray15 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray15, (double) 100.0f);
        double[] doubleArray24 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray31 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray31, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray24, (double) 4);
        double[] doubleArray42 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray49 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray49, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray42, (double) (byte) 0);
        double[] doubleArray60 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray67 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray67, (double) 100.0f);
        double[] doubleArray76 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray83 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray76, doubleArray83, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray76, (double) 4);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray24, doubleArray60, 10.0d);
        double[] doubleArray93 = new double[] { (short) -1, (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray60, doubleArray93, (double) (byte) -1);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1372");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray8);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray11);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray3, (java.lang.Object[]) strArray11);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray21);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray17, (java.lang.Object[]) strArray21);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray21, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) strArray21);
        java.lang.Class<?> wildcardClass28 = strArray11.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) wildcardClass28);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1373");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.slow", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1374");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) '#', (long) ' ');
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1375");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (short) 100, 10L);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1376");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray2, byteArray6);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        org.junit.Assert.assertArrayEquals("", byteArray11, byteArray13);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray17, longArray18);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray20, longArray21);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray23, longArray24);
        org.junit.Assert.assertArrayEquals(longArray20, longArray23);
        org.junit.Assert.assertArrayEquals(longArray17, longArray23);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray23, (java.lang.Object) byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray28);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray34);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray38);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray41);
        org.junit.Assert.assertArrayEquals("", byteArray38, byteArray40);
        long[] longArray44 = new long[] {};
        long[] longArray45 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray44, longArray45);
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray47, longArray48);
        long[] longArray50 = new long[] {};
        long[] longArray51 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray50, longArray51);
        org.junit.Assert.assertArrayEquals(longArray47, longArray50);
        org.junit.Assert.assertArrayEquals(longArray44, longArray50);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray56);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray50, (java.lang.Object) byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray28);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1377");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) 1, (long) 4);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1378");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Class<?> wildcardClass1 = throttling0.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests4.setUp();
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) strSet10);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("", postingsEnum13, postingsEnum14, false);
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("", indexReader19, 3, postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("tests.weekly", postingsEnum26, postingsEnum27, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) wildcardClass1, (java.lang.Object) postingsEnum26);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1379");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("hi!", postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader10, (int) (byte) 100, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.nightly", indexReader16, fields17, fields18, true);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.junit.Assert.assertNotEquals((java.lang.Object) 1L, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        java.lang.Object obj25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, obj25);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1380");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals(intArray2, intArray5);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertArrayEquals(intArray10, intArray13);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        org.junit.Assert.assertArrayEquals(intArray17, intArray20);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray10, intArray17);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals(intArray26, intArray29);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        org.junit.Assert.assertArrayEquals(intArray34, intArray37);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray44, intArray45);
        org.junit.Assert.assertArrayEquals(intArray41, intArray44);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray37, intArray44);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray26, intArray37);
        org.junit.Assert.assertArrayEquals(intArray10, intArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray5, intArray26);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1381");
        float[] floatArray4 = new float[] { (short) 1 };
        float[] floatArray6 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray6, (float) '#');
        float[] floatArray10 = new float[] { (short) 1 };
        float[] floatArray12 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray12, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray6, floatArray10, (float) 100);
        float[] floatArray18 = new float[] { (short) 1 };
        float[] floatArray20 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray20, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray6, floatArray20, (float) 3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests25.ruleChain;
        commonGramsTokenFilterFactoryTests25.setUp();
        commonGramsTokenFilterFactoryTests25.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder29 = commonGramsTokenFilterFactoryTests25.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests25);
        commonGramsTokenFilterFactoryTests25.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests25.setUp();
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) 3, (java.lang.Object) commonGramsTokenFilterFactoryTests25);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        commonGramsTokenFilterFactoryTests25.assertTermsEquals("", indexReader35, terms36, terms37, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests41 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests41.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests41.assertDocsEnumEquals("hi!", postingsEnum44, postingsEnum45, false);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests41.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader49, (int) (byte) 100, postingsEnum51, postingsEnum52);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        commonGramsTokenFilterFactoryTests41.assertFieldsEquals("tests.nightly", indexReader55, fields56, fields57, true);
        commonGramsTokenFilterFactoryTests41.tearDown();
        org.junit.rules.TestRule testRule61 = commonGramsTokenFilterFactoryTests41.ruleChain;
        commonGramsTokenFilterFactoryTests41.tearDown();
        org.junit.rules.TestRule testRule63 = commonGramsTokenFilterFactoryTests41.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule63;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests65 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule66 = commonGramsTokenFilterFactoryTests65.ruleChain;
        commonGramsTokenFilterFactoryTests65.setUp();
        org.junit.rules.TestRule testRule68 = commonGramsTokenFilterFactoryTests65.ruleChain;
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        commonGramsTokenFilterFactoryTests65.assertFieldsEquals("tests.maxfailures", indexReader70, fields71, fields72, false);
        org.junit.rules.TestRule testRule75 = commonGramsTokenFilterFactoryTests65.ruleChain;
        commonGramsTokenFilterFactoryTests65.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) testRule63, (java.lang.Object) commonGramsTokenFilterFactoryTests65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) terms36, (java.lang.Object) "");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1382");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) (-1), (float) 10L, (float) (-1L));
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1383");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests6.ruleChain;
        commonGramsTokenFilterFactoryTests6.setUp();
        commonGramsTokenFilterFactoryTests6.tearDown();
        commonGramsTokenFilterFactoryTests6.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests6.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests6.setIndexWriterMaxDocs(3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.setUp();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests14.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        commonGramsTokenFilterFactoryTests14.assertTermsEquals("", indexReader21, terms22, terms23, true);
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests14.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests6, (java.lang.Object) builder26);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray28 = new org.elasticsearch.common.settings.Settings.Builder[] { builder5, builder26 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet29 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray28);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests31.ruleChain;
        commonGramsTokenFilterFactoryTests31.setUp();
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests31.ruleChain;
        commonGramsTokenFilterFactoryTests31.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests31.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        commonGramsTokenFilterFactoryTests31.assertTermsEquals("", indexReader38, terms39, terms40, true);
        java.lang.String str43 = commonGramsTokenFilterFactoryTests31.getTestName();
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests31);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) builderSet29, (java.lang.Object) commonGramsTokenFilterFactoryTests31);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests31.assertPositionsSkippingEquals("tests.badapples", indexReader47, (int) (byte) 0, postingsEnum49, postingsEnum50);
        commonGramsTokenFilterFactoryTests31.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues55 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues56 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests31.assertDocValuesEquals("tests.slow", (int) (byte) 1, numericDocValues55, numericDocValues56);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1384");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet2 = org.apache.lucene.util.LuceneTestCase.asSet(strArray1);
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray1);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray9);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray9);
        java.util.Set<java.io.Serializable> serializableSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray6);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray18);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray15, (java.lang.Object[]) strArray18);
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray15);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) strArray15);
        java.lang.Object[] objArray25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray15, objArray25);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1385");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray2);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray12 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray14 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray15 = new java.io.Serializable[][] { serializableArray8, serializableArray10, serializableArray12, serializableArray14 };
        java.util.Set<java.io.Serializable[]> serializableArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) "hi!", (java.lang.Object) serializableArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray2, (java.lang.Object[]) serializableArray15);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1386");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) '#', (double) ' ', (double) (byte) 10);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1387");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) ' ', (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("tests.monster", 10, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1388");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (byte) 1, (long) 10);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1389");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) ' ', (double) 2, (double) 100.0f);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1390");
        double[] doubleArray7 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray14 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray14, (double) 100.0f);
        double[] doubleArray23 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray30 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray30, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray23, (double) 4);
        double[] doubleArray41 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray48 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray48, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray41, (double) (byte) 0);
        double[] doubleArray59 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray66 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray66, (double) 100.0f);
        double[] doubleArray75 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray82 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray75, doubleArray82, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray75, (double) 4);
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray75, (double) 0);
        double[] doubleArray89 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray41, doubleArray89, (double) 0.0f);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1391");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet2 = org.apache.lucene.util.LuceneTestCase.asSet(strArray1);
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray1);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray5);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray1, (java.lang.Object[]) strArray5);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray14);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray14);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray10, (java.lang.Object[]) strArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) strArray14);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy19 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy20 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy21 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy22 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray23 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy19, queryCachingPolicy20, queryCachingPolicy21, queryCachingPolicy22 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet24 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) queryCachingPolicyArray23);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1392");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        commonGramsTokenFilterFactoryTests2.tearDown();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("hi!", postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum14, postingsEnum15, true);
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) builder18);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1393");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) (short) 10);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1394");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 'a', (double) 5);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1395");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, false);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.slow", indexReader16, 0, postingsEnum18, postingsEnum19);
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.maxfailures", (int) '#', numericDocValues23, numericDocValues24);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1396");
        short[] shortArray1 = new short[] { (byte) 0 };
        short[] shortArray3 = new short[] { (byte) 0 };
        short[] shortArray5 = new short[] { (byte) 0 };
        short[] shortArray7 = new short[] { (byte) 0 };
        short[] shortArray9 = new short[] { (byte) 0 };
        short[][] shortArray10 = new short[][] { shortArray1, shortArray3, shortArray5, shortArray7, shortArray9 };
        short[] shortArray12 = new short[] { (byte) 0 };
        short[] shortArray14 = new short[] { (byte) 0 };
        short[] shortArray16 = new short[] { (byte) 0 };
        short[] shortArray18 = new short[] { (byte) 0 };
        short[] shortArray20 = new short[] { (byte) 0 };
        short[][] shortArray21 = new short[][] { shortArray12, shortArray14, shortArray16, shortArray18, shortArray20 };
        short[] shortArray23 = new short[] { (byte) 0 };
        short[] shortArray25 = new short[] { (byte) 0 };
        short[] shortArray27 = new short[] { (byte) 0 };
        short[] shortArray29 = new short[] { (byte) 0 };
        short[] shortArray31 = new short[] { (byte) 0 };
        short[][] shortArray32 = new short[][] { shortArray23, shortArray25, shortArray27, shortArray29, shortArray31 };
        short[][][] shortArray33 = new short[][][] { shortArray10, shortArray21, shortArray32 };
        java.util.Set<short[][]> shortArraySet34 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray33);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        java.lang.String[] strArray40 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray40);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        java.lang.Iterable[] iterableArray45 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray46 = (java.lang.Iterable<java.lang.String>[]) iterableArray45;
        strIterableArray46[0] = strSet39;
        strIterableArray46[1] = strSet41;
        strIterableArray46[2] = strSet43;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray46);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) (-1.0d), (java.lang.Object) strIterableArray46);
        java.lang.String[] strArray57 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet58 = org.apache.lucene.util.LuceneTestCase.asSet(strArray57);
        java.lang.String[] strArray59 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet60 = org.apache.lucene.util.LuceneTestCase.asSet(strArray59);
        java.lang.String[] strArray61 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet62 = org.apache.lucene.util.LuceneTestCase.asSet(strArray61);
        java.lang.Iterable[] iterableArray64 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray65 = (java.lang.Iterable<java.lang.String>[]) iterableArray64;
        strIterableArray65[0] = strSet58;
        strIterableArray65[1] = strSet60;
        strIterableArray65[2] = strSet62;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet72 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray65);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) (-1.0d), (java.lang.Object) strIterableArray65);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) strIterableArray46, (java.lang.Object[]) strIterableArray65);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) shortArray33, (java.lang.Object[]) strIterableArray65);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1397");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1398");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (long) (short) 10, 10L);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1399");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5, false);
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(0);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsEnumEquals("tests.failfast", postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader20, 3, postingsEnum22, postingsEnum23, true);
        commonGramsTokenFilterFactoryTests13.tearDown();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests13);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) (-1.0d));
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum31, postingsEnum32, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) postingsEnum31);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1400");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("<unknown>", indexReader12, terms13, terms14, false);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1401");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) '#', 0.0d, (double) 100);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1402");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        commonGramsTokenFilterFactoryTests3.setUp();
        commonGramsTokenFilterFactoryTests3.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.setUp();
        commonGramsTokenFilterFactoryTests8.tearDown();
        commonGramsTokenFilterFactoryTests8.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests8.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests8.setIndexWriterMaxDocs(3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests16.ruleChain;
        commonGramsTokenFilterFactoryTests16.setUp();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests16.ruleChain;
        commonGramsTokenFilterFactoryTests16.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests16.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        commonGramsTokenFilterFactoryTests16.assertTermsEquals("", indexReader23, terms24, terms25, true);
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests16.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests8, (java.lang.Object) builder28);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray30 = new org.elasticsearch.common.settings.Settings.Builder[] { builder7, builder28 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet31 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray30);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests33.ruleChain;
        commonGramsTokenFilterFactoryTests33.setUp();
        org.junit.rules.TestRule testRule36 = commonGramsTokenFilterFactoryTests33.ruleChain;
        commonGramsTokenFilterFactoryTests33.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests33.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        commonGramsTokenFilterFactoryTests33.assertTermsEquals("", indexReader40, terms41, terms42, true);
        java.lang.String str45 = commonGramsTokenFilterFactoryTests33.getTestName();
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests33);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) builderSet31, (java.lang.Object) commonGramsTokenFilterFactoryTests33);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests33.assertPositionsSkippingEquals("tests.badapples", indexReader49, (int) (byte) 0, postingsEnum51, postingsEnum52);
        commonGramsTokenFilterFactoryTests33.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests33.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests33.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests33);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1403");
        float[] floatArray2 = new float[] { (short) 1 };
        float[] floatArray4 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray4, (float) '#');
        float[] floatArray8 = new float[] { (short) 1 };
        float[] floatArray10 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray10, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray4, floatArray8, (float) 100);
        float[] floatArray18 = new float[] { (short) 1 };
        float[] floatArray20 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray20, (float) '#');
        float[] floatArray24 = new float[] { (short) 1 };
        float[] floatArray26 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray26, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray20, floatArray24, (float) 100);
        float[] floatArray32 = new float[] { (short) 1 };
        float[] floatArray34 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray34, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray20, floatArray34, (float) 3);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray20, (float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray20);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1404");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        java.lang.String str2 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.maxfailures", indexReader7, terms8, terms9, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1405");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        java.lang.String str8 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader10, 1, postingsEnum12, postingsEnum13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexReader10);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1406");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) (byte) 100, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("hi!", indexReader14, fields15, fields16, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("europarl.lines.txt.gz", 4, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1407");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader7, 1, postingsEnum9, postingsEnum10);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("", indexReader14, 6, postingsEnum16, postingsEnum17);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray25);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray21, (java.lang.Object[]) strArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray21, (java.lang.Object) (short) 10);
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray36);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray32, (java.lang.Object[]) strArray36);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray45);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray41, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray32, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) strArray21, (java.lang.Object[]) strArray32);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) postingsEnum17, (java.lang.Object) strComparableSet51);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1408");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1409");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray7);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray7, (java.lang.Object[]) strArray10);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray10);
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray14 = new org.apache.lucene.util.LuceneTestCase[][] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray14);
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray10, (java.lang.Object[]) luceneTestCaseArray14);
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet18 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray14);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests19.ruleChain;
        commonGramsTokenFilterFactoryTests19.setUp();
        java.lang.String str22 = commonGramsTokenFilterFactoryTests19.getTestName();
        commonGramsTokenFilterFactoryTests19.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests19.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests19.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("", indexReader27, 0, postingsEnum29, postingsEnum30);
        commonGramsTokenFilterFactoryTests19.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) luceneTestCaseArray14, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1410");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (short) 0, (long) (byte) 10);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1411");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests9.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests9.assertDocsEnumEquals("hi!", postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests9.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, (int) (byte) 100, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests9.assertFieldsEquals("tests.nightly", indexReader23, fields24, fields25, true);
        commonGramsTokenFilterFactoryTests9.tearDown();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests9.assertDocsSkippingEquals("random", indexReader30, (int) (short) 100, postingsEnum32, postingsEnum33, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests36.ruleChain;
        commonGramsTokenFilterFactoryTests36.setUp();
        org.junit.rules.TestRule testRule39 = commonGramsTokenFilterFactoryTests36.ruleChain;
        commonGramsTokenFilterFactoryTests36.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests41 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests41.ruleChain;
        commonGramsTokenFilterFactoryTests41.setUp();
        java.lang.String str44 = commonGramsTokenFilterFactoryTests41.getTestName();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        commonGramsTokenFilterFactoryTests41.assertTermsEquals("<unknown>", indexReader46, terms47, terms48, false);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray51 = new org.apache.lucene.util.LuceneTestCase[] { commonGramsTokenFilterFactoryTests9, commonGramsTokenFilterFactoryTests36, commonGramsTokenFilterFactoryTests41 };
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet52 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray51);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) luceneTestCaseSet52);
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray55, longArray56);
        long[] longArray58 = new long[] {};
        long[] longArray59 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray58, longArray59);
        org.junit.Assert.assertArrayEquals(longArray55, longArray58);
        long[] longArray62 = new long[] {};
        long[] longArray63 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray62, longArray63);
        long[] longArray65 = new long[] {};
        long[] longArray66 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray65, longArray66);
        org.junit.Assert.assertArrayEquals(longArray62, longArray65);
        org.junit.Assert.assertArrayEquals(longArray55, longArray62);
        long[] longArray70 = new long[] {};
        long[] longArray71 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray70, longArray71);
        long[] longArray73 = new long[] {};
        long[] longArray74 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray73, longArray74);
        long[] longArray76 = new long[] {};
        long[] longArray77 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray76, longArray77);
        org.junit.Assert.assertArrayEquals(longArray73, longArray76);
        org.junit.Assert.assertArrayEquals(longArray70, longArray76);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray62, longArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) longArray70);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1412");
        float[] floatArray6 = new float[] { 6, 0L, 'a', 10, 'a' };
        float[] floatArray12 = new float[] { 6, 0L, 'a', 10, 'a' };
        float[][] floatArray13 = new float[][] { floatArray6, floatArray12 };
        java.util.Set<float[]> floatArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray13);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray21);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray21, (java.lang.Object[]) strArray24);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray29);
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray32);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray29);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray39);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray39, (java.lang.Object[]) strArray42);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray47);
        java.lang.String[] strArray50 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray47, (java.lang.Object[]) strArray50);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray42, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray42);
        java.lang.String[] strArray57 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet58 = org.apache.lucene.util.LuceneTestCase.asSet(strArray57);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray57);
        java.lang.String[] strArray60 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet61 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray57, (java.lang.Object[]) strArray60);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray60);
        java.lang.String[] strArray64 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet65 = org.apache.lucene.util.LuceneTestCase.asSet(strArray64);
        java.util.Set<java.lang.String> strSet66 = org.apache.lucene.util.LuceneTestCase.asSet(strArray64);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) floatArray13, (java.lang.Object[]) strArray24);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1413");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) (byte) 100, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.nightly", indexReader14, fields15, fields16, true);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("random", indexReader21, (int) (short) 100, postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests27.ruleChain;
        commonGramsTokenFilterFactoryTests27.setUp();
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests27.ruleChain;
        commonGramsTokenFilterFactoryTests27.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule33 = commonGramsTokenFilterFactoryTests32.ruleChain;
        commonGramsTokenFilterFactoryTests32.setUp();
        java.lang.String str35 = commonGramsTokenFilterFactoryTests32.getTestName();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        commonGramsTokenFilterFactoryTests32.assertTermsEquals("<unknown>", indexReader37, terms38, terms39, false);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray42 = new org.apache.lucene.util.LuceneTestCase[] { commonGramsTokenFilterFactoryTests0, commonGramsTokenFilterFactoryTests27, commonGramsTokenFilterFactoryTests32 };
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet43 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray42);
        float[] floatArray45 = new float[] { (short) 1 };
        float[] floatArray47 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray47, (float) '#');
        float[] floatArray51 = new float[] { (short) 1 };
        float[] floatArray53 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray53, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray51, (float) '4');
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling58 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray59 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling58 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet60 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray59);
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray45, (java.lang.Object) throttlingArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) luceneTestCaseArray42, (java.lang.Object[]) throttlingArray59);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1414");
        float[] floatArray5 = new float[] { (short) 1 };
        float[] floatArray7 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray7, (float) '#');
        float[] floatArray11 = new float[] { (short) 1 };
        float[] floatArray13 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray13, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray7, floatArray11, (float) 100);
        float[] floatArray20 = new float[] { (short) 1 };
        float[] floatArray22 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray22, (float) '#');
        float[] floatArray26 = new float[] { (short) 1 };
        float[] floatArray28 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray28, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray22, floatArray26, (float) 100);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray11, floatArray22, (float) (short) 10);
        float[] floatArray36 = new float[] { (short) 1 };
        float[] floatArray38 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray38, (float) '#');
        float[] floatArray42 = new float[] { (short) 1 };
        float[] floatArray44 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray44, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray42, (float) '4');
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray22, floatArray36, (float) (short) 1);
        float[] floatArray53 = new float[] { (short) 1 };
        float[] floatArray55 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray55, (float) '#');
        float[] floatArray59 = new float[] { (short) 1 };
        float[] floatArray61 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray61, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray55, floatArray59, (float) 100);
        float[] floatArray69 = new float[] { (short) 1 };
        float[] floatArray71 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray71, (float) '#');
        float[] floatArray75 = new float[] { (short) 1 };
        float[] floatArray77 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray75, floatArray77, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray71, floatArray75, (float) 100);
        float[] floatArray83 = new float[] { (short) 1 };
        float[] floatArray85 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray83, floatArray85, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray71, floatArray85, (float) 3);
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray71, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray22, floatArray55, (float) 1);
        float[] floatArray94 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray94, 1.0f);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1415");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.setUp();
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests8.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests8.assertTermsEquals("", indexReader15, terms16, terms17, true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = commonGramsTokenFilterFactoryTests8.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) builder20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1416");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader8, terms9, terms10, true);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("hi!", indexReader14, terms15, terms16, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests21.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests21, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests21.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests21);
        commonGramsTokenFilterFactoryTests21.setIndexWriterMaxDocs(2);
        commonGramsTokenFilterFactoryTests21.setUp();
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests21.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) terms16, (java.lang.Object) testRule30);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1417");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader6, (int) (byte) 0, postingsEnum8, postingsEnum9, true);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        java.lang.String str13 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 0);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.failfast", (int) (byte) -1, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1418");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals(intArray2, intArray5);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertArrayEquals(intArray10, intArray13);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        org.junit.Assert.assertArrayEquals(intArray17, intArray20);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray13, intArray20);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray2, intArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) "<unknown>");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1419");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 10L, (long) 'a');
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1420");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("hi!", indexReader9, fields10, fields11, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsEnumEquals("tests.failfast", postingsEnum18, postingsEnum19, true);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader23, 3, postingsEnum25, postingsEnum26, true);
        commonGramsTokenFilterFactoryTests16.tearDown();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests16);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests16, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotEquals((java.lang.Object) 0, (java.lang.Object) commonGramsTokenFilterFactoryTests16);
        org.elasticsearch.common.settings.Settings.Builder builder34 = commonGramsTokenFilterFactoryTests16.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule36 = commonGramsTokenFilterFactoryTests35.ruleChain;
        commonGramsTokenFilterFactoryTests35.setUp();
        commonGramsTokenFilterFactoryTests35.tearDown();
        commonGramsTokenFilterFactoryTests35.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsSkippingEquals("tests.badapples", indexReader41, (-1), postingsEnum43, postingsEnum44, false);
        commonGramsTokenFilterFactoryTests35.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests35.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) builder34, (java.lang.Object) commonGramsTokenFilterFactoryTests35);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests35);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests51 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule52 = commonGramsTokenFilterFactoryTests51.ruleChain;
        commonGramsTokenFilterFactoryTests51.setUp();
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests51.ruleChain;
        commonGramsTokenFilterFactoryTests51.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder56 = commonGramsTokenFilterFactoryTests51.newAnalysisSettingsBuilder();
        java.lang.String str57 = commonGramsTokenFilterFactoryTests51.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) str57);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1421");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray5);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray8);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray11);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray22);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray18, (java.lang.Object[]) strArray22);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray22, (java.lang.Object) 1.0d);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray31);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray31, (java.lang.Object[]) strArray34);
        java.lang.String[] strArray37 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet38 = org.apache.lucene.util.LuceneTestCase.asSet(strArray37);
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray37);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray34, (java.lang.Object[]) strArray37);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray22, (java.lang.Object[]) strArray34);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray11, (java.lang.Object[]) strArray34);
        short[] shortArray49 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray55 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray61 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[][] shortArray62 = new short[][] { shortArray49, shortArray55, shortArray61 };
        java.util.Set<short[]> shortArraySet63 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray62);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests64 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule65 = commonGramsTokenFilterFactoryTests64.ruleChain;
        commonGramsTokenFilterFactoryTests64.setUp();
        org.junit.rules.TestRule testRule67 = commonGramsTokenFilterFactoryTests64.ruleChain;
        commonGramsTokenFilterFactoryTests64.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        commonGramsTokenFilterFactoryTests64.assertDocsSkippingEquals("", indexReader70, (int) (byte) 0, postingsEnum72, postingsEnum73, true);
        commonGramsTokenFilterFactoryTests64.restoreIndexWriterMaxDocs();
        java.lang.String str77 = commonGramsTokenFilterFactoryTests64.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        commonGramsTokenFilterFactoryTests64.assertDocsEnumEquals("tests.maxfailures", postingsEnum79, postingsEnum80, true);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) shortArray62, (java.lang.Object) "tests.maxfailures");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray11, (java.lang.Object[]) shortArray62);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1422");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.weekly", indexReader12, 4, postingsEnum14, postingsEnum15);
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (byte) -1, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1423");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 10.0f, (float) 2, (float) 0L);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1424");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray3);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray3, (java.lang.Object[]) strArray6);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray12);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray12, (java.lang.Object[]) strArray15);
        java.lang.Class<?> wildcardClass18 = strArray12.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests20.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests20, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests20.setUp();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests20.assertPositionsSkippingEquals("", indexReader26, (int) (byte) 1, postingsEnum28, postingsEnum29);
        java.lang.Class<?> wildcardClass31 = commonGramsTokenFilterFactoryTests20.getClass();
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray34);
        java.lang.String[] strArray37 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet38 = org.apache.lucene.util.LuceneTestCase.asSet(strArray37);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray34, (java.lang.Object[]) strArray37);
        java.lang.Class<?> wildcardClass40 = strArray34.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray41 = new java.lang.reflect.AnnotatedElement[] { wildcardClass9, wildcardClass18, wildcardClass31, wildcardClass40 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet42 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray41);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests44 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests44.ruleChain;
        commonGramsTokenFilterFactoryTests44.setUp();
        commonGramsTokenFilterFactoryTests44.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder48 = commonGramsTokenFilterFactoryTests44.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests44);
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests44.assertDocsEnumEquals("<unknown>", postingsEnum51, postingsEnum52, true);
        org.junit.Assert.assertNotEquals((java.lang.Object) annotatedElementArray41, (java.lang.Object) postingsEnum51);
        java.lang.String[] strArray57 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet58 = org.apache.lucene.util.LuceneTestCase.asSet(strArray57);
        java.util.Set<java.lang.String> strSet59 = org.apache.lucene.util.LuceneTestCase.asSet(strArray57);
        java.lang.String[] strArray61 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet62 = org.apache.lucene.util.LuceneTestCase.asSet(strArray61);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray61);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray57, (java.lang.Object[]) strArray61);
        java.lang.String[] strArray66 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet67 = org.apache.lucene.util.LuceneTestCase.asSet(strArray66);
        java.util.Set<java.lang.String> strSet68 = org.apache.lucene.util.LuceneTestCase.asSet(strArray66);
        java.lang.String[] strArray70 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet71 = org.apache.lucene.util.LuceneTestCase.asSet(strArray70);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray70);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray66, (java.lang.Object[]) strArray70);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray57, (java.lang.Object[]) strArray70);
        java.lang.String[] strArray75 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet76 = org.apache.lucene.util.LuceneTestCase.asSet(strArray75);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray70, (java.lang.Object[]) strArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) annotatedElementArray41, (java.lang.Object[]) strArray70);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1425");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) 6);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1426");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        org.junit.Assert.assertArrayEquals(intArray1, intArray4);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        org.junit.Assert.assertArrayEquals(intArray9, intArray12);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertArrayEquals(intArray16, intArray19);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray9, intArray16);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        org.junit.Assert.assertArrayEquals(intArray25, intArray28);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        org.junit.Assert.assertArrayEquals(intArray33, intArray36);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        org.junit.Assert.assertArrayEquals(intArray40, intArray43);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray36, intArray43);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray25, intArray36);
        org.junit.Assert.assertArrayEquals(intArray9, intArray25);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray1, intArray9);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray51, intArray52);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray54, intArray55);
        org.junit.Assert.assertArrayEquals(intArray51, intArray54);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray58, intArray59);
        int[] intArray61 = new int[] {};
        int[] intArray62 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray61, intArray62);
        org.junit.Assert.assertArrayEquals(intArray58, intArray61);
        org.junit.Assert.assertArrayEquals(intArray54, intArray58);
        org.junit.Assert.assertArrayEquals(intArray1, intArray54);
        int[] intArray67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray54, intArray67);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1427");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) ' ', (double) (-1));
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1428");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray1, longArray2);
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray4, longArray5);
        org.junit.Assert.assertArrayEquals(longArray1, longArray4);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray8, longArray9);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray11, longArray12);
        org.junit.Assert.assertArrayEquals(longArray8, longArray11);
        org.junit.Assert.assertArrayEquals(longArray1, longArray8);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray16, longArray17);
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray19, longArray20);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray22, longArray23);
        org.junit.Assert.assertArrayEquals(longArray19, longArray22);
        org.junit.Assert.assertArrayEquals(longArray16, longArray22);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray8, longArray16);
        long[] longArray28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray16, longArray28);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1429");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
        org.junit.Assert.assertArrayEquals(longArray2, longArray5);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray10, longArray11);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray13, longArray14);
        org.junit.Assert.assertArrayEquals(longArray10, longArray13);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray17, longArray18);
        org.junit.Assert.assertArrayEquals("hi!", longArray13, longArray18);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray22, longArray23);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray25, longArray26);
        org.junit.Assert.assertArrayEquals(longArray22, longArray25);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray29, longArray30);
        org.junit.Assert.assertArrayEquals("hi!", longArray25, longArray30);
        org.junit.Assert.assertArrayEquals(longArray18, longArray30);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray5, longArray18);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray35, longArray36);
        org.junit.Assert.assertArrayEquals(longArray5, longArray36);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray40, longArray41);
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray43, longArray44);
        org.junit.Assert.assertArrayEquals(longArray40, longArray43);
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray47, longArray48);
        org.junit.Assert.assertArrayEquals("hi!", longArray43, longArray48);
        long[] longArray53 = new long[] {};
        long[] longArray54 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray53, longArray54);
        long[] longArray56 = new long[] {};
        long[] longArray57 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray56, longArray57);
        org.junit.Assert.assertArrayEquals(longArray53, longArray56);
        long[] longArray60 = new long[] {};
        long[] longArray61 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray60, longArray61);
        org.junit.Assert.assertArrayEquals("hi!", longArray56, longArray61);
        long[] longArray65 = new long[] {};
        long[] longArray66 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray65, longArray66);
        long[] longArray68 = new long[] {};
        long[] longArray69 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray68, longArray69);
        org.junit.Assert.assertArrayEquals(longArray65, longArray68);
        long[] longArray72 = new long[] {};
        long[] longArray73 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray72, longArray73);
        org.junit.Assert.assertArrayEquals("hi!", longArray68, longArray73);
        org.junit.Assert.assertArrayEquals(longArray61, longArray73);
        long[] longArray78 = new long[] {};
        long[] longArray79 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray78, longArray79);
        long[] longArray81 = new long[] {};
        long[] longArray82 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray81, longArray82);
        org.junit.Assert.assertArrayEquals(longArray78, longArray81);
        long[] longArray85 = new long[] {};
        long[] longArray86 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray85, longArray86);
        org.junit.Assert.assertArrayEquals("hi!", longArray81, longArray86);
        org.junit.Assert.assertArrayEquals("", longArray61, longArray81);
        org.junit.Assert.assertArrayEquals(longArray43, longArray81);
        org.junit.Assert.assertArrayEquals(longArray5, longArray81);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) longArray5);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1430");
        char[] charArray0 = null;
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        org.junit.Assert.assertArrayEquals("", charArray7, charArray10);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray10, charArray15);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertArrayEquals("", charArray19, charArray22);
        org.junit.Assert.assertArrayEquals(charArray15, charArray22);
        org.junit.Assert.assertArrayEquals("", charArray3, charArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray22);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1431");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.elasticsearch.common.settings.Settings.Builder builder4 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests6.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests6.assertDocsEnumEquals("hi!", postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests6.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader14, (int) (byte) 100, postingsEnum16, postingsEnum17);
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests6.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests6, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests6.assertPositionsSkippingEquals("<unknown>", indexReader23, 6, postingsEnum25, postingsEnum26);
        java.lang.String str28 = commonGramsTokenFilterFactoryTests6.getTestName();
        commonGramsTokenFilterFactoryTests6.setUp();
        commonGramsTokenFilterFactoryTests6.setIndexWriterMaxDocs((int) (byte) -1);
        org.elasticsearch.common.settings.Settings.Builder builder32 = commonGramsTokenFilterFactoryTests6.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests6);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1432");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) strSet8);
        commonGramsTokenFilterFactoryTests2.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1433");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) "tests.maxfailures");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) "tests.monster");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1434");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.badapples", indexReader8, (int) (byte) -1, postingsEnum10, postingsEnum11);
        org.elasticsearch.common.settings.Settings.Builder builder13 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.setUp();
        commonGramsTokenFilterFactoryTests14.tearDown();
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests14.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests14.setIndexWriterMaxDocs(3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests22.ruleChain;
        commonGramsTokenFilterFactoryTests22.setUp();
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests22.ruleChain;
        commonGramsTokenFilterFactoryTests22.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests22.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        commonGramsTokenFilterFactoryTests22.assertTermsEquals("", indexReader29, terms30, terms31, true);
        org.elasticsearch.common.settings.Settings.Builder builder34 = commonGramsTokenFilterFactoryTests22.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests14, (java.lang.Object) builder34);
        commonGramsTokenFilterFactoryTests14.setIndexWriterMaxDocs(5);
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests14.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
        org.junit.Assert.assertNotNull("", (java.lang.Object) commonGramsTokenFilterFactoryTests14);
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests14.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum42, postingsEnum43);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1435");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (short) 100, (long) '4');
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1436");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("", indexReader7, (int) (byte) 1, postingsEnum9, postingsEnum10);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests12.ruleChain;
        commonGramsTokenFilterFactoryTests12.setUp();
        java.lang.String str15 = commonGramsTokenFilterFactoryTests12.getTestName();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests12.assertTermsEquals("<unknown>", indexReader17, terms18, terms19, false);
        commonGramsTokenFilterFactoryTests12.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests12.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsEnumEquals("tests.failfast", postingsEnum25, postingsEnum26, true);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests12.assertFieldsEquals("tests.nightly", indexReader30, fields31, fields32, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (byte) 1, (java.lang.Object) true);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1437");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray6);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray2, (java.lang.Object) (short) 10);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray17);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray17);
        java.lang.String[] strArray22 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray26);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray22, (java.lang.Object[]) strArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray26);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray13);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray13);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray33 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray34 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray35 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray36 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray37 = new org.apache.lucene.util.LuceneTestCase[][] { luceneTestCaseArray33, luceneTestCaseArray34, luceneTestCaseArray35, luceneTestCaseArray36 };
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray38 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray39 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray40 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray41 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray42 = new org.apache.lucene.util.LuceneTestCase[][] { luceneTestCaseArray38, luceneTestCaseArray39, luceneTestCaseArray40, luceneTestCaseArray41 };
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray43 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray44 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray45 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray46 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray47 = new org.apache.lucene.util.LuceneTestCase[][] { luceneTestCaseArray43, luceneTestCaseArray44, luceneTestCaseArray45, luceneTestCaseArray46 };
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray48 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray49 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray50 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray51 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray52 = new org.apache.lucene.util.LuceneTestCase[][] { luceneTestCaseArray48, luceneTestCaseArray49, luceneTestCaseArray50, luceneTestCaseArray51 };
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray53 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray54 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray55 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray56 = new org.apache.lucene.util.LuceneTestCase[] {};
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray57 = new org.apache.lucene.util.LuceneTestCase[][] { luceneTestCaseArray53, luceneTestCaseArray54, luceneTestCaseArray55, luceneTestCaseArray56 };
        org.apache.lucene.util.LuceneTestCase[][][] luceneTestCaseArray58 = new org.apache.lucene.util.LuceneTestCase[][][] { luceneTestCaseArray37, luceneTestCaseArray42, luceneTestCaseArray47, luceneTestCaseArray52, luceneTestCaseArray57 };
        java.util.Set<org.apache.lucene.util.LuceneTestCase[][]> luceneTestCaseArraySet59 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) luceneTestCaseArray58);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1438");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 100L, (double) 10);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1439");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 5, (long) 6);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1440");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", (int) (short) 0, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1441");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray7);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray3, (java.lang.Object[]) strArray7);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray16);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray12, (java.lang.Object[]) strArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray16);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray16, (java.lang.Object[]) strArray21);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray26);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray31);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray31, (java.lang.Object[]) strArray34);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray26, (java.lang.Object[]) strArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray26);
        java.lang.String[] strArray40 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray40);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray44);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray40, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) strArray26, (java.lang.Object[]) strArray47);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests52.ruleChain;
        commonGramsTokenFilterFactoryTests52.setUp();
        org.junit.rules.TestRule testRule55 = commonGramsTokenFilterFactoryTests52.ruleChain;
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        commonGramsTokenFilterFactoryTests52.assertFieldsEquals("tests.maxfailures", indexReader57, fields58, fields59, false);
        java.lang.Class<?> wildcardClass62 = commonGramsTokenFilterFactoryTests52.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests64 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule65 = commonGramsTokenFilterFactoryTests64.ruleChain;
        commonGramsTokenFilterFactoryTests64.setUp();
        commonGramsTokenFilterFactoryTests64.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder68 = commonGramsTokenFilterFactoryTests64.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests64);
        java.lang.Class<?> wildcardClass70 = commonGramsTokenFilterFactoryTests64.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests71 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule72 = commonGramsTokenFilterFactoryTests71.ruleChain;
        commonGramsTokenFilterFactoryTests71.setUp();
        org.junit.rules.TestRule testRule74 = commonGramsTokenFilterFactoryTests71.ruleChain;
        commonGramsTokenFilterFactoryTests71.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests71.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        commonGramsTokenFilterFactoryTests71.assertDocsEnumEquals("hi!", postingsEnum78, postingsEnum79, true);
        java.lang.Class<?> wildcardClass82 = commonGramsTokenFilterFactoryTests71.getClass();
        java.lang.reflect.Type[] typeArray83 = new java.lang.reflect.Type[] { wildcardClass62, wildcardClass70, wildcardClass82 };
        java.util.Set<java.lang.reflect.Type> typeSet84 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray83);
        org.junit.Assert.assertNotNull((java.lang.Object) typeArray83);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests86 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule87 = commonGramsTokenFilterFactoryTests86.ruleChain;
        commonGramsTokenFilterFactoryTests86.setUp();
        commonGramsTokenFilterFactoryTests86.tearDown();
        commonGramsTokenFilterFactoryTests86.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) typeArray83, (java.lang.Object) commonGramsTokenFilterFactoryTests86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) strArray26, (java.lang.Object[]) typeArray83);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1442");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray7);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray7);
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray4);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) strArray4, (java.lang.Object) "tests.monster");
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray20);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray29);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray25, (java.lang.Object[]) strArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray16, (java.lang.Object[]) strArray29);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray34);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray39);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray44);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray39, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray34, (java.lang.Object[]) strArray39);
        java.lang.String[] strArray54 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet55 = org.apache.lucene.util.LuceneTestCase.asSet(strArray54);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray54);
        java.lang.String[] strArray59 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet60 = org.apache.lucene.util.LuceneTestCase.asSet(strArray59);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray59);
        java.lang.String[] strArray62 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArray62);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray59, (java.lang.Object[]) strArray62);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray54, (java.lang.Object[]) strArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray39, (java.lang.Object[]) strArray62);
        java.lang.String[] strArray68 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet69 = org.apache.lucene.util.LuceneTestCase.asSet(strArray68);
        java.lang.String[] strArray71 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet72 = org.apache.lucene.util.LuceneTestCase.asSet(strArray71);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray71);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray68, (java.lang.Object[]) strArray71);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray62, (java.lang.Object[]) strArray71);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray71);
        short[] shortArray82 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray88 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray94 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[][] shortArray95 = new short[][] { shortArray82, shortArray88, shortArray94 };
        java.util.Set<short[]> shortArraySet96 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray95);
        java.util.Set<short[]> shortArraySet97 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray95);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray71, (java.lang.Object[]) shortArray95);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1443");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 100L, (long) (byte) 10);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1444");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, (double) (-1));
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1445");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals(intArray2, intArray5);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        org.junit.Assert.assertArrayEquals(intArray9, intArray12);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray2, intArray9);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        org.junit.Assert.assertArrayEquals(intArray18, intArray21);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals(intArray26, intArray29);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        org.junit.Assert.assertArrayEquals(intArray33, intArray36);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray29, intArray36);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray18, intArray29);
        org.junit.Assert.assertArrayEquals(intArray2, intArray18);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        org.junit.Assert.assertArrayEquals(intArray47, intArray50);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray55, intArray56);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray58, intArray59);
        org.junit.Assert.assertArrayEquals(intArray55, intArray58);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray62, intArray63);
        int[] intArray65 = new int[] {};
        int[] intArray66 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray65, intArray66);
        org.junit.Assert.assertArrayEquals(intArray62, intArray65);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray58, intArray65);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray47, intArray58);
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray72, intArray73);
        int[] intArray75 = new int[] {};
        int[] intArray76 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray75, intArray76);
        org.junit.Assert.assertArrayEquals(intArray72, intArray75);
        int[] intArray80 = new int[] {};
        int[] intArray81 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray80, intArray81);
        int[] intArray83 = new int[] {};
        int[] intArray84 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray83, intArray84);
        org.junit.Assert.assertArrayEquals(intArray80, intArray83);
        int[] intArray87 = new int[] {};
        int[] intArray88 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray87, intArray88);
        int[] intArray90 = new int[] {};
        int[] intArray91 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray90, intArray91);
        org.junit.Assert.assertArrayEquals(intArray87, intArray90);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray83, intArray90);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray72, intArray83);
        org.junit.Assert.assertArrayEquals(intArray58, intArray72);
        org.junit.Assert.assertArrayEquals(intArray44, intArray58);
        org.junit.Assert.assertArrayEquals("", intArray2, intArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray2);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1446");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) (byte) 100, postingsEnum10, postingsEnum11);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests0.ruleChain;
        java.lang.Object obj14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule13, obj14);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1447");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.maxfailures", indexReader6, fields7, fields8, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        java.lang.String str12 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("<unknown>", indexReader14, (int) (short) 0, postingsEnum16, postingsEnum17);
        commonGramsTokenFilterFactoryTests1.tearDown();
        java.lang.Class<?> wildcardClass20 = commonGramsTokenFilterFactoryTests1.getClass();
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray21, longArray22);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray24, longArray25);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray27, longArray28);
        org.junit.Assert.assertArrayEquals(longArray25, longArray28);
        org.junit.Assert.assertArrayEquals(longArray21, longArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) wildcardClass20, (java.lang.Object) longArray25);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1448");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals(intArray2, intArray5);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        org.junit.Assert.assertArrayEquals(intArray9, intArray12);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray5, intArray12);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals(intArray21, intArray24);
        org.junit.Assert.assertArrayEquals("random", intArray19, intArray21);
        org.junit.Assert.assertArrayEquals("random", intArray5, intArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray5);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1449");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (double) (-1.0f), (double) 0L, (double) 1L);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1450");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.maxfailures", indexReader6, fields7, fields8, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests16.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests16, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests16.setUp();
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests16, (java.lang.Object) strSet22);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests29.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests29, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests29.setUp();
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests29, (java.lang.Object) strSet35);
        java.lang.String[] strArray37 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet38 = org.apache.lucene.util.LuceneTestCase.asSet(strArray37);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests41 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests41.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests41, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests41.setUp();
        java.lang.String[] strArray46 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests41, (java.lang.Object) strSet47);
        java.util.Set[] setArray50 = new java.util.Set[6];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray51 = (java.util.Set<java.lang.String>[]) setArray50;
        strSetArray51[0] = strSet13;
        strSetArray51[1] = strSet22;
        strSetArray51[2] = strSet26;
        strSetArray51[3] = strSet35;
        strSetArray51[4] = strSet38;
        strSetArray51[5] = strSet47;
        java.util.Set<java.util.Set<java.lang.String>> strSetSet64 = org.apache.lucene.util.LuceneTestCase.asSet(strSetArray51);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) strSetSet64);
        java.lang.Object obj66 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) commonGramsTokenFilterFactoryTests1, obj66);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1451");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder3 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum5, postingsEnum6);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1452");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("hi!", postingsEnum6, postingsEnum7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) (byte) 100, postingsEnum13, postingsEnum14);
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("<unknown>", indexReader20, 6, postingsEnum22, postingsEnum23);
        double[] doubleArray31 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray38 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray38, (double) 100.0f);
        double[] doubleArray47 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray54 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray54, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray47, (double) 4);
        double[] doubleArray65 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray72 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray72, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray65, (double) (byte) 0);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) doubleArray65);
        double[] doubleArray84 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray91 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray84, doubleArray91, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray65, doubleArray84, 100.0d);
        double[] doubleArray96 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray65, doubleArray96, (double) 100.0f);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1453");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, 0.0d, (double) 6);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1454");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (long) 5, (long) 5);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1455");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1456");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray6);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray9);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray9, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray23);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray19, (java.lang.Object[]) strArray23);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray23, (java.lang.Object) 1.0d);
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray32);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray32, (java.lang.Object[]) strArray35);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray35, (java.lang.Object[]) strArray38);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray23, (java.lang.Object[]) strArray35);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray12, (java.lang.Object[]) strArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, strArray35);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1457");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (short) 0, (double) 4);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1458");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) -1, (double) 1L);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1459");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) 1, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1460");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs(2);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1461");
        float[] floatArray2 = new float[] { (short) 1 };
        float[] floatArray4 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray4, (float) '#');
        float[] floatArray8 = new float[] { (short) 1 };
        float[] floatArray10 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray10, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray8, (float) '4');
        float[] floatArray16 = new float[] { (short) 1 };
        float[] floatArray18 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray18, (float) '#');
        float[] floatArray22 = new float[] { (short) 1 };
        float[] floatArray24 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray24, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray22, (float) '4');
        float[] floatArray30 = new float[] { (short) 1 };
        float[] floatArray32 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray32, (float) '#');
        float[] floatArray36 = new float[] { (short) 1 };
        float[] floatArray38 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray38, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray36, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray30, (float) (-1L));
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray30, 0.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests47 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests47.setUp();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        commonGramsTokenFilterFactoryTests47.assertTermsEquals("tests.weekly", indexReader50, terms51, terms52, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) floatArray30, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1462");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder4 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("<unknown>", indexReader7, terms8, terms9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("hi!", indexReader13, fields14, fields15, true);
        java.lang.Object obj18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "hi!", obj18);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1463");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("<unknown>", obj1);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1464");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) 1, (long) (byte) 100);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1465");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("<unknown>", (long) (short) 100, 100L);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1466");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.badapples", postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("", indexReader12, (int) (short) 1, postingsEnum14, postingsEnum15);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests19.ruleChain;
        commonGramsTokenFilterFactoryTests19.setUp();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("tests.maxfailures", indexReader24, fields25, fields26, false);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsEnumEquals("tests.slow", postingsEnum30, postingsEnum31, false);
        commonGramsTokenFilterFactoryTests19.tearDown();
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests19.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) testRule35);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1467");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader9, (int) (byte) 100, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.failfast", indexReader15, terms16, terms17, true);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray26);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray23, (java.lang.Object[]) strArray26);
        java.util.Set<java.io.Serializable> serializableSet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray23);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) strArray23, (java.lang.Object) "tests.monster");
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray38);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray34, (java.lang.Object[]) strArray38);
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray47);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray43, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray34, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) strArray23, (java.lang.Object[]) strArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) indexReader15, (java.lang.Object) strArray23);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1468");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray6);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray6);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray15);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray11, (java.lang.Object[]) strArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) strArray15);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray15, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray25);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray30);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray30, (java.lang.Object[]) strArray33);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray25, (java.lang.Object[]) strArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray25);
        java.lang.String[] strArray40 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray40);
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray43);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray40, (java.lang.Object[]) strArray43);
        java.util.Set<java.io.Serializable> serializableSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray40);
        java.lang.String[] strArray49 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        java.lang.String[] strArray52 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray52);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray49, (java.lang.Object[]) strArray52);
        java.util.Set<java.io.Serializable> serializableSet56 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray49);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray40, (java.lang.Object[]) strArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray49);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests61 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule62 = commonGramsTokenFilterFactoryTests61.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests61, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests61.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests61);
        commonGramsTokenFilterFactoryTests61.setIndexWriterMaxDocs(2);
        commonGramsTokenFilterFactoryTests61.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        commonGramsTokenFilterFactoryTests61.assertFieldsEquals("tests.awaitsfix", indexReader72, fields73, fields74, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) strArray20, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1469");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("hi!", indexReader9, fields10, fields11, true);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.nightly", indexReader15, fields16, fields17, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(obj0, (java.lang.Object) indexReader15);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1470");
        float[] floatArray4 = new float[] { (short) 1 };
        float[] floatArray6 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray6, (float) '#');
        float[] floatArray10 = new float[] { (short) 1 };
        float[] floatArray12 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray12, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray10, (float) '4');
        float[] floatArray18 = new float[] { (short) 1 };
        float[] floatArray20 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray20, (float) '#');
        float[] floatArray24 = new float[] { (short) 1 };
        float[] floatArray26 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray26, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray24, (float) '4');
        org.junit.Assert.assertArrayEquals("hi!", floatArray10, floatArray24, 1.0f);
        float[] floatArray35 = new float[] { (short) 1 };
        float[] floatArray37 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray37, (float) '#');
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule41 = commonGramsTokenFilterFactoryTests40.ruleChain;
        commonGramsTokenFilterFactoryTests40.setUp();
        org.junit.rules.TestRule testRule43 = commonGramsTokenFilterFactoryTests40.ruleChain;
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        commonGramsTokenFilterFactoryTests40.assertFieldsEquals("tests.maxfailures", indexReader45, fields46, fields47, false);
        commonGramsTokenFilterFactoryTests40.tearDown();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) floatArray37, (java.lang.Object) commonGramsTokenFilterFactoryTests40);
        float[] floatArray53 = new float[] { (short) 1 };
        float[] floatArray55 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray55, (float) '#');
        float[] floatArray59 = new float[] { (short) 1 };
        float[] floatArray61 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray61, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray59, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray53, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray24, floatArray53, 0.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests71 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule72 = commonGramsTokenFilterFactoryTests71.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests71, (java.lang.Object) (-1L));
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests77 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule78 = commonGramsTokenFilterFactoryTests77.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests77, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests77.setUp();
        java.lang.String[] strArray82 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet83 = org.apache.lucene.util.LuceneTestCase.asSet(strArray82);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests77, (java.lang.Object) strSet83);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests71, (java.lang.Object) "enwiki.random.lines.txt");
        commonGramsTokenFilterFactoryTests71.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests71.setIndexWriterMaxDocs(4);
        org.elasticsearch.common.settings.Settings.Builder builder89 = commonGramsTokenFilterFactoryTests71.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule90 = commonGramsTokenFilterFactoryTests71.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) "tests.maxfailures", (java.lang.Object) testRule90);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1471");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) strSet8);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("", postingsEnum11, postingsEnum12, false);
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.nightly", indexReader17, (int) (byte) 100, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("", indexReader23, terms24, terms25, false);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1472");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (-1.0d));
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1473");
        double[] doubleArray6 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray13 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray13, (double) 100.0f);
        double[] doubleArray22 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray29 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray29, (double) 100.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray22, (double) (byte) 1);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1474");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader6, 1, postingsEnum8, postingsEnum9);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1475");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str6 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.badapples", indexReader8, terms9, terms10, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests13.ruleChain;
        commonGramsTokenFilterFactoryTests13.setUp();
        commonGramsTokenFilterFactoryTests13.tearDown();
        commonGramsTokenFilterFactoryTests13.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests13.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests13.setIndexWriterMaxDocs(3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests21.ruleChain;
        commonGramsTokenFilterFactoryTests21.setUp();
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests21.ruleChain;
        commonGramsTokenFilterFactoryTests21.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests21.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        commonGramsTokenFilterFactoryTests21.assertTermsEquals("", indexReader28, terms29, terms30, true);
        org.elasticsearch.common.settings.Settings.Builder builder33 = commonGramsTokenFilterFactoryTests21.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) builder33);
        commonGramsTokenFilterFactoryTests13.setIndexWriterMaxDocs(5);
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests13.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule41 = commonGramsTokenFilterFactoryTests40.ruleChain;
        commonGramsTokenFilterFactoryTests40.setUp();
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray47);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests40, (java.lang.Object) strArray44);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests40);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) commonGramsTokenFilterFactoryTests40);
        commonGramsTokenFilterFactoryTests40.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) "tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests40);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1476");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) (short) 10);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1477");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, 10.0d);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1478");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (short) 10, (double) (byte) 10);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1479");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray6);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray3, (java.lang.Object[]) strArray6);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray15);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray11, (java.lang.Object[]) strArray15);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray24);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) strArray24);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray24, (java.lang.Object[]) strArray29);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray34);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray39);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray39, (java.lang.Object[]) strArray42);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray34, (java.lang.Object[]) strArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray34);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray3, (java.lang.Object[]) strArray29);
        java.lang.Object obj48 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) "tests.awaitsfix", obj48);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1480");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum12, postingsEnum13, true);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (short) 0, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1481");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (-1), (double) 6, 0.0d);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1482");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (double) 1, (double) (byte) 0, 1.0d);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1483");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 2, (double) 10L);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1484");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, 0.0d);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1485");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum7, postingsEnum8, false);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests12.ruleChain;
        commonGramsTokenFilterFactoryTests12.setUp();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests12.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) testRule15);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1486");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray6);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray3, (java.lang.Object[]) strArray6);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray15);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray11, (java.lang.Object[]) strArray15);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray3, (java.lang.Object[]) strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray22);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray22, (java.lang.Object[]) strArray25);
        java.lang.Class<?> wildcardClass28 = strArray22.getClass();
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray31);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray31, (java.lang.Object[]) strArray34);
        java.lang.Class<?> wildcardClass37 = strArray31.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule40 = commonGramsTokenFilterFactoryTests39.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests39, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests39.setUp();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests39.assertPositionsSkippingEquals("", indexReader45, (int) (byte) 1, postingsEnum47, postingsEnum48);
        java.lang.Class<?> wildcardClass50 = commonGramsTokenFilterFactoryTests39.getClass();
        java.lang.String[] strArray53 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray53);
        java.lang.String[] strArray56 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray53, (java.lang.Object[]) strArray56);
        java.lang.Class<?> wildcardClass59 = strArray53.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray60 = new java.lang.reflect.AnnotatedElement[] { wildcardClass28, wildcardClass37, wildcardClass50, wildcardClass59 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet61 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray60);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests63 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule64 = commonGramsTokenFilterFactoryTests63.ruleChain;
        commonGramsTokenFilterFactoryTests63.setUp();
        commonGramsTokenFilterFactoryTests63.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder67 = commonGramsTokenFilterFactoryTests63.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests63);
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        commonGramsTokenFilterFactoryTests63.assertDocsEnumEquals("<unknown>", postingsEnum70, postingsEnum71, true);
        org.junit.Assert.assertNotEquals((java.lang.Object) annotatedElementArray60, (java.lang.Object) postingsEnum70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray15, (java.lang.Object[]) annotatedElementArray60);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1487");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        java.lang.String str5 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader7, fields8, fields9, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests13.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsEnumEquals("hi!", postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests13.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, (int) (byte) 100, postingsEnum23, postingsEnum24);
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests13.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests13.assertPositionsSkippingEquals("<unknown>", indexReader30, 6, postingsEnum32, postingsEnum33);
        java.lang.String str35 = commonGramsTokenFilterFactoryTests13.getTestName();
        commonGramsTokenFilterFactoryTests13.setUp();
        commonGramsTokenFilterFactoryTests13.setIndexWriterMaxDocs(3);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 3);
        org.elasticsearch.common.settings.Settings.Builder builder40 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum42, postingsEnum43);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1488");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray7);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray7);
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray4);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) strArray4, (java.lang.Object) "tests.monster");
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray20);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray29);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray25, (java.lang.Object[]) strArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray16, (java.lang.Object[]) strArray29);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray34);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray39);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray44);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray39, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray34, (java.lang.Object[]) strArray39);
        java.lang.String[] strArray54 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet55 = org.apache.lucene.util.LuceneTestCase.asSet(strArray54);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray54);
        java.lang.String[] strArray59 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet60 = org.apache.lucene.util.LuceneTestCase.asSet(strArray59);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray59);
        java.lang.String[] strArray62 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArray62);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray59, (java.lang.Object[]) strArray62);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray54, (java.lang.Object[]) strArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray39, (java.lang.Object[]) strArray62);
        java.lang.String[] strArray68 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet69 = org.apache.lucene.util.LuceneTestCase.asSet(strArray68);
        java.lang.String[] strArray71 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet72 = org.apache.lucene.util.LuceneTestCase.asSet(strArray71);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray71);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray68, (java.lang.Object[]) strArray71);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray62, (java.lang.Object[]) strArray71);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray71);
        long[][] longArray77 = new long[][] {};
        java.util.Set<long[]> longArraySet78 = org.apache.lucene.util.LuceneTestCase.asSet(longArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) strArray71, (java.lang.Object) longArraySet78);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1489");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests5.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsEnumEquals("hi!", postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests5.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader13, (int) (byte) 100, postingsEnum15, postingsEnum16);
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests5.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests5.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests20.ruleChain;
        commonGramsTokenFilterFactoryTests20.setUp();
        commonGramsTokenFilterFactoryTests20.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests26.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests26, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests26.setUp();
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests26, (java.lang.Object) strSet32);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule36 = commonGramsTokenFilterFactoryTests35.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsEnumEquals("hi!", postingsEnum38, postingsEnum39, false);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests35.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader43, (int) (byte) 100, postingsEnum45, postingsEnum46);
        org.junit.rules.TestRule testRule48 = commonGramsTokenFilterFactoryTests35.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests35, (java.lang.Object) 100L);
        org.elasticsearch.test.ESTokenStreamTestCase[] eSTokenStreamTestCaseArray51 = new org.elasticsearch.test.ESTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests1, commonGramsTokenFilterFactoryTests5, commonGramsTokenFilterFactoryTests20, commonGramsTokenFilterFactoryTests26, commonGramsTokenFilterFactoryTests35 };
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase> eSTokenStreamTestCaseSet52 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray51);
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase> eSTokenStreamTestCaseSet53 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray51);
        java.lang.Class<?> wildcardClass54 = eSTokenStreamTestCaseArray51.getClass();
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray56);
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray59, byteArray60);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray63);
        org.junit.Assert.assertArrayEquals("", byteArray60, byteArray62);
        long[] longArray66 = new long[] {};
        long[] longArray67 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray66, longArray67);
        long[] longArray69 = new long[] {};
        long[] longArray70 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray69, longArray70);
        long[] longArray72 = new long[] {};
        long[] longArray73 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray72, longArray73);
        org.junit.Assert.assertArrayEquals(longArray69, longArray72);
        org.junit.Assert.assertArrayEquals(longArray66, longArray72);
        byte[] byteArray77 = new byte[] {};
        byte[] byteArray78 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray77, byteArray78);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray72, (java.lang.Object) byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray60, byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray77);
        byte[] byteArray84 = new byte[] {};
        byte[] byteArray85 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray84, byteArray85);
        byte[] byteArray87 = new byte[] {};
        byte[] byteArray88 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray87, byteArray88);
        org.junit.Assert.assertArrayEquals("", byteArray84, byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) eSTokenStreamTestCaseArray51, (java.lang.Object) byteArray88);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1490");
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray1 = new org.apache.lucene.util.LuceneTestCase[][] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray1);
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray1);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray9);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray9);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray15);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray20);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray23);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray15, (java.lang.Object[]) strArray23);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray33);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray33);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray33, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray23, (java.lang.Object[]) strArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray9, (java.lang.Object[]) strArray23);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) strArray23);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) luceneTestCaseArray1, (java.lang.Object[]) strArray23);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests44 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests44.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests44, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests44.setUp();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests44.assertPositionsSkippingEquals("", indexReader50, (int) (byte) 1, postingsEnum52, postingsEnum53);
        java.lang.Class<?> wildcardClass55 = commonGramsTokenFilterFactoryTests44.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests56 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule57 = commonGramsTokenFilterFactoryTests56.ruleChain;
        commonGramsTokenFilterFactoryTests56.setUp();
        org.junit.rules.TestRule testRule59 = commonGramsTokenFilterFactoryTests56.ruleChain;
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        commonGramsTokenFilterFactoryTests56.assertFieldsEquals("tests.maxfailures", indexReader61, fields62, fields63, false);
        java.lang.Class<?> wildcardClass66 = commonGramsTokenFilterFactoryTests56.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests68 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule69 = commonGramsTokenFilterFactoryTests68.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests68, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests68.setUp();
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        commonGramsTokenFilterFactoryTests68.assertPositionsSkippingEquals("", indexReader74, (int) (byte) 1, postingsEnum76, postingsEnum77);
        java.lang.Class<?> wildcardClass79 = commonGramsTokenFilterFactoryTests68.getClass();
        java.lang.String[] strArray82 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet83 = org.apache.lucene.util.LuceneTestCase.asSet(strArray82);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray82);
        java.lang.String[] strArray85 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet86 = org.apache.lucene.util.LuceneTestCase.asSet(strArray85);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray82, (java.lang.Object[]) strArray85);
        java.lang.Class<?> wildcardClass88 = strArray82.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray89 = new java.lang.reflect.GenericDeclaration[] { wildcardClass55, wildcardClass66, wildcardClass79, wildcardClass88 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet90 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray89);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet91 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[]) genericDeclarationArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) luceneTestCaseArray1, (java.lang.Object[]) genericDeclarationArray89);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1491");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 100.0d, (double) 10L);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1492");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 3, (double) (-1), 0.0d);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1493");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray8);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray8, (java.lang.Object) 1.0d);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray17);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray17, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray23);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray20);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray8);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsEnumEquals("tests.failfast", postingsEnum31, postingsEnum32, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) strArray8, (java.lang.Object) true);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1494");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray6, byteArray10);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray18);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        org.junit.Assert.assertArrayEquals("", byteArray18, byteArray20);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray24, longArray25);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray27, longArray28);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray30, longArray31);
        org.junit.Assert.assertArrayEquals(longArray27, longArray30);
        org.junit.Assert.assertArrayEquals(longArray24, longArray30);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray36);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray30, (java.lang.Object) byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray35);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray43);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray46);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray42, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray46);
        org.junit.Assert.assertArrayEquals("hi!", byteArray6, byteArray46);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray1, byteArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1495");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (-1), (double) (-1));
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1496");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray8);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) strArray5);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray15);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray20);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray23);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray15, (java.lang.Object[]) strArray23);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray33);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray33);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray33, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray23, (java.lang.Object[]) strArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray23);
        java.lang.Object[] objArray41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray23, objArray41);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1497");
        long[] longArray1 = null;
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray4, longArray5);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray7, longArray8);
        org.junit.Assert.assertArrayEquals(longArray4, longArray7);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray11, longArray12);
        org.junit.Assert.assertArrayEquals("hi!", longArray7, longArray12);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray16, longArray17);
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray19, longArray20);
        org.junit.Assert.assertArrayEquals(longArray16, longArray19);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray24, longArray25);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray27, longArray28);
        org.junit.Assert.assertArrayEquals(longArray24, longArray27);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray31, longArray32);
        org.junit.Assert.assertArrayEquals("hi!", longArray27, longArray32);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray37, longArray38);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray40, longArray41);
        org.junit.Assert.assertArrayEquals(longArray37, longArray40);
        long[] longArray44 = new long[] {};
        long[] longArray45 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray44, longArray45);
        org.junit.Assert.assertArrayEquals("hi!", longArray40, longArray45);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray49, longArray50);
        long[] longArray52 = new long[] {};
        long[] longArray53 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray52, longArray53);
        org.junit.Assert.assertArrayEquals(longArray49, longArray52);
        long[] longArray56 = new long[] {};
        long[] longArray57 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray56, longArray57);
        org.junit.Assert.assertArrayEquals("hi!", longArray52, longArray57);
        org.junit.Assert.assertArrayEquals(longArray45, longArray57);
        long[] longArray62 = new long[] {};
        long[] longArray63 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray62, longArray63);
        long[] longArray65 = new long[] {};
        long[] longArray66 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray65, longArray66);
        org.junit.Assert.assertArrayEquals(longArray62, longArray65);
        long[] longArray69 = new long[] {};
        long[] longArray70 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray69, longArray70);
        org.junit.Assert.assertArrayEquals("hi!", longArray65, longArray70);
        org.junit.Assert.assertArrayEquals("", longArray45, longArray65);
        org.junit.Assert.assertArrayEquals(longArray27, longArray65);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray19, longArray65);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray12, longArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray1, longArray12);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1498");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader9, (int) (byte) 100, postingsEnum11, postingsEnum12);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule14;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests17.ruleChain;
        commonGramsTokenFilterFactoryTests17.setUp();
        java.lang.String str20 = commonGramsTokenFilterFactoryTests17.getTestName();
        commonGramsTokenFilterFactoryTests17.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests17.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) 100, (java.lang.Object) commonGramsTokenFilterFactoryTests17);
        commonGramsTokenFilterFactoryTests17.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) testRule14, (java.lang.Object) commonGramsTokenFilterFactoryTests17);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1499");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader9, (int) (byte) 100, postingsEnum11, postingsEnum12);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("<unknown>", indexReader18, 6, postingsEnum20, postingsEnum21);
        java.lang.String str23 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(3);
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1500");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader9, (int) (byte) 100, postingsEnum11, postingsEnum12);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("<unknown>", indexReader18, 6, postingsEnum20, postingsEnum21);
        java.lang.String str23 = commonGramsTokenFilterFactoryTests1.getTestName();
        java.lang.String str24 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.awaitsfix", indexReader26, terms27, terms28, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests33.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests33.assertDocsEnumEquals("hi!", postingsEnum36, postingsEnum37, false);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests33.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader41, (int) (byte) 100, postingsEnum43, postingsEnum44);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        commonGramsTokenFilterFactoryTests33.assertFieldsEquals("tests.nightly", indexReader47, fields48, fields49, true);
        commonGramsTokenFilterFactoryTests33.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests33.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests33);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests55 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule56 = commonGramsTokenFilterFactoryTests55.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        commonGramsTokenFilterFactoryTests55.assertDocsEnumEquals("tests.failfast", postingsEnum58, postingsEnum59, false);
        commonGramsTokenFilterFactoryTests55.setUp();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests33, (java.lang.Object) commonGramsTokenFilterFactoryTests55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "enwiki.random.lines.txt");
    }
}

