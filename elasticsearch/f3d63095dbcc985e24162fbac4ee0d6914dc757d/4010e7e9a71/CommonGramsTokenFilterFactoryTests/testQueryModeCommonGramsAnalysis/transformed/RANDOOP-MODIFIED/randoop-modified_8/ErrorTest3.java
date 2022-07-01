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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (short) 100, (double) 1.0f, (double) (byte) 10);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1502");
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
        float[] floatArray22 = new float[] { (short) 1 };
        float[] floatArray24 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray24, (float) '#');
        float[] floatArray28 = new float[] { (short) 1 };
        float[] floatArray30 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray30, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray24, floatArray28, (float) 100);
        float[] floatArray38 = new float[] { (short) 1 };
        float[] floatArray40 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray40, (float) '#');
        float[] floatArray44 = new float[] { (short) 1 };
        float[] floatArray46 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray46, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray40, floatArray44, (float) 100);
        float[] floatArray52 = new float[] { (short) 1 };
        float[] floatArray54 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray54, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray40, floatArray54, (float) 3);
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray40, (float) (short) 1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests61 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule62 = commonGramsTokenFilterFactoryTests61.ruleChain;
        commonGramsTokenFilterFactoryTests61.setUp();
        commonGramsTokenFilterFactoryTests61.tearDown();
        commonGramsTokenFilterFactoryTests61.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests61.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests61.setIndexWriterMaxDocs(3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests69 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule70 = commonGramsTokenFilterFactoryTests69.ruleChain;
        commonGramsTokenFilterFactoryTests69.setUp();
        org.junit.rules.TestRule testRule72 = commonGramsTokenFilterFactoryTests69.ruleChain;
        commonGramsTokenFilterFactoryTests69.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests69.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.Terms terms77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        commonGramsTokenFilterFactoryTests69.assertTermsEquals("", indexReader76, terms77, terms78, true);
        org.elasticsearch.common.settings.Settings.Builder builder81 = commonGramsTokenFilterFactoryTests69.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests61, (java.lang.Object) builder81);
        java.lang.Class<?> wildcardClass83 = builder81.getClass();
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) floatArray24, (java.lang.Object) wildcardClass83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) wildcardClass83);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1503");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests4.ruleChain;
        commonGramsTokenFilterFactoryTests4.setUp();
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests4.ruleChain;
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("tests.badapples", indexReader11, (int) (byte) -1, postingsEnum13, postingsEnum14);
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) byteArray1, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1504");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals("", byteArray3, byteArray5);
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
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray20);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals("", byteArray30, byteArray32);
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray36, longArray37);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray39, longArray40);
        long[] longArray42 = new long[] {};
        long[] longArray43 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray42, longArray43);
        org.junit.Assert.assertArrayEquals(longArray39, longArray42);
        org.junit.Assert.assertArrayEquals(longArray36, longArray42);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray48);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray42, (java.lang.Object) byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray47);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray57);
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray59, byteArray60);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray56, byteArray60);
        byte[] byteArray64 = new byte[] {};
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray66, byteArray67);
        byte[] byteArray69 = new byte[] {};
        byte[] byteArray70 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray69, byteArray70);
        org.junit.Assert.assertArrayEquals("", byteArray67, byteArray69);
        long[] longArray73 = new long[] {};
        long[] longArray74 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray73, longArray74);
        long[] longArray76 = new long[] {};
        long[] longArray77 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray76, longArray77);
        long[] longArray79 = new long[] {};
        long[] longArray80 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray79, longArray80);
        org.junit.Assert.assertArrayEquals(longArray76, longArray79);
        org.junit.Assert.assertArrayEquals(longArray73, longArray79);
        byte[] byteArray84 = new byte[] {};
        byte[] byteArray85 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray84, byteArray85);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray79, (java.lang.Object) byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray84);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray64, byteArray67);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray56, byteArray64);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray20, byteArray64);
        byte[] byteArray92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray92);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1505");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) (-1.0f));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1506");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("<unknown>", indexReader6, fields7, fields8, true);
        java.lang.String str11 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests12.setUp();
        commonGramsTokenFilterFactoryTests12.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests12.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) builder15);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1507");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals("", byteArray3, byteArray7);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray10, longArray11);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray13, longArray14);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray16, longArray17);
        org.junit.Assert.assertArrayEquals(longArray13, longArray16);
        org.junit.Assert.assertArrayEquals(longArray10, longArray16);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray22);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray16, (java.lang.Object) byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray21);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1508");
        double[] doubleArray7 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray14 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray14, (double) 100.0f);
        double[] doubleArray23 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray30 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray30, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray23, (double) 4);
        double[] doubleArray42 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray49 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray49, (double) 100.0f);
        double[] doubleArray58 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray65 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray65, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray58, (double) 4);
        double[] doubleArray76 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray83 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray76, doubleArray83, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray58, doubleArray76, 1.0d);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray76, (double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) doubleArray76, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1509");
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray12, intArray19);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray1, intArray12);
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
        org.junit.Assert.assertArrayEquals(intArray12, intArray26);
        int[] intArray51 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray26, intArray51);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1510");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        commonGramsTokenFilterFactoryTests3.setUp();
        commonGramsTokenFilterFactoryTests3.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        java.lang.Class<?> wildcardClass9 = commonGramsTokenFilterFactoryTests3.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests3);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1511");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) ' ', (double) 1);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1512");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) '4', (float) (byte) 0, (float) (byte) 0);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1513");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) (short) 0);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1514");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder4 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) builder4);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1515");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) '4', (double) 1.0f);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1516");
        float[] floatArray0 = null;
        float[] floatArray3 = new float[] { (short) 1 };
        float[] floatArray5 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray5, (float) '#');
        java.lang.Object obj8 = null;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) floatArray3, obj8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray3, (float) 5);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1517");
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
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader17, 6, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1518");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1519");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1, (float) 4, 0.0f);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1520");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (short) -1, (double) (short) 100);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1521");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.nightly", obj1);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1522");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (long) (byte) 1, (long) (byte) 1);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1523");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) (-1L), 10.0f, (float) (short) 1);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1524");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) 3);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1525");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("hi!", postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader10, (int) (byte) 100, postingsEnum12, postingsEnum13);
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("<unknown>", indexReader19, 6, postingsEnum21, postingsEnum22);
        java.lang.String str24 = commonGramsTokenFilterFactoryTests2.getTestName();
        java.lang.String str25 = commonGramsTokenFilterFactoryTests2.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1526");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray7);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray16);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray21);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray21, (java.lang.Object[]) strArray24);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray24);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) 10.0d, (java.lang.Object) strArray16);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) strArray16);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray35);
        java.lang.String[] strArray40 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray40);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray40);
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray40, (java.lang.Object[]) strArray43);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray35, (java.lang.Object[]) strArray43);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) 10.0d, (java.lang.Object) strArray35);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) strArray35);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray35);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) strArray4, (java.lang.Object) strArray16);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray51 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests> commonGramsTokenFilterFactoryTestsSet52 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray51);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray51);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests55 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule56 = commonGramsTokenFilterFactoryTests55.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests55, (java.lang.Object) (-1L));
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        commonGramsTokenFilterFactoryTests55.assertPositionsSkippingEquals("", indexReader60, 4, postingsEnum62, postingsEnum63);
        org.junit.rules.TestRule testRule65 = commonGramsTokenFilterFactoryTests55.ruleChain;
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        commonGramsTokenFilterFactoryTests55.assertPositionsSkippingEquals("hi!", indexReader67, (int) 'a', postingsEnum69, postingsEnum70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTestsArray51, (java.lang.Object) 'a');
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1527");
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
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1528");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet2 = org.apache.lucene.util.LuceneTestCase.asSet(strArray1);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray4);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray1, (java.lang.Object[]) strArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArray4);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1529");
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
        long[] longArray80 = new long[] {};
        long[] longArray81 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray80, longArray81);
        long[] longArray83 = new long[] {};
        long[] longArray84 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray83, longArray84);
        long[] longArray86 = new long[] {};
        long[] longArray87 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray86, longArray87);
        org.junit.Assert.assertArrayEquals(longArray83, longArray86);
        org.junit.Assert.assertArrayEquals(longArray80, longArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) floatArray2, (java.lang.Object) longArray86);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1530");
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
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("random", indexReader24, (int) ' ', postingsEnum26, postingsEnum27);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum30, postingsEnum31);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1531");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.badapples", true);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1532");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("hi!", postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader10, (int) (byte) 100, postingsEnum12, postingsEnum13);
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("tests.maxfailures", indexReader17, 2, postingsEnum19, postingsEnum20, false);
        java.lang.String str23 = commonGramsTokenFilterFactoryTests2.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1533");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        java.lang.String str2 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("", 0, numericDocValues7, numericDocValues8);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1534");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) "tests.maxfailures");
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1535");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        java.lang.String str5 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("hi!", indexReader7, terms8, terms9, false);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1536");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) -1);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1537");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (-1L), (double) (byte) 100);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1538");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.weekly", indexReader10, (int) '#', postingsEnum12, postingsEnum13);
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("europarl.lines.txt.gz", 100, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1539");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.String str5 = commonGramsTokenFilterFactoryTests2.getTestName();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", obj1, (java.lang.Object) builder8);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1540");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (double) (byte) -1, (-1.0d), (double) '#');
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1541");
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray0, annotatedElementArray1, annotatedElementArray2 };
        java.util.Set<java.lang.reflect.AnnotatedElement[][]> annotatedElementArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray3);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray7, longArray8);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray10, longArray11);
        org.junit.Assert.assertArrayEquals(longArray7, longArray10);
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
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray28, longArray29);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray31, longArray32);
        org.junit.Assert.assertArrayEquals(longArray28, longArray31);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray35, longArray36);
        org.junit.Assert.assertArrayEquals("hi!", longArray31, longArray36);
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
        org.junit.Assert.assertArrayEquals(longArray36, longArray48);
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
        org.junit.Assert.assertArrayEquals("", longArray36, longArray56);
        org.junit.Assert.assertArrayEquals(longArray18, longArray56);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray10, longArray56);
        float[] floatArray72 = new float[] { 6, 0L, 'a', 10, 'a' };
        float[] floatArray78 = new float[] { 6, 0L, 'a', 10, 'a' };
        float[][] floatArray79 = new float[][] { floatArray72, floatArray78 };
        java.util.Set<float[]> floatArraySet80 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray79);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) longArray56, (java.lang.Object) floatArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) annotatedElementArray3, (java.lang.Object[]) floatArray79);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1542");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("", byteArray5, byteArray7);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray11, longArray12);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray14, longArray15);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray17, longArray18);
        org.junit.Assert.assertArrayEquals(longArray14, longArray17);
        org.junit.Assert.assertArrayEquals(longArray11, longArray17);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray17, (java.lang.Object) byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray22);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals("", byteArray29, byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray33);
        float[] floatArray41 = new float[] { (short) 1 };
        float[] floatArray43 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray43, (float) '#');
        float[] floatArray47 = new float[] { (short) 1 };
        float[] floatArray49 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray49, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray43, floatArray47, (float) 100);
        float[] floatArray55 = new float[] { (short) 1 };
        float[] floatArray57 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray57, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray43, floatArray57, (float) 3);
        float[] floatArray63 = new float[] { (short) 1 };
        float[] floatArray65 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray65, (float) '#');
        org.junit.Assert.assertArrayEquals("", floatArray57, floatArray65, 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) byteArray0, (java.lang.Object) floatArray57);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1543");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) ' ');
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1544");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        java.lang.String str11 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("<unknown>", indexReader13, (int) (short) 0, postingsEnum15, postingsEnum16);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.monster", indexReader20, (int) (short) 100, postingsEnum22, postingsEnum23, false);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1545");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests54 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule55 = commonGramsTokenFilterFactoryTests54.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests54, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests54.setUp();
        java.lang.String[] strArray59 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet60 = org.apache.lucene.util.LuceneTestCase.asSet(strArray59);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests54, (java.lang.Object) strSet60);
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests54.assertDocsEnumEquals("", postingsEnum63, postingsEnum64, false);
        org.elasticsearch.common.settings.Settings.Builder builder67 = commonGramsTokenFilterFactoryTests54.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests69 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule70 = commonGramsTokenFilterFactoryTests69.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests69, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests69.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests54, (java.lang.Object) commonGramsTokenFilterFactoryTests69);
        org.elasticsearch.common.settings.Settings.Builder builder75 = commonGramsTokenFilterFactoryTests54.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests77 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule78 = commonGramsTokenFilterFactoryTests77.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests77, (java.lang.Object) (-1L));
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests83 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule84 = commonGramsTokenFilterFactoryTests83.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests83, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests83.setUp();
        java.lang.String[] strArray88 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet89 = org.apache.lucene.util.LuceneTestCase.asSet(strArray88);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests83, (java.lang.Object) strSet89);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests77, (java.lang.Object) "enwiki.random.lines.txt");
        commonGramsTokenFilterFactoryTests77.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule93 = commonGramsTokenFilterFactoryTests77.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) builder75, (java.lang.Object) testRule93);
        org.junit.Assert.assertNotSame((java.lang.Object) eSTokenStreamTestCaseArray50, (java.lang.Object) testRule93);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) eSTokenStreamTestCaseArray50);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1546");
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray12, intArray19);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray1, intArray12);
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
        org.junit.Assert.assertArrayEquals(intArray12, intArray26);
        int[] intArray56 = new int[] { (short) -1, (byte) 0, '#', 100, 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray26, intArray56);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1547");
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
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray43);
        java.lang.String[] strArray46 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray43, (java.lang.Object[]) strArray46);
        java.lang.String[] strArray51 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray51);
        java.lang.String[] strArray54 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet55 = org.apache.lucene.util.LuceneTestCase.asSet(strArray54);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray51, (java.lang.Object[]) strArray54);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray46, (java.lang.Object[]) strArray51);
        java.lang.String[] strArray60 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet61 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray60);
        java.lang.String[] strArray65 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet66 = org.apache.lucene.util.LuceneTestCase.asSet(strArray65);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray65);
        java.lang.String[] strArray68 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet69 = org.apache.lucene.util.LuceneTestCase.asSet(strArray68);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray65, (java.lang.Object[]) strArray68);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray60, (java.lang.Object[]) strArray68);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray46, (java.lang.Object[]) strArray68);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.failfast", (java.lang.Object) strArray46);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray25, (java.lang.Object[]) strArray46);
        java.lang.Object[] objArray75 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray25, objArray75);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1548");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) '4', (double) '#', (double) (short) -1);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1549");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) (byte) 10);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1550");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        java.lang.String str8 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1551");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) 1L, (float) 100, (float) ' ');
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1552");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 1L, (double) '4');
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1553");
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
        commonGramsTokenFilterFactoryTests27.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues44 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests27.assertDocValuesEquals("tests.slow", 3, numericDocValues44, numericDocValues45);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1554");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests8.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests8.assertDocsEnumEquals("hi!", postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests8.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (byte) 100, postingsEnum18, postingsEnum19);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("tests.nightly", indexReader22, fields23, fields24, true);
        commonGramsTokenFilterFactoryTests8.tearDown();
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.tearDown();
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests8);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1555");
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
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray89, (double) 100L);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1556");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4, true);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader8, 3, postingsEnum10, postingsEnum11, true);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests15.ruleChain;
        commonGramsTokenFilterFactoryTests15.setUp();
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests15.ruleChain;
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests15.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests15);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1557");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (-1L), (double) 10L);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1558");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray9);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray9);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray9, (java.lang.Object) 1.0d);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray18);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray18, (java.lang.Object[]) strArray21);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray21, (java.lang.Object[]) strArray24);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray9, (java.lang.Object[]) strArray21);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray9);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray35);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray31, (java.lang.Object[]) strArray35);
        java.lang.String[] strArray40 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray40);
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray40);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray44);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray40, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray31, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray9, (java.lang.Object[]) strArray44);
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
        java.lang.String[] strArray69 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet70 = org.apache.lucene.util.LuceneTestCase.asSet(strArray69);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray64, (java.lang.Object[]) strArray69);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) strArray9, (java.lang.Object[]) strArray69);
        java.lang.Class<?> wildcardClass73 = strArray9.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) wildcardClass73);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1559");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals("", byteArray4, byteArray6);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray10, longArray11);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray13, longArray14);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray16, longArray17);
        org.junit.Assert.assertArrayEquals(longArray13, longArray16);
        org.junit.Assert.assertArrayEquals(longArray10, longArray16);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray22);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray16, (java.lang.Object) byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray21);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests26.setUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsSkippingEquals("<unknown>", indexReader29, 0, postingsEnum31, postingsEnum32, true);
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum36, postingsEnum37, true);
        commonGramsTokenFilterFactoryTests26.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) byteArray21, (java.lang.Object) commonGramsTokenFilterFactoryTests26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) byteArray21);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1560");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) 4, (float) (-1));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1561");
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
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray17);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray17, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray25);
        java.lang.String[] strArray28 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray25, (java.lang.Object[]) strArray28);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray25);
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
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) strArray42);
        java.lang.String[] strArray51 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray51);
        java.lang.String[] strArray54 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet55 = org.apache.lucene.util.LuceneTestCase.asSet(strArray54);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray51, (java.lang.Object[]) strArray54);
        java.lang.String[] strArray59 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet60 = org.apache.lucene.util.LuceneTestCase.asSet(strArray59);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray59);
        java.lang.String[] strArray62 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArray62);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray59, (java.lang.Object[]) strArray62);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray54, (java.lang.Object[]) strArray59);
        java.lang.String[] strArray69 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet70 = org.apache.lucene.util.LuceneTestCase.asSet(strArray69);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray69);
        java.lang.String[] strArray72 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet73 = org.apache.lucene.util.LuceneTestCase.asSet(strArray72);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray69, (java.lang.Object[]) strArray72);
        java.lang.String[] strArray77 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet78 = org.apache.lucene.util.LuceneTestCase.asSet(strArray77);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray77);
        java.lang.String[] strArray80 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet81 = org.apache.lucene.util.LuceneTestCase.asSet(strArray80);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray77, (java.lang.Object[]) strArray80);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray72, (java.lang.Object[]) strArray77);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray59, (java.lang.Object[]) strArray72);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) strArray59);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests87 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule88 = commonGramsTokenFilterFactoryTests87.ruleChain;
        commonGramsTokenFilterFactoryTests87.setUp();
        commonGramsTokenFilterFactoryTests87.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder91 = commonGramsTokenFilterFactoryTests87.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests87);
        commonGramsTokenFilterFactoryTests87.overrideTestDefaultQueryCache();
        java.lang.String str94 = commonGramsTokenFilterFactoryTests87.getTestName();
        commonGramsTokenFilterFactoryTests87.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) strArray1, (java.lang.Object) commonGramsTokenFilterFactoryTests87);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1562");
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
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.slow", indexReader20, terms21, terms22, false);
        java.lang.Object obj25 = null;
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray28);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray31);
        org.junit.Assert.assertArrayEquals("", byteArray28, byteArray30);
        long[] longArray34 = new long[] {};
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray34, longArray35);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray37, longArray38);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray40, longArray41);
        org.junit.Assert.assertArrayEquals(longArray37, longArray40);
        org.junit.Assert.assertArrayEquals(longArray34, longArray40);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray46);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray40, (java.lang.Object) byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray45);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray51);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray54, byteArray55);
        byte[] byteArray57 = new byte[] {};
        byte[] byteArray58 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray57, byteArray58);
        org.junit.Assert.assertArrayEquals("", byteArray55, byteArray57);
        long[] longArray61 = new long[] {};
        long[] longArray62 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray61, longArray62);
        long[] longArray64 = new long[] {};
        long[] longArray65 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray64, longArray65);
        long[] longArray67 = new long[] {};
        long[] longArray68 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray67, longArray68);
        org.junit.Assert.assertArrayEquals(longArray64, longArray67);
        org.junit.Assert.assertArrayEquals(longArray61, longArray67);
        byte[] byteArray72 = new byte[] {};
        byte[] byteArray73 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray72, byteArray73);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray67, (java.lang.Object) byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray72);
        org.junit.Assert.assertNotSame(obj25, (java.lang.Object) byteArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.slow", obj25);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1563");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.tearDown();
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests7.assertDocsEnumEquals("tests.failfast", postingsEnum9, postingsEnum10, true);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests7.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader14, 3, postingsEnum16, postingsEnum17, true);
        commonGramsTokenFilterFactoryTests7.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests7);
        commonGramsTokenFilterFactoryTests7.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests7.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests7);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.weekly", (int) (short) 100, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1564");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray10, longArray11);
        org.junit.Assert.assertArrayEquals("hi!", longArray6, longArray11);
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
        org.junit.Assert.assertArrayEquals(longArray11, longArray23);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray28, longArray29);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray31, longArray32);
        org.junit.Assert.assertArrayEquals(longArray28, longArray31);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray35, longArray36);
        org.junit.Assert.assertArrayEquals("hi!", longArray31, longArray36);
        org.junit.Assert.assertArrayEquals("", longArray11, longArray31);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray40, longArray41);
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray43, longArray44);
        long[] longArray46 = new long[] {};
        long[] longArray47 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray46, longArray47);
        org.junit.Assert.assertArrayEquals(longArray43, longArray46);
        org.junit.Assert.assertArrayEquals(longArray40, longArray46);
        org.junit.Assert.assertArrayEquals(longArray31, longArray46);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests53 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests53.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests53, (java.lang.Object) (-1L));
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests59 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule60 = commonGramsTokenFilterFactoryTests59.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests59, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests59.setUp();
        java.lang.String[] strArray64 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet65 = org.apache.lucene.util.LuceneTestCase.asSet(strArray64);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests59, (java.lang.Object) strSet65);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests53, (java.lang.Object) "enwiki.random.lines.txt");
        commonGramsTokenFilterFactoryTests53.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests53.setIndexWriterMaxDocs(4);
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        commonGramsTokenFilterFactoryTests53.assertPositionsSkippingEquals("", indexReader72, 2, postingsEnum74, postingsEnum75);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) longArray31, (java.lang.Object) commonGramsTokenFilterFactoryTests53);
        commonGramsTokenFilterFactoryTests53.setUp();
        commonGramsTokenFilterFactoryTests53.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues82 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues83 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests53.assertDocValuesEquals("", 0, numericDocValues82, numericDocValues83);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1565");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder4 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.awaitsfix", indexReader7, fields8, fields9, true);
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule12);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1566");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (-1L), (double) (byte) -1);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1567");
        char[] charArray0 = null;
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        org.junit.Assert.assertArrayEquals("", charArray4, charArray7);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray7, charArray12);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals("", charArray16, charArray19);
        org.junit.Assert.assertArrayEquals(charArray12, charArray19);
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray29, charArray34);
        org.junit.Assert.assertArrayEquals(charArray12, charArray29);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        org.junit.Assert.assertArrayEquals("", charArray39, charArray42);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        org.junit.Assert.assertArrayEquals(charArray42, charArray46);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        org.junit.Assert.assertArrayEquals("", charArray51, charArray54);
        org.junit.Assert.assertArrayEquals(charArray42, charArray54);
        org.junit.Assert.assertArrayEquals("", charArray29, charArray42);
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray62, charArray63);
        char[] charArray65 = new char[] {};
        char[] charArray66 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray65, charArray66);
        org.junit.Assert.assertArrayEquals("", charArray62, charArray65);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray65, charArray69);
        org.junit.Assert.assertArrayEquals(charArray29, charArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray69);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1568");
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
        commonGramsTokenFilterFactoryTests18.setUp();
        java.lang.String[][] strArray25 = new java.lang.String[][] {};
        java.util.Set<java.lang.String[]> strArraySet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) strArraySet26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArraySet26);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1569");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 0, (float) (short) 1, 0.0f);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1570");
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
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray6, (java.lang.Object) byteArray11);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.lang.Iterable[] iterableArray22 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray23 = (java.lang.Iterable<java.lang.String>[]) iterableArray22;
        strIterableArray23[0] = strSet16;
        strIterableArray23[1] = strSet18;
        strIterableArray23[2] = strSet20;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) byteArray11, (java.lang.Object) strIterableArray23);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        java.lang.String[] strArray37 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet38 = org.apache.lucene.util.LuceneTestCase.asSet(strArray37);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray37);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray34, (java.lang.Object[]) strArray37);
        java.util.Set<java.io.Serializable> serializableSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray34);
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        java.lang.String[] strArray46 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray46);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray43, (java.lang.Object[]) strArray46);
        java.util.Set<java.io.Serializable> serializableSet50 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray43);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray34, (java.lang.Object[]) strArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strIterableArray23, (java.lang.Object[]) strArray34);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1571");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (-1), (double) 'a');
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1572");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) 4);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1573");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (float) (byte) 100, (float) (short) -1, (float) (byte) 100);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1574");
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
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray20);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray20);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray20, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray10, (java.lang.Object[]) strArray20);
        java.lang.Class<?> wildcardClass27 = strArray10.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests29.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests29, (java.lang.Object) (-1L));
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsSkippingEquals("", indexReader34, 0, postingsEnum36, postingsEnum37, true);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        commonGramsTokenFilterFactoryTests29.assertFieldsEquals("tests.weekly", indexReader41, fields42, fields43, true);
        commonGramsTokenFilterFactoryTests29.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) strArray10, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests29.assertDocsAndPositionsEnumEquals("hi!", postingsEnum49, postingsEnum50);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1575");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.awaitsfix", indexReader8, 1, postingsEnum10, postingsEnum11);
        commonGramsTokenFilterFactoryTests2.setUp();
        commonGramsTokenFilterFactoryTests2.tearDown();
        float[] floatArray16 = new float[] { (short) 1 };
        float[] floatArray18 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray18, (float) '#');
        float[] floatArray22 = new float[] { (short) 1 };
        float[] floatArray24 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray24, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray22, (float) '4');
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling29 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray30 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling29 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray30);
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray16, (java.lang.Object) throttlingArray30);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) throttlingArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 10.0d, (java.lang.Object) throttlingArray30);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1576");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule41 = commonGramsTokenFilterFactoryTests40.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests40, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests40.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests40);
        org.junit.rules.TestRule testRule46 = commonGramsTokenFilterFactoryTests40.ruleChain;
        commonGramsTokenFilterFactoryTests40.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) strArray25, (java.lang.Object) commonGramsTokenFilterFactoryTests40);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1577");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 10, (double) 0.0f, (double) 10L);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1578");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 10, (double) 3, (double) ' ');
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1579");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) 10.0f, (double) (byte) -1, (double) '#');
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1580");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, 0.0d);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1581");
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
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] { locale50, "<unknown>", "tests.maxfailures" };
        java.util.Set<java.io.Serializable> serializableSet54 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray8, (java.lang.Object[]) serializableArray53);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1582");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.maxfailures", indexReader6, fields7, fields8, false);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.slow", indexReader17, 0, postingsEnum19, postingsEnum20);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests22.setUp();
        commonGramsTokenFilterFactoryTests22.setUp();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests22.assertFieldsEquals("tests.weekly", indexReader26, fields27, fields28, true);
        java.lang.String str31 = commonGramsTokenFilterFactoryTests22.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) str31);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1583");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) (byte) 0, 1.0d);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1584");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) 4);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1585");
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
        float[] floatArray30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray30, (float) 1L);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1586");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (double) (byte) 100, (double) '#', (double) 'a');
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1587");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str4 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("<unknown>", indexReader6, terms7, terms8, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1588");
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
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.maxfailures", 3, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1589");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("random", (-1), numericDocValues10, numericDocValues11);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1590");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        java.lang.String str6 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1591");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 100, (double) 100L, 10.0d);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1592");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("tests.failfast", postingsEnum6, postingsEnum7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader11, 3, postingsEnum13, postingsEnum14, true);
        commonGramsTokenFilterFactoryTests4.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) testRule19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) testRule19);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1593");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 10L, (double) 100);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1594");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) 10);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1595");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) (short) -1);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1596");
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
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray33);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray33, (java.lang.Object[]) strArray36);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray41);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray41, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray36, (java.lang.Object[]) strArray41);
        java.lang.String[] strArray51 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray51);
        java.lang.String[] strArray54 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet55 = org.apache.lucene.util.LuceneTestCase.asSet(strArray54);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray51, (java.lang.Object[]) strArray54);
        java.lang.String[] strArray59 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet60 = org.apache.lucene.util.LuceneTestCase.asSet(strArray59);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray59);
        java.lang.String[] strArray62 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArray62);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray59, (java.lang.Object[]) strArray62);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray54, (java.lang.Object[]) strArray59);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray36, (java.lang.Object[]) strArray54);
        java.lang.String[] strArray69 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet70 = org.apache.lucene.util.LuceneTestCase.asSet(strArray69);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray69);
        java.lang.String[] strArray72 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet73 = org.apache.lucene.util.LuceneTestCase.asSet(strArray72);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray69, (java.lang.Object[]) strArray72);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray36, (java.lang.Object[]) strArray72);
        java.lang.String[] strArray76 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet77 = org.apache.lucene.util.LuceneTestCase.asSet(strArray76);
        java.util.Set<java.lang.String> strSet78 = org.apache.lucene.util.LuceneTestCase.asSet(strArray76);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray36, (java.lang.Object[]) strArray76);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArray36);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1597");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests9.ruleChain;
        commonGramsTokenFilterFactoryTests9.setUp();
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests9.ruleChain;
        commonGramsTokenFilterFactoryTests9.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests9.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        commonGramsTokenFilterFactoryTests9.assertTermsEquals("", indexReader16, terms17, terms18, true);
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests9.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) builder21);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(5);
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests27.setUp();
        commonGramsTokenFilterFactoryTests27.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests31.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsEnumEquals("hi!", postingsEnum34, postingsEnum35, false);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests31.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader39, (int) (byte) 100, postingsEnum41, postingsEnum42);
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests31.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests31, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests31.assertPositionsSkippingEquals("<unknown>", indexReader48, 6, postingsEnum50, postingsEnum51);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests27, (java.lang.Object) commonGramsTokenFilterFactoryTests31);
        org.elasticsearch.common.settings.Settings.Builder builder54 = commonGramsTokenFilterFactoryTests31.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests55 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule56 = commonGramsTokenFilterFactoryTests55.ruleChain;
        commonGramsTokenFilterFactoryTests55.setUp();
        java.lang.String str58 = commonGramsTokenFilterFactoryTests55.getTestName();
        commonGramsTokenFilterFactoryTests55.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests55.tearDown();
        org.junit.rules.TestRule testRule61 = commonGramsTokenFilterFactoryTests55.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests31, (java.lang.Object) commonGramsTokenFilterFactoryTests55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests31);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1598");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) 4, (-1L));
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1599");
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
        commonGramsTokenFilterFactoryTests3.tearDown();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("tests.badapples", indexReader19, 6, postingsEnum21, postingsEnum22, false);
        commonGramsTokenFilterFactoryTests3.tearDown();
        float[] floatArray27 = new float[] { 2 };
        float[] floatArray29 = new float[] { 2 };
        float[] floatArray31 = new float[] { 2 };
        float[] floatArray33 = new float[] { 2 };
        float[] floatArray35 = new float[] { 2 };
        float[] floatArray37 = new float[] { 2 };
        float[][] floatArray38 = new float[][] { floatArray27, floatArray29, floatArray31, floatArray33, floatArray35, floatArray37 };
        float[] floatArray40 = new float[] { 2 };
        float[] floatArray42 = new float[] { 2 };
        float[] floatArray44 = new float[] { 2 };
        float[] floatArray46 = new float[] { 2 };
        float[] floatArray48 = new float[] { 2 };
        float[] floatArray50 = new float[] { 2 };
        float[][] floatArray51 = new float[][] { floatArray40, floatArray42, floatArray44, floatArray46, floatArray48, floatArray50 };
        float[][][] floatArray52 = new float[][][] { floatArray38, floatArray51 };
        java.util.Set<float[][]> floatArraySet53 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) floatArraySet53);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1600");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("hi!", postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader10, (int) (byte) 100, postingsEnum12, postingsEnum13);
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("<unknown>", indexReader19, 6, postingsEnum21, postingsEnum22);
        java.lang.String str24 = commonGramsTokenFilterFactoryTests2.getTestName();
        commonGramsTokenFilterFactoryTests2.setUp();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs(3);
        commonGramsTokenFilterFactoryTests2.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1601");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, (long) (short) 10);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1602");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 5, (double) 10L);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1603");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 0.0d, (double) '#');
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1604");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, (double) 1L, (double) 6);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1605");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str5 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, (int) (short) 0, postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1606");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) strArray21, (java.lang.Object) 0.0d);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1607");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.nightly", (int) (byte) -1, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1608");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (double) 0, (double) 1, (double) (byte) 1);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1609");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 100, (double) (short) 100, 0.0d);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1610");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests27.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests27.assertDocsEnumEquals("hi!", postingsEnum30, postingsEnum31, false);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader35, (int) (byte) 100, postingsEnum37, postingsEnum38);
        org.junit.rules.TestRule testRule40 = commonGramsTokenFilterFactoryTests27.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests27, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("<unknown>", indexReader44, 6, postingsEnum46, postingsEnum47);
        java.lang.String str49 = commonGramsTokenFilterFactoryTests27.getTestName();
        commonGramsTokenFilterFactoryTests27.setUp();
        commonGramsTokenFilterFactoryTests27.setIndexWriterMaxDocs((int) (byte) -1);
        org.elasticsearch.common.settings.Settings.Builder builder53 = commonGramsTokenFilterFactoryTests27.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests27);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1611");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
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
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray23);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests29.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsEnumEquals("hi!", postingsEnum32, postingsEnum33, false);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests29.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader37, (int) (byte) 100, postingsEnum39, postingsEnum40);
        commonGramsTokenFilterFactoryTests29.setIndexWriterMaxDocs(6);
        org.elasticsearch.common.settings.Settings.Builder builder44 = commonGramsTokenFilterFactoryTests29.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) byteArray1, (java.lang.Object) builder44);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.failfast", (java.lang.Object) shortArray46);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1612");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10, (float) ' ', (float) 0L);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1613");
        double[] doubleArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray60, (double) 'a');
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1614");
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
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray1, doubleArray66, (double) (byte) 100);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1615");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray1);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet3 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray1);
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) throttlingArray1, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1616");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (-1L));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1617");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("tests.maxfailures", indexReader9, (int) (byte) 1, postingsEnum11, postingsEnum12, true);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("", postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("europarl.lines.txt.gz", (int) (short) -1, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1618");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", (int) (byte) 100, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1619");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 0.0f, 0.0d);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1620");
        double[] doubleArray0 = null;
        double[] doubleArray8 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray15 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray15, (double) 100.0f);
        double[] doubleArray24 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray31 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray31, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray24, (double) 4);
        double[] doubleArray43 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray50 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray50, (double) 100.0f);
        double[] doubleArray59 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray66 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray66, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray59, (double) 4);
        double[] doubleArray77 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray84 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray77, doubleArray84, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray59, doubleArray77, 1.0d);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray24, doubleArray59, 0.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray59, (double) 10);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1621");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) (short) 0, (double) 2);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1622");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) ' ');
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1623");
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
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader27, (int) (byte) 0, postingsEnum29, postingsEnum30);
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum33, postingsEnum34);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1624");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        double[] doubleArray9 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray16 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray16, (double) 100.0f);
        double[] doubleArray25 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray32 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray32, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray25, (double) 4);
        double[] doubleArray43 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray50 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray50, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray43, (double) (byte) 0);
        double[] doubleArray61 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray68 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray68, (double) 100.0f);
        double[] doubleArray77 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray84 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray77, doubleArray84, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray77, (double) 4);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray25, doubleArray61, (double) '4');
        org.junit.Assert.assertNotSame((java.lang.Object) locale1, (java.lang.Object) doubleArray25);
        double[] doubleArray92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray92, (double) (short) 0);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1625");
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray6, charArray11);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        org.junit.Assert.assertArrayEquals("", charArray15, charArray18);
        org.junit.Assert.assertArrayEquals(charArray11, charArray18);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals("", charArray25, charArray28);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray28, charArray33);
        org.junit.Assert.assertArrayEquals(charArray11, charArray28);
        char[] charArray37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray28, charArray37);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1626");
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
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("", postingsEnum20, postingsEnum21, false);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("hi!", indexReader26, (-1), postingsEnum28, postingsEnum29);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader32, terms33, terms34, false);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule40 = commonGramsTokenFilterFactoryTests39.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests39, (java.lang.Object) (-1L));
        java.lang.String str43 = commonGramsTokenFilterFactoryTests39.getTestName();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        commonGramsTokenFilterFactoryTests39.assertFieldsEquals("enwiki.random.lines.txt", indexReader45, fields46, fields47, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests51 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule52 = commonGramsTokenFilterFactoryTests51.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        commonGramsTokenFilterFactoryTests51.assertDocsEnumEquals("hi!", postingsEnum54, postingsEnum55, false);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        commonGramsTokenFilterFactoryTests51.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader59, (int) (byte) 100, postingsEnum61, postingsEnum62);
        org.junit.rules.TestRule testRule64 = commonGramsTokenFilterFactoryTests51.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests51, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        commonGramsTokenFilterFactoryTests51.assertPositionsSkippingEquals("<unknown>", indexReader68, 6, postingsEnum70, postingsEnum71);
        java.lang.String str73 = commonGramsTokenFilterFactoryTests51.getTestName();
        commonGramsTokenFilterFactoryTests51.setUp();
        commonGramsTokenFilterFactoryTests51.setIndexWriterMaxDocs(3);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests39, (java.lang.Object) 3);
        commonGramsTokenFilterFactoryTests39.tearDown();
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.Fields fields81 = null;
        org.apache.lucene.index.Fields fields82 = null;
        commonGramsTokenFilterFactoryTests39.assertFieldsEquals("hi!", indexReader80, fields81, fields82, true);
        commonGramsTokenFilterFactoryTests39.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests39);
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum89 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum88, postingsEnum89);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1627");
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
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.nightly", indexReader20, 3, postingsEnum22, postingsEnum23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.nightly", (java.lang.Object) false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1628");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (long) (short) 0, (long) 0);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1629");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1L), (double) 'a', (double) 100L);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1630");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (-1.0d));
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1631");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (byte) 100, (double) (byte) -1, (double) (byte) 10);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1632");
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
        commonGramsTokenFilterFactoryTests3.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests19.setUp();
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) strSet25);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsEnumEquals("", postingsEnum28, postingsEnum29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("enwiki.random.lines.txt", indexReader33, fields34, fields35, false);
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests19.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1633");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("<unknown>", indexReader5, terms6, terms7, false);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.maxfailures", 0, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1634");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) 0, (long) (short) 1);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1635");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((-1.0d), (double) 0.0f, 10.0d);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1636");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        java.lang.String str11 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("<unknown>", indexReader13, (int) (short) 0, postingsEnum15, postingsEnum16);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests20.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsEnumEquals("hi!", postingsEnum23, postingsEnum24, false);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests20.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader28, (int) (byte) 100, postingsEnum30, postingsEnum31);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("tests.nightly", indexReader34, fields35, fields36, true);
        commonGramsTokenFilterFactoryTests20.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests20.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests20);
        commonGramsTokenFilterFactoryTests20.setIndexWriterMaxDocs(10);
        commonGramsTokenFilterFactoryTests20.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests20);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        commonGramsTokenFilterFactoryTests20.assertTermsEquals("random", indexReader47, terms48, terms49, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) terms48);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1637");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 3);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1638");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, (float) 4, (float) 10L);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1639");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (short) 1, (double) (byte) 10);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1640");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (-1.0f), (double) (short) -1);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1641");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.awaitsfix", indexReader8, fields9, fields10, true);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1642");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (float) '4', (float) (short) 100, (float) (short) 0);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1643");
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
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.maxfailures", indexReader15, 2, postingsEnum17, postingsEnum18, false);
        java.lang.String str21 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder22 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.awaitsfix", 3, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1644");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum4, postingsEnum5, false);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) testRule8);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1645");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) -1, (double) 1, (double) (byte) 1);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1646");
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
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.badapples", indexReader17, fields18, fields19, false);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray22, longArray23);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray25, longArray26);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray28, longArray29);
        org.junit.Assert.assertArrayEquals(longArray26, longArray29);
        org.junit.Assert.assertArrayEquals(longArray22, longArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) false, (java.lang.Object) longArray22);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1647");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 5, 0.0d, (double) 100);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1648");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[] {};
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet2 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        commonGramsTokenFilterFactoryTests3.setUp();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests7.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests7.assertDocsEnumEquals("hi!", postingsEnum10, postingsEnum11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests7.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader15, (int) (byte) 100, postingsEnum17, postingsEnum18);
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests7.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests7.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests22.ruleChain;
        commonGramsTokenFilterFactoryTests22.setUp();
        commonGramsTokenFilterFactoryTests22.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests28.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests28, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests28.setUp();
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests28, (java.lang.Object) strSet34);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests37.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsEnumEquals("hi!", postingsEnum40, postingsEnum41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests37.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader45, (int) (byte) 100, postingsEnum47, postingsEnum48);
        org.junit.rules.TestRule testRule50 = commonGramsTokenFilterFactoryTests37.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests37, (java.lang.Object) 100L);
        org.elasticsearch.test.ESTokenStreamTestCase[] eSTokenStreamTestCaseArray53 = new org.elasticsearch.test.ESTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests3, commonGramsTokenFilterFactoryTests7, commonGramsTokenFilterFactoryTests22, commonGramsTokenFilterFactoryTests28, commonGramsTokenFilterFactoryTests37 };
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase> eSTokenStreamTestCaseSet54 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray53);
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase> eSTokenStreamTestCaseSet55 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray53);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet56 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) eSTokenStreamTestCaseArray53);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet57 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) eSTokenStreamTestCaseArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) genericDeclarationArray1, (java.lang.Object[]) eSTokenStreamTestCaseArray53);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1649");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("", indexReader13, fields14, fields15, true);
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.nightly", 2, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1650");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 6, (double) (short) 1);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1651");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) 5, 100L);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1652");
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
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.failfast", indexReader20, terms21, terms22, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.awaitsfix", indexReader27, (int) 'a', postingsEnum29, postingsEnum30, false);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues36 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("", (int) '4', numericDocValues36, numericDocValues37);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1653");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) 4);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1654");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder6 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.monster", indexReader10, 0, postingsEnum12, postingsEnum13, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests16.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests16.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader24, (int) (byte) 100, postingsEnum26, postingsEnum27);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests16.assertFieldsEquals("tests.nightly", indexReader30, fields31, fields32, true);
        commonGramsTokenFilterFactoryTests16.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) postingsEnum12, (java.lang.Object) commonGramsTokenFilterFactoryTests16);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1655");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        java.lang.String str11 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("<unknown>", indexReader13, (int) (short) 0, postingsEnum15, postingsEnum16);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.monster", indexReader20, 0, postingsEnum22, postingsEnum23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.awaitsfix", indexReader27, fields28, fields29, false);
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.maxfailures", (int) ' ', numericDocValues34, numericDocValues35);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1656");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum7, postingsEnum8, true);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(6);
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", (int) (byte) 10, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1657");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) '4', (double) (short) 10, (double) (-1.0f));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1658");
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
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray43);
        java.lang.String[] strArray46 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray43, (java.lang.Object[]) strArray46);
        java.lang.String[] strArray49 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray46, (java.lang.Object[]) strArray49);
        java.lang.String[] strArray56 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        java.util.Set<java.lang.String> strSet58 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        java.lang.String[] strArray60 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet61 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray60);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray56, (java.lang.Object[]) strArray60);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray60, (java.lang.Object) 1.0d);
        java.lang.String[] strArray69 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet70 = org.apache.lucene.util.LuceneTestCase.asSet(strArray69);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray69);
        java.lang.String[] strArray72 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet73 = org.apache.lucene.util.LuceneTestCase.asSet(strArray72);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray69, (java.lang.Object[]) strArray72);
        java.lang.String[] strArray75 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet76 = org.apache.lucene.util.LuceneTestCase.asSet(strArray75);
        java.util.Set<java.lang.String> strSet77 = org.apache.lucene.util.LuceneTestCase.asSet(strArray75);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray72, (java.lang.Object[]) strArray75);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray60, (java.lang.Object[]) strArray72);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray49, (java.lang.Object[]) strArray72);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray49);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) strArray49);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1659");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule33 = commonGramsTokenFilterFactoryTests32.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests32, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests32.setUp();
        java.lang.String[] strArray37 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet38 = org.apache.lucene.util.LuceneTestCase.asSet(strArray37);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests32, (java.lang.Object) strSet38);
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsEnumEquals("", postingsEnum41, postingsEnum42, false);
        org.elasticsearch.common.settings.Settings.Builder builder45 = commonGramsTokenFilterFactoryTests32.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests32.tearDown();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsSkippingEquals("tests.badapples", indexReader48, 6, postingsEnum50, postingsEnum51, false);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        commonGramsTokenFilterFactoryTests32.assertTermsEquals("", indexReader55, terms56, terms57, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests12, (java.lang.Object) "");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1660");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5, false);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests10.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsEnumEquals("hi!", postingsEnum13, postingsEnum14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, (int) (byte) 100, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("tests.nightly", indexReader24, fields25, fields26, true);
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests10.setUp();
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests10.tearDown();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("random", indexReader34, (int) ' ', postingsEnum36, postingsEnum37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) ' ');
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1661");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray3);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray3, (java.lang.Object[]) strArray6);
        short[] shortArray10 = new short[] { (byte) 0 };
        short[] shortArray12 = new short[] { (byte) 0 };
        short[] shortArray14 = new short[] { (byte) 0 };
        short[] shortArray16 = new short[] { (byte) 0 };
        short[] shortArray18 = new short[] { (byte) 0 };
        short[][] shortArray19 = new short[][] { shortArray10, shortArray12, shortArray14, shortArray16, shortArray18 };
        short[] shortArray21 = new short[] { (byte) 0 };
        short[] shortArray23 = new short[] { (byte) 0 };
        short[] shortArray25 = new short[] { (byte) 0 };
        short[] shortArray27 = new short[] { (byte) 0 };
        short[] shortArray29 = new short[] { (byte) 0 };
        short[][] shortArray30 = new short[][] { shortArray21, shortArray23, shortArray25, shortArray27, shortArray29 };
        short[] shortArray32 = new short[] { (byte) 0 };
        short[] shortArray34 = new short[] { (byte) 0 };
        short[] shortArray36 = new short[] { (byte) 0 };
        short[] shortArray38 = new short[] { (byte) 0 };
        short[] shortArray40 = new short[] { (byte) 0 };
        short[][] shortArray41 = new short[][] { shortArray32, shortArray34, shortArray36, shortArray38, shortArray40 };
        short[][][] shortArray42 = new short[][][] { shortArray19, shortArray30, shortArray41 };
        java.util.Set<short[][]> shortArraySet43 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray42);
        java.util.Set<short[][]> shortArraySet44 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray3, (java.lang.Object[]) shortArray42);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1662");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) (byte) 1, (float) (byte) -1, (float) (byte) -1);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1663");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] { locale1, "<unknown>", "tests.maxfailures" };
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray11);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray7, (java.lang.Object[]) strArray11);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray20);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray7, (java.lang.Object[]) strArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray4, (java.lang.Object[]) strArray7);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1664");
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
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals("", charArray29, charArray32);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray32, charArray37);
        org.junit.Assert.assertArrayEquals(charArray15, charArray32);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray2, charArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) "tests.monster");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1665");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray10, longArray11);
        org.junit.Assert.assertArrayEquals("hi!", longArray6, longArray11);
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
        org.junit.Assert.assertArrayEquals(longArray11, longArray23);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray28, longArray29);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray31, longArray32);
        org.junit.Assert.assertArrayEquals(longArray28, longArray31);
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
        long[] longArray61 = new long[] {};
        long[] longArray62 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray61, longArray62);
        long[] longArray64 = new long[] {};
        long[] longArray65 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray64, longArray65);
        org.junit.Assert.assertArrayEquals(longArray61, longArray64);
        long[] longArray68 = new long[] {};
        long[] longArray69 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray68, longArray69);
        org.junit.Assert.assertArrayEquals("hi!", longArray64, longArray69);
        org.junit.Assert.assertArrayEquals(longArray57, longArray69);
        long[] longArray74 = new long[] {};
        long[] longArray75 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray74, longArray75);
        long[] longArray77 = new long[] {};
        long[] longArray78 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray77, longArray78);
        org.junit.Assert.assertArrayEquals(longArray74, longArray77);
        long[] longArray81 = new long[] {};
        long[] longArray82 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray81, longArray82);
        org.junit.Assert.assertArrayEquals("hi!", longArray77, longArray82);
        org.junit.Assert.assertArrayEquals("", longArray57, longArray77);
        org.junit.Assert.assertArrayEquals(longArray39, longArray77);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray31, longArray77);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray23, longArray31);
        long[] longArray89 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray31, longArray89);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1666");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        java.lang.String str11 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("<unknown>", indexReader13, (int) (short) 0, postingsEnum15, postingsEnum16);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests20.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsEnumEquals("hi!", postingsEnum23, postingsEnum24, false);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests20.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader28, (int) (byte) 100, postingsEnum30, postingsEnum31);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        commonGramsTokenFilterFactoryTests20.assertFieldsEquals("tests.nightly", indexReader34, fields35, fields36, true);
        commonGramsTokenFilterFactoryTests20.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests20.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests20);
        commonGramsTokenFilterFactoryTests20.setIndexWriterMaxDocs(10);
        commonGramsTokenFilterFactoryTests20.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests20);
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum47, postingsEnum48);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1667");
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
        org.apache.lucene.util.LuceneTestCase.classRules = testRule13;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests15.ruleChain;
        commonGramsTokenFilterFactoryTests15.setUp();
        commonGramsTokenFilterFactoryTests15.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests15.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests15);
        commonGramsTokenFilterFactoryTests15.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests15.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule13, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1668");
        short[] shortArray5 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray11 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray17 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[][] shortArray18 = new short[][] { shortArray5, shortArray11, shortArray17 };
        java.util.Set<short[]> shortArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArraySet19);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1669");
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
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        java.lang.String str15 = commonGramsTokenFilterFactoryTests14.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", 1, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1670");
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
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray29);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray25, (java.lang.Object[]) strArray29);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray35);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray35, (java.lang.Object[]) strArray38);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray35);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArray20);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1671");
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
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("", postingsEnum20, postingsEnum21, false);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("hi!", indexReader26, (-1), postingsEnum28, postingsEnum29);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader32, terms33, terms34, false);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields39, fields40, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests43 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests43.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests43.assertDocsEnumEquals("hi!", postingsEnum46, postingsEnum47, false);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests43.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader51, (int) (byte) 100, postingsEnum53, postingsEnum54);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        commonGramsTokenFilterFactoryTests43.assertFieldsEquals("tests.nightly", indexReader57, fields58, fields59, true);
        commonGramsTokenFilterFactoryTests43.tearDown();
        org.junit.rules.TestRule testRule63 = commonGramsTokenFilterFactoryTests43.ruleChain;
        commonGramsTokenFilterFactoryTests43.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests43.setUp();
        commonGramsTokenFilterFactoryTests43.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) false, (java.lang.Object) commonGramsTokenFilterFactoryTests43);
        org.apache.lucene.index.NumericDocValues numericDocValues70 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues71 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests43.assertDocValuesEquals("tests.maxfailures", 1, numericDocValues70, numericDocValues71);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1672");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) strSet8);
        commonGramsTokenFilterFactoryTests2.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("hi!", 10, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1673");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests9.ruleChain;
        commonGramsTokenFilterFactoryTests9.setUp();
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests9.ruleChain;
        commonGramsTokenFilterFactoryTests9.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests9.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        commonGramsTokenFilterFactoryTests9.assertTermsEquals("", indexReader16, terms17, terms18, true);
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests9.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) builder21);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1674");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) -1, (double) (short) 0);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1675");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("", byteArray7, byteArray9);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray13, longArray14);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray16, longArray17);
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray19, longArray20);
        org.junit.Assert.assertArrayEquals(longArray16, longArray19);
        org.junit.Assert.assertArrayEquals(longArray13, longArray19);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray25);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray19, (java.lang.Object) byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray24);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests30.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests30.assertDocsEnumEquals("hi!", postingsEnum33, postingsEnum34, false);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests30.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader38, (int) (byte) 100, postingsEnum40, postingsEnum41);
        commonGramsTokenFilterFactoryTests30.setIndexWriterMaxDocs(6);
        org.elasticsearch.common.settings.Settings.Builder builder45 = commonGramsTokenFilterFactoryTests30.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) byteArray2, (java.lang.Object) builder45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) builder45);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1676");
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
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum20, postingsEnum21, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) true);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1677");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setUp();
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
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        org.elasticsearch.common.settings.Settings.Builder builder27 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests28.ruleChain;
        commonGramsTokenFilterFactoryTests28.setUp();
        java.lang.String str31 = commonGramsTokenFilterFactoryTests28.getTestName();
        commonGramsTokenFilterFactoryTests28.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests28.tearDown();
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests28.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        commonGramsTokenFilterFactoryTests28.setUp();
        java.lang.Object obj37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests28, obj37);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1678");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) (byte) 1);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1679");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) (short) -1);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1680");
        long[] longArray0 = null;
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray1, longArray2);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
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
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray6, shortArray14);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray32);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray36);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray39);
        org.junit.Assert.assertArrayEquals("", shortArray32, shortArray36);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray48);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray52);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray55);
        org.junit.Assert.assertArrayEquals("", shortArray48, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray48);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray60);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray65);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray68);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray71);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray60, shortArray65);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray14, shortArray60);
        org.junit.Assert.assertNotSame((java.lang.Object) longArray2, (java.lang.Object) shortArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray2);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1681");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 100, (-1.0d), (double) (short) 0);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1682");
        float[] floatArray0 = null;
        float[] floatArray3 = new float[] { (short) 1 };
        float[] floatArray5 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray5, (float) '#');
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.setUp();
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests8.ruleChain;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("tests.maxfailures", indexReader13, fields14, fields15, false);
        commonGramsTokenFilterFactoryTests8.tearDown();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) floatArray5, (java.lang.Object) commonGramsTokenFilterFactoryTests8);
        float[] floatArray22 = new float[] { (short) 1 };
        float[] floatArray24 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray24, (float) '#');
        float[] floatArray28 = new float[] { (short) 1 };
        float[] floatArray30 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray30, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray24, floatArray28, (float) 100);
        float[] floatArray38 = new float[] { (short) 1 };
        float[] floatArray40 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray40, (float) '#');
        float[] floatArray44 = new float[] { (short) 1 };
        float[] floatArray46 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray46, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray40, floatArray44, (float) 100);
        float[] floatArray52 = new float[] { (short) 1 };
        float[] floatArray54 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray54, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray40, floatArray54, (float) 3);
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray40, (float) (short) 1);
        float[] floatArray64 = new float[] { (short) 1 };
        float[] floatArray66 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray64, floatArray66, (float) '#');
        float[] floatArray70 = new float[] { (short) 1 };
        float[] floatArray72 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray72, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray66, floatArray70, (float) 100);
        float[] floatArray78 = new float[] { (short) 1 };
        float[] floatArray80 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray78, floatArray80, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray66, floatArray80, (float) 3);
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray66, 0.0f);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray66, (float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray5, (float) (byte) 100);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1683");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 4, (long) (-1));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1684");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, false);
        java.lang.Class<?> wildcardClass10 = commonGramsTokenFilterFactoryTests0.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests12.ruleChain;
        commonGramsTokenFilterFactoryTests12.setUp();
        commonGramsTokenFilterFactoryTests12.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests12.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests12);
        java.lang.Class<?> wildcardClass18 = commonGramsTokenFilterFactoryTests12.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests19.ruleChain;
        commonGramsTokenFilterFactoryTests19.setUp();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests19.ruleChain;
        commonGramsTokenFilterFactoryTests19.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests19.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsEnumEquals("hi!", postingsEnum26, postingsEnum27, true);
        java.lang.Class<?> wildcardClass30 = commonGramsTokenFilterFactoryTests19.getClass();
        java.lang.reflect.Type[] typeArray31 = new java.lang.reflect.Type[] { wildcardClass10, wildcardClass18, wildcardClass30 };
        java.util.Set<java.lang.reflect.Type> typeSet32 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray31);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray39);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray35, (java.lang.Object[]) strArray39);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray39, (java.lang.Object) 1.0d);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        java.lang.String[] strArray50 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray50);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray50, (java.lang.Object[]) strArray53);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray45, (java.lang.Object[]) strArray53);
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        java.lang.String[] strArray61 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet62 = org.apache.lucene.util.LuceneTestCase.asSet(strArray61);
        java.util.Set<java.lang.String> strSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArray61);
        java.lang.String[] strArray65 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet66 = org.apache.lucene.util.LuceneTestCase.asSet(strArray65);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray65);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray61, (java.lang.Object[]) strArray65);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray65, (java.lang.Object) 1.0d);
        java.lang.String[] strArray74 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet75 = org.apache.lucene.util.LuceneTestCase.asSet(strArray74);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray74);
        java.lang.String[] strArray77 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet78 = org.apache.lucene.util.LuceneTestCase.asSet(strArray77);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray74, (java.lang.Object[]) strArray77);
        java.lang.String[] strArray80 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet81 = org.apache.lucene.util.LuceneTestCase.asSet(strArray80);
        java.util.Set<java.lang.String> strSet82 = org.apache.lucene.util.LuceneTestCase.asSet(strArray80);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray77, (java.lang.Object[]) strArray80);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray65, (java.lang.Object[]) strArray77);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray65);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray53, (java.lang.Object[]) strArray65);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray39, (java.lang.Object[]) strArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) typeArray31, (java.lang.Object[]) strArray39);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1685");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 0, (double) 0L);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1686");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) '#', (double) (-1.0f), (double) (short) 100);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1687");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.badapples", indexReader6, (-1), postingsEnum8, postingsEnum9, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader14, (int) (byte) 100, postingsEnum16, postingsEnum17);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests20.ruleChain;
        commonGramsTokenFilterFactoryTests20.setUp();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests20.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests24.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests24.assertDocsEnumEquals("hi!", postingsEnum27, postingsEnum28, false);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests24.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader32, (int) (byte) 100, postingsEnum34, postingsEnum35);
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests24.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder38 = commonGramsTokenFilterFactoryTests24.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule40 = commonGramsTokenFilterFactoryTests39.ruleChain;
        commonGramsTokenFilterFactoryTests39.setUp();
        commonGramsTokenFilterFactoryTests39.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests45 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule46 = commonGramsTokenFilterFactoryTests45.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests45, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests45.setUp();
        java.lang.String[] strArray50 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests45, (java.lang.Object) strSet51);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests54 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule55 = commonGramsTokenFilterFactoryTests54.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests54.assertDocsEnumEquals("hi!", postingsEnum57, postingsEnum58, false);
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        commonGramsTokenFilterFactoryTests54.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader62, (int) (byte) 100, postingsEnum64, postingsEnum65);
        org.junit.rules.TestRule testRule67 = commonGramsTokenFilterFactoryTests54.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests54, (java.lang.Object) 100L);
        org.elasticsearch.test.ESTokenStreamTestCase[] eSTokenStreamTestCaseArray70 = new org.elasticsearch.test.ESTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests20, commonGramsTokenFilterFactoryTests24, commonGramsTokenFilterFactoryTests39, commonGramsTokenFilterFactoryTests45, commonGramsTokenFilterFactoryTests54 };
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase> eSTokenStreamTestCaseSet71 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray70);
        java.util.Set<org.elasticsearch.test.ESTokenStreamTestCase> eSTokenStreamTestCaseSet72 = org.apache.lucene.util.LuceneTestCase.asSet(eSTokenStreamTestCaseArray70);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests73 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule74 = commonGramsTokenFilterFactoryTests73.ruleChain;
        commonGramsTokenFilterFactoryTests73.setUp();
        commonGramsTokenFilterFactoryTests73.tearDown();
        commonGramsTokenFilterFactoryTests73.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests73.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        commonGramsTokenFilterFactoryTests73.assertDocsEnumEquals("hi!", postingsEnum80, postingsEnum81, false);
        org.elasticsearch.common.settings.Settings.Builder builder84 = commonGramsTokenFilterFactoryTests73.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) eSTokenStreamTestCaseArray70, (java.lang.Object) commonGramsTokenFilterFactoryTests73);
        org.apache.lucene.index.IndexReader indexReader87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum89 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum90 = null;
        commonGramsTokenFilterFactoryTests73.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader87, (int) (short) 1, postingsEnum89, postingsEnum90);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) indexReader87);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1688");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray15);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray22);
        org.junit.Assert.assertArrayEquals("", shortArray15, shortArray19);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray28);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray31);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray35);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray38);
        org.junit.Assert.assertArrayEquals("", shortArray31, shortArray35);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray15, shortArray35);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray49);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray52);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray56);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray59);
        org.junit.Assert.assertArrayEquals("", shortArray52, shortArray56);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray44, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray52);
        org.junit.Assert.assertArrayEquals("random", shortArray3, shortArray52);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray67);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray67);
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
        org.apache.lucene.index.IndexReader indexReader89 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum91 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum92 = null;
        commonGramsTokenFilterFactoryTests74.assertDocsSkippingEquals("tests.maxfailures", indexReader89, 2, postingsEnum91, postingsEnum92, false);
        commonGramsTokenFilterFactoryTests74.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) shortArray67, (java.lang.Object) commonGramsTokenFilterFactoryTests74);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1689");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) '4', (float) '#', 0.0f);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1690");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) '4', (double) (short) 0, (double) 1);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1691");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10, (double) 3, (double) 10.0f);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1692");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0L, (-1L));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1693");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1694");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) '4');
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1695");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, 100.0d, (double) 0L);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1696");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5, false);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader10, 100, postingsEnum12, postingsEnum13, false);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        java.lang.Object obj19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, obj19);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1697");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests20.ruleChain;
        commonGramsTokenFilterFactoryTests20.setUp();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests20.ruleChain;
        commonGramsTokenFilterFactoryTests20.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests20.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        commonGramsTokenFilterFactoryTests20.assertTermsEquals("", indexReader27, terms28, terms29, true);
        org.elasticsearch.common.settings.Settings.Builder builder32 = commonGramsTokenFilterFactoryTests20.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) builder32);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1698");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, 0L);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1699");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray5);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray5);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray11);
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray14);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray11, (java.lang.Object[]) strArray14);
        java.lang.Class<?> wildcardClass17 = strArray11.getClass();
        org.junit.Assert.assertNotSame((java.lang.Object) "", (java.lang.Object) wildcardClass17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) wildcardClass17);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1700");
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
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) testRule18);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals("", charArray21, charArray24);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals(charArray24, charArray28);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals(charArray28, charArray33);
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray41, charArray46);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals("", charArray50, charArray53);
        org.junit.Assert.assertArrayEquals(charArray46, charArray53);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        org.junit.Assert.assertArrayEquals("", charArray60, charArray63);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray67, charArray68);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray63, charArray68);
        org.junit.Assert.assertArrayEquals(charArray46, charArray63);
        org.junit.Assert.assertArrayEquals(charArray33, charArray46);
        char[] charArray74 = new char[] {};
        char[] charArray75 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray74, charArray75);
        char[] charArray77 = new char[] {};
        char[] charArray78 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray77, charArray78);
        org.junit.Assert.assertArrayEquals("", charArray74, charArray77);
        char[] charArray81 = new char[] {};
        char[] charArray82 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray81, charArray82);
        org.junit.Assert.assertArrayEquals(charArray77, charArray81);
        org.junit.Assert.assertArrayEquals(charArray46, charArray81);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule18, (java.lang.Object) charArray81);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1701");
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
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray43);
        java.lang.String[] strArray46 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray43, (java.lang.Object[]) strArray46);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray10, (java.lang.Object[]) strArray46);
        java.lang.String[] strArray50 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray10, (java.lang.Object[]) strArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) strArray50);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1702");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(1.0d, (double) (short) 0, (double) (short) 1);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1703");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.tearDown();
        java.lang.Object obj9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, obj9);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1704");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests8.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests8.assertDocsEnumEquals("hi!", postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests8.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (byte) 100, postingsEnum18, postingsEnum19);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("tests.nightly", indexReader22, fields23, fields24, true);
        commonGramsTokenFilterFactoryTests8.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        commonGramsTokenFilterFactoryTests8.assertFieldsEquals("hi!", indexReader29, fields30, fields31, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) fields30);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1705");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) ' ', (long) 5);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1706");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (short) 0, (-1.0d));
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1707");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) 4, (float) (byte) -1, (float) 1);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1708");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray13);
        org.junit.Assert.assertArrayEquals("", shortArray6, shortArray10);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray17);
        short[] shortArray26 = new short[] { (byte) 100, (short) 100, (short) 1, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray17, shortArray26);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1709");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (-1.0d), (double) 0.0f);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1710");
        char[] charArray6 = new char[] { '#', 'a', '#', ' ', '#', '4' };
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
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        org.junit.Assert.assertArrayEquals("", charArray45, charArray48);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray48, charArray53);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        org.junit.Assert.assertArrayEquals("", charArray57, charArray60);
        org.junit.Assert.assertArrayEquals(charArray53, charArray60);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray67, charArray68);
        char[] charArray70 = new char[] {};
        char[] charArray71 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray70, charArray71);
        org.junit.Assert.assertArrayEquals("", charArray67, charArray70);
        char[] charArray74 = new char[] {};
        char[] charArray75 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray74, charArray75);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray70, charArray75);
        org.junit.Assert.assertArrayEquals(charArray53, charArray70);
        org.junit.Assert.assertArrayEquals(charArray34, charArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray34);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1711");
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
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader15, terms16, terms17, true);
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests21.ruleChain;
        commonGramsTokenFilterFactoryTests21.setUp();
        commonGramsTokenFilterFactoryTests21.tearDown();
        commonGramsTokenFilterFactoryTests21.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests21.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests21.setIndexWriterMaxDocs(3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests29.ruleChain;
        commonGramsTokenFilterFactoryTests29.setUp();
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests29.ruleChain;
        commonGramsTokenFilterFactoryTests29.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests29.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        commonGramsTokenFilterFactoryTests29.assertTermsEquals("", indexReader36, terms37, terms38, true);
        org.elasticsearch.common.settings.Settings.Builder builder41 = commonGramsTokenFilterFactoryTests29.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests21, (java.lang.Object) builder41);
        commonGramsTokenFilterFactoryTests21.setIndexWriterMaxDocs(5);
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests21.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests48 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule49 = commonGramsTokenFilterFactoryTests48.ruleChain;
        commonGramsTokenFilterFactoryTests48.setUp();
        java.lang.String[] strArray52 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet56 = org.apache.lucene.util.LuceneTestCase.asSet(strArray55);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray55);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray52, (java.lang.Object[]) strArray55);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests48, (java.lang.Object) strArray52);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests48);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests21, (java.lang.Object) commonGramsTokenFilterFactoryTests48);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        commonGramsTokenFilterFactoryTests21.assertPositionsSkippingEquals("tests.slow", indexReader63, (int) (byte) 100, postingsEnum65, postingsEnum66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) (byte) 100);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1712");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) '#');
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1713");
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
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray43);
        java.lang.String[] strArray46 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray43, (java.lang.Object[]) strArray46);
        java.lang.String[] strArray49 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray46, (java.lang.Object[]) strArray49);
        java.lang.String[] strArray56 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        java.util.Set<java.lang.String> strSet58 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        java.lang.String[] strArray60 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet61 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray60);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray56, (java.lang.Object[]) strArray60);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray60, (java.lang.Object) 1.0d);
        java.lang.String[] strArray69 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet70 = org.apache.lucene.util.LuceneTestCase.asSet(strArray69);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray69);
        java.lang.String[] strArray72 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet73 = org.apache.lucene.util.LuceneTestCase.asSet(strArray72);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray69, (java.lang.Object[]) strArray72);
        java.lang.String[] strArray75 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet76 = org.apache.lucene.util.LuceneTestCase.asSet(strArray75);
        java.util.Set<java.lang.String> strSet77 = org.apache.lucene.util.LuceneTestCase.asSet(strArray75);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray72, (java.lang.Object[]) strArray75);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray60, (java.lang.Object[]) strArray72);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray49, (java.lang.Object[]) strArray72);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray49);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray49);
        java.io.Serializable[] serializableArray84 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray86 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray88 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray90 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray91 = new java.io.Serializable[][] { serializableArray84, serializableArray86, serializableArray88, serializableArray90 };
        java.util.Set<java.io.Serializable[]> serializableArraySet92 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray91);
        java.util.Set<java.io.Serializable[]> serializableArraySet93 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray49, (java.lang.Object[]) serializableArray91);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1714");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str5 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder6 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1715");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("<unknown>", indexReader7, 6, postingsEnum9, postingsEnum10);
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.monster", (int) '#', numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1716");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1717");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.String str5 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("<unknown>", indexReader7, terms8, terms9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("", indexReader13, terms14, terms15, false);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray19 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling18 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray19);
        org.junit.Assert.assertNotSame("", (java.lang.Object) "", (java.lang.Object) throttlingArray19);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) throttlingArray19, (java.lang.Object[]) strArray23);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1718");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 1.0d, (double) (-1), (double) (byte) 0);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1719");
        float[] floatArray0 = null;
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
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray16, (float) (-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray16, 1.0f);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1720");
        short[] shortArray0 = null;
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
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray36);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        java.lang.Object obj47 = null;
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) shortArray45, obj47);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray45);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray52);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray55);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray59);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray62);
        org.junit.Assert.assertArrayEquals("", shortArray55, shortArray59);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray66);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests72 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule73 = commonGramsTokenFilterFactoryTests72.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests72, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests72.setUp();
        commonGramsTokenFilterFactoryTests72.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray66, (java.lang.Object) commonGramsTokenFilterFactoryTests72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray66);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1721");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) 10);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1722");
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
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.awaitsfix", (int) (short) 10, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1723");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 5, (double) (byte) 10);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1724");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        java.lang.String str1 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum3, postingsEnum4);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1725");
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
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("tests.awaitsfix", indexReader41, fields42, fields43, true);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests25.assertDocsSkippingEquals("random", indexReader47, (int) 'a', postingsEnum49, postingsEnum50, false);
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests25.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum54, postingsEnum55);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1726");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests3.setUp();
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests12.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests12, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests12.setUp();
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests12, (java.lang.Object) strSet18);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsEnumEquals("", postingsEnum21, postingsEnum22, false);
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests12.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) builder25);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1727");
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
        org.junit.Assert.assertArrayEquals("", byteArray26, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) byteArray26);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1728");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 6, (double) (byte) -1, (double) 100L);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1729");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", (double) 1.0f, (double) 1.0f, (double) 5);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1730");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (double) 0L, (double) 6, (double) 100L);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1731");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 100L, (long) 'a');
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1732");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray8 = new java.io.Serializable[][] { serializableArray1, serializableArray3, serializableArray5, serializableArray7 };
        java.util.Set<java.io.Serializable[]> serializableArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        java.util.Set<java.io.Serializable[]> serializableArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests11.ruleChain;
        commonGramsTokenFilterFactoryTests11.setUp();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests11.ruleChain;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests11.assertFieldsEquals("tests.maxfailures", indexReader16, fields17, fields18, false);
        java.lang.Class<?> wildcardClass21 = commonGramsTokenFilterFactoryTests11.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests23.ruleChain;
        commonGramsTokenFilterFactoryTests23.setUp();
        commonGramsTokenFilterFactoryTests23.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder27 = commonGramsTokenFilterFactoryTests23.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests23);
        java.lang.Class<?> wildcardClass29 = commonGramsTokenFilterFactoryTests23.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests30.ruleChain;
        commonGramsTokenFilterFactoryTests30.setUp();
        org.junit.rules.TestRule testRule33 = commonGramsTokenFilterFactoryTests30.ruleChain;
        commonGramsTokenFilterFactoryTests30.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests30.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests30.assertDocsEnumEquals("hi!", postingsEnum37, postingsEnum38, true);
        java.lang.Class<?> wildcardClass41 = commonGramsTokenFilterFactoryTests30.getClass();
        java.lang.reflect.Type[] typeArray42 = new java.lang.reflect.Type[] { wildcardClass21, wildcardClass29, wildcardClass41 };
        java.util.Set<java.lang.reflect.Type> typeSet43 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) serializableArray8, (java.lang.Object) typeArray42);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1733");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) 2);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1734");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader7, (int) (byte) 0, postingsEnum9, postingsEnum10, true);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        java.lang.String str14 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 0);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1735");
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
        long[] longArray54 = new long[] {};
        long[] longArray55 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray54, longArray55);
        long[] longArray57 = new long[] {};
        long[] longArray58 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray57, longArray58);
        org.junit.Assert.assertArrayEquals(longArray55, longArray58);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray7, longArray58);
        long[] longArray62 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray7, longArray62);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1736");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1.0f, (double) (byte) -1, (double) 10.0f);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1737");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 1L, (double) 0L);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1738");
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
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests17.ruleChain;
        commonGramsTokenFilterFactoryTests17.setUp();
        commonGramsTokenFilterFactoryTests17.tearDown();
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder22 = commonGramsTokenFilterFactoryTests17.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) builder22);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1739");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) 0L);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1740");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setUp();
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
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        org.elasticsearch.common.settings.Settings.Builder builder27 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests28.ruleChain;
        commonGramsTokenFilterFactoryTests28.setUp();
        java.lang.String str31 = commonGramsTokenFilterFactoryTests28.getTestName();
        commonGramsTokenFilterFactoryTests28.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests28.tearDown();
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests28.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader37, (int) (short) 100, postingsEnum39, postingsEnum40, false);
        org.apache.lucene.index.NumericDocValues numericDocValues45 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests28.assertDocValuesEquals("tests.weekly", (int) (short) -1, numericDocValues45, numericDocValues46);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1741");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        commonGramsTokenFilterFactoryTests3.setUp();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("tests.maxfailures", indexReader8, fields9, fields10, false);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule13;
        java.lang.Class<?> wildcardClass15 = testRule13.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) "hi!", (java.lang.Object) wildcardClass15);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1742");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader7, (int) (byte) 0, postingsEnum9, postingsEnum10, true);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = commonGramsTokenFilterFactoryTests1.getClass();
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray20, longArray21);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray23, longArray24);
        long[] longArray26 = new long[] {};
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray26, longArray27);
        org.junit.Assert.assertArrayEquals(longArray23, longArray26);
        org.junit.Assert.assertArrayEquals(longArray20, longArray26);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray31, longArray32);
        long[] longArray34 = new long[] {};
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray34, longArray35);
        org.junit.Assert.assertArrayEquals(longArray31, longArray34);
        org.junit.Assert.assertArrayEquals(longArray20, longArray31);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray39, longArray40);
        long[] longArray42 = new long[] {};
        long[] longArray43 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray42, longArray43);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray45, longArray46);
        org.junit.Assert.assertArrayEquals(longArray42, longArray45);
        org.junit.Assert.assertArrayEquals(longArray39, longArray45);
        org.junit.Assert.assertArrayEquals(longArray31, longArray45);
        long[] longArray52 = new long[] {};
        long[] longArray53 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray52, longArray53);
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray55, longArray56);
        long[] longArray58 = new long[] {};
        long[] longArray59 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray58, longArray59);
        org.junit.Assert.assertArrayEquals(longArray56, longArray59);
        org.junit.Assert.assertArrayEquals("", longArray53, longArray56);
        org.junit.Assert.assertArrayEquals("random", longArray31, longArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) wildcardClass18, (java.lang.Object) longArray31);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1743");
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
        org.elasticsearch.common.settings.Settings.Builder builder13 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        java.lang.String str16 = commonGramsTokenFilterFactoryTests15.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests18.ruleChain;
        commonGramsTokenFilterFactoryTests18.setUp();
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests15, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests23.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests23, (java.lang.Object) (-1L));
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests29.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests29, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests29.setUp();
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests29, (java.lang.Object) strSet35);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests23, (java.lang.Object) "enwiki.random.lines.txt");
        commonGramsTokenFilterFactoryTests23.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule39 = commonGramsTokenFilterFactoryTests23.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule39;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule39;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests43 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests43.ruleChain;
        commonGramsTokenFilterFactoryTests43.setUp();
        java.lang.String str46 = commonGramsTokenFilterFactoryTests43.getTestName();
        commonGramsTokenFilterFactoryTests43.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests43.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) 100, (java.lang.Object) commonGramsTokenFilterFactoryTests43);
        org.junit.Assert.assertNotSame((java.lang.Object) testRule39, (java.lang.Object) commonGramsTokenFilterFactoryTests43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "<unknown>", (java.lang.Object) testRule39);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1744");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 0);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1745");
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
        float[] floatArray67 = new float[] { 2 };
        float[] floatArray69 = new float[] { 2 };
        float[] floatArray71 = new float[] { 2 };
        float[] floatArray73 = new float[] { 2 };
        float[] floatArray75 = new float[] { 2 };
        float[] floatArray77 = new float[] { 2 };
        float[][] floatArray78 = new float[][] { floatArray67, floatArray69, floatArray71, floatArray73, floatArray75, floatArray77 };
        float[] floatArray80 = new float[] { 2 };
        float[] floatArray82 = new float[] { 2 };
        float[] floatArray84 = new float[] { 2 };
        float[] floatArray86 = new float[] { 2 };
        float[] floatArray88 = new float[] { 2 };
        float[] floatArray90 = new float[] { 2 };
        float[][] floatArray91 = new float[][] { floatArray80, floatArray82, floatArray84, floatArray86, floatArray88, floatArray90 };
        float[][][] floatArray92 = new float[][][] { floatArray78, floatArray91 };
        java.util.Set<float[][]> floatArraySet93 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray92);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) eSTokenStreamTestCaseArray50, (java.lang.Object[]) floatArray92);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1746");
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
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("random", (int) (short) 10, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1747");
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
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray21, longArray22);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray24, longArray25);
        org.junit.Assert.assertArrayEquals(longArray21, longArray24);
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
        long[] longArray41 = new long[] {};
        long[] longArray42 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray41, longArray42);
        long[] longArray44 = new long[] {};
        long[] longArray45 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray44, longArray45);
        org.junit.Assert.assertArrayEquals(longArray41, longArray44);
        long[] longArray48 = new long[] {};
        long[] longArray49 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray48, longArray49);
        org.junit.Assert.assertArrayEquals("hi!", longArray44, longArray49);
        org.junit.Assert.assertArrayEquals(longArray37, longArray49);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray24, longArray37);
        long[] longArray54 = new long[] {};
        long[] longArray55 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray54, longArray55);
        org.junit.Assert.assertArrayEquals(longArray24, longArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) terms16, (java.lang.Object) longArray24);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1748");
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
        org.junit.Assert.assertNotNull("", (java.lang.Object) longArray12);
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
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray28, longArray29);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray31, longArray32);
        org.junit.Assert.assertArrayEquals(longArray28, longArray31);
        org.junit.Assert.assertArrayEquals(longArray17, longArray28);
        long[] longArray38 = new long[] {};
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray38, longArray39);
        long[] longArray41 = new long[] {};
        long[] longArray42 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray41, longArray42);
        org.junit.Assert.assertArrayEquals(longArray38, longArray41);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray45, longArray46);
        org.junit.Assert.assertArrayEquals("hi!", longArray41, longArray46);
        long[] longArray50 = new long[] {};
        long[] longArray51 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray50, longArray51);
        long[] longArray53 = new long[] {};
        long[] longArray54 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray53, longArray54);
        org.junit.Assert.assertArrayEquals(longArray50, longArray53);
        long[] longArray57 = new long[] {};
        long[] longArray58 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray57, longArray58);
        org.junit.Assert.assertArrayEquals("hi!", longArray53, longArray58);
        org.junit.Assert.assertArrayEquals(longArray46, longArray58);
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
        org.junit.Assert.assertArrayEquals("", longArray46, longArray66);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray17, longArray66);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray12, longArray66);
        long[] longArray77 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray12, longArray77);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1749");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) 100, (long) 'a');
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1750");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 2, 100.0d, (double) (short) 100);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1751");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), 100.0d);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1752");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 10.0f, 0.0d, (double) (byte) 0);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1753");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray5);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray5);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray13);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray10, (java.lang.Object[]) strArray13);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray19);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray24);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet28 = org.apache.lucene.util.LuceneTestCase.asSet(strArray27);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray27);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray19, (java.lang.Object[]) strArray27);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests31.ruleChain;
        commonGramsTokenFilterFactoryTests31.setUp();
        commonGramsTokenFilterFactoryTests31.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsEnumEquals("tests.badapples", postingsEnum36, postingsEnum37, true);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        commonGramsTokenFilterFactoryTests31.assertFieldsEquals("tests.awaitsfix", indexReader41, fields42, fields43, true);
        org.junit.Assert.assertNotEquals((java.lang.Object) strArray19, (java.lang.Object) indexReader41);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        java.util.Set<java.lang.String> strSet49 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        java.lang.String[] strArray52 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray52);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet56 = org.apache.lucene.util.LuceneTestCase.asSet(strArray55);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray52, (java.lang.Object[]) strArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray47, (java.lang.Object[]) strArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) strArray55);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) strArray55, (java.lang.Object) byteArray62);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1754");
        long[] longArray1 = null;
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray9, longArray10);
        org.junit.Assert.assertArrayEquals(longArray6, longArray9);
        org.junit.Assert.assertArrayEquals(longArray3, longArray9);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray14, longArray15);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray17, longArray18);
        org.junit.Assert.assertArrayEquals(longArray14, longArray17);
        org.junit.Assert.assertArrayEquals(longArray3, longArray14);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray22, longArray23);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray25, longArray26);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray28, longArray29);
        org.junit.Assert.assertArrayEquals(longArray25, longArray28);
        org.junit.Assert.assertArrayEquals(longArray22, longArray28);
        org.junit.Assert.assertArrayEquals(longArray14, longArray28);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray35, longArray36);
        long[] longArray38 = new long[] {};
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray38, longArray39);
        long[] longArray41 = new long[] {};
        long[] longArray42 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray41, longArray42);
        org.junit.Assert.assertArrayEquals(longArray39, longArray42);
        org.junit.Assert.assertArrayEquals("", longArray36, longArray39);
        org.junit.Assert.assertArrayEquals("random", longArray14, longArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray1, longArray39);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1755");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), (long) 10);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1756");
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
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("", postingsEnum20, postingsEnum21, false);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("hi!", indexReader26, (-1), postingsEnum28, postingsEnum29);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader32, terms33, terms34, false);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields39, fields40, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests43 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests43.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests43.assertDocsEnumEquals("hi!", postingsEnum46, postingsEnum47, false);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests43.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader51, (int) (byte) 100, postingsEnum53, postingsEnum54);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        commonGramsTokenFilterFactoryTests43.assertFieldsEquals("tests.nightly", indexReader57, fields58, fields59, true);
        commonGramsTokenFilterFactoryTests43.tearDown();
        org.junit.rules.TestRule testRule63 = commonGramsTokenFilterFactoryTests43.ruleChain;
        commonGramsTokenFilterFactoryTests43.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests43.setUp();
        commonGramsTokenFilterFactoryTests43.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) false, (java.lang.Object) commonGramsTokenFilterFactoryTests43);
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests43.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum69, postingsEnum70);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1757");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) '#', (long) 100);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1758");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 2, (double) (byte) 0);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1759");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("<unknown>", indexReader8, terms9, terms10, true);
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests14.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests14.assertDocsEnumEquals("hi!", postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests14.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader22, (int) (byte) 100, postingsEnum24, postingsEnum25);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        commonGramsTokenFilterFactoryTests14.assertFieldsEquals("tests.nightly", indexReader28, fields29, fields30, true);
        commonGramsTokenFilterFactoryTests14.tearDown();
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.tearDown();
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests14.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1760");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) 10);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1761");
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
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        commonGramsTokenFilterFactoryTests3.assertTermsEquals("tests.failfast", indexReader20, terms21, terms22, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) terms21);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1762");
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
        char[] charArray14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray10, charArray14);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1763");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) '#');
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1764");
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
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("tests.badapples", 100, numericDocValues30, numericDocValues31);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1765");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 0, (float) (byte) 100, (float) (byte) 10);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1766");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (byte) 10, (double) (short) 100);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1767");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str4 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.badapples", indexReader7, (int) (byte) 100, postingsEnum9, postingsEnum10, true);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.weekly", indexReader15, 1, postingsEnum17, postingsEnum18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) postingsEnum17);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1768");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
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
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray44);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray41, (java.lang.Object[]) strArray44);
        java.util.Set<java.io.Serializable> serializableSet48 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray41);
        java.lang.String[] strArray50 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray53);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray50, (java.lang.Object[]) strArray53);
        java.util.Set<java.io.Serializable> serializableSet57 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray50);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray41, (java.lang.Object[]) strArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray50);
        java.lang.String[] strArray62 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArray62);
        java.lang.String[] strArray65 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet66 = org.apache.lucene.util.LuceneTestCase.asSet(strArray65);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray65);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray62, (java.lang.Object[]) strArray65);
        java.lang.String[] strArray71 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet72 = org.apache.lucene.util.LuceneTestCase.asSet(strArray71);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray71);
        java.lang.String[] strArray76 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet77 = org.apache.lucene.util.LuceneTestCase.asSet(strArray76);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray76);
        java.lang.String[] strArray79 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet80 = org.apache.lucene.util.LuceneTestCase.asSet(strArray79);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray76, (java.lang.Object[]) strArray79);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray71, (java.lang.Object[]) strArray79);
        java.lang.String[] strArray85 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet86 = org.apache.lucene.util.LuceneTestCase.asSet(strArray85);
        java.util.Set<java.lang.String> strSet87 = org.apache.lucene.util.LuceneTestCase.asSet(strArray85);
        java.lang.String[] strArray89 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet90 = org.apache.lucene.util.LuceneTestCase.asSet(strArray89);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray89);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray85, (java.lang.Object[]) strArray89);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray89, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray79, (java.lang.Object[]) strArray89);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray65, (java.lang.Object[]) strArray79);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) strArray79);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray50, (java.lang.Object[]) strArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, strArray50);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1769");
        double[] doubleArray6 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray13 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray13, (double) 100.0f);
        double[] doubleArray22 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray29 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray29, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray22, (double) 4);
        double[] doubleArray40 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray47 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray47, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray40, (double) (byte) 0);
        org.junit.Assert.assertNotNull((java.lang.Object) doubleArray22);
        double[] doubleArray58 = new double[] { 1L, (short) 10, 2, (byte) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray58, (double) (byte) 10);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1770");
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
        long[] longArray41 = new long[] {};
        long[] longArray42 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray41, longArray42);
        long[] longArray44 = new long[] {};
        long[] longArray45 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray44, longArray45);
        org.junit.Assert.assertArrayEquals(longArray41, longArray44);
        long[] longArray48 = new long[] {};
        long[] longArray49 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray48, longArray49);
        org.junit.Assert.assertArrayEquals("hi!", longArray44, longArray49);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray6, longArray44);
        long[] longArray54 = new long[] {};
        long[] longArray55 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray54, longArray55);
        long[] longArray57 = new long[] {};
        long[] longArray58 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray57, longArray58);
        org.junit.Assert.assertArrayEquals(longArray54, longArray57);
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
        long[] longArray74 = new long[] {};
        long[] longArray75 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray74, longArray75);
        long[] longArray77 = new long[] {};
        long[] longArray78 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray77, longArray78);
        org.junit.Assert.assertArrayEquals(longArray74, longArray77);
        long[] longArray81 = new long[] {};
        long[] longArray82 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray81, longArray82);
        org.junit.Assert.assertArrayEquals("hi!", longArray77, longArray82);
        org.junit.Assert.assertArrayEquals(longArray70, longArray82);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray57, longArray70);
        long[] longArray87 = new long[] {};
        long[] longArray88 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray87, longArray88);
        org.junit.Assert.assertArrayEquals(longArray57, longArray88);
        org.junit.Assert.assertArrayEquals("hi!", longArray44, longArray88);
        long[] longArray92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray88, longArray92);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1771");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray10);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray10);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray10, (java.lang.Object) 1.0d);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray19);
        java.lang.String[] strArray22 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray19, (java.lang.Object[]) strArray22);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray22, (java.lang.Object[]) strArray25);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray10, (java.lang.Object[]) strArray22);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray10);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray10, (java.lang.Object[]) strArray45);
        java.lang.String[] strArray52 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        java.lang.String[] strArray56 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray56);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray52, (java.lang.Object[]) strArray56);
        java.lang.String[] strArray61 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet62 = org.apache.lucene.util.LuceneTestCase.asSet(strArray61);
        java.util.Set<java.lang.String> strSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArray61);
        java.lang.String[] strArray65 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet66 = org.apache.lucene.util.LuceneTestCase.asSet(strArray65);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray65);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray61, (java.lang.Object[]) strArray65);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray52, (java.lang.Object[]) strArray65);
        java.lang.String[] strArray70 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet71 = org.apache.lucene.util.LuceneTestCase.asSet(strArray70);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray65, (java.lang.Object[]) strArray70);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) strArray10, (java.lang.Object[]) strArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", objArray1, (java.lang.Object[]) strArray10);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1772");
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
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.badapples", indexReader23, terms24, terms25, true);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder29 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum31, postingsEnum32);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1773");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray10, longArray11);
        org.junit.Assert.assertArrayEquals("hi!", longArray6, longArray11);
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
        org.junit.Assert.assertArrayEquals(longArray11, longArray23);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray28, longArray29);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray31, longArray32);
        org.junit.Assert.assertArrayEquals(longArray28, longArray31);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray35, longArray36);
        org.junit.Assert.assertArrayEquals("hi!", longArray31, longArray36);
        org.junit.Assert.assertArrayEquals("", longArray11, longArray31);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray40, longArray41);
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray43, longArray44);
        long[] longArray46 = new long[] {};
        long[] longArray47 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray46, longArray47);
        org.junit.Assert.assertArrayEquals(longArray43, longArray46);
        org.junit.Assert.assertArrayEquals(longArray40, longArray46);
        org.junit.Assert.assertArrayEquals(longArray31, longArray46);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests53 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests53.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests53, (java.lang.Object) (-1L));
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests59 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule60 = commonGramsTokenFilterFactoryTests59.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests59, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests59.setUp();
        java.lang.String[] strArray64 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet65 = org.apache.lucene.util.LuceneTestCase.asSet(strArray64);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests59, (java.lang.Object) strSet65);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests53, (java.lang.Object) "enwiki.random.lines.txt");
        commonGramsTokenFilterFactoryTests53.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests53.setIndexWriterMaxDocs(4);
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        commonGramsTokenFilterFactoryTests53.assertPositionsSkippingEquals("", indexReader72, 2, postingsEnum74, postingsEnum75);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) longArray31, (java.lang.Object) commonGramsTokenFilterFactoryTests53);
        org.junit.rules.TestRule testRule78 = commonGramsTokenFilterFactoryTests53.ruleChain;
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.Terms terms81 = null;
        org.apache.lucene.index.Terms terms82 = null;
        commonGramsTokenFilterFactoryTests53.assertTermsEquals("<unknown>", indexReader80, terms81, terms82, true);
        org.apache.lucene.index.NumericDocValues numericDocValues87 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues88 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests53.assertDocValuesEquals("", 1, numericDocValues87, numericDocValues88);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1774");
        short[] shortArray1 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray11);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray15);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray18);
        org.junit.Assert.assertArrayEquals("", shortArray11, shortArray15);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray11);
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
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray51);
        org.junit.Assert.assertArrayEquals("", shortArray44, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray44);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray1, shortArray44);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1775");
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
        org.junit.Assert.assertNotEquals((java.lang.Object) 0, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.elasticsearch.common.settings.Settings.Builder builder20 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray29);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray26, (java.lang.Object[]) strArray29);
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray26);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray38);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray35, (java.lang.Object[]) strArray38);
        java.util.Set<java.io.Serializable> serializableSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray35);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray26, (java.lang.Object[]) strArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) strArray21);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1776");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        org.junit.Assert.assertArrayEquals(intArray0, intArray3);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals(intArray7, intArray10);
        org.junit.Assert.assertArrayEquals(intArray3, intArray7);
        int[] intArray15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray15);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1777");
        float[] floatArray2 = new float[] { (short) 1 };
        float[] floatArray4 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray4, (float) '#');
        float[] floatArray8 = new float[] { (short) 1 };
        float[] floatArray10 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray10, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray8, (float) '4');
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling15 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray16 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling15 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray2, (java.lang.Object) throttlingArray16);
        java.lang.Object[] objArray19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) throttlingArray16, objArray19);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1778");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (short) 1, (long) 4);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1779");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 100L, (double) 'a', (double) 1L);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1780");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("", indexReader8, (int) (byte) 1, postingsEnum10, postingsEnum11);
        java.lang.Class<?> wildcardClass13 = commonGramsTokenFilterFactoryTests2.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.setUp();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests14.ruleChain;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests14.assertFieldsEquals("tests.maxfailures", indexReader19, fields20, fields21, false);
        java.lang.Class<?> wildcardClass24 = commonGramsTokenFilterFactoryTests14.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests26.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests26, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests26.setUp();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests26.assertPositionsSkippingEquals("", indexReader32, (int) (byte) 1, postingsEnum34, postingsEnum35);
        java.lang.Class<?> wildcardClass37 = commonGramsTokenFilterFactoryTests26.getClass();
        java.lang.String[] strArray40 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray40);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray40);
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray40, (java.lang.Object[]) strArray43);
        java.lang.Class<?> wildcardClass46 = strArray40.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray47 = new java.lang.reflect.GenericDeclaration[] { wildcardClass13, wildcardClass24, wildcardClass37, wildcardClass46 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet48 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray47);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests51 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule52 = commonGramsTokenFilterFactoryTests51.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests51, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests51.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder56 = commonGramsTokenFilterFactoryTests51.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests57 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule58 = commonGramsTokenFilterFactoryTests57.ruleChain;
        commonGramsTokenFilterFactoryTests57.setUp();
        org.junit.rules.TestRule testRule60 = commonGramsTokenFilterFactoryTests57.ruleChain;
        commonGramsTokenFilterFactoryTests57.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule62 = commonGramsTokenFilterFactoryTests57.ruleChain;
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests57.assertPositionsSkippingEquals("tests.badapples", indexReader64, (int) (byte) -1, postingsEnum66, postingsEnum67);
        commonGramsTokenFilterFactoryTests57.setUp();
        commonGramsTokenFilterFactoryTests57.tearDown();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) builder56, (java.lang.Object) commonGramsTokenFilterFactoryTests57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) genericDeclarationArray47, (java.lang.Object) builder56);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1781");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4, true);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader8, 3, postingsEnum10, postingsEnum11, true);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests15.ruleChain;
        commonGramsTokenFilterFactoryTests15.setUp();
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests15.ruleChain;
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests15.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.nightly", indexReader25, 100, postingsEnum27, postingsEnum28, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) indexReader25);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1782");
        double[] doubleArray6 = new double[] { 0L, 0.0d, (short) 0, 4, (short) -1 };
        double[] doubleArray12 = new double[] { 0L, 0.0d, (short) 0, 4, (short) -1 };
        double[][] doubleArray13 = new double[][] { doubleArray6, doubleArray12 };
        java.util.Set<double[]> doubleArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray13);
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
        org.junit.Assert.assertNotNull((java.lang.Object) strArray22);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        java.lang.String[] strArray48 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet49 = org.apache.lucene.util.LuceneTestCase.asSet(strArray48);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray48);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray48);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        java.util.Set<java.lang.String> strSet55 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        java.lang.String[] strArray57 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet58 = org.apache.lucene.util.LuceneTestCase.asSet(strArray57);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray57);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray53, (java.lang.Object[]) strArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray44, (java.lang.Object[]) strArray57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray22, (java.lang.Object[]) strArray57);
        java.lang.String[] strArray66 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet67 = org.apache.lucene.util.LuceneTestCase.asSet(strArray66);
        java.util.Set<java.lang.String> strSet68 = org.apache.lucene.util.LuceneTestCase.asSet(strArray66);
        java.lang.String[] strArray70 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet71 = org.apache.lucene.util.LuceneTestCase.asSet(strArray70);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray70);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray66, (java.lang.Object[]) strArray70);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray70, (java.lang.Object) 1.0d);
        java.lang.String[] strArray79 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet80 = org.apache.lucene.util.LuceneTestCase.asSet(strArray79);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray79);
        java.lang.String[] strArray82 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet83 = org.apache.lucene.util.LuceneTestCase.asSet(strArray82);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray79, (java.lang.Object[]) strArray82);
        java.lang.String[] strArray85 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet86 = org.apache.lucene.util.LuceneTestCase.asSet(strArray85);
        java.util.Set<java.lang.String> strSet87 = org.apache.lucene.util.LuceneTestCase.asSet(strArray85);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray82, (java.lang.Object[]) strArray85);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray70, (java.lang.Object[]) strArray82);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray70);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray22, (java.lang.Object[]) strArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) doubleArraySet14, (java.lang.Object) strArray22);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1783");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) 6);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1784");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0f), (float) (short) 100, (float) 10L);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1785");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) '#', (double) 0L);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1786");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("hi!", (int) '4', numericDocValues9, numericDocValues10);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1787");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) (byte) 100, (double) ' ', (double) (byte) 100);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1788");
        int[] intArray1 = null;
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        org.junit.Assert.assertArrayEquals(intArray6, intArray9);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals(intArray14, intArray17);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals(intArray21, intArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray17, intArray24);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray6, intArray17);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        org.junit.Assert.assertArrayEquals(intArray31, intArray34);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals(intArray39, intArray42);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        org.junit.Assert.assertArrayEquals(intArray46, intArray49);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray42, intArray49);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray31, intArray42);
        org.junit.Assert.assertArrayEquals(intArray17, intArray31);
        org.junit.Assert.assertArrayEquals(intArray3, intArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray1, intArray3);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1789");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader7, (int) (byte) 0, postingsEnum9, postingsEnum10, true);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        java.lang.String str14 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 0);
        java.lang.String str17 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests18.ruleChain;
        commonGramsTokenFilterFactoryTests18.setUp();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests18.ruleChain;
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsEnumEquals("hi!", postingsEnum25, postingsEnum26, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1790");
        char[] charArray0 = null;
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray6, charArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray11);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1791");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray1);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet3 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("hi!", postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) 100, postingsEnum14, postingsEnum15);
        commonGramsTokenFilterFactoryTests4.setIndexWriterMaxDocs(6);
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("tests.weekly", indexReader21, (int) (byte) 10, postingsEnum23, postingsEnum24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) throttlingArray1, (java.lang.Object) postingsEnum24);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1792");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((-1L), (long) (short) -1);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1793");
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
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray41);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray48);
        org.junit.Assert.assertArrayEquals("", shortArray41, shortArray45);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray54);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray57);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray64);
        org.junit.Assert.assertArrayEquals("", shortArray57, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray57);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray72);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray76);
        short[] shortArray78 = new short[] {};
        short[] shortArray79 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray78, shortArray79);
        org.junit.Assert.assertArrayEquals(shortArray76, shortArray79);
        short[] shortArray82 = new short[] {};
        short[] shortArray83 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray82, shortArray83);
        short[] shortArray85 = new short[] {};
        short[] shortArray86 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray85, shortArray86);
        org.junit.Assert.assertArrayEquals(shortArray83, shortArray86);
        org.junit.Assert.assertArrayEquals("", shortArray79, shortArray83);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray71, shortArray79);
        org.junit.Assert.assertArrayEquals("random", shortArray24, shortArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray1, shortArray79);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1794");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray3);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray3, (java.lang.Object[]) strArray6);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray9);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray19);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray15, (java.lang.Object[]) strArray19);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray28);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray15, (java.lang.Object[]) strArray28);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) strArray33);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray38);
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray43);
        java.lang.String[] strArray46 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray43, (java.lang.Object[]) strArray46);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray38, (java.lang.Object[]) strArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray33, (java.lang.Object[]) strArray38);
        java.lang.String[] strArray56 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray56);
        java.lang.String[] strArray59 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet60 = org.apache.lucene.util.LuceneTestCase.asSet(strArray59);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray56, (java.lang.Object[]) strArray59);
        java.lang.String[] strArray64 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet65 = org.apache.lucene.util.LuceneTestCase.asSet(strArray64);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray64);
        java.lang.String[] strArray67 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet68 = org.apache.lucene.util.LuceneTestCase.asSet(strArray67);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray64, (java.lang.Object[]) strArray67);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray59, (java.lang.Object[]) strArray64);
        java.lang.String[] strArray73 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet74 = org.apache.lucene.util.LuceneTestCase.asSet(strArray73);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray73);
        java.lang.String[] strArray78 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet79 = org.apache.lucene.util.LuceneTestCase.asSet(strArray78);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray78);
        java.lang.String[] strArray81 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet82 = org.apache.lucene.util.LuceneTestCase.asSet(strArray81);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray78, (java.lang.Object[]) strArray81);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray73, (java.lang.Object[]) strArray81);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray59, (java.lang.Object[]) strArray81);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.failfast", (java.lang.Object) strArray59);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray38, (java.lang.Object[]) strArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) strArray59);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling89 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray90 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling89 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet91 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray90);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray59, (java.lang.Object[]) throttlingArray90);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1795");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) -1, (float) 0, 0.0f);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1796");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        org.junit.Assert.assertArrayEquals(intArray1, intArray4);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        org.junit.Assert.assertArrayEquals(intArray8, intArray11);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray4, intArray11);
        int[] intArray16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray16);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1797");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (short) 1);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1798");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests30.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests30.assertDocsEnumEquals("hi!", postingsEnum33, postingsEnum34, false);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests30.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader38, (int) (byte) 100, postingsEnum40, postingsEnum41);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        commonGramsTokenFilterFactoryTests30.assertFieldsEquals("tests.nightly", indexReader44, fields45, fields46, true);
        commonGramsTokenFilterFactoryTests30.tearDown();
        org.junit.rules.TestRule testRule50 = commonGramsTokenFilterFactoryTests30.ruleChain;
        commonGramsTokenFilterFactoryTests30.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests30.setUp();
        commonGramsTokenFilterFactoryTests30.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) floatArray15, (java.lang.Object) commonGramsTokenFilterFactoryTests30);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1799");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 100.0f, (double) 1.0f, (double) 1);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1800");
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
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("random", 2, numericDocValues31, numericDocValues32);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1801");
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
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet54 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) eSTokenStreamTestCaseArray51);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet55 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) eSTokenStreamTestCaseArray51);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests56 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule57 = commonGramsTokenFilterFactoryTests56.ruleChain;
        commonGramsTokenFilterFactoryTests56.setUp();
        org.junit.rules.TestRule testRule59 = commonGramsTokenFilterFactoryTests56.ruleChain;
        commonGramsTokenFilterFactoryTests56.tearDown();
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests63 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        commonGramsTokenFilterFactoryTests63.assertDocsEnumEquals("tests.failfast", postingsEnum65, postingsEnum66, true);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        commonGramsTokenFilterFactoryTests63.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader70, 3, postingsEnum72, postingsEnum73, true);
        commonGramsTokenFilterFactoryTests63.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests63);
        commonGramsTokenFilterFactoryTests63.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests63.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests56, (java.lang.Object) commonGramsTokenFilterFactoryTests63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) eSTokenStreamTestCaseArray51, (java.lang.Object) commonGramsTokenFilterFactoryTests56);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1802");
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
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader15, terms16, terms17, true);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1803");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) 100, (double) (short) 10);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1804");
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
        float[] floatArray44 = new float[] { (short) 1 };
        float[] floatArray46 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray46, (float) '#');
        float[] floatArray50 = new float[] { (short) 1 };
        float[] floatArray52 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray52, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray46, floatArray50, (float) 100);
        float[] floatArray58 = new float[] { (short) 1 };
        float[] floatArray60 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray58, floatArray60, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray46, floatArray60, (float) 3);
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray46, 0.0f);
        float[] floatArray69 = new float[] { (short) 1 };
        float[] floatArray71 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray71, (float) '#');
        java.lang.Object obj74 = null;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) floatArray69, obj74);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray69, 0.0f);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1805");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (short) 1, (long) (-1));
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1806");
        short[] shortArray5 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray11 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray17 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[][] shortArray18 = new short[][] { shortArray5, shortArray11, shortArray17 };
        java.util.Set<short[]> shortArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray18);
        java.util.Set<short[]> shortArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray18);
        java.util.Set<short[]> shortArraySet21 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArraySet21);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1807");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', (float) 4, (float) 3);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1808");
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
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray20);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray20);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray20, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray10, (java.lang.Object[]) strArray20);
        java.lang.Class<?> wildcardClass27 = strArray10.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArray10);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1809");
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
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("", postingsEnum78, postingsEnum79);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1810");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) 5);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1811");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str4 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.badapples", indexReader7, (int) (byte) 100, postingsEnum9, postingsEnum10, true);
        java.lang.Class<?> wildcardClass13 = commonGramsTokenFilterFactoryTests1.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.setUp();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests14.ruleChain;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests14.assertFieldsEquals("tests.maxfailures", indexReader19, fields20, fields21, false);
        commonGramsTokenFilterFactoryTests14.overrideTestDefaultQueryCache();
        java.lang.String str25 = commonGramsTokenFilterFactoryTests14.getTestName();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests14.assertPositionsSkippingEquals("<unknown>", indexReader27, (int) (short) 0, postingsEnum29, postingsEnum30);
        commonGramsTokenFilterFactoryTests14.tearDown();
        java.lang.Class<?> wildcardClass33 = commonGramsTokenFilterFactoryTests14.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests34 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests34.ruleChain;
        commonGramsTokenFilterFactoryTests34.setUp();
        java.lang.String str37 = commonGramsTokenFilterFactoryTests34.getTestName();
        commonGramsTokenFilterFactoryTests34.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests34.assertDocsSkippingEquals("tests.badapples", indexReader40, (int) (byte) 100, postingsEnum42, postingsEnum43, true);
        java.lang.Class<?> wildcardClass46 = commonGramsTokenFilterFactoryTests34.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray47 = new java.lang.reflect.GenericDeclaration[] { wildcardClass13, wildcardClass33, wildcardClass46 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray48 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray47 };
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet49 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray48);
        java.lang.String[] strArray52 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        java.lang.String[] strArray56 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray56);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray52, (java.lang.Object[]) strArray56);
        java.lang.String[] strArray61 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet62 = org.apache.lucene.util.LuceneTestCase.asSet(strArray61);
        java.util.Set<java.lang.String> strSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArray61);
        java.lang.String[] strArray65 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet66 = org.apache.lucene.util.LuceneTestCase.asSet(strArray65);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray65);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray61, (java.lang.Object[]) strArray65);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray52, (java.lang.Object[]) strArray65);
        java.lang.String[] strArray70 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet71 = org.apache.lucene.util.LuceneTestCase.asSet(strArray70);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray65, (java.lang.Object[]) strArray70);
        java.lang.String[] strArray75 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet76 = org.apache.lucene.util.LuceneTestCase.asSet(strArray75);
        java.util.Set<java.lang.String> strSet77 = org.apache.lucene.util.LuceneTestCase.asSet(strArray75);
        java.lang.String[] strArray79 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet80 = org.apache.lucene.util.LuceneTestCase.asSet(strArray79);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray79);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray75, (java.lang.Object[]) strArray79);
        java.lang.String[] strArray85 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet86 = org.apache.lucene.util.LuceneTestCase.asSet(strArray85);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray85);
        java.lang.String[] strArray88 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet89 = org.apache.lucene.util.LuceneTestCase.asSet(strArray88);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray85, (java.lang.Object[]) strArray88);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) strArray79, (java.lang.Object[]) strArray85);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray70, (java.lang.Object[]) strArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) genericDeclarationArray48, (java.lang.Object[]) strArray79);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1812");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray6);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray6, (java.lang.Object) 1.0d);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests13.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsEnumEquals("hi!", postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests13.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, (int) (byte) 100, postingsEnum23, postingsEnum24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        commonGramsTokenFilterFactoryTests13.assertFieldsEquals("tests.nightly", indexReader27, fields28, fields29, true);
        commonGramsTokenFilterFactoryTests13.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        commonGramsTokenFilterFactoryTests13.assertTermsEquals("", indexReader34, terms35, terms36, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) strComparableSet12, (java.lang.Object) commonGramsTokenFilterFactoryTests13);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1813");
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
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 1);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("", indexReader22, (int) (short) 100, postingsEnum24, postingsEnum25);
        commonGramsTokenFilterFactoryTests2.tearDown();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((-1));
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsEnumEquals("tests.failfast", postingsEnum34, postingsEnum35, true);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader39, 3, postingsEnum41, postingsEnum42, true);
        commonGramsTokenFilterFactoryTests32.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests32);
        commonGramsTokenFilterFactoryTests32.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests32.setIndexWriterMaxDocs((int) (short) 1);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsSkippingEquals("tests.awaitsfix", indexReader52, 4, postingsEnum54, postingsEnum55, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (-1), (java.lang.Object) true);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1814");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 1.0f);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1815");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests15.ruleChain;
        commonGramsTokenFilterFactoryTests15.setUp();
        commonGramsTokenFilterFactoryTests15.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsEnumEquals("tests.badapples", postingsEnum20, postingsEnum21, true);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        commonGramsTokenFilterFactoryTests15.assertFieldsEquals("tests.awaitsfix", indexReader25, fields26, fields27, true);
        org.junit.Assert.assertNotEquals((java.lang.Object) strArray3, (java.lang.Object) indexReader25);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray36);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray36, (java.lang.Object[]) strArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray31, (java.lang.Object[]) strArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray39);
        float[] floatArray49 = new float[] { 6, 0L, 'a', 10, 'a' };
        float[] floatArray55 = new float[] { 6, 0L, 'a', 10, 'a' };
        float[][] floatArray56 = new float[][] { floatArray49, floatArray55 };
        java.util.Set<float[]> floatArraySet57 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) strArray3, (java.lang.Object[]) floatArray56);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1816");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) '4', (long) (byte) 1);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1817");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (double) (short) 10, (double) 5, (double) 10.0f);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1818");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1L), (double) (-1), (double) 4);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1819");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 100L, 0L);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1820");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        org.junit.Assert.assertArrayEquals(intArray0, intArray3);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals(intArray7, intArray10);
        org.junit.Assert.assertArrayEquals(intArray3, intArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray7);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1821");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.String str5 = commonGramsTokenFilterFactoryTests2.getTestName();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1822");
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
        java.lang.Object obj35 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests36.ruleChain;
        commonGramsTokenFilterFactoryTests36.setUp();
        org.junit.rules.TestRule testRule39 = commonGramsTokenFilterFactoryTests36.ruleChain;
        commonGramsTokenFilterFactoryTests36.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule41 = commonGramsTokenFilterFactoryTests36.ruleChain;
        org.junit.Assert.assertNotSame(obj35, (java.lang.Object) testRule41);
        java.lang.Class<?> wildcardClass43 = testRule41.getClass();
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
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray55, longArray56);
        long[] longArray58 = new long[] {};
        long[] longArray59 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray58, longArray59);
        org.junit.Assert.assertArrayEquals(longArray55, longArray58);
        org.junit.Assert.assertArrayEquals(longArray44, longArray55);
        long[] longArray63 = new long[] {};
        long[] longArray64 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray63, longArray64);
        long[] longArray66 = new long[] {};
        long[] longArray67 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray66, longArray67);
        long[] longArray69 = new long[] {};
        long[] longArray70 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray69, longArray70);
        org.junit.Assert.assertArrayEquals(longArray66, longArray69);
        org.junit.Assert.assertArrayEquals(longArray63, longArray69);
        org.junit.Assert.assertArrayEquals(longArray55, longArray69);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) testRule41, (java.lang.Object) longArray69);
        org.junit.Assert.assertArrayEquals(longArray17, longArray69);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests77 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule78 = commonGramsTokenFilterFactoryTests77.ruleChain;
        commonGramsTokenFilterFactoryTests77.setUp();
        org.junit.rules.TestRule testRule80 = commonGramsTokenFilterFactoryTests77.ruleChain;
        commonGramsTokenFilterFactoryTests77.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests77.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.Terms terms85 = null;
        org.apache.lucene.index.Terms terms86 = null;
        commonGramsTokenFilterFactoryTests77.assertTermsEquals("", indexReader84, terms85, terms86, true);
        org.elasticsearch.common.settings.Settings.Builder builder89 = commonGramsTokenFilterFactoryTests77.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests77.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) longArray69, (java.lang.Object) commonGramsTokenFilterFactoryTests77);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1823");
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
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) locale16);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1824");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("", indexReader9, terms10, terms11, true);
        org.elasticsearch.common.settings.Settings.Builder builder14 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        java.lang.String str17 = commonGramsTokenFilterFactoryTests16.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests16);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("random", indexReader20, terms21, terms22, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame("hi!", obj1, (java.lang.Object) terms21);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1825");
        java.lang.Object[] objArray1 = null;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy6 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray7 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy2, queryCachingPolicy3, queryCachingPolicy4, queryCachingPolicy5, queryCachingPolicy6 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray8 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray7 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", objArray1, (java.lang.Object[]) queryCachingPolicyArray8);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1826");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1827");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 100, (long) (byte) -1);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1828");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 100L, (double) 100.0f);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1829");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (-1), (long) 'a');
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1830");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) 4);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1831");
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
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(2);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1832");
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
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader14, terms15, terms16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("random", indexReader20, 0, postingsEnum22, postingsEnum23);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests25.ruleChain;
        commonGramsTokenFilterFactoryTests25.setUp();
        java.lang.String str28 = commonGramsTokenFilterFactoryTests25.getTestName();
        commonGramsTokenFilterFactoryTests25.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests25.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder31 = commonGramsTokenFilterFactoryTests25.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests25.assertPositionsSkippingEquals("", indexReader33, 0, postingsEnum35, postingsEnum36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexReader20, (java.lang.Object) commonGramsTokenFilterFactoryTests25);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1833");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', (float) 6, (float) 0);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1834");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, 1.0f, (float) (byte) 1);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1835");
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
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet54 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) eSTokenStreamTestCaseArray51);
        int[] intArray59 = new int[] { (byte) 10, (short) 1, (short) 0, (short) 1 };
        int[][] intArray60 = new int[][] { intArray59 };
        java.util.Set<int[]> intArraySet61 = org.apache.lucene.util.LuceneTestCase.asSet(intArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) eSTokenStreamTestCaseArray51, (java.lang.Object[]) intArray60);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1836");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray2, byteArray6);
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
        org.junit.Assert.assertArrayEquals("", byteArray6, byteArray20);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests63 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule64 = commonGramsTokenFilterFactoryTests63.ruleChain;
        commonGramsTokenFilterFactoryTests63.setUp();
        commonGramsTokenFilterFactoryTests63.tearDown();
        commonGramsTokenFilterFactoryTests63.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests63.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        commonGramsTokenFilterFactoryTests63.assertDocsEnumEquals("hi!", postingsEnum70, postingsEnum71, false);
        commonGramsTokenFilterFactoryTests63.tearDown();
        java.lang.String str75 = commonGramsTokenFilterFactoryTests63.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) byteArray6, (java.lang.Object) commonGramsTokenFilterFactoryTests63);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1837");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 0.0f, (float) 100L, (float) (byte) 1);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1838");
        long[][] longArray1 = new long[][] {};
        java.util.Set<long[]> longArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(longArray1);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) longArray1, (java.lang.Object[]) strArray11);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) strArray11, (java.lang.Object) 1);
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray43, longArray44);
        long[] longArray46 = new long[] {};
        long[] longArray47 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray46, longArray47);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray49, longArray50);
        org.junit.Assert.assertArrayEquals(longArray46, longArray49);
        org.junit.Assert.assertArrayEquals(longArray43, longArray49);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray54, byteArray55);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray49, (java.lang.Object) byteArray54);
        java.lang.String[] strArray58 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet59 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        java.lang.String[] strArray60 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet61 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        java.lang.String[] strArray62 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArray62);
        java.lang.Iterable[] iterableArray65 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray66 = (java.lang.Iterable<java.lang.String>[]) iterableArray65;
        strIterableArray66[0] = strSet59;
        strIterableArray66[1] = strSet61;
        strIterableArray66[2] = strSet63;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet73 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray66);
        org.junit.Assert.assertNotSame((java.lang.Object) byteArray54, (java.lang.Object) strIterableArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) strIterableArray66);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1839");
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray24, doubleArray60, (double) '4');
        org.junit.Assert.assertNotNull((java.lang.Object) doubleArray24);
        double[] doubleArray91 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray24, doubleArray91, 0.0d);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1840");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, 100L);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1841");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsEnumEquals("tests.failfast", postingsEnum21, postingsEnum22, true);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader26, 3, postingsEnum28, postingsEnum29, true);
        commonGramsTokenFilterFactoryTests19.tearDown();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests19);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) (-1.0d));
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum37, postingsEnum38, false);
        java.lang.String str41 = commonGramsTokenFilterFactoryTests19.getTestName();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("tests.nightly", indexReader43, (int) (byte) 0, postingsEnum45, postingsEnum46);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        org.junit.Assert.assertArrayEquals(intArray50, intArray53);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray58, intArray59);
        int[] intArray61 = new int[] {};
        int[] intArray62 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray61, intArray62);
        org.junit.Assert.assertArrayEquals(intArray58, intArray61);
        int[] intArray65 = new int[] {};
        int[] intArray66 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray65, intArray66);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray68, intArray69);
        org.junit.Assert.assertArrayEquals(intArray65, intArray68);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray61, intArray68);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray50, intArray61);
        int[] intArray75 = new int[] {};
        int[] intArray76 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray75, intArray76);
        int[] intArray78 = new int[] {};
        int[] intArray79 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray78, intArray79);
        org.junit.Assert.assertArrayEquals(intArray75, intArray78);
        int[] intArray82 = new int[] {};
        int[] intArray83 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray82, intArray83);
        int[] intArray85 = new int[] {};
        int[] intArray86 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray85, intArray86);
        org.junit.Assert.assertArrayEquals(intArray82, intArray85);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray75, intArray82);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray61, intArray75);
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.nightly", (java.lang.Object) intArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray6, intArray61, (java.lang.Integer) 5);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1842");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (float) 3, (float) (-1), (float) (byte) -1);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1843");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals("", charArray2, charArray5);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        org.junit.Assert.assertArrayEquals(charArray5, charArray9);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        org.junit.Assert.assertArrayEquals("", charArray14, charArray17);
        org.junit.Assert.assertArrayEquals(charArray5, charArray17);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals("", charArray24, charArray27);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals(charArray27, charArray31);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals("", charArray36, charArray39);
        org.junit.Assert.assertArrayEquals(charArray27, charArray39);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals("", charArray50, charArray53);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray53, charArray58);
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray62, charArray63);
        char[] charArray65 = new char[] {};
        char[] charArray66 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray65, charArray66);
        org.junit.Assert.assertArrayEquals("", charArray62, charArray65);
        org.junit.Assert.assertArrayEquals(charArray58, charArray65);
        org.junit.Assert.assertArrayEquals("", charArray46, charArray65);
        char[] charArray73 = new char[] {};
        char[] charArray74 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray73, charArray74);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        org.junit.Assert.assertArrayEquals("", charArray73, charArray76);
        char[] charArray80 = new char[] {};
        char[] charArray81 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray80, charArray81);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray76, charArray81);
        org.junit.Assert.assertArrayEquals(charArray65, charArray81);
        org.junit.Assert.assertArrayEquals("", charArray39, charArray81);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray17, charArray81);
        char[] charArray87 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray81, charArray87);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1844");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 6, (double) 6);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1845");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) 4, (-1L));
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1846");
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
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("tests.badapples", indexReader18, 6, postingsEnum20, postingsEnum21, false);
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("hi!", (int) '#', numericDocValues26, numericDocValues27);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1847");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 3, (long) (-1));
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1848");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet2 = org.apache.lucene.util.LuceneTestCase.asSet(strArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests5.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests5, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests5.setUp();
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests5, (java.lang.Object) strSet11);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests18.setUp();
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) strSet24);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests30.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests30, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests30.setUp();
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests30, (java.lang.Object) strSet36);
        java.util.Set[] setArray39 = new java.util.Set[6];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray40 = (java.util.Set<java.lang.String>[]) setArray39;
        strSetArray40[0] = strSet2;
        strSetArray40[1] = strSet11;
        strSetArray40[2] = strSet15;
        strSetArray40[3] = strSet24;
        strSetArray40[4] = strSet27;
        strSetArray40[5] = strSet36;
        java.util.Set<java.util.Set<java.lang.String>> strSetSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strSetArray40);
        java.util.Set<java.util.Set<java.lang.String>> strSetSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strSetArray40);
        java.lang.String[] strArray57 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet58 = org.apache.lucene.util.LuceneTestCase.asSet(strArray57);
        java.lang.String[] strArray60 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet61 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray60);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray57, (java.lang.Object[]) strArray60);
        java.util.Set<java.io.Serializable> serializableSet64 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray57);
        java.lang.String[] strArray66 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet67 = org.apache.lucene.util.LuceneTestCase.asSet(strArray66);
        java.lang.String[] strArray69 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet70 = org.apache.lucene.util.LuceneTestCase.asSet(strArray69);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray69);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray66, (java.lang.Object[]) strArray69);
        java.util.Set<java.io.Serializable> serializableSet73 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray66);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray57, (java.lang.Object[]) strArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strSetArray40, (java.lang.Object[]) strArray57);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1849");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray5);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray10);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray10, (java.lang.Object[]) strArray13);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) 10.0d, (java.lang.Object) strArray5);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) strArray5);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray21, longArray22);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray24, longArray25);
        org.junit.Assert.assertArrayEquals(longArray21, longArray24);
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
        long[] longArray54 = new long[] {};
        long[] longArray55 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray54, longArray55);
        long[] longArray57 = new long[] {};
        long[] longArray58 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray57, longArray58);
        org.junit.Assert.assertArrayEquals(longArray54, longArray57);
        long[] longArray61 = new long[] {};
        long[] longArray62 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray61, longArray62);
        org.junit.Assert.assertArrayEquals("hi!", longArray57, longArray62);
        org.junit.Assert.assertArrayEquals(longArray50, longArray62);
        long[] longArray67 = new long[] {};
        long[] longArray68 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray67, longArray68);
        long[] longArray70 = new long[] {};
        long[] longArray71 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray70, longArray71);
        org.junit.Assert.assertArrayEquals(longArray67, longArray70);
        long[] longArray74 = new long[] {};
        long[] longArray75 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray74, longArray75);
        org.junit.Assert.assertArrayEquals("hi!", longArray70, longArray75);
        org.junit.Assert.assertArrayEquals("", longArray50, longArray70);
        org.junit.Assert.assertArrayEquals(longArray32, longArray70);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray24, longArray70);
        float[] floatArray86 = new float[] { 6, 0L, 'a', 10, 'a' };
        float[] floatArray92 = new float[] { 6, 0L, 'a', 10, 'a' };
        float[][] floatArray93 = new float[][] { floatArray86, floatArray92 };
        java.util.Set<float[]> floatArraySet94 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray93);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) longArray70, (java.lang.Object) floatArray93);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) floatArray93);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1850");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("", indexReader8, (int) (byte) 1, postingsEnum10, postingsEnum11);
        java.lang.Class<?> wildcardClass13 = commonGramsTokenFilterFactoryTests2.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.setUp();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests14.ruleChain;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests14.assertFieldsEquals("tests.maxfailures", indexReader19, fields20, fields21, false);
        java.lang.Class<?> wildcardClass24 = commonGramsTokenFilterFactoryTests14.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests26.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests26, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests26.setUp();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests26.assertPositionsSkippingEquals("", indexReader32, (int) (byte) 1, postingsEnum34, postingsEnum35);
        java.lang.Class<?> wildcardClass37 = commonGramsTokenFilterFactoryTests26.getClass();
        java.lang.String[] strArray40 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray40);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray40);
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray40, (java.lang.Object[]) strArray43);
        java.lang.Class<?> wildcardClass46 = strArray40.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray47 = new java.lang.reflect.GenericDeclaration[] { wildcardClass13, wildcardClass24, wildcardClass37, wildcardClass46 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet48 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray47);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        org.junit.Assert.assertArrayEquals(intArray50, intArray53);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray57, intArray58);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray60, intArray61);
        org.junit.Assert.assertArrayEquals(intArray57, intArray60);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray50, intArray57);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray66, intArray67);
        int[] intArray69 = new int[] {};
        int[] intArray70 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray69, intArray70);
        org.junit.Assert.assertArrayEquals(intArray66, intArray69);
        int[] intArray74 = new int[] {};
        int[] intArray75 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray74, intArray75);
        int[] intArray77 = new int[] {};
        int[] intArray78 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray77, intArray78);
        org.junit.Assert.assertArrayEquals(intArray74, intArray77);
        int[] intArray81 = new int[] {};
        int[] intArray82 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray81, intArray82);
        int[] intArray84 = new int[] {};
        int[] intArray85 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray84, intArray85);
        org.junit.Assert.assertArrayEquals(intArray81, intArray84);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray77, intArray84);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray66, intArray77);
        org.junit.Assert.assertArrayEquals(intArray50, intArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) genericDeclarationSet48, (java.lang.Object) intArray50);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1851");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 4, (double) (short) 1);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1852");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray5);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray14);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray14);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray14, (java.lang.Object[]) strArray17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray9, (java.lang.Object[]) strArray17);
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray17, (java.lang.Object[]) strArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) strArray5);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1853");
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
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray24, doubleArray76, (double) 4);
        double[] doubleArray93 = new double[] { (byte) 0, (-1), 6 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray76, doubleArray93, (double) (short) -1);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1854");
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
        long[] longArray16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray1, longArray16);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1855");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 4, 0L);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1856");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) '4');
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1857");
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
        float[] floatArray22 = new float[] { (short) 1 };
        float[] floatArray24 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray24, (float) '#');
        float[] floatArray28 = new float[] { (short) 1 };
        float[] floatArray30 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray30, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray28, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray22, (float) 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray1, floatArray22, 10.0f);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1858");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray6);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray9);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray9);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray18);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray18, (java.lang.Object[]) strArray21);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray26);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray26, (java.lang.Object[]) strArray29);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray21, (java.lang.Object[]) strArray26);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray35);
        java.lang.String[] strArray40 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray40);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray40);
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray40, (java.lang.Object[]) strArray43);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray35, (java.lang.Object[]) strArray43);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray21, (java.lang.Object[]) strArray43);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.failfast", (java.lang.Object) strArray21);
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
        java.lang.String[] strArray65 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet66 = org.apache.lucene.util.LuceneTestCase.asSet(strArray65);
        java.util.Set<java.lang.String> strSet67 = org.apache.lucene.util.LuceneTestCase.asSet(strArray65);
        java.lang.String[] strArray69 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet70 = org.apache.lucene.util.LuceneTestCase.asSet(strArray69);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray69);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray65, (java.lang.Object[]) strArray69);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray69, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray59, (java.lang.Object[]) strArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray9, (java.lang.Object[]) strArray69);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures78 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures79 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures78);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures80 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures81 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures80);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures82 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures83 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures82);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray84 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures79, testRuleIgnoreAfterMaxFailures80, testRuleIgnoreAfterMaxFailures83 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet85 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray9, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray84);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1859");
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
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader21, (int) (byte) -1, postingsEnum23, postingsEnum24);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.awaitsfix", (int) (byte) 0, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1860");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 1L, (-1L));
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1861");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray7);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray7);
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
        java.lang.String[] strArray27 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet28 = org.apache.lucene.util.LuceneTestCase.asSet(strArray27);
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray31);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray27, (java.lang.Object[]) strArray31);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray31, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray31);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray7, (java.lang.Object[]) strArray21);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) strArray21);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        java.lang.String[] strArray46 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray46);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray42, (java.lang.Object[]) strArray46);
        java.lang.String[] strArray52 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray52);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet56 = org.apache.lucene.util.LuceneTestCase.asSet(strArray55);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray52, (java.lang.Object[]) strArray55);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) strArray46, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray21, (java.lang.Object[]) strArray52);
        java.lang.String[] strArray62 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArray62);
        java.lang.String[] strArray65 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet66 = org.apache.lucene.util.LuceneTestCase.asSet(strArray65);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray65);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray62, (java.lang.Object[]) strArray65);
        java.lang.String[] strArray70 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet71 = org.apache.lucene.util.LuceneTestCase.asSet(strArray70);
        java.util.Set<java.lang.String> strSet72 = org.apache.lucene.util.LuceneTestCase.asSet(strArray70);
        java.lang.String[] strArray74 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet75 = org.apache.lucene.util.LuceneTestCase.asSet(strArray74);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray74);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray70, (java.lang.Object[]) strArray74);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray62, (java.lang.Object[]) strArray74);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray52, (java.lang.Object[]) strArray62);
        java.lang.String[] strArray82 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet83 = org.apache.lucene.util.LuceneTestCase.asSet(strArray82);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray82);
        java.lang.String[] strArray87 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet88 = org.apache.lucene.util.LuceneTestCase.asSet(strArray87);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray87);
        java.lang.String[] strArray90 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet91 = org.apache.lucene.util.LuceneTestCase.asSet(strArray90);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray87, (java.lang.Object[]) strArray90);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray82, (java.lang.Object[]) strArray90);
        java.lang.Class<?> wildcardClass94 = strArray90.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) strArray52, (java.lang.Object) strArray90);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1862");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.nightly");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale2, locale4, locale6, locale8, locale10, locale12 };
        java.util.Set<java.util.Locale> localeSet14 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray13);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray19);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) localeArray13, (java.lang.Object[]) strArray16);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1863");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("hi!", indexReader10, fields11, fields12, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests17.assertDocsEnumEquals("tests.failfast", postingsEnum19, postingsEnum20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests17.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader24, 3, postingsEnum26, postingsEnum27, true);
        commonGramsTokenFilterFactoryTests17.tearDown();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests17);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests17, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotEquals((java.lang.Object) 0, (java.lang.Object) commonGramsTokenFilterFactoryTests17);
        org.elasticsearch.common.settings.Settings.Builder builder35 = commonGramsTokenFilterFactoryTests17.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests36.ruleChain;
        commonGramsTokenFilterFactoryTests36.setUp();
        commonGramsTokenFilterFactoryTests36.tearDown();
        commonGramsTokenFilterFactoryTests36.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsSkippingEquals("tests.badapples", indexReader42, (-1), postingsEnum44, postingsEnum45, false);
        commonGramsTokenFilterFactoryTests36.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests36.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) builder35, (java.lang.Object) commonGramsTokenFilterFactoryTests36);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests36);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests52.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests52.assertDocsEnumEquals("hi!", postingsEnum55, postingsEnum56, false);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        commonGramsTokenFilterFactoryTests52.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader60, (int) (byte) 100, postingsEnum62, postingsEnum63);
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        commonGramsTokenFilterFactoryTests52.assertFieldsEquals("tests.nightly", indexReader66, fields67, fields68, true);
        commonGramsTokenFilterFactoryTests52.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        commonGramsTokenFilterFactoryTests52.assertPositionsSkippingEquals("tests.maxfailures", indexReader73, (int) (byte) -1, postingsEnum75, postingsEnum76);
        commonGramsTokenFilterFactoryTests52.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) "tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests52);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1864");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        org.junit.Assert.assertArrayEquals(intArray11, intArray14);
        org.junit.Assert.assertArrayEquals(intArray7, intArray11);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        org.junit.Assert.assertArrayEquals(intArray20, intArray23);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        org.junit.Assert.assertArrayEquals(intArray27, intArray30);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray20, intArray27);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray7, intArray27);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        org.junit.Assert.assertArrayEquals(intArray37, intArray40);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray44, intArray45);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        org.junit.Assert.assertArrayEquals(intArray44, intArray47);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray37, intArray44);
        org.junit.Assert.assertArrayEquals("random", intArray7, intArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray44);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1865");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 3, (double) (short) -1);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1866");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (byte) 10, (long) (byte) 0);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1867");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (byte) 10, (double) 0);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1868");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 10, (float) 0L, (float) (short) 1);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1869");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) 3, (-1.0f), (float) 0);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1870");
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
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests22.ruleChain;
        commonGramsTokenFilterFactoryTests22.setUp();
        commonGramsTokenFilterFactoryTests22.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests22.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests22);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests22.assertDocsEnumEquals("<unknown>", postingsEnum29, postingsEnum30, true);
        org.junit.rules.TestRule testRule33 = commonGramsTokenFilterFactoryTests22.ruleChain;
        java.lang.Class<?> wildcardClass34 = testRule33.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule20, (java.lang.Object) wildcardClass34);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1871");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, true);
        java.lang.String str10 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.failfast", indexReader12, fields13, fields14, true);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests20.ruleChain;
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray27);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray34);
        org.junit.Assert.assertArrayEquals("", shortArray27, shortArray31);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray43);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray47);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray50);
        org.junit.Assert.assertArrayEquals("", shortArray43, shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray43);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray56);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray56);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests20, (java.lang.Object) shortArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests20);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1872");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray9);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray12);
        org.junit.Assert.assertArrayEquals("", shortArray5, shortArray9);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray16);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray25);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray32);
        org.junit.Assert.assertArrayEquals("", shortArray25, shortArray29);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray29);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1873");
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
        java.lang.String[] strArray22 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray22);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray22, (java.lang.Object[]) strArray25);
        java.lang.String[] strArray28 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray25, (java.lang.Object[]) strArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) postingsEnum16, (java.lang.Object) strArray25);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1874");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray8, byteArray12);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray8, byteArray15);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray4, byteArray15);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray25);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray28);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray24, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray24);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray4, byteArray21);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        commonGramsTokenFilterFactoryTests33.assertTermsEquals("tests.slow", indexReader35, terms36, terms37, false);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests33.assertPositionsSkippingEquals("tests.nightly", indexReader41, (int) (short) 10, postingsEnum43, postingsEnum44);
        commonGramsTokenFilterFactoryTests33.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) byteArray21, (java.lang.Object) commonGramsTokenFilterFactoryTests33);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1875");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) 6, (long) 1);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1876");
        float[] floatArray2 = new float[] { (short) 1 };
        float[] floatArray4 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray4, (float) '#');
        float[] floatArray8 = new float[] { (short) 1 };
        float[] floatArray10 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray10, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray8, (float) '4');
        float[] floatArray19 = new float[] { (short) 1 };
        float[] floatArray21 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray21, (float) '#');
        float[] floatArray25 = new float[] { (short) 1 };
        float[] floatArray27 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray27, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray21, floatArray25, (float) 100);
        float[] floatArray34 = new float[] { (short) 1 };
        float[] floatArray36 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray36, (float) '#');
        float[] floatArray40 = new float[] { (short) 1 };
        float[] floatArray42 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray42, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray36, floatArray40, (float) 100);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray25, floatArray36, (float) (short) 10);
        float[] floatArray50 = new float[] { (short) 1 };
        float[] floatArray52 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray52, (float) '#');
        float[] floatArray56 = new float[] { (short) 1 };
        float[] floatArray58 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray58, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray56, (float) '4');
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray36, floatArray50, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray50, (float) 2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) 2);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1877");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', (float) 1L, (float) 0L);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1878");
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
        org.junit.Assert.assertNotNull((java.lang.Object) strArray7);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray33);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray33);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray42);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray38, (java.lang.Object[]) strArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray7, (java.lang.Object[]) strArray42);
        java.lang.Object[] objArray48 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray42, objArray48);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1879");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (byte) 10, (long) (byte) 0);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1880");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) '#', (long) (byte) 0);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1881");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (byte) 10, (long) ' ');
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1882");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 3, (double) 4);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1883");
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
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("tests.badapples", indexReader18, 6, postingsEnum20, postingsEnum21, false);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1884");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.badapples", postingsEnum6, postingsEnum7, true);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum11, postingsEnum12, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) postingsEnum12);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1885");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.weekly", indexReader10, (int) '#', postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("", indexReader16, fields17, fields18, true);
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.monster", (int) 'a', numericDocValues23, numericDocValues24);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1886");
        double[] doubleArray5 = new double[] { 0L, 0.0d, (short) 0, 4, (short) -1 };
        double[] doubleArray11 = new double[] { 0L, 0.0d, (short) 0, 4, (short) -1 };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray11 };
        java.util.Set<double[]> doubleArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray12);
        java.lang.Object[] objArray14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray12, objArray14);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1887");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (byte) 100, (double) (byte) 1);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1888");
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
        org.junit.Assert.assertArrayEquals(intArray18, intArray21);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        org.junit.Assert.assertArrayEquals(intArray25, intArray28);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray18, intArray25);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        org.junit.Assert.assertArrayEquals(intArray34, intArray37);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray45, intArray46);
        org.junit.Assert.assertArrayEquals(intArray42, intArray45);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        org.junit.Assert.assertArrayEquals(intArray49, intArray52);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray45, intArray52);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray34, intArray45);
        org.junit.Assert.assertArrayEquals(intArray18, intArray34);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray5, intArray18);
        int[] intArray60 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray60);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1889");
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
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.badapples", indexReader23, terms24, terms25, true);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("random", indexReader30, 3, postingsEnum32, postingsEnum33, true);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum37, postingsEnum38);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1890");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 100L, (double) 0L);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1891");
        short[] shortArray0 = null;
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
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray11);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1892");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) (byte) 1);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1893");
        java.lang.Object[] objArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) testRuleArray25);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1894");
        float[] floatArray2 = new float[] { (short) 1 };
        float[] floatArray4 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray4, (float) '#');
        float[] floatArray8 = new float[] { (short) 1 };
        float[] floatArray10 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray10, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray8, (float) '4');
        float[] floatArray19 = new float[] { (short) 1 };
        float[] floatArray21 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray21, (float) '#');
        float[] floatArray25 = new float[] { (short) 1 };
        float[] floatArray27 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray27, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray21, floatArray25, (float) 100);
        float[] floatArray34 = new float[] { (short) 1 };
        float[] floatArray36 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray36, (float) '#');
        float[] floatArray40 = new float[] { (short) 1 };
        float[] floatArray42 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray42, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray36, floatArray40, (float) 100);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray25, floatArray36, (float) (short) 10);
        float[] floatArray50 = new float[] { (short) 1 };
        float[] floatArray52 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray52, (float) '#');
        float[] floatArray56 = new float[] { (short) 1 };
        float[] floatArray58 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray58, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray56, (float) '4');
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray36, floatArray50, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray50, (float) 2);
        float[] floatArray69 = new float[] { (short) 1 };
        float[] floatArray71 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray71, (float) '#');
        float[] floatArray75 = new float[] { (short) 1 };
        float[] floatArray77 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray75, floatArray77, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray71, floatArray75, (float) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray2, floatArray71, 0.0f);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1895");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 5, (double) 1);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1896");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setUp();
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
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        org.elasticsearch.common.settings.Settings.Builder builder27 = commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsEnumEquals("tests.failfast", postingsEnum31, postingsEnum32, true);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader36, 3, postingsEnum38, postingsEnum39, true);
        commonGramsTokenFilterFactoryTests29.tearDown();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests29, (java.lang.Object) (-1.0d));
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum47, postingsEnum48, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1897");
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
        double[] doubleArray82 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray89 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray82, doubleArray89, (double) 100.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray89, (double) '#');
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1898");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) (short) 100, 10.0f, (float) (byte) 0);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1899");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) 10L);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1900");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (byte) 100, (long) 3);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1901");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray9);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray9);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) strArray6);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("tests.monster", (int) '4', numericDocValues18, numericDocValues19);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1902");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests9.ruleChain;
        commonGramsTokenFilterFactoryTests9.setUp();
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests9.ruleChain;
        commonGramsTokenFilterFactoryTests9.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests9.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        commonGramsTokenFilterFactoryTests9.assertTermsEquals("", indexReader16, terms17, terms18, true);
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests9.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) builder21);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(5);
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests28.ruleChain;
        commonGramsTokenFilterFactoryTests28.setUp();
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray35);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray32, (java.lang.Object[]) strArray35);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests28, (java.lang.Object) strArray32);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsSkippingEquals("tests.badapples", indexReader43, 6, postingsEnum45, postingsEnum46, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests49 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule50 = commonGramsTokenFilterFactoryTests49.ruleChain;
        commonGramsTokenFilterFactoryTests49.setUp();
        commonGramsTokenFilterFactoryTests49.tearDown();
        commonGramsTokenFilterFactoryTests49.setUp();
        java.lang.String str54 = commonGramsTokenFilterFactoryTests49.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder55 = commonGramsTokenFilterFactoryTests49.newAnalysisSettingsBuilder();
        java.lang.String str56 = commonGramsTokenFilterFactoryTests49.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests28, (java.lang.Object) str56);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1903");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 10);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1904");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 2);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1905");
        float[] floatArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray20, (float) '#');
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1906");
        short[] shortArray6 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray12 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray18 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[][] shortArray19 = new short[][] { shortArray6, shortArray12, shortArray18 };
        java.util.Set<short[]> shortArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray19);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray21, longArray22);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray24, longArray25);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray27, longArray28);
        org.junit.Assert.assertArrayEquals(longArray24, longArray27);
        org.junit.Assert.assertArrayEquals(longArray21, longArray27);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray27, (java.lang.Object) byteArray32);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        java.lang.String[] strArray40 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray40);
        java.lang.Iterable[] iterableArray43 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray44 = (java.lang.Iterable<java.lang.String>[]) iterableArray43;
        strIterableArray44[0] = strSet37;
        strIterableArray44[1] = strSet39;
        strIterableArray44[2] = strSet41;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray44);
        org.junit.Assert.assertNotSame((java.lang.Object) byteArray32, (java.lang.Object) strIterableArray44);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) shortArray19, (java.lang.Object[]) strIterableArray44);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1907");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 10L, (double) 100L);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1908");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.failfast", postingsEnum5, postingsEnum6, false);
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        java.lang.String str11 = commonGramsTokenFilterFactoryTests2.getTestName();
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
        commonGramsTokenFilterFactoryTests13.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) str11, (java.lang.Object) commonGramsTokenFilterFactoryTests13);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests31.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsEnumEquals("hi!", postingsEnum34, postingsEnum35, false);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests31.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader39, (int) (byte) 100, postingsEnum41, postingsEnum42);
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests31.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder45 = commonGramsTokenFilterFactoryTests31.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests31.tearDown();
        commonGramsTokenFilterFactoryTests31.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.rules.TestRule testRule49 = commonGramsTokenFilterFactoryTests31.ruleChain;
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        commonGramsTokenFilterFactoryTests31.assertFieldsEquals("tests.weekly", indexReader51, fields52, fields53, false);
        commonGramsTokenFilterFactoryTests31.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests31);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1909");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) '4', (double) (byte) 10);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1910");
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
        org.junit.Assert.assertArrayEquals(intArray5, intArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) (byte) 1, (java.lang.Object) intArray5);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1911");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, 0.0d);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1912");
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
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals(intArray22, intArray25);
        org.junit.Assert.assertArrayEquals("random", intArray20, intArray22);
        org.junit.Assert.assertArrayEquals("random", intArray6, intArray22);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray36);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray32, byteArray36);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray41);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray44);
        org.junit.Assert.assertArrayEquals("", byteArray41, byteArray43);
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
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray59);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray53, (java.lang.Object) byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray58);
        byte[] byteArray63 = new byte[] {};
        byte[] byteArray64 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray63, byteArray64);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray68);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray70, byteArray71);
        org.junit.Assert.assertArrayEquals("", byteArray68, byteArray70);
        long[] longArray74 = new long[] {};
        long[] longArray75 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray74, longArray75);
        long[] longArray77 = new long[] {};
        long[] longArray78 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray77, longArray78);
        long[] longArray80 = new long[] {};
        long[] longArray81 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray80, longArray81);
        org.junit.Assert.assertArrayEquals(longArray77, longArray80);
        org.junit.Assert.assertArrayEquals(longArray74, longArray80);
        byte[] byteArray85 = new byte[] {};
        byte[] byteArray86 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray85, byteArray86);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray80, (java.lang.Object) byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray68, byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray63, byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) intArray22, (java.lang.Object) byteArray58);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1913");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (byte) 0, (long) '4');
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1914");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests54 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule55 = commonGramsTokenFilterFactoryTests54.ruleChain;
        commonGramsTokenFilterFactoryTests54.setUp();
        commonGramsTokenFilterFactoryTests54.tearDown();
        commonGramsTokenFilterFactoryTests54.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests54.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        commonGramsTokenFilterFactoryTests54.assertDocsEnumEquals("hi!", postingsEnum61, postingsEnum62, false);
        org.elasticsearch.common.settings.Settings.Builder builder65 = commonGramsTokenFilterFactoryTests54.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) eSTokenStreamTestCaseArray51, (java.lang.Object) commonGramsTokenFilterFactoryTests54);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet67 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) eSTokenStreamTestCaseArray51);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests68 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule69 = commonGramsTokenFilterFactoryTests68.ruleChain;
        commonGramsTokenFilterFactoryTests68.setUp();
        org.junit.rules.TestRule testRule71 = commonGramsTokenFilterFactoryTests68.ruleChain;
        commonGramsTokenFilterFactoryTests68.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        commonGramsTokenFilterFactoryTests68.assertPositionsSkippingEquals("tests.awaitsfix", indexReader74, 1, postingsEnum76, postingsEnum77);
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        commonGramsTokenFilterFactoryTests68.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader80, (int) (byte) 100, postingsEnum82, postingsEnum83, false);
        org.elasticsearch.common.settings.Settings.Builder builder86 = commonGramsTokenFilterFactoryTests68.newAnalysisSettingsBuilder();
        java.lang.String str87 = commonGramsTokenFilterFactoryTests68.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder88 = commonGramsTokenFilterFactoryTests68.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) eSTokenStreamTestCaseArray51, (java.lang.Object) commonGramsTokenFilterFactoryTests68);
        commonGramsTokenFilterFactoryTests68.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum92 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum93 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests68.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum92, postingsEnum93);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1915");
        byte[] byteArray0 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray8, byteArray12);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray8, byteArray15);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray4, byteArray15);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray25);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray28);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray24, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray24);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray4, byteArray21);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray37);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray40);
        org.junit.Assert.assertArrayEquals("", byteArray37, byteArray39);
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray43, longArray44);
        long[] longArray46 = new long[] {};
        long[] longArray47 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray46, longArray47);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray49, longArray50);
        org.junit.Assert.assertArrayEquals(longArray46, longArray49);
        org.junit.Assert.assertArrayEquals(longArray43, longArray49);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray54, byteArray55);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray49, (java.lang.Object) byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray54);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray34, byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray37);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1916");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("", indexReader13, fields14, fields15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.badapples", indexReader19, 6, postingsEnum21, postingsEnum22, true);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1917");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 1);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1918");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setUp();
        commonGramsTokenFilterFactoryTests2.setUp();
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
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests6);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1919");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, 10.0d, (double) 0L);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1920");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100, (float) (byte) -1, (float) 2);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1921");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) ' ', (long) (byte) 10);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1922");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 1, (float) (byte) 100, (float) 2);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1923");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (-1.0d), (double) 10.0f);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1924");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) (-1));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1925");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) 3, (float) (short) 0, 0.0f);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1926");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray2, strArray5, strArray8, strArray11 };
        java.lang.String[][][] strArray13 = new java.lang.String[][][] { strArray12 };
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[][] strArray26 = new java.lang.String[][] { strArray16, strArray19, strArray22, strArray25 };
        java.lang.String[][][] strArray27 = new java.lang.String[][][] { strArray26 };
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.maxfailures", "<unknown>" };
        java.lang.String[][] strArray40 = new java.lang.String[][] { strArray30, strArray33, strArray36, strArray39 };
        java.lang.String[][][] strArray41 = new java.lang.String[][][] { strArray40 };
        java.lang.String[][][][] strArray42 = new java.lang.String[][][][] { strArray13, strArray27, strArray41 };
        java.util.Set<java.lang.String[][][]> strArraySet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArraySet43);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1927");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests24.ruleChain;
        commonGramsTokenFilterFactoryTests24.setUp();
        commonGramsTokenFilterFactoryTests24.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests24.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests24);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests24);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests33.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests33, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests33.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests33);
        commonGramsTokenFilterFactoryTests33.setIndexWriterMaxDocs(2);
        commonGramsTokenFilterFactoryTests33.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests33);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1928");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) 10);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1929");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray13);
        org.junit.Assert.assertArrayEquals("", shortArray6, shortArray10);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray22);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray29);
        org.junit.Assert.assertArrayEquals("", shortArray22, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray22);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray34);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray39);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray42);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray45);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray34, shortArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1930");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("", byteArray5, byteArray7);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray11, longArray12);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray14, longArray15);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray17, longArray18);
        org.junit.Assert.assertArrayEquals(longArray14, longArray17);
        org.junit.Assert.assertArrayEquals(longArray11, longArray17);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray17, (java.lang.Object) byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray22);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray2, byteArray5);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray34);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray37);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray33, byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray33);
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray30, byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray5);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1931");
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray11 = new java.io.Serializable[][] { serializableArray4, serializableArray6, serializableArray8, serializableArray10 };
        java.util.Set<java.io.Serializable[]> serializableArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) "hi!", (java.lang.Object) serializableArray11);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray17);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray17, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray25);
        java.lang.String[] strArray28 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray25, (java.lang.Object[]) strArray28);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray25);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray35);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray35, (java.lang.Object[]) strArray38);
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray43);
        java.lang.String[] strArray46 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray43, (java.lang.Object[]) strArray46);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray38, (java.lang.Object[]) strArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray25, (java.lang.Object[]) strArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) serializableArray11, (java.lang.Object[]) strArray38);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1932");
        org.elasticsearch.common.settings.Settings.Builder[] builderArray1 = new org.elasticsearch.common.settings.Settings.Builder[] {};
        org.elasticsearch.common.settings.Settings.Builder[][] builderArray2 = new org.elasticsearch.common.settings.Settings.Builder[][] { builderArray1 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder[]> builderArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray2);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray12);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray18);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray18, (java.lang.Object[]) strArray21);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) strArray12, (java.lang.Object[]) strArray18);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) strArray18);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests27.ruleChain;
        commonGramsTokenFilterFactoryTests27.setUp();
        commonGramsTokenFilterFactoryTests27.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder31 = commonGramsTokenFilterFactoryTests27.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass32 = commonGramsTokenFilterFactoryTests27.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests34 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests34.ruleChain;
        commonGramsTokenFilterFactoryTests34.setUp();
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray41);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray38, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests34, (java.lang.Object) strArray38);
        java.lang.String[] strArray48 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet49 = org.apache.lucene.util.LuceneTestCase.asSet(strArray48);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray48);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray53);
        java.lang.String[] strArray56 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray53, (java.lang.Object[]) strArray56);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray48, (java.lang.Object[]) strArray56);
        java.lang.String[] strArray62 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArray62);
        java.util.Set<java.lang.String> strSet64 = org.apache.lucene.util.LuceneTestCase.asSet(strArray62);
        java.lang.String[] strArray66 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet67 = org.apache.lucene.util.LuceneTestCase.asSet(strArray66);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray66);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray62, (java.lang.Object[]) strArray66);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray66, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray56, (java.lang.Object[]) strArray66);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray38, (java.lang.Object[]) strArray56);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) wildcardClass32, (java.lang.Object) strArray38);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet75 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray38);
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray18, (java.lang.Object[]) strArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) builderArray2, (java.lang.Object[]) strArray38);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1933");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 10, (float) 4, (float) (short) 0);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1934");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) 4, 100L);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1935");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str4 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) 100, (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.weekly", 3, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1936");
        long[] longArray0 = null;
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray10, longArray11);
        org.junit.Assert.assertArrayEquals("hi!", longArray6, longArray11);
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
        org.junit.Assert.assertArrayEquals(longArray11, longArray23);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray28, longArray29);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray31, longArray32);
        org.junit.Assert.assertArrayEquals(longArray28, longArray31);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray35, longArray36);
        org.junit.Assert.assertArrayEquals("hi!", longArray31, longArray36);
        org.junit.Assert.assertArrayEquals("", longArray11, longArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray11);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1937");
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray10 = new java.io.Serializable[][] { serializableArray3, serializableArray5, serializableArray7, serializableArray9 };
        java.util.Set<java.io.Serializable[]> serializableArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) "hi!", (java.lang.Object) serializableArray10);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray15);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray15, (java.lang.Object[]) strArray18);
        java.lang.Class<?> wildcardClass21 = strArray15.getClass();
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray24);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet28 = org.apache.lucene.util.LuceneTestCase.asSet(strArray27);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray27);
        java.lang.Class<?> wildcardClass30 = strArray24.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule33 = commonGramsTokenFilterFactoryTests32.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests32, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests32.setUp();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests32.assertPositionsSkippingEquals("", indexReader38, (int) (byte) 1, postingsEnum40, postingsEnum41);
        java.lang.Class<?> wildcardClass43 = commonGramsTokenFilterFactoryTests32.getClass();
        java.lang.String[] strArray46 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray46);
        java.lang.String[] strArray49 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray46, (java.lang.Object[]) strArray49);
        java.lang.Class<?> wildcardClass52 = strArray46.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray53 = new java.lang.reflect.AnnotatedElement[] { wildcardClass21, wildcardClass30, wildcardClass43, wildcardClass52 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet54 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray53);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray10, (java.lang.Object[]) annotatedElementArray53);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1938");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (float) ' ', (float) (-1), (float) 3);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1939");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("", byteArray7, byteArray9);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray13, longArray14);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray16, longArray17);
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray19, longArray20);
        org.junit.Assert.assertArrayEquals(longArray16, longArray19);
        org.junit.Assert.assertArrayEquals(longArray13, longArray19);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray25);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray19, (java.lang.Object) byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray24);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray32);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray31, byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray35);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray41);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray44);
        org.junit.Assert.assertArrayEquals("", byteArray40, byteArray44);
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
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray59);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray53, (java.lang.Object) byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray58);
        byte[] byteArray64 = new byte[] {};
        byte[] byteArray65 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray65);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray68);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray64, byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray58);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests74 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule75 = commonGramsTokenFilterFactoryTests74.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests74, (java.lang.Object) (-1L));
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        commonGramsTokenFilterFactoryTests74.assertPositionsSkippingEquals("", indexReader79, 4, postingsEnum81, postingsEnum82);
        org.junit.rules.TestRule testRule84 = commonGramsTokenFilterFactoryTests74.ruleChain;
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) byteArray35, (java.lang.Object) testRule84);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests86 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule87 = commonGramsTokenFilterFactoryTests86.ruleChain;
        commonGramsTokenFilterFactoryTests86.setUp();
        org.junit.rules.TestRule testRule89 = commonGramsTokenFilterFactoryTests86.ruleChain;
        org.apache.lucene.index.IndexReader indexReader91 = null;
        org.apache.lucene.index.Fields fields92 = null;
        org.apache.lucene.index.Fields fields93 = null;
        commonGramsTokenFilterFactoryTests86.assertFieldsEquals("tests.maxfailures", indexReader91, fields92, fields93, false);
        commonGramsTokenFilterFactoryTests86.tearDown();
        commonGramsTokenFilterFactoryTests86.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) byteArray35, (java.lang.Object) commonGramsTokenFilterFactoryTests86);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1940");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray8, longArray9);
        org.junit.Assert.assertArrayEquals(longArray5, longArray8);
        org.junit.Assert.assertArrayEquals(longArray2, longArray8);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray13, longArray14);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray16, longArray17);
        org.junit.Assert.assertArrayEquals(longArray13, longArray16);
        org.junit.Assert.assertArrayEquals(longArray2, longArray13);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray21, longArray22);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray24, longArray25);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray27, longArray28);
        org.junit.Assert.assertArrayEquals(longArray24, longArray27);
        org.junit.Assert.assertArrayEquals(longArray21, longArray27);
        org.junit.Assert.assertArrayEquals(longArray13, longArray27);
        long[] longArray34 = new long[] {};
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray34, longArray35);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray37, longArray38);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray40, longArray41);
        org.junit.Assert.assertArrayEquals(longArray38, longArray41);
        org.junit.Assert.assertArrayEquals("", longArray35, longArray38);
        org.junit.Assert.assertArrayEquals("random", longArray13, longArray38);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule47 = commonGramsTokenFilterFactoryTests46.ruleChain;
        commonGramsTokenFilterFactoryTests46.setUp();
        org.junit.rules.TestRule testRule49 = commonGramsTokenFilterFactoryTests46.ruleChain;
        commonGramsTokenFilterFactoryTests46.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        commonGramsTokenFilterFactoryTests46.assertPositionsSkippingEquals("tests.awaitsfix", indexReader52, 1, postingsEnum54, postingsEnum55);
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader58, (int) (byte) 100, postingsEnum60, postingsEnum61, false);
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        commonGramsTokenFilterFactoryTests46.assertDocsEnumEquals("tests.maxfailures", postingsEnum65, postingsEnum66, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) "random", (java.lang.Object) postingsEnum66);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1941");
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
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("hi!", indexReader13, terms14, terms15, true);
        commonGramsTokenFilterFactoryTests0.tearDown();
        short[] shortArray20 = new short[] { (byte) 0 };
        short[] shortArray22 = new short[] { (byte) 0 };
        short[] shortArray24 = new short[] { (byte) 0 };
        short[] shortArray26 = new short[] { (byte) 0 };
        short[] shortArray28 = new short[] { (byte) 0 };
        short[][] shortArray29 = new short[][] { shortArray20, shortArray22, shortArray24, shortArray26, shortArray28 };
        short[] shortArray31 = new short[] { (byte) 0 };
        short[] shortArray33 = new short[] { (byte) 0 };
        short[] shortArray35 = new short[] { (byte) 0 };
        short[] shortArray37 = new short[] { (byte) 0 };
        short[] shortArray39 = new short[] { (byte) 0 };
        short[][] shortArray40 = new short[][] { shortArray31, shortArray33, shortArray35, shortArray37, shortArray39 };
        short[] shortArray42 = new short[] { (byte) 0 };
        short[] shortArray44 = new short[] { (byte) 0 };
        short[] shortArray46 = new short[] { (byte) 0 };
        short[] shortArray48 = new short[] { (byte) 0 };
        short[] shortArray50 = new short[] { (byte) 0 };
        short[][] shortArray51 = new short[][] { shortArray42, shortArray44, shortArray46, shortArray48, shortArray50 };
        short[][][] shortArray52 = new short[][][] { shortArray29, shortArray40, shortArray51 };
        java.util.Set<short[][]> shortArraySet53 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray52);
        java.util.Set<short[][]> shortArraySet54 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) shortArraySet54);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1942");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) (byte) -1);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1943");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet1 = org.apache.lucene.util.LuceneTestCase.asSet(strArray0);
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray11 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray12 = new java.io.Serializable[][] { serializableArray5, serializableArray7, serializableArray9, serializableArray11 };
        java.util.Set<java.io.Serializable[]> serializableArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray12);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) "hi!", (java.lang.Object) serializableArray12);
        java.util.Set<java.io.Serializable[]> serializableArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray0, (java.lang.Object[]) serializableArray12);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1944");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        java.lang.String str11 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("<unknown>", indexReader13, (int) (short) 0, postingsEnum15, postingsEnum16);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.monster", indexReader20, 0, postingsEnum22, postingsEnum23, false);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.weekly", (int) ' ', numericDocValues28, numericDocValues29);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1945");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 10L, (double) 6);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1946");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray8);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray4, (java.lang.Object) (short) 10);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray19);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray15, (java.lang.Object[]) strArray19);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray28);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray15, (java.lang.Object[]) strArray28);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests34 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests34.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests34.assertDocsEnumEquals("hi!", postingsEnum37, postingsEnum38, false);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests34.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader42, (int) (byte) 100, postingsEnum44, postingsEnum45);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        commonGramsTokenFilterFactoryTests34.assertFieldsEquals("tests.nightly", indexReader48, fields49, fields50, true);
        commonGramsTokenFilterFactoryTests34.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests34.assertPositionsSkippingEquals("tests.maxfailures", indexReader55, (int) (byte) -1, postingsEnum57, postingsEnum58);
        commonGramsTokenFilterFactoryTests34.setUp();
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) strArray15, (java.lang.Object) commonGramsTokenFilterFactoryTests34);
        java.lang.Object[] objArray62 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) strArray15, objArray62);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1947");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) 0);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1948");
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray12, intArray19);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray1, intArray12);
        int[] intArray25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray25);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1949");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsEnumEquals("tests.failfast", postingsEnum33, postingsEnum34, true);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader38, 3, postingsEnum40, postingsEnum41, true);
        commonGramsTokenFilterFactoryTests31.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests45 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule46 = commonGramsTokenFilterFactoryTests45.ruleChain;
        commonGramsTokenFilterFactoryTests45.setUp();
        org.junit.rules.TestRule testRule48 = commonGramsTokenFilterFactoryTests45.ruleChain;
        commonGramsTokenFilterFactoryTests45.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests45.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests45.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests31, (java.lang.Object) commonGramsTokenFilterFactoryTests45);
        commonGramsTokenFilterFactoryTests31.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests31.assertDocsSkippingEquals("tests.nightly", indexReader55, 100, postingsEnum57, postingsEnum58, true);
        java.lang.String[] strArray63 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet64 = org.apache.lucene.util.LuceneTestCase.asSet(strArray63);
        java.lang.String[] strArray66 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet67 = org.apache.lucene.util.LuceneTestCase.asSet(strArray66);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray66);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray63, (java.lang.Object[]) strArray66);
        java.util.Set<java.io.Serializable> serializableSet70 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray63);
        java.lang.String[] strArray72 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet73 = org.apache.lucene.util.LuceneTestCase.asSet(strArray72);
        java.lang.String[] strArray75 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet76 = org.apache.lucene.util.LuceneTestCase.asSet(strArray75);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray75);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray72, (java.lang.Object[]) strArray75);
        java.util.Set<java.io.Serializable> serializableSet79 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray72);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray63, (java.lang.Object[]) strArray72);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum58, (java.lang.Object) strArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strIterableArray9, (java.lang.Object[]) strArray63);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1950");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) 'a', 0.0f, (float) 0);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1951");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray13);
        org.junit.Assert.assertArrayEquals("", shortArray6, shortArray10);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray22);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray29);
        org.junit.Assert.assertArrayEquals("", shortArray22, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray22);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray34);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) shortArray34);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1952");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray7 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2, testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures6 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet8 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray7);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests11.ruleChain;
        commonGramsTokenFilterFactoryTests11.setUp();
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray18);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray15, (java.lang.Object[]) strArray18);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests11, (java.lang.Object) strArray15);
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
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray43);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray39, (java.lang.Object[]) strArray43);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray43, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray33, (java.lang.Object[]) strArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray15, (java.lang.Object[]) strArray33);
        java.lang.String[] strArray52 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        java.lang.String[] strArray56 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray56);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray52, (java.lang.Object[]) strArray56);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray33, (java.lang.Object[]) strArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray7, (java.lang.Object[]) strArray52);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1953");
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
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling79 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Class<?> wildcardClass80 = throttling79.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) strArray51, (java.lang.Object) throttling79);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1954");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals(intArray3, intArray6);
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
        org.junit.Assert.assertArrayEquals("tests.slow", intArray3, intArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray11);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1955");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 6, (float) 0, 0.0f);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1956");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 5, (double) '4');
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1957");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0f, (float) 3, (float) (byte) 0);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1958");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) charArray6);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1959");
        short[] shortArray1 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray11);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray15);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray18);
        org.junit.Assert.assertArrayEquals("", shortArray11, shortArray15);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray11);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray27);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray1, shortArray24);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1960");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 1, (float) 0L, (float) (byte) 0);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1961");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsEnumEquals("tests.failfast", postingsEnum18, postingsEnum19, true);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader23, 3, postingsEnum25, postingsEnum26, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1962");
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
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray7, shortArray27);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray41);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray48);
        org.junit.Assert.assertArrayEquals("", shortArray41, shortArray45);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray54);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray57);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray64);
        org.junit.Assert.assertArrayEquals("", shortArray57, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray57);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray70);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray70, shortArray73);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray45, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray70);
        short[] shortArray79 = new short[] {};
        short[] shortArray80 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray79, shortArray80);
        short[] shortArray82 = new short[] {};
        short[] shortArray83 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray82, shortArray83);
        org.junit.Assert.assertArrayEquals(shortArray80, shortArray83);
        short[] shortArray86 = new short[] {};
        short[] shortArray87 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray86, shortArray87);
        short[] shortArray89 = new short[] {};
        short[] shortArray90 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray89, shortArray90);
        org.junit.Assert.assertArrayEquals(shortArray87, shortArray90);
        org.junit.Assert.assertArrayEquals("", shortArray83, shortArray87);
        org.junit.Assert.assertArrayEquals(shortArray70, shortArray87);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) shortArray87);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1963");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, 100.0d, (double) '4');
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1964");
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
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 1);
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs(2);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("", indexReader24, fields25, fields26, true);
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("tests.weekly", (int) (byte) 10, numericDocValues31, numericDocValues32);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1965");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) '4');
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1966");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 100, (float) (short) 10, (float) 1);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1967");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5, false);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader10, 100, postingsEnum12, postingsEnum13, false);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1968");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (-1.0d), (double) 0.0f);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1969");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("", indexReader13, fields14, fields15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.maxfailures", indexReader19, fields20, fields21, false);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("hi!", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1970");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100, (float) 5, (float) 5);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1971");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests3.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests3.ruleChain;
        java.lang.Class<?> wildcardClass10 = testRule9.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests13.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests13.setUp();
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) strSet19);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsEnumEquals("", postingsEnum22, postingsEnum23, false);
        org.elasticsearch.common.settings.Settings.Builder builder26 = commonGramsTokenFilterFactoryTests13.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsSkippingEquals("", indexReader28, 3, postingsEnum30, postingsEnum31, false);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsEnumEquals("tests.weekly", postingsEnum35, postingsEnum36, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) testRule9, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1972");
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        org.junit.Assert.assertArrayEquals("", charArray4, charArray7);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray7, charArray11);
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
        org.junit.Assert.assertArrayEquals(charArray7, charArray25);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) charArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1973");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 0.0d, (double) 5, 0.0d);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1974");
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
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) shortArray36);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1975");
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
        org.junit.Assert.assertNotEquals((java.lang.Object) 0, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.elasticsearch.common.settings.Settings.Builder builder20 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocsAndPositionsEnumEquals("hi!", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1976");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 100.0f, (double) 0.0f, (double) 10.0f);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1977");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 0L, (-1.0d), (double) (-1L));
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1978");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        java.lang.String str4 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1979");
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
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray40);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray45);
        java.lang.String[] strArray48 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet49 = org.apache.lucene.util.LuceneTestCase.asSet(strArray48);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray45, (java.lang.Object[]) strArray48);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray40, (java.lang.Object[]) strArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray25, (java.lang.Object[]) strArray48);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests53 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests53.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        commonGramsTokenFilterFactoryTests53.assertDocsEnumEquals("", postingsEnum56, postingsEnum57, false);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) strArray48, (java.lang.Object) postingsEnum56);
        java.lang.Object[] objArray61 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray48, objArray61);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1980");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (double) (short) 0, 10.0d, (double) 10L);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1981");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str5 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder6 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1982");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 5, (double) 3);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1983");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (byte) 100, (double) (byte) 0, (double) 5);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1984");
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
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("", postingsEnum23, postingsEnum24, true);
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (byte) 0, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1985");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) 5);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1986");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        java.lang.Iterable[] iterableArray10 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray11 = (java.lang.Iterable<java.lang.String>[]) iterableArray10;
        strIterableArray11[0] = strSet4;
        strIterableArray11[1] = strSet6;
        strIterableArray11[2] = strSet8;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray11);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) (-1.0d), (java.lang.Object) strIterableArray11);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] { locale21, "<unknown>", "tests.maxfailures" };
        java.util.Set<java.io.Serializable> serializableSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) (-1.0d), (java.lang.Object) serializableArray24);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray35);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray31, (java.lang.Object[]) strArray35);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray35, (java.lang.Object) 1.0d);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray44);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray47);
        java.lang.String[] strArray50 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray47, (java.lang.Object[]) strArray50);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray35, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray35);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray35, (java.lang.Object[]) strArray70);
        java.lang.String[] strArray77 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet78 = org.apache.lucene.util.LuceneTestCase.asSet(strArray77);
        java.util.Set<java.lang.String> strSet79 = org.apache.lucene.util.LuceneTestCase.asSet(strArray77);
        java.lang.String[] strArray81 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet82 = org.apache.lucene.util.LuceneTestCase.asSet(strArray81);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray81);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray77, (java.lang.Object[]) strArray81);
        java.lang.String[] strArray86 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet87 = org.apache.lucene.util.LuceneTestCase.asSet(strArray86);
        java.util.Set<java.lang.String> strSet88 = org.apache.lucene.util.LuceneTestCase.asSet(strArray86);
        java.lang.String[] strArray90 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet91 = org.apache.lucene.util.LuceneTestCase.asSet(strArray90);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray90);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray86, (java.lang.Object[]) strArray90);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray77, (java.lang.Object[]) strArray90);
        java.lang.String[] strArray95 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet96 = org.apache.lucene.util.LuceneTestCase.asSet(strArray95);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray90, (java.lang.Object[]) strArray95);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) strArray35, (java.lang.Object[]) strArray95);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray24, (java.lang.Object[]) strArray95);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1987");
        char[] charArray1 = null;
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals("", charArray8, charArray11);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray11, charArray16);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals("", charArray20, charArray23);
        org.junit.Assert.assertArrayEquals(charArray16, charArray23);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals("", charArray30, charArray33);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray33, charArray38);
        org.junit.Assert.assertArrayEquals(charArray16, charArray33);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray3, charArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray1, charArray3);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1988");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 3, (double) 10L, 100.0d);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1989");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.maxfailures", indexReader6, fields7, fields8, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setUp();
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
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray27 = new org.apache.lucene.util.LuceneTestCase[][] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet28 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray27);
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet29 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray23, (java.lang.Object[]) luceneTestCaseArray27);
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet31 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) luceneTestCaseArraySet31);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1990");
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
        org.junit.Assert.assertNotNull("", (java.lang.Object) strArray47);
        java.lang.Object[] objArray54 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray47, objArray54);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1991");
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
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader22, terms23, terms24, false);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("<unknown>", indexReader28, (int) '#', postingsEnum30, postingsEnum31, false);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray36);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray39);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray46);
        org.junit.Assert.assertArrayEquals("", shortArray39, shortArray43);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray52);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray55);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray59);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray62);
        org.junit.Assert.assertArrayEquals("", shortArray55, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray55);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray68);
        short[] shortArray70 = new short[] {};
        short[] shortArray71 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray70, shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) postingsEnum31, (java.lang.Object) shortArray55);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1992");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) ' ', (double) (byte) 10);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1993");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("hi!", postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader10, (int) (byte) 100, postingsEnum12, postingsEnum13);
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("<unknown>", indexReader19, 6, postingsEnum21, postingsEnum22);
        java.lang.String str24 = commonGramsTokenFilterFactoryTests2.getTestName();
        commonGramsTokenFilterFactoryTests2.setUp();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs(3);
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1994");
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
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) (byte) 100, postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1995");
        int[] intArray0 = null;
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
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        org.junit.Assert.assertArrayEquals(intArray19, intArray22);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals(intArray26, intArray29);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray19, intArray26);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        org.junit.Assert.assertArrayEquals(intArray35, intArray38);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        org.junit.Assert.assertArrayEquals(intArray43, intArray46);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        org.junit.Assert.assertArrayEquals(intArray50, intArray53);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray46, intArray53);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray35, intArray46);
        org.junit.Assert.assertArrayEquals(intArray19, intArray35);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray6, intArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray6);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1996");
        long[] longArray0 = null;
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray1, longArray2);
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray4, longArray5);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray7, longArray8);
        org.junit.Assert.assertArrayEquals(longArray4, longArray7);
        org.junit.Assert.assertArrayEquals(longArray1, longArray7);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray14, longArray15);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray17, longArray18);
        org.junit.Assert.assertArrayEquals(longArray14, longArray17);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray21, longArray22);
        org.junit.Assert.assertArrayEquals("hi!", longArray17, longArray22);
        long[] longArray26 = new long[] {};
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray26, longArray27);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray29, longArray30);
        org.junit.Assert.assertArrayEquals(longArray26, longArray29);
        long[] longArray33 = new long[] {};
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray33, longArray34);
        org.junit.Assert.assertArrayEquals("hi!", longArray29, longArray34);
        org.junit.Assert.assertArrayEquals(longArray22, longArray34);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray39, longArray40);
        long[] longArray42 = new long[] {};
        long[] longArray43 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray42, longArray43);
        org.junit.Assert.assertArrayEquals(longArray39, longArray42);
        long[] longArray46 = new long[] {};
        long[] longArray47 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray46, longArray47);
        org.junit.Assert.assertArrayEquals("hi!", longArray42, longArray47);
        org.junit.Assert.assertArrayEquals("", longArray22, longArray42);
        long[] longArray51 = new long[] {};
        long[] longArray52 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray51, longArray52);
        long[] longArray54 = new long[] {};
        long[] longArray55 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray54, longArray55);
        long[] longArray57 = new long[] {};
        long[] longArray58 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray57, longArray58);
        org.junit.Assert.assertArrayEquals(longArray54, longArray57);
        org.junit.Assert.assertArrayEquals(longArray51, longArray57);
        org.junit.Assert.assertArrayEquals(longArray42, longArray57);
        org.junit.Assert.assertArrayEquals(longArray1, longArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray1);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1997");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.failfast", indexReader9, 6, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("", indexReader15, 2, postingsEnum17, postingsEnum18);
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("random", 0, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1998");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.weekly", true);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1999");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("tests.failfast", postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader10, 3, postingsEnum12, postingsEnum13, true);
        commonGramsTokenFilterFactoryTests3.tearDown();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) (-1.0d));
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum21, postingsEnum22, false);
        java.lang.String str25 = commonGramsTokenFilterFactoryTests3.getTestName();
        commonGramsTokenFilterFactoryTests3.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests3);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test2000");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) (-1L), (float) 1L, (float) (byte) -1);
    }
}

