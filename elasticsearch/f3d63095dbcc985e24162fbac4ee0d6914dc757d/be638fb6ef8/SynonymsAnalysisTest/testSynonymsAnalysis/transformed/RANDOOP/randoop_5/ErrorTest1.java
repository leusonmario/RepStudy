import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0501");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 100, (double) (short) 0, (double) 0.0f);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray20, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray32, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray46, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray46);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray58, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray20);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        byte[] byteArray1 = null;
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray1, byteArray5);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        short[][] shortArray8 = new short[][] { shortArray2, shortArray3, shortArray4, shortArray5, shortArray6, shortArray7 };
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        short[][] shortArray15 = new short[][] { shortArray9, shortArray10, shortArray11, shortArray12, shortArray13, shortArray14 };
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        short[][] shortArray22 = new short[][] { shortArray16, shortArray17, shortArray18, shortArray19, shortArray20, shortArray21 };
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        short[][] shortArray29 = new short[][] { shortArray23, shortArray24, shortArray25, shortArray26, shortArray27, shortArray28 };
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        short[][] shortArray36 = new short[][] { shortArray30, shortArray31, shortArray32, shortArray33, shortArray34, shortArray35 };
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        short[][] shortArray43 = new short[][] { shortArray37, shortArray38, shortArray39, shortArray40, shortArray41, shortArray42 };
        short[][][] shortArray44 = new short[][][] { shortArray8, shortArray15, shortArray22, shortArray29, shortArray36, shortArray43 };
        java.util.List<short[][]> shortArrayList45 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, shortArray44);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest46.setUp();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        synonymsAnalysisTest46.assertDocsSkippingEquals("hi!", indexReader49, 0, postingsEnum51, postingsEnum52, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService55 = synonymsAnalysisTest46.analysisService;
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        synonymsAnalysisTest46.assertFieldsEquals("random", indexReader57, fields58, fields59, true);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        synonymsAnalysisTest46.assertTermsEquals("tests.weekly", indexReader63, terms64, terms65, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService68 = null;
        synonymsAnalysisTest46.setanalysisService(analysisService68);
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        synonymsAnalysisTest46.assertPositionsSkippingEquals("tests.awaitsfix", indexReader71, 3, postingsEnum73, postingsEnum74);
        org.elasticsearch.common.logging.ESLogger eSLogger76 = synonymsAnalysisTest46.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) (byte) 1, (java.lang.Object) eSLogger76);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[][] strArray31 = new java.lang.String[][] { strArray6, strArray12, strArray18, strArray24, strArray30 };
        java.util.List<java.lang.String[]> strArrayList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf(5, strArray31);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray40, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray52, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray52);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        java.util.concurrent.ExecutorService executorService64 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] { executorService64 };
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray65, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray65);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray31, (java.lang.Object[]) executorServiceArray60);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        float[] floatArray0 = null;
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) 4);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        int[] intArray5 = new int[] { 1, 10, 100, 3, (short) 1 };
        int[] intArray9 = new int[] { (byte) -1, '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray9);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", 10.0d, 10.0d, (double) (short) 10);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        long[] longArray5 = new long[] { 10L, (byte) 100, '#', 0L };
        long[] longArray12 = new long[] { 1L, (short) 0, 2, 1L, (byte) 10, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray5, longArray12);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.setUp();
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray21, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray34, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray46, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray34);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray62, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray62);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray74, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray62, (java.lang.Object[]) executorServiceArray74);
        java.util.concurrent.ExecutorService executorService81 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray82 = new java.util.concurrent.ExecutorService[] { executorService81 };
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray82);
        boolean boolean84 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray82);
        java.util.concurrent.ExecutorService executorService86 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray87 = new java.util.concurrent.ExecutorService[] { executorService86 };
        boolean boolean88 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray87);
        boolean boolean89 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray87);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray87, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray82, (java.lang.Object[]) executorServiceArray87);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray62, (java.lang.Object[]) executorServiceArray82);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) executorServiceArray16);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray3 = new byte[] { (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray3);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        double[] doubleArray3 = new double[] { 100.0f, 100.0d, 3 };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) (-1));
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 100, (byte) -1 };
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray5);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1L, (double) (short) 0, (double) (byte) 10);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.nightly", (int) (short) 1, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        int[] intArray2 = new int[] { 100, '#' };
        int[] intArray6 = new int[] { 10, 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray6);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) 'a', (float) (-1L), (float) 1L);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest3.setUp();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest3.assertDocsSkippingEquals("hi!", indexReader6, 0, postingsEnum8, postingsEnum9, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = null;
        synonymsAnalysisTest3.setanalysisService(analysisService12);
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest3.logger;
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) executorServiceArray1, (java.lang.Object) synonymsAnalysisTest3);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray27, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray27);
        java.lang.Object obj33 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray22, obj33);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray46, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray46);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray58, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        java.util.concurrent.ExecutorService executorService71 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] { executorService71 };
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray77, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) executorServiceArray77);
        java.lang.Object obj83 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray72, obj83);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray72);
        boolean boolean86 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray72);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        double[] doubleArray3 = new double[] { 0L, 10.0d };
        double[] doubleArray8 = new double[] { 3, 5, 'a', 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray3, doubleArray8, (-1.0d));
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        double[] doubleArray6 = new double[] { 0, (byte) 100, 100.0d, 1, 10.0f, 0.0f };
        double[] doubleArray8 = new double[] { 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray8, (double) 10);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray11, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        java.lang.Object obj17 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray6, obj17);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray6);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest21.setUp();
        synonymsAnalysisTest21.ensureCheckIndexPassed();
        synonymsAnalysisTest21.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest21.analysisService;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        synonymsAnalysisTest21.assertFieldsEquals("tests.weekly", indexReader27, fields28, fields29, false);
        synonymsAnalysisTest21.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) synonymsAnalysisTest21, (java.lang.Object) 4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) executorServiceArray1, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) ' ', (long) (short) 1);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader17, terms18, terms19, false);
        synonymsAnalysisTest0.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest25.setUp();
        synonymsAnalysisTest25.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) analysisService24, (java.lang.Object) synonymsAnalysisTest25);
        org.elasticsearch.common.logging.ESLogger eSLogger29 = synonymsAnalysisTest25.getlogger();
        synonymsAnalysisTest25.restoreIndexWriterMaxDocs();
        java.lang.Object obj31 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = synonymsAnalysisTest32.getanalysisService();
        synonymsAnalysisTest32.overrideTestDefaultQueryCache();
        synonymsAnalysisTest32.overrideTestDefaultQueryCache();
        synonymsAnalysisTest32.setUp();
        org.junit.Assert.assertNotEquals(obj31, (java.lang.Object) synonymsAnalysisTest32);
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest32.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest25, (java.lang.Object) analysisService38);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest0.ruleChain;
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray18, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray31, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray43, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray31);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray31);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray54, shortArray55);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray58, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray58);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray63, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray63);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray68, shortArray69);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray72, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray72);
        org.junit.Assert.assertArrayEquals("random", shortArray58, shortArray72);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) executorServiceArray31, (java.lang.Object) shortArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) executorServiceArray31);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray6);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 4, (double) 5);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        char[] charArray0 = null;
        char[] charArray3 = new char[] { 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray3);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (byte) -1, (long) '#');
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        char[] charArray4 = new char[] { ' ', '#', ' ', '4' };
        char[] charArray11 = new char[] { ' ', ' ', '4', ' ', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray11);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        double[] doubleArray3 = new double[] { (short) 100, 5, (byte) 0 };
        double[] doubleArray8 = new double[] { 100.0f, 1, '#', 100.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray8, (double) (short) 0);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 1L, (long) (-1));
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        char[] charArray6 = new char[] { '4', '4', 'a', '#', ' ' };
        char[] charArray13 = new char[] { '4', '4', ' ', '#', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray6, charArray13);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.nightly", postingsEnum4, postingsEnum5, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest9.assertDocsEnumEquals("tests.badapples", postingsEnum11, postingsEnum12, true);
        synonymsAnalysisTest9.ensureAllSearchContextsReleased();
        synonymsAnalysisTest9.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest18.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest18.assertDocsSkippingEquals("hi!", indexReader21, 0, postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest18.analysisService;
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest18.assertPositionsSkippingEquals("tests.badapples", indexReader30, (int) (short) 10, postingsEnum32, postingsEnum33);
        org.junit.rules.RuleChain ruleChain35 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain35;
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        synonymsAnalysisTest9.assertFieldsEquals("tests.nightly", indexReader38, fields39, fields40, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) fields40);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.tearDown();
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest6.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest6.assertDocsSkippingEquals("hi!", indexReader9, 0, postingsEnum11, postingsEnum12, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest6.analysisService;
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest6.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (short) 10, postingsEnum20, postingsEnum21);
        java.lang.String str23 = synonymsAnalysisTest6.getTestName();
        synonymsAnalysisTest6.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest6);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (byte) 10, (double) 5);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        java.lang.String str16 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("<unknown>", (int) 'a', numericDocValues20, numericDocValues21);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray6, shortArray7);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray10, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray10);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) true, (java.lang.Object) shortArray10);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        char[] charArray5 = new char[] { 'a', 'a', ' ', '#', 'a' };
        char[] charArray11 = new char[] { ' ', 'a', '#', ' ', 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray11);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) 10 };
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray13);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.slow", true);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.setUp();
        org.junit.Assert.assertNotEquals(obj0, (java.lang.Object) synonymsAnalysisTest1);
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest1.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest1.logger;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (-1L), (long) '#');
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray5 = new int[] { (byte) 0, (byte) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray5);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
        long[] longArray5 = new long[] { 1, (-1L), 10L, 1 };
        long[] longArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray5, longArray6);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) 4);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (byte) 10, (long) '4');
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("europarl.lines.txt.gz", true);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) (byte) -1);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 10, (float) 5, (float) (byte) 0);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest2.assertFieldsEquals("random", indexReader13, fields14, fields15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("tests.maxfailures", indexReader19, 0, postingsEnum21, postingsEnum22);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest24.assertDocsEnumEquals("tests.badapples", postingsEnum26, postingsEnum27, true);
        synonymsAnalysisTest24.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger31 = synonymsAnalysisTest24.getlogger();
        java.lang.String str32 = synonymsAnalysisTest24.getTestName();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) str32);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("<unknown>", indexReader35, 5, postingsEnum37, postingsEnum38, false);
        org.elasticsearch.common.logging.ESLogger eSLogger41 = synonymsAnalysisTest2.getlogger();
        org.elasticsearch.index.analysis.AnalysisService analysisService42 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService42);
        java.lang.Object obj44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) synonymsAnalysisTest2, obj44);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1 };
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        long[] longArray0 = null;
        long[] longArray7 = new long[] { '#', 'a', 0, (byte) 10, (-1L), 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray7);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        char[] charArray2 = new char[] { '#', 'a' };
        char[] charArray8 = new char[] { '#', '4', '4', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray8);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        short[] shortArray1 = null;
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray5, shortArray6);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray9);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray14);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray19, shortArray20);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray23);
        org.junit.Assert.assertArrayEquals("random", shortArray9, shortArray23);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray34, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray23, (java.lang.Object) executorServiceArray34);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray43, shortArray44);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray47, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray47);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray52);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray57, shortArray58);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray61, shortArray62);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray65, shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray57);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray57);
        org.junit.Assert.assertArrayEquals("hi!", shortArray23, shortArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray1, shortArray23);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        char[] charArray2 = new char[] { '#' };
        char[] charArray7 = new char[] { ' ', '4', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray2, charArray7);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", (double) 0.0f, (double) 10.0f, (double) (short) 100);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        char[] charArray2 = new char[] { ' ', '4' };
        char[] charArray7 = new char[] { ' ', ' ', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray7);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest11.assertDocsSkippingEquals("hi!", indexReader14, 0, postingsEnum16, postingsEnum17, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = null;
        synonymsAnalysisTest11.setanalysisService(analysisService20);
        org.elasticsearch.common.logging.ESLogger eSLogger22 = synonymsAnalysisTest11.logger;
        java.lang.Object obj23 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest11, obj23);
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest11.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest26.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest26.logger;
        synonymsAnalysisTest26.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest1, synonymsAnalysisTest11, synonymsAnalysisTest26 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet31 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray30);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet32 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) luceneTestCaseSet32);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.slow");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        double[] doubleArray5 = new double[] { (short) 10, 0, (short) 100, (byte) 0 };
        double[] doubleArray7 = new double[] { 1.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", doubleArray5, doubleArray7, (double) 0L);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) 0, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.badapples", indexReader13, (int) (short) 10, postingsEnum15, postingsEnum16);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest20.setUp();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest20.assertDocsSkippingEquals("hi!", indexReader23, 0, postingsEnum25, postingsEnum26, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = null;
        synonymsAnalysisTest20.setanalysisService(analysisService29);
        org.elasticsearch.common.logging.ESLogger eSLogger31 = synonymsAnalysisTest20.logger;
        java.lang.Object obj32 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest20, obj32);
        org.junit.rules.TestRule testRule34 = synonymsAnalysisTest20.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest20);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest36.setUp();
        synonymsAnalysisTest36.ensureCheckIndexPassed();
        synonymsAnalysisTest36.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest36.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest41.setUp();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        synonymsAnalysisTest41.assertDocsSkippingEquals("hi!", indexReader44, 0, postingsEnum46, postingsEnum47, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService50 = synonymsAnalysisTest41.analysisService;
        org.junit.rules.RuleChain ruleChain51 = synonymsAnalysisTest41.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        synonymsAnalysisTest41.assertPositionsSkippingEquals("tests.badapples", indexReader53, (int) (short) 10, postingsEnum55, postingsEnum56);
        org.junit.rules.RuleChain ruleChain58 = synonymsAnalysisTest41.failureAndSuccessEvents;
        synonymsAnalysisTest36.failureAndSuccessEvents = ruleChain58;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain58);
        synonymsAnalysisTest20.failureAndSuccessEvents = ruleChain58;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest20);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        double[] doubleArray3 = new double[] { 1L, 'a' };
        double[] doubleArray6 = new double[] { 1, 10L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray3, doubleArray6, (double) (short) 1);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) '4', (double) 3, (double) (-1L));
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray3, (java.lang.Object) (-1.0f));
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray10, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray10);
        java.lang.Object[] objArray16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, objArray16);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.failfast");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.getanalysisService();
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray12, (java.lang.Object) (-1.0f));
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray25, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray25);
        java.lang.Object obj31 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray20, obj31);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) analysisService8, (java.lang.Object) executorServiceArray20);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) 100L, 10.0f);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        int[] intArray5 = new int[] { (short) 100, (short) 1, 1, (-1), (short) 0 };
        int[] intArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (short) 100, 10.0d);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        float[] floatArray3 = new float[] { 0, '#', 100 };
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray5, (float) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray5, (float) 10);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        long[] longArray3 = new long[] { (short) 1, (-1L), (byte) 0 };
        long[] longArray5 = new long[] { 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        long[] longArray5 = new long[] { 4, (byte) -1, (-1), (-1), (byte) -1 };
        long[] longArray7 = new long[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray7);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        int[] intArray5 = new int[] { 4, (short) 1, ' ', '4', (byte) 10 };
        int[] intArray9 = new int[] { 'a', 3, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray9);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        int[] intArray3 = new int[] { 0, (byte) 10 };
        int[] intArray9 = new int[] { 2, 0, '4', (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray3, intArray9);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (byte) 0, (long) 100);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest2.analysisService;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.weekly", indexReader8, fields9, fields10, false);
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) 4);
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (byte) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest18.assertDocsEnumEquals("tests.badapples", postingsEnum20, postingsEnum21, true);
        synonymsAnalysisTest18.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest18.assertPositionsSkippingEquals("tests.weekly", indexReader27, (int) (short) 100, postingsEnum29, postingsEnum30);
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = null;
        synonymsAnalysisTest18.setanalysisService(analysisService32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) analysisService32);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray19, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray7);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) boolean27);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.weekly", true);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("hi!", indexReader16, 0, postingsEnum18, postingsEnum19, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest13.analysisService;
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest13.failureAndSuccessEvents;
        synonymsAnalysisTest13.ensureCleanedUp();
        org.elasticsearch.common.logging.ESLogger eSLogger25 = synonymsAnalysisTest13.logger;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) executorServiceArray7, (java.lang.Object) synonymsAnalysisTest13);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest28.assertDocsEnumEquals("tests.badapples", postingsEnum30, postingsEnum31, true);
        synonymsAnalysisTest28.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule36 = synonymsAnalysisTest28.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest37.setUp();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        synonymsAnalysisTest37.assertDocsSkippingEquals("hi!", indexReader40, 0, postingsEnum42, postingsEnum43, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = synonymsAnalysisTest37.analysisService;
        org.junit.rules.RuleChain ruleChain47 = synonymsAnalysisTest37.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain47;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest49.setUp();
        synonymsAnalysisTest49.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest49, (java.lang.Object) (short) 1);
        synonymsAnalysisTest49.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest55 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest55.setUp();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        synonymsAnalysisTest55.assertDocsSkippingEquals("hi!", indexReader58, 0, postingsEnum60, postingsEnum61, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService64 = synonymsAnalysisTest55.analysisService;
        org.junit.rules.RuleChain ruleChain65 = synonymsAnalysisTest55.failureAndSuccessEvents;
        synonymsAnalysisTest49.failureAndSuccessEvents = ruleChain65;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest67 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest67.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger69 = synonymsAnalysisTest67.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest70 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest70.setUp();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        synonymsAnalysisTest70.assertDocsSkippingEquals("hi!", indexReader73, 0, postingsEnum75, postingsEnum76, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService79 = synonymsAnalysisTest70.analysisService;
        org.junit.rules.RuleChain ruleChain80 = synonymsAnalysisTest70.failureAndSuccessEvents;
        synonymsAnalysisTest67.failureAndSuccessEvents = ruleChain80;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest82 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest82.setUp();
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        synonymsAnalysisTest82.assertDocsSkippingEquals("hi!", indexReader85, 0, postingsEnum87, postingsEnum88, true);
        org.junit.rules.TestRule testRule91 = synonymsAnalysisTest82.ruleChain;
        org.junit.rules.TestRule[] testRuleArray92 = new org.junit.rules.TestRule[] { testRule36, ruleChain47, ruleChain65, ruleChain80, testRule91 };
        java.util.List<org.junit.rules.TestRule> testRuleList93 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, testRuleArray92);
        java.util.Set<org.junit.rules.TestRule> testRuleSet94 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray92);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) testRuleArray92);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", 0L, 0L);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        int[] intArray1 = null;
        int[] intArray3 = new int[] { 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray1, intArray3);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader7, fields8, fields9, false);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest15.setUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("hi!", indexReader18, 0, postingsEnum20, postingsEnum21, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = null;
        synonymsAnalysisTest15.setanalysisService(analysisService24);
        org.elasticsearch.common.logging.ESLogger eSLogger26 = synonymsAnalysisTest15.logger;
        java.lang.Object obj27 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest15, obj27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest15);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 100.0d, (double) (short) 0, (double) 10L);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 5, 0.0f, 0.0f);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        char[] charArray5 = new char[] { ' ', 'a', '#', ' ', '#' };
        char[] charArray7 = new char[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray7);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest2.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("tests.badapples", indexReader14, (int) (short) 10, postingsEnum16, postingsEnum17);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest19.assertDocsSkippingEquals("hi!", indexReader22, 0, postingsEnum24, postingsEnum25, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest19.analysisService;
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest19.failureAndSuccessEvents;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain29;
        synonymsAnalysisTest2.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) false, (java.lang.Object) synonymsAnalysisTest2);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 0, (float) ' ', (float) (byte) 1);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        long[] longArray4 = new long[] { (byte) 1, 1, (-1L), (short) 100 };
        long[] longArray11 = new long[] { 0, (short) -1, (byte) 1, (-1), (byte) 100, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray11);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (short) 1);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str5 = synonymsAnalysisTest4.getTestName();
        synonymsAnalysisTest4.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest7.getanalysisService();
        synonymsAnalysisTest7.overrideTestDefaultQueryCache();
        synonymsAnalysisTest7.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest7.analysisService;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest4, (java.lang.Object) analysisService11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) analysisService11);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) (short) 100, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService14);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.nightly", indexReader19, (int) (short) 1, postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("europarl.lines.txt.gz", (-1), numericDocValues27, numericDocValues28);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(100.0d, (double) '4', (double) (short) 100);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        char[] charArray1 = new char[] {};
        char[] charArray6 = new char[] { ' ', '4', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray1, charArray6);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
        long[] longArray2 = new long[] { 'a' };
        long[] longArray4 = new long[] { 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("random", longArray2, longArray4);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 1 };
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray6, byteArray13);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) 100L, (float) (byte) -1);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        char[] charArray0 = new char[] {};
        char[] charArray4 = new char[] { '#', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray4);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 2, (double) '4', (double) 'a');
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 0L, (double) '4');
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        long[] longArray6 = new long[] { (short) 10, 'a', '#', 1L, (byte) -1, (byte) -1 };
        long[] longArray13 = new long[] { (byte) 0, (byte) 10, (-1), (-1L), 3, 1L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray13);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        double[] doubleArray1 = null;
        double[] doubleArray6 = new double[] { 100, 4, 10, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray1, doubleArray6, 0.0d);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray7, shortArray8);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray11);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray18);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray21);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray26, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray26);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray31, shortArray32);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray35);
        org.junit.Assert.assertArrayEquals("random", shortArray21, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray11);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger43 = synonymsAnalysisTest42.getlogger();
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = null;
        synonymsAnalysisTest42.setanalysisService(analysisService44);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) shortArray11, (java.lang.Object) analysisService44);
        short[] shortArray47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray11, shortArray47);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.resetCheckIndexStatus();
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray20, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray32, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        int[] intArray1 = null;
        int[] intArray3 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray1, intArray3);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.awaitsfix", false);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        int[] intArray3 = new int[] { 3, (short) 0 };
        int[] intArray10 = new int[] { (short) -1, (short) 0, (byte) 0, (byte) 0, '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray3, intArray10);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0.0d, (double) 100L, (double) (byte) 1);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray19, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray32, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray27);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest40, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger43 = synonymsAnalysisTest40.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = null;
        synonymsAnalysisTest40.setanalysisService(analysisService44);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        synonymsAnalysisTest40.assertDocsSkippingEquals("<unknown>", indexReader47, (-1), postingsEnum49, postingsEnum50, true);
        org.junit.rules.RuleChain ruleChain53 = synonymsAnalysisTest40.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule54 = synonymsAnalysisTest40.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService55 = synonymsAnalysisTest40.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) boolean39, (java.lang.Object) synonymsAnalysisTest40);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        int[] intArray4 = new int[] { (-1), ' ', 5, (byte) 10 };
        int[] intArray7 = new int[] { '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest1.getlogger();
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) (short) 0);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray8, (float) 10);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) eSLogger2, (java.lang.Object) floatArray3);
        java.lang.Object obj14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.slow", obj14);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[][] strArray31 = new java.lang.String[][] { strArray6, strArray12, strArray18, strArray24, strArray30 };
        java.util.List<java.lang.String[]> strArrayList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf(5, strArray31);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = synonymsAnalysisTest33.getanalysisService();
        synonymsAnalysisTest33.overrideTestDefaultQueryCache();
        synonymsAnalysisTest33.overrideTestDefaultQueryCache();
        synonymsAnalysisTest33.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger38 = synonymsAnalysisTest33.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) strArray31, (java.lang.Object) synonymsAnalysisTest33);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest2.assertDocsEnumEquals("tests.badapples", postingsEnum4, postingsEnum5, true);
        synonymsAnalysisTest2.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest2.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest11.assertDocsSkippingEquals("hi!", indexReader14, 0, postingsEnum16, postingsEnum17, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest11.analysisService;
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest11.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest23.setUp();
        synonymsAnalysisTest23.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest23, (java.lang.Object) (short) 1);
        synonymsAnalysisTest23.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest29.setUp();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest29.assertDocsSkippingEquals("hi!", indexReader32, 0, postingsEnum34, postingsEnum35, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest29.analysisService;
        org.junit.rules.RuleChain ruleChain39 = synonymsAnalysisTest29.failureAndSuccessEvents;
        synonymsAnalysisTest23.failureAndSuccessEvents = ruleChain39;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest41.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger43 = synonymsAnalysisTest41.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest44 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest44.setUp();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        synonymsAnalysisTest44.assertDocsSkippingEquals("hi!", indexReader47, 0, postingsEnum49, postingsEnum50, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService53 = synonymsAnalysisTest44.analysisService;
        org.junit.rules.RuleChain ruleChain54 = synonymsAnalysisTest44.failureAndSuccessEvents;
        synonymsAnalysisTest41.failureAndSuccessEvents = ruleChain54;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest56 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest56.setUp();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        synonymsAnalysisTest56.assertDocsSkippingEquals("hi!", indexReader59, 0, postingsEnum61, postingsEnum62, true);
        org.junit.rules.TestRule testRule65 = synonymsAnalysisTest56.ruleChain;
        org.junit.rules.TestRule[] testRuleArray66 = new org.junit.rules.TestRule[] { testRule10, ruleChain21, ruleChain39, ruleChain54, testRule65 };
        java.util.List<org.junit.rules.TestRule> testRuleList67 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, testRuleArray66);
        java.util.Set<org.junit.rules.TestRule> testRuleSet68 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) testRuleSet68);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) (byte) 1, (double) (-1));
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        char[] charArray3 = new char[] { ' ', '4' };
        char[] charArray6 = new char[] { 'a', ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("random", charArray3, charArray6);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        double[] doubleArray5 = new double[] { 1, 10.0d, (short) 10, 10L };
        double[] doubleArray8 = new double[] { 0.0f, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray5, doubleArray8, (double) (byte) -1);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest1.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest7.setUp();
        synonymsAnalysisTest7.ensureCheckIndexPassed();
        synonymsAnalysisTest7.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest7.analysisService;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest7.assertFieldsEquals("tests.weekly", indexReader13, fields14, fields15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        synonymsAnalysisTest7.assertTermsEquals("europarl.lines.txt.gz", indexReader19, terms20, terms21, false);
        synonymsAnalysisTest7.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) analysisService6, (java.lang.Object) synonymsAnalysisTest7);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        double[] doubleArray5 = new double[] { 10, (-1.0f), (-1.0d), 5, 10L };
        double[] doubleArray10 = new double[] { 1.0f, (-1), (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray10, (double) '#');
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        double[] doubleArray2 = new double[] { (-1.0f), (-1L) };
        double[] doubleArray7 = new double[] { (-1.0f), (byte) 0, (-1L), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray7, (double) (byte) 10);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        long[] longArray5 = new long[] { (byte) 100, (-1L), 5, 1L, (byte) 0 };
        long[] longArray6 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (byte) 1, (double) (short) 0);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray2 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) '4');
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        synonymsAnalysisTest0.assertPathHasBeenCleared("<unknown>");
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 1 };
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray5, byteArray8);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest6.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest6.assertDocsSkippingEquals("hi!", indexReader9, 0, postingsEnum11, postingsEnum12, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest6.analysisService;
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest6.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (short) 10, postingsEnum20, postingsEnum21);
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest6.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain23;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService26);
        java.lang.Object obj28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) analysisService26, obj28);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        int[] intArray5 = new int[] { '4', (short) 0, 100, 10, 4 };
        int[] intArray11 = new int[] { (short) 10, (byte) 1, (byte) 100, (byte) 100, 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray11);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        int[] intArray5 = new int[] { (short) -1, 3, 10, (short) 10, '#' };
        int[] intArray11 = new int[] { (byte) 0, '4', ' ', (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray11);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 0, 0.0d);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 10);
        synonymsAnalysisTest0.assertPathHasBeenCleared("enwiki.random.lines.txt");
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("enwiki.random.lines.txt", 0, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        long[] longArray4 = new long[] { (byte) 10, 100L, (byte) 1 };
        long[] longArray5 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray4, longArray5);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest8.getanalysisService();
        synonymsAnalysisTest8.overrideTestDefaultQueryCache();
        synonymsAnalysisTest8.tearDown();
        java.lang.Object obj12 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest8, obj12);
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest8.ruleChain;
        synonymsAnalysisTest8.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) '4');
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        int[] intArray4 = new int[] { 'a', (byte) 1, (byte) 1, (byte) 10 };
        int[] intArray8 = new int[] { (byte) 100, 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray8);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.setUp();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest6.assertDocsEnumEquals("tests.badapples", postingsEnum8, postingsEnum9, true);
        synonymsAnalysisTest6.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest6.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest6.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule5, (java.lang.Object) eSLogger14);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (-1.0f), (double) (short) 0);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader17, terms18, terms19, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest0.analysisService;
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray24, shortArray25);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray28);
        java.lang.Class<?> wildcardClass32 = shortArray28.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) analysisService22, (java.lang.Object) wildcardClass32);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        double[] doubleArray1 = null;
        double[] doubleArray8 = new double[] { 10.0f, 1.0d, (short) 1, 10L, '#', 10.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray1, doubleArray8, (double) (byte) 1);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 10, 100.0d, (double) (-1.0f));
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray7);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray12);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray18);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray21);
        org.junit.Assert.assertArrayEquals("random", shortArray7, shortArray21);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray27, shortArray28);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray31);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray36);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray41, shortArray42);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray45, shortArray46);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray49, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray41);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray21, shortArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) '#', 100.0d, (double) 'a');
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray4, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray8);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray13);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray18, shortArray19);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray22);
        org.junit.Assert.assertArrayEquals("random", shortArray8, shortArray22);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray28, shortArray29);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray32);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray37);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray42, shortArray43);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray46, shortArray47);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray42);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray22, shortArray37);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray58, shortArray59);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray62, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray62);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray67, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray67);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray72, shortArray73);
        short[] shortArray76 = new short[] {};
        short[] shortArray77 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray76, shortArray77);
        short[] shortArray80 = new short[] {};
        short[] shortArray81 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray80, shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray77, shortArray80);
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray80);
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray72);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray22, shortArray72);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest87 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest87, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger90 = synonymsAnalysisTest87.logger;
        synonymsAnalysisTest87.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray72, (java.lang.Object) synonymsAnalysisTest87);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        long[] longArray3 = new long[] { (-1), (byte) 100, 1 };
        long[] longArray5 = new long[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        double[] doubleArray5 = new double[] { 10L, (-1.0d), 10.0f, 0.0d, '#' };
        double[] doubleArray10 = new double[] { (-1), (-1L), (short) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray10, (double) 1);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (-1.0f));
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest11.assertDocsSkippingEquals("hi!", indexReader14, 0, postingsEnum16, postingsEnum17, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = null;
        synonymsAnalysisTest11.setanalysisService(analysisService20);
        org.elasticsearch.common.logging.ESLogger eSLogger22 = synonymsAnalysisTest11.logger;
        java.lang.Object obj23 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest11, obj23);
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest11.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest26.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest26.logger;
        synonymsAnalysisTest26.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest1, synonymsAnalysisTest11, synonymsAnalysisTest26 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet31 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTestSet31);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (short) 100, (long) 2);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        double[] doubleArray2 = new double[] { (short) 0 };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray2, doubleArray3, (double) 'a');
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest4.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger6 = synonymsAnalysisTest4.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest7.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest7.assertDocsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest7.analysisService;
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest7.failureAndSuccessEvents;
        synonymsAnalysisTest4.failureAndSuccessEvents = ruleChain17;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest19.assertDocsSkippingEquals("hi!", indexReader22, 0, postingsEnum24, postingsEnum25, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest19.analysisService;
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest19.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest19.assertPositionsSkippingEquals("tests.badapples", indexReader31, (int) (short) 10, postingsEnum33, postingsEnum34);
        org.junit.rules.RuleChain ruleChain36 = synonymsAnalysisTest19.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest4, (java.lang.Object) synonymsAnalysisTest19);
        synonymsAnalysisTest4.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest4);
        org.junit.rules.RuleChain ruleChain40 = synonymsAnalysisTest4.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        synonymsAnalysisTest41.assertFieldsEquals("tests.failfast", indexReader43, fields44, fields45, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService48 = null;
        synonymsAnalysisTest41.setanalysisService(analysisService48);
        org.elasticsearch.index.analysis.AnalysisService analysisService50 = synonymsAnalysisTest41.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) ruleChain40, (java.lang.Object) synonymsAnalysisTest41);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        org.junit.rules.TestRule testRule12 = synonymsAnalysisTest1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule12;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest14.getanalysisService();
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        synonymsAnalysisTest14.setUp();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        synonymsAnalysisTest14.assertFieldsEquals("", indexReader20, fields21, fields22, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = null;
        synonymsAnalysisTest14.setanalysisService(analysisService25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) testRule12, (java.lang.Object) synonymsAnalysisTest14);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        int[] intArray0 = null;
        int[] intArray3 = new int[] { (short) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray3);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        java.lang.Object[] objArray1 = null;
        short[] shortArray7 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray11 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray15 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[][] shortArray16 = new short[][] { shortArray7, shortArray11, shortArray15 };
        java.util.List<short[]> shortArrayList17 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, shortArray16);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray24, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray36, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray49, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray61, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) shortArrayList17, (java.lang.Object) executorServiceArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", objArray1, (java.lang.Object[]) executorServiceArray49);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest1.getlogger();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.maxfailures", indexReader4, fields5, fields6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) analysisService9, (java.lang.Object) 1L);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) (short) 10, (float) 0, (float) (byte) 0);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        long[] longArray4 = new long[] { 100L, 0L, (byte) 1, 2 };
        long[] longArray10 = new long[] { (byte) 100, (short) 0, 'a', 100L, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray10);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, true);
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        double[] doubleArray2 = new double[] { (byte) 1 };
        double[] doubleArray5 = new double[] { ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray2, doubleArray5, (double) (byte) 0);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.failfast");
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest7.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = null;
        synonymsAnalysisTest7.analysisService = analysisService9;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) analysisService9);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.badapples", indexReader13, (int) (short) 10, postingsEnum15, postingsEnum16);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest18.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest18.assertDocsSkippingEquals("hi!", indexReader21, 0, postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest18.analysisService;
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain28;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest30.assertDocsEnumEquals("tests.badapples", postingsEnum32, postingsEnum33, true);
        synonymsAnalysisTest30.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule38 = synonymsAnalysisTest30.ruleChain;
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        synonymsAnalysisTest30.assertPositionsSkippingEquals("tests.maxfailures", indexReader40, (int) '4', postingsEnum42, postingsEnum43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) ruleChain28, (java.lang.Object) postingsEnum43);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) '4', (long) 5);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        char[] charArray3 = new char[] { ' ', '#', ' ' };
        char[] charArray4 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        long[] longArray3 = new long[] { (short) 10, (-1), '4' };
        long[] longArray4 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, 10L);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", (long) 10, (long) (short) 10);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray31 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[][] strArray32 = new java.lang.String[][] { strArray7, strArray13, strArray19, strArray25, strArray31 };
        java.util.List<java.lang.String[]> strArrayList33 = org.elasticsearch.test.ESTestCase.randomSubsetOf(5, strArray32);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest35.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger37 = synonymsAnalysisTest35.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest38.setUp();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        synonymsAnalysisTest38.assertDocsSkippingEquals("hi!", indexReader41, 0, postingsEnum43, postingsEnum44, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService47 = synonymsAnalysisTest38.analysisService;
        org.junit.rules.RuleChain ruleChain48 = synonymsAnalysisTest38.failureAndSuccessEvents;
        synonymsAnalysisTest35.failureAndSuccessEvents = ruleChain48;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest50 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest50.setUp();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        synonymsAnalysisTest50.assertDocsSkippingEquals("hi!", indexReader53, 0, postingsEnum55, postingsEnum56, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService59 = synonymsAnalysisTest50.analysisService;
        org.junit.rules.RuleChain ruleChain60 = synonymsAnalysisTest50.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        synonymsAnalysisTest50.assertPositionsSkippingEquals("tests.badapples", indexReader62, (int) (short) 10, postingsEnum64, postingsEnum65);
        org.junit.rules.RuleChain ruleChain67 = synonymsAnalysisTest50.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest35, (java.lang.Object) synonymsAnalysisTest50);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) 5, (java.lang.Object) synonymsAnalysisTest35);
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest35.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum71, postingsEnum72);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1.0f, (double) 10L, (double) 100L);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (double) 10.0f, (double) 10.0f, (double) (byte) 0);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader17, terms18, terms19, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader25, 3, postingsEnum27, postingsEnum28);
        org.elasticsearch.common.logging.ESLogger eSLogger30 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling32 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray34 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling31, throttling32, throttling33 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet35 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) throttlingArray34);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1), (double) (-1), (double) 0);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) 2);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        int[] intArray1 = new int[] { 100 };
        int[] intArray5 = new int[] { 100, 3, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray5);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray4, byteArray9);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        char[] charArray1 = new char[] { 'a' };
        char[] charArray2 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (double) 1.0f, (double) (byte) 1, (double) 0L);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) -1, (double) 0L, (double) '#');
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        int[] intArray1 = null;
        int[] intArray3 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray1, intArray3);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        long[] longArray3 = new long[] { 5, 100, (short) 1 };
        long[] longArray7 = new long[] { '#', 1, 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray7);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule8 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.maxfailures", indexReader10, (int) '4', postingsEnum12, postingsEnum13);
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.nightly", (int) '#', numericDocValues17, numericDocValues18);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray7);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (long) 100, (long) (byte) 100);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = synonymsAnalysisTest2.getanalysisService();
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        synonymsAnalysisTest2.setUp();
        org.junit.Assert.assertNotEquals(obj1, (java.lang.Object) synonymsAnalysisTest2);
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest2.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest2.logger;
        java.lang.Class<?> wildcardClass10 = eSLogger9.getClass();
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray17, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) eSLogger9, (java.lang.Object) executorServiceArray12);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.badapples");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        long[] longArray2 = new long[] { (short) 100, 3 };
        long[] longArray5 = new long[] { 4, 10L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray5);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
        double[] doubleArray3 = new double[] { ' ', (byte) 10, (short) 0 };
        double[] doubleArray9 = new double[] { (short) -1, 0.0f, 0.0f, 'a', 1.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray9, (double) 2);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        short[] shortArray5 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray10 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray15 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray20 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray25 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[][] shortArray26 = new short[][] { shortArray5, shortArray10, shortArray15, shortArray20, shortArray25 };
        short[][][] shortArray27 = new short[][][] { shortArray26 };
        java.util.Set<short[][]> shortArraySet28 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray27);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray35, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray35);
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) shortArray27, (java.lang.Object[]) executorServiceArray35);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray2, byteArray7);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) (short) 100, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService14);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("hi!", 10, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("tests.badapples", "tests.slow", "");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) (byte) -1);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader12, fields13, fields14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, 0, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest23.assertDocsEnumEquals("tests.badapples", postingsEnum25, postingsEnum26, true);
        synonymsAnalysisTest23.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger30 = synonymsAnalysisTest23.getlogger();
        java.lang.String str31 = synonymsAnalysisTest23.getTestName();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) str31);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("<unknown>", indexReader34, 5, postingsEnum36, postingsEnum37, false);
        org.elasticsearch.common.logging.ESLogger eSLogger40 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService41);
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum44, postingsEnum45);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule8 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.maxfailures", indexReader10, (int) '4', postingsEnum12, postingsEnum13);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest16.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest16.assertDocsSkippingEquals("hi!", indexReader19, 0, postingsEnum21, postingsEnum22, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest16.analysisService;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        synonymsAnalysisTest16.assertFieldsEquals("random", indexReader27, fields28, fields29, true);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        synonymsAnalysisTest16.assertTermsEquals("tests.weekly", indexReader33, terms34, terms35, false);
        synonymsAnalysisTest16.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest16.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest41.setUp();
        synonymsAnalysisTest41.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) analysisService40, (java.lang.Object) synonymsAnalysisTest41);
        org.elasticsearch.common.logging.ESLogger eSLogger45 = synonymsAnalysisTest41.getlogger();
        synonymsAnalysisTest41.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        synonymsAnalysisTest41.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader48, 5, postingsEnum50, postingsEnum51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) indexReader48);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        int[] intArray3 = new int[] { (short) -1, 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", intArray3, intArray4);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) 10, (long) 'a');
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        short[][] shortArray8 = new short[][] { shortArray2, shortArray3, shortArray4, shortArray5, shortArray6, shortArray7 };
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        short[][] shortArray15 = new short[][] { shortArray9, shortArray10, shortArray11, shortArray12, shortArray13, shortArray14 };
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        short[][] shortArray22 = new short[][] { shortArray16, shortArray17, shortArray18, shortArray19, shortArray20, shortArray21 };
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        short[][] shortArray29 = new short[][] { shortArray23, shortArray24, shortArray25, shortArray26, shortArray27, shortArray28 };
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        short[][] shortArray36 = new short[][] { shortArray30, shortArray31, shortArray32, shortArray33, shortArray34, shortArray35 };
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        short[][] shortArray43 = new short[][] { shortArray37, shortArray38, shortArray39, shortArray40, shortArray41, shortArray42 };
        short[][][] shortArray44 = new short[][][] { shortArray8, shortArray15, shortArray22, shortArray29, shortArray36, shortArray43 };
        java.util.List<short[][]> shortArrayList45 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, shortArray44);
        java.lang.Object[] objArray46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) shortArray44, objArray46);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray12, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray12);
        java.lang.Object obj18 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray7, obj18);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray31, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray43, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray62, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray62);
        java.lang.Object obj68 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray57, obj68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray57);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) executorServiceArray57);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        double[] doubleArray6 = new double[] { 1.0d, 100L, (short) 1, 0L, (byte) 100, '#' };
        double[] doubleArray12 = new double[] { 0L, 'a', (short) 100, 10.0f, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray12, 1.0d);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (-1), (double) 100L);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest2.logger;
        synonymsAnalysisTest2.tearDown();
        synonymsAnalysisTest2.setIndexWriterMaxDocs(0);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest11.assertDocsSkippingEquals("hi!", indexReader14, 0, postingsEnum16, postingsEnum17, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = null;
        synonymsAnalysisTest11.setanalysisService(analysisService20);
        org.elasticsearch.common.logging.ESLogger eSLogger22 = synonymsAnalysisTest11.logger;
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) executorServiceArray9, (java.lang.Object) synonymsAnalysisTest11);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest24.assertDocsEnumEquals("tests.badapples", postingsEnum26, postingsEnum27, true);
        synonymsAnalysisTest24.ensureAllSearchContextsReleased();
        synonymsAnalysisTest24.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest34.setUp();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest34.assertDocsSkippingEquals("hi!", indexReader37, 0, postingsEnum39, postingsEnum40, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = null;
        synonymsAnalysisTest34.setanalysisService(analysisService43);
        org.elasticsearch.common.logging.ESLogger eSLogger45 = synonymsAnalysisTest34.logger;
        java.lang.Object obj46 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest34, obj46);
        org.junit.rules.TestRule testRule48 = synonymsAnalysisTest34.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest49.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger51 = synonymsAnalysisTest49.logger;
        synonymsAnalysisTest49.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray53 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest24, synonymsAnalysisTest34, synonymsAnalysisTest49 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet54 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray53);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet55 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray53);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet56 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray53);
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.monster", (java.lang.Object) luceneTestCaseSet56);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) "tests.monster");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest60 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest60.setUp();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        synonymsAnalysisTest60.assertDocsSkippingEquals("hi!", indexReader63, 0, postingsEnum65, postingsEnum66, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService69 = null;
        synonymsAnalysisTest60.setanalysisService(analysisService69);
        org.elasticsearch.common.logging.ESLogger eSLogger71 = synonymsAnalysisTest60.logger;
        java.lang.Object obj72 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest60, obj72);
        org.elasticsearch.index.analysis.AnalysisService analysisService74 = synonymsAnalysisTest60.analysisService;
        synonymsAnalysisTest60.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) "tests.monster", (java.lang.Object) synonymsAnalysisTest60);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 100L);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest0.logger;
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList20 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray19);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList28 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray27);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList36 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray35);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList44 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray43);
        java.util.Collection[] collectionArray46 = new java.util.Collection[4];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray47 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray46;
        charSequenceCollectionArray47[0] = charSequenceList20;
        charSequenceCollectionArray47[1] = charSequenceList28;
        charSequenceCollectionArray47[2] = charSequenceList36;
        charSequenceCollectionArray47[3] = charSequenceList44;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet56 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceCollectionArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) charSequenceCollectionArray47);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        double[] doubleArray7 = new double[] { 10, (short) -1, (byte) -1, (short) 1, 0.0d, (byte) 100 };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray7, doubleArray8, (double) (short) 10);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.monster", true);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) ' ', (double) (-1));
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        int[] intArray2 = new int[] { (byte) 0, 5 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        double[] doubleArray4 = new double[] { 3, 0.0f, 10, (byte) -1 };
        double[] doubleArray10 = new double[] { 10.0d, (byte) 10, 1.0f, (short) 100, 100.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray10, 100.0d);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        double[] doubleArray4 = new double[] { 2, (short) 10, 0L, 100L };
        double[] doubleArray10 = new double[] { '4', (short) 100, '4', (short) 10, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray10, (double) 100);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (byte) 0, (long) (byte) 100);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray10);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest7, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger10 = synonymsAnalysisTest7.logger;
        synonymsAnalysisTest7.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = null;
        synonymsAnalysisTest7.setanalysisService(analysisService12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        synonymsAnalysisTest7.assertFieldsEquals("hi!", indexReader15, fields16, fields17, false);
        org.elasticsearch.common.logging.ESLogger eSLogger20 = synonymsAnalysisTest7.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) eSLogger20);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.setUp();
        org.junit.Assert.assertNotEquals(obj0, (java.lang.Object) synonymsAnalysisTest1);
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest1.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest10.assertDocsEnumEquals("tests.badapples", postingsEnum12, postingsEnum13, true);
        synonymsAnalysisTest10.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest10.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest10.assertPositionsSkippingEquals("tests.maxfailures", indexReader20, (int) '4', postingsEnum22, postingsEnum23);
        synonymsAnalysisTest10.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        synonymsAnalysisTest10.assertTermsEquals("enwiki.random.lines.txt", indexReader27, terms28, terms29, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = synonymsAnalysisTest10.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) analysisService32);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '#', (float) (short) 0, 0.0f);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray2, 1.0d);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 10.0f, 100.0d, (double) ' ');
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray8 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray7, byteArray8);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("<unknown>", indexReader8, (-1), postingsEnum10, postingsEnum11, true);
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest16.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest16.assertDocsSkippingEquals("hi!", indexReader19, 0, postingsEnum21, postingsEnum22, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest16.analysisService;
        synonymsAnalysisTest16.setUp();
        org.junit.rules.TestRule testRule27 = synonymsAnalysisTest16.ruleChain;
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain28;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest30.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger32 = synonymsAnalysisTest30.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest33.setUp();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        synonymsAnalysisTest33.assertDocsSkippingEquals("hi!", indexReader36, 0, postingsEnum38, postingsEnum39, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService42 = synonymsAnalysisTest33.analysisService;
        org.junit.rules.RuleChain ruleChain43 = synonymsAnalysisTest33.failureAndSuccessEvents;
        synonymsAnalysisTest30.failureAndSuccessEvents = ruleChain43;
        org.junit.rules.TestRule[] testRuleArray45 = new org.junit.rules.TestRule[] { testRule15, ruleChain28, ruleChain43 };
        org.junit.rules.TestRule[][] testRuleArray46 = new org.junit.rules.TestRule[][] { testRuleArray45 };
        java.util.Set<org.junit.rules.TestRule[]> testRuleArraySet47 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray46);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest51 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest51.setUp();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        synonymsAnalysisTest51.assertDocsSkippingEquals("hi!", indexReader54, 0, postingsEnum56, postingsEnum57, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService60 = null;
        synonymsAnalysisTest51.setanalysisService(analysisService60);
        org.elasticsearch.common.logging.ESLogger eSLogger62 = synonymsAnalysisTest51.logger;
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) executorServiceArray49, (java.lang.Object) synonymsAnalysisTest51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) testRuleArray46, (java.lang.Object[]) executorServiceArray49);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader17, terms18, terms19, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader25, 3, postingsEnum27, postingsEnum28);
        org.elasticsearch.common.logging.ESLogger eSLogger30 = synonymsAnalysisTest0.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) 1 };
        byte[] byteArray7 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray6, byteArray7);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) (short) 0);
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray6, (float) 10);
        float[] floatArray11 = new float[] {};
        float[] floatArray12 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray12, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray11, (float) 5);
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray18, (float) (short) 0);
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray22, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray22, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray6, floatArray17, 0.0f);
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray30, (float) (short) 1);
        float[] floatArray35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray35, (float) (byte) 100);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest2.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest7.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest7.assertDocsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest7.analysisService;
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest7.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest7.assertPositionsSkippingEquals("tests.badapples", indexReader19, (int) (short) 10, postingsEnum21, postingsEnum22);
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest7.failureAndSuccessEvents;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain24;
        java.lang.Class<?> wildcardClass26 = ruleChain24.getClass();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) wildcardClass26);
        java.lang.Class[] classArray29 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        wildcardClassArray30[0] = wildcardClass26;
        java.util.List<java.lang.Class<?>> wildcardClassList33 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, wildcardClassArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest37.setUp();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        synonymsAnalysisTest37.assertDocsSkippingEquals("hi!", indexReader40, 0, postingsEnum42, postingsEnum43, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = null;
        synonymsAnalysisTest37.setanalysisService(analysisService46);
        org.elasticsearch.common.logging.ESLogger eSLogger48 = synonymsAnalysisTest37.logger;
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) executorServiceArray35, (java.lang.Object) synonymsAnalysisTest37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) wildcardClassArray30, (java.lang.Object[]) executorServiceArray35);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
        long[] longArray6 = new long[] { (short) 1, (short) -1, (short) 100, 3, (short) -1 };
        long[] longArray8 = new long[] { 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray6, longArray8);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        synonymsAnalysisTest2.ensureCleanedUp();
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest7.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest7.assertDocsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = synonymsAnalysisTest7.ruleChain;
        synonymsAnalysisTest7.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest7.setUp();
        synonymsAnalysisTest7.ensureCleanedUp();
        synonymsAnalysisTest7.setUp();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest22.setUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest22.assertDocsSkippingEquals("hi!", indexReader25, 0, postingsEnum27, postingsEnum28, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = synonymsAnalysisTest22.analysisService;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        synonymsAnalysisTest22.assertFieldsEquals("random", indexReader33, fields34, fields35, true);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        synonymsAnalysisTest22.assertTermsEquals("tests.weekly", indexReader39, terms40, terms41, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = null;
        synonymsAnalysisTest22.setanalysisService(analysisService44);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest46.setUp();
        synonymsAnalysisTest46.ensureCheckIndexPassed();
        synonymsAnalysisTest46.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService50 = synonymsAnalysisTest46.analysisService;
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        synonymsAnalysisTest46.assertFieldsEquals("tests.weekly", indexReader52, fields53, fields54, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService57 = synonymsAnalysisTest46.analysisService;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest22, (java.lang.Object) analysisService57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) "", (java.lang.Object) analysisService57);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 10, (double) '#');
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) (byte) 1);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        long[] longArray3 = new long[] { 10, (byte) 10, 100 };
        long[] longArray7 = new long[] { ' ', (byte) 10, 1L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray7);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        int[] intArray1 = new int[] { 3 };
        int[] intArray8 = new int[] { (byte) 100, (short) 1, (short) -1, '#', (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray8);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
        char[] charArray2 = new char[] { '4', ' ' };
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        org.junit.Assert.assertArrayEquals(charArray4, charArray8);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals("", charArray4, charArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray4);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray8 = new char[] { '4', '4', ' ', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray8);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.maxfailures", indexReader17, 0, postingsEnum19, postingsEnum20);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest0.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.monster");
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        org.elasticsearch.common.logging.ESLogger eSLogger10 = synonymsAnalysisTest1.logger;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("hi!", indexReader12, fields13, fields14, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) true);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        int[] intArray4 = new int[] { '#', 'a', '4', (-1) };
        int[] intArray6 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray6);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        short[] shortArray1 = new short[] { (byte) -1 };
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray4);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        int[] intArray1 = new int[] {};
        int[] intArray4 = new int[] { 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray1, intArray4);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (byte) -1, (long) (short) 0);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray8 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray7, byteArray8);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("tests.weekly", "tests.maxfailures", "tests.slow");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) queryCachingPolicy5);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest1.analysisService = analysisService4;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest6.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest6.assertDocsSkippingEquals("hi!", indexReader9, 0, postingsEnum11, postingsEnum12, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest6.analysisService;
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest6.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (short) 10, postingsEnum20, postingsEnum21);
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest6.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest6.getanalysisService();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) analysisService25);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) "");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray6, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray14, (java.lang.Object) (-1.0f));
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray14);
        java.lang.Object[] objArray21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, objArray21);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        long[] longArray4 = new long[] { 0, (byte) -1, ' ' };
        long[] longArray10 = new long[] { 10L, (short) 1, 100, 4, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray4, longArray10);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray3, byteArray10);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.maxfailures");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 100, (double) (byte) 100, (double) (-1));
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0f, (float) 3, (float) '#');
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray7, byteArray13);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest1.analysisService = analysisService14;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest18.getanalysisService();
        synonymsAnalysisTest18.overrideTestDefaultQueryCache();
        synonymsAnalysisTest18.overrideTestDefaultQueryCache();
        synonymsAnalysisTest18.setUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        synonymsAnalysisTest18.assertFieldsEquals("", indexReader24, fields25, fields26, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = null;
        synonymsAnalysisTest18.setanalysisService(analysisService29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest18);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 100, (float) (byte) -1, 10.0f);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.tearDown();
        java.lang.Object obj5 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, obj5);
        org.junit.rules.TestRule testRule7 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest1.analysisService = analysisService8;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = null;
        synonymsAnalysisTest1.analysisService = analysisService11;
        java.lang.Object obj14 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest15.setUp();
        synonymsAnalysisTest15.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest15, (java.lang.Object) (short) 1);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", obj14, (java.lang.Object) synonymsAnalysisTest15);
        synonymsAnalysisTest15.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest15);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 'a');
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, (long) 4);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        int[] intArray5 = new int[] { 100, (byte) 1, (short) 0, 4, 5 };
        int[] intArray12 = new int[] { '4', '#', 2, 3, '#', 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray12);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', 100L);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest0.getlogger();
        org.junit.rules.RuleChain ruleChain8 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest9.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest9.assertDocsEnumEquals("tests.nightly", postingsEnum12, postingsEnum13, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest9.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest9.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) eSLogger17);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) 100L);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray5);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest0.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (byte) -1, (long) 0);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService8);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.awaitsfix", indexReader11, terms12, terms13, true);
        java.lang.Object obj16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.awaitsfix", obj16);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (-1L));
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0f, (float) 'a', (float) 10L);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '#', 0.0f, 10.0f);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray10, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray10);
        java.lang.Object obj16 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray5, obj16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest19.assertDocsSkippingEquals("hi!", indexReader22, 0, postingsEnum24, postingsEnum25, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest19.analysisService;
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest19.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest19.assertPositionsSkippingEquals("tests.badapples", indexReader31, (int) (short) 10, postingsEnum33, postingsEnum34);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest36.setUp();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        synonymsAnalysisTest36.assertDocsSkippingEquals("hi!", indexReader39, 0, postingsEnum41, postingsEnum42, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService45 = synonymsAnalysisTest36.analysisService;
        org.junit.rules.RuleChain ruleChain46 = synonymsAnalysisTest36.failureAndSuccessEvents;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain46;
        synonymsAnalysisTest19.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray1, (java.lang.Object) synonymsAnalysisTest19);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) -1 };
        byte[] byteArray3 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        int[] intArray6 = new int[] { (short) 1, ' ', 4, 100, 5, (short) 100 };
        int[] intArray9 = new int[] { 3, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray9);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 1 };
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray7, byteArray14);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        double[] doubleArray7 = new double[] { (short) 1, 5, 1.0f, 0L, (byte) 1, 100.0f };
        double[] doubleArray10 = new double[] { 10, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray10, (double) (-1L));
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        int[] intArray6 = new int[] { 10, ' ', 1, 100, 5, 2 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService8);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum11, postingsEnum12, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.awaitsfix", (java.lang.Object) 1.0d);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader12, fields13, fields14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.weekly", indexReader18, terms19, terms20, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService23);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader26, 3, postingsEnum28, postingsEnum29);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest31.setUp();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        synonymsAnalysisTest31.assertDocsSkippingEquals("hi!", indexReader34, 0, postingsEnum36, postingsEnum37, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest31.analysisService;
        synonymsAnalysisTest31.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService42 = synonymsAnalysisTest31.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = null;
        synonymsAnalysisTest31.analysisService = analysisService43;
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        synonymsAnalysisTest31.assertDocsSkippingEquals("<unknown>", indexReader46, (int) (byte) 10, postingsEnum48, postingsEnum49, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) postingsEnum28, (java.lang.Object) indexReader46);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        long[] longArray3 = new long[] { (byte) 10, (byte) 1 };
        long[] longArray7 = new long[] { (byte) 100, (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray3, longArray7);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0, (double) 0L, (double) (byte) -1);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 10, (byte) -1 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray4, byteArray9);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', 0.0d);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        int[] intArray0 = null;
        int[] intArray2 = new int[] { 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray2);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        int[] intArray5 = new int[] { (byte) -1, (byte) 10, 1, (byte) 0, (short) 1 };
        int[] intArray12 = new int[] { (short) 0, 100, (byte) -1, '4', (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray12);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        double[] doubleArray4 = new double[] { 10, 100L, 0.0d };
        double[] doubleArray6 = new double[] { 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray4, doubleArray6, (double) 0);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (byte) -1, (double) 10.0f);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray1, shortArray2);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray10, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray10);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray15, shortArray16);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray19, shortArray20);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray15);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray30, shortArray31);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray34, shortArray35);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray38);
        short[] shortArray46 = new short[] { (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray46);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader12, fields13, fields14, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService17);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
        java.lang.Object obj0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull(obj0);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        byte[] byteArray1 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray1, byteArray5);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        java.lang.Object obj2 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest3.setUp();
        synonymsAnalysisTest3.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest3, (java.lang.Object) (short) 1);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", obj2, (java.lang.Object) synonymsAnalysisTest3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.weekly", obj2);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader12, fields13, fields14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.weekly", indexReader18, terms19, terms20, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) indexReader18);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest1.getlogger();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.maxfailures", indexReader4, fields5, fields6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.nightly", indexReader10, terms11, terms12, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest1.getanalysisService();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) (short) 1);
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest1.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertPathHasBeenCleared("");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 4, (-1L));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest3.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger5 = synonymsAnalysisTest3.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest6.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest6.assertDocsSkippingEquals("hi!", indexReader9, 0, postingsEnum11, postingsEnum12, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest6.analysisService;
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest6.failureAndSuccessEvents;
        synonymsAnalysisTest3.failureAndSuccessEvents = ruleChain16;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest18.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest18.assertDocsSkippingEquals("hi!", indexReader21, 0, postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest18.analysisService;
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest18.assertPositionsSkippingEquals("tests.badapples", indexReader30, (int) (short) 10, postingsEnum32, postingsEnum33);
        org.junit.rules.RuleChain ruleChain35 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest3, (java.lang.Object) synonymsAnalysisTest18);
        synonymsAnalysisTest3.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest3);
        org.junit.rules.RuleChain ruleChain39 = synonymsAnalysisTest3.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule40 = synonymsAnalysisTest3.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues43 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest3.assertDocValuesEquals("tests.failfast", 2, numericDocValues43, numericDocValues44);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        double[] doubleArray2 = new double[] { '4' };
        double[] doubleArray6 = new double[] { 1.0d, (-1L), 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray2, doubleArray6, 100.0d);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("<unknown>", "tests.monster", "tests.awaitsfix");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.monster", false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("random");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray4 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray3, byteArray4);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.failfast", false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        int[] intArray4 = new int[] { (byte) -1, (short) 100, (byte) -1, (-1) };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray3, (java.lang.Object) (-1.0f));
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray10, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray23, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray36, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray48, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray36);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray36);
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest62 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest62.setUp();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        synonymsAnalysisTest62.assertDocsSkippingEquals("hi!", indexReader65, 0, postingsEnum67, postingsEnum68, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService71 = null;
        synonymsAnalysisTest62.setanalysisService(analysisService71);
        org.elasticsearch.common.logging.ESLogger eSLogger73 = synonymsAnalysisTest62.logger;
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) executorServiceArray60, (java.lang.Object) synonymsAnalysisTest62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray60);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull("", (java.lang.Object) synonymsAnalysisTest2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest8.logger;
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest8.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) "", (java.lang.Object) synonymsAnalysisTest8);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) 5, (long) (short) 1);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        float[] floatArray5 = new float[] { 4, 10.0f, (-1L), (-1) };
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) (short) 0);
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray11, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray11, (float) 10);
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray17, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray16, (float) 5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray5, floatArray16, (float) (short) 1);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        short[] shortArray0 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray7);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray12);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray18);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray21);
        org.junit.Assert.assertArrayEquals("random", shortArray7, shortArray21);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray32, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray21, (java.lang.Object) executorServiceArray32);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest40.setUp();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        synonymsAnalysisTest40.assertDocsSkippingEquals("hi!", indexReader43, 0, postingsEnum45, postingsEnum46, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = synonymsAnalysisTest40.analysisService;
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        synonymsAnalysisTest40.assertFieldsEquals("random", indexReader51, fields52, fields53, true);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        synonymsAnalysisTest40.assertPositionsSkippingEquals("tests.maxfailures", indexReader57, 0, postingsEnum59, postingsEnum60);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest62 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        synonymsAnalysisTest62.assertDocsEnumEquals("tests.badapples", postingsEnum64, postingsEnum65, true);
        synonymsAnalysisTest62.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger69 = synonymsAnalysisTest62.getlogger();
        java.lang.String str70 = synonymsAnalysisTest62.getTestName();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest40, (java.lang.Object) str70);
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        synonymsAnalysisTest40.assertDocsSkippingEquals("<unknown>", indexReader73, 5, postingsEnum75, postingsEnum76, false);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray21, (java.lang.Object) postingsEnum75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray21);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 1 };
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray8);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray3, byteArray10);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray9, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) "tests.weekly", (java.lang.Object) executorServiceArray4);
        java.lang.Object obj16 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest17.getanalysisService();
        synonymsAnalysisTest17.overrideTestDefaultQueryCache();
        synonymsAnalysisTest17.overrideTestDefaultQueryCache();
        synonymsAnalysisTest17.setUp();
        org.junit.Assert.assertNotEquals(obj16, (java.lang.Object) synonymsAnalysisTest17);
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest17.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger24 = synonymsAnalysisTest17.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest17.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) executorServiceArray4, (java.lang.Object) synonymsAnalysisTest17);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("enwiki.random.lines.txt", true);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 10.0d, (double) 5);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 5, (double) 0, (double) 1.0f);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest2.assertFieldsEquals("random", indexReader13, fields14, fields15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("tests.maxfailures", indexReader19, 0, postingsEnum21, postingsEnum22);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest24.assertDocsEnumEquals("tests.badapples", postingsEnum26, postingsEnum27, true);
        synonymsAnalysisTest24.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger31 = synonymsAnalysisTest24.getlogger();
        java.lang.String str32 = synonymsAnalysisTest24.getTestName();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) str32);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("<unknown>", indexReader35, 5, postingsEnum37, postingsEnum38, false);
        org.elasticsearch.common.logging.ESLogger eSLogger41 = synonymsAnalysisTest2.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) synonymsAnalysisTest2);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("", indexReader15, (int) '4', postingsEnum17, postingsEnum18, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest21.setUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest21.assertDocsSkippingEquals("hi!", indexReader24, 0, postingsEnum26, postingsEnum27, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest21.analysisService;
        org.junit.rules.RuleChain ruleChain31 = synonymsAnalysisTest21.failureAndSuccessEvents;
        synonymsAnalysisTest21.ensureCleanedUp();
        synonymsAnalysisTest21.setUp();
        synonymsAnalysisTest21.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) postingsEnum18, (java.lang.Object) synonymsAnalysisTest21);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) 3, (long) 1);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { 3, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        long[] longArray3 = new long[] { 10, (byte) -1 };
        long[] longArray8 = new long[] { '4', 3, 3, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray3, longArray8);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (short) 0, (long) (byte) 0);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest11.assertDocsSkippingEquals("hi!", indexReader14, 0, postingsEnum16, postingsEnum17, true);
        org.junit.rules.TestRule testRule20 = synonymsAnalysisTest11.ruleChain;
        synonymsAnalysisTest11.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest11.setUp();
        synonymsAnalysisTest11.ensureCleanedUp();
        synonymsAnalysisTest11.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) testRule10, (java.lang.Object) synonymsAnalysisTest11);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.tearDown();
        synonymsAnalysisTest1.setIndexWriterMaxDocs(2);
        synonymsAnalysisTest1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        java.lang.String str14 = synonymsAnalysisTest0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (short) -1, (long) 3);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) 100);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        long[] longArray7 = new long[] { 0L, (short) -1, 2, (short) 100, (byte) 0, 10L };
        long[] longArray12 = new long[] { 10L, (short) 100, (short) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray7, longArray12);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest11.assertDocsSkippingEquals("hi!", indexReader14, 0, postingsEnum16, postingsEnum17, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = null;
        synonymsAnalysisTest11.setanalysisService(analysisService20);
        org.elasticsearch.common.logging.ESLogger eSLogger22 = synonymsAnalysisTest11.logger;
        java.lang.Object obj23 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest11, obj23);
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest11.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest26.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest26.logger;
        synonymsAnalysisTest26.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest1, synonymsAnalysisTest11, synonymsAnalysisTest26 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet31 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray30);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet32 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray30);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) synonymsAnalysisTestArray30, (java.lang.Object[]) executorServiceArray34);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.nightly", postingsEnum3, postingsEnum4, false);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest8.setUp();
        synonymsAnalysisTest8.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest8.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest12.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("hi!", indexReader15, 0, postingsEnum17, postingsEnum18, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest12.analysisService;
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest12.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest12.assertPositionsSkippingEquals("tests.badapples", indexReader24, (int) (short) 10, postingsEnum26, postingsEnum27);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest29.setUp();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest29.assertDocsSkippingEquals("hi!", indexReader32, 0, postingsEnum34, postingsEnum35, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest29.analysisService;
        org.junit.rules.RuleChain ruleChain39 = synonymsAnalysisTest29.failureAndSuccessEvents;
        synonymsAnalysisTest12.failureAndSuccessEvents = ruleChain39;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain39;
        synonymsAnalysisTest8.failureAndSuccessEvents = ruleChain39;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest8);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        long[] longArray1 = new long[] { (byte) 1 };
        long[] longArray3 = new long[] { 0L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray3);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray7 = new double[] { 10, (byte) 0, (-1), 0, 0.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray1, doubleArray7, (double) 2);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        int[] intArray7 = new int[] { (byte) 0, 10, 3, 0, (byte) 10, 1 };
        int[] intArray8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray7, intArray8);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) (short) 1, (float) 100, (float) 3);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) 0, (long) 2);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, 0L);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) (byte) 10);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray11);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray17);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray20);
        org.junit.Assert.assertArrayEquals("random", shortArray6, shortArray20);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray31, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray20, (java.lang.Object) executorServiceArray31);
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray31);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) 5);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) 100.0f);
        synonymsAnalysisTest2.assertPathHasBeenCleared("<unknown>");
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest2);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest2.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) 100);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.getlogger();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest7.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest7.logger;
        synonymsAnalysisTest7.tearDown();
        synonymsAnalysisTest7.setIndexWriterMaxDocs(2);
        synonymsAnalysisTest7.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest7.assertDocsEnumEquals("tests.maxfailures", postingsEnum15, postingsEnum16, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) postingsEnum16);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", 10.0d, (double) 0L, (double) 100L);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 10L, 100L);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 'a');
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.slow", "europarl.lines.txt.gz", "tests.slow" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray9, (java.lang.Object) (-1.0f));
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray22, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray22);
        java.lang.Object obj28 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray17, obj28);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray17);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) strArray4, (java.lang.Object[]) executorServiceArray9);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[][] strArray31 = new java.lang.String[][] { strArray6, strArray12, strArray18, strArray24, strArray30 };
        java.util.List<java.lang.String[]> strArrayList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf(5, strArray31);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray36, (java.lang.Object) (-1.0f));
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray43, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray31, (java.lang.Object[]) executorServiceArray43);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.maxfailures", true);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((-1.0d), (double) 1, (double) 10);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 1, 1.0d);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', 0.0f, 0.0f);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray3 = new byte[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray1, byteArray3);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) (short) 0);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray7, (float) 10);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray12, (float) 5);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) (short) 0);
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray23, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray7, floatArray18, 0.0f);
        float[] floatArray30 = new float[] {};
        float[] floatArray31 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray31, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray31, (float) (short) 1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger38 = synonymsAnalysisTest37.getlogger();
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray40, (float) (short) 0);
        float[] floatArray43 = new float[] {};
        float[] floatArray44 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray44, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray44, (float) 10);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) eSLogger38, (java.lang.Object) floatArray39);
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray39, (float) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) floatArray39);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        int[] intArray6 = new int[] { (short) 1, (short) 1, (short) 0, (byte) 1, '#', (short) -1 };
        int[] intArray13 = new int[] { 0, (byte) 10, 1, 4, 1, 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray13);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        int[] intArray5 = new int[] { (byte) 10, 4, (short) -1, '4', 5 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) (-1L), 0.0f, 0.0f);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        synonymsAnalysisTest1.assertPathHasBeenCleared("<unknown>");
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.failfast", indexReader7, terms8, terms9, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest12.getlogger();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        synonymsAnalysisTest12.assertFieldsEquals("tests.maxfailures", indexReader15, fields16, fields17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        synonymsAnalysisTest12.assertTermsEquals("tests.nightly", indexReader21, terms22, terms23, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest12.getanalysisService();
        synonymsAnalysisTest12.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = null;
        synonymsAnalysisTest12.setanalysisService(analysisService28);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        synonymsAnalysisTest12.assertFieldsEquals("random", indexReader31, fields32, fields33, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) "tests.failfast", (java.lang.Object) indexReader31);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) (short) 0);
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray6, (float) 10);
        float[] floatArray11 = new float[] {};
        float[] floatArray12 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray12, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray11, (float) 5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest17.setUp();
        synonymsAnalysisTest17.ensureCheckIndexPassed();
        synonymsAnalysisTest17.ensureCleanedUp();
        synonymsAnalysisTest17.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) 5, (java.lang.Object) synonymsAnalysisTest17);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        java.lang.Object obj2 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest3.getanalysisService();
        synonymsAnalysisTest3.overrideTestDefaultQueryCache();
        synonymsAnalysisTest3.overrideTestDefaultQueryCache();
        synonymsAnalysisTest3.setUp();
        org.junit.Assert.assertNotEquals(obj2, (java.lang.Object) synonymsAnalysisTest3);
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest3.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) "tests.monster", (java.lang.Object) synonymsAnalysisTest3);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.tearDown();
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertPathHasBeenCleared("");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest5.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) analysisService6);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        long[] longArray7 = new long[] { (byte) 0, 5, (byte) 0, 100L, (short) 1, 100 };
        long[] longArray10 = new long[] { (short) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray7, longArray10);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        java.lang.String str12 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.assertPathHasBeenCleared("<unknown>");
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (short) 1, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1L), (double) 0L, (double) 2);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) ' ', (long) 100);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) 1);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1), (double) 0.0f, (double) (short) 10);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) (short) 0);
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray6, (float) 10);
        float[] floatArray11 = new float[] {};
        float[] floatArray12 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray12, (float) (short) 0);
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray16, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray16, (float) 10);
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray22, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray21, (float) 5);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray21, (float) (short) 10);
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray32, (float) (short) 0);
        float[] floatArray35 = new float[] {};
        float[] floatArray36 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray36, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray36, (float) 10);
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray41, (float) 5);
        float[] floatArray47 = new float[] {};
        float[] floatArray48 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray48, (float) (short) 0);
        float[] floatArray51 = new float[] {};
        float[] floatArray52 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray52, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray52, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray36, floatArray47, 0.0f);
        float[] floatArray59 = new float[] {};
        float[] floatArray60 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray60, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray60, (float) (short) 1);
        float[] floatArray65 = new float[] {};
        float[] floatArray66 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray66, (float) (short) 0);
        float[] floatArray69 = new float[] {};
        float[] floatArray70 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray70, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray70, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray60, floatArray65, (float) 10L);
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray60, (float) (-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) false, (java.lang.Object) floatArray21);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) (byte) 100);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray8, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray25, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray37, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray25);
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", objArray1, (java.lang.Object[]) executorServiceArray25);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) -1, (double) ' ', (double) 10);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 1.0f, (double) 4);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', (float) (short) -1, (float) (byte) 10);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
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
        org.junit.Assert.assertArrayEquals("", charArray1, charArray8);
        char[] charArray16 = new char[] { ' ', '#', '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray16);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.common.logging.ESLogger eSLogger10 = synonymsAnalysisTest1.getlogger();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest12.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("hi!", indexReader15, 0, postingsEnum17, postingsEnum18, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest12.analysisService;
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest12.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest12.assertPositionsSkippingEquals("tests.badapples", indexReader24, (int) (short) 10, postingsEnum26, postingsEnum27);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest29.setUp();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest29.assertDocsSkippingEquals("hi!", indexReader32, 0, postingsEnum34, postingsEnum35, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest29.analysisService;
        org.junit.rules.RuleChain ruleChain39 = synonymsAnalysisTest29.failureAndSuccessEvents;
        synonymsAnalysisTest12.failureAndSuccessEvents = ruleChain39;
        synonymsAnalysisTest12.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest12.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) testRule11, (java.lang.Object) synonymsAnalysisTest12);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        org.junit.Assert.assertArrayEquals(charArray0, charArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray4);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 1L, (double) 10L, (double) (-1L));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray1, doubleArray2, (double) ' ');
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        long[] longArray4 = new long[] { (short) 10, '#', (-1) };
        long[] longArray7 = new long[] { (-1L), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray4, longArray7);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray2, byteArray7);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        long[] longArray2 = new long[] { (short) -1, (-1) };
        long[] longArray7 = new long[] { 'a', (byte) -1, 5, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray7);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray4, (java.lang.Object) (-1.0f));
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray16, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray28, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray16);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) executorServiceArray16);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) '4', (double) (byte) -1);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) (byte) 10, (float) (byte) 1, 0.0f);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 0L, 10.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray3, (double) (byte) -1);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        byte[] byteArray1 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray1, byteArray6);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 5, (long) (byte) 10);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest6.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest6.assertDocsSkippingEquals("hi!", indexReader9, 0, postingsEnum11, postingsEnum12, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest6.analysisService;
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest6.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (short) 10, postingsEnum20, postingsEnum21);
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest6.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain23;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        double[] doubleArray2 = new double[] { (-1), 2 };
        double[] doubleArray9 = new double[] { 10.0d, 10L, (short) -1, (byte) 1, 1.0f, 1.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray9, (double) (short) -1);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        long[] longArray2 = new long[] { '4' };
        long[] longArray6 = new long[] { 0L, (-1), 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray2, longArray6);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 0L, (double) 100.0f);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.logger;
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        org.junit.Assert.assertArrayEquals(charArray0, charArray4);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals(charArray8, charArray12);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals("", charArray8, charArray15);
        org.junit.Assert.assertArrayEquals(charArray4, charArray8);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals(charArray8, charArray21);
        char[] charArray24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray21, charArray24);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (byte) -1);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest4.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest4.assertDocsSkippingEquals("hi!", indexReader7, 0, postingsEnum9, postingsEnum10, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest4.analysisService;
        synonymsAnalysisTest4.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest4.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest4.logger;
        synonymsAnalysisTest4.setUp();
        synonymsAnalysisTest4.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest4.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain21;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) ruleChain21);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        long[] longArray3 = new long[] { 'a', '4', (byte) -1 };
        long[] longArray9 = new long[] { (byte) 100, 100, 2, (short) 100, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray9);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        short[] shortArray4 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray9 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray14 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray19 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray24 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[][] shortArray25 = new short[][] { shortArray4, shortArray9, shortArray14, shortArray19, shortArray24 };
        short[][][] shortArray26 = new short[][][] { shortArray25 };
        java.util.Set<short[][]> shortArraySet27 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray26);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = synonymsAnalysisTest28.getanalysisService();
        synonymsAnalysisTest28.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger31 = synonymsAnalysisTest28.getlogger();
        synonymsAnalysisTest28.ensureCheckIndexPassed();
        synonymsAnalysisTest28.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService35 = synonymsAnalysisTest34.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest37.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger39 = synonymsAnalysisTest37.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest40.setUp();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        synonymsAnalysisTest40.assertDocsSkippingEquals("hi!", indexReader43, 0, postingsEnum45, postingsEnum46, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = synonymsAnalysisTest40.analysisService;
        org.junit.rules.RuleChain ruleChain50 = synonymsAnalysisTest40.failureAndSuccessEvents;
        synonymsAnalysisTest37.failureAndSuccessEvents = ruleChain50;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest52 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest52.setUp();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        synonymsAnalysisTest52.assertDocsSkippingEquals("hi!", indexReader55, 0, postingsEnum57, postingsEnum58, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService61 = synonymsAnalysisTest52.analysisService;
        org.junit.rules.RuleChain ruleChain62 = synonymsAnalysisTest52.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        synonymsAnalysisTest52.assertPositionsSkippingEquals("tests.badapples", indexReader64, (int) (short) 10, postingsEnum66, postingsEnum67);
        org.junit.rules.RuleChain ruleChain69 = synonymsAnalysisTest52.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest37, (java.lang.Object) synonymsAnalysisTest52);
        synonymsAnalysisTest37.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest34, (java.lang.Object) synonymsAnalysisTest37);
        org.junit.rules.RuleChain ruleChain73 = synonymsAnalysisTest37.failureAndSuccessEvents;
        synonymsAnalysisTest28.failureAndSuccessEvents = ruleChain73;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArray26, (java.lang.Object) synonymsAnalysisTest28);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 100.0f, (double) (byte) -1);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        long[] longArray6 = new long[] { 10L, 10L, (short) 100, (byte) 0, 10, '4' };
        long[] longArray11 = new long[] { 0L, 100L, 5, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray11);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) -1, (-1L));
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.nightly");
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest11.assertDocsSkippingEquals("hi!", indexReader14, 0, postingsEnum16, postingsEnum17, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest11.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest21.setUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest21.assertDocsSkippingEquals("hi!", indexReader24, 0, postingsEnum26, postingsEnum27, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest21.analysisService;
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        synonymsAnalysisTest21.assertFieldsEquals("random", indexReader32, fields33, fields34, true);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        synonymsAnalysisTest21.assertTermsEquals("tests.weekly", indexReader38, terms39, terms40, false);
        synonymsAnalysisTest21.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest45.setUp();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        synonymsAnalysisTest45.assertDocsSkippingEquals("hi!", indexReader48, 0, postingsEnum50, postingsEnum51, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService54 = synonymsAnalysisTest45.analysisService;
        org.junit.rules.RuleChain ruleChain55 = synonymsAnalysisTest45.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        synonymsAnalysisTest45.assertPositionsSkippingEquals("tests.badapples", indexReader57, (int) (short) 10, postingsEnum59, postingsEnum60);
        org.junit.rules.RuleChain ruleChain62 = synonymsAnalysisTest45.failureAndSuccessEvents;
        synonymsAnalysisTest21.failureAndSuccessEvents = ruleChain62;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest11, (java.lang.Object) ruleChain62);
        org.elasticsearch.common.logging.ESLogger eSLogger65 = synonymsAnalysisTest11.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) eSLogger65);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (-1.0d));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest4.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger6 = synonymsAnalysisTest4.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest7.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest7.assertDocsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest7.analysisService;
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest7.failureAndSuccessEvents;
        synonymsAnalysisTest4.failureAndSuccessEvents = ruleChain17;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest19.assertDocsSkippingEquals("hi!", indexReader22, 0, postingsEnum24, postingsEnum25, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest19.analysisService;
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest19.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest19.assertPositionsSkippingEquals("tests.badapples", indexReader31, (int) (short) 10, postingsEnum33, postingsEnum34);
        org.junit.rules.RuleChain ruleChain36 = synonymsAnalysisTest19.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest4, (java.lang.Object) synonymsAnalysisTest19);
        synonymsAnalysisTest4.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest4);
        org.junit.rules.RuleChain ruleChain40 = synonymsAnalysisTest4.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) ruleChain40);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        synonymsAnalysisTest0.assertFieldsEquals("hi!", indexReader8, fields9, fields10, false);
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest0.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        double[] doubleArray6 = new double[] { 0L, (short) 10, 3, 0.0d, 'a' };
        double[] doubleArray11 = new double[] { 10, 10L, 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray11, (double) 1);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.tearDown();
        java.lang.Object obj5 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, obj5);
        org.junit.rules.TestRule testRule7 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[][] strArray41 = new java.lang.String[][] { strArray16, strArray22, strArray28, strArray34, strArray40 };
        java.util.List<java.lang.String[]> strArrayList42 = org.elasticsearch.test.ESTestCase.randomSubsetOf(5, strArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) strArray41);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 2);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
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
        org.junit.Assert.assertArrayEquals("", charArray1, charArray8);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals(charArray13, charArray17);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals("", charArray13, charArray20);
        org.junit.Assert.assertArrayEquals(charArray8, charArray13);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals(charArray25, charArray29);
        org.junit.Assert.assertArrayEquals(charArray8, charArray29);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest33.assertDocsEnumEquals("tests.badapples", postingsEnum35, postingsEnum36, true);
        synonymsAnalysisTest33.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        synonymsAnalysisTest33.assertPositionsSkippingEquals("tests.weekly", indexReader42, (int) (short) 100, postingsEnum44, postingsEnum45);
        synonymsAnalysisTest33.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain48 = synonymsAnalysisTest33.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = synonymsAnalysisTest33.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest50 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest50.setUp();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        synonymsAnalysisTest50.assertDocsSkippingEquals("hi!", indexReader53, 0, postingsEnum55, postingsEnum56, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService59 = synonymsAnalysisTest50.analysisService;
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        synonymsAnalysisTest50.assertFieldsEquals("random", indexReader61, fields62, fields63, true);
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        synonymsAnalysisTest50.assertTermsEquals("tests.weekly", indexReader67, terms68, terms69, false);
        synonymsAnalysisTest50.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest74 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest74.setUp();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        synonymsAnalysisTest74.assertDocsSkippingEquals("hi!", indexReader77, 0, postingsEnum79, postingsEnum80, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService83 = synonymsAnalysisTest74.analysisService;
        org.junit.rules.RuleChain ruleChain84 = synonymsAnalysisTest74.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum89 = null;
        synonymsAnalysisTest74.assertPositionsSkippingEquals("tests.badapples", indexReader86, (int) (short) 10, postingsEnum88, postingsEnum89);
        org.junit.rules.RuleChain ruleChain91 = synonymsAnalysisTest74.failureAndSuccessEvents;
        synonymsAnalysisTest50.failureAndSuccessEvents = ruleChain91;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain91;
        synonymsAnalysisTest33.failureAndSuccessEvents = ruleChain91;
        java.lang.Class<?> wildcardClass95 = synonymsAnalysisTest33.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray29, (java.lang.Object) synonymsAnalysisTest33);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray9, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) "tests.weekly", (java.lang.Object) executorServiceArray4);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.slow", "europarl.lines.txt.gz", "tests.slow" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray19);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) strArray19);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        short[] shortArray6 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray10 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray14 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[][] shortArray15 = new short[][] { shortArray6, shortArray10, shortArray14 };
        java.util.List<short[]> shortArrayList16 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, shortArray15);
        org.junit.Assert.assertNotSame("", (java.lang.Object) shortArray15, (java.lang.Object) "random");
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList26 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray25);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList34 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray33);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList42 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray41);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList50 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray49);
        java.util.Collection[] collectionArray52 = new java.util.Collection[4];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray53 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray52;
        charSequenceCollectionArray53[0] = charSequenceList26;
        charSequenceCollectionArray53[1] = charSequenceList34;
        charSequenceCollectionArray53[2] = charSequenceList42;
        charSequenceCollectionArray53[3] = charSequenceList50;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet62 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceCollectionArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) shortArray15, (java.lang.Object[]) charSequenceCollectionArray53);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray8, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) "tests.weekly", (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray22 = new java.util.concurrent.ExecutorService[][] { executorServiceArray16, executorServiceArray17, executorServiceArray18, executorServiceArray19, executorServiceArray20, executorServiceArray21 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList23 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, executorServiceArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray22);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.NumericDocValues numericDocValues5 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.badapples", 10, numericDocValues5, numericDocValues6);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray2 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) (short) 10);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) (byte) 10, (double) (byte) -1);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) 4, (long) 'a');
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.badapples", indexReader12, (int) (short) 10, postingsEnum14, postingsEnum15);
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = null;
        synonymsAnalysisTest0.analysisService = analysisService17;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest11.assertDocsSkippingEquals("hi!", indexReader14, 0, postingsEnum16, postingsEnum17, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = null;
        synonymsAnalysisTest11.setanalysisService(analysisService20);
        org.elasticsearch.common.logging.ESLogger eSLogger22 = synonymsAnalysisTest11.logger;
        java.lang.Object obj23 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest11, obj23);
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest11.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest26.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest26.logger;
        synonymsAnalysisTest26.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest1, synonymsAnalysisTest11, synonymsAnalysisTest26 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet31 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray30);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest32.assertDocsEnumEquals("tests.badapples", postingsEnum34, postingsEnum35, true);
        synonymsAnalysisTest32.ensureAllSearchContextsReleased();
        synonymsAnalysisTest32.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest42.setUp();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        synonymsAnalysisTest42.assertDocsSkippingEquals("hi!", indexReader45, 0, postingsEnum47, postingsEnum48, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService51 = null;
        synonymsAnalysisTest42.setanalysisService(analysisService51);
        org.elasticsearch.common.logging.ESLogger eSLogger53 = synonymsAnalysisTest42.logger;
        java.lang.Object obj54 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest42, obj54);
        org.junit.rules.TestRule testRule56 = synonymsAnalysisTest42.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest57 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest57.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger59 = synonymsAnalysisTest57.logger;
        synonymsAnalysisTest57.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray61 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest32, synonymsAnalysisTest42, synonymsAnalysisTest57 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet62 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray61);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet63 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray61);
        java.util.Set<org.elasticsearch.test.ESTestCase> eSTestCaseSet64 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ESTestCase[]) synonymsAnalysisTestArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) synonymsAnalysisTestSet31, (java.lang.Object) synonymsAnalysisTestArray61);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (short) 10, 0.0f, 10.0d, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray5, 0.0d);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList23 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray30);
        java.util.Collection[] collectionArray33 = new java.util.Collection[4];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray34 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray33;
        charSequenceCollectionArray34[0] = charSequenceList7;
        charSequenceCollectionArray34[1] = charSequenceList15;
        charSequenceCollectionArray34[2] = charSequenceList23;
        charSequenceCollectionArray34[3] = charSequenceList31;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceCollectionArray34);
        java.util.Set[] setArray45 = new java.util.Set[1];
        @SuppressWarnings("unchecked")
        java.util.Set<java.util.Collection<java.lang.CharSequence>>[] charSequenceCollectionSetArray46 = (java.util.Set<java.util.Collection<java.lang.CharSequence>>[]) setArray45;
        charSequenceCollectionSetArray46[0] = charSequenceCollectionSet43;
        java.util.Set<java.util.Set<java.util.Collection<java.lang.CharSequence>>> charSequenceCollectionSetSet49 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceCollectionSetArray46);
        short[] shortArray54 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray59 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray64 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray69 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray74 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[][] shortArray75 = new short[][] { shortArray54, shortArray59, shortArray64, shortArray69, shortArray74 };
        short[][][] shortArray76 = new short[][][] { shortArray75 };
        java.util.Set<short[][]> shortArraySet77 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charSequenceCollectionSetSet49, (java.lang.Object) shortArraySet77);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        long[] longArray4 = new long[] { (byte) 100, (short) 100, (byte) 10, 10L };
        long[] longArray7 = new long[] { (byte) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray7);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        int[] intArray3 = new int[] { (short) 10, 10 };
        int[] intArray8 = new int[] { 2, (byte) 100, (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray3, intArray8);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 0, (double) 100.0f);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10L, (double) (-1L));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) (short) 1);
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) 3, (float) (byte) 0, 0.0f);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) 0, 0L);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) 0.0f);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) (short) 100, postingsEnum11, postingsEnum12);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest17.setUp();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest17.assertDocsSkippingEquals("hi!", indexReader20, 0, postingsEnum22, postingsEnum23, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest17.analysisService;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        synonymsAnalysisTest17.assertFieldsEquals("random", indexReader28, fields29, fields30, true);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        synonymsAnalysisTest17.assertTermsEquals("tests.weekly", indexReader34, terms35, terms36, false);
        synonymsAnalysisTest17.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest41.setUp();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        synonymsAnalysisTest41.assertDocsSkippingEquals("hi!", indexReader44, 0, postingsEnum46, postingsEnum47, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService50 = synonymsAnalysisTest41.analysisService;
        org.junit.rules.RuleChain ruleChain51 = synonymsAnalysisTest41.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        synonymsAnalysisTest41.assertPositionsSkippingEquals("tests.badapples", indexReader53, (int) (short) 10, postingsEnum55, postingsEnum56);
        org.junit.rules.RuleChain ruleChain58 = synonymsAnalysisTest41.failureAndSuccessEvents;
        synonymsAnalysisTest17.failureAndSuccessEvents = ruleChain58;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain58;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain58;
        java.lang.Class<?> wildcardClass62 = synonymsAnalysisTest0.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest63 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService64 = synonymsAnalysisTest63.getanalysisService();
        synonymsAnalysisTest63.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger66 = synonymsAnalysisTest63.getlogger();
        synonymsAnalysisTest63.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) wildcardClass62, (java.lang.Object) synonymsAnalysisTest63);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("tests.failfast", "random", "tests.nightly");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        long[] longArray1 = new long[] {};
        long[] longArray8 = new long[] { (short) 100, 5, 0L, 1L, (byte) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray1, longArray8);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.setIndexWriterMaxDocs(100);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray9, shortArray10);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray13, shortArray14);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray17);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray22);
        org.junit.Assert.assertArrayEquals("hi!", shortArray10, shortArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) 100, (java.lang.Object) shortArray10);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest0.analysisService;
        java.lang.String str12 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        long[] longArray2 = new long[] { 4, 0 };
        long[] longArray3 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest1.analysisService = analysisService5;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest7.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest7.assertDocsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest7.analysisService;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        synonymsAnalysisTest7.assertFieldsEquals("random", indexReader18, fields19, fields20, true);
        org.elasticsearch.common.logging.ESLogger eSLogger23 = synonymsAnalysisTest7.logger;
        org.junit.rules.TestRule testRule24 = synonymsAnalysisTest7.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule24;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) testRule24);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest5.setUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest5.assertDocsSkippingEquals("hi!", indexReader8, 0, postingsEnum10, postingsEnum11, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest5.analysisService;
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest5.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest5.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (short) 10, postingsEnum19, postingsEnum20);
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest5.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain22;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.nightly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10.0f, (double) (byte) 10, (double) (short) -1);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray4, (java.lang.Object) (-1.0f));
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray16, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray28, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) executorServiceArray4);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) 10, (long) (byte) 10);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.logger;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.badapples", indexReader6, terms7, terms8, true);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        org.junit.Assert.assertArrayEquals(charArray14, charArray18);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        org.junit.Assert.assertArrayEquals(charArray22, charArray26);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals("", charArray22, charArray29);
        org.junit.Assert.assertArrayEquals(charArray18, charArray22);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals(charArray22, charArray35);
        org.junit.Assert.assertArrayEquals(charArray11, charArray22);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        org.junit.Assert.assertArrayEquals(charArray40, charArray44);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals("", charArray40, charArray47);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals(charArray52, charArray56);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        org.junit.Assert.assertArrayEquals("", charArray52, charArray59);
        org.junit.Assert.assertArrayEquals(charArray47, charArray52);
        org.junit.Assert.assertArrayEquals(charArray22, charArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) charArray52);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) '4', (double) (byte) -1, (double) 0.0f);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        double[] doubleArray1 = new double[] { '#' };
        double[] doubleArray8 = new double[] { (byte) 0, 1L, 0L, (byte) 1, 1, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray8, (double) 1);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest1.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) analysisService15);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray4 = new double[] { 4, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray1, doubleArray4, (double) '4');
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 5, (double) (short) 1, (double) 1.0f);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.badapples", indexReader13, (int) (short) 10, postingsEnum15, postingsEnum16);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest18.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest18.assertDocsSkippingEquals("hi!", indexReader21, 0, postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest18.analysisService;
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain28;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain28;
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray42, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray42);
        java.lang.Object obj48 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray37, obj48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray57, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray57);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray69, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray69);
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) ruleChain28, (java.lang.Object) executorServiceArray37);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray3, (java.lang.Object) (-1.0f));
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray15, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray27, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray15);
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray53 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray59 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray65 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[][] strArray66 = new java.lang.String[][] { strArray41, strArray47, strArray53, strArray59, strArray65 };
        java.util.List<java.lang.String[]> strArrayList67 = org.elasticsearch.test.ESTestCase.randomSubsetOf(5, strArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray3, (java.lang.Object) strArrayList67);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("", (int) 'a', numericDocValues8, numericDocValues9);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 1L, (double) 0.0f);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        java.lang.String str15 = synonymsAnalysisTest1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) str15);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        long[] longArray4 = new long[] { ' ', 3, 10 };
        long[] longArray8 = new long[] { (byte) 100, (byte) -1, 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("random", longArray4, longArray8);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.setIndexWriterMaxDocs(2);
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("random", (int) (byte) 100, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest1.logger;
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest15.setUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("hi!", indexReader18, 0, postingsEnum20, postingsEnum21, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest15.analysisService;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        synonymsAnalysisTest15.assertFieldsEquals("random", indexReader26, fields27, fields28, true);
        java.lang.String str31 = synonymsAnalysisTest15.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = synonymsAnalysisTest15.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest15);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        double[] doubleArray2 = new double[] { (-1.0f) };
        double[] doubleArray5 = new double[] { 1L, 1.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray2, doubleArray5, (double) 2);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) (-1), (float) (byte) 1, (float) 0L);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        long[] longArray3 = new long[] { (-1L), '#', (byte) 100 };
        long[] longArray4 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        double[] doubleArray6 = new double[] { (short) -1, 0, 100.0f, 100.0f, ' ' };
        double[] doubleArray10 = new double[] { (-1.0d), 100, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", doubleArray6, doubleArray10, (double) 100);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        double[] doubleArray1 = null;
        double[] doubleArray6 = new double[] { 1.0d, 10L, (byte) -1, 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", doubleArray1, doubleArray6, (double) (short) 1);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        double[] doubleArray1 = null;
        double[] doubleArray7 = new double[] { 1.0d, (-1L), 100, 0.0d, (-1.0f) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray1, doubleArray7, (double) (short) 100);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = null;
        synonymsAnalysisTest0.analysisService = analysisService12;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        double[] doubleArray5 = new double[] { 10.0d, (short) 1, (byte) 0, (byte) -1 };
        double[] doubleArray9 = new double[] { (short) 0, (-1), 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray5, doubleArray9, (double) '4');
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) '4');
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) '4', (double) (short) 1, (double) ' ');
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 10, (java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        double[] doubleArray6 = new double[] { 100L, 1.0d, 4, (short) 0, (short) 10 };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray6, doubleArray7, (double) (byte) 1);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        long[] longArray2 = new long[] { (short) 10, 100L };
        long[] longArray8 = new long[] { 4, (short) 100, 3, 10L, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray8);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (short) 10, (long) 10);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (-1L), (double) 'a');
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 10, (java.lang.Object) synonymsAnalysisTest1);
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("", (int) (short) 100, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest11.assertDocsSkippingEquals("hi!", indexReader14, 0, postingsEnum16, postingsEnum17, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = null;
        synonymsAnalysisTest11.setanalysisService(analysisService20);
        org.elasticsearch.common.logging.ESLogger eSLogger22 = synonymsAnalysisTest11.logger;
        java.lang.Object obj23 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest11, obj23);
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest11.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest26.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest26.logger;
        synonymsAnalysisTest26.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest1, synonymsAnalysisTest11, synonymsAnalysisTest26 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet31 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray30);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet32 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray30);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray43, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray43);
        java.lang.Object obj49 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray38, obj49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray38);
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) synonymsAnalysisTestArray30, (java.lang.Object[]) executorServiceArray38);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray2, shortArray3);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray8, shortArray9);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray12);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray17);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray22, shortArray23);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray26, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray26);
        org.junit.Assert.assertArrayEquals("random", shortArray12, shortArray26);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray32, shortArray33);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray36);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray41);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray46, shortArray47);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray50, shortArray51);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray54, shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray46);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray26, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray41);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray65, shortArray66);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray69, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray69);
        short[] shortArray74 = new short[] {};
        short[] shortArray75 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray74, shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray74);
        short[] shortArray79 = new short[] {};
        short[] shortArray80 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray79, shortArray80);
        short[] shortArray83 = new short[] {};
        short[] shortArray84 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray83, shortArray84);
        org.junit.Assert.assertArrayEquals(shortArray80, shortArray83);
        org.junit.Assert.assertArrayEquals("random", shortArray69, shortArray83);
        java.util.concurrent.ExecutorService executorService89 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray90 = new java.util.concurrent.ExecutorService[] { executorService89 };
        boolean boolean91 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray90);
        boolean boolean92 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray90);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray90, (java.lang.Object) (-1.0f));
        boolean boolean95 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray90);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) shortArray83, (java.lang.Object) boolean95);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray41, shortArray83);
        short[] shortArray98 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray98);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        synonymsAnalysisTest0.assertFieldsEquals("hi!", indexReader8, fields9, fields10, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        synonymsAnalysisTest13.ensureCheckIndexPassed();
        synonymsAnalysisTest13.ensureCleanedUp();
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest13.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain18;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray8, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray20, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray33, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray45, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray61, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) "tests.weekly", (java.lang.Object) executorServiceArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) "random", (java.lang.Object) executorServiceArray8);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.nightly", postingsEnum3, postingsEnum4, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest0.analysisService = analysisService8;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (short) 0, (double) '#');
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) (byte) 10);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray7 = new java.util.concurrent.ExecutorService[][] { executorServiceArray1, executorServiceArray2, executorServiceArray3, executorServiceArray4, executorServiceArray5, executorServiceArray6 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList8 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, executorServiceArray7);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray16, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray24, (java.lang.Object) (-1.0f));
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray38, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray46, (java.lang.Object) (-1.0f));
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) executorServiceArray46, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray46);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray66, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray66);
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        java.util.concurrent.ExecutorService executorService77 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] { executorService77 };
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray78);
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray78);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray78, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray78);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray78);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray66);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray58);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader17, terms18, terms19, false);
        synonymsAnalysisTest0.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest25.setUp();
        synonymsAnalysisTest25.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) analysisService24, (java.lang.Object) synonymsAnalysisTest25);
        org.elasticsearch.common.logging.ESLogger eSLogger29 = synonymsAnalysisTest25.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest30.setUp();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest30.assertDocsSkippingEquals("hi!", indexReader33, 0, postingsEnum35, postingsEnum36, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService39 = synonymsAnalysisTest30.analysisService;
        org.junit.rules.RuleChain ruleChain40 = synonymsAnalysisTest30.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger41 = synonymsAnalysisTest30.logger;
        org.junit.Assert.assertNotEquals((java.lang.Object) eSLogger29, (java.lang.Object) synonymsAnalysisTest30);
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest30.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum44, postingsEnum45);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        int[] intArray4 = new int[] { (byte) 0, '4', '#', 0 };
        int[] intArray9 = new int[] { 2, (short) 10, (short) 0, '#' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray9);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        synonymsAnalysisTest0.assertFieldsEquals("hi!", indexReader8, fields9, fields10, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        synonymsAnalysisTest13.ensureCheckIndexPassed();
        synonymsAnalysisTest13.ensureCleanedUp();
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest13.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain18;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.badapples", indexReader12, (int) (short) 10, postingsEnum14, postingsEnum15);
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("", (int) (byte) 10, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest3, (java.lang.Object) 100.0f);
        synonymsAnalysisTest3.assertPathHasBeenCleared("<unknown>");
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest3);
        synonymsAnalysisTest3.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.setUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest10.assertDocsSkippingEquals("hi!", indexReader13, 0, postingsEnum15, postingsEnum16, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest10.analysisService;
        synonymsAnalysisTest10.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest10.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger23 = synonymsAnalysisTest10.logger;
        synonymsAnalysisTest10.setUp();
        synonymsAnalysisTest10.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) synonymsAnalysisTest3, (java.lang.Object) synonymsAnalysisTest10);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray6, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray6);
        short[] shortArray16 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray21 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray26 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray31 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray36 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[][] shortArray37 = new short[][] { shortArray16, shortArray21, shortArray26, shortArray31, shortArray36 };
        short[][][] shortArray38 = new short[][][] { shortArray37 };
        java.util.Set<short[][]> shortArraySet39 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray38);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) shortArray38);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader12, fields13, fields14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, 0, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest23.assertDocsEnumEquals("tests.badapples", postingsEnum25, postingsEnum26, true);
        synonymsAnalysisTest23.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger30 = synonymsAnalysisTest23.getlogger();
        java.lang.String str31 = synonymsAnalysisTest23.getTestName();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) str31);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        synonymsAnalysisTest1.assertFieldsEquals("", indexReader34, fields35, fields36, false);
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum40, postingsEnum41);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (byte) 100, (double) (-1));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) 0, 0L);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        synonymsAnalysisTest1.assertFieldsEquals("hi!", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest14.setUp();
        synonymsAnalysisTest14.ensureCheckIndexPassed();
        synonymsAnalysisTest14.ensureCleanedUp();
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest14.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain19;
        synonymsAnalysisTest1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 3, (double) (byte) 1, (double) 100L);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (byte) 1, (double) 0.0f);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest12.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("hi!", indexReader15, 0, postingsEnum17, postingsEnum18, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest12.analysisService;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        synonymsAnalysisTest12.assertFieldsEquals("random", indexReader23, fields24, fields25, true);
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest12.logger;
        org.junit.rules.TestRule testRule29 = synonymsAnalysisTest12.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest12);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, (long) (byte) 1);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (-1));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest3.setUp();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest3.assertDocsSkippingEquals("hi!", indexReader6, 0, postingsEnum8, postingsEnum9, true);
        org.junit.rules.TestRule testRule12 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) (-1), (java.lang.Object) synonymsAnalysisTest3);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = null;
        synonymsAnalysisTest3.analysisService = analysisService15;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        synonymsAnalysisTest3.assertTermsEquals("tests.badapples", indexReader18, terms19, terms20, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest23.setUp();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest23.assertDocsSkippingEquals("hi!", indexReader26, 0, postingsEnum28, postingsEnum29, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = synonymsAnalysisTest23.analysisService;
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        synonymsAnalysisTest23.assertFieldsEquals("random", indexReader34, fields35, fields36, true);
        java.lang.String str39 = synonymsAnalysisTest23.getTestName();
        synonymsAnalysisTest23.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        synonymsAnalysisTest23.assertPositionsSkippingEquals("", indexReader42, (int) (short) 10, postingsEnum44, postingsEnum45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) terms19, (java.lang.Object) synonymsAnalysisTest23);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.badapples", indexReader15, (int) (short) 100, postingsEnum17, postingsEnum18);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest20.assertDocsEnumEquals("tests.badapples", postingsEnum22, postingsEnum23, true);
        synonymsAnalysisTest20.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest20.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest20.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = synonymsAnalysisTest20.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum18, (java.lang.Object) analysisService29);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) '4');
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str5 = synonymsAnalysisTest0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.setUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest10.assertDocsSkippingEquals("hi!", indexReader13, 0, postingsEnum15, postingsEnum16, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest10.analysisService;
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest10.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest10.assertPositionsSkippingEquals("tests.badapples", indexReader22, (int) (short) 10, postingsEnum24, postingsEnum25);
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest10.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain27;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader30, fields31, fields32, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.slow", indexReader38, terms39, terms40, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) terms39);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(100L, (long) (byte) 100);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray7);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray12);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray18);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray21);
        org.junit.Assert.assertArrayEquals("random", shortArray7, shortArray21);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray32, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray21, (java.lang.Object) executorServiceArray32);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        short[][] shortArray47 = new short[][] { shortArray41, shortArray42, shortArray43, shortArray44, shortArray45, shortArray46 };
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        short[][] shortArray54 = new short[][] { shortArray48, shortArray49, shortArray50, shortArray51, shortArray52, shortArray53 };
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        short[][] shortArray61 = new short[][] { shortArray55, shortArray56, shortArray57, shortArray58, shortArray59, shortArray60 };
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        short[][] shortArray68 = new short[][] { shortArray62, shortArray63, shortArray64, shortArray65, shortArray66, shortArray67 };
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        short[] shortArray74 = new short[] {};
        short[][] shortArray75 = new short[][] { shortArray69, shortArray70, shortArray71, shortArray72, shortArray73, shortArray74 };
        short[] shortArray76 = new short[] {};
        short[] shortArray77 = new short[] {};
        short[] shortArray78 = new short[] {};
        short[] shortArray79 = new short[] {};
        short[] shortArray80 = new short[] {};
        short[] shortArray81 = new short[] {};
        short[][] shortArray82 = new short[][] { shortArray76, shortArray77, shortArray78, shortArray79, shortArray80, shortArray81 };
        short[][][] shortArray83 = new short[][][] { shortArray47, shortArray54, shortArray61, shortArray68, shortArray75, shortArray82 };
        java.util.List<short[][]> shortArrayList84 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, shortArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) shortArray83);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        int[] intArray3 = new int[] { (short) 10, 3 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray3, intArray4);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10, (float) 100, 0.0f);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = null;
        synonymsAnalysisTest1.analysisService = analysisService13;
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest1.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("hi!", postingsEnum17, postingsEnum18, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest22.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger24 = synonymsAnalysisTest22.logger;
        java.lang.Object obj25 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest26.getanalysisService();
        synonymsAnalysisTest26.overrideTestDefaultQueryCache();
        synonymsAnalysisTest26.overrideTestDefaultQueryCache();
        synonymsAnalysisTest26.setUp();
        org.junit.Assert.assertNotEquals(obj25, (java.lang.Object) synonymsAnalysisTest26);
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = synonymsAnalysisTest26.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger33 = synonymsAnalysisTest26.logger;
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) synonymsAnalysisTest22, (java.lang.Object) eSLogger33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) postingsEnum17, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray6, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray18, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray27, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray27);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str34 = synonymsAnalysisTest33.getTestName();
        synonymsAnalysisTest33.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = synonymsAnalysisTest33.analysisService;
        synonymsAnalysisTest33.ensureCleanedUp();
        synonymsAnalysisTest33.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest39.getanalysisService();
        synonymsAnalysisTest39.overrideTestDefaultQueryCache();
        synonymsAnalysisTest39.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = synonymsAnalysisTest39.analysisService;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest33, (java.lang.Object) synonymsAnalysisTest39);
        org.elasticsearch.common.logging.ESLogger eSLogger45 = synonymsAnalysisTest39.logger;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray6, (java.lang.Object) synonymsAnalysisTest39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray6);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        long[] longArray3 = new long[] { 10, (-1L), 2 };
        long[] longArray5 = new long[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) (short) 10);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) (short) 100, postingsEnum11, postingsEnum12);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest17.getanalysisService();
        synonymsAnalysisTest17.overrideTestDefaultQueryCache();
        synonymsAnalysisTest17.tearDown();
        java.lang.Object obj21 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest17, obj21);
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest17.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = null;
        synonymsAnalysisTest17.analysisService = analysisService24;
        org.elasticsearch.common.logging.ESLogger eSLogger26 = synonymsAnalysisTest17.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) analysisService16, (java.lang.Object) eSLogger26);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        int[] intArray3 = new int[] { 0, 1, ' ' };
        int[] intArray9 = new int[] { (short) 10, (byte) 100, ' ', 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray9);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 4, 10.0d);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        int[] intArray4 = new int[] { 0, 3, ' ' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", intArray4, intArray5);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0L, 100L);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum14, postingsEnum15, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertPathHasBeenCleared("");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 'a', (double) (short) 10);
    }
}

