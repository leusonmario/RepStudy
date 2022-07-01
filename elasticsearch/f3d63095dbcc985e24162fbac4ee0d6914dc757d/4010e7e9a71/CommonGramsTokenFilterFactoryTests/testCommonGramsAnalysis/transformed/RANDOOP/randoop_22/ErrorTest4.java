import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2001");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) 10, (double) 100);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2002");
        long[] longArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray28);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2003");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2004");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '#', 0.0f, (float) (byte) -1);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2005");
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
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray9, byteArray38);
        byte[] byteArray70 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray70);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2006");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (short) 1, (long) 3);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2007");
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
        commonGramsTokenFilterFactoryTests58.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests58.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests61 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests61.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests61.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader64, (int) (byte) -1, postingsEnum66, postingsEnum67);
        commonGramsTokenFilterFactoryTests61.tearDown();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        commonGramsTokenFilterFactoryTests61.assertPositionsSkippingEquals("tests.weekly", indexReader71, (int) (byte) 1, postingsEnum73, postingsEnum74);
        java.lang.String str76 = commonGramsTokenFilterFactoryTests61.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder77 = commonGramsTokenFilterFactoryTests61.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests58, (java.lang.Object) commonGramsTokenFilterFactoryTests61);
        org.junit.Assert.assertNotEquals((java.lang.Object) shortArray25, (java.lang.Object) commonGramsTokenFilterFactoryTests61);
        java.lang.String str80 = commonGramsTokenFilterFactoryTests61.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests61.assertDocsAndPositionsEnumEquals("random", postingsEnum82, postingsEnum83);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2008");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals("", shortArray7, shortArray9);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray9, shortArray14);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray27);
        org.junit.Assert.assertArrayEquals("", shortArray24, shortArray26);
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray24, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray24);
        org.junit.Assert.assertArrayEquals("random", shortArray2, shortArray9);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray35);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray37);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray35);
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
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray52);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray63);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray66);
        org.junit.Assert.assertArrayEquals("", shortArray63, shortArray65);
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray63, shortArray69);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray9);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2009");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", (long) (short) -1, (long) (-1));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2010");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 100, (float) 4, (float) (-1));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2011");
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
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray29, (double) 1);
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
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray58, (double) (-1));
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) doubleArray29);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray6, doubleArray29, (double) (short) 0);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2012");
        double[] doubleArray0 = null;
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
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray34, (double) (short) 10);
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
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray83, (-1.0d));
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray83, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray7, (double) 2);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2013");
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
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests2.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) testRule28);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2014");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charSequenceArray61);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2015");
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
        char[] charArray19 = new char[] { '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray5, charArray19);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2016");
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
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("", postingsEnum11, postingsEnum12, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) true);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2017");
        byte[] byteArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray9);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2018");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", objArray1, (java.lang.Object[]) charSequenceArray62);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2019");
        char[][][][] charArray1 = new char[][][][] {};
        java.util.Set<char[][][]> charArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(charArray1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader7, (int) (byte) -1, postingsEnum9, postingsEnum10);
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests4.ruleChain;
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet18 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray17);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) charSequenceArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) charArray1, (java.lang.Object[]) charSequenceArray17);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2020");
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
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray15, byteArray31);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray50, byteArray51);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray54, byteArray55);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray51, byteArray55);
        byte[] byteArray60 = new byte[] {};
        byte[] byteArray61 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray60, byteArray61);
        byte[] byteArray64 = new byte[] {};
        byte[] byteArray65 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray64, byteArray65);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray61, byteArray64);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray55, byteArray61);
        byte[] byteArray72 = new byte[] {};
        byte[] byteArray73 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray72, byteArray73);
        byte[] byteArray76 = new byte[] {};
        byte[] byteArray77 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray76, byteArray77);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray73, byteArray77);
        byte[] byteArray82 = new byte[] {};
        byte[] byteArray83 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray82, byteArray83);
        byte[] byteArray86 = new byte[] {};
        byte[] byteArray87 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray86, byteArray87);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray83, byteArray86);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray77, byteArray83);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray61, byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray61);
        byte[] byteArray93 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray93);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2021");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 10.0d, (double) 0L, 0.0d);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2022");
        short[][] shortArray0 = new short[][] {};
        java.util.Set<short[]> shortArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray0);
        java.util.Set<java.lang.Cloneable> cloneableSet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) shortArray0);
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray4, longArray5);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray9, longArray10);
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray9, longArray12);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray15, longArray16);
        org.junit.Assert.assertArrayEquals(longArray12, longArray15);
        org.junit.Assert.assertArrayEquals(longArray4, longArray12);
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet26 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray25);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet32 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray31);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray25, (java.lang.Object[]) charSequenceArray31);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet39 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray31, (java.lang.Object[]) charSequenceArray38);
        java.util.Set<java.lang.Object> objSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charSequenceArray38);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests42.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests42.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests42.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests42.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str48 = commonGramsTokenFilterFactoryTests42.getTestName();
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray38, (java.lang.Object) str48);
        org.junit.Assert.assertNotSame((java.lang.Object) longArray4, (java.lang.Object) charSequenceArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) shortArray0, (java.lang.Object[]) charSequenceArray38);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2023");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 'a', 0.0d, (double) '4');
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2024");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, 100.0d, 0.0d);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2025");
        double[] doubleArray3 = new double[] { ' ', (-1) };
        double[] doubleArray6 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 100L);
        double[] doubleArray11 = new double[] { ' ', (-1) };
        double[] doubleArray14 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray14, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray11, 100.0d);
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
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "<unknown>", (java.lang.Object) doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray40, (double) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) doubleArray6);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2026");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder6 = commonGramsTokenFilterFactoryTests5.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests5.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests5.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsEnumEquals("random", postingsEnum10, postingsEnum11, false);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsEnumEquals("tests.monster", postingsEnum15, postingsEnum16, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) postingsEnum15);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2027");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.String str5 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.tearDown();
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests10.setUp();
        commonGramsTokenFilterFactoryTests10.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) testRule9, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2028");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests5.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests5);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests5.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsEnumEquals("tests.failfast", postingsEnum10, postingsEnum11, true);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests5.assertFieldsEquals("", indexReader15, fields16, fields17, false);
        commonGramsTokenFilterFactoryTests5.tearDown();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) testRule4, (java.lang.Object) commonGramsTokenFilterFactoryTests5);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2029");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("random", true);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2030");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 100L, (double) 100);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2031");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.monster", postingsEnum11, postingsEnum12, true);
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2032");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 2, (double) '#', (double) 100);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2033");
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
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray45, byteArray46);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray49, byteArray50);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray46, byteArray50);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray55, byteArray56);
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray59, byteArray60);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray56, byteArray59);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray50, byteArray56);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray34, byteArray50);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests65 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests65.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests65.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) byteArray34, (java.lang.Object) commonGramsTokenFilterFactoryTests65);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        commonGramsTokenFilterFactoryTests65.assertDocsSkippingEquals("tests.slow", indexReader70, (int) (byte) -1, postingsEnum72, postingsEnum73, true);
        commonGramsTokenFilterFactoryTests65.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests65);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2034");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray15);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2035");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray5);
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray9);
        java.lang.Class<?> wildcardClass11 = shortArray3.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests12.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests12.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader15, (int) (byte) -1, postingsEnum17, postingsEnum18);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsEnumEquals("tests.awaitsfix", postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        commonGramsTokenFilterFactoryTests12.assertTermsEquals("<unknown>", indexReader26, terms27, terms28, true);
        org.elasticsearch.common.settings.Settings.Builder builder31 = commonGramsTokenFilterFactoryTests12.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass11, (java.lang.Object) builder31);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2036");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 0.0f, (float) (-1), (float) (byte) -1);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2037");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        commonGramsTokenFilterFactoryTests7.assertTermsEquals("", indexReader9, terms10, terms11, false);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests7.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests7);
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests7.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests7);
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) locale20);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2038");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', (float) (byte) 100, (float) (short) 1);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2039");
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
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray47);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray50);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray64);
        org.junit.Assert.assertArrayEquals("", shortArray61, shortArray63);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray68);
        short[] shortArray70 = new short[] {};
        short[] shortArray71 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray70, shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray70);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray63, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray68);
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
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray77, shortArray83);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) shortArray33);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2040");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) '4', 1.0d);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2041");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str6 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.awaitsfix", indexReader8, terms9, terms10, true);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2042");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (short) 100, (double) 0L, (double) 0);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2043");
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
        org.junit.Assert.assertArrayEquals(longArray18, longArray28);
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
        org.junit.Assert.assertArrayEquals("", longArray45, longArray55);
        org.junit.Assert.assertArrayEquals(longArray18, longArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", obj1, (java.lang.Object) longArray18);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2044");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (byte) -1, (double) 100, (double) (byte) 100);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2045");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 10);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2046");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        java.lang.String str2 = commonGramsTokenFilterFactoryTests0.getTestName();
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals(charArray11, charArray14);
        org.junit.Assert.assertArrayEquals("", charArray7, charArray11);
        org.junit.Assert.assertArrayEquals(charArray4, charArray7);
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
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
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
        org.junit.Assert.assertArrayEquals(charArray32, charArray35);
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
        org.junit.Assert.assertArrayEquals(charArray32, charArray61);
        org.junit.Assert.assertArrayEquals(charArray20, charArray32);
        char[] charArray75 = new char[] {};
        char[] charArray76 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray75, charArray76);
        org.junit.Assert.assertArrayEquals(charArray32, charArray76);
        org.junit.Assert.assertArrayEquals(charArray4, charArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) str2, (java.lang.Object) charArray4);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2047");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder9 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.maxfailures", 10, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2048");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, 10L);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2049");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0f, (float) (-1L), 1.0f);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2050");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast" };
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast" };
        java.lang.CharSequence[][] charSequenceArray7 = new java.lang.CharSequence[][] { charSequenceArray3, charSequenceArray6 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray7);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests11.setUp();
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet25 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray24);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray24);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests11, (java.lang.Object) charSequenceArray18);
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
        java.lang.CharSequence[] charSequenceArray75 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet76 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray75);
        java.lang.CharSequence[] charSequenceArray81 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet82 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray81);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray75, (java.lang.Object[]) charSequenceArray81);
        java.lang.CharSequence[] charSequenceArray88 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet89 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray88);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray81, (java.lang.Object[]) charSequenceArray88);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray67, (java.lang.Object[]) charSequenceArray88);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray46, (java.lang.Object[]) charSequenceArray88);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) charSequenceArray18);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2051");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', 10L);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2052");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 10.0f, (float) 4, (-1.0f));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2053");
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
        org.elasticsearch.common.settings.Settings.Builder builder56 = commonGramsTokenFilterFactoryTests26.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum58, postingsEnum59, true);
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsEnumEquals("random", postingsEnum63, postingsEnum64, false);
        org.apache.lucene.index.NumericDocValues numericDocValues69 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues70 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests26.assertDocValuesEquals("enwiki.random.lines.txt", 1, numericDocValues69, numericDocValues70);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2054");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (short) 0, (double) '4');
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2055");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (-1), (long) 4);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2056");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10.0f, (double) (short) 10, (double) (short) 1);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2057");
        short[][] shortArray0 = new short[][] {};
        java.util.Set<short[]> shortArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray0);
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet14 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray13);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray28);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray22, (java.lang.Object[]) charSequenceArray28);
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet37 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray36);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray42);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray36, (java.lang.Object[]) charSequenceArray42);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray28, (java.lang.Object[]) charSequenceArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) charSequenceArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) shortArray0, (java.lang.Object[]) charSequenceArray42);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2058");
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
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) "tests.slow");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2059");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) '#', (double) 100, (double) 10);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2060");
        double[][][][] doubleArray0 = new double[][][][] {};
        java.util.Set<double[][][]> doubleArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray0);
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray0, (java.lang.Object[]) charSequenceArray53);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2061");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests4.setUp();
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet12 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray11);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet18 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray17);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray11, (java.lang.Object[]) charSequenceArray17);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) charSequenceArray11);
        commonGramsTokenFilterFactoryTests4.tearDown();
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) (-1.0d), (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsSkippingEquals("tests.maxfailures", indexReader24, (int) (byte) 10, postingsEnum26, postingsEnum27, false);
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests4.ruleChain;
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray35);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray33);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals("", shortArray43, shortArray45);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray52);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray45, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray50);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray64);
        org.junit.Assert.assertArrayEquals("", shortArray61, shortArray63);
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray61, shortArray67);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray70);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray76);
        short[] shortArray78 = new short[] {};
        short[] shortArray79 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray78, shortArray79);
        org.junit.Assert.assertArrayEquals("", shortArray76, shortArray78);
        org.junit.Assert.assertArrayEquals("hi!", shortArray70, shortArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) testRule30, (java.lang.Object) shortArray76);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2062");
        java.util.Set[][] setArray1 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray2 = (java.util.Set<java.lang.CharSequence>[][]) setArray1;
        java.util.Set<java.util.Set<java.lang.CharSequence>[]> charSequenceSetArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray2);
        java.lang.Object[] objArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceSetArray2, objArray4);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2063");
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
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.nightly", indexReader30, terms31, terms32, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) terms31);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2064");
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
        double[] doubleArray78 = new double[] { 'a', 100.0d, 1.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray78, (double) 0.0f);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2065");
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
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) charSequenceArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray7, (java.lang.Object[]) charSequenceArray27);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2066");
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
        long[] longArray94 = new long[] { (-1L), (-1), '4', 2, 1 };
        long[][] longArray95 = new long[][] { longArray94 };
        java.util.Set<long[]> longArraySet96 = org.apache.lucene.util.LuceneTestCase.asSet(longArray95);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray85, (java.lang.Object[]) longArray95);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2067");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet6 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.lang.Class<?> wildcardClass7 = charSequenceArray5.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) wildcardClass7);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2068");
        float[] floatArray1 = null;
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
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray27, (float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray1, floatArray5, (float) 0);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2069");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (-1), (double) 100.0f);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2070");
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
        java.util.Set<java.lang.reflect.Type> typeSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.Type[]) wildcardClassArray7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling16, throttling17 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling19, throttling20 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling22, throttling23 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling25 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling25, throttling26 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray28 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray18, throttlingArray21, throttlingArray24, throttlingArray27 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArraySet29 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) wildcardClassArray7, (java.lang.Object[]) throttlingArray28);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2071");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (byte) 10, (double) 1L);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2072");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) 100L, (double) 'a');
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2073");
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
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy29 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass30 = queryCachingPolicy29.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests32.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests32.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests36.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests36.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader39, (int) (byte) -1, postingsEnum41, postingsEnum42);
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests36.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests36);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests32, (java.lang.Object) "tests.slow");
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) wildcardClass30, (java.lang.Object) "tests.slow");
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.slow");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy50 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass51 = queryCachingPolicy50.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy52 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass53 = queryCachingPolicy52.getClass();
        java.lang.Class[] classArray55 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        wildcardClassArray56[0] = wildcardClass51;
        wildcardClassArray56[1] = wildcardClass53;
        java.util.Set<java.lang.Class<?>> wildcardClassSet61 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray56);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) wildcardClassArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) "tests.slow", (java.lang.Object) wildcardClassArray56);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2074");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        commonGramsTokenFilterFactoryTests7.assertTermsEquals("", indexReader9, terms10, terms11, false);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests7.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests7);
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests7.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests7);
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.weekly", (int) (byte) 100, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2075");
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
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader18, fields19, fields20, false);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.maxfailures", (int) ' ', numericDocValues25, numericDocValues26);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2076");
        char[] charArray1 = null;
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
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals(charArray29, charArray32);
        org.junit.Assert.assertArrayEquals("", charArray25, charArray29);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        org.junit.Assert.assertArrayEquals(charArray41, charArray44);
        org.junit.Assert.assertArrayEquals("", charArray37, charArray41);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray29, charArray37);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray21, charArray37);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
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
        char[] charArray68 = new char[] {};
        char[] charArray69 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray68, charArray69);
        char[] charArray71 = new char[] {};
        char[] charArray72 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray71, charArray72);
        char[] charArray74 = new char[] {};
        char[] charArray75 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray74, charArray75);
        org.junit.Assert.assertArrayEquals(charArray72, charArray75);
        org.junit.Assert.assertArrayEquals("", charArray68, charArray72);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray60, charArray68);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray52, charArray68);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray37, charArray52);
        org.junit.Assert.assertArrayEquals(charArray6, charArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray1, charArray6);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2077");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray15, byteArray16);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray16, byteArray20);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray25, byteArray26);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray29, byteArray30);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray26, byteArray29);
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
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray47);
        byte[] byteArray60 = new byte[] {};
        byte[] byteArray61 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray60, byteArray61);
        byte[] byteArray64 = new byte[] {};
        byte[] byteArray65 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray64, byteArray65);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray61, byteArray64);
        byte[] byteArray71 = new byte[] {};
        byte[] byteArray72 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray71, byteArray72);
        byte[] byteArray75 = new byte[] {};
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray75, byteArray76);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray72, byteArray76);
        byte[] byteArray81 = new byte[] {};
        byte[] byteArray82 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray81, byteArray82);
        byte[] byteArray85 = new byte[] {};
        byte[] byteArray86 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray85, byteArray86);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray82, byteArray85);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray76, byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray82);
        byte[] byteArray91 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray82, byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) builder12, (java.lang.Object) byteArray82);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2078");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests66 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests66.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        commonGramsTokenFilterFactoryTests66.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader69, (int) (byte) -1, postingsEnum71, postingsEnum72);
        org.junit.rules.TestRule testRule74 = commonGramsTokenFilterFactoryTests66.ruleChain;
        org.junit.rules.TestRule[] testRuleArray75 = new org.junit.rules.TestRule[] { testRule47, testRule56, testRule65, testRule74 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet76 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray75);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) testRuleArray37, (java.lang.Object[]) testRuleArray75);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2079");
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
        java.util.Set<java.lang.reflect.Type> typeSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.Type[]) wildcardClassArray18);
        java.util.Set<java.lang.Class<?>> wildcardClassSet26 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray18);
        int[] intArray31 = new int[] { 4, 4, 1, (byte) 1 };
        int[] intArray36 = new int[] { 4, 4, 1, (byte) 1 };
        int[] intArray41 = new int[] { 4, 4, 1, (byte) 1 };
        int[] intArray46 = new int[] { 4, 4, 1, (byte) 1 };
        int[] intArray51 = new int[] { 4, 4, 1, (byte) 1 };
        int[] intArray56 = new int[] { 4, 4, 1, (byte) 1 };
        int[][] intArray57 = new int[][] { intArray31, intArray36, intArray41, intArray46, intArray51, intArray56 };
        java.util.Set<int[]> intArraySet58 = org.apache.lucene.util.LuceneTestCase.asSet(intArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) wildcardClassArray18, (java.lang.Object[]) intArray57);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2080");
        double[][] doubleArray1 = new double[][] {};
        double[][] doubleArray2 = new double[][] {};
        double[][] doubleArray3 = new double[][] {};
        double[][] doubleArray4 = new double[][] {};
        double[][] doubleArray5 = new double[][] {};
        double[][][] doubleArray6 = new double[][][] { doubleArray1, doubleArray2, doubleArray3, doubleArray4, doubleArray5 };
        java.util.Set<double[][]> doubleArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray6);
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
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray48);
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet58 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray57);
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet64 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray63);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray57, (java.lang.Object[]) charSequenceArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray48, (java.lang.Object[]) charSequenceArray63);
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet73 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray72);
        java.lang.CharSequence[] charSequenceArray78 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet79 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray78);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray72, (java.lang.Object[]) charSequenceArray78);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray48, (java.lang.Object[]) charSequenceArray78);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) doubleArray6, (java.lang.Object[]) charSequenceArray48);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2081");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray3, byteArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray4);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2082");
        int[] intArray0 = null;
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
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray72, intArray73);
        int[] intArray76 = new int[] {};
        int[] intArray77 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray76, intArray77);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray72, intArray76);
        int[] intArray81 = new int[] {};
        int[] intArray82 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray81, intArray82);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray72, intArray81);
        org.junit.Assert.assertArrayEquals(intArray59, intArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray59);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2083");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray7);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) strArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, strArray7);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2084");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.failfast", indexReader5, terms6, terms7, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2085");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray7 = new java.util.Locale[] { locale2, locale4, locale6 };
        java.util.Set<java.util.Locale> localeSet8 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray7);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet14 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray13);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) localeArray7, (java.lang.Object[]) charSequenceArray13);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2086");
        long[] longArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray10);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2087");
        java.lang.Object obj1 = null;
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
        org.junit.Assert.assertSame("tests.maxfailures", obj1, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2088");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.nightly", indexReader7, fields8, fields9, true);
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests0.ruleChain;
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
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests14, (java.lang.Object) "<unknown>");
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests14.assertDocsEnumEquals("tests.monster", postingsEnum39, postingsEnum40, false);
        org.junit.rules.TestRule testRule43 = commonGramsTokenFilterFactoryTests14.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder44 = commonGramsTokenFilterFactoryTests14.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2089");
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
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.nightly", postingsEnum31, postingsEnum32, false);
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.monster", 0, numericDocValues37, numericDocValues38);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2090");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
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
        org.junit.Assert.assertArrayEquals(charArray6, charArray9);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals(charArray27, charArray30);
        org.junit.Assert.assertArrayEquals("", charArray23, charArray27);
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray27, charArray35);
        org.junit.Assert.assertArrayEquals(charArray9, charArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) charArray9);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2091");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) '#', 10L);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2092");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) ' ', (long) ' ');
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2093");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 3, (long) 10);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2094");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests11.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests11.setUp();
        java.lang.String str14 = commonGramsTokenFilterFactoryTests11.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests11);
        commonGramsTokenFilterFactoryTests11.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests11.setUp();
        commonGramsTokenFilterFactoryTests11.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests11.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) "tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests11);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2095");
        java.lang.Object obj1 = null;
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
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray27, (float) (byte) 10);
        float[] floatArray39 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray43 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray43, (float) 100L);
        float[] floatArray49 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray53 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray53, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray49, 1.0f);
        java.lang.Object obj58 = new java.lang.Object();
        org.junit.Assert.assertNotEquals((java.lang.Object) floatArray49, obj58);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray49, (float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", obj1, (java.lang.Object) floatArray49);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2096");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray3, intArray7);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray12, intArray13);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray3, intArray12);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray19, intArray20);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray23, intArray24);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray19, intArray23);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray29, intArray30);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray33, intArray34);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray29, intArray33);
        org.junit.Assert.assertArrayEquals("random", intArray19, intArray29);
        org.junit.Assert.assertArrayEquals(intArray3, intArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray19);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2097");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) 10);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2098");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 0.0f, (double) ' ', (double) (short) 1);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2099");
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
        commonGramsTokenFilterFactoryTests41.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests41);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2100");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) 3);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2101");
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
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("", (-1), numericDocValues28, numericDocValues29);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2102");
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
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet48 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray47);
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet54 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray53);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray47, (java.lang.Object[]) charSequenceArray53);
        java.lang.CharSequence[] charSequenceArray60 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet61 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray60);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray53, (java.lang.Object[]) charSequenceArray60);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray39, (java.lang.Object[]) charSequenceArray60);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray60);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests65 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests65.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        commonGramsTokenFilterFactoryTests65.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader68, (int) (byte) -1, postingsEnum70, postingsEnum71);
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.Fields fields75 = null;
        org.apache.lucene.index.Fields fields76 = null;
        commonGramsTokenFilterFactoryTests65.assertFieldsEquals("random", indexReader74, fields75, fields76, false);
        org.junit.rules.TestRule testRule79 = commonGramsTokenFilterFactoryTests65.ruleChain;
        commonGramsTokenFilterFactoryTests65.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray60, (java.lang.Object) commonGramsTokenFilterFactoryTests65);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests83 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests83.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests83);
        commonGramsTokenFilterFactoryTests83.tearDown();
        commonGramsTokenFilterFactoryTests83.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests83.setIndexWriterMaxDocs((int) '#');
        org.junit.Assert.assertNotNull("", (java.lang.Object) commonGramsTokenFilterFactoryTests83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests65, (java.lang.Object) commonGramsTokenFilterFactoryTests83);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2103");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 1L, 0L);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2104");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100, (float) 4, (float) 2);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2105");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 2, (double) (short) 10);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2106");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (-1.0f), (double) '#', (double) (short) 0);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2107");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, 0L);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2108");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) ' ', 0.0f, (float) 10);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2109");
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
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        org.junit.Assert.assertArrayEquals(charArray16, charArray19);
        org.junit.Assert.assertArrayEquals("", charArray12, charArray16);
        org.junit.Assert.assertArrayEquals(charArray9, charArray12);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals(charArray30, charArray33);
        org.junit.Assert.assertArrayEquals("", charArray26, charArray30);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals(charArray42, charArray45);
        org.junit.Assert.assertArrayEquals("", charArray38, charArray42);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray30, charArray38);
        org.junit.Assert.assertArrayEquals(charArray9, charArray38);
        org.junit.Assert.assertArrayEquals(charArray5, charArray9);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals(charArray52, charArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) charArray5, (java.lang.Object) charArray52);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2110");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.monster", postingsEnum14, postingsEnum15, false);
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
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray45, byteArray46);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray49, byteArray50);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray46, byteArray50);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray55, byteArray56);
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray59, byteArray60);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray56, byteArray59);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray50, byteArray56);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray34, byteArray50);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests65 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests65.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests65.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) byteArray34, (java.lang.Object) commonGramsTokenFilterFactoryTests65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) "tests.monster", (java.lang.Object) "<unknown>");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2111");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray2 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet3 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray2);
        char[][][][] charArray4 = new char[][][][] {};
        java.util.Set<char[][][]> charArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(charArray4);
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) queryCachingPolicyArray2, (java.lang.Object[]) charArray4);
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) charArray4, (java.lang.Object[]) charSequenceArray40);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2112");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (-1.0f), (float) 1, (float) (byte) 1);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2113");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        org.junit.Assert.assertArrayEquals(charArray1, charArray4);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
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
        org.junit.Assert.assertArrayEquals("", charArray14, charArray18);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals(charArray30, charArray33);
        org.junit.Assert.assertArrayEquals("", charArray26, charArray30);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray18, charArray26);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray10, charArray26);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
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
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        org.junit.Assert.assertArrayEquals(charArray61, charArray64);
        org.junit.Assert.assertArrayEquals("", charArray57, charArray61);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray49, charArray57);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray41, charArray57);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray26, charArray41);
        org.junit.Assert.assertArrayEquals(charArray4, charArray26);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        char[] charArray79 = new char[] {};
        char[] charArray80 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray79, charArray80);
        char[] charArray82 = new char[] {};
        char[] charArray83 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray82, charArray83);
        org.junit.Assert.assertArrayEquals(charArray80, charArray83);
        org.junit.Assert.assertArrayEquals("", charArray76, charArray80);
        org.junit.Assert.assertArrayEquals(charArray73, charArray76);
        org.junit.Assert.assertArrayEquals(charArray4, charArray76);
        char[] charArray89 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray76, charArray89);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2114");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 3, (-1L));
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2115");
        char[] charArray0 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule10;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule10;
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals(charArray13, charArray17);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) testRule10, (java.lang.Object) charArray13);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals(charArray22, charArray25);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
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
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray31, charArray47);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        org.junit.Assert.assertArrayEquals(charArray70, charArray73);
        org.junit.Assert.assertArrayEquals("", charArray66, charArray70);
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray70, charArray78);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray62, charArray78);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray47, charArray62);
        org.junit.Assert.assertArrayEquals(charArray25, charArray47);
        org.junit.Assert.assertNotNull((java.lang.Object) charArray25);
        org.junit.Assert.assertArrayEquals(charArray13, charArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray13);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2116");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) (short) 0);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2117");
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
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray24, longArray25);
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray24, longArray27);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray30, longArray31);
        org.junit.Assert.assertArrayEquals(longArray27, longArray30);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray17, longArray27);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray37, longArray38);
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray37, longArray40);
        long[] longArray44 = new long[] {};
        long[] longArray45 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray44, longArray45);
        long[] longArray47 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray44, longArray47);
        org.junit.Assert.assertArrayEquals(longArray37, longArray47);
        org.junit.Assert.assertArrayEquals(longArray17, longArray37);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray10, longArray17);
        long[] longArray56 = new long[] {};
        long[] longArray57 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray56, longArray57);
        long[] longArray59 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray56, longArray59);
        long[] longArray63 = new long[] {};
        long[] longArray64 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray63, longArray64);
        long[] longArray66 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray63, longArray66);
        long[] longArray69 = new long[] {};
        long[] longArray70 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray69, longArray70);
        org.junit.Assert.assertArrayEquals(longArray66, longArray69);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray56, longArray66);
        long[] longArray76 = new long[] {};
        long[] longArray77 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray76, longArray77);
        long[] longArray79 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray76, longArray79);
        org.junit.Assert.assertArrayEquals("", longArray66, longArray76);
        org.junit.Assert.assertArrayEquals(longArray17, longArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) longArray76);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2118");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, (long) 'a');
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2119");
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
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests17);
        commonGramsTokenFilterFactoryTests17.setIndexWriterMaxDocs((int) (byte) 100);
        commonGramsTokenFilterFactoryTests17.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests17, (java.lang.Object) 100.0d);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2120");
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
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.awaitsfix", indexReader35, terms36, terms37, true);
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum41, postingsEnum42);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2121");
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
        java.util.Set<java.lang.Object> objSet66 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charSequenceArray19);
        java.lang.Object[] objArray67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) charSequenceArray19, objArray67);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2122");
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
        org.junit.Assert.assertNull((java.lang.Object) "tests.weekly");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2123");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("tests.awaitsfix", indexReader14, 4, postingsEnum16, postingsEnum17, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) 4);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2124");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 0, 1.0d, (double) 100);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2125");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) '#', (double) (-1L));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2126");
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
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests3.assertDocValuesEquals("tests.maxfailures", 0, numericDocValues32, numericDocValues33);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2127");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) '#');
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2128");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (short) 1, (-1.0d), (double) (short) 1);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2129");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 3, (float) ' ', (float) (short) -1);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2130");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 100.0f, 0.0f, 1.0f);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2131");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray8);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray15);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals("", shortArray15, shortArray17);
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray15, shortArray21);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray25);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray28);
        org.junit.Assert.assertArrayEquals("", shortArray25, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray21);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray36);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray44);
        org.junit.Assert.assertArrayEquals("", shortArray41, shortArray43);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray50);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray43, shortArray48);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray58);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
        org.junit.Assert.assertArrayEquals("", shortArray58, shortArray60);
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray58, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray58);
        org.junit.Assert.assertArrayEquals("random", shortArray36, shortArray43);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray69);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray43, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray68);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) longArray3, (java.lang.Object) shortArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray68);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2132");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) shortArray1);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2133");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) strArray14);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2134");
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
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", 3, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2135");
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
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2136");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) 10);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2137");
        java.lang.Object[] objArray0 = null;
        long[] longArray6 = new long[] { (-1L), (-1), '4', 2, 1 };
        long[][] longArray7 = new long[][] { longArray6 };
        java.util.Set<long[]> longArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(longArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) longArray7);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2138");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) ' ', (double) ' ');
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2139");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 10L, 100.0d);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2140");
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
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests18.setUp();
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet26 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray25);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet32 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray31);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray25, (java.lang.Object[]) charSequenceArray31);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) charSequenceArray25);
        commonGramsTokenFilterFactoryTests18.tearDown();
        org.junit.rules.TestRule testRule36 = commonGramsTokenFilterFactoryTests18.ruleChain;
        java.lang.String str37 = commonGramsTokenFilterFactoryTests18.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsEnumEquals("tests.nightly", postingsEnum39, postingsEnum40, true);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) true);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder45 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) builder45);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2141");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) 0L, (double) 10.0f, (double) 10.0f);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2142");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader10, terms11, terms12, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) terms11);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2143");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (short) 0);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2144");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) 10, (long) 1);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2145");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, 0.0d, (double) 100);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2146");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 4, (long) (byte) 100);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2147");
        double[] doubleArray6 = new double[] { 10L, 10.0f, ' ', (byte) 100, ' ' };
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
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray27, (double) 1);
        double[] doubleArray39 = new double[] { ' ', (-1) };
        double[] doubleArray42 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray42, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray42, (double) 100);
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
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "<unknown>", (java.lang.Object) doubleArray68);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray10, doubleArray68, 0.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray6, doubleArray68, (double) 100);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2148");
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
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.failfast", indexReader18, terms19, terms20, true);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2149");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 100L, (double) (-1L), (double) 1);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2150");
        short[][] shortArray1 = new short[][] {};
        java.util.Set<short[]> shortArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray1);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.Locale[][] localeArray4 = new java.util.Locale[][] { localeArray3 };
        java.util.Set<java.util.Locale[]> localeArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) shortArray1, (java.lang.Object[]) localeArray4);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2151");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.maxfailures", true);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2152");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (short) -1, 0L);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2153");
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
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests42.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests42.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests45 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests45.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        commonGramsTokenFilterFactoryTests45.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader48, (int) (byte) -1, postingsEnum50, postingsEnum51);
        commonGramsTokenFilterFactoryTests45.tearDown();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests45.assertPositionsSkippingEquals("tests.weekly", indexReader55, (int) (byte) 1, postingsEnum57, postingsEnum58);
        java.lang.String str60 = commonGramsTokenFilterFactoryTests45.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder61 = commonGramsTokenFilterFactoryTests45.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests42, (java.lang.Object) commonGramsTokenFilterFactoryTests45);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests63 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        commonGramsTokenFilterFactoryTests63.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader65, 0, postingsEnum67, postingsEnum68);
        commonGramsTokenFilterFactoryTests63.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        commonGramsTokenFilterFactoryTests63.assertPositionsSkippingEquals("tests.weekly", indexReader72, (int) '#', postingsEnum74, postingsEnum75);
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        commonGramsTokenFilterFactoryTests63.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader78, 0, postingsEnum80, postingsEnum81);
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        commonGramsTokenFilterFactoryTests63.assertDocsSkippingEquals("", indexReader84, (int) (short) -1, postingsEnum86, postingsEnum87, true);
        commonGramsTokenFilterFactoryTests63.setUp();
        commonGramsTokenFilterFactoryTests63.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder92 = commonGramsTokenFilterFactoryTests63.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests63.tearDown();
        java.lang.String str94 = commonGramsTokenFilterFactoryTests63.getTestName();
        commonGramsTokenFilterFactoryTests63.tearDown();
        commonGramsTokenFilterFactoryTests63.setIndexWriterMaxDocs(10);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests45, (java.lang.Object) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 10);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2154");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.Object obj6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, obj6);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2155");
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
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 1);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2156");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (byte) 1, (-1.0d), (double) (short) 1);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2157");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 0L, (double) (byte) -1);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2158");
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
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale40, locale42, locale44 };
        java.util.Set<java.util.Locale> localeSet46 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray45);
        java.util.Set<java.util.Locale> localeSet47 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceSetArray14, (java.lang.Object[]) localeArray45);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2159");
        int[] intArray1 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray1, intArray9);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2160");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.badapples", postingsEnum9, postingsEnum10, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) true);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2161");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 2, (double) '#');
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2162");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, 0.0d);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2163");
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
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 100);
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        java.lang.String str29 = commonGramsTokenFilterFactoryTests1.getTestName();
        long[] longArray32 = new long[] {};
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray32, longArray33);
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray32, longArray35);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray39, longArray40);
        long[] longArray42 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray39, longArray42);
        org.junit.Assert.assertArrayEquals(longArray32, longArray42);
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
        org.junit.Assert.assertArrayEquals("", longArray59, longArray69);
        org.junit.Assert.assertArrayEquals(longArray32, longArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) str29, (java.lang.Object) longArray32);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2164");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 10.0f);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2165");
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
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray23, 0.0f);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2166");
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray0 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray1 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[][] baseTokenStreamTestCaseArray2 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[][] { baseTokenStreamTestCaseArray0, baseTokenStreamTestCaseArray1 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase[]> baseTokenStreamTestCaseArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray2);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass6 = queryCachingPolicy5.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy7 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass8 = queryCachingPolicy7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass6;
        wildcardClassArray11[1] = wildcardClass8;
        java.util.Set<java.lang.Class<?>> wildcardClassSet16 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray11);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) wildcardClassArray11);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) baseTokenStreamTestCaseArray2, (java.lang.Object[]) wildcardClassArray11);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2167");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) 0.0f);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2168");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 1, (float) 10, (float) 1L);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2169");
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
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        commonGramsTokenFilterFactoryTests12.assertTermsEquals("", indexReader14, terms15, terms16, false);
        java.lang.String str19 = commonGramsTokenFilterFactoryTests12.getTestName();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsSkippingEquals("", indexReader21, (int) '4', postingsEnum23, postingsEnum24, true);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum28, postingsEnum29, true);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsSkippingEquals("random", indexReader33, (int) (byte) -1, postingsEnum35, postingsEnum36, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests12);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2170");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) 3);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2171");
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
        float[] floatArray17 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray21 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray21, (float) 100L);
        float[] floatArray27 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray31 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray31, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray27, 1.0f);
        float[] floatArray40 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray44 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray44, (float) 100L);
        float[] floatArray50 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray54 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray54, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray50, 1.0f);
        float[] floatArray62 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray66 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray66, (float) 100L);
        float[] floatArray72 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray76 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray72, floatArray76, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray72, 1.0f);
        org.junit.Assert.assertArrayEquals("random", floatArray40, floatArray62, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray40, (float) 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) 1L);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2172");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 100, 100.0d);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2173");
        float[] floatArray0 = null;
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
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray27, (float) 0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray4, 0.0f);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2174");
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
        java.util.Set[][] setArray27 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray28 = (java.util.Set<java.lang.CharSequence>[][]) setArray27;
        java.util.Set[][] setArray30 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray31 = (java.util.Set<java.lang.CharSequence>[][]) setArray30;
        java.util.Set[][] setArray33 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray34 = (java.util.Set<java.lang.CharSequence>[][]) setArray33;
        java.util.Set[][] setArray36 = new java.util.Set[0][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][] charSequenceSetArray37 = (java.util.Set<java.lang.CharSequence>[][]) setArray36;
        java.util.Set[][][] setArray39 = new java.util.Set[4][][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.CharSequence>[][][] charSequenceSetArray40 = (java.util.Set<java.lang.CharSequence>[][][]) setArray39;
        charSequenceSetArray40[0] = charSequenceSetArray28;
        charSequenceSetArray40[1] = charSequenceSetArray31;
        charSequenceSetArray40[2] = charSequenceSetArray34;
        charSequenceSetArray40[3] = charSequenceSetArray37;
        java.util.Set<java.util.Set<java.lang.CharSequence>[][]> charSequenceSetArraySet49 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceSetArray40);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet62 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray61);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray55, (java.lang.Object[]) charSequenceArray61);
        org.junit.Assert.assertNotSame((java.lang.Object) charSequenceSetArray40, (java.lang.Object) charSequenceArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) wildcardClassArray7, (java.lang.Object[]) charSequenceArray61);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2175");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.awaitsfix", indexReader9, terms10, terms11, true);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests15.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests15);
        commonGramsTokenFilterFactoryTests15.tearDown();
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        java.lang.String str21 = commonGramsTokenFilterFactoryTests15.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsEnumEquals("random", postingsEnum23, postingsEnum24, false);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) postingsEnum23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum23);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2176");
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
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) 0, (java.lang.Object) charSequenceArray23);
        java.lang.Object obj65 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) "tests.awaitsfix", obj65);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2177");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 100);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2178");
        int[] intArray0 = null;
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
        org.junit.Assert.assertArrayEquals("hi!", intArray49, intArray54);
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
        org.junit.Assert.assertArrayEquals(intArray49, intArray70);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray6, intArray49);
        int[] intArray80 = new int[] {};
        int[] intArray81 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray80, intArray81);
        int[] intArray84 = new int[] {};
        int[] intArray85 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray84, intArray85);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray80, intArray84);
        int[] intArray89 = new int[] {};
        int[] intArray90 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray89, intArray90);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray80, intArray89);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) intArray89);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray49, intArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray49);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2179");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", obj1);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2180");
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
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2181");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader5, (int) (byte) -1, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.monster", postingsEnum14, postingsEnum15, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests18.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests18.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests18.tearDown();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) postingsEnum14, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("enwiki.random.lines.txt", indexReader24, fields25, fields26, true);
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests18.assertDocValuesEquals("tests.weekly", (int) (short) 100, numericDocValues31, numericDocValues32);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2182");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 10.0f, (float) (short) 100, 0.0f);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2183");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        java.lang.String str9 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.monster", indexReader11, (int) (byte) 0, postingsEnum13, postingsEnum14, false);
        float[] floatArray20 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray24 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray24, (float) 100L);
        float[] floatArray30 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray34 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray34, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray30, 1.0f);
        float[] floatArray42 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray46 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray46, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray42, (float) (byte) 10);
        float[] floatArray54 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray58 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray58, (float) 100L);
        float[] floatArray64 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray68 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray64, floatArray68, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray64, 1.0f);
        java.lang.Object obj73 = new java.lang.Object();
        org.junit.Assert.assertNotEquals((java.lang.Object) floatArray64, obj73);
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray64, (float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) postingsEnum13, (java.lang.Object) (byte) 10);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2184");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests67 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        commonGramsTokenFilterFactoryTests67.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader69, 0, postingsEnum71, postingsEnum72);
        commonGramsTokenFilterFactoryTests67.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        commonGramsTokenFilterFactoryTests67.assertPositionsSkippingEquals("tests.weekly", indexReader76, (int) '#', postingsEnum78, postingsEnum79);
        org.apache.lucene.index.IndexReader indexReader82 = null;
        org.apache.lucene.index.Fields fields83 = null;
        org.apache.lucene.index.Fields fields84 = null;
        commonGramsTokenFilterFactoryTests67.assertFieldsEquals("enwiki.random.lines.txt", indexReader82, fields83, fields84, true);
        commonGramsTokenFilterFactoryTests67.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests67.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) doubleArraySet66, (java.lang.Object) commonGramsTokenFilterFactoryTests67);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2185");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 2, (float) 100L, (float) (byte) -1);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2186");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) (byte) 10);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2187");
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
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("", 100, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2188");
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
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.badapples", postingsEnum16, postingsEnum17, true);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.badapples", 1, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2189");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 10L, (double) 10);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2190");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 10, 0.0d);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2191");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) strComparableSet7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strComparableSet7);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2192");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        java.lang.String str2 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder3 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.awaitsfix", 4, numericDocValues8, numericDocValues9);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2193");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals(charArray11, charArray14);
        org.junit.Assert.assertArrayEquals("", charArray7, charArray11);
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray11, charArray19);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray3, charArray19);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals(charArray42, charArray45);
        org.junit.Assert.assertArrayEquals("", charArray38, charArray42);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        org.junit.Assert.assertArrayEquals(charArray54, charArray57);
        org.junit.Assert.assertArrayEquals("", charArray50, charArray54);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray42, charArray50);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray34, charArray50);
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray69, charArray77);
        org.junit.Assert.assertArrayEquals(charArray34, charArray69);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray19, charArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2194");
        float[] floatArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray52, (float) (-1));
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2195");
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
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.weekly", indexReader22, fields23, fields24, true);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.awaitsfix", indexReader28, (int) '#', postingsEnum30, postingsEnum31, false);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests1.ruleChain;
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
        commonGramsTokenFilterFactoryTests37.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests37.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule59 = commonGramsTokenFilterFactoryTests37.ruleChain;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) testRule59, (java.lang.Object) (byte) 10);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule59;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule59;
        org.junit.Assert.assertNotNull((java.lang.Object) testRule59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) testRule35, (java.lang.Object) testRule59);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2196");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (double) 0, (double) 2, (double) 2);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2197");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals("", shortArray7, shortArray9);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray9, shortArray14);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray27);
        org.junit.Assert.assertArrayEquals("", shortArray24, shortArray26);
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray24, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray24);
        org.junit.Assert.assertArrayEquals("random", shortArray2, shortArray9);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray35);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray37);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray42);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray44);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray52);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray50);
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
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray67);
        short[] shortArray77 = new short[] {};
        short[] shortArray78 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray77, shortArray78);
        short[] shortArray80 = new short[] {};
        short[] shortArray81 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray80, shortArray81);
        org.junit.Assert.assertArrayEquals("", shortArray78, shortArray80);
        short[] shortArray84 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray78, shortArray84);
        short[] shortArray86 = new short[] {};
        short[] shortArray87 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray86, shortArray87);
        org.junit.Assert.assertArrayEquals(shortArray84, shortArray87);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray87);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray87);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray87);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray44);
        short[] shortArray94 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray94);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2198");
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
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2199");
        short[][] shortArray1 = new short[][] {};
        java.util.Set<short[]> shortArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray1);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray8, (java.lang.Object[]) charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet22 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray21);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet31 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray30);
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet37 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray36);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray30, (java.lang.Object[]) charSequenceArray36);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet45 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray44);
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet51 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray50);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray44, (java.lang.Object[]) charSequenceArray50);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray36, (java.lang.Object[]) charSequenceArray50);
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray21, (java.lang.Object) charSequenceArray36);
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet63 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray62);
        java.lang.CharSequence[] charSequenceArray68 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet69 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray68);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray62, (java.lang.Object[]) charSequenceArray68);
        java.lang.CharSequence[] charSequenceArray76 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet77 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray76);
        java.lang.CharSequence[] charSequenceArray82 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet83 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray82);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray76, (java.lang.Object[]) charSequenceArray82);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray68, (java.lang.Object[]) charSequenceArray82);
        java.lang.CharSequence[] charSequenceArray90 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet91 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray90);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) charSequenceArray68, (java.lang.Object[]) charSequenceArray90);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray21, (java.lang.Object[]) charSequenceArray90);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) shortArray1, (java.lang.Object[]) charSequenceArray90);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2200");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 4, (double) 1.0f);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2201");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 10);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum7, postingsEnum8);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2202");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests1.getTestName();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray8);
        java.lang.Object obj10 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests11.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests11.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader14, (int) (byte) -1, postingsEnum16, postingsEnum17);
        commonGramsTokenFilterFactoryTests11.tearDown();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests11.assertPositionsSkippingEquals("tests.weekly", indexReader21, (int) (byte) 1, postingsEnum23, postingsEnum24);
        org.junit.Assert.assertNotEquals(obj10, (java.lang.Object) commonGramsTokenFilterFactoryTests11);
        commonGramsTokenFilterFactoryTests11.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) charSequenceArray8, (java.lang.Object) commonGramsTokenFilterFactoryTests11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests11);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2203");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) (short) 0);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2204");
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
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests17.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests17);
        commonGramsTokenFilterFactoryTests17.tearDown();
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests17);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2205");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) 2);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2206");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests10.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests10);
        commonGramsTokenFilterFactoryTests10.setIndexWriterMaxDocs((int) (byte) 10);
        commonGramsTokenFilterFactoryTests10.setUp();
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) terms7, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests10.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2207");
        java.lang.Object[] objArray1 = null;
        char[] charArray5 = new char[] { '4', '4', ' ' };
        char[] charArray9 = new char[] { '4', '4', ' ' };
        char[] charArray13 = new char[] { '4', '4', ' ' };
        char[][] charArray14 = new char[][] { charArray5, charArray9, charArray13 };
        java.util.Set<char[]> charArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(charArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", objArray1, (java.lang.Object[]) charArray14);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2208");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (float) 1, (float) '4', (float) (-1L));
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2209");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.weekly", postingsEnum9, postingsEnum10, false);
        java.lang.String str13 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.Object obj16 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests18.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests18.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests18.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests18.setUp();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests18.assertPositionsSkippingEquals("tests.failfast", indexReader27, 10, postingsEnum29, postingsEnum30);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests18.assertPositionsSkippingEquals("tests.slow", indexReader33, (int) ' ', postingsEnum35, postingsEnum36);
        commonGramsTokenFilterFactoryTests18.setUp();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) 10);
        commonGramsTokenFilterFactoryTests18.setUp();
        org.junit.Assert.assertNotEquals(obj16, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        commonGramsTokenFilterFactoryTests18.overrideTestDefaultQueryCache();
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray47, intArray48);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray51, intArray52);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray47, intArray51);
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray56, intArray57);
        org.junit.Assert.assertArrayEquals("hi!", intArray51, intArray56);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray63, intArray64);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray67, intArray68);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray63, intArray67);
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray72, intArray73);
        org.junit.Assert.assertArrayEquals("hi!", intArray67, intArray72);
        org.junit.Assert.assertArrayEquals(intArray51, intArray72);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) intArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) intArray72);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2210");
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
        org.elasticsearch.common.settings.Settings.Builder builder22 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2211");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
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
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray20, (java.lang.Object[]) charSequenceArray48);
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray48);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures53 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures54 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures53);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures55 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures56 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures55);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures57 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures58 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures57);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures59 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures60 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures59);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray61 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures54, testRuleIgnoreAfterMaxFailures56, testRuleIgnoreAfterMaxFailures57, testRuleIgnoreAfterMaxFailures59 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray62 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray61 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet63 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray62);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2212");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray4, intArray8);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray16, intArray17);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray20, intArray21);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray16, intArray20);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray16, intArray25);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray32, intArray33);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray36, intArray37);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray32, intArray36);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray42, intArray43);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray46, intArray47);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray42, intArray46);
        org.junit.Assert.assertArrayEquals("random", intArray32, intArray42);
        org.junit.Assert.assertArrayEquals(intArray16, intArray32);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray54, intArray55);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray58, intArray59);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray54, intArray58);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray32, intArray58);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray66, intArray67);
        int[] intArray70 = new int[] {};
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray70, intArray71);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray66, intArray70);
        int[] intArray75 = new int[] {};
        int[] intArray76 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray75, intArray76);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray66, intArray75);
        org.junit.Assert.assertArrayEquals(intArray58, intArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray8, intArray58, (java.lang.Integer) 10);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2213");
        float[] floatArray4 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray8 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray8, (float) 100L);
        float[] floatArray16 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray20 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray20, (float) 100L);
        float[] floatArray26 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray30 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray30, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray26, 1.0f);
        float[] floatArray38 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray42 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray42, (float) 100L);
        float[] floatArray48 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray52 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray52, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray48, 1.0f);
        java.lang.Object obj57 = new java.lang.Object();
        org.junit.Assert.assertNotEquals((java.lang.Object) floatArray48, obj57);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray16, floatArray48, 100.0f);
        float[] floatArray64 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray68 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray64, floatArray68, (float) 100L);
        float[] floatArray74 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray78 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray74, floatArray78, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray64, floatArray74, 1.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray16, floatArray74, (float) (byte) 1);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray8, floatArray16, (float) (short) 10);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2214");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", 0.0d, (double) (-1L), (double) (byte) 10);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2215");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 1, (double) (short) 0, (double) 3);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2216");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) '#');
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2217");
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
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.monster", 4, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2218");
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
        java.util.Set<java.lang.Class<?>> wildcardClassSet13 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray6);
        java.util.Locale[] localeArray14 = new java.util.Locale[] {};
        java.util.Locale[][] localeArray15 = new java.util.Locale[][] { localeArray14 };
        java.util.Set<java.util.Locale[]> localeArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray15);
        java.util.Set<java.util.Locale[]> localeArraySet17 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray6, (java.lang.Object[]) localeArray15);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2219");
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
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2220");
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
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests18.setUp();
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet26 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray25);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet32 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray31);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray25, (java.lang.Object[]) charSequenceArray31);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) charSequenceArray25);
        commonGramsTokenFilterFactoryTests18.tearDown();
        org.junit.rules.TestRule testRule36 = commonGramsTokenFilterFactoryTests18.ruleChain;
        java.lang.String str37 = commonGramsTokenFilterFactoryTests18.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsEnumEquals("tests.nightly", postingsEnum39, postingsEnum40, true);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) true);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        java.lang.String str45 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("europarl.lines.txt.gz", indexReader47, terms48, terms49, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        commonGramsTokenFilterFactoryTests52.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader54, 0, postingsEnum56, postingsEnum57);
        commonGramsTokenFilterFactoryTests52.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests52.assertPositionsSkippingEquals("tests.weekly", indexReader61, (int) '#', postingsEnum63, postingsEnum64);
        commonGramsTokenFilterFactoryTests52.setUp();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        commonGramsTokenFilterFactoryTests52.assertTermsEquals("<unknown>", indexReader68, terms69, terms70, false);
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        commonGramsTokenFilterFactoryTests52.assertPositionsSkippingEquals("", indexReader74, (int) (short) 1, postingsEnum76, postingsEnum77);
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        commonGramsTokenFilterFactoryTests52.assertDocsSkippingEquals("tests.nightly", indexReader80, (int) (short) -1, postingsEnum82, postingsEnum83, true);
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        commonGramsTokenFilterFactoryTests52.assertDocsEnumEquals("hi!", postingsEnum87, postingsEnum88, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) terms49, (java.lang.Object) true);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2221");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 2, (double) (short) 10, (double) 0);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2222");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 1);
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", (int) (short) 10, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2223");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (float) 10, (float) (-1L), (float) (-1L));
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2224");
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
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.slow", (int) '4', numericDocValues20, numericDocValues21);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2225");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum5, postingsEnum6, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.failfast");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2226");
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
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[]) wildcardClassArray6);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
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
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray33, (java.lang.Object[]) charSequenceArray61);
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) charSequenceArray19, (java.lang.Object[]) charSequenceArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray6, (java.lang.Object[]) charSequenceArray19);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2227");
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
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", (int) (short) -1, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2228");
        int[] intArray5 = new int[] { (byte) 0, (byte) -1, 'a', (short) 10, '4' };
        int[] intArray11 = new int[] { (byte) 0, (byte) -1, 'a', (short) 10, '4' };
        int[] intArray17 = new int[] { (byte) 0, (byte) -1, 'a', (short) 10, '4' };
        int[] intArray23 = new int[] { (byte) 0, (byte) -1, 'a', (short) 10, '4' };
        int[] intArray29 = new int[] { (byte) 0, (byte) -1, 'a', (short) 10, '4' };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        int[][][] intArray31 = new int[][][] { intArray30 };
        int[][][][] intArray32 = new int[][][][] { intArray31 };
        java.util.Set<int[][][]> intArraySet33 = org.apache.lucene.util.LuceneTestCase.asSet(intArray32);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet41 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray40);
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet47 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray46);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray40, (java.lang.Object[]) charSequenceArray46);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) charSequenceArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) intArray32, (java.lang.Object[]) charSequenceArray46);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2229");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 0L, (long) 'a');
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2230");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) 0.0f);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2231");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray1 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet2 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray1);
        char[][][][] charArray3 = new char[][][][] {};
        java.util.Set<char[][][]> charArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(charArray3);
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) queryCachingPolicyArray1, (java.lang.Object[]) charArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        byte[][] byteArray10 = new byte[][] { byteArray6, byteArray7, byteArray8, byteArray9 };
        java.util.Set<byte[]> byteArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray10);
        java.util.Set<byte[]> byteArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charArray3, (java.lang.Object[]) byteArray10);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2232");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charSequenceArray5);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2233");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) 100);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2234");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        byte[][] byteArray4 = new byte[][] { byteArray0, byteArray1, byteArray2, byteArray3 };
        java.util.Set<byte[]> byteArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray4);
        java.util.Set<byte[]> byteArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray4);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet14 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray13);
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
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) charSequenceArray55);
        java.lang.CharSequence[] charSequenceArray66 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet67 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray66);
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet73 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray72);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray66, (java.lang.Object[]) charSequenceArray72);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) charSequenceArray72);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) charSequenceArray72);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) charSequenceArray72);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) byteArray4, (java.lang.Object[]) charSequenceArray72);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2235");
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
        org.junit.Assert.assertNotEquals((java.lang.Object) annotatedElementSet14, (java.lang.Object) charSequenceArray27);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray46 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet47 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) charSequenceArray27, (java.lang.Object[]) queryCachingPolicyArray46);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2236");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 0.0d, 0.0d);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2237");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 1, (double) (byte) 0, (double) 0);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2238");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 4, 0L);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2239");
        double[][] doubleArray1 = new double[][] {};
        double[][] doubleArray2 = new double[][] {};
        double[][] doubleArray3 = new double[][] {};
        double[][] doubleArray4 = new double[][] {};
        double[][] doubleArray5 = new double[][] {};
        double[][][] doubleArray6 = new double[][][] { doubleArray1, doubleArray2, doubleArray3, doubleArray4, doubleArray5 };
        java.util.Set<double[][]> doubleArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray6);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        java.lang.Object obj14 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests15.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21);
        commonGramsTokenFilterFactoryTests15.tearDown();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests15.assertPositionsSkippingEquals("tests.weekly", indexReader25, (int) (byte) 1, postingsEnum27, postingsEnum28);
        org.junit.Assert.assertNotEquals(obj14, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        commonGramsTokenFilterFactoryTests15.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) charSequenceArray12, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) doubleArray6, (java.lang.Object[]) charSequenceArray12);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2240");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray3, intArray4);
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
        org.junit.Assert.assertArrayEquals("hi!", intArray14, intArray19);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray25, intArray26);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray25, intArray29);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray14, intArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray4, intArray14, (java.lang.Integer) 0);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2241");
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
        java.lang.Class<?> wildcardClass17 = commonGramsTokenFilterFactoryTests1.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2242");
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
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule24);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2243");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (-1), (long) (short) 100);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2244");
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
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        commonGramsTokenFilterFactoryTests16.assertTermsEquals("", indexReader18, terms19, terms20, false);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsEnumEquals("tests.weekly", postingsEnum24, postingsEnum25, false);
        commonGramsTokenFilterFactoryTests16.setIndexWriterMaxDocs((int) '#');
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests16);
        commonGramsTokenFilterFactoryTests16.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests16);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2245");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", 1.0d, (double) '#', (double) (short) 100);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2246");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) (-1));
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2247");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 2, (double) (-1L));
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2248");
        short[][] shortArray0 = new short[][] {};
        java.util.Set<short[]> shortArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray0);
        java.util.Set<java.lang.Cloneable> cloneableSet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) shortArray0);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray5, byteArray6);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray6, byteArray10);
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
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests15.assertFieldsEquals("enwiki.random.lines.txt", indexReader30, fields31, fields32, true);
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests15.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests15, (java.lang.Object) "<unknown>");
        commonGramsTokenFilterFactoryTests15.tearDown();
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
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        commonGramsTokenFilterFactoryTests40.assertTermsEquals("tests.failfast", indexReader68, terms69, terms70, true);
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.Fields fields75 = null;
        org.apache.lucene.index.Fields fields76 = null;
        commonGramsTokenFilterFactoryTests40.assertFieldsEquals("<unknown>", indexReader74, fields75, fields76, false);
        commonGramsTokenFilterFactoryTests40.setUp();
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests15, (java.lang.Object) commonGramsTokenFilterFactoryTests40);
        org.junit.Assert.assertNotSame((java.lang.Object) byteArray6, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) cloneableSet2, (java.lang.Object) byteArray6);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2249");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) '4');
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2250");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(1.0d, (double) 1.0f, (double) (byte) 1);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2251");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.settings.Settings.Builder builder6 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((-1));
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", 2, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2252");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (long) 10, 10L);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2253");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.maxfailures");
        java.lang.Class<?> wildcardClass2 = locale1.getClass();
        org.junit.Assert.assertNotNull((java.lang.Object) wildcardClass2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) wildcardClass2);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2254");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests17.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23);
        commonGramsTokenFilterFactoryTests17.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests27.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader30, (int) (byte) -1, postingsEnum32, postingsEnum33);
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests27.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests27);
        commonGramsTokenFilterFactoryTests27.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests39.setUp();
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet47 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray46);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet53 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray52);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray46, (java.lang.Object[]) charSequenceArray52);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests39, (java.lang.Object) charSequenceArray46);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests56 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests56.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        commonGramsTokenFilterFactoryTests56.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader59, (int) (byte) -1, postingsEnum61, postingsEnum62);
        org.junit.rules.TestRule testRule64 = commonGramsTokenFilterFactoryTests56.ruleChain;
        commonGramsTokenFilterFactoryTests56.setIndexWriterMaxDocs((int) (short) 10);
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray67 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests2, commonGramsTokenFilterFactoryTests17, commonGramsTokenFilterFactoryTests27, commonGramsTokenFilterFactoryTests39, commonGramsTokenFilterFactoryTests56 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet68 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray67);
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
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet81 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) baseTokenStreamTestCaseArray67, (java.lang.Object[]) wildcardClassArray75);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2255");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray5, byteArray8);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray15, byteArray16);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray16, byteArray20);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray25, byteArray26);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray29, byteArray30);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray26, byteArray29);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray20, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray26);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray36, byteArray37);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray26, byteArray37);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray41, byteArray42);
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
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray70, byteArray71);
        byte[] byteArray74 = new byte[] {};
        byte[] byteArray75 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray74, byteArray75);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray71, byteArray75);
        byte[] byteArray80 = new byte[] {};
        byte[] byteArray81 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray80, byteArray81);
        byte[] byteArray84 = new byte[] {};
        byte[] byteArray85 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray84, byteArray85);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray81, byteArray84);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray75, byteArray81);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray59, byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray59);
        org.junit.Assert.assertArrayEquals("", byteArray37, byteArray59);
        byte[] byteArray93 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray59, byteArray93);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2256");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), 1.0d, (double) (short) 1);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2257");
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
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray48, (double) 100L);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests60 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests60.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests60.setUp();
        java.lang.String str63 = commonGramsTokenFilterFactoryTests60.getTestName();
        org.junit.rules.TestRule testRule64 = commonGramsTokenFilterFactoryTests60.ruleChain;
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        commonGramsTokenFilterFactoryTests60.assertFieldsEquals("tests.awaitsfix", indexReader66, fields67, fields68, false);
        org.junit.rules.TestRule testRule71 = commonGramsTokenFilterFactoryTests60.ruleChain;
        commonGramsTokenFilterFactoryTests60.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) doubleArray48, (java.lang.Object) commonGramsTokenFilterFactoryTests60);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2258");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) 'a');
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2259");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) (byte) 100, (double) 1.0f);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2260");
        java.util.Collection[] collectionArray2 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray3 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray2;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.CharSequence>[]) collectionArray2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        commonGramsTokenFilterFactoryTests5.assertTermsEquals("", indexReader7, terms8, terms9, false);
        java.lang.String str12 = commonGramsTokenFilterFactoryTests5.getTestName();
        commonGramsTokenFilterFactoryTests5.setUp();
        java.lang.String str14 = commonGramsTokenFilterFactoryTests5.getTestName();
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceCollectionSet4, (java.lang.Object) commonGramsTokenFilterFactoryTests5);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests5);
        commonGramsTokenFilterFactoryTests5.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder18 = commonGramsTokenFilterFactoryTests5.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsSkippingEquals("<unknown>", indexReader20, 0, postingsEnum22, postingsEnum23, false);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests5.assertDocValuesEquals("tests.failfast", 0, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2261");
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
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.nightly", postingsEnum32, postingsEnum33, false);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray38 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling37 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray38);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling40 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray41 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling40 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray41);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests44 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests44.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests44);
        org.junit.rules.TestRule testRule47 = commonGramsTokenFilterFactoryTests44.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule47);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray41, (java.lang.Object) testRule47);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) throttlingArray38, (java.lang.Object[]) throttlingArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) "tests.nightly", (java.lang.Object) throttlingArray41);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2262");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray30);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2263");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) (short) 0);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2264");
        float[] floatArray5 = new float[] { 100, (-1L), (-1L) };
        float[] floatArray9 = new float[] { 1L, 1, (short) -1 };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray9, (float) 100L);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) floatArray5);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray15, longArray16);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray20, longArray21);
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray20, longArray23);
        long[] longArray26 = new long[] {};
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray26, longArray27);
        org.junit.Assert.assertArrayEquals(longArray23, longArray26);
        org.junit.Assert.assertArrayEquals(longArray15, longArray23);
        long[] longArray34 = new long[] {};
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray34, longArray35);
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray34, longArray37);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray40, longArray41);
        org.junit.Assert.assertArrayEquals(longArray37, longArray40);
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray47, longArray48);
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray47, longArray50);
        long[] longArray54 = new long[] {};
        long[] longArray55 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray54, longArray55);
        long[] longArray57 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray54, longArray57);
        long[] longArray60 = new long[] {};
        long[] longArray61 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray60, longArray61);
        org.junit.Assert.assertArrayEquals(longArray57, longArray60);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray47, longArray57);
        long[] longArray67 = new long[] {};
        long[] longArray68 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray67, longArray68);
        long[] longArray70 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray67, longArray70);
        long[] longArray74 = new long[] {};
        long[] longArray75 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray74, longArray75);
        long[] longArray77 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray74, longArray77);
        org.junit.Assert.assertArrayEquals(longArray67, longArray77);
        org.junit.Assert.assertArrayEquals(longArray47, longArray67);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray40, longArray47);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray15, longArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) "tests.nightly", (java.lang.Object) longArray40);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2265");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        commonGramsTokenFilterFactoryTests7.assertTermsEquals("", indexReader9, terms10, terms11, false);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests7.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests7);
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests7.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests7);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2266");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 10);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.nightly", indexReader12, fields13, fields14, true);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2267");
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
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray19);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy27 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass28 = queryCachingPolicy27.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy29 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass30 = queryCachingPolicy29.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass28;
        wildcardClassArray33[1] = wildcardClass30;
        java.util.Set<java.lang.Class<?>> wildcardClassSet38 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray33);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy39 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass40 = queryCachingPolicy39.getClass();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy41 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Class<?> wildcardClass42 = queryCachingPolicy41.getClass();
        java.lang.Class[] classArray44 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray45 = (java.lang.Class<?>[]) classArray44;
        wildcardClassArray45[0] = wildcardClass40;
        wildcardClassArray45[1] = wildcardClass42;
        java.util.Set<java.lang.Class<?>> wildcardClassSet50 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray33, (java.lang.Object[]) wildcardClassArray45);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet52 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) wildcardClassArray19, (java.lang.Object[]) wildcardClassArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) wildcardClassArray45);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2268");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 100L);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2269");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        java.lang.String str4 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        java.lang.Object obj6 = null;
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests2, obj6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.nightly", indexReader9, (int) (byte) 1, postingsEnum11, postingsEnum12);
        java.lang.String str14 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2270");
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
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader18, fields19, fields20, false);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", (int) '4', numericDocValues25, numericDocValues26);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2271");
        java.lang.Object obj0 = null;
        double[] doubleArray5 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray6 = new double[][] { doubleArray5 };
        double[] doubleArray11 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray12 = new double[][] { doubleArray11 };
        double[][][] doubleArray13 = new double[][][] { doubleArray6, doubleArray12 };
        double[] doubleArray18 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray19 = new double[][] { doubleArray18 };
        double[] doubleArray24 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray25 = new double[][] { doubleArray24 };
        double[][][] doubleArray26 = new double[][][] { doubleArray19, doubleArray25 };
        double[] doubleArray31 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray32 = new double[][] { doubleArray31 };
        double[] doubleArray37 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray38 = new double[][] { doubleArray37 };
        double[][][] doubleArray39 = new double[][][] { doubleArray32, doubleArray38 };
        double[] doubleArray44 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray45 = new double[][] { doubleArray44 };
        double[] doubleArray50 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray51 = new double[][] { doubleArray50 };
        double[][][] doubleArray52 = new double[][][] { doubleArray45, doubleArray51 };
        double[] doubleArray57 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray58 = new double[][] { doubleArray57 };
        double[] doubleArray63 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray64 = new double[][] { doubleArray63 };
        double[][][] doubleArray65 = new double[][][] { doubleArray58, doubleArray64 };
        double[][][][] doubleArray66 = new double[][][][] { doubleArray13, doubleArray26, doubleArray39, doubleArray52, doubleArray65 };
        java.util.Set<double[][][]> doubleArraySet67 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) doubleArray66);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2272");
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
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray35, intArray36);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray39, intArray40);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray35, intArray39);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray45, intArray46);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray49, intArray50);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray45, intArray49);
        org.junit.Assert.assertArrayEquals("random", intArray35, intArray45);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) intArray35);
        int[] intArray55 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray35, intArray55);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2273");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 1L, (double) (short) 1);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2274");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum7, postingsEnum8, true);
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.monster", (int) (short) 1, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2275");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str4 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.awaitsfix", indexReader6, fields7, fields8, false);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet17 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray16);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet23 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray22);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray16, (java.lang.Object[]) charSequenceArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) charSequenceArray22);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2276");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests47 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests47.setUp();
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet55 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray54);
        java.lang.CharSequence[] charSequenceArray60 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet61 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray60);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray54, (java.lang.Object[]) charSequenceArray60);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests47, (java.lang.Object) charSequenceArray54);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray54);
        long[] longArray70 = new long[] { (-1L), (-1), '4', 2, 1 };
        long[][] longArray71 = new long[][] { longArray70 };
        java.util.Set<long[]> longArraySet72 = org.apache.lucene.util.LuceneTestCase.asSet(longArray71);
        java.util.Set<long[]> longArraySet73 = org.apache.lucene.util.LuceneTestCase.asSet(longArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) charSequenceArray54, (java.lang.Object) longArraySet73);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2277");
        double[] doubleArray0 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        java.lang.String str8 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str10 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.tearDown();
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
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "<unknown>", (java.lang.Object) doubleArray33);
        double[] doubleArray46 = new double[] { ' ', (-1) };
        double[] doubleArray49 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray49, (double) 100L);
        double[] doubleArray55 = new double[] { ' ', (-1) };
        double[] doubleArray58 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray58, (double) 100L);
        double[] doubleArray63 = new double[] { ' ', (-1) };
        double[] doubleArray66 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray66, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray58, doubleArray63, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray63, (double) 1);
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray63, (double) (short) 10);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) doubleArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray63, (double) 100.0f);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2278");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (-1), 100L);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2279");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals(charArray1, charArray5);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        org.junit.Assert.assertArrayEquals(charArray16, charArray19);
        org.junit.Assert.assertArrayEquals("", charArray12, charArray16);
        org.junit.Assert.assertArrayEquals(charArray9, charArray12);
        org.junit.Assert.assertArrayEquals("", charArray1, charArray9);
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
        org.junit.Assert.assertArrayEquals(charArray9, charArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray9);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2280");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, (long) 10);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2281");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) (byte) 0, (-1.0d), (double) 'a');
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2282");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str9 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.failfast", indexReader11, fields12, fields13, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        commonGramsTokenFilterFactoryTests17.assertTermsEquals("", indexReader19, terms20, terms21, false);
        java.lang.String str24 = commonGramsTokenFilterFactoryTests17.getTestName();
        commonGramsTokenFilterFactoryTests17.setUp();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests17.assertPositionsSkippingEquals("tests.badapples", indexReader27, 0, postingsEnum29, postingsEnum30);
        java.lang.String str32 = commonGramsTokenFilterFactoryTests17.getTestName();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests17);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2283");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.badapples", indexReader9, fields10, fields11, true);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        org.junit.Assert.assertArrayEquals("", shortArray16, shortArray18);
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader9, (java.lang.Object) shortArray18);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals("", shortArray26, shortArray28);
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray26, shortArray32);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray36);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals("", shortArray36, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray36);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray18, shortArray32);
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray44 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray45 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[][] baseTokenStreamTestCaseArray46 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[][] { baseTokenStreamTestCaseArray44, baseTokenStreamTestCaseArray45 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase[]> baseTokenStreamTestCaseArraySet47 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray46);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) shortArray32, (java.lang.Object) baseTokenStreamTestCaseArray46);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray50 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet51 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray50);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests52.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests52.setUp();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) queryCachingPolicySet51, (java.lang.Object) commonGramsTokenFilterFactoryTests52);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests57 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests57.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        commonGramsTokenFilterFactoryTests57.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader60, (int) (byte) -1, postingsEnum62, postingsEnum63);
        org.junit.rules.TestRule testRule65 = commonGramsTokenFilterFactoryTests57.ruleChain;
        java.lang.CharSequence[] charSequenceArray70 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet71 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray70);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests57, (java.lang.Object) charSequenceArray70);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray73 = new org.apache.lucene.util.LuceneTestCase[] { commonGramsTokenFilterFactoryTests52, commonGramsTokenFilterFactoryTests57 };
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet74 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray73);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) baseTokenStreamTestCaseArray46, (java.lang.Object[]) luceneTestCaseArray73);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2284");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2285");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) "<unknown>");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2286");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("", indexReader9, fields10, fields11, true);
        java.lang.String str14 = commonGramsTokenFilterFactoryTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) str14);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2287");
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
        org.elasticsearch.common.settings.Settings.Builder builder14 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests3.assertDocValuesEquals("tests.monster", 1, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2288");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) 3);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2289");
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
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.weekly", indexReader22, fields23, fields24, true);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.awaitsfix", indexReader28, (int) '#', postingsEnum30, postingsEnum31, false);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests36.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests36);
        commonGramsTokenFilterFactoryTests36.setIndexWriterMaxDocs((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests36);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2290");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray5, byteArray8);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray15, byteArray16);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray16, byteArray20);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray25, byteArray26);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray29, byteArray30);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray26, byteArray29);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray20, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray26);
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray26, byteArray35);
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray41, byteArray42);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray45, byteArray46);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray42, byteArray45);
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
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray63);
        org.junit.Assert.assertNotEquals((java.lang.Object) locale38, (java.lang.Object) byteArray63);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests73 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        commonGramsTokenFilterFactoryTests73.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader75, 0, postingsEnum77, postingsEnum78);
        commonGramsTokenFilterFactoryTests73.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        commonGramsTokenFilterFactoryTests73.assertPositionsSkippingEquals("tests.weekly", indexReader82, (int) '#', postingsEnum84, postingsEnum85);
        commonGramsTokenFilterFactoryTests73.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) locale38, (java.lang.Object) commonGramsTokenFilterFactoryTests73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) "tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests73);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2291");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 'a', (long) (short) -1);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2292");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        commonGramsTokenFilterFactoryTests10.assertTermsEquals("", indexReader12, terms13, terms14, false);
        java.lang.String str17 = commonGramsTokenFilterFactoryTests10.getTestName();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("tests.slow", indexReader19, 3, postingsEnum21, postingsEnum22);
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) "tests.monster", (java.lang.Object) "tests.slow");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2293");
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
        byte[] byteArray69 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray69);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2294");
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
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", (int) (short) 1, numericDocValues23, numericDocValues24);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2295");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.awaitsfix", indexReader6, fields7, fields8, false);
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.maxfailures", 1, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2296");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) 1);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2297");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests0.ruleChain;
        java.lang.Object obj7 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) testRule6, obj7);
        java.lang.Object obj9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(obj7, obj9);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2298");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) '4');
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2299");
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
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) byteArray19);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2300");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures7);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray9 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2, testRuleIgnoreAfterMaxFailures4, testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures7 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray10 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray9 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray10);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet26 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray25);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet32 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray31);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray25, (java.lang.Object[]) charSequenceArray31);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet39 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray31, (java.lang.Object[]) charSequenceArray38);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray31);
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet49 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray48);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet62 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray61);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray55, (java.lang.Object[]) charSequenceArray61);
        java.lang.CharSequence[] charSequenceArray68 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet69 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray61, (java.lang.Object[]) charSequenceArray68);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) charSequenceArray48, (java.lang.Object[]) charSequenceArray61);
        java.lang.CharSequence[] charSequenceArray77 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet78 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray77);
        java.lang.CharSequence[] charSequenceArray83 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet84 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray83);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray77, (java.lang.Object[]) charSequenceArray83);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) charSequenceArray48, (java.lang.Object[]) charSequenceArray77);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray10, (java.lang.Object[]) charSequenceArray77);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2301");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 0, (double) (short) 10);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2302");
        java.lang.Object obj1 = null;
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray7);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray14);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals("", shortArray21, shortArray23);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray14, shortArray21);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray31);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray29);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray39);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals("", shortArray39, shortArray41);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray48);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray41, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray46);
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
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray29);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray73);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray76);
        org.junit.Assert.assertArrayEquals("", shortArray73, shortArray75);
        org.junit.Assert.assertArrayEquals("", shortArray14, shortArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", obj1, (java.lang.Object) "");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2303");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 10.0f, (double) 4, (double) 3);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2304");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        java.lang.String str2 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder3 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum7, postingsEnum8);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2305");
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
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) wildcardClassArray8);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2306");
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
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2307");
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
        char[] charArray61 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray58, charArray61);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2308");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 4, (float) 100, (float) '4');
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2309");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum10, postingsEnum11, true);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.weekly", 0, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2310");
        java.lang.String[] strArray6 = new java.lang.String[] { "random", "tests.maxfailures", "tests.failfast", "tests.slow", "tests.monster" };
        java.lang.String[] strArray12 = new java.lang.String[] { "random", "tests.maxfailures", "tests.failfast", "tests.slow", "tests.monster" };
        java.lang.String[] strArray18 = new java.lang.String[] { "random", "tests.maxfailures", "tests.failfast", "tests.slow", "tests.monster" };
        java.lang.String[][] strArray19 = new java.lang.String[][] { strArray6, strArray12, strArray18 };
        java.util.Set<java.lang.String[]> strArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet27 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray26);
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
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray40, (java.lang.Object[]) charSequenceArray68);
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) charSequenceArray26, (java.lang.Object[]) charSequenceArray68);
        java.lang.CharSequence[] charSequenceArray79 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet80 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray79);
        java.lang.CharSequence[] charSequenceArray85 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet86 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray85);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray79, (java.lang.Object[]) charSequenceArray85);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) charSequenceArray85);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray26, (java.lang.Object[]) charSequenceArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray19, (java.lang.Object[]) charSequenceArray85);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2311");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2312");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 3, (double) '#', (double) 100.0f);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2313");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) 100, (double) 0);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2314");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader6, 10, postingsEnum8, postingsEnum9, false);
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests14.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests14.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests14, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests14, (java.lang.Object) locale21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = commonGramsTokenFilterFactoryTests14.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests24.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests24.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests24, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests24.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests24.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        commonGramsTokenFilterFactoryTests24.assertTermsEquals("", indexReader32, terms33, terms34, false);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests24.assertDocsSkippingEquals("random", indexReader38, 1, postingsEnum40, postingsEnum41, false);
        org.elasticsearch.common.settings.Settings.Builder builder44 = commonGramsTokenFilterFactoryTests24.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder45 = commonGramsTokenFilterFactoryTests24.newAnalysisSettingsBuilder();
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray46 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet47 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray46);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests48 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests48.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests48.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader51, (int) (byte) -1, postingsEnum53, postingsEnum54);
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests48.assertDocsEnumEquals("tests.awaitsfix", postingsEnum57, postingsEnum58, false);
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.Terms terms63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        commonGramsTokenFilterFactoryTests48.assertTermsEquals("<unknown>", indexReader62, terms63, terms64, true);
        commonGramsTokenFilterFactoryTests48.setIndexWriterMaxDocs((int) 'a');
        commonGramsTokenFilterFactoryTests48.setIndexWriterMaxDocs((int) (byte) 1);
        org.elasticsearch.common.settings.Settings.Builder builder71 = commonGramsTokenFilterFactoryTests48.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicySet47, (java.lang.Object) builder71);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests74 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        commonGramsTokenFilterFactoryTests74.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader76, 0, postingsEnum78, postingsEnum79);
        commonGramsTokenFilterFactoryTests74.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        commonGramsTokenFilterFactoryTests74.assertPositionsSkippingEquals("tests.weekly", indexReader83, (int) '#', postingsEnum85, postingsEnum86);
        org.elasticsearch.common.settings.Settings.Builder builder88 = commonGramsTokenFilterFactoryTests74.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.nightly", (java.lang.Object) builder88);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray90 = new org.elasticsearch.common.settings.Settings.Builder[] { builder12, builder23, builder45, builder71, builder88 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder> builderSet91 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray90);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) builderSet91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) builderSet91);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2315");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 3, (-1.0d));
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2316");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests27.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests27);
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests27.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray2, (java.lang.Object) testRule30);
        org.junit.Assert.assertNotNull((java.lang.Object) testRule30);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule30;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule30;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) testRule30);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2317");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (-1.0d), (double) 10);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2318");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests5.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests5);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests5.ruleChain;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) testRule8);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray2, (java.lang.Object) testRule8);
        java.lang.Object[] objArray11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) throttlingArray2, objArray11);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2319");
        short[] shortArray6 = new short[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (short) 1 };
        short[] shortArray12 = new short[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (short) 1 };
        short[] shortArray18 = new short[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (short) 1 };
        short[] shortArray24 = new short[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (short) 1 };
        short[][] shortArray25 = new short[][] { shortArray6, shortArray12, shortArray18, shortArray24 };
        java.util.Set<short[]> shortArraySet26 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray25);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests27.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests27.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests27.tearDown();
        commonGramsTokenFilterFactoryTests27.setIndexWriterMaxDocs((int) (byte) 1);
        commonGramsTokenFilterFactoryTests27.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.common.settings.Settings.Builder builder35 = commonGramsTokenFilterFactoryTests27.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) shortArraySet26, (java.lang.Object) builder35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) builder35);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2320");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0L, (long) (short) 0);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2321");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray2 = null;
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
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray31, intArray32);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray22, intArray31);
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
        org.junit.Assert.assertArrayEquals(intArray22, intArray38);
        org.junit.Assert.assertArrayEquals(intArray6, intArray38);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray62, intArray63);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray66, intArray67);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray62, intArray66);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray71, intArray72);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray62, intArray71);
        org.junit.Assert.assertArrayEquals(intArray38, intArray62);
        int[] intArray76 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray62, intArray76);
        int[] intArray80 = new int[] {};
        int[] intArray81 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray80, intArray81);
        int[] intArray84 = new int[] {};
        int[] intArray85 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray84, intArray85);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray80, intArray84);
        org.junit.Assert.assertArrayEquals(intArray62, intArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray2, intArray62);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2322");
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
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.failfast", indexReader33, (int) (byte) 0, postingsEnum35, postingsEnum36);
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.badapples", indexReader40, 10, postingsEnum42, postingsEnum43, true);
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
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests47, (java.lang.Object) "<unknown>");
        org.junit.rules.TestRule testRule71 = commonGramsTokenFilterFactoryTests47.ruleChain;
        commonGramsTokenFilterFactoryTests47.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexReader40, (java.lang.Object) commonGramsTokenFilterFactoryTests47);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2323");
        byte[] byteArray1 = null;
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray6, byteArray7);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray7, byteArray10);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray17, byteArray18);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray21, byteArray22);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray18, byteArray22);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray27, byteArray28);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray28, byteArray31);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray22, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray28);
        org.junit.Assert.assertNotEquals((java.lang.Object) locale3, (java.lang.Object) byteArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray1, byteArray28);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2324");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 0L, (long) 2);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2325");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (-1L), (double) (short) 10, 1.0d);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2326");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicy1, (java.lang.Object) 1.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests4.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader7, (int) (byte) -1, postingsEnum9, postingsEnum10);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("tests.awaitsfix", postingsEnum13, postingsEnum14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        commonGramsTokenFilterFactoryTests4.assertTermsEquals("<unknown>", indexReader18, terms19, terms20, true);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests4.assertDocsEnumEquals("random", postingsEnum24, postingsEnum25, true);
        java.lang.String str28 = commonGramsTokenFilterFactoryTests4.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) 1.0f, (java.lang.Object) str28);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2327");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (-1L));
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2328");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2329");
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
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests2.ruleChain;
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray19, longArray20);
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray19, longArray22);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray25, longArray26);
        org.junit.Assert.assertArrayEquals(longArray22, longArray25);
        long[] longArray32 = new long[] {};
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray32, longArray33);
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray32, longArray35);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray39, longArray40);
        long[] longArray42 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray39, longArray42);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray45, longArray46);
        org.junit.Assert.assertArrayEquals(longArray42, longArray45);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray32, longArray42);
        long[] longArray52 = new long[] {};
        long[] longArray53 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray52, longArray53);
        long[] longArray55 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray52, longArray55);
        long[] longArray59 = new long[] {};
        long[] longArray60 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray59, longArray60);
        long[] longArray62 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray59, longArray62);
        org.junit.Assert.assertArrayEquals(longArray52, longArray62);
        org.junit.Assert.assertArrayEquals(longArray32, longArray52);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray25, longArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) testRule15, (java.lang.Object) longArray25);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2330");
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
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2331");
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
        org.junit.rules.TestRule testRule43 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum45, postingsEnum46);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2332");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader7, 0, postingsEnum9, postingsEnum10);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2333");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10L, (double) 1.0f, (double) (short) 10);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2334");
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
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) 'a');
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet62 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray61);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray55, (java.lang.Object[]) charSequenceArray61);
        java.lang.CharSequence[] charSequenceArray68 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet69 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray61, (java.lang.Object[]) charSequenceArray68);
        java.util.Set<java.lang.Object> objSet71 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charSequenceArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) charSequenceArray68);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2335");
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
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2336");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (short) 1, (long) (short) -1);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2337");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (short) 0, (long) '#');
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2338");
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
        commonGramsTokenFilterFactoryTests58.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests58.overrideTestDefaultQueryCache();
        java.lang.String str62 = commonGramsTokenFilterFactoryTests58.getTestName();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        commonGramsTokenFilterFactoryTests58.assertTermsEquals("", indexReader64, terms65, terms66, true);
        commonGramsTokenFilterFactoryTests58.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        commonGramsTokenFilterFactoryTests58.assertPositionsSkippingEquals("tests.weekly", indexReader71, 1, postingsEnum73, postingsEnum74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) terms54, (java.lang.Object) postingsEnum73);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2339");
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
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("<unknown>", indexReader16, (int) (byte) -1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests21.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests21.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader24, (int) (byte) -1, postingsEnum26, postingsEnum27);
        commonGramsTokenFilterFactoryTests21.tearDown();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests21.assertPositionsSkippingEquals("tests.weekly", indexReader31, (int) (byte) 1, postingsEnum33, postingsEnum34);
        java.lang.String str36 = commonGramsTokenFilterFactoryTests21.getTestName();
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests21.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) postingsEnum18, (java.lang.Object) testRule37);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2340");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) -1, (-1.0d), (double) (byte) -1);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2341");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), 100.0d, (double) 1.0f);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2342");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray2);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray12);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals("", shortArray19, shortArray21);
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray19, shortArray25);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals("", shortArray29, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray25);
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
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray42);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray56);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray59);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray59);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests68 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests68.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        commonGramsTokenFilterFactoryTests68.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader71, (int) (byte) -1, postingsEnum73, postingsEnum74);
        commonGramsTokenFilterFactoryTests68.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.Terms terms80 = null;
        org.apache.lucene.index.Terms terms81 = null;
        commonGramsTokenFilterFactoryTests68.assertTermsEquals("enwiki.random.lines.txt", indexReader79, terms80, terms81, false);
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.Terms terms86 = null;
        org.apache.lucene.index.Terms terms87 = null;
        commonGramsTokenFilterFactoryTests68.assertTermsEquals("tests.monster", indexReader85, terms86, terms87, true);
        org.apache.lucene.index.IndexReader indexReader91 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum93 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum94 = null;
        commonGramsTokenFilterFactoryTests68.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader91, 4, postingsEnum93, postingsEnum94);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) shortArray59, (java.lang.Object) postingsEnum94);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2343");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) '#');
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2344");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        commonGramsTokenFilterFactoryTests42.assertTermsEquals("", indexReader44, terms45, terms46, false);
        java.lang.String str49 = commonGramsTokenFilterFactoryTests42.getTestName();
        commonGramsTokenFilterFactoryTests42.setUp();
        java.lang.String str51 = commonGramsTokenFilterFactoryTests42.getTestName();
        commonGramsTokenFilterFactoryTests42.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests37, (java.lang.Object) commonGramsTokenFilterFactoryTests42);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2345");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", (double) 1L, (double) (byte) 1, (double) 0L);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2346");
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
        java.lang.Object[] objArray53 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray18, objArray53);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2347");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2348");
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
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum78, postingsEnum79);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2349");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) 10.0f, (double) (byte) 10);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2350");
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
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "<unknown>", (java.lang.Object) doubleArray53);
        double[] doubleArray66 = new double[] { ' ', (-1) };
        double[] doubleArray69 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray69, (double) 100L);
        double[] doubleArray75 = new double[] { ' ', (-1) };
        double[] doubleArray78 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray75, doubleArray78, (double) 100L);
        double[] doubleArray83 = new double[] { ' ', (-1) };
        double[] doubleArray86 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray83, doubleArray86, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray78, doubleArray83, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray83, (double) 1);
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray83, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray22, doubleArray53, (double) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray1, doubleArray53, (double) (-1.0f));
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2351");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (byte) 1, (long) '#');
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2352");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 3, (double) (byte) 0);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2353");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests3.setUp();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("tests.badapples", indexReader10, fields11, fields12, true);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals("", shortArray17, shortArray19);
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader10, (java.lang.Object) shortArray19);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray27);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals("", shortArray27, shortArray29);
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray27, shortArray33);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals("", shortArray37, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray37);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray19, shortArray33);
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray45 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray46 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[][] baseTokenStreamTestCaseArray47 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[][] { baseTokenStreamTestCaseArray45, baseTokenStreamTestCaseArray46 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase[]> baseTokenStreamTestCaseArraySet48 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray47);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) shortArray33, (java.lang.Object) baseTokenStreamTestCaseArray47);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase[]> baseTokenStreamTestCaseArraySet50 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) baseTokenStreamTestCaseArraySet50);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2354");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
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
        commonGramsTokenFilterFactoryTests10.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests10.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests10.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray3, (java.lang.Object) testRule25);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray28);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray30);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray3, shortArray28);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests35.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests35.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader38, (int) (byte) -1, postingsEnum40, postingsEnum41);
        org.junit.rules.TestRule testRule43 = commonGramsTokenFilterFactoryTests35.ruleChain;
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        commonGramsTokenFilterFactoryTests35.assertFieldsEquals("enwiki.random.lines.txt", indexReader45, fields46, fields47, true);
        java.lang.String str50 = commonGramsTokenFilterFactoryTests35.getTestName();
        org.junit.rules.TestRule testRule51 = commonGramsTokenFilterFactoryTests35.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) "tests.monster", (java.lang.Object) testRule51);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2355");
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
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray60);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2356");
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
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals(charArray18, charArray21);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
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
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray27, charArray43);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray62, charArray63);
        char[] charArray65 = new char[] {};
        char[] charArray66 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray65, charArray66);
        char[] charArray68 = new char[] {};
        char[] charArray69 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray68, charArray69);
        org.junit.Assert.assertArrayEquals(charArray66, charArray69);
        org.junit.Assert.assertArrayEquals("", charArray62, charArray66);
        char[] charArray74 = new char[] {};
        char[] charArray75 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray74, charArray75);
        char[] charArray77 = new char[] {};
        char[] charArray78 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray77, charArray78);
        char[] charArray80 = new char[] {};
        char[] charArray81 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray80, charArray81);
        org.junit.Assert.assertArrayEquals(charArray78, charArray81);
        org.junit.Assert.assertArrayEquals("", charArray74, charArray78);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray66, charArray74);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray58, charArray74);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray43, charArray58);
        org.junit.Assert.assertArrayEquals(charArray21, charArray43);
        org.junit.Assert.assertArrayEquals(charArray2, charArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray21);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2357");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (short) 1, (long) 4);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2358");
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
        org.apache.lucene.util.LuceneTestCase.classRules = testRule24;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule24;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule24;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests30.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests30.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader33, (int) (byte) -1, postingsEnum35, postingsEnum36);
        commonGramsTokenFilterFactoryTests30.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests30.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader41, (int) 'a', postingsEnum43, postingsEnum44, false);
        java.lang.String str47 = commonGramsTokenFilterFactoryTests30.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) testRule24, (java.lang.Object) str47);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2359");
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
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2360");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) 1.0f);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2361");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0L, (double) '#', (double) '#');
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2362");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2363");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 1L, 100L);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2364");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray1, longArray2);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray6, longArray7);
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray6, longArray9);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray12, longArray13);
        org.junit.Assert.assertArrayEquals(longArray9, longArray12);
        org.junit.Assert.assertArrayEquals(longArray1, longArray9);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray20, longArray21);
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray20, longArray23);
        long[] longArray26 = new long[] {};
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray26, longArray27);
        org.junit.Assert.assertArrayEquals(longArray23, longArray26);
        long[] longArray33 = new long[] {};
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray33, longArray34);
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray33, longArray36);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray40, longArray41);
        long[] longArray43 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray40, longArray43);
        long[] longArray46 = new long[] {};
        long[] longArray47 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray46, longArray47);
        org.junit.Assert.assertArrayEquals(longArray43, longArray46);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray33, longArray43);
        long[] longArray53 = new long[] {};
        long[] longArray54 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray53, longArray54);
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray53, longArray56);
        long[] longArray60 = new long[] {};
        long[] longArray61 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray60, longArray61);
        long[] longArray63 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray60, longArray63);
        org.junit.Assert.assertArrayEquals(longArray53, longArray63);
        org.junit.Assert.assertArrayEquals(longArray33, longArray53);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray26, longArray33);
        org.junit.Assert.assertArrayEquals(longArray1, longArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) longArray1);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2365");
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
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray70);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray70, shortArray72);
        org.junit.Assert.assertArrayEquals("hi!", shortArray57, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray57);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests78 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests78.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests78);
        org.junit.rules.TestRule testRule81 = commonGramsTokenFilterFactoryTests78.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        commonGramsTokenFilterFactoryTests78.assertDocsEnumEquals("tests.failfast", postingsEnum83, postingsEnum84, true);
        java.lang.String str87 = commonGramsTokenFilterFactoryTests78.getTestName();
        org.junit.rules.TestRule testRule88 = commonGramsTokenFilterFactoryTests78.ruleChain;
        commonGramsTokenFilterFactoryTests78.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum91 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum92 = null;
        commonGramsTokenFilterFactoryTests78.assertDocsEnumEquals("tests.slow", postingsEnum91, postingsEnum92, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray1, (java.lang.Object) postingsEnum91);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2366");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.monster", postingsEnum9, postingsEnum10, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum10);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2367");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) 0);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2368");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) 10.0f, (double) 10, 1.0d);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2369");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) 100.0f);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2370");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 10);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.nightly", indexReader12, fields13, fields14, true);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray21);
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
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray47);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        org.junit.Assert.assertArrayEquals("", shortArray47, shortArray49);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray40, shortArray47);
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
        short[] shortArray76 = new short[] {};
        short[] shortArray77 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray76, shortArray77);
        short[] shortArray79 = new short[] {};
        short[] shortArray80 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray79, shortArray80);
        org.junit.Assert.assertArrayEquals("", shortArray77, shortArray79);
        short[] shortArray83 = new short[] {};
        short[] shortArray84 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray83, shortArray84);
        short[] shortArray86 = new short[] {};
        short[] shortArray87 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray86, shortArray87);
        org.junit.Assert.assertArrayEquals(shortArray84, shortArray86);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray79, shortArray84);
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray84);
        org.junit.Assert.assertArrayEquals("", shortArray40, shortArray84);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) fields13, (java.lang.Object) shortArray18);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2371");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray5, byteArray8);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray15, byteArray16);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray16, byteArray20);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray25, byteArray26);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray29, byteArray30);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray26, byteArray29);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray20, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray26);
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray26, byteArray35);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray40, byteArray41);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray44, byteArray45);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray41, byteArray45);
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
        byte[] byteArray82 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray73, byteArray82);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray41, byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray73);
        byte[] byteArray87 = new byte[] {};
        byte[] byteArray88 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray87, byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray88);
        byte[] byteArray91 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray88, byteArray91);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2372");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, 0.0d, (double) (-1.0f));
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2373");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 100, (long) 1);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2374");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 0L, (long) 'a');
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2375");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 4, (double) (byte) 0, (double) 2);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2376");
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
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray15);
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
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray59);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray61);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray54, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray54);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray68);
        short[] shortArray70 = new short[] {};
        short[] shortArray71 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray70, shortArray71);
        short[] shortArray73 = new short[] {};
        short[] shortArray74 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray74);
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray71);
        org.junit.Assert.assertArrayEquals("hi!", shortArray15, shortArray54);
        short[] shortArray80 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray54, shortArray80);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2377");
        double[][][][][][] doubleArray1 = new double[][][][][][] {};
        java.util.Set<double[][][][][]> doubleArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray1);
        java.lang.Object obj4 = null;
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests35.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests35.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests39.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests39.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader42, (int) (byte) -1, postingsEnum44, postingsEnum45);
        org.junit.rules.TestRule testRule47 = commonGramsTokenFilterFactoryTests39.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests39);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests35, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests35.setUp();
        commonGramsTokenFilterFactoryTests35.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests35.assertDocsSkippingEquals("", indexReader53, 10, postingsEnum55, postingsEnum56, false);
        commonGramsTokenFilterFactoryTests35.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests35);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests62 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests62.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests62.setUp();
        java.lang.String str65 = commonGramsTokenFilterFactoryTests62.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) "random", (java.lang.Object) commonGramsTokenFilterFactoryTests62);
        commonGramsTokenFilterFactoryTests62.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray68 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] { commonGramsTokenFilterFactoryTests5, commonGramsTokenFilterFactoryTests35, commonGramsTokenFilterFactoryTests62 };
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests> commonGramsTokenFilterFactoryTestsSet69 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray68);
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet70 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.analysis.BaseTokenStreamTestCase[]) commonGramsTokenFilterFactoryTestsArray68);
        org.junit.Assert.assertNotEquals("tests.maxfailures", obj4, (java.lang.Object) commonGramsTokenFilterFactoryTestsArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) doubleArray1, (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray68);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2378");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) (short) 100, (double) 10);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2379");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (double) (-1), (double) (-1.0f), (double) (short) 100);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2380");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader3, (int) (byte) -1, postingsEnum5, postingsEnum6);
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule8;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule8;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule8;
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray18);
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet25 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray24);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) charSequenceArray24);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet33 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray32);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet39 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray38);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray32, (java.lang.Object[]) charSequenceArray38);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray24, (java.lang.Object[]) charSequenceArray38);
        org.junit.Assert.assertNotEquals((java.lang.Object) testRule8, (java.lang.Object) charSequenceArray24);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet50 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray49);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray55);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray49, (java.lang.Object[]) charSequenceArray55);
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet64 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray63);
        java.lang.CharSequence[] charSequenceArray69 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet70 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray69);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray63, (java.lang.Object[]) charSequenceArray69);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray55, (java.lang.Object[]) charSequenceArray69);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray24, (java.lang.Object[]) charSequenceArray55);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests74 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.Terms terms77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        commonGramsTokenFilterFactoryTests74.assertTermsEquals("", indexReader76, terms77, terms78, false);
        java.lang.String str81 = commonGramsTokenFilterFactoryTests74.getTestName();
        commonGramsTokenFilterFactoryTests74.setUp();
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        commonGramsTokenFilterFactoryTests74.assertPositionsSkippingEquals("tests.badapples", indexReader84, 0, postingsEnum86, postingsEnum87);
        commonGramsTokenFilterFactoryTests74.setUp();
        commonGramsTokenFilterFactoryTests74.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charSequenceArray24, (java.lang.Object) commonGramsTokenFilterFactoryTests74);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2381");
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
        commonGramsTokenFilterFactoryTests39.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests39.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests42.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests42.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader45, (int) (byte) -1, postingsEnum47, postingsEnum48);
        commonGramsTokenFilterFactoryTests42.tearDown();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        commonGramsTokenFilterFactoryTests42.assertPositionsSkippingEquals("tests.weekly", indexReader52, (int) (byte) 1, postingsEnum54, postingsEnum55);
        java.lang.String str57 = commonGramsTokenFilterFactoryTests42.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder58 = commonGramsTokenFilterFactoryTests42.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests39, (java.lang.Object) commonGramsTokenFilterFactoryTests42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) shortArray10, (java.lang.Object) commonGramsTokenFilterFactoryTests42);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2382");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.util.Locale[] localeArray7 = new java.util.Locale[] { locale2, locale4, locale6 };
        java.util.Set<java.util.Locale> localeSet8 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray7);
        java.util.Set<java.lang.Cloneable> cloneableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray7);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray14);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray21);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray27);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray14, shortArray27);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) localeArray7, (java.lang.Object) shortArray27);
        short[] shortArray35 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[] shortArray40 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[] shortArray45 = new short[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        short[][] shortArray46 = new short[][] { shortArray35, shortArray40, shortArray45 };
        java.util.Set<short[]> shortArraySet47 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray46);
        java.util.Set<java.io.Serializable> serializableSet48 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) shortArray46);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray7, (java.lang.Object[]) shortArray46);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2383");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        java.lang.String str2 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder3 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.slow", (-1), numericDocValues8, numericDocValues9);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2384");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray20);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2385");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0, 0.0d, 0.0d);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2386");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests19.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests19);
        commonGramsTokenFilterFactoryTests19.tearDown();
        commonGramsTokenFilterFactoryTests19.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests19.setIndexWriterMaxDocs((int) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2387");
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
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray56 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet57 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray56);
        char[][][][] charArray58 = new char[][][][] {};
        java.util.Set<char[][][]> charArraySet59 = org.apache.lucene.util.LuceneTestCase.asSet(charArray58);
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) queryCachingPolicyArray56, (java.lang.Object[]) charArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) throttlingArray3, (java.lang.Object[]) queryCachingPolicyArray56);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2388");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) 1.0f, (double) 1L, (double) 3);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2389");
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
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests2.ruleChain;
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray27);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals("", shortArray27, shortArray29);
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray27, shortArray33);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray36);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray42);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        org.junit.Assert.assertArrayEquals("", shortArray42, shortArray44);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray49);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray51);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray44, shortArray49);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray36, shortArray44);
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
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.monster", (java.lang.Object) shortArray67);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests75 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder76 = commonGramsTokenFilterFactoryTests75.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests75.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests75, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests75.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests75.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.Terms terms84 = null;
        org.apache.lucene.index.Terms terms85 = null;
        commonGramsTokenFilterFactoryTests75.assertTermsEquals("", indexReader83, terms84, terms85, false);
        org.apache.lucene.index.IndexReader indexReader89 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum91 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum92 = null;
        commonGramsTokenFilterFactoryTests75.assertDocsSkippingEquals("random", indexReader89, 1, postingsEnum91, postingsEnum92, false);
        java.lang.String str95 = commonGramsTokenFilterFactoryTests75.getTestName();
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) "tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2390");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) locale8);
        java.lang.String str10 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("<unknown>", 0, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2391");
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
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.maxfailures", indexReader15, fields16, fields17, true);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.badapples", (int) (byte) 100, numericDocValues23, numericDocValues24);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2392");
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
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str20 = commonGramsTokenFilterFactoryTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2393");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) '#');
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2394");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, 100L);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2395");
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
        org.apache.lucene.util.LuceneTestCase.classRules = testRule18;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) testRule18);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2396");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) (short) 1);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2397");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (double) 1.0f, 0.0d, (double) (short) 1);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2398");
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
        org.elasticsearch.common.settings.Settings.Builder builder23 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests10.assertDocValuesEquals("hi!", (int) '4', numericDocValues26, numericDocValues27);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2399");
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
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("hi!", indexReader19, fields20, fields21, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) fields20);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2400");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (short) 1, (long) '#');
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2401");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum5, postingsEnum6);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2402");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet13 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray12);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray19);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests22.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests22.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader25, (int) (byte) -1, postingsEnum27, postingsEnum28);
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests22.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule30;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule30;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule30;
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
        org.junit.Assert.assertNotEquals((java.lang.Object) testRule30, (java.lang.Object) charSequenceArray46);
        org.junit.Assert.assertNotEquals((java.lang.Object) charSequenceArray46, (java.lang.Object) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray12, (java.lang.Object[]) charSequenceArray46);
        short[][] shortArray68 = new short[][] {};
        java.util.Set<short[]> shortArraySet69 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray68);
        java.util.Set<java.lang.Cloneable> cloneableSet70 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) shortArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray46, (java.lang.Object[]) shortArray68);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2403");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((-1L), (-1L));
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2404");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (short) -1, (double) (short) -1);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2405");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (-1), (long) (short) 1);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2406");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader2, 0, postingsEnum4, postingsEnum5);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder8 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
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
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray44, byteArray45);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray34, byteArray45);
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
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray51);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) byteArray45);
        byte[] byteArray83 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray83);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2407");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder3 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) locale9);
        java.lang.String str11 = commonGramsTokenFilterFactoryTests2.getTestName();
        commonGramsTokenFilterFactoryTests2.tearDown();
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
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests13.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests13);
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
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        commonGramsTokenFilterFactoryTests38.assertDocsEnumEquals("<unknown>", postingsEnum62, postingsEnum63, true);
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        commonGramsTokenFilterFactoryTests38.assertPositionsSkippingEquals("", indexReader67, 0, postingsEnum69, postingsEnum70);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests72 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests72.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests72.setUp();
        commonGramsTokenFilterFactoryTests72.tearDown();
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests38, (java.lang.Object) commonGramsTokenFilterFactoryTests72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) commonGramsTokenFilterFactoryTests72);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2408");
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
        commonGramsTokenFilterFactoryTests18.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder47 = commonGramsTokenFilterFactoryTests18.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests18.tearDown();
        org.junit.rules.TestRule testRule49 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.junit.rules.TestRule testRule50 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule50;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray15, (java.lang.Object) testRule50);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2409");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str9 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.failfast", indexReader11, fields12, fields13, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader18, (int) (short) 1, postingsEnum20, postingsEnum21, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests24.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests24.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests27.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader30, (int) (byte) -1, postingsEnum32, postingsEnum33);
        commonGramsTokenFilterFactoryTests27.tearDown();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("tests.weekly", indexReader37, (int) (byte) 1, postingsEnum39, postingsEnum40);
        java.lang.String str42 = commonGramsTokenFilterFactoryTests27.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder43 = commonGramsTokenFilterFactoryTests27.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests24, (java.lang.Object) commonGramsTokenFilterFactoryTests27);
        commonGramsTokenFilterFactoryTests24.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) postingsEnum21, (java.lang.Object) commonGramsTokenFilterFactoryTests24);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2410");
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
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader16, fields17, fields18, true);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.weekly", indexReader22, fields23, fields24, true);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.awaitsfix", indexReader28, (int) '#', postingsEnum30, postingsEnum31, false);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests1.ruleChain;
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
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
        org.junit.Assert.assertArrayEquals(charArray37, charArray40);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        org.junit.Assert.assertArrayEquals(charArray58, charArray61);
        org.junit.Assert.assertArrayEquals("", charArray54, charArray58);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        org.junit.Assert.assertArrayEquals(charArray70, charArray73);
        org.junit.Assert.assertArrayEquals("", charArray66, charArray70);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray58, charArray66);
        org.junit.Assert.assertArrayEquals(charArray40, charArray58);
        org.junit.Assert.assertNotSame((java.lang.Object) testRule35, (java.lang.Object) charArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) testRule35);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2411");
        java.lang.Object[] objArray0 = null;
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests17.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader20, (int) (byte) -1, postingsEnum22, postingsEnum23);
        commonGramsTokenFilterFactoryTests17.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests27.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader30, (int) (byte) -1, postingsEnum32, postingsEnum33);
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests27.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests27);
        commonGramsTokenFilterFactoryTests27.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests39.setUp();
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet47 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray46);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet53 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray52);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray46, (java.lang.Object[]) charSequenceArray52);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests39, (java.lang.Object) charSequenceArray46);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests56 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests56.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        commonGramsTokenFilterFactoryTests56.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader59, (int) (byte) -1, postingsEnum61, postingsEnum62);
        org.junit.rules.TestRule testRule64 = commonGramsTokenFilterFactoryTests56.ruleChain;
        commonGramsTokenFilterFactoryTests56.setIndexWriterMaxDocs((int) (short) 10);
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray67 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] { commonGramsTokenFilterFactoryTests2, commonGramsTokenFilterFactoryTests17, commonGramsTokenFilterFactoryTests27, commonGramsTokenFilterFactoryTests39, commonGramsTokenFilterFactoryTests56 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase> baseTokenStreamTestCaseSet68 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) baseTokenStreamTestCaseArray67);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2412");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) 100.0f);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2413");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, strArray2);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2414");
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
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("random", (-1), numericDocValues25, numericDocValues26);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2415");
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
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2416");
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
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray73 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet74 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) queryCachingPolicyArray73);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2417");
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
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("<unknown>", 0, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2418");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("", indexReader2, terms3, terms4, false);
        java.lang.String str7 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str9 = commonGramsTokenFilterFactoryTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) 3);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2419");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) (short) 1);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2420");
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
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("random", indexReader23, (int) (short) 0, postingsEnum25, postingsEnum26, false);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray31, byteArray32);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray37, byteArray38);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray41, byteArray42);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray38, byteArray42);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray47, byteArray48);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray51, byteArray52);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray48, byteArray51);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray42, byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) byteArray48);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2421");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) ' ', 100L);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2422");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray3, intArray7);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray12, intArray13);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray3, intArray12);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray19, intArray20);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray23, intArray24);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray19, intArray23);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray29, intArray30);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray33, intArray34);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray29, intArray33);
        org.junit.Assert.assertArrayEquals("random", intArray19, intArray29);
        org.junit.Assert.assertArrayEquals(intArray3, intArray19);
        java.lang.Object obj39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) intArray3, obj39);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2423");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.weekly", postingsEnum9, postingsEnum10, false);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.nightly", indexReader16, (int) (short) 100, postingsEnum18, postingsEnum19);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2424");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (short) 0, (long) (byte) 1);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2425");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0, (double) (byte) 0, (double) '#');
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2426");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) -1, 10.0f, (float) 10);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2427");
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
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) '#');
        org.elasticsearch.common.settings.Settings.Builder builder32 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests34 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests34.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests34.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader37, (int) (byte) -1, postingsEnum39, postingsEnum40);
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests34.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests34);
        commonGramsTokenFilterFactoryTests34.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests34.ruleChain;
        commonGramsTokenFilterFactoryTests34.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) builder32, (java.lang.Object) commonGramsTokenFilterFactoryTests34);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2428");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (byte) 1, (long) 'a');
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2429");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("random", obj1);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2430");
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
        java.lang.Object obj13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) wildcardClassArray6, obj13);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2431");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0f, (float) 3, (float) 1L);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2432");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str9 = commonGramsTokenFilterFactoryTests3.getTestName();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        commonGramsTokenFilterFactoryTests3.assertTermsEquals("tests.awaitsfix", indexReader11, terms12, terms13, true);
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests17 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests17.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests17);
        commonGramsTokenFilterFactoryTests17.tearDown();
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests17.restoreIndexWriterMaxDocs();
        java.lang.String str23 = commonGramsTokenFilterFactoryTests17.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests17.assertDocsEnumEquals("random", postingsEnum25, postingsEnum26, false);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) postingsEnum25);
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
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        org.junit.Assert.assertArrayEquals(charArray44, charArray47);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray36, charArray44);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) "tests.slow");
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum53, postingsEnum54, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests57 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder58 = commonGramsTokenFilterFactoryTests57.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests57.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests57, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests57.setIndexWriterMaxDocs(0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) commonGramsTokenFilterFactoryTests57);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2433");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (byte) 100, 1L);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2434");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, 1.0d);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2435");
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
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray8, floatArray34, (float) '#');
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2436");
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
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("<unknown>", indexReader15, fields16, fields17, true);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2437");
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
        char[] charArray71 = new char[] {};
        char[] charArray72 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray71, charArray72);
        char[] charArray74 = new char[] {};
        char[] charArray75 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray74, charArray75);
        char[] charArray77 = new char[] {};
        char[] charArray78 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray77, charArray78);
        org.junit.Assert.assertArrayEquals(charArray75, charArray78);
        org.junit.Assert.assertArrayEquals("", charArray71, charArray75);
        org.junit.Assert.assertArrayEquals(charArray14, charArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray14);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2438");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) (byte) -1);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2439");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader5, 10, postingsEnum7, postingsEnum8, false);
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests12.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests12.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests12.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests12.setUp();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests12.ruleChain;
        commonGramsTokenFilterFactoryTests12.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests12.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader21, (int) (byte) 10, postingsEnum23, postingsEnum24);
        commonGramsTokenFilterFactoryTests12.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests12);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2440");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast" };
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast" };
        java.lang.CharSequence[][] charSequenceArray7 = new java.lang.CharSequence[][] { charSequenceArray3, charSequenceArray6 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet21 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray20);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray20);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray14, (java.lang.Object[]) charSequenceArray49);
        org.junit.Assert.assertNotNull((java.lang.Object) charSequenceArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) charSequenceArray14);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2441");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) (-1));
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2442");
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
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        commonGramsTokenFilterFactoryTests28.assertDocsSkippingEquals("<unknown>", indexReader35, 10, postingsEnum37, postingsEnum38, true);
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexReader35, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2443");
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
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("<unknown>", (int) (byte) -1, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2444");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, 1.0d, 0.0d);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2445");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 0.0f);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2446");
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
        java.lang.String str55 = commonGramsTokenFilterFactoryTests41.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) str55);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2447");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.badapples", indexReader9, fields10, fields11, true);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        org.junit.Assert.assertArrayEquals("", shortArray16, shortArray18);
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader9, (java.lang.Object) shortArray18);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals("", shortArray26, shortArray28);
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray26, shortArray32);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray36);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals("", shortArray36, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray36);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray18, shortArray32);
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray44 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[] baseTokenStreamTestCaseArray45 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[] {};
        org.apache.lucene.analysis.BaseTokenStreamTestCase[][] baseTokenStreamTestCaseArray46 = new org.apache.lucene.analysis.BaseTokenStreamTestCase[][] { baseTokenStreamTestCaseArray44, baseTokenStreamTestCaseArray45 };
        java.util.Set<org.apache.lucene.analysis.BaseTokenStreamTestCase[]> baseTokenStreamTestCaseArraySet47 = org.apache.lucene.util.LuceneTestCase.asSet(baseTokenStreamTestCaseArray46);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) shortArray32, (java.lang.Object) baseTokenStreamTestCaseArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2448");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) '#', (float) 2, (float) (short) -1);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2449");
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
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray47);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray50);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray59);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray61);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray59);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray69);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals("", shortArray69, shortArray71);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray76);
        short[] shortArray78 = new short[] {};
        short[] shortArray79 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray78, shortArray79);
        org.junit.Assert.assertArrayEquals(shortArray76, shortArray78);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray71, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) shortArray33);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2450");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1, (float) (-1L), (float) 1);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2451");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, 0.0d);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2452");
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
        java.util.Locale[] localeArray52 = new java.util.Locale[] {};
        java.util.Locale[][] localeArray53 = new java.util.Locale[][] { localeArray52 };
        java.util.Set<java.util.Locale[]> localeArraySet54 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray53);
        java.util.Set<java.util.Locale[]> localeArraySet55 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray18, (java.lang.Object[]) localeArray53);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2453");
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
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) 100, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2454");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray0 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet1 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray0);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet2 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray0);
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
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet52 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray51);
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet58 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray57);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray51, (java.lang.Object[]) charSequenceArray57);
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet65 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray57, (java.lang.Object[]) charSequenceArray64);
        java.util.Set<java.lang.Object> objSet67 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) charSequenceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray42, (java.lang.Object[]) charSequenceArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) queryCachingPolicyArray0, (java.lang.Object[]) charSequenceArray42);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2455");
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
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray27, longArray28);
        long[] longArray32 = new long[] {};
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray32, longArray33);
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray32, longArray35);
        long[] longArray38 = new long[] {};
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray38, longArray39);
        org.junit.Assert.assertArrayEquals(longArray35, longArray38);
        org.junit.Assert.assertArrayEquals(longArray27, longArray35);
        long[] longArray46 = new long[] {};
        long[] longArray47 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray46, longArray47);
        long[] longArray49 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray46, longArray49);
        long[] longArray53 = new long[] {};
        long[] longArray54 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray53, longArray54);
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray53, longArray56);
        long[] longArray59 = new long[] {};
        long[] longArray60 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray59, longArray60);
        org.junit.Assert.assertArrayEquals(longArray56, longArray59);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray46, longArray56);
        org.junit.Assert.assertArrayEquals(longArray35, longArray46);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) longArray46);
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum67, postingsEnum68);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2456");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder2 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader9, terms10, terms11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("random", indexReader15, 1, postingsEnum17, postingsEnum18, false);
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder22 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests25.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests25.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests25.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests25.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str31 = commonGramsTokenFilterFactoryTests25.getTestName();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        commonGramsTokenFilterFactoryTests25.assertTermsEquals("tests.awaitsfix", indexReader33, terms34, terms35, true);
        commonGramsTokenFilterFactoryTests25.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests39.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests39);
        commonGramsTokenFilterFactoryTests39.tearDown();
        commonGramsTokenFilterFactoryTests39.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests39.restoreIndexWriterMaxDocs();
        java.lang.String str45 = commonGramsTokenFilterFactoryTests39.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests39.assertDocsEnumEquals("random", postingsEnum47, postingsEnum48, false);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests25, (java.lang.Object) postingsEnum47);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        org.junit.Assert.assertArrayEquals(charArray58, charArray61);
        org.junit.Assert.assertArrayEquals("", charArray54, charArray58);
        char[] charArray65 = new char[] {};
        char[] charArray66 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray65, charArray66);
        char[] charArray68 = new char[] {};
        char[] charArray69 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray68, charArray69);
        org.junit.Assert.assertArrayEquals(charArray66, charArray69);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray58, charArray66);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests25, (java.lang.Object) "tests.slow");
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.awaitsfix");
        org.apache.lucene.index.NumericDocValues numericDocValues77 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("random", (int) (short) -1, numericDocValues77, numericDocValues78);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2457");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) (short) 1, (float) '4', 10.0f);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2458");
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
        org.elasticsearch.common.settings.Settings.Builder builder56 = commonGramsTokenFilterFactoryTests26.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) builder56);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2459");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, 10.0d, (double) (byte) 0);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2460");
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
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass23 = locale22.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) locale22);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2461");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests27.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests27.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader30, (int) (byte) -1, postingsEnum32, postingsEnum33);
        commonGramsTokenFilterFactoryTests27.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        commonGramsTokenFilterFactoryTests27.assertTermsEquals("enwiki.random.lines.txt", indexReader38, terms39, terms40, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests43 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        commonGramsTokenFilterFactoryTests43.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader45, 0, postingsEnum47, postingsEnum48);
        commonGramsTokenFilterFactoryTests43.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        commonGramsTokenFilterFactoryTests43.assertPositionsSkippingEquals("tests.weekly", indexReader52, (int) '#', postingsEnum54, postingsEnum55);
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        commonGramsTokenFilterFactoryTests43.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader58, 0, postingsEnum60, postingsEnum61);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests43.assertDocsSkippingEquals("", indexReader64, (int) (short) -1, postingsEnum66, postingsEnum67, true);
        commonGramsTokenFilterFactoryTests43.setUp();
        commonGramsTokenFilterFactoryTests43.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder72 = commonGramsTokenFilterFactoryTests43.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests43.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests27, (java.lang.Object) commonGramsTokenFilterFactoryTests43);
        java.lang.Class<?> wildcardClass75 = commonGramsTokenFilterFactoryTests43.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) "tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests43);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2462");
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
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 100);
        java.lang.String str17 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("random", postingsEnum19, postingsEnum20, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests23.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader25, 0, postingsEnum27, postingsEnum28);
        commonGramsTokenFilterFactoryTests23.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests23.assertPositionsSkippingEquals("tests.weekly", indexReader32, (int) '#', postingsEnum34, postingsEnum35);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        commonGramsTokenFilterFactoryTests23.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader38, 0, postingsEnum40, postingsEnum41);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests23.assertDocsSkippingEquals("", indexReader44, (int) (short) -1, postingsEnum46, postingsEnum47, true);
        commonGramsTokenFilterFactoryTests23.setUp();
        commonGramsTokenFilterFactoryTests23.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder52 = commonGramsTokenFilterFactoryTests23.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests23.tearDown();
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests23.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder55 = commonGramsTokenFilterFactoryTests23.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum20, (java.lang.Object) builder55);
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray58 = new org.apache.lucene.search.QueryCachingPolicy[] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet59 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray58);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests60 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests60.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests60.setUp();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) queryCachingPolicySet59, (java.lang.Object) commonGramsTokenFilterFactoryTests60);
        commonGramsTokenFilterFactoryTests60.setUp();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        commonGramsTokenFilterFactoryTests60.assertTermsEquals("tests.slow", indexReader66, terms67, terms68, false);
        org.elasticsearch.common.settings.Settings.Builder builder71 = commonGramsTokenFilterFactoryTests60.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder72 = commonGramsTokenFilterFactoryTests60.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.Fields fields75 = null;
        org.apache.lucene.index.Fields fields76 = null;
        commonGramsTokenFilterFactoryTests60.assertFieldsEquals("tests.failfast", indexReader74, fields75, fields76, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) postingsEnum20, (java.lang.Object) fields76);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2463");
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
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray25, longArray26);
        long[] longArray32 = new long[] {};
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray32, longArray33);
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray32, longArray35);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray39, longArray40);
        long[] longArray42 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray39, longArray42);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray45, longArray46);
        org.junit.Assert.assertArrayEquals(longArray42, longArray45);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray32, longArray42);
        long[] longArray52 = new long[] {};
        long[] longArray53 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray52, longArray53);
        long[] longArray55 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray52, longArray55);
        org.junit.Assert.assertArrayEquals("", longArray42, longArray52);
        org.junit.Assert.assertArrayEquals("", longArray25, longArray42);
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
        long[] longArray76 = new long[] {};
        long[] longArray77 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray76, longArray77);
        long[] longArray81 = new long[] {};
        long[] longArray82 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray81, longArray82);
        long[] longArray84 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray81, longArray84);
        long[] longArray87 = new long[] {};
        long[] longArray88 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray87, longArray88);
        org.junit.Assert.assertArrayEquals(longArray84, longArray87);
        org.junit.Assert.assertArrayEquals(longArray76, longArray84);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray62, longArray76);
        long[] longArray94 = new long[] {};
        long[] longArray95 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray94, longArray95);
        org.junit.Assert.assertArrayEquals(longArray76, longArray94);
        org.junit.Assert.assertArrayEquals("", longArray42, longArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) builder21, (java.lang.Object) longArray42);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2464");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) (short) 1);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2465");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder30 = commonGramsTokenFilterFactoryTests29.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests29.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests29, (java.lang.Object) "tests.slow");
        commonGramsTokenFilterFactoryTests29.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests29.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        commonGramsTokenFilterFactoryTests29.assertTermsEquals("", indexReader37, terms38, terms39, false);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsSkippingEquals("random", indexReader43, 1, postingsEnum45, postingsEnum46, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) builder28, (java.lang.Object) commonGramsTokenFilterFactoryTests29);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2466");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (-1L), (double) 0L);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2467");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.nightly", "<unknown>", "enwiki.random.lines.txt", "tests.awaitsfix" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, strArray6);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2468");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) 0, 100.0d);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2469");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals("", shortArray7, shortArray9);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray9, shortArray14);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray27);
        org.junit.Assert.assertArrayEquals("", shortArray24, shortArray26);
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray24, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray24);
        org.junit.Assert.assertArrayEquals("random", shortArray2, shortArray9);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray35);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray35);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray45);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray45);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests58 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        commonGramsTokenFilterFactoryTests58.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader60, 0, postingsEnum62, postingsEnum63);
        commonGramsTokenFilterFactoryTests58.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        commonGramsTokenFilterFactoryTests58.assertPositionsSkippingEquals("tests.weekly", indexReader67, (int) '#', postingsEnum69, postingsEnum70);
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        commonGramsTokenFilterFactoryTests58.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader73, 0, postingsEnum75, postingsEnum76);
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        commonGramsTokenFilterFactoryTests58.assertDocsSkippingEquals("", indexReader79, (int) (short) -1, postingsEnum81, postingsEnum82, true);
        commonGramsTokenFilterFactoryTests58.setUp();
        commonGramsTokenFilterFactoryTests58.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder87 = commonGramsTokenFilterFactoryTests58.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests58.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray2, (java.lang.Object) commonGramsTokenFilterFactoryTests58);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2470");
        double[] doubleArray5 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray6 = new double[][] { doubleArray5 };
        double[] doubleArray11 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray12 = new double[][] { doubleArray11 };
        double[][][] doubleArray13 = new double[][][] { doubleArray6, doubleArray12 };
        double[] doubleArray18 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray19 = new double[][] { doubleArray18 };
        double[] doubleArray24 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray25 = new double[][] { doubleArray24 };
        double[][][] doubleArray26 = new double[][][] { doubleArray19, doubleArray25 };
        double[] doubleArray31 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray32 = new double[][] { doubleArray31 };
        double[] doubleArray37 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray38 = new double[][] { doubleArray37 };
        double[][][] doubleArray39 = new double[][][] { doubleArray32, doubleArray38 };
        double[] doubleArray44 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray45 = new double[][] { doubleArray44 };
        double[] doubleArray50 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray51 = new double[][] { doubleArray50 };
        double[][][] doubleArray52 = new double[][][] { doubleArray45, doubleArray51 };
        double[] doubleArray57 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray58 = new double[][] { doubleArray57 };
        double[] doubleArray63 = new double[] { (short) 0, 1, 100.0f, '#' };
        double[][] doubleArray64 = new double[][] { doubleArray63 };
        double[][][] doubleArray65 = new double[][][] { doubleArray58, doubleArray64 };
        double[][][][] doubleArray66 = new double[][][][] { doubleArray13, doubleArray26, doubleArray39, doubleArray52, doubleArray65 };
        java.util.Set<double[][][]> doubleArraySet67 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) doubleArraySet67);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2471");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (short) 1, (double) (byte) 10, 0.0d);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2472");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) 2);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2473");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 100, (long) ' ');
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2474");
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
        org.elasticsearch.common.settings.Settings.Builder builder25 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests29.setUp();
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet37 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray36);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray42);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray36, (java.lang.Object[]) charSequenceArray42);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests29, (java.lang.Object) charSequenceArray36);
        commonGramsTokenFilterFactoryTests29.tearDown();
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) (-1.0d), (java.lang.Object) commonGramsTokenFilterFactoryTests29);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsSkippingEquals("tests.maxfailures", indexReader49, (int) (byte) 10, postingsEnum51, postingsEnum52, false);
        org.junit.rules.TestRule testRule55 = commonGramsTokenFilterFactoryTests29.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) testRule55);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2475");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', (float) '#', (float) (short) 1);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2476");
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
        org.junit.Assert.assertArrayEquals(charArray28, charArray31);
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
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        org.junit.Assert.assertArrayEquals(charArray61, charArray64);
        org.junit.Assert.assertArrayEquals("", charArray57, charArray61);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray49, charArray57);
        org.junit.Assert.assertArrayEquals(charArray28, charArray57);
        org.junit.Assert.assertArrayEquals(charArray16, charArray28);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) charArray28);
        org.junit.Assert.assertArrayEquals(charArray13, charArray28);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray2, charArray13);
        char[] charArray74 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray13, charArray74);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2477");
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
        java.util.Set<java.lang.reflect.Type> typeSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.Type[]) wildcardClassArray18);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling26 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray18, (java.lang.Object[]) throttlingArray27);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2478");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.elasticsearch.common.settings.Settings.Builder builder1 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("random", postingsEnum5, postingsEnum6, false);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2479");
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
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) floatArray15, (java.lang.Object) (short) 1);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2480");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 10L);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2481");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) (short) 0);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2482");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) (short) 1);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2483");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, 1.0d, (double) 1);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2484");
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
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.monster", postingsEnum27, postingsEnum28, false);
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests2.ruleChain;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) testRule31, (java.lang.Object) postingsEnum47);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2485");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests6.setUp();
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet14 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "tests.monster", "hi!", "tests.monster" };
        java.util.Set<java.lang.CharSequence> charSequenceSet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray13, (java.lang.Object[]) charSequenceArray19);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests6, (java.lang.Object) charSequenceArray13);
        commonGramsTokenFilterFactoryTests6.tearDown();
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) (-1.0d), (java.lang.Object) commonGramsTokenFilterFactoryTests6);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests6);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2486");
        double[] doubleArray1 = null;
        double[] doubleArray4 = new double[] { ' ', (-1) };
        double[] doubleArray7 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 100L);
        double[] doubleArray13 = new double[] { ' ', (-1) };
        double[] doubleArray16 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray16, (double) 100L);
        double[] doubleArray21 = new double[] { ' ', (-1) };
        double[] doubleArray24 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray24, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray16, doubleArray21, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray21, (double) 1);
        double[] doubleArray33 = new double[] { ' ', (-1) };
        double[] doubleArray36 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray36, (double) 100L);
        double[] doubleArray42 = new double[] { ' ', (-1) };
        double[] doubleArray45 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray45, (double) 100L);
        double[] doubleArray50 = new double[] { ' ', (-1) };
        double[] doubleArray53 = new double[] { 0.0f, (byte) 0 };
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray53, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray45, doubleArray50, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray50, (double) 1);
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray50, (double) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray1, doubleArray21, (double) (short) -1);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2487");
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
        org.junit.Assert.assertArrayEquals("", charArray15, charArray59);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests71 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        org.apache.lucene.index.Terms terms75 = null;
        commonGramsTokenFilterFactoryTests71.assertTermsEquals("", indexReader73, terms74, terms75, false);
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        commonGramsTokenFilterFactoryTests71.assertDocsEnumEquals("tests.weekly", postingsEnum79, postingsEnum80, false);
        java.lang.String str83 = commonGramsTokenFilterFactoryTests71.getTestName();
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        commonGramsTokenFilterFactoryTests71.assertDocsSkippingEquals("tests.awaitsfix", indexReader85, 10, postingsEnum87, postingsEnum88, false);
        commonGramsTokenFilterFactoryTests71.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) charArray15, (java.lang.Object) commonGramsTokenFilterFactoryTests71);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2488");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast" };
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "<unknown>", "tests.failfast" };
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] { charSequenceArray2, charSequenceArray5 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
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
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests8.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder31 = commonGramsTokenFilterFactoryTests8.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests8.setIndexWriterMaxDocs((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charSequenceArraySet7, (java.lang.Object) commonGramsTokenFilterFactoryTests8);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2489");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 0.0d, (double) (byte) 0);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2490");
        long[] longArray0 = null;
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
        org.junit.Assert.assertArrayEquals(longArray0, longArray13);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2491");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 2, (double) '4', (double) (short) 0);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2492");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (short) 0, (double) 1L);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2493");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', 0.0f, (float) (short) 10);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2494");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (-1.0f), (double) ' ');
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2495");
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
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        commonGramsTokenFilterFactoryTests3.assertTermsEquals("", indexReader30, terms31, terms32, false);
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests3.assertDocValuesEquals("enwiki.random.lines.txt", (int) '#', numericDocValues37, numericDocValues38);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2496");
        long[] longArray0 = null;
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray4, longArray5);
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray4, longArray7);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray11, longArray12);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray17, longArray18);
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray17, longArray20);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray24, longArray25);
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray24, longArray27);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray30, longArray31);
        org.junit.Assert.assertArrayEquals(longArray27, longArray30);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray17, longArray27);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray37, longArray38);
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray37, longArray40);
        long[] longArray44 = new long[] {};
        long[] longArray45 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray44, longArray45);
        long[] longArray47 = new long[] {};
        org.junit.Assert.assertArrayEquals("hi!", longArray44, longArray47);
        org.junit.Assert.assertArrayEquals(longArray37, longArray47);
        org.junit.Assert.assertArrayEquals(longArray17, longArray37);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray12, longArray37);
        org.junit.Assert.assertArrayEquals("", longArray7, longArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray37);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2497");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 10L, (double) '#', (double) (short) 1);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2498");
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
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2499");
        java.lang.Object obj0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) ' ');
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2500");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("random", byteArray5, byteArray8);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray14, byteArray15);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray21, byteArray22);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray22, byteArray26);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray31, byteArray32);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray35, byteArray36);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray32, byteArray35);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray26, byteArray32);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray43, byteArray44);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray47, byteArray48);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray44, byteArray48);
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray53, byteArray54);
        byte[] byteArray57 = new byte[] {};
        byte[] byteArray58 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray57, byteArray58);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray54, byteArray57);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray48, byteArray54);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray32, byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray32);
        byte[] byteArray68 = new byte[] {};
        byte[] byteArray69 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray68, byteArray69);
        byte[] byteArray72 = new byte[] {};
        byte[] byteArray73 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray72, byteArray73);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray69, byteArray73);
        byte[] byteArray78 = new byte[] {};
        byte[] byteArray79 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray78, byteArray79);
        byte[] byteArray82 = new byte[] {};
        byte[] byteArray83 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray82, byteArray83);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray79, byteArray82);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray73, byteArray79);
        org.junit.Assert.assertNotNull("", (java.lang.Object) byteArray79);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray15, byteArray79);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray8, byteArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) byteArray8);
    }
}

